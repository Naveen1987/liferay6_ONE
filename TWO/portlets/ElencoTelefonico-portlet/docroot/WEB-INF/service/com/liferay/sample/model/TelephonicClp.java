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

package com.liferay.sample.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.liferay.sample.service.ClpSerializer;
import com.liferay.sample.service.TelephonicLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 */
public class TelephonicClp extends BaseModelImpl<Telephonic>
	implements Telephonic {
	public TelephonicClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Telephonic.class;
	}

	@Override
	public String getModelClassName() {
		return Telephonic.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _telephonicId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTelephonicId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _telephonicId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("telephonicId", getTelephonicId());
		attributes.put("Tipo", getTipo());
		attributes.put("tipoSede", getTipoSede());
		attributes.put("comuneSede", getComuneSede());
		attributes.put("descrizioneSede", getDescrizioneSede());
		attributes.put("interno", getInterno());
		attributes.put("piano", getPiano());
		attributes.put("area", getArea());
		attributes.put("blocco", getBlocco());
		attributes.put("stanza", getStanza());
		attributes.put("marca", getMarca());
		attributes.put("modello", getModello());
		attributes.put("inventarioSN", getInventarioSN());
		attributes.put("unitaOperativa", getUnitaOperativa());
		attributes.put("descrizione", getDescrizione());
		attributes.put("nome", getNome());
		attributes.put("note", getNote());
		attributes.put("visibile", getVisibile());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long telephonicId = (Long)attributes.get("telephonicId");

		if (telephonicId != null) {
			setTelephonicId(telephonicId);
		}

		String Tipo = (String)attributes.get("Tipo");

		if (Tipo != null) {
			setTipo(Tipo);
		}

		String tipoSede = (String)attributes.get("tipoSede");

		if (tipoSede != null) {
			setTipoSede(tipoSede);
		}

		String comuneSede = (String)attributes.get("comuneSede");

		if (comuneSede != null) {
			setComuneSede(comuneSede);
		}

		String descrizioneSede = (String)attributes.get("descrizioneSede");

		if (descrizioneSede != null) {
			setDescrizioneSede(descrizioneSede);
		}

		String interno = (String)attributes.get("interno");

		if (interno != null) {
			setInterno(interno);
		}

		String piano = (String)attributes.get("piano");

		if (piano != null) {
			setPiano(piano);
		}

		String area = (String)attributes.get("area");

		if (area != null) {
			setArea(area);
		}

		String blocco = (String)attributes.get("blocco");

		if (blocco != null) {
			setBlocco(blocco);
		}

		String stanza = (String)attributes.get("stanza");

		if (stanza != null) {
			setStanza(stanza);
		}

		String marca = (String)attributes.get("marca");

		if (marca != null) {
			setMarca(marca);
		}

		String modello = (String)attributes.get("modello");

		if (modello != null) {
			setModello(modello);
		}

		String inventarioSN = (String)attributes.get("inventarioSN");

		if (inventarioSN != null) {
			setInventarioSN(inventarioSN);
		}

		String unitaOperativa = (String)attributes.get("unitaOperativa");

		if (unitaOperativa != null) {
			setUnitaOperativa(unitaOperativa);
		}

		String descrizione = (String)attributes.get("descrizione");

		if (descrizione != null) {
			setDescrizione(descrizione);
		}

		String nome = (String)attributes.get("nome");

		if (nome != null) {
			setNome(nome);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}

		String visibile = (String)attributes.get("visibile");

		if (visibile != null) {
			setVisibile(visibile);
		}
	}

	@Override
	public long getTelephonicId() {
		return _telephonicId;
	}

	@Override
	public void setTelephonicId(long telephonicId) {
		_telephonicId = telephonicId;

		if (_telephonicRemoteModel != null) {
			try {
				Class<?> clazz = _telephonicRemoteModel.getClass();

				Method method = clazz.getMethod("setTelephonicId", long.class);

				method.invoke(_telephonicRemoteModel, telephonicId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTipo() {
		return _Tipo;
	}

	@Override
	public void setTipo(String Tipo) {
		_Tipo = Tipo;

		if (_telephonicRemoteModel != null) {
			try {
				Class<?> clazz = _telephonicRemoteModel.getClass();

				Method method = clazz.getMethod("setTipo", String.class);

				method.invoke(_telephonicRemoteModel, Tipo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTipoSede() {
		return _tipoSede;
	}

	@Override
	public void setTipoSede(String tipoSede) {
		_tipoSede = tipoSede;

		if (_telephonicRemoteModel != null) {
			try {
				Class<?> clazz = _telephonicRemoteModel.getClass();

				Method method = clazz.getMethod("setTipoSede", String.class);

				method.invoke(_telephonicRemoteModel, tipoSede);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getComuneSede() {
		return _comuneSede;
	}

	@Override
	public void setComuneSede(String comuneSede) {
		_comuneSede = comuneSede;

		if (_telephonicRemoteModel != null) {
			try {
				Class<?> clazz = _telephonicRemoteModel.getClass();

				Method method = clazz.getMethod("setComuneSede", String.class);

				method.invoke(_telephonicRemoteModel, comuneSede);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescrizioneSede() {
		return _descrizioneSede;
	}

	@Override
	public void setDescrizioneSede(String descrizioneSede) {
		_descrizioneSede = descrizioneSede;

		if (_telephonicRemoteModel != null) {
			try {
				Class<?> clazz = _telephonicRemoteModel.getClass();

				Method method = clazz.getMethod("setDescrizioneSede",
						String.class);

				method.invoke(_telephonicRemoteModel, descrizioneSede);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInterno() {
		return _interno;
	}

	@Override
	public void setInterno(String interno) {
		_interno = interno;

		if (_telephonicRemoteModel != null) {
			try {
				Class<?> clazz = _telephonicRemoteModel.getClass();

				Method method = clazz.getMethod("setInterno", String.class);

				method.invoke(_telephonicRemoteModel, interno);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPiano() {
		return _piano;
	}

	@Override
	public void setPiano(String piano) {
		_piano = piano;

		if (_telephonicRemoteModel != null) {
			try {
				Class<?> clazz = _telephonicRemoteModel.getClass();

				Method method = clazz.getMethod("setPiano", String.class);

				method.invoke(_telephonicRemoteModel, piano);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getArea() {
		return _area;
	}

	@Override
	public void setArea(String area) {
		_area = area;

		if (_telephonicRemoteModel != null) {
			try {
				Class<?> clazz = _telephonicRemoteModel.getClass();

				Method method = clazz.getMethod("setArea", String.class);

				method.invoke(_telephonicRemoteModel, area);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBlocco() {
		return _blocco;
	}

	@Override
	public void setBlocco(String blocco) {
		_blocco = blocco;

		if (_telephonicRemoteModel != null) {
			try {
				Class<?> clazz = _telephonicRemoteModel.getClass();

				Method method = clazz.getMethod("setBlocco", String.class);

				method.invoke(_telephonicRemoteModel, blocco);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStanza() {
		return _stanza;
	}

	@Override
	public void setStanza(String stanza) {
		_stanza = stanza;

		if (_telephonicRemoteModel != null) {
			try {
				Class<?> clazz = _telephonicRemoteModel.getClass();

				Method method = clazz.getMethod("setStanza", String.class);

				method.invoke(_telephonicRemoteModel, stanza);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMarca() {
		return _marca;
	}

	@Override
	public void setMarca(String marca) {
		_marca = marca;

		if (_telephonicRemoteModel != null) {
			try {
				Class<?> clazz = _telephonicRemoteModel.getClass();

				Method method = clazz.getMethod("setMarca", String.class);

				method.invoke(_telephonicRemoteModel, marca);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getModello() {
		return _modello;
	}

	@Override
	public void setModello(String modello) {
		_modello = modello;

		if (_telephonicRemoteModel != null) {
			try {
				Class<?> clazz = _telephonicRemoteModel.getClass();

				Method method = clazz.getMethod("setModello", String.class);

				method.invoke(_telephonicRemoteModel, modello);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInventarioSN() {
		return _inventarioSN;
	}

	@Override
	public void setInventarioSN(String inventarioSN) {
		_inventarioSN = inventarioSN;

		if (_telephonicRemoteModel != null) {
			try {
				Class<?> clazz = _telephonicRemoteModel.getClass();

				Method method = clazz.getMethod("setInventarioSN", String.class);

				method.invoke(_telephonicRemoteModel, inventarioSN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitaOperativa() {
		return _unitaOperativa;
	}

	@Override
	public void setUnitaOperativa(String unitaOperativa) {
		_unitaOperativa = unitaOperativa;

		if (_telephonicRemoteModel != null) {
			try {
				Class<?> clazz = _telephonicRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitaOperativa",
						String.class);

				method.invoke(_telephonicRemoteModel, unitaOperativa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescrizione() {
		return _descrizione;
	}

	@Override
	public void setDescrizione(String descrizione) {
		_descrizione = descrizione;

		if (_telephonicRemoteModel != null) {
			try {
				Class<?> clazz = _telephonicRemoteModel.getClass();

				Method method = clazz.getMethod("setDescrizione", String.class);

				method.invoke(_telephonicRemoteModel, descrizione);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNome() {
		return _nome;
	}

	@Override
	public void setNome(String nome) {
		_nome = nome;

		if (_telephonicRemoteModel != null) {
			try {
				Class<?> clazz = _telephonicRemoteModel.getClass();

				Method method = clazz.getMethod("setNome", String.class);

				method.invoke(_telephonicRemoteModel, nome);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNote() {
		return _note;
	}

	@Override
	public void setNote(String note) {
		_note = note;

		if (_telephonicRemoteModel != null) {
			try {
				Class<?> clazz = _telephonicRemoteModel.getClass();

				Method method = clazz.getMethod("setNote", String.class);

				method.invoke(_telephonicRemoteModel, note);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVisibile() {
		return _visibile;
	}

	@Override
	public void setVisibile(String visibile) {
		_visibile = visibile;

		if (_telephonicRemoteModel != null) {
			try {
				Class<?> clazz = _telephonicRemoteModel.getClass();

				Method method = clazz.getMethod("setVisibile", String.class);

				method.invoke(_telephonicRemoteModel, visibile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTelephonicRemoteModel() {
		return _telephonicRemoteModel;
	}

	public void setTelephonicRemoteModel(BaseModel<?> telephonicRemoteModel) {
		_telephonicRemoteModel = telephonicRemoteModel;
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

		Class<?> remoteModelClass = _telephonicRemoteModel.getClass();

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

		Object returnValue = method.invoke(_telephonicRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TelephonicLocalServiceUtil.addTelephonic(this);
		}
		else {
			TelephonicLocalServiceUtil.updateTelephonic(this);
		}
	}

	@Override
	public Telephonic toEscapedModel() {
		return (Telephonic)ProxyUtil.newProxyInstance(Telephonic.class.getClassLoader(),
			new Class[] { Telephonic.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TelephonicClp clone = new TelephonicClp();

		clone.setTelephonicId(getTelephonicId());
		clone.setTipo(getTipo());
		clone.setTipoSede(getTipoSede());
		clone.setComuneSede(getComuneSede());
		clone.setDescrizioneSede(getDescrizioneSede());
		clone.setInterno(getInterno());
		clone.setPiano(getPiano());
		clone.setArea(getArea());
		clone.setBlocco(getBlocco());
		clone.setStanza(getStanza());
		clone.setMarca(getMarca());
		clone.setModello(getModello());
		clone.setInventarioSN(getInventarioSN());
		clone.setUnitaOperativa(getUnitaOperativa());
		clone.setDescrizione(getDescrizione());
		clone.setNome(getNome());
		clone.setNote(getNote());
		clone.setVisibile(getVisibile());

		return clone;
	}

	@Override
	public int compareTo(Telephonic telephonic) {
		long primaryKey = telephonic.getPrimaryKey();

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

		if (!(obj instanceof TelephonicClp)) {
			return false;
		}

		TelephonicClp telephonic = (TelephonicClp)obj;

		long primaryKey = telephonic.getPrimaryKey();

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
		StringBundler sb = new StringBundler(37);

		sb.append("{telephonicId=");
		sb.append(getTelephonicId());
		sb.append(", Tipo=");
		sb.append(getTipo());
		sb.append(", tipoSede=");
		sb.append(getTipoSede());
		sb.append(", comuneSede=");
		sb.append(getComuneSede());
		sb.append(", descrizioneSede=");
		sb.append(getDescrizioneSede());
		sb.append(", interno=");
		sb.append(getInterno());
		sb.append(", piano=");
		sb.append(getPiano());
		sb.append(", area=");
		sb.append(getArea());
		sb.append(", blocco=");
		sb.append(getBlocco());
		sb.append(", stanza=");
		sb.append(getStanza());
		sb.append(", marca=");
		sb.append(getMarca());
		sb.append(", modello=");
		sb.append(getModello());
		sb.append(", inventarioSN=");
		sb.append(getInventarioSN());
		sb.append(", unitaOperativa=");
		sb.append(getUnitaOperativa());
		sb.append(", descrizione=");
		sb.append(getDescrizione());
		sb.append(", nome=");
		sb.append(getNome());
		sb.append(", note=");
		sb.append(getNote());
		sb.append(", visibile=");
		sb.append(getVisibile());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("com.liferay.sample.model.Telephonic");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>telephonicId</column-name><column-value><![CDATA[");
		sb.append(getTelephonicId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Tipo</column-name><column-value><![CDATA[");
		sb.append(getTipo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tipoSede</column-name><column-value><![CDATA[");
		sb.append(getTipoSede());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comuneSede</column-name><column-value><![CDATA[");
		sb.append(getComuneSede());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descrizioneSede</column-name><column-value><![CDATA[");
		sb.append(getDescrizioneSede());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>interno</column-name><column-value><![CDATA[");
		sb.append(getInterno());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>piano</column-name><column-value><![CDATA[");
		sb.append(getPiano());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>area</column-name><column-value><![CDATA[");
		sb.append(getArea());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>blocco</column-name><column-value><![CDATA[");
		sb.append(getBlocco());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stanza</column-name><column-value><![CDATA[");
		sb.append(getStanza());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>marca</column-name><column-value><![CDATA[");
		sb.append(getMarca());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modello</column-name><column-value><![CDATA[");
		sb.append(getModello());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inventarioSN</column-name><column-value><![CDATA[");
		sb.append(getInventarioSN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitaOperativa</column-name><column-value><![CDATA[");
		sb.append(getUnitaOperativa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descrizione</column-name><column-value><![CDATA[");
		sb.append(getDescrizione());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nome</column-name><column-value><![CDATA[");
		sb.append(getNome());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>note</column-name><column-value><![CDATA[");
		sb.append(getNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>visibile</column-name><column-value><![CDATA[");
		sb.append(getVisibile());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _telephonicId;
	private String _Tipo;
	private String _tipoSede;
	private String _comuneSede;
	private String _descrizioneSede;
	private String _interno;
	private String _piano;
	private String _area;
	private String _blocco;
	private String _stanza;
	private String _marca;
	private String _modello;
	private String _inventarioSN;
	private String _unitaOperativa;
	private String _descrizione;
	private String _nome;
	private String _note;
	private String _visibile;
	private BaseModel<?> _telephonicRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.sample.service.ClpSerializer.class;
}