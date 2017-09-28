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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Administrator
 * @generated
 */
public class TelephonicSoap implements Serializable {
	public static TelephonicSoap toSoapModel(Telephonic model) {
		TelephonicSoap soapModel = new TelephonicSoap();

		soapModel.setTelephonicId(model.getTelephonicId());
		soapModel.setTipo(model.getTipo());
		soapModel.setTipoSede(model.getTipoSede());
		soapModel.setComuneSede(model.getComuneSede());
		soapModel.setDescrizioneSede(model.getDescrizioneSede());
		soapModel.setInterno(model.getInterno());
		soapModel.setPiano(model.getPiano());
		soapModel.setArea(model.getArea());
		soapModel.setBlocco(model.getBlocco());
		soapModel.setStanza(model.getStanza());
		soapModel.setMarca(model.getMarca());
		soapModel.setModello(model.getModello());
		soapModel.setInventarioSN(model.getInventarioSN());
		soapModel.setUnitaOperativa(model.getUnitaOperativa());
		soapModel.setDescrizione(model.getDescrizione());
		soapModel.setNome(model.getNome());
		soapModel.setNote(model.getNote());
		soapModel.setVisibile(model.getVisibile());

		return soapModel;
	}

	public static TelephonicSoap[] toSoapModels(Telephonic[] models) {
		TelephonicSoap[] soapModels = new TelephonicSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TelephonicSoap[][] toSoapModels(Telephonic[][] models) {
		TelephonicSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TelephonicSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TelephonicSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TelephonicSoap[] toSoapModels(List<Telephonic> models) {
		List<TelephonicSoap> soapModels = new ArrayList<TelephonicSoap>(models.size());

		for (Telephonic model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TelephonicSoap[soapModels.size()]);
	}

	public TelephonicSoap() {
	}

	public long getPrimaryKey() {
		return _telephonicId;
	}

	public void setPrimaryKey(long pk) {
		setTelephonicId(pk);
	}

	public long getTelephonicId() {
		return _telephonicId;
	}

	public void setTelephonicId(long telephonicId) {
		_telephonicId = telephonicId;
	}

	public String getTipo() {
		return _Tipo;
	}

	public void setTipo(String Tipo) {
		_Tipo = Tipo;
	}

	public String getTipoSede() {
		return _tipoSede;
	}

	public void setTipoSede(String tipoSede) {
		_tipoSede = tipoSede;
	}

	public String getComuneSede() {
		return _comuneSede;
	}

	public void setComuneSede(String comuneSede) {
		_comuneSede = comuneSede;
	}

	public String getDescrizioneSede() {
		return _descrizioneSede;
	}

	public void setDescrizioneSede(String descrizioneSede) {
		_descrizioneSede = descrizioneSede;
	}

	public String getInterno() {
		return _interno;
	}

	public void setInterno(String interno) {
		_interno = interno;
	}

	public String getPiano() {
		return _piano;
	}

	public void setPiano(String piano) {
		_piano = piano;
	}

	public String getArea() {
		return _area;
	}

	public void setArea(String area) {
		_area = area;
	}

	public String getBlocco() {
		return _blocco;
	}

	public void setBlocco(String blocco) {
		_blocco = blocco;
	}

	public String getStanza() {
		return _stanza;
	}

	public void setStanza(String stanza) {
		_stanza = stanza;
	}

	public String getMarca() {
		return _marca;
	}

	public void setMarca(String marca) {
		_marca = marca;
	}

	public String getModello() {
		return _modello;
	}

	public void setModello(String modello) {
		_modello = modello;
	}

	public String getInventarioSN() {
		return _inventarioSN;
	}

	public void setInventarioSN(String inventarioSN) {
		_inventarioSN = inventarioSN;
	}

	public String getUnitaOperativa() {
		return _unitaOperativa;
	}

	public void setUnitaOperativa(String unitaOperativa) {
		_unitaOperativa = unitaOperativa;
	}

	public String getDescrizione() {
		return _descrizione;
	}

	public void setDescrizione(String descrizione) {
		_descrizione = descrizione;
	}

	public String getNome() {
		return _nome;
	}

	public void setNome(String nome) {
		_nome = nome;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
	}

	public String getVisibile() {
		return _visibile;
	}

	public void setVisibile(String visibile) {
		_visibile = visibile;
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
}