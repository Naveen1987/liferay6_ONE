package com.daffo.form_di_segnalazione;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;

import com.daffo.form_di_segnalazione.model.form_di_segnalazione;
import com.daffo.form_di_segnalazione.service.form_di_segnalazioneLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Form_di_segnalazionePortlet
 */
public class Form_di_segnalazionePortlet extends MVCPortlet {
	
	private Log logger=LogFactoryUtil.getLog("Form di segnalazione");
	@ProcessAction(name="formSubmit")
	 public void formSubmit(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException, PortalException, SystemException {
		System.out.println("Hello I am on submit");
		
		//System.out.println(form_di_segnalazioneLocalServiceUtil.getform_di_segnalazionesCount());
		/*try{
			System.out.println(form_di_segnalazioneLocalServiceUtil.getform_di_segnalazione(2));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}*/
		if(!(ParamUtil.getString(actionRequest, "CODICE").equalsIgnoreCase("")) && !(ParamUtil.getString(actionRequest, "INIZIALI_1").equalsIgnoreCase(""))){
		form_di_segnalazione e=form_di_segnalazioneLocalServiceUtil.createform_di_segnalazione(CounterLocalServiceUtil.increment());
		e.setCODICE(ParamUtil.getString(actionRequest, "CODICE"));
		e.setINIZIALI_1(ParamUtil.getString(actionRequest, "INIZIALI_1"));
		e.setINIZIALI_1_a(ParamUtil.getString(actionRequest, "INIZIALI_1_a"));
		e.setINIZIALI_1_b(ParamUtil.getString(actionRequest, "INIZIALI_1_b"));
		e.setINIZIALI_1_c(ParamUtil.getString(actionRequest, "INIZIALI_1_c"));
		e.setINIZIALI_1_d(ParamUtil.getString(actionRequest, "INIZIALI_1_d"));
		e.setINIZIALI_1_e(ParamUtil.getString(actionRequest, "INIZIALI_1_e"));
		e.setDATA_2(ParamUtil.getString(actionRequest, "DATA_2"));
		e.setSESSO_3(ParamUtil.getString(actionRequest, "SESSO_3"));
		e.setDATA_4(ParamUtil.getString(actionRequest, "DATA_4"));
		e.setORIGINE_5(ParamUtil.getString(actionRequest, "ORIGINE_5"));
		e.setDESCRIZIONE_6(ParamUtil.getString(actionRequest, "DESCRIZIONE_6"));
		e.setINDICARE_7_1(ParamUtil.getString(actionRequest, "INDICARE_7_1"));
		e.setINDICARE_7_2(ParamUtil.getString(actionRequest, "INDICARE_7_2"));
		e.setINDICARE_7_3(ParamUtil.getString(actionRequest, "INDICARE_7_3"));
		e.setINDICARE_7_4(ParamUtil.getString(actionRequest, "INDICARE_7_4"));
		e.setINDICARE_7_5(ParamUtil.getString(actionRequest, "INDICARE_7_5"));
		e.setINDICARE_7_6(ParamUtil.getString(actionRequest, "INDICARE_7_6"));
		e.setINDICARE_7_7(ParamUtil.getString(actionRequest, "INDICARE_7_7"));
		e.setGRAVITA_8_1(ParamUtil.getString(actionRequest, "GRAVITA_8_1"));
		e.setGRAVITA_8_2(ParamUtil.getString(actionRequest, "GRAVITA_8_2"));
		e.setGRAVITA_8_3(ParamUtil.getString(actionRequest, "GRAVITA_8_3"));
		e.setGRAVITA_8_4(ParamUtil.getString(actionRequest, "GRAVITA_8_4"));
		e.setGRAVITA_8_5(ParamUtil.getString(actionRequest, "GRAVITA_8_5"));
		e.setGRAVITA_8_6(ParamUtil.getString(actionRequest, "GRAVITA_8_6"));
		e.setGRAVITA_8_7(ParamUtil.getString(actionRequest, "GRAVITA_8_7"));
		e.setEVENTUALI_9(ParamUtil.getString(actionRequest, "EVENTUALI_9"));
		e.setESITO_10(ParamUtil.getString(actionRequest, "ESITO_10"));
		e.setESITO_10_1(ParamUtil.getString(actionRequest, "ESITO_10_1"));
		e.setESITO_10_2(ParamUtil.getString(actionRequest, "ESITO_10_2"));
		e.setESITO_10_3(ParamUtil.getString(actionRequest, "ESITO_10_3"));
		e.setESITO_10_4(ParamUtil.getString(actionRequest, "ESITO_10_4"));
		e.setESITO_10_5(ParamUtil.getString(actionRequest, "ESITO_10_5"));
		e.setESITO_10_6(ParamUtil.getString(actionRequest, "ESITO_10_6"));
		e.setESITO_10_7(ParamUtil.getString(actionRequest, "ESITO_10_7"));
		e.setESITO_10_8(ParamUtil.getString(actionRequest, "ESITO_10_8"));
		e.setESITO_10_9(ParamUtil.getString(actionRequest, "ESITO_10_9"));
		e.setESITO_10_10(ParamUtil.getString(actionRequest, "ESITO_10_10"));
		e.setAZIONI_11(ParamUtil.getString(actionRequest, "AZIONI_11"));
		e.setFARMACO_12_a(ParamUtil.getString(actionRequest, "FARMACO_12_a"));
		e.setFARMACO_12_a_13(ParamUtil.getString(actionRequest, "FARMACO_12_a_13"));
		e.setFARMACO_12_a_14(ParamUtil.getString(actionRequest, "FARMACO_12_a_14"));
		e.setFARMACO_12_a_15(ParamUtil.getString(actionRequest, "FARMACO_12_a_15"));
		e.setFARMACO_12_a_16_1(ParamUtil.getString(actionRequest, "FARMACO_12_a_16_1"));
		e.setFARMACO_12_a_16_2(ParamUtil.getString(actionRequest, "FARMACO_12_a_16_2"));
		e.setFARMACO_12_a_17(ParamUtil.getString(actionRequest, "FARMACO_12_a_17"));
		e.setFARMACO_12_a_18(ParamUtil.getString(actionRequest, "FARMACO_12_a_18"));
		e.setFARMACO_12_a_19(ParamUtil.getString(actionRequest, "FARMACO_12_a_19"));
		e.setFARMACO_12_a_20(ParamUtil.getString(actionRequest, "FARMACO_12_a_20"));
		e.setFARMACO_12_b(ParamUtil.getString(actionRequest, "FARMACO_12_b"));
		e.setFARMACO_12_b_13(ParamUtil.getString(actionRequest, "FARMACO_12_b_13"));
		e.setFARMACO_12_b_14(ParamUtil.getString(actionRequest, "FARMACO_12_b_14"));
		e.setFARMACO_12_b_15(ParamUtil.getString(actionRequest, "FARMACO_12_b_15"));
		e.setFARMACO_12_b_16_1(ParamUtil.getString(actionRequest, "FARMACO_12_b_16_1"));
		e.setFARMACO_12_b_16_2(ParamUtil.getString(actionRequest, "FARMACO_12_b_16_2"));
		e.setFARMACO_12_b_17(ParamUtil.getString(actionRequest, "FARMACO_12_b_17"));
		e.setFARMACO_12_b_18(ParamUtil.getString(actionRequest, "FARMACO_12_b_18"));
		e.setFARMACO_12_b_19(ParamUtil.getString(actionRequest, "FARMACO_12_b_19"));
		e.setFARMACO_12_b_20(ParamUtil.getString(actionRequest, "FARMACO_12_b_20"));
		e.setFARMACO_12_c(ParamUtil.getString(actionRequest, "FARMACO_12_c"));
		e.setFARMACO_12_c_13(ParamUtil.getString(actionRequest, "FARMACO_12_c_13"));
		e.setFARMACO_12_c_14(ParamUtil.getString(actionRequest, "FARMACO_12_c_14"));
		e.setFARMACO_12_c_15(ParamUtil.getString(actionRequest, "FARMACO_12_c_15"));
		e.setFARMACO_12_c_16_1(ParamUtil.getString(actionRequest, "FARMACO_12_c_16_1"));
		e.setFARMACO_12_c_16_2(ParamUtil.getString(actionRequest, "FARMACO_12_c_16_2"));
		e.setFARMACO_12_c_17(ParamUtil.getString(actionRequest, "FARMACO_12_c_17"));
		e.setFARMACO_12_c_18(ParamUtil.getString(actionRequest, "FARMACO_12_c_18"));
		e.setFARMACO_12_c_19(ParamUtil.getString(actionRequest, "FARMACO_12_c_19"));
		e.setFARMACO_12_c_20(ParamUtil.getString(actionRequest, "FARMACO_12_c_20"));
		e.setINDICAZIONI_21_a(ParamUtil.getString(actionRequest, "INDICAZIONI_21_a"));
		e.setINDICAZIONI_21_b(ParamUtil.getString(actionRequest, "INDICAZIONI_21_b"));
		e.setINDICAZIONI_21_c(ParamUtil.getString(actionRequest, "INDICAZIONI_21_c"));
		e.setFARMACO_22_a(ParamUtil.getString(actionRequest, "FARMACO_22_a"));
		e.setFARMACO_22_a_23(ParamUtil.getString(actionRequest, "FARMACO_22_a_23"));
		e.setFARMACO_22_a_24(ParamUtil.getString(actionRequest, "FARMACO_22_a_24"));
		e.setFARMACO_22_a_25(ParamUtil.getString(actionRequest, "FARMACO_22_a_25"));
		e.setFARMACO_22_a_26_1(ParamUtil.getString(actionRequest, "FARMACO_22_a_26_1"));
		e.setFARMACO_22_a_26_2(ParamUtil.getString(actionRequest, "FARMACO_22_a_26_2"));
		e.setFARMACO_22_a_27(ParamUtil.getString(actionRequest, "FARMACO_22_a_27"));
		e.setFARMACO_22_a_28(ParamUtil.getString(actionRequest, "FARMACO_22_a_28"));
		e.setFARMACO_22_a_29(ParamUtil.getString(actionRequest, "FARMACO_22_a_29"));
		e.setFARMACO_22_a_30(ParamUtil.getString(actionRequest, "FARMACO_22_a_30"));
		e.setFARMACO_22_b(ParamUtil.getString(actionRequest, "FARMACO_22_b"));
		e.setFARMACO_22_b_23(ParamUtil.getString(actionRequest, "FARMACO_22_b_23"));
		e.setFARMACO_22_b_24(ParamUtil.getString(actionRequest, "FARMACO_22_b_24"));
		e.setFARMACO_22_b_25(ParamUtil.getString(actionRequest, "FARMACO_22_b_25"));
		e.setFARMACO_22_b_26_1(ParamUtil.getString(actionRequest, "FARMACO_22_b_26_1"));
		e.setFARMACO_22_b_26_2(ParamUtil.getString(actionRequest, "FARMACO_22_b_26_2"));
		e.setFARMACO_22_b_27(ParamUtil.getString(actionRequest, "FARMACO_22_b_27"));
		e.setFARMACO_22_b_28(ParamUtil.getString(actionRequest, "FARMACO_22_b_28"));
		e.setFARMACO_22_b_29(ParamUtil.getString(actionRequest, "FARMACO_22_b_29"));
		e.setFARMACO_22_b_30(ParamUtil.getString(actionRequest, "FARMACO_22_b_30"));
		e.setINDICAZIONI_31_a(ParamUtil.getString(actionRequest, "INDICAZIONI_31_a"));
		e.setINDICAZIONI_31_b(ParamUtil.getString(actionRequest, "INDICAZIONI_31_b"));
		e.setUSO_32(ParamUtil.getString(actionRequest, "USO_32"));
		e.setCONDIZIONI_33(ParamUtil.getString(actionRequest, "CONDIZIONI_33"));
		e.setALTRE_34(ParamUtil.getString(actionRequest, "ALTRE_34"));
		e.setINDICARE_35_1(ParamUtil.getString(actionRequest, "INDICARE_35_1"));
		e.setINDICARE_35_2(ParamUtil.getString(actionRequest, "INDICARE_35_2"));
		e.setINDICARE_35_3(ParamUtil.getString(actionRequest, "INDICARE_35_3"));
		e.setINDICARE_35_4(ParamUtil.getString(actionRequest, "INDICARE_35_4"));
		e.setINDICARE_35_5(ParamUtil.getString(actionRequest, "INDICARE_35_5"));
		e.setINDICARE_35_6(ParamUtil.getString(actionRequest, "INDICARE_35_6"));
		e.setQUALIFICA_36_1(ParamUtil.getString(actionRequest, "QUALIFICA_36_1"));
		e.setQUALIFICA_36_2(ParamUtil.getString(actionRequest, "QUALIFICA_36_2"));
		e.setQUALIFICA_36_3(ParamUtil.getString(actionRequest, "QUALIFICA_36_3"));
		e.setQUALIFICA_36_4(ParamUtil.getString(actionRequest, "QUALIFICA_36_4"));
		e.setQUALIFICA_36_5(ParamUtil.getString(actionRequest, "QUALIFICA_36_5"));
		e.setQUALIFICA_36_6(ParamUtil.getString(actionRequest, "QUALIFICA_36_6"));
		e.setQUALIFICA_36_7(ParamUtil.getString(actionRequest, "QUALIFICA_36_7"));
		e.setQUALIFICA_36_8(ParamUtil.getString(actionRequest, "QUALIFICA_36_8"));
		e.setQUALIFICA_36_9(ParamUtil.getString(actionRequest, "QUALIFICA_36_9"));
		e.setQUALIFICA_36_10(ParamUtil.getString(actionRequest, "QUALIFICA_36_10"));
		e.setDATI_37_1(ParamUtil.getString(actionRequest, "DATI_37_1"));
		e.setDATI_37_2(ParamUtil.getString(actionRequest, "DATI_37_2"));
		e.setDATI_37_3(ParamUtil.getString(actionRequest, "DATI_37_3"));
		e.setDATI_37_4(ParamUtil.getString(actionRequest, "DATI_37_4"));
		e.setASL_38(ParamUtil.getString(actionRequest, "ASL_38"));
		e.setREGIONE_39(ParamUtil.getString(actionRequest, "REGIONE_39"));
		e.setDATA_40(ParamUtil.getString(actionRequest, "DATA_40"));
		e.setFIRMA_41(ParamUtil.getString(actionRequest, "FIRMA_41"));
		form_di_segnalazioneLocalServiceUtil.addform_di_segnalazione(e);
		//For success Fully Messaage
		SessionMessages.add(actionRequest, "success");
		actionResponse.setRenderParameter("jspPage", "/html/form_di_segnalazione/Form_di_segnalazione.jsp");
		//logger.info("Data:-"+e);
		}
}

}
