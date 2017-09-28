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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link suiluppo_course}.
 * </p>
 *
 * @author Naveen Kumar
 * @see suiluppo_course
 * @generated
 */
public class suiluppo_courseWrapper implements suiluppo_course,
	ModelWrapper<suiluppo_course> {
	public suiluppo_courseWrapper(suiluppo_course suiluppo_course) {
		_suiluppo_course = suiluppo_course;
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

	/**
	* Returns the primary key of this suiluppo_course.
	*
	* @return the primary key of this suiluppo_course
	*/
	@Override
	public long getPrimaryKey() {
		return _suiluppo_course.getPrimaryKey();
	}

	/**
	* Sets the primary key of this suiluppo_course.
	*
	* @param primaryKey the primary key of this suiluppo_course
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_suiluppo_course.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the course_id of this suiluppo_course.
	*
	* @return the course_id of this suiluppo_course
	*/
	@Override
	public long getCourse_id() {
		return _suiluppo_course.getCourse_id();
	}

	/**
	* Sets the course_id of this suiluppo_course.
	*
	* @param course_id the course_id of this suiluppo_course
	*/
	@Override
	public void setCourse_id(long course_id) {
		_suiluppo_course.setCourse_id(course_id);
	}

	/**
	* Returns the docente of this suiluppo_course.
	*
	* @return the docente of this suiluppo_course
	*/
	@Override
	public java.lang.String getDocente() {
		return _suiluppo_course.getDocente();
	}

	/**
	* Sets the docente of this suiluppo_course.
	*
	* @param Docente the docente of this suiluppo_course
	*/
	@Override
	public void setDocente(java.lang.String Docente) {
		_suiluppo_course.setDocente(Docente);
	}

	/**
	* Returns the evento_ progetto of this suiluppo_course.
	*
	* @return the evento_ progetto of this suiluppo_course
	*/
	@Override
	public java.lang.String getEvento_Progetto() {
		return _suiluppo_course.getEvento_Progetto();
	}

	/**
	* Sets the evento_ progetto of this suiluppo_course.
	*
	* @param Evento_Progetto the evento_ progetto of this suiluppo_course
	*/
	@Override
	public void setEvento_Progetto(java.lang.String Evento_Progetto) {
		_suiluppo_course.setEvento_Progetto(Evento_Progetto);
	}

	/**
	* Returns the titolo of this suiluppo_course.
	*
	* @return the titolo of this suiluppo_course
	*/
	@Override
	public java.lang.String getTitolo() {
		return _suiluppo_course.getTitolo();
	}

	/**
	* Sets the titolo of this suiluppo_course.
	*
	* @param Titolo the titolo of this suiluppo_course
	*/
	@Override
	public void setTitolo(java.lang.String Titolo) {
		_suiluppo_course.setTitolo(Titolo);
	}

	/**
	* Returns the descrizione of this suiluppo_course.
	*
	* @return the descrizione of this suiluppo_course
	*/
	@Override
	public java.lang.String getDescrizione() {
		return _suiluppo_course.getDescrizione();
	}

	/**
	* Sets the descrizione of this suiluppo_course.
	*
	* @param Descrizione the descrizione of this suiluppo_course
	*/
	@Override
	public void setDescrizione(java.lang.String Descrizione) {
		_suiluppo_course.setDescrizione(Descrizione);
	}

	/**
	* Returns the figure_ professionali_ coinvolte of this suiluppo_course.
	*
	* @return the figure_ professionali_ coinvolte of this suiluppo_course
	*/
	@Override
	public java.lang.String getFigure_Professionali_Coinvolte() {
		return _suiluppo_course.getFigure_Professionali_Coinvolte();
	}

	/**
	* Sets the figure_ professionali_ coinvolte of this suiluppo_course.
	*
	* @param Figure_Professionali_Coinvolte the figure_ professionali_ coinvolte of this suiluppo_course
	*/
	@Override
	public void setFigure_Professionali_Coinvolte(
		java.lang.String Figure_Professionali_Coinvolte) {
		_suiluppo_course.setFigure_Professionali_Coinvolte(Figure_Professionali_Coinvolte);
	}

	/**
	* Returns the data_ inizio of this suiluppo_course.
	*
	* @return the data_ inizio of this suiluppo_course
	*/
	@Override
	public java.lang.String getData_Inizio() {
		return _suiluppo_course.getData_Inizio();
	}

	/**
	* Sets the data_ inizio of this suiluppo_course.
	*
	* @param Data_Inizio the data_ inizio of this suiluppo_course
	*/
	@Override
	public void setData_Inizio(java.lang.String Data_Inizio) {
		_suiluppo_course.setData_Inizio(Data_Inizio);
	}

	/**
	* Returns the data_ fine of this suiluppo_course.
	*
	* @return the data_ fine of this suiluppo_course
	*/
	@Override
	public java.lang.String getData_Fine() {
		return _suiluppo_course.getData_Fine();
	}

	/**
	* Sets the data_ fine of this suiluppo_course.
	*
	* @param Data_Fine the data_ fine of this suiluppo_course
	*/
	@Override
	public void setData_Fine(java.lang.String Data_Fine) {
		_suiluppo_course.setData_Fine(Data_Fine);
	}

	/**
	* Returns the tot_ ore of this suiluppo_course.
	*
	* @return the tot_ ore of this suiluppo_course
	*/
	@Override
	public java.lang.String getTot_Ore() {
		return _suiluppo_course.getTot_Ore();
	}

	/**
	* Sets the tot_ ore of this suiluppo_course.
	*
	* @param Tot_Ore the tot_ ore of this suiluppo_course
	*/
	@Override
	public void setTot_Ore(java.lang.String Tot_Ore) {
		_suiluppo_course.setTot_Ore(Tot_Ore);
	}

	/**
	* Returns the nr_ edizione of this suiluppo_course.
	*
	* @return the nr_ edizione of this suiluppo_course
	*/
	@Override
	public java.lang.String getNr_Edizione() {
		return _suiluppo_course.getNr_Edizione();
	}

	/**
	* Sets the nr_ edizione of this suiluppo_course.
	*
	* @param Nr_Edizione the nr_ edizione of this suiluppo_course
	*/
	@Override
	public void setNr_Edizione(java.lang.String Nr_Edizione) {
		_suiluppo_course.setNr_Edizione(Nr_Edizione);
	}

	/**
	* Returns the sede of this suiluppo_course.
	*
	* @return the sede of this suiluppo_course
	*/
	@Override
	public java.lang.String getSede() {
		return _suiluppo_course.getSede();
	}

	/**
	* Sets the sede of this suiluppo_course.
	*
	* @param Sede the sede of this suiluppo_course
	*/
	@Override
	public void setSede(java.lang.String Sede) {
		_suiluppo_course.setSede(Sede);
	}

	/**
	* Returns the abstract of this suiluppo_course.
	*
	* @return the abstract of this suiluppo_course
	*/
	@Override
	public java.lang.String getAbstract() {
		return _suiluppo_course.getAbstract();
	}

	/**
	* Sets the abstract of this suiluppo_course.
	*
	* @param Abstract the abstract of this suiluppo_course
	*/
	@Override
	public void setAbstract(java.lang.String Abstract) {
		_suiluppo_course.setAbstract(Abstract);
	}

	/**
	* Returns the dispensa_corso of this suiluppo_course.
	*
	* @return the dispensa_corso of this suiluppo_course
	*/
	@Override
	public java.lang.String getDispensa_corso() {
		return _suiluppo_course.getDispensa_corso();
	}

	/**
	* Sets the dispensa_corso of this suiluppo_course.
	*
	* @param Dispensa_corso the dispensa_corso of this suiluppo_course
	*/
	@Override
	public void setDispensa_corso(java.lang.String Dispensa_corso) {
		_suiluppo_course.setDispensa_corso(Dispensa_corso);
	}

	/**
	* Returns the ammessi_al_corso of this suiluppo_course.
	*
	* @return the ammessi_al_corso of this suiluppo_course
	*/
	@Override
	public long getAmmessi_al_corso() {
		return _suiluppo_course.getAmmessi_al_corso();
	}

	/**
	* Sets the ammessi_al_corso of this suiluppo_course.
	*
	* @param Ammessi_al_corso the ammessi_al_corso of this suiluppo_course
	*/
	@Override
	public void setAmmessi_al_corso(long Ammessi_al_corso) {
		_suiluppo_course.setAmmessi_al_corso(Ammessi_al_corso);
	}

	/**
	* Returns the scadenza_ iscrizioni of this suiluppo_course.
	*
	* @return the scadenza_ iscrizioni of this suiluppo_course
	*/
	@Override
	public java.lang.String getScadenza_Iscrizioni() {
		return _suiluppo_course.getScadenza_Iscrizioni();
	}

	/**
	* Sets the scadenza_ iscrizioni of this suiluppo_course.
	*
	* @param Scadenza_Iscrizioni the scadenza_ iscrizioni of this suiluppo_course
	*/
	@Override
	public void setScadenza_Iscrizioni(java.lang.String Scadenza_Iscrizioni) {
		_suiluppo_course.setScadenza_Iscrizioni(Scadenza_Iscrizioni);
	}

	/**
	* Returns the visibile of this suiluppo_course.
	*
	* @return the visibile of this suiluppo_course
	*/
	@Override
	public java.lang.String getVisibile() {
		return _suiluppo_course.getVisibile();
	}

	/**
	* Sets the visibile of this suiluppo_course.
	*
	* @param Visibile the visibile of this suiluppo_course
	*/
	@Override
	public void setVisibile(java.lang.String Visibile) {
		_suiluppo_course.setVisibile(Visibile);
	}

	/**
	* Returns the bloccato of this suiluppo_course.
	*
	* @return the bloccato of this suiluppo_course
	*/
	@Override
	public java.lang.String getBloccato() {
		return _suiluppo_course.getBloccato();
	}

	/**
	* Sets the bloccato of this suiluppo_course.
	*
	* @param Bloccato the bloccato of this suiluppo_course
	*/
	@Override
	public void setBloccato(java.lang.String Bloccato) {
		_suiluppo_course.setBloccato(Bloccato);
	}

	@Override
	public boolean isNew() {
		return _suiluppo_course.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_suiluppo_course.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _suiluppo_course.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_suiluppo_course.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _suiluppo_course.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _suiluppo_course.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_suiluppo_course.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _suiluppo_course.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_suiluppo_course.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_suiluppo_course.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_suiluppo_course.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new suiluppo_courseWrapper((suiluppo_course)_suiluppo_course.clone());
	}

	@Override
	public int compareTo(
		com.liferay.sample.model.suiluppo_course suiluppo_course) {
		return _suiluppo_course.compareTo(suiluppo_course);
	}

	@Override
	public int hashCode() {
		return _suiluppo_course.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.sample.model.suiluppo_course> toCacheModel() {
		return _suiluppo_course.toCacheModel();
	}

	@Override
	public com.liferay.sample.model.suiluppo_course toEscapedModel() {
		return new suiluppo_courseWrapper(_suiluppo_course.toEscapedModel());
	}

	@Override
	public com.liferay.sample.model.suiluppo_course toUnescapedModel() {
		return new suiluppo_courseWrapper(_suiluppo_course.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _suiluppo_course.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _suiluppo_course.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_suiluppo_course.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof suiluppo_courseWrapper)) {
			return false;
		}

		suiluppo_courseWrapper suiluppo_courseWrapper = (suiluppo_courseWrapper)obj;

		if (Validator.equals(_suiluppo_course,
					suiluppo_courseWrapper._suiluppo_course)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public suiluppo_course getWrappedsuiluppo_course() {
		return _suiluppo_course;
	}

	@Override
	public suiluppo_course getWrappedModel() {
		return _suiluppo_course;
	}

	@Override
	public void resetOriginalValues() {
		_suiluppo_course.resetOriginalValues();
	}

	private suiluppo_course _suiluppo_course;
}