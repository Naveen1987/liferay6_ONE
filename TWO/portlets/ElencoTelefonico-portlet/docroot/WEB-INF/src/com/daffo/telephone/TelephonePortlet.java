package com.daffo.telephone;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.sample.model.Telephonic;
import com.liferay.sample.service.TelephonicLocalService;
import com.liferay.sample.service.TelephonicLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class TelephonePortlet
 */
public class TelephonePortlet extends MVCPortlet {

	
@ProcessAction(name="formSubmit")
public void formSubmit(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException, PortalException, SystemException {
	/*System.out.println("Hello");
	System.out.println(ParamUtil.getString(actionRequest, "Tipo"));
	System.out.println(ParamUtil.getString(actionRequest, "TipoSede"));
	System.out.println(ParamUtil.getString(actionRequest, "ComuneSede"));
	System.out.println(ParamUtil.getString(actionRequest, "DescrizioneSede"));
	System.out.println(ParamUtil.getString(actionRequest, "Interno"));
	System.out.println(ParamUtil.getString(actionRequest, "Piano"));
	System.out.println(ParamUtil.getString(actionRequest, "Area"));
	System.out.println(ParamUtil.getString(actionRequest, "Blocco"));
	System.out.println(ParamUtil.getString(actionRequest, "Stanza"));
	System.out.println(ParamUtil.getString(actionRequest, "Marca"));
	System.out.println(ParamUtil.getString(actionRequest, "Modello"));
	System.out.println(ParamUtil.getString(actionRequest, "InventarioSN"));
	System.out.println(ParamUtil.getString(actionRequest, "UnitaOperativa"));
	System.out.println(ParamUtil.getString(actionRequest, "Descrizione"));
	System.out.println(ParamUtil.getString(actionRequest, "Nome"));
	System.out.println(ParamUtil.getString(actionRequest, "Note"));
	System.out.println(ParamUtil.getString(actionRequest, "Visibile_data"));*/

	Telephonic tele=TelephonicLocalServiceUtil.createTelephonic(CounterLocalServiceUtil.increment());
	tele.setTipo(ParamUtil.getString(actionRequest, "Tipo"));
	tele.setTipoSede(ParamUtil.getString(actionRequest, "TipoSede"));
	tele.setComuneSede(ParamUtil.getString(actionRequest, "ComuneSede"));
	tele.setDescrizioneSede(ParamUtil.getString(actionRequest, "DescrizioneSede"));
	tele.setInterno(ParamUtil.getString(actionRequest, "Interno"));
	tele.setPiano(ParamUtil.getString(actionRequest, "Piano"));
	tele.setBlocco(ParamUtil.getString(actionRequest, "Area"));
	tele.setArea(ParamUtil.getString(actionRequest, "Blocco"));
	tele.setStanza(ParamUtil.getString(actionRequest, "Stanza"));
	tele.setMarca(ParamUtil.getString(actionRequest, "Marca"));
	tele.setModello(ParamUtil.getString(actionRequest, "Modello"));
	tele.setInventarioSN(ParamUtil.getString(actionRequest, "InventarioSN"));
	tele.setUnitaOperativa(ParamUtil.getString(actionRequest, "UnitaOperativa"));
	tele.setDescrizione(ParamUtil.getString(actionRequest, "Descrizione"));
	tele.setNome(ParamUtil.getString(actionRequest, "Nome"));
	tele.setNote(ParamUtil.getString(actionRequest, "Note"));
	tele.setVisibile(ParamUtil.getString(actionRequest, "Visibile_data"));
	TelephonicLocalServiceUtil.addTelephonic(tele);
	SessionMessages.add(actionRequest, "success");
	actionResponse.setRenderParameter("jspPage", "/html/telephone/Telephone_new.jsp");
	}

@ProcessAction(name="updateRecord")
public void updateRecord(ActionRequest actionRequest, ActionResponse actionResponse)
		   throws IOException, PortletException, PortalException, SystemException {
		long teleId=new Long(ParamUtil.getString(actionRequest, "teleId")).longValue();
		Telephonic tele=TelephonicLocalServiceUtil.getTelephonic(teleId);
		tele.setTipo(ParamUtil.getString(actionRequest, "Tipo"));
		tele.setTipoSede(ParamUtil.getString(actionRequest, "TipoSede"));
		tele.setComuneSede(ParamUtil.getString(actionRequest, "ComuneSede"));
		tele.setDescrizioneSede(ParamUtil.getString(actionRequest, "DescrizioneSede"));
		tele.setInterno(ParamUtil.getString(actionRequest, "Interno"));
		tele.setPiano(ParamUtil.getString(actionRequest, "Piano"));
		tele.setBlocco(ParamUtil.getString(actionRequest, "Area"));
		tele.setArea(ParamUtil.getString(actionRequest, "Blocco"));
		tele.setStanza(ParamUtil.getString(actionRequest, "Stanza"));
		tele.setMarca(ParamUtil.getString(actionRequest, "Marca"));
		tele.setModello(ParamUtil.getString(actionRequest, "Modello"));
		tele.setInventarioSN(ParamUtil.getString(actionRequest, "InventarioSN"));
		tele.setUnitaOperativa(ParamUtil.getString(actionRequest, "UnitaOperativa"));
		tele.setDescrizione(ParamUtil.getString(actionRequest, "Descrizione"));
		tele.setNome(ParamUtil.getString(actionRequest, "Nome"));
		tele.setNote(ParamUtil.getString(actionRequest, "Note"));
		tele.setVisibile(ParamUtil.getString(actionRequest, "Visibile_data"));
		TelephonicLocalServiceUtil.updateTelephonic(tele);
		SessionMessages.add(actionRequest, "success");
		actionRequest.setAttribute("teleId",tele.getTelephonicId());
		actionResponse.setRenderParameter("jspPage", "/html/telephone/Telehone_Edit.jsp");
		}

}
