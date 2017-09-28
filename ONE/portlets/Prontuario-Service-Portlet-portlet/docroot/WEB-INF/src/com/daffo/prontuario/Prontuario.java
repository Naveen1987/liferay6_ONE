package com.daffo.prontuario;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;




import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.daffo.model.prontuario_drug;
import com.liferay.daffo.service.prontuario_drugLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Prontuario
 */
public class Prontuario extends MVCPortlet {
	private final static Log log=LogFactoryUtil.getLog(Prontuario.class);
	

	@ProcessAction(name="formSubmit_drug")
	 public void formSubmit_drug(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException, PortalException, SystemException {
		prontuario_drug pd=prontuario_drugLocalServiceUtil.createprontuario_drug(CounterLocalServiceUtil.increment());
		pd.setCodice(ParamUtil.getString(actionRequest, "Codice"));
		pd.setGruppo(ParamUtil.getString(actionRequest, "Gruppo"));
		pd.setSottoGruppo(ParamUtil.getString(actionRequest, "SottoGruppo"));
		pd.setPrincipio_Attivo(ParamUtil.getString(actionRequest, "Principio_Attivo"));
		pd.setNome_Commerciale(ParamUtil.getString(actionRequest, "Nome_Commerciale"));
		prontuario_drugLocalServiceUtil.addprontuario_drug(pd);
		SessionMessages.add(actionRequest, "success");
		log.info("Successfully Record added");
		actionResponse.setRenderParameter("jspPage","/html/prontuario/drug_add.jsp");
	}
	
	@ProcessAction(name="editSubmit_drug")
	 public void editSubmit_drug(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException, PortalException, NumberFormatException, SystemException {
		prontuario_drug pd=prontuario_drugLocalServiceUtil.getprontuario_drug(new Long(ParamUtil.getString(actionRequest, "drug_id")).longValue());
		pd.setCodice(ParamUtil.getString(actionRequest, "Codice"));
		pd.setGruppo(ParamUtil.getString(actionRequest, "Gruppo"));
		pd.setSottoGruppo(ParamUtil.getString(actionRequest, "SottoGruppo"));
		pd.setPrincipio_Attivo(ParamUtil.getString(actionRequest, "Principio_Attivo"));
		pd.setNome_Commerciale(ParamUtil.getString(actionRequest, "Nome_Commerciale"));
		prontuario_drugLocalServiceUtil.updateprontuario_drug(pd);
		actionRequest.setAttribute("data", pd.getDrug_id());
		SessionMessages.add(actionRequest, "success");
		log.info("Successfully Record Edited");
		actionResponse.setRenderParameter("jspPage", "/html/prontuario/drug_edit.jsp");
	}
	
	

}
