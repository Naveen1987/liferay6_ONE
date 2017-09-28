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

package com.liferay.daffo.model;

import com.liferay.daffo.service.ClpSerializer;
import com.liferay.daffo.service.prontuario_drugLocalServiceUtil;

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
 * @author Naveen
 */
public class prontuario_drugClp extends BaseModelImpl<prontuario_drug>
	implements prontuario_drug {
	public prontuario_drugClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return prontuario_drug.class;
	}

	@Override
	public String getModelClassName() {
		return prontuario_drug.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _drug_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDrug_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _drug_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("drug_id", getDrug_id());
		attributes.put("Gruppo", getGruppo());
		attributes.put("SottoGruppo", getSottoGruppo());
		attributes.put("Codice", getCodice());
		attributes.put("Principio_Attivo", getPrincipio_Attivo());
		attributes.put("Nome_Commerciale", getNome_Commerciale());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long drug_id = (Long)attributes.get("drug_id");

		if (drug_id != null) {
			setDrug_id(drug_id);
		}

		String Gruppo = (String)attributes.get("Gruppo");

		if (Gruppo != null) {
			setGruppo(Gruppo);
		}

		String SottoGruppo = (String)attributes.get("SottoGruppo");

		if (SottoGruppo != null) {
			setSottoGruppo(SottoGruppo);
		}

		String Codice = (String)attributes.get("Codice");

		if (Codice != null) {
			setCodice(Codice);
		}

		String Principio_Attivo = (String)attributes.get("Principio_Attivo");

		if (Principio_Attivo != null) {
			setPrincipio_Attivo(Principio_Attivo);
		}

		String Nome_Commerciale = (String)attributes.get("Nome_Commerciale");

		if (Nome_Commerciale != null) {
			setNome_Commerciale(Nome_Commerciale);
		}
	}

	@Override
	public long getDrug_id() {
		return _drug_id;
	}

	@Override
	public void setDrug_id(long drug_id) {
		_drug_id = drug_id;

		if (_prontuario_drugRemoteModel != null) {
			try {
				Class<?> clazz = _prontuario_drugRemoteModel.getClass();

				Method method = clazz.getMethod("setDrug_id", long.class);

				method.invoke(_prontuario_drugRemoteModel, drug_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGruppo() {
		return _Gruppo;
	}

	@Override
	public void setGruppo(String Gruppo) {
		_Gruppo = Gruppo;

		if (_prontuario_drugRemoteModel != null) {
			try {
				Class<?> clazz = _prontuario_drugRemoteModel.getClass();

				Method method = clazz.getMethod("setGruppo", String.class);

				method.invoke(_prontuario_drugRemoteModel, Gruppo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSottoGruppo() {
		return _SottoGruppo;
	}

	@Override
	public void setSottoGruppo(String SottoGruppo) {
		_SottoGruppo = SottoGruppo;

		if (_prontuario_drugRemoteModel != null) {
			try {
				Class<?> clazz = _prontuario_drugRemoteModel.getClass();

				Method method = clazz.getMethod("setSottoGruppo", String.class);

				method.invoke(_prontuario_drugRemoteModel, SottoGruppo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCodice() {
		return _Codice;
	}

	@Override
	public void setCodice(String Codice) {
		_Codice = Codice;

		if (_prontuario_drugRemoteModel != null) {
			try {
				Class<?> clazz = _prontuario_drugRemoteModel.getClass();

				Method method = clazz.getMethod("setCodice", String.class);

				method.invoke(_prontuario_drugRemoteModel, Codice);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPrincipio_Attivo() {
		return _Principio_Attivo;
	}

	@Override
	public void setPrincipio_Attivo(String Principio_Attivo) {
		_Principio_Attivo = Principio_Attivo;

		if (_prontuario_drugRemoteModel != null) {
			try {
				Class<?> clazz = _prontuario_drugRemoteModel.getClass();

				Method method = clazz.getMethod("setPrincipio_Attivo",
						String.class);

				method.invoke(_prontuario_drugRemoteModel, Principio_Attivo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNome_Commerciale() {
		return _Nome_Commerciale;
	}

	@Override
	public void setNome_Commerciale(String Nome_Commerciale) {
		_Nome_Commerciale = Nome_Commerciale;

		if (_prontuario_drugRemoteModel != null) {
			try {
				Class<?> clazz = _prontuario_drugRemoteModel.getClass();

				Method method = clazz.getMethod("setNome_Commerciale",
						String.class);

				method.invoke(_prontuario_drugRemoteModel, Nome_Commerciale);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getprontuario_drugRemoteModel() {
		return _prontuario_drugRemoteModel;
	}

	public void setprontuario_drugRemoteModel(
		BaseModel<?> prontuario_drugRemoteModel) {
		_prontuario_drugRemoteModel = prontuario_drugRemoteModel;
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

		Class<?> remoteModelClass = _prontuario_drugRemoteModel.getClass();

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

		Object returnValue = method.invoke(_prontuario_drugRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			prontuario_drugLocalServiceUtil.addprontuario_drug(this);
		}
		else {
			prontuario_drugLocalServiceUtil.updateprontuario_drug(this);
		}
	}

	@Override
	public prontuario_drug toEscapedModel() {
		return (prontuario_drug)ProxyUtil.newProxyInstance(prontuario_drug.class.getClassLoader(),
			new Class[] { prontuario_drug.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		prontuario_drugClp clone = new prontuario_drugClp();

		clone.setDrug_id(getDrug_id());
		clone.setGruppo(getGruppo());
		clone.setSottoGruppo(getSottoGruppo());
		clone.setCodice(getCodice());
		clone.setPrincipio_Attivo(getPrincipio_Attivo());
		clone.setNome_Commerciale(getNome_Commerciale());

		return clone;
	}

	@Override
	public int compareTo(prontuario_drug prontuario_drug) {
		long primaryKey = prontuario_drug.getPrimaryKey();

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

		if (!(obj instanceof prontuario_drugClp)) {
			return false;
		}

		prontuario_drugClp prontuario_drug = (prontuario_drugClp)obj;

		long primaryKey = prontuario_drug.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{drug_id=");
		sb.append(getDrug_id());
		sb.append(", Gruppo=");
		sb.append(getGruppo());
		sb.append(", SottoGruppo=");
		sb.append(getSottoGruppo());
		sb.append(", Codice=");
		sb.append(getCodice());
		sb.append(", Principio_Attivo=");
		sb.append(getPrincipio_Attivo());
		sb.append(", Nome_Commerciale=");
		sb.append(getNome_Commerciale());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.liferay.daffo.model.prontuario_drug");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>drug_id</column-name><column-value><![CDATA[");
		sb.append(getDrug_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Gruppo</column-name><column-value><![CDATA[");
		sb.append(getGruppo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SottoGruppo</column-name><column-value><![CDATA[");
		sb.append(getSottoGruppo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Codice</column-name><column-value><![CDATA[");
		sb.append(getCodice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Principio_Attivo</column-name><column-value><![CDATA[");
		sb.append(getPrincipio_Attivo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Nome_Commerciale</column-name><column-value><![CDATA[");
		sb.append(getNome_Commerciale());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _drug_id;
	private String _Gruppo;
	private String _SottoGruppo;
	private String _Codice;
	private String _Principio_Attivo;
	private String _Nome_Commerciale;
	private BaseModel<?> _prontuario_drugRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.daffo.service.ClpSerializer.class;
}