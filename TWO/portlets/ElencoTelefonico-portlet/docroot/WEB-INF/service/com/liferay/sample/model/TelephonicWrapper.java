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
 * This class is a wrapper for {@link Telephonic}.
 * </p>
 *
 * @author Administrator
 * @see Telephonic
 * @generated
 */
public class TelephonicWrapper implements Telephonic, ModelWrapper<Telephonic> {
	public TelephonicWrapper(Telephonic telephonic) {
		_telephonic = telephonic;
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

	/**
	* Returns the primary key of this telephonic.
	*
	* @return the primary key of this telephonic
	*/
	@Override
	public long getPrimaryKey() {
		return _telephonic.getPrimaryKey();
	}

	/**
	* Sets the primary key of this telephonic.
	*
	* @param primaryKey the primary key of this telephonic
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_telephonic.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the telephonic ID of this telephonic.
	*
	* @return the telephonic ID of this telephonic
	*/
	@Override
	public long getTelephonicId() {
		return _telephonic.getTelephonicId();
	}

	/**
	* Sets the telephonic ID of this telephonic.
	*
	* @param telephonicId the telephonic ID of this telephonic
	*/
	@Override
	public void setTelephonicId(long telephonicId) {
		_telephonic.setTelephonicId(telephonicId);
	}

	/**
	* Returns the tipo of this telephonic.
	*
	* @return the tipo of this telephonic
	*/
	@Override
	public java.lang.String getTipo() {
		return _telephonic.getTipo();
	}

	/**
	* Sets the tipo of this telephonic.
	*
	* @param Tipo the tipo of this telephonic
	*/
	@Override
	public void setTipo(java.lang.String Tipo) {
		_telephonic.setTipo(Tipo);
	}

	/**
	* Returns the tipo sede of this telephonic.
	*
	* @return the tipo sede of this telephonic
	*/
	@Override
	public java.lang.String getTipoSede() {
		return _telephonic.getTipoSede();
	}

	/**
	* Sets the tipo sede of this telephonic.
	*
	* @param tipoSede the tipo sede of this telephonic
	*/
	@Override
	public void setTipoSede(java.lang.String tipoSede) {
		_telephonic.setTipoSede(tipoSede);
	}

	/**
	* Returns the comune sede of this telephonic.
	*
	* @return the comune sede of this telephonic
	*/
	@Override
	public java.lang.String getComuneSede() {
		return _telephonic.getComuneSede();
	}

	/**
	* Sets the comune sede of this telephonic.
	*
	* @param comuneSede the comune sede of this telephonic
	*/
	@Override
	public void setComuneSede(java.lang.String comuneSede) {
		_telephonic.setComuneSede(comuneSede);
	}

	/**
	* Returns the descrizione sede of this telephonic.
	*
	* @return the descrizione sede of this telephonic
	*/
	@Override
	public java.lang.String getDescrizioneSede() {
		return _telephonic.getDescrizioneSede();
	}

	/**
	* Sets the descrizione sede of this telephonic.
	*
	* @param descrizioneSede the descrizione sede of this telephonic
	*/
	@Override
	public void setDescrizioneSede(java.lang.String descrizioneSede) {
		_telephonic.setDescrizioneSede(descrizioneSede);
	}

	/**
	* Returns the interno of this telephonic.
	*
	* @return the interno of this telephonic
	*/
	@Override
	public java.lang.String getInterno() {
		return _telephonic.getInterno();
	}

	/**
	* Sets the interno of this telephonic.
	*
	* @param interno the interno of this telephonic
	*/
	@Override
	public void setInterno(java.lang.String interno) {
		_telephonic.setInterno(interno);
	}

	/**
	* Returns the piano of this telephonic.
	*
	* @return the piano of this telephonic
	*/
	@Override
	public java.lang.String getPiano() {
		return _telephonic.getPiano();
	}

	/**
	* Sets the piano of this telephonic.
	*
	* @param piano the piano of this telephonic
	*/
	@Override
	public void setPiano(java.lang.String piano) {
		_telephonic.setPiano(piano);
	}

	/**
	* Returns the area of this telephonic.
	*
	* @return the area of this telephonic
	*/
	@Override
	public java.lang.String getArea() {
		return _telephonic.getArea();
	}

	/**
	* Sets the area of this telephonic.
	*
	* @param area the area of this telephonic
	*/
	@Override
	public void setArea(java.lang.String area) {
		_telephonic.setArea(area);
	}

	/**
	* Returns the blocco of this telephonic.
	*
	* @return the blocco of this telephonic
	*/
	@Override
	public java.lang.String getBlocco() {
		return _telephonic.getBlocco();
	}

	/**
	* Sets the blocco of this telephonic.
	*
	* @param blocco the blocco of this telephonic
	*/
	@Override
	public void setBlocco(java.lang.String blocco) {
		_telephonic.setBlocco(blocco);
	}

	/**
	* Returns the stanza of this telephonic.
	*
	* @return the stanza of this telephonic
	*/
	@Override
	public java.lang.String getStanza() {
		return _telephonic.getStanza();
	}

	/**
	* Sets the stanza of this telephonic.
	*
	* @param stanza the stanza of this telephonic
	*/
	@Override
	public void setStanza(java.lang.String stanza) {
		_telephonic.setStanza(stanza);
	}

	/**
	* Returns the marca of this telephonic.
	*
	* @return the marca of this telephonic
	*/
	@Override
	public java.lang.String getMarca() {
		return _telephonic.getMarca();
	}

	/**
	* Sets the marca of this telephonic.
	*
	* @param marca the marca of this telephonic
	*/
	@Override
	public void setMarca(java.lang.String marca) {
		_telephonic.setMarca(marca);
	}

	/**
	* Returns the modello of this telephonic.
	*
	* @return the modello of this telephonic
	*/
	@Override
	public java.lang.String getModello() {
		return _telephonic.getModello();
	}

	/**
	* Sets the modello of this telephonic.
	*
	* @param modello the modello of this telephonic
	*/
	@Override
	public void setModello(java.lang.String modello) {
		_telephonic.setModello(modello);
	}

	/**
	* Returns the inventario s n of this telephonic.
	*
	* @return the inventario s n of this telephonic
	*/
	@Override
	public java.lang.String getInventarioSN() {
		return _telephonic.getInventarioSN();
	}

	/**
	* Sets the inventario s n of this telephonic.
	*
	* @param inventarioSN the inventario s n of this telephonic
	*/
	@Override
	public void setInventarioSN(java.lang.String inventarioSN) {
		_telephonic.setInventarioSN(inventarioSN);
	}

	/**
	* Returns the unita operativa of this telephonic.
	*
	* @return the unita operativa of this telephonic
	*/
	@Override
	public java.lang.String getUnitaOperativa() {
		return _telephonic.getUnitaOperativa();
	}

	/**
	* Sets the unita operativa of this telephonic.
	*
	* @param unitaOperativa the unita operativa of this telephonic
	*/
	@Override
	public void setUnitaOperativa(java.lang.String unitaOperativa) {
		_telephonic.setUnitaOperativa(unitaOperativa);
	}

	/**
	* Returns the descrizione of this telephonic.
	*
	* @return the descrizione of this telephonic
	*/
	@Override
	public java.lang.String getDescrizione() {
		return _telephonic.getDescrizione();
	}

	/**
	* Sets the descrizione of this telephonic.
	*
	* @param descrizione the descrizione of this telephonic
	*/
	@Override
	public void setDescrizione(java.lang.String descrizione) {
		_telephonic.setDescrizione(descrizione);
	}

	/**
	* Returns the nome of this telephonic.
	*
	* @return the nome of this telephonic
	*/
	@Override
	public java.lang.String getNome() {
		return _telephonic.getNome();
	}

	/**
	* Sets the nome of this telephonic.
	*
	* @param nome the nome of this telephonic
	*/
	@Override
	public void setNome(java.lang.String nome) {
		_telephonic.setNome(nome);
	}

	/**
	* Returns the note of this telephonic.
	*
	* @return the note of this telephonic
	*/
	@Override
	public java.lang.String getNote() {
		return _telephonic.getNote();
	}

	/**
	* Sets the note of this telephonic.
	*
	* @param note the note of this telephonic
	*/
	@Override
	public void setNote(java.lang.String note) {
		_telephonic.setNote(note);
	}

	/**
	* Returns the visibile of this telephonic.
	*
	* @return the visibile of this telephonic
	*/
	@Override
	public java.lang.String getVisibile() {
		return _telephonic.getVisibile();
	}

	/**
	* Sets the visibile of this telephonic.
	*
	* @param visibile the visibile of this telephonic
	*/
	@Override
	public void setVisibile(java.lang.String visibile) {
		_telephonic.setVisibile(visibile);
	}

	@Override
	public boolean isNew() {
		return _telephonic.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_telephonic.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _telephonic.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_telephonic.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _telephonic.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _telephonic.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_telephonic.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _telephonic.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_telephonic.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_telephonic.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_telephonic.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TelephonicWrapper((Telephonic)_telephonic.clone());
	}

	@Override
	public int compareTo(com.liferay.sample.model.Telephonic telephonic) {
		return _telephonic.compareTo(telephonic);
	}

	@Override
	public int hashCode() {
		return _telephonic.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.sample.model.Telephonic> toCacheModel() {
		return _telephonic.toCacheModel();
	}

	@Override
	public com.liferay.sample.model.Telephonic toEscapedModel() {
		return new TelephonicWrapper(_telephonic.toEscapedModel());
	}

	@Override
	public com.liferay.sample.model.Telephonic toUnescapedModel() {
		return new TelephonicWrapper(_telephonic.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _telephonic.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _telephonic.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_telephonic.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TelephonicWrapper)) {
			return false;
		}

		TelephonicWrapper telephonicWrapper = (TelephonicWrapper)obj;

		if (Validator.equals(_telephonic, telephonicWrapper._telephonic)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Telephonic getWrappedTelephonic() {
		return _telephonic;
	}

	@Override
	public Telephonic getWrappedModel() {
		return _telephonic;
	}

	@Override
	public void resetOriginalValues() {
		_telephonic.resetOriginalValues();
	}

	private Telephonic _telephonic;
}