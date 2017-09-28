package com.daff.attivita_formativa;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.sample.model.BookedEquipment;
import com.liferay.sample.model.Equipment;
import com.liferay.sample.model.suiluppo_application;
import com.liferay.sample.model.suiluppo_course;
import com.liferay.sample.model.suiluppo_room;
import com.liferay.sample.model.suiluppo_room_allocation;
import com.liferay.sample.service.BookedEquipmentLocalServiceUtil;
import com.liferay.sample.service.EquipmentLocalServiceUtil;
import com.liferay.sample.service.suiluppo_applicationLocalServiceUtil;
import com.liferay.sample.service.suiluppo_courseLocalServiceUtil;
import com.liferay.sample.service.suiluppo_roomLocalServiceUtil;
import com.liferay.sample.service.suiluppo_room_allocationLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;


public class Attivita_Formativa_CorsiPortlet extends MVCPortlet {
 
private final static Log log=LogFactoryUtil.getLog(Attivita_Formativa_CorsiPortlet.class);
	
	private FileUpload_ServiceClass fus=new FileUpload_ServiceClass();
	@ProcessAction(name="newRoom")
	 public void newRoom(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException, PortalException, SystemException {
		String txt_room=ParamUtil.getString(actionRequest, "txt-room");
		String txt_des=ParamUtil.getString(actionRequest, "txt-des");
		suiluppo_room sr=suiluppo_roomLocalServiceUtil.createsuiluppo_room(CounterLocalServiceUtil.increment());
		sr.setRoom_name(txt_room);
		sr.setRoom_description(txt_des);
		suiluppo_roomLocalServiceUtil.updatesuiluppo_room(sr);
		SessionMessages.add(actionRequest, "success");
		actionResponse.setRenderParameter("jspPage", "/html/attivita_formativa_corsi/NewRoom.jsp");
	}
	
	
	@ProcessAction(name="editRoom")
	 public void editRoom(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException, PortalException, SystemException {
		long roomId=ParamUtil.getLong(actionRequest, "roomId");
		String txt_room=ParamUtil.getString(actionRequest, "txt-room");
		String txt_des=ParamUtil.getString(actionRequest, "txt-des");
		suiluppo_room sr=suiluppo_roomLocalServiceUtil.getsuiluppo_room(roomId);
		sr.setRoom_name(txt_room);
		sr.setRoom_description(txt_des);
		suiluppo_roomLocalServiceUtil.updatesuiluppo_room(sr);
		SessionMessages.add(actionRequest, "success");
		actionResponse.setRenderParameter("roomId", ParamUtil.getString(actionRequest, "roomId"));
		actionResponse.setRenderParameter("jspPage", "/html/attivita_formativa_corsi/EditRoom.jsp");
		
	}
	
	public void EquipmentSubmit(ActionRequest request, ActionResponse response) throws IOException, PortalException {
		
		int quantity = ParamUtil.getInteger(request, "quantity");
		String equipment_name = ParamUtil.getString(request, "equipment_name");
		String equipDesc = ParamUtil.getString(request, "equipDesc");
		try {
			Equipment equip= EquipmentLocalServiceUtil.createEquipment(CounterLocalServiceUtil.increment());
			equip.setEquip_quantity(quantity);
			equip.setEquipment_name(equipment_name);
			equip.setEquip_description(equipDesc);
			EquipmentLocalServiceUtil.addEquipment(equip);
			SessionMessages.add(request, "success");
			response.setRenderParameter("jspPage", "/html/attivita_formativa_corsi/NewEquip.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void EquipmentEdit(ActionRequest request, ActionResponse response) throws IOException, PortalException {
		long equipId=ParamUtil.getLong(request, "equipId");
		int quantity = ParamUtil.getInteger(request, "quantity");
		String equipment_name = ParamUtil.getString(request, "equipment_name");
		String equipDesc = ParamUtil.getString(request, "equipDesc");
		try {
			Equipment equip= EquipmentLocalServiceUtil.getEquipment(equipId);
			equip.setEquip_quantity(quantity);
			equip.setEquipment_name(equipment_name);
			equip.setEquip_description(equipDesc);
			EquipmentLocalServiceUtil.updateEquipment(equip);
			response.setRenderParameter("equipId", ParamUtil.getString(request, "equipId"));
			SessionMessages.add(request, "success");
			response.setRenderParameter("jspPage", "/html/attivita_formativa_corsi/EditEquip.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	
	@ProcessAction(name="equipDelete")
	public void equipDelete(ActionRequest request, ActionResponse response) throws IOException, PortalException {
		long equipId = ParamUtil.getLong(request, "equipId");
		try {
			EquipmentLocalServiceUtil.deleteEquipment(equipId);
			log.info("Equipment Deleted Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@ProcessAction(name="formSubmit")
	 public void formSubmit(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException, PortalException, SystemException {
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		fus.createFolder(actionRequest, themeDisplay);
		String fileName=fus.fileUpload(themeDisplay, actionRequest,"Dispensa_corso");
		if(!fileName.isEmpty())
		{
			if(fileName.equalsIgnoreCase("blank")){
			log.error("File Name is Blank{"+fileName+"}");
				return;
			}else if(fileName.equalsIgnoreCase("No Extension")){
			log.error("File format is Missing..{"+fileName+"}");
				return;
			}
			log.info("Created File {"+fileName+"}");
			String downLink=fus.getFileLink(themeDisplay, fileName).get( fileName);
			log.info("Download Link {"+downLink+"}");	
			log.info("Now table is Updating.....");
			suiluppo_course cs=suiluppo_courseLocalServiceUtil.createsuiluppo_course(CounterLocalServiceUtil.increment());
			System.out.println(cs.getCourse_id());
			cs.setDocente(ParamUtil.getString(actionRequest, "Docente"));
			cs.setEvento_Progetto(ParamUtil.getString(actionRequest, "Evento_Progetto"));
			cs.setTitolo(ParamUtil.getString(actionRequest, "Titolo"));
			cs.setDescrizione(ParamUtil.getString(actionRequest, "Descrizione"));
			cs.setFigure_Professionali_Coinvolte(ParamUtil.getString(actionRequest, "Figure_Professionali_Coinvolte"));
			cs.setNr_Edizione(ParamUtil.getString(actionRequest, "Nr_Edizione"));
			cs.setSede(ParamUtil.getString(actionRequest, "Sede"));
			cs.setAbstract(ParamUtil.getString(actionRequest, "Abstract"));
			cs.setData_Inizio(ParamUtil.getString(actionRequest, "Data_Inizio-date"));
			cs.setData_Fine(ParamUtil.getString(actionRequest, "Data_Fine-date"));
			cs.setTot_Ore(ParamUtil.getString(actionRequest, "Tot_Ore"));
			cs.setScadenza_Iscrizioni(ParamUtil.getString(actionRequest, "Scadenza_Iscrizioni-date"));
			cs.setAmmessi_al_corso(new Long(ParamUtil.getString(actionRequest, "Ammessi_al_corso")).longValue());
			cs.setBloccato(ParamUtil.getString(actionRequest, "Bloccato_data"));
			cs.setVisibile(ParamUtil.getString(actionRequest, "Visibile_data"));
			cs.setDispensa_corso(downLink);
			suiluppo_courseLocalServiceUtil.addsuiluppo_course(cs);
			SessionMessages.add(actionRequest, "success");
			
			log.info("Now table is Updated.....");
			actionResponse.setRenderParameter("jspPage","/html/attivita_formativa_corsi/AddCourse.jsp");
		}
		else{
			log.error("File Is Exists");
		}
		
	}
	@ProcessAction(name="updateSubmit")
	 public void updateSubmit(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException, PortalException, NumberFormatException, SystemException {
		log.info("Record Updating ............");
		suiluppo_course cs=suiluppo_courseLocalServiceUtil.getsuiluppo_course(new Long(ParamUtil.getString(actionRequest, "courseId")).longValue());
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		String file_Name=uploadPortletRequest.getFileName("Dispensa_corso");
		System.out.println("File Name:"+file_Name);
		if(!file_Name.equalsIgnoreCase("")){
			log.info("FIle is Updating");
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			fus.createFolder(actionRequest, themeDisplay);
			/*
			 There are three parameter
			 1. themeDisplay
			 2. actionRequest
			 3. Name of type=file control name
			 */
			String fileName=fus.fileUpload(themeDisplay, actionRequest,"Dispensa_corso");
			if(!fileName.isEmpty())
			{
				if(fileName.equalsIgnoreCase("blank")){
				log.error("File Name is Blank{"+fileName+"}");
					return;
				}else if(fileName.equalsIgnoreCase("No Extension")){
				log.error("File format is Missing..{"+fileName+"}");
					return;
				}
				log.info("Created File {"+fileName+"}");
				String downLink=fus.getFileLink(themeDisplay, fileName).get( fileName);
				log.info("Download Link {"+downLink+"}");	
				cs.setDispensa_corso(downLink);
				log.info("Now table is Updating.....");
			}
			else{
				log.error("File Is Exists");
			}
		}
		else{
			log.info("There is no file");
			log.info("Now table is Updating.....");
		}
			cs.setDocente(ParamUtil.getString(actionRequest, "Docente"));
			cs.setEvento_Progetto(ParamUtil.getString(actionRequest, "Evento_Progetto"));
			cs.setTitolo(ParamUtil.getString(actionRequest, "Titolo"));
			cs.setDescrizione(ParamUtil.getString(actionRequest, "Descrizione"));
			cs.setFigure_Professionali_Coinvolte(ParamUtil.getString(actionRequest, "Figure_Professionali_Coinvolte"));
			cs.setNr_Edizione(ParamUtil.getString(actionRequest, "Nr_Edizione"));
			cs.setSede(ParamUtil.getString(actionRequest, "Sede"));
			cs.setAbstract(ParamUtil.getString(actionRequest, "Abstract"));
			cs.setData_Inizio(ParamUtil.getString(actionRequest, "Data_Inizio-date"));
			cs.setData_Fine(ParamUtil.getString(actionRequest, "Data_Fine-date"));
			cs.setTot_Ore(ParamUtil.getString(actionRequest, "Tot_Ore"));
			cs.setScadenza_Iscrizioni(ParamUtil.getString(actionRequest, "Scadenza_Iscrizioni-date"));
			cs.setAmmessi_al_corso(new Long(ParamUtil.getString(actionRequest, "Ammessi_al_corso")).longValue());
			cs.setBloccato(ParamUtil.getString(actionRequest, "Bloccato_data"));
			cs.setVisibile(ParamUtil.getString(actionRequest, "Visibile_data"));
			suiluppo_courseLocalServiceUtil.updatesuiluppo_course(cs);
			log.info("Now table is Updated");
		
		actionRequest.setAttribute("courseId",ParamUtil.getString(actionRequest, "courseId"));
		SessionMessages.add(actionRequest, "success");
		actionResponse.setRenderParameter("jspPage","/html/attivita_formativa_corsi/editCourse.jsp");
	}
	
	
	@ProcessAction(name="addApplicant")
	 public void addApplicant(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException, PortalException, SystemException {
		log.info("New Applicant Adding ............");
		suiluppo_application su=suiluppo_applicationLocalServiceUtil.createsuiluppo_application(CounterLocalServiceUtil.increment());
		su.setApplicat_name(ParamUtil.getString(actionRequest, "Applicant_Name"));
		su.setApplicat_phone(ParamUtil.getString(actionRequest, "phone"));
		su.setCourse_id(new Long(ParamUtil.getString(actionRequest, "courseId")).longValue());
		su.setApplicat_email(ParamUtil.getString(actionRequest, "email"));
		suiluppo_applicationLocalServiceUtil.addsuiluppo_application(su);
		log.info("New Applicant Added");
		SessionMessages.add(actionRequest, "successApply");
	}
	@ProcessAction(name="addConfirmApplicant")
	 public void addConfirmApplicant(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException, PortalException, NumberFormatException, SystemException {
		
		log.info("Applicant Confirimg ............");
		log.info("ApplicantId-"+ParamUtil.getString(actionRequest, "appId"));
		suiluppo_application suap=suiluppo_applicationLocalServiceUtil.getsuiluppo_application(new Long(ParamUtil.getString(actionRequest, "appId")).longValue());
//		if(suap.getApplicat_confirm().equalsIgnoreCase("yes")){
//			suap.setApplicat_confirm("no");
//		}
//		else{
//			suap.setApplicat_confirm("yes");
//		}
		suap.setApplicat_confirm(ParamUtil.getString(actionRequest, "status"));
		suiluppo_applicationLocalServiceUtil.updatesuiluppo_application(suap);
		actionResponse.setRenderParameter("courseId", ParamUtil.getString(actionRequest, "courseId"));
		actionResponse.setRenderParameter("jspPage", "/html/attivita_formativa_corsi/listOfApplicants.jsp");
		log.info("Applicant Status="+ParamUtil.getString(actionRequest, "status"));
		
	}
	private CourseStatusChk ch=new CourseStatusChk();
	@Override
	public void serveResource(ResourceRequest resourceRequest,ResourceResponse resourceResponse)throws  IOException, PortletException {
	//Updating table
	try {
		update_room_allocationTable();
	} catch (SystemException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	//Update Table
	String resID=resourceRequest.getResourceID();
	System.out.println(resID);
	if(resID.equalsIgnoreCase("checkCourseRoomBookInfo")){
		log.info("Room Confirimg ............");
		String id=resourceRequest.getParameter("courseId");
		JSONObject obj=JSONFactoryUtil.createJSONObject();
		try {
			if(ch.checkAlreadCourseBooked(new Long(id).longValue())){
				obj.put("flag","ar");
				resourceResponse.getWriter().println(obj.toString());
				
			} else
				try {
					if(ch.checkValid(new Long(id).longValue())){
						obj.put("flag","cv");
						resourceResponse.getWriter().println(obj.toString());
					}
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}catch ( PortalException e) {
					e.printStackTrace();
				}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("Room Confirimed");
		
	}
	else if(resID.equalsIgnoreCase("updateRoomBookInfo")){
		log.info("Room Confirimg ............");
		try {
			if(ch.checkValid(new Long(ParamUtil.getString(resourceRequest, "courseId")).longValue())){
				resourceResponse.getWriter().print(JSONFactoryUtil.createJSONObject().put("flag", "nv").toString());
				log.info("Course Is Not valid");
				return;
			}
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (PortalException e) {
			e.printStackTrace();
		}
		try {
			if(ch.checkAlreadBooked(new Long(ParamUtil.getString(resourceRequest, "courseId")).longValue(), new Long(ParamUtil.getString(resourceRequest, "roomID")).longValue()))
			{
				resourceResponse.getWriter().print(JSONFactoryUtil.createJSONObject().put("flag", "src").toString());
				log.info("Room Already Booked On same Course");
				return;
			}
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(ch.checkAlreadBooked(new Long(ParamUtil.getString(resourceRequest, "roomID")).longValue())){
				resourceResponse.getWriter().print(JSONFactoryUtil.createJSONObject().put("flag", "oc").toString());
				log.info("Room Already Booked On Other Course");
				return;
			}
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(ch.checkAlreadCourseBooked(new Long(ParamUtil.getString(resourceRequest, "courseId")).longValue())){
				resourceResponse.getWriter().print(JSONFactoryUtil.createJSONObject().put("flag", "orc").toString());
				log.info("Room Already Booked for this Course");
				return;
			}
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		suiluppo_room_allocation su = null;
		try {
			su = suiluppo_room_allocationLocalServiceUtil.createsuiluppo_room_allocation(CounterLocalServiceUtil.increment());
		} catch (SystemException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		su.setRoom_allocat_status("Booked");
		
		//Calendar nowcal=GregorianCalendar.getInstance();
		
		//String now=(nowcal.get(Calendar.DATE)<10?"0"+nowcal.get(Calendar.DATE):nowcal.get(Calendar.DATE))+"/"+(nowcal.get(Calendar.MONTH)+1<10?"0"+(nowcal.get(Calendar.MONTH)+1):(nowcal.get(Calendar.MONTH)+1))+"/"+nowcal.get(Calendar.YEAR)+" "+nowcal.get(Calendar.HOUR_OF_DAY)+":"+nowcal.get(Calendar.MINUTE);
		//su.setRoom_allocat_date(now);
		su.setRoom_allocat_date(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aaa").format(new Date()));
		su.setCourse_id(new Long(ParamUtil.getString(resourceRequest, "courseId")).longValue());
		try {
			log.info("Data Reading from Couse Table");
			suiluppo_course sc=suiluppo_courseLocalServiceUtil.getsuiluppo_course(new Long(ParamUtil.getString(resourceRequest, "courseId")).longValue());
			su.setRoom_allocat_start(sc.getData_Inizio());
			su.setRoom_allocat_end(sc.getData_Fine());
			log.info("Data Readed");
		
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (PortalException e) {
			e.printStackTrace();
		}
		
		su.setRoomID(new Long(ParamUtil.getString(resourceRequest, "roomID")).longValue());
		try {
			suiluppo_room_allocationLocalServiceUtil.updatesuiluppo_room_allocation(su);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resourceRequest.setAttribute("courseId",ParamUtil.getString(resourceRequest, "courseId"));
		resourceResponse.getWriter().print(JSONFactoryUtil.createJSONObject().put("flag", "suc").toString());
		log.info("Room Confirimed");	
	}
	else if(resID.equalsIgnoreCase("roomDelete")){
		long roomID = ParamUtil.getLong(resourceRequest, "roomID");
		JSONObject obj=JSONFactoryUtil.createJSONObject();
		DynamicQuery appQuery = suiluppo_room_allocationLocalServiceUtil.dynamicQuery();
		appQuery.add(RestrictionsFactoryUtil.and(RestrictionsFactoryUtil.eq("roomID", roomID), RestrictionsFactoryUtil.eq("room_allocat_status", "Booked")));
		try {
			if((suiluppo_room_allocationLocalServiceUtil.dynamicQuery(appQuery).size()>0?true:false))
			{
				obj.put("flag","no");
				log.info("Room already Booked You can not Delete");
			}else{
				try {
					suiluppo_roomLocalServiceUtil.deletesuiluppo_room(roomID);
					obj.put("flag","yes");
					log.info("Room Deleted Successfully");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resourceRequest.setAttribute("jspPage","/html/attivita_formativa_corsi/ListRoom.jsp");
		resourceResponse.getWriter().print(obj.toString());
	}
	
	}
	
	
	
	public void update_room_allocationTable() throws SystemException{
		DynamicQuery userQuery =suiluppo_room_allocationLocalServiceUtil.dynamicQuery();
		userQuery.add(RestrictionsFactoryUtil.eq("room_allocat_status", "Booked"));
		List<suiluppo_room_allocation> sur=suiluppo_room_allocationLocalServiceUtil.dynamicQuery(userQuery);
		if(sur.size()>0){
			for(suiluppo_room_allocation st:sur){
			log.info(st);
		try {
				if(ch.checkValid(st.getCourse_id())){
					log.info("Finding Blank Rooms......");
					if(ch.UpdateRoomAllocation(st.getRoom_allocat_id())){
						log.info("Room Updated");
					}
					
				}else{
					log.warn("room will remain booked");
				}
			} catch (PortalException e) {
				e.printStackTrace();
			}
			}
		}
		else{
			log.info("No Room Booked");
		}
		
		//Updating Course Allocation Table
	}
	
//Manish Code
	public void BookedEquipmentSubmit(ActionRequest request, ActionResponse response) throws IOException, PortalException, SystemException {
		response.setRenderParameter("courseId", ParamUtil.getLong(request, "course_Id")+"");
		List<Equipment> equipList = EquipmentLocalServiceUtil.getEquipments(-1, -1);
		for(Equipment eq : equipList){
				int equip_quantit = ParamUtil.getInteger(request, eq.getEquipment_name());
				if(equip_quantit!=0){
				int equip_quantity = ParamUtil.getInteger(request, eq.getEquipment_name());
				long equip_id = eq.getEquip_id();
				long course_id= ParamUtil.getLong(request, "course_Id");
				try {
					BookedEquipment equip= BookedEquipmentLocalServiceUtil.createBookedEquipment(CounterLocalServiceUtil.increment());
					equip.setEquip_id(equip_id);
					equip.setEquip_quantity(equip_quantity);
					equip.setCourse_id(course_id);
					equip.setBooked_equip_date(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aaa").format(new Date()));
					BookedEquipmentLocalServiceUtil.addBookedEquipment(equip);
					System.out.println("Success!!");
					response.setRenderParameter("jspPage", "/html/attivita_formativa_corsi/RoomAllocation.jsp");
				} catch (Exception e) {
					e.printStackTrace();
				}
		
			
			}		
			
		}
		
		//System.out.println("quantity= " + quantity +"equipment_name= "+equipment_name);
	}
}