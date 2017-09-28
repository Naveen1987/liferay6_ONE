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
import com.liferay.sample.service.suiluppo_courseLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Naveen Kumar
 */
public class suiluppo_courseClp extends BaseModelImpl<suiluppo_course>
	implements suiluppo_course {
	public suiluppo_courseClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return suiluppo_course.class;
	}

	@Override
	public String getModelClassName() {
		return suiluppo_course.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _course_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCourse_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _course_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("course_id", getCourse_id());
		attributes.put("Docente", getDocente());
		attributes.put("Evento_Progetto", getEvento_Progetto());
		attributes.put("Titolo", getTitolo());
		attributes.put("Descrizione", getDescrizione());
		attributes.put("Figure_Professionali_Coinvolte",
			getFigure_Professionali_Coinvolte());
		attributes.put("Data_Inizio", getData_Inizio());
		attributes.put("Data_Fine", getData_Fine());
		attributes.put("Tot_Ore", getTot_Ore());
		attributes.put("Nr_Edizione", getNr_Edizione());
		attributes.put("Sede", getSede());
		attributes.put("Abstract", getAbstract());
		attributes.put("Dispensa_corso", getDispensa_corso());
		attributes.put("Ammessi_al_corso", getAmmessi_al_corso());
		attributes.put("Scadenza_Iscrizioni", getScadenza_Iscrizioni());
		attributes.put("Visibile", getVisibile());
		attributes.put("Bloccato", getBloccato());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long course_id = (Long)attributes.get("course_id");

		if (course_id != null) {
			setCourse_id(course_id);
		}

		String Docente = (String)attributes.get("Docente");

		if (Docente != null) {
			setDocente(Docente);
		}

		String Evento_Progetto = (String)attributes.get("Evento_Progetto");

		if (Evento_Progetto != null) {
			setEvento_Progetto(Evento_Progetto);
		}

		String Titolo = (String)attributes.get("Titolo");

		if (Titolo != null) {
			setTitolo(Titolo);
		}

		String Descrizione = (String)attributes.get("Descrizione");

		if (Descrizione != null) {
			setDescrizione(Descrizione);
		}

		String Figure_Professionali_Coinvolte = (String)attributes.get(
				"Figure_Professionali_Coinvolte");

		if (Figure_Professionali_Coinvolte != null) {
			setFigure_Professionali_Coinvolte(Figure_Professionali_Coinvolte);
		}

		String Data_Inizio = (String)attributes.get("Data_Inizio");

		if (Data_Inizio != null) {
			setData_Inizio(Data_Inizio);
		}

		String Data_Fine = (String)attributes.get("Data_Fine");

		if (Data_Fine != null) {
			setData_Fine(Data_Fine);
		}

		String Tot_Ore = (String)attributes.get("Tot_Ore");

		if (Tot_Ore != null) {
			setTot_Ore(Tot_Ore);
		}

		String Nr_Edizione = (String)attributes.get("Nr_Edizione");

		if (Nr_Edizione != null) {
			setNr_Edizione(Nr_Edizione);
		}

		String Sede = (String)attributes.get("Sede");

		if (Sede != null) {
			setSede(Sede);
		}

		String Abstract = (String)attributes.get("Abstract");

		if (Abstract != null) {
			setAbstract(Abstract);
		}

		String Dispensa_corso = (String)attributes.get("Dispensa_corso");

		if (Dispensa_corso != null) {
			setDispensa_corso(Dispensa_corso);
		}

		Long Ammessi_al_corso = (Long)attributes.get("Ammessi_al_corso");

		if (Ammessi_al_corso != null) {
			setAmmessi_al_corso(Ammessi_al_corso);
		}

		String Scadenza_Iscrizioni = (String)attributes.get(
				"Scadenza_Iscrizioni");

		if (Scadenza_Iscrizioni != null) {
			setScadenza_Iscrizioni(Scadenza_Iscrizioni);
		}

		String Visibile = (String)attributes.get("Visibile");

		if (Visibile != null) {
			setVisibile(Visibile);
		}

		String Bloccato = (String)attributes.get("Bloccato");

		if (Bloccato != null) {
			setBloccato(Bloccato);
		}
	}

	@Override
	public long getCourse_id() {
		return _course_id;
	}

	@Override
	public void setCourse_id(long course_id) {
		_course_id = course_id;

		if (_suiluppo_courseRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_courseRemoteModel.getClass();

				Method method = clazz.getMethod("setCourse_id", long.class);

				method.invoke(_suiluppo_courseRemoteModel, course_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDocente() {
		return _Docente;
	}

	@Override
	public void setDocente(String Docente) {
		_Docente = Docente;

		if (_suiluppo_courseRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_courseRemoteModel.getClass();

				Method method = clazz.getMethod("setDocente", String.class);

				method.invoke(_suiluppo_courseRemoteModel, Docente);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEvento_Progetto() {
		return _Evento_Progetto;
	}

	@Override
	public void setEvento_Progetto(String Evento_Progetto) {
		_Evento_Progetto = Evento_Progetto;

		if (_suiluppo_courseRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_courseRemoteModel.getClass();

				Method method = clazz.getMethod("setEvento_Progetto",
						String.class);

				method.invoke(_suiluppo_courseRemoteModel, Evento_Progetto);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTitolo() {
		return _Titolo;
	}

	@Override
	public void setTitolo(String Titolo) {
		_Titolo = Titolo;

		if (_suiluppo_courseRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_courseRemoteModel.getClass();

				Method method = clazz.getMethod("setTitolo", String.class);

				method.invoke(_suiluppo_courseRemoteModel, Titolo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescrizione() {
		return _Descrizione;
	}

	@Override
	public void setDescrizione(String Descrizione) {
		_Descrizione = Descrizione;

		if (_suiluppo_courseRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_courseRemoteModel.getClass();

				Method method = clazz.getMethod("setDescrizione", String.class);

				method.invoke(_suiluppo_courseRemoteModel, Descrizione);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFigure_Professionali_Coinvolte() {
		return _Figure_Professionali_Coinvolte;
	}

	@Override
	public void setFigure_Professionali_Coinvolte(
		String Figure_Professionali_Coinvolte) {
		_Figure_Professionali_Coinvolte = Figure_Professionali_Coinvolte;

		if (_suiluppo_courseRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_courseRemoteModel.getClass();

				Method method = clazz.getMethod("setFigure_Professionali_Coinvolte",
						String.class);

				method.invoke(_suiluppo_courseRemoteModel,
					Figure_Professionali_Coinvolte);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getData_Inizio() {
		return _Data_Inizio;
	}

	@Override
	public void setData_Inizio(String Data_Inizio) {
		_Data_Inizio = Data_Inizio;

		if (_suiluppo_courseRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_courseRemoteModel.getClass();

				Method method = clazz.getMethod("setData_Inizio", String.class);

				method.invoke(_suiluppo_courseRemoteModel, Data_Inizio);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getData_Fine() {
		return _Data_Fine;
	}

	@Override
	public void setData_Fine(String Data_Fine) {
		_Data_Fine = Data_Fine;

		if (_suiluppo_courseRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_courseRemoteModel.getClass();

				Method method = clazz.getMethod("setData_Fine", String.class);

				method.invoke(_suiluppo_courseRemoteModel, Data_Fine);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTot_Ore() {
		return _Tot_Ore;
	}

	@Override
	public void setTot_Ore(String Tot_Ore) {
		_Tot_Ore = Tot_Ore;

		if (_suiluppo_courseRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_courseRemoteModel.getClass();

				Method method = clazz.getMethod("setTot_Ore", String.class);

				method.invoke(_suiluppo_courseRemoteModel, Tot_Ore);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNr_Edizione() {
		return _Nr_Edizione;
	}

	@Override
	public void setNr_Edizione(String Nr_Edizione) {
		_Nr_Edizione = Nr_Edizione;

		if (_suiluppo_courseRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_courseRemoteModel.getClass();

				Method method = clazz.getMethod("setNr_Edizione", String.class);

				method.invoke(_suiluppo_courseRemoteModel, Nr_Edizione);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSede() {
		return _Sede;
	}

	@Override
	public void setSede(String Sede) {
		_Sede = Sede;

		if (_suiluppo_courseRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_courseRemoteModel.getClass();

				Method method = clazz.getMethod("setSede", String.class);

				method.invoke(_suiluppo_courseRemoteModel, Sede);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAbstract() {
		return _Abstract;
	}

	@Override
	public void setAbstract(String Abstract) {
		_Abstract = Abstract;

		if (_suiluppo_courseRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_courseRemoteModel.getClass();

				Method method = clazz.getMethod("setAbstract", String.class);

				method.invoke(_suiluppo_courseRemoteModel, Abstract);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDispensa_corso() {
		return _Dispensa_corso;
	}

	@Override
	public void setDispensa_corso(String Dispensa_corso) {
		_Dispensa_corso = Dispensa_corso;

		if (_suiluppo_courseRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_courseRemoteModel.getClass();

				Method method = clazz.getMethod("setDispensa_corso",
						String.class);

				method.invoke(_suiluppo_courseRemoteModel, Dispensa_corso);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAmmessi_al_corso() {
		return _Ammessi_al_corso;
	}

	@Override
	public void setAmmessi_al_corso(long Ammessi_al_corso) {
		_Ammessi_al_corso = Ammessi_al_corso;

		if (_suiluppo_courseRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_courseRemoteModel.getClass();

				Method method = clazz.getMethod("setAmmessi_al_corso",
						long.class);

				method.invoke(_suiluppo_courseRemoteModel, Ammessi_al_corso);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getScadenza_Iscrizioni() {
		return _Scadenza_Iscrizioni;
	}

	@Override
	public void setScadenza_Iscrizioni(String Scadenza_Iscrizioni) {
		_Scadenza_Iscrizioni = Scadenza_Iscrizioni;

		if (_suiluppo_courseRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_courseRemoteModel.getClass();

				Method method = clazz.getMethod("setScadenza_Iscrizioni",
						String.class);

				method.invoke(_suiluppo_courseRemoteModel, Scadenza_Iscrizioni);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVisibile() {
		return _Visibile;
	}

	@Override
	public void setVisibile(String Visibile) {
		_Visibile = Visibile;

		if (_suiluppo_courseRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_courseRemoteModel.getClass();

				Method method = clazz.getMethod("setVisibile", String.class);

				method.invoke(_suiluppo_courseRemoteModel, Visibile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBloccato() {
		return _Bloccato;
	}

	@Override
	public void setBloccato(String Bloccato) {
		_Bloccato = Bloccato;

		if (_suiluppo_courseRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_courseRemoteModel.getClass();

				Method method = clazz.getMethod("setBloccato", String.class);

				method.invoke(_suiluppo_courseRemoteModel, Bloccato);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getsuiluppo_courseRemoteModel() {
		return _suiluppo_courseRemoteModel;
	}

	public void setsuiluppo_courseRemoteModel(
		BaseModel<?> suiluppo_courseRemoteModel) {
		_suiluppo_courseRemoteModel = suiluppo_courseRemoteModel;
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

		Class<?> remoteModelClass = _suiluppo_courseRemoteModel.getClass();

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

		Object returnValue = method.invoke(_suiluppo_courseRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			suiluppo_courseLocalServiceUtil.addsuiluppo_course(this);
		}
		else {
			suiluppo_courseLocalServiceUtil.updatesuiluppo_course(this);
		}
	}

	@Override
	public suiluppo_course toEscapedModel() {
		return (suiluppo_course)ProxyUtil.newProxyInstance(suiluppo_course.class.getClassLoader(),
			new Class[] { suiluppo_course.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		suiluppo_courseClp clone = new suiluppo_courseClp();

		clone.setCourse_id(getCourse_id());
		clone.setDocente(getDocente());
		clone.setEvento_Progetto(getEvento_Progetto());
		clone.setTitolo(getTitolo());
		clone.setDescrizione(getDescrizione());
		clone.setFigure_Professionali_Coinvolte(getFigure_Professionali_Coinvolte());
		clone.setData_Inizio(getData_Inizio());
		clone.setData_Fine(getData_Fine());
		clone.setTot_Ore(getTot_Ore());
		clone.setNr_Edizione(getNr_Edizione());
		clone.setSede(getSede());
		clone.setAbstract(getAbstract());
		clone.setDispensa_corso(getDispensa_corso());
		clone.setAmmessi_al_corso(getAmmessi_al_corso());
		clone.setScadenza_Iscrizioni(getScadenza_Iscrizioni());
		clone.setVisibile(getVisibile());
		clone.setBloccato(getBloccato());

		return clone;
	}

	@Override
	public int compareTo(suiluppo_course suiluppo_course) {
		long primaryKey = suiluppo_course.getPrimaryKey();

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

		if (!(obj instanceof suiluppo_courseClp)) {
			return false;
		}

		suiluppo_courseClp suiluppo_course = (suiluppo_courseClp)obj;

		long primaryKey = suiluppo_course.getPrimaryKey();

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
		StringBundler sb = new StringBundler(35);

		sb.append("{course_id=");
		sb.append(getCourse_id());
		sb.append(", Docente=");
		sb.append(getDocente());
		sb.append(", Evento_Progetto=");
		sb.append(getEvento_Progetto());
		sb.append(", Titolo=");
		sb.append(getTitolo());
		sb.append(", Descrizione=");
		sb.append(getDescrizione());
		sb.append(", Figure_Professionali_Coinvolte=");
		sb.append(getFigure_Professionali_Coinvolte());
		sb.append(", Data_Inizio=");
		sb.append(getData_Inizio());
		sb.append(", Data_Fine=");
		sb.append(getData_Fine());
		sb.append(", Tot_Ore=");
		sb.append(getTot_Ore());
		sb.append(", Nr_Edizione=");
		sb.append(getNr_Edizione());
		sb.append(", Sede=");
		sb.append(getSede());
		sb.append(", Abstract=");
		sb.append(getAbstract());
		sb.append(", Dispensa_corso=");
		sb.append(getDispensa_corso());
		sb.append(", Ammessi_al_corso=");
		sb.append(getAmmessi_al_corso());
		sb.append(", Scadenza_Iscrizioni=");
		sb.append(getScadenza_Iscrizioni());
		sb.append(", Visibile=");
		sb.append(getVisibile());
		sb.append(", Bloccato=");
		sb.append(getBloccato());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("com.liferay.sample.model.suiluppo_course");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>course_id</column-name><column-value><![CDATA[");
		sb.append(getCourse_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Docente</column-name><column-value><![CDATA[");
		sb.append(getDocente());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Evento_Progetto</column-name><column-value><![CDATA[");
		sb.append(getEvento_Progetto());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Titolo</column-name><column-value><![CDATA[");
		sb.append(getTitolo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Descrizione</column-name><column-value><![CDATA[");
		sb.append(getDescrizione());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Figure_Professionali_Coinvolte</column-name><column-value><![CDATA[");
		sb.append(getFigure_Professionali_Coinvolte());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Data_Inizio</column-name><column-value><![CDATA[");
		sb.append(getData_Inizio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Data_Fine</column-name><column-value><![CDATA[");
		sb.append(getData_Fine());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Tot_Ore</column-name><column-value><![CDATA[");
		sb.append(getTot_Ore());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Nr_Edizione</column-name><column-value><![CDATA[");
		sb.append(getNr_Edizione());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Sede</column-name><column-value><![CDATA[");
		sb.append(getSede());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Abstract</column-name><column-value><![CDATA[");
		sb.append(getAbstract());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Dispensa_corso</column-name><column-value><![CDATA[");
		sb.append(getDispensa_corso());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Ammessi_al_corso</column-name><column-value><![CDATA[");
		sb.append(getAmmessi_al_corso());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Scadenza_Iscrizioni</column-name><column-value><![CDATA[");
		sb.append(getScadenza_Iscrizioni());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Visibile</column-name><column-value><![CDATA[");
		sb.append(getVisibile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Bloccato</column-name><column-value><![CDATA[");
		sb.append(getBloccato());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _course_id;
	private String _Docente;
	private String _Evento_Progetto;
	private String _Titolo;
	private String _Descrizione;
	private String _Figure_Professionali_Coinvolte;
	private String _Data_Inizio;
	private String _Data_Fine;
	private String _Tot_Ore;
	private String _Nr_Edizione;
	private String _Sede;
	private String _Abstract;
	private String _Dispensa_corso;
	private long _Ammessi_al_corso;
	private String _Scadenza_Iscrizioni;
	private String _Visibile;
	private String _Bloccato;
	private BaseModel<?> _suiluppo_courseRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.sample.service.ClpSerializer.class;
}