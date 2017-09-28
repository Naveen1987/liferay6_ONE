/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.daffo.form_di_segnalazione.model;

import com.daffo.form_di_segnalazione.service.ClpSerializer;
import com.daffo.form_di_segnalazione.service.form_di_segnalazioneLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class form_di_segnalazioneClp extends BaseModelImpl<form_di_segnalazione>
	implements form_di_segnalazione {
	public form_di_segnalazioneClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return form_di_segnalazione.class;
	}

	@Override
	public String getModelClassName() {
		return form_di_segnalazione.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _Form_di_segnalazione_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setForm_di_segnalazione_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Form_di_segnalazione_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Form_di_segnalazione_id", getForm_di_segnalazione_id());
		attributes.put("CODICE", getCODICE());
		attributes.put("INIZIALI_1", getINIZIALI_1());
		attributes.put("INIZIALI_1_a", getINIZIALI_1_a());
		attributes.put("INIZIALI_1_b", getINIZIALI_1_b());
		attributes.put("INIZIALI_1_c", getINIZIALI_1_c());
		attributes.put("INIZIALI_1_d", getINIZIALI_1_d());
		attributes.put("INIZIALI_1_e", getINIZIALI_1_e());
		attributes.put("DATA_2", getDATA_2());
		attributes.put("SESSO_3", getSESSO_3());
		attributes.put("DATA_4", getDATA_4());
		attributes.put("ORIGINE_5", getORIGINE_5());
		attributes.put("DESCRIZIONE_6", getDESCRIZIONE_6());
		attributes.put("INDICARE_7_1", getINDICARE_7_1());
		attributes.put("INDICARE_7_2", getINDICARE_7_2());
		attributes.put("INDICARE_7_3", getINDICARE_7_3());
		attributes.put("INDICARE_7_4", getINDICARE_7_4());
		attributes.put("INDICARE_7_5", getINDICARE_7_5());
		attributes.put("INDICARE_7_6", getINDICARE_7_6());
		attributes.put("INDICARE_7_7", getINDICARE_7_7());
		attributes.put("GRAVITA_8_1", getGRAVITA_8_1());
		attributes.put("GRAVITA_8_2", getGRAVITA_8_2());
		attributes.put("GRAVITA_8_3", getGRAVITA_8_3());
		attributes.put("GRAVITA_8_4", getGRAVITA_8_4());
		attributes.put("GRAVITA_8_5", getGRAVITA_8_5());
		attributes.put("GRAVITA_8_6", getGRAVITA_8_6());
		attributes.put("GRAVITA_8_7", getGRAVITA_8_7());
		attributes.put("EVENTUALI_9", getEVENTUALI_9());
		attributes.put("ESITO_10", getESITO_10());
		attributes.put("ESITO_10_1", getESITO_10_1());
		attributes.put("ESITO_10_2", getESITO_10_2());
		attributes.put("ESITO_10_3", getESITO_10_3());
		attributes.put("ESITO_10_4", getESITO_10_4());
		attributes.put("ESITO_10_5", getESITO_10_5());
		attributes.put("ESITO_10_6", getESITO_10_6());
		attributes.put("ESITO_10_7", getESITO_10_7());
		attributes.put("ESITO_10_8", getESITO_10_8());
		attributes.put("ESITO_10_9", getESITO_10_9());
		attributes.put("ESITO_10_10", getESITO_10_10());
		attributes.put("AZIONI_11", getAZIONI_11());
		attributes.put("FARMACO_12_a", getFARMACO_12_a());
		attributes.put("FARMACO_12_a_13", getFARMACO_12_a_13());
		attributes.put("FARMACO_12_a_14", getFARMACO_12_a_14());
		attributes.put("FARMACO_12_a_15", getFARMACO_12_a_15());
		attributes.put("FARMACO_12_a_16_1", getFARMACO_12_a_16_1());
		attributes.put("FARMACO_12_a_16_2", getFARMACO_12_a_16_2());
		attributes.put("FARMACO_12_a_17", getFARMACO_12_a_17());
		attributes.put("FARMACO_12_a_18", getFARMACO_12_a_18());
		attributes.put("FARMACO_12_a_19", getFARMACO_12_a_19());
		attributes.put("FARMACO_12_a_20", getFARMACO_12_a_20());
		attributes.put("FARMACO_12_b", getFARMACO_12_b());
		attributes.put("FARMACO_12_b_13", getFARMACO_12_b_13());
		attributes.put("FARMACO_12_b_14", getFARMACO_12_b_14());
		attributes.put("FARMACO_12_b_15", getFARMACO_12_b_15());
		attributes.put("FARMACO_12_b_16_1", getFARMACO_12_b_16_1());
		attributes.put("FARMACO_12_b_16_2", getFARMACO_12_b_16_2());
		attributes.put("FARMACO_12_b_17", getFARMACO_12_b_17());
		attributes.put("FARMACO_12_b_18", getFARMACO_12_b_18());
		attributes.put("FARMACO_12_b_19", getFARMACO_12_b_19());
		attributes.put("FARMACO_12_b_20", getFARMACO_12_b_20());
		attributes.put("FARMACO_12_c", getFARMACO_12_c());
		attributes.put("FARMACO_12_c_13", getFARMACO_12_c_13());
		attributes.put("FARMACO_12_c_14", getFARMACO_12_c_14());
		attributes.put("FARMACO_12_c_15", getFARMACO_12_c_15());
		attributes.put("FARMACO_12_c_16_1", getFARMACO_12_c_16_1());
		attributes.put("FARMACO_12_c_16_2", getFARMACO_12_c_16_2());
		attributes.put("FARMACO_12_c_17", getFARMACO_12_c_17());
		attributes.put("FARMACO_12_c_18", getFARMACO_12_c_18());
		attributes.put("FARMACO_12_c_19", getFARMACO_12_c_19());
		attributes.put("FARMACO_12_c_20", getFARMACO_12_c_20());
		attributes.put("INDICAZIONI_21_a", getINDICAZIONI_21_a());
		attributes.put("INDICAZIONI_21_b", getINDICAZIONI_21_b());
		attributes.put("INDICAZIONI_21_c", getINDICAZIONI_21_c());
		attributes.put("FARMACO_22_a", getFARMACO_22_a());
		attributes.put("FARMACO_22_a_23", getFARMACO_22_a_23());
		attributes.put("FARMACO_22_a_24", getFARMACO_22_a_24());
		attributes.put("FARMACO_22_a_25", getFARMACO_22_a_25());
		attributes.put("FARMACO_22_a_26_1", getFARMACO_22_a_26_1());
		attributes.put("FARMACO_22_a_26_2", getFARMACO_22_a_26_2());
		attributes.put("FARMACO_22_a_27", getFARMACO_22_a_27());
		attributes.put("FARMACO_22_a_28", getFARMACO_22_a_28());
		attributes.put("FARMACO_22_a_29", getFARMACO_22_a_29());
		attributes.put("FARMACO_22_a_30", getFARMACO_22_a_30());
		attributes.put("FARMACO_22_b", getFARMACO_22_b());
		attributes.put("FARMACO_22_b_23", getFARMACO_22_b_23());
		attributes.put("FARMACO_22_b_24", getFARMACO_22_b_24());
		attributes.put("FARMACO_22_b_25", getFARMACO_22_b_25());
		attributes.put("FARMACO_22_b_26_1", getFARMACO_22_b_26_1());
		attributes.put("FARMACO_22_b_26_2", getFARMACO_22_b_26_2());
		attributes.put("FARMACO_22_b_27", getFARMACO_22_b_27());
		attributes.put("FARMACO_22_b_28", getFARMACO_22_b_28());
		attributes.put("FARMACO_22_b_29", getFARMACO_22_b_29());
		attributes.put("FARMACO_22_b_30", getFARMACO_22_b_30());
		attributes.put("INDICAZIONI_31_a", getINDICAZIONI_31_a());
		attributes.put("INDICAZIONI_31_b", getINDICAZIONI_31_b());
		attributes.put("USO_32", getUSO_32());
		attributes.put("CONDIZIONI_33", getCONDIZIONI_33());
		attributes.put("ALTRE_34", getALTRE_34());
		attributes.put("INDICARE_35_1", getINDICARE_35_1());
		attributes.put("INDICARE_35_2", getINDICARE_35_2());
		attributes.put("INDICARE_35_3", getINDICARE_35_3());
		attributes.put("INDICARE_35_4", getINDICARE_35_4());
		attributes.put("INDICARE_35_5", getINDICARE_35_5());
		attributes.put("INDICARE_35_6", getINDICARE_35_6());
		attributes.put("QUALIFICA_36_1", getQUALIFICA_36_1());
		attributes.put("QUALIFICA_36_2", getQUALIFICA_36_2());
		attributes.put("QUALIFICA_36_3", getQUALIFICA_36_3());
		attributes.put("QUALIFICA_36_4", getQUALIFICA_36_4());
		attributes.put("QUALIFICA_36_5", getQUALIFICA_36_5());
		attributes.put("QUALIFICA_36_6", getQUALIFICA_36_6());
		attributes.put("QUALIFICA_36_7", getQUALIFICA_36_7());
		attributes.put("QUALIFICA_36_8", getQUALIFICA_36_8());
		attributes.put("QUALIFICA_36_9", getQUALIFICA_36_9());
		attributes.put("QUALIFICA_36_10", getQUALIFICA_36_10());
		attributes.put("DATI_37_1", getDATI_37_1());
		attributes.put("DATI_37_2", getDATI_37_2());
		attributes.put("DATI_37_3", getDATI_37_3());
		attributes.put("DATI_37_4", getDATI_37_4());
		attributes.put("ASL_38", getASL_38());
		attributes.put("REGIONE_39", getREGIONE_39());
		attributes.put("DATA_40", getDATA_40());
		attributes.put("FIRMA_41", getFIRMA_41());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Form_di_segnalazione_id = (Long)attributes.get(
				"Form_di_segnalazione_id");

		if (Form_di_segnalazione_id != null) {
			setForm_di_segnalazione_id(Form_di_segnalazione_id);
		}

		String CODICE = (String)attributes.get("CODICE");

		if (CODICE != null) {
			setCODICE(CODICE);
		}

		String INIZIALI_1 = (String)attributes.get("INIZIALI_1");

		if (INIZIALI_1 != null) {
			setINIZIALI_1(INIZIALI_1);
		}

		String INIZIALI_1_a = (String)attributes.get("INIZIALI_1_a");

		if (INIZIALI_1_a != null) {
			setINIZIALI_1_a(INIZIALI_1_a);
		}

		String INIZIALI_1_b = (String)attributes.get("INIZIALI_1_b");

		if (INIZIALI_1_b != null) {
			setINIZIALI_1_b(INIZIALI_1_b);
		}

		String INIZIALI_1_c = (String)attributes.get("INIZIALI_1_c");

		if (INIZIALI_1_c != null) {
			setINIZIALI_1_c(INIZIALI_1_c);
		}

		String INIZIALI_1_d = (String)attributes.get("INIZIALI_1_d");

		if (INIZIALI_1_d != null) {
			setINIZIALI_1_d(INIZIALI_1_d);
		}

		String INIZIALI_1_e = (String)attributes.get("INIZIALI_1_e");

		if (INIZIALI_1_e != null) {
			setINIZIALI_1_e(INIZIALI_1_e);
		}

		String DATA_2 = (String)attributes.get("DATA_2");

		if (DATA_2 != null) {
			setDATA_2(DATA_2);
		}

		String SESSO_3 = (String)attributes.get("SESSO_3");

		if (SESSO_3 != null) {
			setSESSO_3(SESSO_3);
		}

		String DATA_4 = (String)attributes.get("DATA_4");

		if (DATA_4 != null) {
			setDATA_4(DATA_4);
		}

		String ORIGINE_5 = (String)attributes.get("ORIGINE_5");

		if (ORIGINE_5 != null) {
			setORIGINE_5(ORIGINE_5);
		}

		String DESCRIZIONE_6 = (String)attributes.get("DESCRIZIONE_6");

		if (DESCRIZIONE_6 != null) {
			setDESCRIZIONE_6(DESCRIZIONE_6);
		}

		String INDICARE_7_1 = (String)attributes.get("INDICARE_7_1");

		if (INDICARE_7_1 != null) {
			setINDICARE_7_1(INDICARE_7_1);
		}

		String INDICARE_7_2 = (String)attributes.get("INDICARE_7_2");

		if (INDICARE_7_2 != null) {
			setINDICARE_7_2(INDICARE_7_2);
		}

		String INDICARE_7_3 = (String)attributes.get("INDICARE_7_3");

		if (INDICARE_7_3 != null) {
			setINDICARE_7_3(INDICARE_7_3);
		}

		String INDICARE_7_4 = (String)attributes.get("INDICARE_7_4");

		if (INDICARE_7_4 != null) {
			setINDICARE_7_4(INDICARE_7_4);
		}

		String INDICARE_7_5 = (String)attributes.get("INDICARE_7_5");

		if (INDICARE_7_5 != null) {
			setINDICARE_7_5(INDICARE_7_5);
		}

		String INDICARE_7_6 = (String)attributes.get("INDICARE_7_6");

		if (INDICARE_7_6 != null) {
			setINDICARE_7_6(INDICARE_7_6);
		}

		String INDICARE_7_7 = (String)attributes.get("INDICARE_7_7");

		if (INDICARE_7_7 != null) {
			setINDICARE_7_7(INDICARE_7_7);
		}

		String GRAVITA_8_1 = (String)attributes.get("GRAVITA_8_1");

		if (GRAVITA_8_1 != null) {
			setGRAVITA_8_1(GRAVITA_8_1);
		}

		String GRAVITA_8_2 = (String)attributes.get("GRAVITA_8_2");

		if (GRAVITA_8_2 != null) {
			setGRAVITA_8_2(GRAVITA_8_2);
		}

		String GRAVITA_8_3 = (String)attributes.get("GRAVITA_8_3");

		if (GRAVITA_8_3 != null) {
			setGRAVITA_8_3(GRAVITA_8_3);
		}

		String GRAVITA_8_4 = (String)attributes.get("GRAVITA_8_4");

		if (GRAVITA_8_4 != null) {
			setGRAVITA_8_4(GRAVITA_8_4);
		}

		String GRAVITA_8_5 = (String)attributes.get("GRAVITA_8_5");

		if (GRAVITA_8_5 != null) {
			setGRAVITA_8_5(GRAVITA_8_5);
		}

		String GRAVITA_8_6 = (String)attributes.get("GRAVITA_8_6");

		if (GRAVITA_8_6 != null) {
			setGRAVITA_8_6(GRAVITA_8_6);
		}

		String GRAVITA_8_7 = (String)attributes.get("GRAVITA_8_7");

		if (GRAVITA_8_7 != null) {
			setGRAVITA_8_7(GRAVITA_8_7);
		}

		String EVENTUALI_9 = (String)attributes.get("EVENTUALI_9");

		if (EVENTUALI_9 != null) {
			setEVENTUALI_9(EVENTUALI_9);
		}

		String ESITO_10 = (String)attributes.get("ESITO_10");

		if (ESITO_10 != null) {
			setESITO_10(ESITO_10);
		}

		String ESITO_10_1 = (String)attributes.get("ESITO_10_1");

		if (ESITO_10_1 != null) {
			setESITO_10_1(ESITO_10_1);
		}

		String ESITO_10_2 = (String)attributes.get("ESITO_10_2");

		if (ESITO_10_2 != null) {
			setESITO_10_2(ESITO_10_2);
		}

		String ESITO_10_3 = (String)attributes.get("ESITO_10_3");

		if (ESITO_10_3 != null) {
			setESITO_10_3(ESITO_10_3);
		}

		String ESITO_10_4 = (String)attributes.get("ESITO_10_4");

		if (ESITO_10_4 != null) {
			setESITO_10_4(ESITO_10_4);
		}

		String ESITO_10_5 = (String)attributes.get("ESITO_10_5");

		if (ESITO_10_5 != null) {
			setESITO_10_5(ESITO_10_5);
		}

		String ESITO_10_6 = (String)attributes.get("ESITO_10_6");

		if (ESITO_10_6 != null) {
			setESITO_10_6(ESITO_10_6);
		}

		String ESITO_10_7 = (String)attributes.get("ESITO_10_7");

		if (ESITO_10_7 != null) {
			setESITO_10_7(ESITO_10_7);
		}

		String ESITO_10_8 = (String)attributes.get("ESITO_10_8");

		if (ESITO_10_8 != null) {
			setESITO_10_8(ESITO_10_8);
		}

		String ESITO_10_9 = (String)attributes.get("ESITO_10_9");

		if (ESITO_10_9 != null) {
			setESITO_10_9(ESITO_10_9);
		}

		String ESITO_10_10 = (String)attributes.get("ESITO_10_10");

		if (ESITO_10_10 != null) {
			setESITO_10_10(ESITO_10_10);
		}

		String AZIONI_11 = (String)attributes.get("AZIONI_11");

		if (AZIONI_11 != null) {
			setAZIONI_11(AZIONI_11);
		}

		String FARMACO_12_a = (String)attributes.get("FARMACO_12_a");

		if (FARMACO_12_a != null) {
			setFARMACO_12_a(FARMACO_12_a);
		}

		String FARMACO_12_a_13 = (String)attributes.get("FARMACO_12_a_13");

		if (FARMACO_12_a_13 != null) {
			setFARMACO_12_a_13(FARMACO_12_a_13);
		}

		String FARMACO_12_a_14 = (String)attributes.get("FARMACO_12_a_14");

		if (FARMACO_12_a_14 != null) {
			setFARMACO_12_a_14(FARMACO_12_a_14);
		}

		String FARMACO_12_a_15 = (String)attributes.get("FARMACO_12_a_15");

		if (FARMACO_12_a_15 != null) {
			setFARMACO_12_a_15(FARMACO_12_a_15);
		}

		String FARMACO_12_a_16_1 = (String)attributes.get("FARMACO_12_a_16_1");

		if (FARMACO_12_a_16_1 != null) {
			setFARMACO_12_a_16_1(FARMACO_12_a_16_1);
		}

		String FARMACO_12_a_16_2 = (String)attributes.get("FARMACO_12_a_16_2");

		if (FARMACO_12_a_16_2 != null) {
			setFARMACO_12_a_16_2(FARMACO_12_a_16_2);
		}

		String FARMACO_12_a_17 = (String)attributes.get("FARMACO_12_a_17");

		if (FARMACO_12_a_17 != null) {
			setFARMACO_12_a_17(FARMACO_12_a_17);
		}

		String FARMACO_12_a_18 = (String)attributes.get("FARMACO_12_a_18");

		if (FARMACO_12_a_18 != null) {
			setFARMACO_12_a_18(FARMACO_12_a_18);
		}

		String FARMACO_12_a_19 = (String)attributes.get("FARMACO_12_a_19");

		if (FARMACO_12_a_19 != null) {
			setFARMACO_12_a_19(FARMACO_12_a_19);
		}

		String FARMACO_12_a_20 = (String)attributes.get("FARMACO_12_a_20");

		if (FARMACO_12_a_20 != null) {
			setFARMACO_12_a_20(FARMACO_12_a_20);
		}

		String FARMACO_12_b = (String)attributes.get("FARMACO_12_b");

		if (FARMACO_12_b != null) {
			setFARMACO_12_b(FARMACO_12_b);
		}

		String FARMACO_12_b_13 = (String)attributes.get("FARMACO_12_b_13");

		if (FARMACO_12_b_13 != null) {
			setFARMACO_12_b_13(FARMACO_12_b_13);
		}

		String FARMACO_12_b_14 = (String)attributes.get("FARMACO_12_b_14");

		if (FARMACO_12_b_14 != null) {
			setFARMACO_12_b_14(FARMACO_12_b_14);
		}

		String FARMACO_12_b_15 = (String)attributes.get("FARMACO_12_b_15");

		if (FARMACO_12_b_15 != null) {
			setFARMACO_12_b_15(FARMACO_12_b_15);
		}

		String FARMACO_12_b_16_1 = (String)attributes.get("FARMACO_12_b_16_1");

		if (FARMACO_12_b_16_1 != null) {
			setFARMACO_12_b_16_1(FARMACO_12_b_16_1);
		}

		String FARMACO_12_b_16_2 = (String)attributes.get("FARMACO_12_b_16_2");

		if (FARMACO_12_b_16_2 != null) {
			setFARMACO_12_b_16_2(FARMACO_12_b_16_2);
		}

		String FARMACO_12_b_17 = (String)attributes.get("FARMACO_12_b_17");

		if (FARMACO_12_b_17 != null) {
			setFARMACO_12_b_17(FARMACO_12_b_17);
		}

		String FARMACO_12_b_18 = (String)attributes.get("FARMACO_12_b_18");

		if (FARMACO_12_b_18 != null) {
			setFARMACO_12_b_18(FARMACO_12_b_18);
		}

		String FARMACO_12_b_19 = (String)attributes.get("FARMACO_12_b_19");

		if (FARMACO_12_b_19 != null) {
			setFARMACO_12_b_19(FARMACO_12_b_19);
		}

		String FARMACO_12_b_20 = (String)attributes.get("FARMACO_12_b_20");

		if (FARMACO_12_b_20 != null) {
			setFARMACO_12_b_20(FARMACO_12_b_20);
		}

		String FARMACO_12_c = (String)attributes.get("FARMACO_12_c");

		if (FARMACO_12_c != null) {
			setFARMACO_12_c(FARMACO_12_c);
		}

		String FARMACO_12_c_13 = (String)attributes.get("FARMACO_12_c_13");

		if (FARMACO_12_c_13 != null) {
			setFARMACO_12_c_13(FARMACO_12_c_13);
		}

		String FARMACO_12_c_14 = (String)attributes.get("FARMACO_12_c_14");

		if (FARMACO_12_c_14 != null) {
			setFARMACO_12_c_14(FARMACO_12_c_14);
		}

		String FARMACO_12_c_15 = (String)attributes.get("FARMACO_12_c_15");

		if (FARMACO_12_c_15 != null) {
			setFARMACO_12_c_15(FARMACO_12_c_15);
		}

		String FARMACO_12_c_16_1 = (String)attributes.get("FARMACO_12_c_16_1");

		if (FARMACO_12_c_16_1 != null) {
			setFARMACO_12_c_16_1(FARMACO_12_c_16_1);
		}

		String FARMACO_12_c_16_2 = (String)attributes.get("FARMACO_12_c_16_2");

		if (FARMACO_12_c_16_2 != null) {
			setFARMACO_12_c_16_2(FARMACO_12_c_16_2);
		}

		String FARMACO_12_c_17 = (String)attributes.get("FARMACO_12_c_17");

		if (FARMACO_12_c_17 != null) {
			setFARMACO_12_c_17(FARMACO_12_c_17);
		}

		String FARMACO_12_c_18 = (String)attributes.get("FARMACO_12_c_18");

		if (FARMACO_12_c_18 != null) {
			setFARMACO_12_c_18(FARMACO_12_c_18);
		}

		String FARMACO_12_c_19 = (String)attributes.get("FARMACO_12_c_19");

		if (FARMACO_12_c_19 != null) {
			setFARMACO_12_c_19(FARMACO_12_c_19);
		}

		String FARMACO_12_c_20 = (String)attributes.get("FARMACO_12_c_20");

		if (FARMACO_12_c_20 != null) {
			setFARMACO_12_c_20(FARMACO_12_c_20);
		}

		String INDICAZIONI_21_a = (String)attributes.get("INDICAZIONI_21_a");

		if (INDICAZIONI_21_a != null) {
			setINDICAZIONI_21_a(INDICAZIONI_21_a);
		}

		String INDICAZIONI_21_b = (String)attributes.get("INDICAZIONI_21_b");

		if (INDICAZIONI_21_b != null) {
			setINDICAZIONI_21_b(INDICAZIONI_21_b);
		}

		String INDICAZIONI_21_c = (String)attributes.get("INDICAZIONI_21_c");

		if (INDICAZIONI_21_c != null) {
			setINDICAZIONI_21_c(INDICAZIONI_21_c);
		}

		String FARMACO_22_a = (String)attributes.get("FARMACO_22_a");

		if (FARMACO_22_a != null) {
			setFARMACO_22_a(FARMACO_22_a);
		}

		String FARMACO_22_a_23 = (String)attributes.get("FARMACO_22_a_23");

		if (FARMACO_22_a_23 != null) {
			setFARMACO_22_a_23(FARMACO_22_a_23);
		}

		String FARMACO_22_a_24 = (String)attributes.get("FARMACO_22_a_24");

		if (FARMACO_22_a_24 != null) {
			setFARMACO_22_a_24(FARMACO_22_a_24);
		}

		String FARMACO_22_a_25 = (String)attributes.get("FARMACO_22_a_25");

		if (FARMACO_22_a_25 != null) {
			setFARMACO_22_a_25(FARMACO_22_a_25);
		}

		String FARMACO_22_a_26_1 = (String)attributes.get("FARMACO_22_a_26_1");

		if (FARMACO_22_a_26_1 != null) {
			setFARMACO_22_a_26_1(FARMACO_22_a_26_1);
		}

		String FARMACO_22_a_26_2 = (String)attributes.get("FARMACO_22_a_26_2");

		if (FARMACO_22_a_26_2 != null) {
			setFARMACO_22_a_26_2(FARMACO_22_a_26_2);
		}

		String FARMACO_22_a_27 = (String)attributes.get("FARMACO_22_a_27");

		if (FARMACO_22_a_27 != null) {
			setFARMACO_22_a_27(FARMACO_22_a_27);
		}

		String FARMACO_22_a_28 = (String)attributes.get("FARMACO_22_a_28");

		if (FARMACO_22_a_28 != null) {
			setFARMACO_22_a_28(FARMACO_22_a_28);
		}

		String FARMACO_22_a_29 = (String)attributes.get("FARMACO_22_a_29");

		if (FARMACO_22_a_29 != null) {
			setFARMACO_22_a_29(FARMACO_22_a_29);
		}

		String FARMACO_22_a_30 = (String)attributes.get("FARMACO_22_a_30");

		if (FARMACO_22_a_30 != null) {
			setFARMACO_22_a_30(FARMACO_22_a_30);
		}

		String FARMACO_22_b = (String)attributes.get("FARMACO_22_b");

		if (FARMACO_22_b != null) {
			setFARMACO_22_b(FARMACO_22_b);
		}

		String FARMACO_22_b_23 = (String)attributes.get("FARMACO_22_b_23");

		if (FARMACO_22_b_23 != null) {
			setFARMACO_22_b_23(FARMACO_22_b_23);
		}

		String FARMACO_22_b_24 = (String)attributes.get("FARMACO_22_b_24");

		if (FARMACO_22_b_24 != null) {
			setFARMACO_22_b_24(FARMACO_22_b_24);
		}

		String FARMACO_22_b_25 = (String)attributes.get("FARMACO_22_b_25");

		if (FARMACO_22_b_25 != null) {
			setFARMACO_22_b_25(FARMACO_22_b_25);
		}

		String FARMACO_22_b_26_1 = (String)attributes.get("FARMACO_22_b_26_1");

		if (FARMACO_22_b_26_1 != null) {
			setFARMACO_22_b_26_1(FARMACO_22_b_26_1);
		}

		String FARMACO_22_b_26_2 = (String)attributes.get("FARMACO_22_b_26_2");

		if (FARMACO_22_b_26_2 != null) {
			setFARMACO_22_b_26_2(FARMACO_22_b_26_2);
		}

		String FARMACO_22_b_27 = (String)attributes.get("FARMACO_22_b_27");

		if (FARMACO_22_b_27 != null) {
			setFARMACO_22_b_27(FARMACO_22_b_27);
		}

		String FARMACO_22_b_28 = (String)attributes.get("FARMACO_22_b_28");

		if (FARMACO_22_b_28 != null) {
			setFARMACO_22_b_28(FARMACO_22_b_28);
		}

		String FARMACO_22_b_29 = (String)attributes.get("FARMACO_22_b_29");

		if (FARMACO_22_b_29 != null) {
			setFARMACO_22_b_29(FARMACO_22_b_29);
		}

		String FARMACO_22_b_30 = (String)attributes.get("FARMACO_22_b_30");

		if (FARMACO_22_b_30 != null) {
			setFARMACO_22_b_30(FARMACO_22_b_30);
		}

		String INDICAZIONI_31_a = (String)attributes.get("INDICAZIONI_31_a");

		if (INDICAZIONI_31_a != null) {
			setINDICAZIONI_31_a(INDICAZIONI_31_a);
		}

		String INDICAZIONI_31_b = (String)attributes.get("INDICAZIONI_31_b");

		if (INDICAZIONI_31_b != null) {
			setINDICAZIONI_31_b(INDICAZIONI_31_b);
		}

		String USO_32 = (String)attributes.get("USO_32");

		if (USO_32 != null) {
			setUSO_32(USO_32);
		}

		String CONDIZIONI_33 = (String)attributes.get("CONDIZIONI_33");

		if (CONDIZIONI_33 != null) {
			setCONDIZIONI_33(CONDIZIONI_33);
		}

		String ALTRE_34 = (String)attributes.get("ALTRE_34");

		if (ALTRE_34 != null) {
			setALTRE_34(ALTRE_34);
		}

		String INDICARE_35_1 = (String)attributes.get("INDICARE_35_1");

		if (INDICARE_35_1 != null) {
			setINDICARE_35_1(INDICARE_35_1);
		}

		String INDICARE_35_2 = (String)attributes.get("INDICARE_35_2");

		if (INDICARE_35_2 != null) {
			setINDICARE_35_2(INDICARE_35_2);
		}

		String INDICARE_35_3 = (String)attributes.get("INDICARE_35_3");

		if (INDICARE_35_3 != null) {
			setINDICARE_35_3(INDICARE_35_3);
		}

		String INDICARE_35_4 = (String)attributes.get("INDICARE_35_4");

		if (INDICARE_35_4 != null) {
			setINDICARE_35_4(INDICARE_35_4);
		}

		String INDICARE_35_5 = (String)attributes.get("INDICARE_35_5");

		if (INDICARE_35_5 != null) {
			setINDICARE_35_5(INDICARE_35_5);
		}

		String INDICARE_35_6 = (String)attributes.get("INDICARE_35_6");

		if (INDICARE_35_6 != null) {
			setINDICARE_35_6(INDICARE_35_6);
		}

		String QUALIFICA_36_1 = (String)attributes.get("QUALIFICA_36_1");

		if (QUALIFICA_36_1 != null) {
			setQUALIFICA_36_1(QUALIFICA_36_1);
		}

		String QUALIFICA_36_2 = (String)attributes.get("QUALIFICA_36_2");

		if (QUALIFICA_36_2 != null) {
			setQUALIFICA_36_2(QUALIFICA_36_2);
		}

		String QUALIFICA_36_3 = (String)attributes.get("QUALIFICA_36_3");

		if (QUALIFICA_36_3 != null) {
			setQUALIFICA_36_3(QUALIFICA_36_3);
		}

		String QUALIFICA_36_4 = (String)attributes.get("QUALIFICA_36_4");

		if (QUALIFICA_36_4 != null) {
			setQUALIFICA_36_4(QUALIFICA_36_4);
		}

		String QUALIFICA_36_5 = (String)attributes.get("QUALIFICA_36_5");

		if (QUALIFICA_36_5 != null) {
			setQUALIFICA_36_5(QUALIFICA_36_5);
		}

		String QUALIFICA_36_6 = (String)attributes.get("QUALIFICA_36_6");

		if (QUALIFICA_36_6 != null) {
			setQUALIFICA_36_6(QUALIFICA_36_6);
		}

		String QUALIFICA_36_7 = (String)attributes.get("QUALIFICA_36_7");

		if (QUALIFICA_36_7 != null) {
			setQUALIFICA_36_7(QUALIFICA_36_7);
		}

		String QUALIFICA_36_8 = (String)attributes.get("QUALIFICA_36_8");

		if (QUALIFICA_36_8 != null) {
			setQUALIFICA_36_8(QUALIFICA_36_8);
		}

		String QUALIFICA_36_9 = (String)attributes.get("QUALIFICA_36_9");

		if (QUALIFICA_36_9 != null) {
			setQUALIFICA_36_9(QUALIFICA_36_9);
		}

		String QUALIFICA_36_10 = (String)attributes.get("QUALIFICA_36_10");

		if (QUALIFICA_36_10 != null) {
			setQUALIFICA_36_10(QUALIFICA_36_10);
		}

		String DATI_37_1 = (String)attributes.get("DATI_37_1");

		if (DATI_37_1 != null) {
			setDATI_37_1(DATI_37_1);
		}

		String DATI_37_2 = (String)attributes.get("DATI_37_2");

		if (DATI_37_2 != null) {
			setDATI_37_2(DATI_37_2);
		}

		String DATI_37_3 = (String)attributes.get("DATI_37_3");

		if (DATI_37_3 != null) {
			setDATI_37_3(DATI_37_3);
		}

		String DATI_37_4 = (String)attributes.get("DATI_37_4");

		if (DATI_37_4 != null) {
			setDATI_37_4(DATI_37_4);
		}

		String ASL_38 = (String)attributes.get("ASL_38");

		if (ASL_38 != null) {
			setASL_38(ASL_38);
		}

		String REGIONE_39 = (String)attributes.get("REGIONE_39");

		if (REGIONE_39 != null) {
			setREGIONE_39(REGIONE_39);
		}

		String DATA_40 = (String)attributes.get("DATA_40");

		if (DATA_40 != null) {
			setDATA_40(DATA_40);
		}

		String FIRMA_41 = (String)attributes.get("FIRMA_41");

		if (FIRMA_41 != null) {
			setFIRMA_41(FIRMA_41);
		}
	}

	@Override
	public long getForm_di_segnalazione_id() {
		return _Form_di_segnalazione_id;
	}

	@Override
	public void setForm_di_segnalazione_id(long Form_di_segnalazione_id) {
		_Form_di_segnalazione_id = Form_di_segnalazione_id;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setForm_di_segnalazione_id",
						long.class);

				method.invoke(_form_di_segnalazioneRemoteModel,
					Form_di_segnalazione_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCODICE() {
		return _CODICE;
	}

	@Override
	public void setCODICE(String CODICE) {
		_CODICE = CODICE;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setCODICE", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, CODICE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINIZIALI_1() {
		return _INIZIALI_1;
	}

	@Override
	public void setINIZIALI_1(String INIZIALI_1) {
		_INIZIALI_1 = INIZIALI_1;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINIZIALI_1", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INIZIALI_1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINIZIALI_1_a() {
		return _INIZIALI_1_a;
	}

	@Override
	public void setINIZIALI_1_a(String INIZIALI_1_a) {
		_INIZIALI_1_a = INIZIALI_1_a;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINIZIALI_1_a", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INIZIALI_1_a);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINIZIALI_1_b() {
		return _INIZIALI_1_b;
	}

	@Override
	public void setINIZIALI_1_b(String INIZIALI_1_b) {
		_INIZIALI_1_b = INIZIALI_1_b;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINIZIALI_1_b", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INIZIALI_1_b);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINIZIALI_1_c() {
		return _INIZIALI_1_c;
	}

	@Override
	public void setINIZIALI_1_c(String INIZIALI_1_c) {
		_INIZIALI_1_c = INIZIALI_1_c;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINIZIALI_1_c", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INIZIALI_1_c);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINIZIALI_1_d() {
		return _INIZIALI_1_d;
	}

	@Override
	public void setINIZIALI_1_d(String INIZIALI_1_d) {
		_INIZIALI_1_d = INIZIALI_1_d;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINIZIALI_1_d", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INIZIALI_1_d);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINIZIALI_1_e() {
		return _INIZIALI_1_e;
	}

	@Override
	public void setINIZIALI_1_e(String INIZIALI_1_e) {
		_INIZIALI_1_e = INIZIALI_1_e;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINIZIALI_1_e", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INIZIALI_1_e);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDATA_2() {
		return _DATA_2;
	}

	@Override
	public void setDATA_2(String DATA_2) {
		_DATA_2 = DATA_2;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setDATA_2", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, DATA_2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSESSO_3() {
		return _SESSO_3;
	}

	@Override
	public void setSESSO_3(String SESSO_3) {
		_SESSO_3 = SESSO_3;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setSESSO_3", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, SESSO_3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDATA_4() {
		return _DATA_4;
	}

	@Override
	public void setDATA_4(String DATA_4) {
		_DATA_4 = DATA_4;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setDATA_4", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, DATA_4);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getORIGINE_5() {
		return _ORIGINE_5;
	}

	@Override
	public void setORIGINE_5(String ORIGINE_5) {
		_ORIGINE_5 = ORIGINE_5;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setORIGINE_5", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, ORIGINE_5);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDESCRIZIONE_6() {
		return _DESCRIZIONE_6;
	}

	@Override
	public void setDESCRIZIONE_6(String DESCRIZIONE_6) {
		_DESCRIZIONE_6 = DESCRIZIONE_6;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setDESCRIZIONE_6", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, DESCRIZIONE_6);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINDICARE_7_1() {
		return _INDICARE_7_1;
	}

	@Override
	public void setINDICARE_7_1(String INDICARE_7_1) {
		_INDICARE_7_1 = INDICARE_7_1;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINDICARE_7_1", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INDICARE_7_1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINDICARE_7_2() {
		return _INDICARE_7_2;
	}

	@Override
	public void setINDICARE_7_2(String INDICARE_7_2) {
		_INDICARE_7_2 = INDICARE_7_2;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINDICARE_7_2", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INDICARE_7_2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINDICARE_7_3() {
		return _INDICARE_7_3;
	}

	@Override
	public void setINDICARE_7_3(String INDICARE_7_3) {
		_INDICARE_7_3 = INDICARE_7_3;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINDICARE_7_3", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INDICARE_7_3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINDICARE_7_4() {
		return _INDICARE_7_4;
	}

	@Override
	public void setINDICARE_7_4(String INDICARE_7_4) {
		_INDICARE_7_4 = INDICARE_7_4;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINDICARE_7_4", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INDICARE_7_4);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINDICARE_7_5() {
		return _INDICARE_7_5;
	}

	@Override
	public void setINDICARE_7_5(String INDICARE_7_5) {
		_INDICARE_7_5 = INDICARE_7_5;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINDICARE_7_5", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INDICARE_7_5);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINDICARE_7_6() {
		return _INDICARE_7_6;
	}

	@Override
	public void setINDICARE_7_6(String INDICARE_7_6) {
		_INDICARE_7_6 = INDICARE_7_6;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINDICARE_7_6", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INDICARE_7_6);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINDICARE_7_7() {
		return _INDICARE_7_7;
	}

	@Override
	public void setINDICARE_7_7(String INDICARE_7_7) {
		_INDICARE_7_7 = INDICARE_7_7;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINDICARE_7_7", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INDICARE_7_7);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGRAVITA_8_1() {
		return _GRAVITA_8_1;
	}

	@Override
	public void setGRAVITA_8_1(String GRAVITA_8_1) {
		_GRAVITA_8_1 = GRAVITA_8_1;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setGRAVITA_8_1", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, GRAVITA_8_1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGRAVITA_8_2() {
		return _GRAVITA_8_2;
	}

	@Override
	public void setGRAVITA_8_2(String GRAVITA_8_2) {
		_GRAVITA_8_2 = GRAVITA_8_2;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setGRAVITA_8_2", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, GRAVITA_8_2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGRAVITA_8_3() {
		return _GRAVITA_8_3;
	}

	@Override
	public void setGRAVITA_8_3(String GRAVITA_8_3) {
		_GRAVITA_8_3 = GRAVITA_8_3;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setGRAVITA_8_3", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, GRAVITA_8_3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGRAVITA_8_4() {
		return _GRAVITA_8_4;
	}

	@Override
	public void setGRAVITA_8_4(String GRAVITA_8_4) {
		_GRAVITA_8_4 = GRAVITA_8_4;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setGRAVITA_8_4", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, GRAVITA_8_4);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGRAVITA_8_5() {
		return _GRAVITA_8_5;
	}

	@Override
	public void setGRAVITA_8_5(String GRAVITA_8_5) {
		_GRAVITA_8_5 = GRAVITA_8_5;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setGRAVITA_8_5", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, GRAVITA_8_5);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGRAVITA_8_6() {
		return _GRAVITA_8_6;
	}

	@Override
	public void setGRAVITA_8_6(String GRAVITA_8_6) {
		_GRAVITA_8_6 = GRAVITA_8_6;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setGRAVITA_8_6", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, GRAVITA_8_6);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGRAVITA_8_7() {
		return _GRAVITA_8_7;
	}

	@Override
	public void setGRAVITA_8_7(String GRAVITA_8_7) {
		_GRAVITA_8_7 = GRAVITA_8_7;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setGRAVITA_8_7", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, GRAVITA_8_7);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEVENTUALI_9() {
		return _EVENTUALI_9;
	}

	@Override
	public void setEVENTUALI_9(String EVENTUALI_9) {
		_EVENTUALI_9 = EVENTUALI_9;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setEVENTUALI_9", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, EVENTUALI_9);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getESITO_10() {
		return _ESITO_10;
	}

	@Override
	public void setESITO_10(String ESITO_10) {
		_ESITO_10 = ESITO_10;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setESITO_10", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, ESITO_10);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getESITO_10_1() {
		return _ESITO_10_1;
	}

	@Override
	public void setESITO_10_1(String ESITO_10_1) {
		_ESITO_10_1 = ESITO_10_1;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setESITO_10_1", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, ESITO_10_1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getESITO_10_2() {
		return _ESITO_10_2;
	}

	@Override
	public void setESITO_10_2(String ESITO_10_2) {
		_ESITO_10_2 = ESITO_10_2;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setESITO_10_2", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, ESITO_10_2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getESITO_10_3() {
		return _ESITO_10_3;
	}

	@Override
	public void setESITO_10_3(String ESITO_10_3) {
		_ESITO_10_3 = ESITO_10_3;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setESITO_10_3", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, ESITO_10_3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getESITO_10_4() {
		return _ESITO_10_4;
	}

	@Override
	public void setESITO_10_4(String ESITO_10_4) {
		_ESITO_10_4 = ESITO_10_4;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setESITO_10_4", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, ESITO_10_4);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getESITO_10_5() {
		return _ESITO_10_5;
	}

	@Override
	public void setESITO_10_5(String ESITO_10_5) {
		_ESITO_10_5 = ESITO_10_5;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setESITO_10_5", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, ESITO_10_5);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getESITO_10_6() {
		return _ESITO_10_6;
	}

	@Override
	public void setESITO_10_6(String ESITO_10_6) {
		_ESITO_10_6 = ESITO_10_6;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setESITO_10_6", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, ESITO_10_6);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getESITO_10_7() {
		return _ESITO_10_7;
	}

	@Override
	public void setESITO_10_7(String ESITO_10_7) {
		_ESITO_10_7 = ESITO_10_7;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setESITO_10_7", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, ESITO_10_7);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getESITO_10_8() {
		return _ESITO_10_8;
	}

	@Override
	public void setESITO_10_8(String ESITO_10_8) {
		_ESITO_10_8 = ESITO_10_8;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setESITO_10_8", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, ESITO_10_8);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getESITO_10_9() {
		return _ESITO_10_9;
	}

	@Override
	public void setESITO_10_9(String ESITO_10_9) {
		_ESITO_10_9 = ESITO_10_9;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setESITO_10_9", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, ESITO_10_9);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getESITO_10_10() {
		return _ESITO_10_10;
	}

	@Override
	public void setESITO_10_10(String ESITO_10_10) {
		_ESITO_10_10 = ESITO_10_10;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setESITO_10_10", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, ESITO_10_10);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAZIONI_11() {
		return _AZIONI_11;
	}

	@Override
	public void setAZIONI_11(String AZIONI_11) {
		_AZIONI_11 = AZIONI_11;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setAZIONI_11", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, AZIONI_11);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_a() {
		return _FARMACO_12_a;
	}

	@Override
	public void setFARMACO_12_a(String FARMACO_12_a) {
		_FARMACO_12_a = FARMACO_12_a;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_a", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_a);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_a_13() {
		return _FARMACO_12_a_13;
	}

	@Override
	public void setFARMACO_12_a_13(String FARMACO_12_a_13) {
		_FARMACO_12_a_13 = FARMACO_12_a_13;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_a_13",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_a_13);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_a_14() {
		return _FARMACO_12_a_14;
	}

	@Override
	public void setFARMACO_12_a_14(String FARMACO_12_a_14) {
		_FARMACO_12_a_14 = FARMACO_12_a_14;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_a_14",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_a_14);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_a_15() {
		return _FARMACO_12_a_15;
	}

	@Override
	public void setFARMACO_12_a_15(String FARMACO_12_a_15) {
		_FARMACO_12_a_15 = FARMACO_12_a_15;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_a_15",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_a_15);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_a_16_1() {
		return _FARMACO_12_a_16_1;
	}

	@Override
	public void setFARMACO_12_a_16_1(String FARMACO_12_a_16_1) {
		_FARMACO_12_a_16_1 = FARMACO_12_a_16_1;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_a_16_1",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel,
					FARMACO_12_a_16_1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_a_16_2() {
		return _FARMACO_12_a_16_2;
	}

	@Override
	public void setFARMACO_12_a_16_2(String FARMACO_12_a_16_2) {
		_FARMACO_12_a_16_2 = FARMACO_12_a_16_2;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_a_16_2",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel,
					FARMACO_12_a_16_2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_a_17() {
		return _FARMACO_12_a_17;
	}

	@Override
	public void setFARMACO_12_a_17(String FARMACO_12_a_17) {
		_FARMACO_12_a_17 = FARMACO_12_a_17;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_a_17",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_a_17);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_a_18() {
		return _FARMACO_12_a_18;
	}

	@Override
	public void setFARMACO_12_a_18(String FARMACO_12_a_18) {
		_FARMACO_12_a_18 = FARMACO_12_a_18;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_a_18",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_a_18);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_a_19() {
		return _FARMACO_12_a_19;
	}

	@Override
	public void setFARMACO_12_a_19(String FARMACO_12_a_19) {
		_FARMACO_12_a_19 = FARMACO_12_a_19;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_a_19",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_a_19);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_a_20() {
		return _FARMACO_12_a_20;
	}

	@Override
	public void setFARMACO_12_a_20(String FARMACO_12_a_20) {
		_FARMACO_12_a_20 = FARMACO_12_a_20;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_a_20",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_a_20);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_b() {
		return _FARMACO_12_b;
	}

	@Override
	public void setFARMACO_12_b(String FARMACO_12_b) {
		_FARMACO_12_b = FARMACO_12_b;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_b", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_b);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_b_13() {
		return _FARMACO_12_b_13;
	}

	@Override
	public void setFARMACO_12_b_13(String FARMACO_12_b_13) {
		_FARMACO_12_b_13 = FARMACO_12_b_13;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_b_13",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_b_13);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_b_14() {
		return _FARMACO_12_b_14;
	}

	@Override
	public void setFARMACO_12_b_14(String FARMACO_12_b_14) {
		_FARMACO_12_b_14 = FARMACO_12_b_14;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_b_14",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_b_14);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_b_15() {
		return _FARMACO_12_b_15;
	}

	@Override
	public void setFARMACO_12_b_15(String FARMACO_12_b_15) {
		_FARMACO_12_b_15 = FARMACO_12_b_15;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_b_15",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_b_15);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_b_16_1() {
		return _FARMACO_12_b_16_1;
	}

	@Override
	public void setFARMACO_12_b_16_1(String FARMACO_12_b_16_1) {
		_FARMACO_12_b_16_1 = FARMACO_12_b_16_1;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_b_16_1",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel,
					FARMACO_12_b_16_1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_b_16_2() {
		return _FARMACO_12_b_16_2;
	}

	@Override
	public void setFARMACO_12_b_16_2(String FARMACO_12_b_16_2) {
		_FARMACO_12_b_16_2 = FARMACO_12_b_16_2;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_b_16_2",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel,
					FARMACO_12_b_16_2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_b_17() {
		return _FARMACO_12_b_17;
	}

	@Override
	public void setFARMACO_12_b_17(String FARMACO_12_b_17) {
		_FARMACO_12_b_17 = FARMACO_12_b_17;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_b_17",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_b_17);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_b_18() {
		return _FARMACO_12_b_18;
	}

	@Override
	public void setFARMACO_12_b_18(String FARMACO_12_b_18) {
		_FARMACO_12_b_18 = FARMACO_12_b_18;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_b_18",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_b_18);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_b_19() {
		return _FARMACO_12_b_19;
	}

	@Override
	public void setFARMACO_12_b_19(String FARMACO_12_b_19) {
		_FARMACO_12_b_19 = FARMACO_12_b_19;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_b_19",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_b_19);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_b_20() {
		return _FARMACO_12_b_20;
	}

	@Override
	public void setFARMACO_12_b_20(String FARMACO_12_b_20) {
		_FARMACO_12_b_20 = FARMACO_12_b_20;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_b_20",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_b_20);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_c() {
		return _FARMACO_12_c;
	}

	@Override
	public void setFARMACO_12_c(String FARMACO_12_c) {
		_FARMACO_12_c = FARMACO_12_c;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_c", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_c);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_c_13() {
		return _FARMACO_12_c_13;
	}

	@Override
	public void setFARMACO_12_c_13(String FARMACO_12_c_13) {
		_FARMACO_12_c_13 = FARMACO_12_c_13;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_c_13",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_c_13);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_c_14() {
		return _FARMACO_12_c_14;
	}

	@Override
	public void setFARMACO_12_c_14(String FARMACO_12_c_14) {
		_FARMACO_12_c_14 = FARMACO_12_c_14;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_c_14",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_c_14);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_c_15() {
		return _FARMACO_12_c_15;
	}

	@Override
	public void setFARMACO_12_c_15(String FARMACO_12_c_15) {
		_FARMACO_12_c_15 = FARMACO_12_c_15;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_c_15",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_c_15);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_c_16_1() {
		return _FARMACO_12_c_16_1;
	}

	@Override
	public void setFARMACO_12_c_16_1(String FARMACO_12_c_16_1) {
		_FARMACO_12_c_16_1 = FARMACO_12_c_16_1;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_c_16_1",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel,
					FARMACO_12_c_16_1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_c_16_2() {
		return _FARMACO_12_c_16_2;
	}

	@Override
	public void setFARMACO_12_c_16_2(String FARMACO_12_c_16_2) {
		_FARMACO_12_c_16_2 = FARMACO_12_c_16_2;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_c_16_2",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel,
					FARMACO_12_c_16_2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_c_17() {
		return _FARMACO_12_c_17;
	}

	@Override
	public void setFARMACO_12_c_17(String FARMACO_12_c_17) {
		_FARMACO_12_c_17 = FARMACO_12_c_17;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_c_17",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_c_17);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_c_18() {
		return _FARMACO_12_c_18;
	}

	@Override
	public void setFARMACO_12_c_18(String FARMACO_12_c_18) {
		_FARMACO_12_c_18 = FARMACO_12_c_18;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_c_18",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_c_18);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_c_19() {
		return _FARMACO_12_c_19;
	}

	@Override
	public void setFARMACO_12_c_19(String FARMACO_12_c_19) {
		_FARMACO_12_c_19 = FARMACO_12_c_19;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_c_19",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_c_19);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_12_c_20() {
		return _FARMACO_12_c_20;
	}

	@Override
	public void setFARMACO_12_c_20(String FARMACO_12_c_20) {
		_FARMACO_12_c_20 = FARMACO_12_c_20;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_12_c_20",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_12_c_20);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINDICAZIONI_21_a() {
		return _INDICAZIONI_21_a;
	}

	@Override
	public void setINDICAZIONI_21_a(String INDICAZIONI_21_a) {
		_INDICAZIONI_21_a = INDICAZIONI_21_a;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINDICAZIONI_21_a",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INDICAZIONI_21_a);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINDICAZIONI_21_b() {
		return _INDICAZIONI_21_b;
	}

	@Override
	public void setINDICAZIONI_21_b(String INDICAZIONI_21_b) {
		_INDICAZIONI_21_b = INDICAZIONI_21_b;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINDICAZIONI_21_b",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INDICAZIONI_21_b);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINDICAZIONI_21_c() {
		return _INDICAZIONI_21_c;
	}

	@Override
	public void setINDICAZIONI_21_c(String INDICAZIONI_21_c) {
		_INDICAZIONI_21_c = INDICAZIONI_21_c;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINDICAZIONI_21_c",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INDICAZIONI_21_c);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_22_a() {
		return _FARMACO_22_a;
	}

	@Override
	public void setFARMACO_22_a(String FARMACO_22_a) {
		_FARMACO_22_a = FARMACO_22_a;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_22_a", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_22_a);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_22_a_23() {
		return _FARMACO_22_a_23;
	}

	@Override
	public void setFARMACO_22_a_23(String FARMACO_22_a_23) {
		_FARMACO_22_a_23 = FARMACO_22_a_23;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_22_a_23",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_22_a_23);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_22_a_24() {
		return _FARMACO_22_a_24;
	}

	@Override
	public void setFARMACO_22_a_24(String FARMACO_22_a_24) {
		_FARMACO_22_a_24 = FARMACO_22_a_24;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_22_a_24",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_22_a_24);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_22_a_25() {
		return _FARMACO_22_a_25;
	}

	@Override
	public void setFARMACO_22_a_25(String FARMACO_22_a_25) {
		_FARMACO_22_a_25 = FARMACO_22_a_25;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_22_a_25",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_22_a_25);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_22_a_26_1() {
		return _FARMACO_22_a_26_1;
	}

	@Override
	public void setFARMACO_22_a_26_1(String FARMACO_22_a_26_1) {
		_FARMACO_22_a_26_1 = FARMACO_22_a_26_1;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_22_a_26_1",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel,
					FARMACO_22_a_26_1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_22_a_26_2() {
		return _FARMACO_22_a_26_2;
	}

	@Override
	public void setFARMACO_22_a_26_2(String FARMACO_22_a_26_2) {
		_FARMACO_22_a_26_2 = FARMACO_22_a_26_2;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_22_a_26_2",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel,
					FARMACO_22_a_26_2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_22_a_27() {
		return _FARMACO_22_a_27;
	}

	@Override
	public void setFARMACO_22_a_27(String FARMACO_22_a_27) {
		_FARMACO_22_a_27 = FARMACO_22_a_27;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_22_a_27",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_22_a_27);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_22_a_28() {
		return _FARMACO_22_a_28;
	}

	@Override
	public void setFARMACO_22_a_28(String FARMACO_22_a_28) {
		_FARMACO_22_a_28 = FARMACO_22_a_28;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_22_a_28",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_22_a_28);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_22_a_29() {
		return _FARMACO_22_a_29;
	}

	@Override
	public void setFARMACO_22_a_29(String FARMACO_22_a_29) {
		_FARMACO_22_a_29 = FARMACO_22_a_29;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_22_a_29",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_22_a_29);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_22_a_30() {
		return _FARMACO_22_a_30;
	}

	@Override
	public void setFARMACO_22_a_30(String FARMACO_22_a_30) {
		_FARMACO_22_a_30 = FARMACO_22_a_30;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_22_a_30",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_22_a_30);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_22_b() {
		return _FARMACO_22_b;
	}

	@Override
	public void setFARMACO_22_b(String FARMACO_22_b) {
		_FARMACO_22_b = FARMACO_22_b;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_22_b", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_22_b);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_22_b_23() {
		return _FARMACO_22_b_23;
	}

	@Override
	public void setFARMACO_22_b_23(String FARMACO_22_b_23) {
		_FARMACO_22_b_23 = FARMACO_22_b_23;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_22_b_23",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_22_b_23);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_22_b_24() {
		return _FARMACO_22_b_24;
	}

	@Override
	public void setFARMACO_22_b_24(String FARMACO_22_b_24) {
		_FARMACO_22_b_24 = FARMACO_22_b_24;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_22_b_24",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_22_b_24);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_22_b_25() {
		return _FARMACO_22_b_25;
	}

	@Override
	public void setFARMACO_22_b_25(String FARMACO_22_b_25) {
		_FARMACO_22_b_25 = FARMACO_22_b_25;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_22_b_25",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_22_b_25);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_22_b_26_1() {
		return _FARMACO_22_b_26_1;
	}

	@Override
	public void setFARMACO_22_b_26_1(String FARMACO_22_b_26_1) {
		_FARMACO_22_b_26_1 = FARMACO_22_b_26_1;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_22_b_26_1",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel,
					FARMACO_22_b_26_1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_22_b_26_2() {
		return _FARMACO_22_b_26_2;
	}

	@Override
	public void setFARMACO_22_b_26_2(String FARMACO_22_b_26_2) {
		_FARMACO_22_b_26_2 = FARMACO_22_b_26_2;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_22_b_26_2",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel,
					FARMACO_22_b_26_2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_22_b_27() {
		return _FARMACO_22_b_27;
	}

	@Override
	public void setFARMACO_22_b_27(String FARMACO_22_b_27) {
		_FARMACO_22_b_27 = FARMACO_22_b_27;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_22_b_27",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_22_b_27);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_22_b_28() {
		return _FARMACO_22_b_28;
	}

	@Override
	public void setFARMACO_22_b_28(String FARMACO_22_b_28) {
		_FARMACO_22_b_28 = FARMACO_22_b_28;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_22_b_28",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_22_b_28);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_22_b_29() {
		return _FARMACO_22_b_29;
	}

	@Override
	public void setFARMACO_22_b_29(String FARMACO_22_b_29) {
		_FARMACO_22_b_29 = FARMACO_22_b_29;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_22_b_29",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_22_b_29);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFARMACO_22_b_30() {
		return _FARMACO_22_b_30;
	}

	@Override
	public void setFARMACO_22_b_30(String FARMACO_22_b_30) {
		_FARMACO_22_b_30 = FARMACO_22_b_30;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFARMACO_22_b_30",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FARMACO_22_b_30);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINDICAZIONI_31_a() {
		return _INDICAZIONI_31_a;
	}

	@Override
	public void setINDICAZIONI_31_a(String INDICAZIONI_31_a) {
		_INDICAZIONI_31_a = INDICAZIONI_31_a;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINDICAZIONI_31_a",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INDICAZIONI_31_a);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINDICAZIONI_31_b() {
		return _INDICAZIONI_31_b;
	}

	@Override
	public void setINDICAZIONI_31_b(String INDICAZIONI_31_b) {
		_INDICAZIONI_31_b = INDICAZIONI_31_b;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINDICAZIONI_31_b",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INDICAZIONI_31_b);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUSO_32() {
		return _USO_32;
	}

	@Override
	public void setUSO_32(String USO_32) {
		_USO_32 = USO_32;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setUSO_32", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, USO_32);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCONDIZIONI_33() {
		return _CONDIZIONI_33;
	}

	@Override
	public void setCONDIZIONI_33(String CONDIZIONI_33) {
		_CONDIZIONI_33 = CONDIZIONI_33;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setCONDIZIONI_33", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, CONDIZIONI_33);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getALTRE_34() {
		return _ALTRE_34;
	}

	@Override
	public void setALTRE_34(String ALTRE_34) {
		_ALTRE_34 = ALTRE_34;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setALTRE_34", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, ALTRE_34);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINDICARE_35_1() {
		return _INDICARE_35_1;
	}

	@Override
	public void setINDICARE_35_1(String INDICARE_35_1) {
		_INDICARE_35_1 = INDICARE_35_1;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINDICARE_35_1", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INDICARE_35_1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINDICARE_35_2() {
		return _INDICARE_35_2;
	}

	@Override
	public void setINDICARE_35_2(String INDICARE_35_2) {
		_INDICARE_35_2 = INDICARE_35_2;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINDICARE_35_2", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INDICARE_35_2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINDICARE_35_3() {
		return _INDICARE_35_3;
	}

	@Override
	public void setINDICARE_35_3(String INDICARE_35_3) {
		_INDICARE_35_3 = INDICARE_35_3;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINDICARE_35_3", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INDICARE_35_3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINDICARE_35_4() {
		return _INDICARE_35_4;
	}

	@Override
	public void setINDICARE_35_4(String INDICARE_35_4) {
		_INDICARE_35_4 = INDICARE_35_4;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINDICARE_35_4", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INDICARE_35_4);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINDICARE_35_5() {
		return _INDICARE_35_5;
	}

	@Override
	public void setINDICARE_35_5(String INDICARE_35_5) {
		_INDICARE_35_5 = INDICARE_35_5;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINDICARE_35_5", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INDICARE_35_5);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINDICARE_35_6() {
		return _INDICARE_35_6;
	}

	@Override
	public void setINDICARE_35_6(String INDICARE_35_6) {
		_INDICARE_35_6 = INDICARE_35_6;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setINDICARE_35_6", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, INDICARE_35_6);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQUALIFICA_36_1() {
		return _QUALIFICA_36_1;
	}

	@Override
	public void setQUALIFICA_36_1(String QUALIFICA_36_1) {
		_QUALIFICA_36_1 = QUALIFICA_36_1;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setQUALIFICA_36_1",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, QUALIFICA_36_1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQUALIFICA_36_2() {
		return _QUALIFICA_36_2;
	}

	@Override
	public void setQUALIFICA_36_2(String QUALIFICA_36_2) {
		_QUALIFICA_36_2 = QUALIFICA_36_2;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setQUALIFICA_36_2",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, QUALIFICA_36_2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQUALIFICA_36_3() {
		return _QUALIFICA_36_3;
	}

	@Override
	public void setQUALIFICA_36_3(String QUALIFICA_36_3) {
		_QUALIFICA_36_3 = QUALIFICA_36_3;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setQUALIFICA_36_3",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, QUALIFICA_36_3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQUALIFICA_36_4() {
		return _QUALIFICA_36_4;
	}

	@Override
	public void setQUALIFICA_36_4(String QUALIFICA_36_4) {
		_QUALIFICA_36_4 = QUALIFICA_36_4;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setQUALIFICA_36_4",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, QUALIFICA_36_4);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQUALIFICA_36_5() {
		return _QUALIFICA_36_5;
	}

	@Override
	public void setQUALIFICA_36_5(String QUALIFICA_36_5) {
		_QUALIFICA_36_5 = QUALIFICA_36_5;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setQUALIFICA_36_5",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, QUALIFICA_36_5);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQUALIFICA_36_6() {
		return _QUALIFICA_36_6;
	}

	@Override
	public void setQUALIFICA_36_6(String QUALIFICA_36_6) {
		_QUALIFICA_36_6 = QUALIFICA_36_6;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setQUALIFICA_36_6",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, QUALIFICA_36_6);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQUALIFICA_36_7() {
		return _QUALIFICA_36_7;
	}

	@Override
	public void setQUALIFICA_36_7(String QUALIFICA_36_7) {
		_QUALIFICA_36_7 = QUALIFICA_36_7;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setQUALIFICA_36_7",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, QUALIFICA_36_7);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQUALIFICA_36_8() {
		return _QUALIFICA_36_8;
	}

	@Override
	public void setQUALIFICA_36_8(String QUALIFICA_36_8) {
		_QUALIFICA_36_8 = QUALIFICA_36_8;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setQUALIFICA_36_8",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, QUALIFICA_36_8);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQUALIFICA_36_9() {
		return _QUALIFICA_36_9;
	}

	@Override
	public void setQUALIFICA_36_9(String QUALIFICA_36_9) {
		_QUALIFICA_36_9 = QUALIFICA_36_9;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setQUALIFICA_36_9",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, QUALIFICA_36_9);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQUALIFICA_36_10() {
		return _QUALIFICA_36_10;
	}

	@Override
	public void setQUALIFICA_36_10(String QUALIFICA_36_10) {
		_QUALIFICA_36_10 = QUALIFICA_36_10;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setQUALIFICA_36_10",
						String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, QUALIFICA_36_10);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDATI_37_1() {
		return _DATI_37_1;
	}

	@Override
	public void setDATI_37_1(String DATI_37_1) {
		_DATI_37_1 = DATI_37_1;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setDATI_37_1", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, DATI_37_1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDATI_37_2() {
		return _DATI_37_2;
	}

	@Override
	public void setDATI_37_2(String DATI_37_2) {
		_DATI_37_2 = DATI_37_2;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setDATI_37_2", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, DATI_37_2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDATI_37_3() {
		return _DATI_37_3;
	}

	@Override
	public void setDATI_37_3(String DATI_37_3) {
		_DATI_37_3 = DATI_37_3;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setDATI_37_3", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, DATI_37_3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDATI_37_4() {
		return _DATI_37_4;
	}

	@Override
	public void setDATI_37_4(String DATI_37_4) {
		_DATI_37_4 = DATI_37_4;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setDATI_37_4", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, DATI_37_4);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getASL_38() {
		return _ASL_38;
	}

	@Override
	public void setASL_38(String ASL_38) {
		_ASL_38 = ASL_38;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setASL_38", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, ASL_38);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getREGIONE_39() {
		return _REGIONE_39;
	}

	@Override
	public void setREGIONE_39(String REGIONE_39) {
		_REGIONE_39 = REGIONE_39;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setREGIONE_39", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, REGIONE_39);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDATA_40() {
		return _DATA_40;
	}

	@Override
	public void setDATA_40(String DATA_40) {
		_DATA_40 = DATA_40;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setDATA_40", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, DATA_40);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFIRMA_41() {
		return _FIRMA_41;
	}

	@Override
	public void setFIRMA_41(String FIRMA_41) {
		_FIRMA_41 = FIRMA_41;

		if (_form_di_segnalazioneRemoteModel != null) {
			try {
				Class<?> clazz = _form_di_segnalazioneRemoteModel.getClass();

				Method method = clazz.getMethod("setFIRMA_41", String.class);

				method.invoke(_form_di_segnalazioneRemoteModel, FIRMA_41);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getform_di_segnalazioneRemoteModel() {
		return _form_di_segnalazioneRemoteModel;
	}

	public void setform_di_segnalazioneRemoteModel(
		BaseModel<?> form_di_segnalazioneRemoteModel) {
		_form_di_segnalazioneRemoteModel = form_di_segnalazioneRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _form_di_segnalazioneRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_form_di_segnalazioneRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			form_di_segnalazioneLocalServiceUtil.addform_di_segnalazione(this);
		}
		else {
			form_di_segnalazioneLocalServiceUtil.updateform_di_segnalazione(this);
		}
	}

	@Override
	public form_di_segnalazione toEscapedModel() {
		return (form_di_segnalazione)ProxyUtil.newProxyInstance(form_di_segnalazione.class.getClassLoader(),
			new Class[] { form_di_segnalazione.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		form_di_segnalazioneClp clone = new form_di_segnalazioneClp();

		clone.setForm_di_segnalazione_id(getForm_di_segnalazione_id());
		clone.setCODICE(getCODICE());
		clone.setINIZIALI_1(getINIZIALI_1());
		clone.setINIZIALI_1_a(getINIZIALI_1_a());
		clone.setINIZIALI_1_b(getINIZIALI_1_b());
		clone.setINIZIALI_1_c(getINIZIALI_1_c());
		clone.setINIZIALI_1_d(getINIZIALI_1_d());
		clone.setINIZIALI_1_e(getINIZIALI_1_e());
		clone.setDATA_2(getDATA_2());
		clone.setSESSO_3(getSESSO_3());
		clone.setDATA_4(getDATA_4());
		clone.setORIGINE_5(getORIGINE_5());
		clone.setDESCRIZIONE_6(getDESCRIZIONE_6());
		clone.setINDICARE_7_1(getINDICARE_7_1());
		clone.setINDICARE_7_2(getINDICARE_7_2());
		clone.setINDICARE_7_3(getINDICARE_7_3());
		clone.setINDICARE_7_4(getINDICARE_7_4());
		clone.setINDICARE_7_5(getINDICARE_7_5());
		clone.setINDICARE_7_6(getINDICARE_7_6());
		clone.setINDICARE_7_7(getINDICARE_7_7());
		clone.setGRAVITA_8_1(getGRAVITA_8_1());
		clone.setGRAVITA_8_2(getGRAVITA_8_2());
		clone.setGRAVITA_8_3(getGRAVITA_8_3());
		clone.setGRAVITA_8_4(getGRAVITA_8_4());
		clone.setGRAVITA_8_5(getGRAVITA_8_5());
		clone.setGRAVITA_8_6(getGRAVITA_8_6());
		clone.setGRAVITA_8_7(getGRAVITA_8_7());
		clone.setEVENTUALI_9(getEVENTUALI_9());
		clone.setESITO_10(getESITO_10());
		clone.setESITO_10_1(getESITO_10_1());
		clone.setESITO_10_2(getESITO_10_2());
		clone.setESITO_10_3(getESITO_10_3());
		clone.setESITO_10_4(getESITO_10_4());
		clone.setESITO_10_5(getESITO_10_5());
		clone.setESITO_10_6(getESITO_10_6());
		clone.setESITO_10_7(getESITO_10_7());
		clone.setESITO_10_8(getESITO_10_8());
		clone.setESITO_10_9(getESITO_10_9());
		clone.setESITO_10_10(getESITO_10_10());
		clone.setAZIONI_11(getAZIONI_11());
		clone.setFARMACO_12_a(getFARMACO_12_a());
		clone.setFARMACO_12_a_13(getFARMACO_12_a_13());
		clone.setFARMACO_12_a_14(getFARMACO_12_a_14());
		clone.setFARMACO_12_a_15(getFARMACO_12_a_15());
		clone.setFARMACO_12_a_16_1(getFARMACO_12_a_16_1());
		clone.setFARMACO_12_a_16_2(getFARMACO_12_a_16_2());
		clone.setFARMACO_12_a_17(getFARMACO_12_a_17());
		clone.setFARMACO_12_a_18(getFARMACO_12_a_18());
		clone.setFARMACO_12_a_19(getFARMACO_12_a_19());
		clone.setFARMACO_12_a_20(getFARMACO_12_a_20());
		clone.setFARMACO_12_b(getFARMACO_12_b());
		clone.setFARMACO_12_b_13(getFARMACO_12_b_13());
		clone.setFARMACO_12_b_14(getFARMACO_12_b_14());
		clone.setFARMACO_12_b_15(getFARMACO_12_b_15());
		clone.setFARMACO_12_b_16_1(getFARMACO_12_b_16_1());
		clone.setFARMACO_12_b_16_2(getFARMACO_12_b_16_2());
		clone.setFARMACO_12_b_17(getFARMACO_12_b_17());
		clone.setFARMACO_12_b_18(getFARMACO_12_b_18());
		clone.setFARMACO_12_b_19(getFARMACO_12_b_19());
		clone.setFARMACO_12_b_20(getFARMACO_12_b_20());
		clone.setFARMACO_12_c(getFARMACO_12_c());
		clone.setFARMACO_12_c_13(getFARMACO_12_c_13());
		clone.setFARMACO_12_c_14(getFARMACO_12_c_14());
		clone.setFARMACO_12_c_15(getFARMACO_12_c_15());
		clone.setFARMACO_12_c_16_1(getFARMACO_12_c_16_1());
		clone.setFARMACO_12_c_16_2(getFARMACO_12_c_16_2());
		clone.setFARMACO_12_c_17(getFARMACO_12_c_17());
		clone.setFARMACO_12_c_18(getFARMACO_12_c_18());
		clone.setFARMACO_12_c_19(getFARMACO_12_c_19());
		clone.setFARMACO_12_c_20(getFARMACO_12_c_20());
		clone.setINDICAZIONI_21_a(getINDICAZIONI_21_a());
		clone.setINDICAZIONI_21_b(getINDICAZIONI_21_b());
		clone.setINDICAZIONI_21_c(getINDICAZIONI_21_c());
		clone.setFARMACO_22_a(getFARMACO_22_a());
		clone.setFARMACO_22_a_23(getFARMACO_22_a_23());
		clone.setFARMACO_22_a_24(getFARMACO_22_a_24());
		clone.setFARMACO_22_a_25(getFARMACO_22_a_25());
		clone.setFARMACO_22_a_26_1(getFARMACO_22_a_26_1());
		clone.setFARMACO_22_a_26_2(getFARMACO_22_a_26_2());
		clone.setFARMACO_22_a_27(getFARMACO_22_a_27());
		clone.setFARMACO_22_a_28(getFARMACO_22_a_28());
		clone.setFARMACO_22_a_29(getFARMACO_22_a_29());
		clone.setFARMACO_22_a_30(getFARMACO_22_a_30());
		clone.setFARMACO_22_b(getFARMACO_22_b());
		clone.setFARMACO_22_b_23(getFARMACO_22_b_23());
		clone.setFARMACO_22_b_24(getFARMACO_22_b_24());
		clone.setFARMACO_22_b_25(getFARMACO_22_b_25());
		clone.setFARMACO_22_b_26_1(getFARMACO_22_b_26_1());
		clone.setFARMACO_22_b_26_2(getFARMACO_22_b_26_2());
		clone.setFARMACO_22_b_27(getFARMACO_22_b_27());
		clone.setFARMACO_22_b_28(getFARMACO_22_b_28());
		clone.setFARMACO_22_b_29(getFARMACO_22_b_29());
		clone.setFARMACO_22_b_30(getFARMACO_22_b_30());
		clone.setINDICAZIONI_31_a(getINDICAZIONI_31_a());
		clone.setINDICAZIONI_31_b(getINDICAZIONI_31_b());
		clone.setUSO_32(getUSO_32());
		clone.setCONDIZIONI_33(getCONDIZIONI_33());
		clone.setALTRE_34(getALTRE_34());
		clone.setINDICARE_35_1(getINDICARE_35_1());
		clone.setINDICARE_35_2(getINDICARE_35_2());
		clone.setINDICARE_35_3(getINDICARE_35_3());
		clone.setINDICARE_35_4(getINDICARE_35_4());
		clone.setINDICARE_35_5(getINDICARE_35_5());
		clone.setINDICARE_35_6(getINDICARE_35_6());
		clone.setQUALIFICA_36_1(getQUALIFICA_36_1());
		clone.setQUALIFICA_36_2(getQUALIFICA_36_2());
		clone.setQUALIFICA_36_3(getQUALIFICA_36_3());
		clone.setQUALIFICA_36_4(getQUALIFICA_36_4());
		clone.setQUALIFICA_36_5(getQUALIFICA_36_5());
		clone.setQUALIFICA_36_6(getQUALIFICA_36_6());
		clone.setQUALIFICA_36_7(getQUALIFICA_36_7());
		clone.setQUALIFICA_36_8(getQUALIFICA_36_8());
		clone.setQUALIFICA_36_9(getQUALIFICA_36_9());
		clone.setQUALIFICA_36_10(getQUALIFICA_36_10());
		clone.setDATI_37_1(getDATI_37_1());
		clone.setDATI_37_2(getDATI_37_2());
		clone.setDATI_37_3(getDATI_37_3());
		clone.setDATI_37_4(getDATI_37_4());
		clone.setASL_38(getASL_38());
		clone.setREGIONE_39(getREGIONE_39());
		clone.setDATA_40(getDATA_40());
		clone.setFIRMA_41(getFIRMA_41());

		return clone;
	}

	@Override
	public int compareTo(form_di_segnalazione form_di_segnalazione) {
		long primaryKey = form_di_segnalazione.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof form_di_segnalazioneClp)) {
			return false;
		}

		form_di_segnalazioneClp form_di_segnalazione = (form_di_segnalazioneClp)obj;

		long primaryKey = form_di_segnalazione.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(245);

		sb.append("{Form_di_segnalazione_id=");
		sb.append(getForm_di_segnalazione_id());
		sb.append(", CODICE=");
		sb.append(getCODICE());
		sb.append(", INIZIALI_1=");
		sb.append(getINIZIALI_1());
		sb.append(", INIZIALI_1_a=");
		sb.append(getINIZIALI_1_a());
		sb.append(", INIZIALI_1_b=");
		sb.append(getINIZIALI_1_b());
		sb.append(", INIZIALI_1_c=");
		sb.append(getINIZIALI_1_c());
		sb.append(", INIZIALI_1_d=");
		sb.append(getINIZIALI_1_d());
		sb.append(", INIZIALI_1_e=");
		sb.append(getINIZIALI_1_e());
		sb.append(", DATA_2=");
		sb.append(getDATA_2());
		sb.append(", SESSO_3=");
		sb.append(getSESSO_3());
		sb.append(", DATA_4=");
		sb.append(getDATA_4());
		sb.append(", ORIGINE_5=");
		sb.append(getORIGINE_5());
		sb.append(", DESCRIZIONE_6=");
		sb.append(getDESCRIZIONE_6());
		sb.append(", INDICARE_7_1=");
		sb.append(getINDICARE_7_1());
		sb.append(", INDICARE_7_2=");
		sb.append(getINDICARE_7_2());
		sb.append(", INDICARE_7_3=");
		sb.append(getINDICARE_7_3());
		sb.append(", INDICARE_7_4=");
		sb.append(getINDICARE_7_4());
		sb.append(", INDICARE_7_5=");
		sb.append(getINDICARE_7_5());
		sb.append(", INDICARE_7_6=");
		sb.append(getINDICARE_7_6());
		sb.append(", INDICARE_7_7=");
		sb.append(getINDICARE_7_7());
		sb.append(", GRAVITA_8_1=");
		sb.append(getGRAVITA_8_1());
		sb.append(", GRAVITA_8_2=");
		sb.append(getGRAVITA_8_2());
		sb.append(", GRAVITA_8_3=");
		sb.append(getGRAVITA_8_3());
		sb.append(", GRAVITA_8_4=");
		sb.append(getGRAVITA_8_4());
		sb.append(", GRAVITA_8_5=");
		sb.append(getGRAVITA_8_5());
		sb.append(", GRAVITA_8_6=");
		sb.append(getGRAVITA_8_6());
		sb.append(", GRAVITA_8_7=");
		sb.append(getGRAVITA_8_7());
		sb.append(", EVENTUALI_9=");
		sb.append(getEVENTUALI_9());
		sb.append(", ESITO_10=");
		sb.append(getESITO_10());
		sb.append(", ESITO_10_1=");
		sb.append(getESITO_10_1());
		sb.append(", ESITO_10_2=");
		sb.append(getESITO_10_2());
		sb.append(", ESITO_10_3=");
		sb.append(getESITO_10_3());
		sb.append(", ESITO_10_4=");
		sb.append(getESITO_10_4());
		sb.append(", ESITO_10_5=");
		sb.append(getESITO_10_5());
		sb.append(", ESITO_10_6=");
		sb.append(getESITO_10_6());
		sb.append(", ESITO_10_7=");
		sb.append(getESITO_10_7());
		sb.append(", ESITO_10_8=");
		sb.append(getESITO_10_8());
		sb.append(", ESITO_10_9=");
		sb.append(getESITO_10_9());
		sb.append(", ESITO_10_10=");
		sb.append(getESITO_10_10());
		sb.append(", AZIONI_11=");
		sb.append(getAZIONI_11());
		sb.append(", FARMACO_12_a=");
		sb.append(getFARMACO_12_a());
		sb.append(", FARMACO_12_a_13=");
		sb.append(getFARMACO_12_a_13());
		sb.append(", FARMACO_12_a_14=");
		sb.append(getFARMACO_12_a_14());
		sb.append(", FARMACO_12_a_15=");
		sb.append(getFARMACO_12_a_15());
		sb.append(", FARMACO_12_a_16_1=");
		sb.append(getFARMACO_12_a_16_1());
		sb.append(", FARMACO_12_a_16_2=");
		sb.append(getFARMACO_12_a_16_2());
		sb.append(", FARMACO_12_a_17=");
		sb.append(getFARMACO_12_a_17());
		sb.append(", FARMACO_12_a_18=");
		sb.append(getFARMACO_12_a_18());
		sb.append(", FARMACO_12_a_19=");
		sb.append(getFARMACO_12_a_19());
		sb.append(", FARMACO_12_a_20=");
		sb.append(getFARMACO_12_a_20());
		sb.append(", FARMACO_12_b=");
		sb.append(getFARMACO_12_b());
		sb.append(", FARMACO_12_b_13=");
		sb.append(getFARMACO_12_b_13());
		sb.append(", FARMACO_12_b_14=");
		sb.append(getFARMACO_12_b_14());
		sb.append(", FARMACO_12_b_15=");
		sb.append(getFARMACO_12_b_15());
		sb.append(", FARMACO_12_b_16_1=");
		sb.append(getFARMACO_12_b_16_1());
		sb.append(", FARMACO_12_b_16_2=");
		sb.append(getFARMACO_12_b_16_2());
		sb.append(", FARMACO_12_b_17=");
		sb.append(getFARMACO_12_b_17());
		sb.append(", FARMACO_12_b_18=");
		sb.append(getFARMACO_12_b_18());
		sb.append(", FARMACO_12_b_19=");
		sb.append(getFARMACO_12_b_19());
		sb.append(", FARMACO_12_b_20=");
		sb.append(getFARMACO_12_b_20());
		sb.append(", FARMACO_12_c=");
		sb.append(getFARMACO_12_c());
		sb.append(", FARMACO_12_c_13=");
		sb.append(getFARMACO_12_c_13());
		sb.append(", FARMACO_12_c_14=");
		sb.append(getFARMACO_12_c_14());
		sb.append(", FARMACO_12_c_15=");
		sb.append(getFARMACO_12_c_15());
		sb.append(", FARMACO_12_c_16_1=");
		sb.append(getFARMACO_12_c_16_1());
		sb.append(", FARMACO_12_c_16_2=");
		sb.append(getFARMACO_12_c_16_2());
		sb.append(", FARMACO_12_c_17=");
		sb.append(getFARMACO_12_c_17());
		sb.append(", FARMACO_12_c_18=");
		sb.append(getFARMACO_12_c_18());
		sb.append(", FARMACO_12_c_19=");
		sb.append(getFARMACO_12_c_19());
		sb.append(", FARMACO_12_c_20=");
		sb.append(getFARMACO_12_c_20());
		sb.append(", INDICAZIONI_21_a=");
		sb.append(getINDICAZIONI_21_a());
		sb.append(", INDICAZIONI_21_b=");
		sb.append(getINDICAZIONI_21_b());
		sb.append(", INDICAZIONI_21_c=");
		sb.append(getINDICAZIONI_21_c());
		sb.append(", FARMACO_22_a=");
		sb.append(getFARMACO_22_a());
		sb.append(", FARMACO_22_a_23=");
		sb.append(getFARMACO_22_a_23());
		sb.append(", FARMACO_22_a_24=");
		sb.append(getFARMACO_22_a_24());
		sb.append(", FARMACO_22_a_25=");
		sb.append(getFARMACO_22_a_25());
		sb.append(", FARMACO_22_a_26_1=");
		sb.append(getFARMACO_22_a_26_1());
		sb.append(", FARMACO_22_a_26_2=");
		sb.append(getFARMACO_22_a_26_2());
		sb.append(", FARMACO_22_a_27=");
		sb.append(getFARMACO_22_a_27());
		sb.append(", FARMACO_22_a_28=");
		sb.append(getFARMACO_22_a_28());
		sb.append(", FARMACO_22_a_29=");
		sb.append(getFARMACO_22_a_29());
		sb.append(", FARMACO_22_a_30=");
		sb.append(getFARMACO_22_a_30());
		sb.append(", FARMACO_22_b=");
		sb.append(getFARMACO_22_b());
		sb.append(", FARMACO_22_b_23=");
		sb.append(getFARMACO_22_b_23());
		sb.append(", FARMACO_22_b_24=");
		sb.append(getFARMACO_22_b_24());
		sb.append(", FARMACO_22_b_25=");
		sb.append(getFARMACO_22_b_25());
		sb.append(", FARMACO_22_b_26_1=");
		sb.append(getFARMACO_22_b_26_1());
		sb.append(", FARMACO_22_b_26_2=");
		sb.append(getFARMACO_22_b_26_2());
		sb.append(", FARMACO_22_b_27=");
		sb.append(getFARMACO_22_b_27());
		sb.append(", FARMACO_22_b_28=");
		sb.append(getFARMACO_22_b_28());
		sb.append(", FARMACO_22_b_29=");
		sb.append(getFARMACO_22_b_29());
		sb.append(", FARMACO_22_b_30=");
		sb.append(getFARMACO_22_b_30());
		sb.append(", INDICAZIONI_31_a=");
		sb.append(getINDICAZIONI_31_a());
		sb.append(", INDICAZIONI_31_b=");
		sb.append(getINDICAZIONI_31_b());
		sb.append(", USO_32=");
		sb.append(getUSO_32());
		sb.append(", CONDIZIONI_33=");
		sb.append(getCONDIZIONI_33());
		sb.append(", ALTRE_34=");
		sb.append(getALTRE_34());
		sb.append(", INDICARE_35_1=");
		sb.append(getINDICARE_35_1());
		sb.append(", INDICARE_35_2=");
		sb.append(getINDICARE_35_2());
		sb.append(", INDICARE_35_3=");
		sb.append(getINDICARE_35_3());
		sb.append(", INDICARE_35_4=");
		sb.append(getINDICARE_35_4());
		sb.append(", INDICARE_35_5=");
		sb.append(getINDICARE_35_5());
		sb.append(", INDICARE_35_6=");
		sb.append(getINDICARE_35_6());
		sb.append(", QUALIFICA_36_1=");
		sb.append(getQUALIFICA_36_1());
		sb.append(", QUALIFICA_36_2=");
		sb.append(getQUALIFICA_36_2());
		sb.append(", QUALIFICA_36_3=");
		sb.append(getQUALIFICA_36_3());
		sb.append(", QUALIFICA_36_4=");
		sb.append(getQUALIFICA_36_4());
		sb.append(", QUALIFICA_36_5=");
		sb.append(getQUALIFICA_36_5());
		sb.append(", QUALIFICA_36_6=");
		sb.append(getQUALIFICA_36_6());
		sb.append(", QUALIFICA_36_7=");
		sb.append(getQUALIFICA_36_7());
		sb.append(", QUALIFICA_36_8=");
		sb.append(getQUALIFICA_36_8());
		sb.append(", QUALIFICA_36_9=");
		sb.append(getQUALIFICA_36_9());
		sb.append(", QUALIFICA_36_10=");
		sb.append(getQUALIFICA_36_10());
		sb.append(", DATI_37_1=");
		sb.append(getDATI_37_1());
		sb.append(", DATI_37_2=");
		sb.append(getDATI_37_2());
		sb.append(", DATI_37_3=");
		sb.append(getDATI_37_3());
		sb.append(", DATI_37_4=");
		sb.append(getDATI_37_4());
		sb.append(", ASL_38=");
		sb.append(getASL_38());
		sb.append(", REGIONE_39=");
		sb.append(getREGIONE_39());
		sb.append(", DATA_40=");
		sb.append(getDATA_40());
		sb.append(", FIRMA_41=");
		sb.append(getFIRMA_41());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(370);

		sb.append("<model><model-name>");
		sb.append("com.daffo.form_di_segnalazione.model.form_di_segnalazione");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Form_di_segnalazione_id</column-name><column-value><![CDATA[");
		sb.append(getForm_di_segnalazione_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CODICE</column-name><column-value><![CDATA[");
		sb.append(getCODICE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INIZIALI_1</column-name><column-value><![CDATA[");
		sb.append(getINIZIALI_1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INIZIALI_1_a</column-name><column-value><![CDATA[");
		sb.append(getINIZIALI_1_a());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INIZIALI_1_b</column-name><column-value><![CDATA[");
		sb.append(getINIZIALI_1_b());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INIZIALI_1_c</column-name><column-value><![CDATA[");
		sb.append(getINIZIALI_1_c());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INIZIALI_1_d</column-name><column-value><![CDATA[");
		sb.append(getINIZIALI_1_d());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INIZIALI_1_e</column-name><column-value><![CDATA[");
		sb.append(getINIZIALI_1_e());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DATA_2</column-name><column-value><![CDATA[");
		sb.append(getDATA_2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SESSO_3</column-name><column-value><![CDATA[");
		sb.append(getSESSO_3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DATA_4</column-name><column-value><![CDATA[");
		sb.append(getDATA_4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ORIGINE_5</column-name><column-value><![CDATA[");
		sb.append(getORIGINE_5());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DESCRIZIONE_6</column-name><column-value><![CDATA[");
		sb.append(getDESCRIZIONE_6());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INDICARE_7_1</column-name><column-value><![CDATA[");
		sb.append(getINDICARE_7_1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INDICARE_7_2</column-name><column-value><![CDATA[");
		sb.append(getINDICARE_7_2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INDICARE_7_3</column-name><column-value><![CDATA[");
		sb.append(getINDICARE_7_3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INDICARE_7_4</column-name><column-value><![CDATA[");
		sb.append(getINDICARE_7_4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INDICARE_7_5</column-name><column-value><![CDATA[");
		sb.append(getINDICARE_7_5());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INDICARE_7_6</column-name><column-value><![CDATA[");
		sb.append(getINDICARE_7_6());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INDICARE_7_7</column-name><column-value><![CDATA[");
		sb.append(getINDICARE_7_7());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>GRAVITA_8_1</column-name><column-value><![CDATA[");
		sb.append(getGRAVITA_8_1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>GRAVITA_8_2</column-name><column-value><![CDATA[");
		sb.append(getGRAVITA_8_2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>GRAVITA_8_3</column-name><column-value><![CDATA[");
		sb.append(getGRAVITA_8_3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>GRAVITA_8_4</column-name><column-value><![CDATA[");
		sb.append(getGRAVITA_8_4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>GRAVITA_8_5</column-name><column-value><![CDATA[");
		sb.append(getGRAVITA_8_5());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>GRAVITA_8_6</column-name><column-value><![CDATA[");
		sb.append(getGRAVITA_8_6());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>GRAVITA_8_7</column-name><column-value><![CDATA[");
		sb.append(getGRAVITA_8_7());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>EVENTUALI_9</column-name><column-value><![CDATA[");
		sb.append(getEVENTUALI_9());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ESITO_10</column-name><column-value><![CDATA[");
		sb.append(getESITO_10());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ESITO_10_1</column-name><column-value><![CDATA[");
		sb.append(getESITO_10_1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ESITO_10_2</column-name><column-value><![CDATA[");
		sb.append(getESITO_10_2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ESITO_10_3</column-name><column-value><![CDATA[");
		sb.append(getESITO_10_3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ESITO_10_4</column-name><column-value><![CDATA[");
		sb.append(getESITO_10_4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ESITO_10_5</column-name><column-value><![CDATA[");
		sb.append(getESITO_10_5());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ESITO_10_6</column-name><column-value><![CDATA[");
		sb.append(getESITO_10_6());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ESITO_10_7</column-name><column-value><![CDATA[");
		sb.append(getESITO_10_7());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ESITO_10_8</column-name><column-value><![CDATA[");
		sb.append(getESITO_10_8());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ESITO_10_9</column-name><column-value><![CDATA[");
		sb.append(getESITO_10_9());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ESITO_10_10</column-name><column-value><![CDATA[");
		sb.append(getESITO_10_10());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AZIONI_11</column-name><column-value><![CDATA[");
		sb.append(getAZIONI_11());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_a</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_a());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_a_13</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_a_13());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_a_14</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_a_14());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_a_15</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_a_15());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_a_16_1</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_a_16_1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_a_16_2</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_a_16_2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_a_17</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_a_17());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_a_18</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_a_18());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_a_19</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_a_19());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_a_20</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_a_20());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_b</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_b());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_b_13</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_b_13());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_b_14</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_b_14());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_b_15</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_b_15());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_b_16_1</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_b_16_1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_b_16_2</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_b_16_2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_b_17</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_b_17());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_b_18</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_b_18());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_b_19</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_b_19());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_b_20</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_b_20());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_c</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_c());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_c_13</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_c_13());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_c_14</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_c_14());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_c_15</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_c_15());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_c_16_1</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_c_16_1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_c_16_2</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_c_16_2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_c_17</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_c_17());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_c_18</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_c_18());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_c_19</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_c_19());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_12_c_20</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_12_c_20());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INDICAZIONI_21_a</column-name><column-value><![CDATA[");
		sb.append(getINDICAZIONI_21_a());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INDICAZIONI_21_b</column-name><column-value><![CDATA[");
		sb.append(getINDICAZIONI_21_b());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INDICAZIONI_21_c</column-name><column-value><![CDATA[");
		sb.append(getINDICAZIONI_21_c());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_22_a</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_22_a());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_22_a_23</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_22_a_23());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_22_a_24</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_22_a_24());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_22_a_25</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_22_a_25());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_22_a_26_1</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_22_a_26_1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_22_a_26_2</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_22_a_26_2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_22_a_27</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_22_a_27());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_22_a_28</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_22_a_28());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_22_a_29</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_22_a_29());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_22_a_30</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_22_a_30());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_22_b</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_22_b());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_22_b_23</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_22_b_23());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_22_b_24</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_22_b_24());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_22_b_25</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_22_b_25());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_22_b_26_1</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_22_b_26_1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_22_b_26_2</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_22_b_26_2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_22_b_27</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_22_b_27());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_22_b_28</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_22_b_28());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_22_b_29</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_22_b_29());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FARMACO_22_b_30</column-name><column-value><![CDATA[");
		sb.append(getFARMACO_22_b_30());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INDICAZIONI_31_a</column-name><column-value><![CDATA[");
		sb.append(getINDICAZIONI_31_a());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INDICAZIONI_31_b</column-name><column-value><![CDATA[");
		sb.append(getINDICAZIONI_31_b());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>USO_32</column-name><column-value><![CDATA[");
		sb.append(getUSO_32());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CONDIZIONI_33</column-name><column-value><![CDATA[");
		sb.append(getCONDIZIONI_33());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ALTRE_34</column-name><column-value><![CDATA[");
		sb.append(getALTRE_34());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INDICARE_35_1</column-name><column-value><![CDATA[");
		sb.append(getINDICARE_35_1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INDICARE_35_2</column-name><column-value><![CDATA[");
		sb.append(getINDICARE_35_2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INDICARE_35_3</column-name><column-value><![CDATA[");
		sb.append(getINDICARE_35_3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INDICARE_35_4</column-name><column-value><![CDATA[");
		sb.append(getINDICARE_35_4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INDICARE_35_5</column-name><column-value><![CDATA[");
		sb.append(getINDICARE_35_5());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INDICARE_35_6</column-name><column-value><![CDATA[");
		sb.append(getINDICARE_35_6());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>QUALIFICA_36_1</column-name><column-value><![CDATA[");
		sb.append(getQUALIFICA_36_1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>QUALIFICA_36_2</column-name><column-value><![CDATA[");
		sb.append(getQUALIFICA_36_2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>QUALIFICA_36_3</column-name><column-value><![CDATA[");
		sb.append(getQUALIFICA_36_3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>QUALIFICA_36_4</column-name><column-value><![CDATA[");
		sb.append(getQUALIFICA_36_4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>QUALIFICA_36_5</column-name><column-value><![CDATA[");
		sb.append(getQUALIFICA_36_5());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>QUALIFICA_36_6</column-name><column-value><![CDATA[");
		sb.append(getQUALIFICA_36_6());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>QUALIFICA_36_7</column-name><column-value><![CDATA[");
		sb.append(getQUALIFICA_36_7());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>QUALIFICA_36_8</column-name><column-value><![CDATA[");
		sb.append(getQUALIFICA_36_8());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>QUALIFICA_36_9</column-name><column-value><![CDATA[");
		sb.append(getQUALIFICA_36_9());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>QUALIFICA_36_10</column-name><column-value><![CDATA[");
		sb.append(getQUALIFICA_36_10());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DATI_37_1</column-name><column-value><![CDATA[");
		sb.append(getDATI_37_1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DATI_37_2</column-name><column-value><![CDATA[");
		sb.append(getDATI_37_2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DATI_37_3</column-name><column-value><![CDATA[");
		sb.append(getDATI_37_3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DATI_37_4</column-name><column-value><![CDATA[");
		sb.append(getDATI_37_4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ASL_38</column-name><column-value><![CDATA[");
		sb.append(getASL_38());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>REGIONE_39</column-name><column-value><![CDATA[");
		sb.append(getREGIONE_39());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DATA_40</column-name><column-value><![CDATA[");
		sb.append(getDATA_40());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FIRMA_41</column-name><column-value><![CDATA[");
		sb.append(getFIRMA_41());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Form_di_segnalazione_id;
	private String _CODICE;
	private String _INIZIALI_1;
	private String _INIZIALI_1_a;
	private String _INIZIALI_1_b;
	private String _INIZIALI_1_c;
	private String _INIZIALI_1_d;
	private String _INIZIALI_1_e;
	private String _DATA_2;
	private String _SESSO_3;
	private String _DATA_4;
	private String _ORIGINE_5;
	private String _DESCRIZIONE_6;
	private String _INDICARE_7_1;
	private String _INDICARE_7_2;
	private String _INDICARE_7_3;
	private String _INDICARE_7_4;
	private String _INDICARE_7_5;
	private String _INDICARE_7_6;
	private String _INDICARE_7_7;
	private String _GRAVITA_8_1;
	private String _GRAVITA_8_2;
	private String _GRAVITA_8_3;
	private String _GRAVITA_8_4;
	private String _GRAVITA_8_5;
	private String _GRAVITA_8_6;
	private String _GRAVITA_8_7;
	private String _EVENTUALI_9;
	private String _ESITO_10;
	private String _ESITO_10_1;
	private String _ESITO_10_2;
	private String _ESITO_10_3;
	private String _ESITO_10_4;
	private String _ESITO_10_5;
	private String _ESITO_10_6;
	private String _ESITO_10_7;
	private String _ESITO_10_8;
	private String _ESITO_10_9;
	private String _ESITO_10_10;
	private String _AZIONI_11;
	private String _FARMACO_12_a;
	private String _FARMACO_12_a_13;
	private String _FARMACO_12_a_14;
	private String _FARMACO_12_a_15;
	private String _FARMACO_12_a_16_1;
	private String _FARMACO_12_a_16_2;
	private String _FARMACO_12_a_17;
	private String _FARMACO_12_a_18;
	private String _FARMACO_12_a_19;
	private String _FARMACO_12_a_20;
	private String _FARMACO_12_b;
	private String _FARMACO_12_b_13;
	private String _FARMACO_12_b_14;
	private String _FARMACO_12_b_15;
	private String _FARMACO_12_b_16_1;
	private String _FARMACO_12_b_16_2;
	private String _FARMACO_12_b_17;
	private String _FARMACO_12_b_18;
	private String _FARMACO_12_b_19;
	private String _FARMACO_12_b_20;
	private String _FARMACO_12_c;
	private String _FARMACO_12_c_13;
	private String _FARMACO_12_c_14;
	private String _FARMACO_12_c_15;
	private String _FARMACO_12_c_16_1;
	private String _FARMACO_12_c_16_2;
	private String _FARMACO_12_c_17;
	private String _FARMACO_12_c_18;
	private String _FARMACO_12_c_19;
	private String _FARMACO_12_c_20;
	private String _INDICAZIONI_21_a;
	private String _INDICAZIONI_21_b;
	private String _INDICAZIONI_21_c;
	private String _FARMACO_22_a;
	private String _FARMACO_22_a_23;
	private String _FARMACO_22_a_24;
	private String _FARMACO_22_a_25;
	private String _FARMACO_22_a_26_1;
	private String _FARMACO_22_a_26_2;
	private String _FARMACO_22_a_27;
	private String _FARMACO_22_a_28;
	private String _FARMACO_22_a_29;
	private String _FARMACO_22_a_30;
	private String _FARMACO_22_b;
	private String _FARMACO_22_b_23;
	private String _FARMACO_22_b_24;
	private String _FARMACO_22_b_25;
	private String _FARMACO_22_b_26_1;
	private String _FARMACO_22_b_26_2;
	private String _FARMACO_22_b_27;
	private String _FARMACO_22_b_28;
	private String _FARMACO_22_b_29;
	private String _FARMACO_22_b_30;
	private String _INDICAZIONI_31_a;
	private String _INDICAZIONI_31_b;
	private String _USO_32;
	private String _CONDIZIONI_33;
	private String _ALTRE_34;
	private String _INDICARE_35_1;
	private String _INDICARE_35_2;
	private String _INDICARE_35_3;
	private String _INDICARE_35_4;
	private String _INDICARE_35_5;
	private String _INDICARE_35_6;
	private String _QUALIFICA_36_1;
	private String _QUALIFICA_36_2;
	private String _QUALIFICA_36_3;
	private String _QUALIFICA_36_4;
	private String _QUALIFICA_36_5;
	private String _QUALIFICA_36_6;
	private String _QUALIFICA_36_7;
	private String _QUALIFICA_36_8;
	private String _QUALIFICA_36_9;
	private String _QUALIFICA_36_10;
	private String _DATI_37_1;
	private String _DATI_37_2;
	private String _DATI_37_3;
	private String _DATI_37_4;
	private String _ASL_38;
	private String _REGIONE_39;
	private String _DATA_40;
	private String _FIRMA_41;
	private BaseModel<?> _form_di_segnalazioneRemoteModel;
	private Class<?> _clpSerializerClass = com.daffo.form_di_segnalazione.service.ClpSerializer.class;
}