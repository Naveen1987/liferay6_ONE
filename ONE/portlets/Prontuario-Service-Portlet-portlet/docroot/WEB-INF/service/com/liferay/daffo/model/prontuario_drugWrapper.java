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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link prontuario_drug}.
 * </p>
 *
 * @author Naveen
 * @see prontuario_drug
 * @generated
 */
public class prontuario_drugWrapper implements prontuario_drug,
	ModelWrapper<prontuario_drug> {
	public prontuario_drugWrapper(prontuario_drug prontuario_drug) {
		_prontuario_drug = prontuario_drug;
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

	/**
	* Returns the primary key of this prontuario_drug.
	*
	* @return the primary key of this prontuario_drug
	*/
	@Override
	public long getPrimaryKey() {
		return _prontuario_drug.getPrimaryKey();
	}

	/**
	* Sets the primary key of this prontuario_drug.
	*
	* @param primaryKey the primary key of this prontuario_drug
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_prontuario_drug.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the drug_id of this prontuario_drug.
	*
	* @return the drug_id of this prontuario_drug
	*/
	@Override
	public long getDrug_id() {
		return _prontuario_drug.getDrug_id();
	}

	/**
	* Sets the drug_id of this prontuario_drug.
	*
	* @param drug_id the drug_id of this prontuario_drug
	*/
	@Override
	public void setDrug_id(long drug_id) {
		_prontuario_drug.setDrug_id(drug_id);
	}

	/**
	* Returns the gruppo of this prontuario_drug.
	*
	* @return the gruppo of this prontuario_drug
	*/
	@Override
	public java.lang.String getGruppo() {
		return _prontuario_drug.getGruppo();
	}

	/**
	* Sets the gruppo of this prontuario_drug.
	*
	* @param Gruppo the gruppo of this prontuario_drug
	*/
	@Override
	public void setGruppo(java.lang.String Gruppo) {
		_prontuario_drug.setGruppo(Gruppo);
	}

	/**
	* Returns the sotto gruppo of this prontuario_drug.
	*
	* @return the sotto gruppo of this prontuario_drug
	*/
	@Override
	public java.lang.String getSottoGruppo() {
		return _prontuario_drug.getSottoGruppo();
	}

	/**
	* Sets the sotto gruppo of this prontuario_drug.
	*
	* @param SottoGruppo the sotto gruppo of this prontuario_drug
	*/
	@Override
	public void setSottoGruppo(java.lang.String SottoGruppo) {
		_prontuario_drug.setSottoGruppo(SottoGruppo);
	}

	/**
	* Returns the codice of this prontuario_drug.
	*
	* @return the codice of this prontuario_drug
	*/
	@Override
	public java.lang.String getCodice() {
		return _prontuario_drug.getCodice();
	}

	/**
	* Sets the codice of this prontuario_drug.
	*
	* @param Codice the codice of this prontuario_drug
	*/
	@Override
	public void setCodice(java.lang.String Codice) {
		_prontuario_drug.setCodice(Codice);
	}

	/**
	* Returns the principio_ attivo of this prontuario_drug.
	*
	* @return the principio_ attivo of this prontuario_drug
	*/
	@Override
	public java.lang.String getPrincipio_Attivo() {
		return _prontuario_drug.getPrincipio_Attivo();
	}

	/**
	* Sets the principio_ attivo of this prontuario_drug.
	*
	* @param Principio_Attivo the principio_ attivo of this prontuario_drug
	*/
	@Override
	public void setPrincipio_Attivo(java.lang.String Principio_Attivo) {
		_prontuario_drug.setPrincipio_Attivo(Principio_Attivo);
	}

	/**
	* Returns the nome_ commerciale of this prontuario_drug.
	*
	* @return the nome_ commerciale of this prontuario_drug
	*/
	@Override
	public java.lang.String getNome_Commerciale() {
		return _prontuario_drug.getNome_Commerciale();
	}

	/**
	* Sets the nome_ commerciale of this prontuario_drug.
	*
	* @param Nome_Commerciale the nome_ commerciale of this prontuario_drug
	*/
	@Override
	public void setNome_Commerciale(java.lang.String Nome_Commerciale) {
		_prontuario_drug.setNome_Commerciale(Nome_Commerciale);
	}

	@Override
	public boolean isNew() {
		return _prontuario_drug.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_prontuario_drug.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _prontuario_drug.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_prontuario_drug.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _prontuario_drug.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _prontuario_drug.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_prontuario_drug.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _prontuario_drug.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_prontuario_drug.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_prontuario_drug.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_prontuario_drug.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new prontuario_drugWrapper((prontuario_drug)_prontuario_drug.clone());
	}

	@Override
	public int compareTo(
		com.liferay.daffo.model.prontuario_drug prontuario_drug) {
		return _prontuario_drug.compareTo(prontuario_drug);
	}

	@Override
	public int hashCode() {
		return _prontuario_drug.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.daffo.model.prontuario_drug> toCacheModel() {
		return _prontuario_drug.toCacheModel();
	}

	@Override
	public com.liferay.daffo.model.prontuario_drug toEscapedModel() {
		return new prontuario_drugWrapper(_prontuario_drug.toEscapedModel());
	}

	@Override
	public com.liferay.daffo.model.prontuario_drug toUnescapedModel() {
		return new prontuario_drugWrapper(_prontuario_drug.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _prontuario_drug.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _prontuario_drug.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_prontuario_drug.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof prontuario_drugWrapper)) {
			return false;
		}

		prontuario_drugWrapper prontuario_drugWrapper = (prontuario_drugWrapper)obj;

		if (Validator.equals(_prontuario_drug,
					prontuario_drugWrapper._prontuario_drug)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public prontuario_drug getWrappedprontuario_drug() {
		return _prontuario_drug;
	}

	@Override
	public prontuario_drug getWrappedModel() {
		return _prontuario_drug;
	}

	@Override
	public void resetOriginalValues() {
		_prontuario_drug.resetOriginalValues();
	}

	private prontuario_drug _prontuario_drug;
}