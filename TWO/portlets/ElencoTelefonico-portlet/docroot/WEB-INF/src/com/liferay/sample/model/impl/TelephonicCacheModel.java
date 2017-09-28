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

package com.liferay.sample.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.sample.model.Telephonic;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Telephonic in entity cache.
 *
 * @author Administrator
 * @see Telephonic
 * @generated
 */
public class TelephonicCacheModel implements CacheModel<Telephonic>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{telephonicId=");
		sb.append(telephonicId);
		sb.append(", Tipo=");
		sb.append(Tipo);
		sb.append(", tipoSede=");
		sb.append(tipoSede);
		sb.append(", comuneSede=");
		sb.append(comuneSede);
		sb.append(", descrizioneSede=");
		sb.append(descrizioneSede);
		sb.append(", interno=");
		sb.append(interno);
		sb.append(", piano=");
		sb.append(piano);
		sb.append(", area=");
		sb.append(area);
		sb.append(", blocco=");
		sb.append(blocco);
		sb.append(", stanza=");
		sb.append(stanza);
		sb.append(", marca=");
		sb.append(marca);
		sb.append(", modello=");
		sb.append(modello);
		sb.append(", inventarioSN=");
		sb.append(inventarioSN);
		sb.append(", unitaOperativa=");
		sb.append(unitaOperativa);
		sb.append(", descrizione=");
		sb.append(descrizione);
		sb.append(", nome=");
		sb.append(nome);
		sb.append(", note=");
		sb.append(note);
		sb.append(", visibile=");
		sb.append(visibile);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Telephonic toEntityModel() {
		TelephonicImpl telephonicImpl = new TelephonicImpl();

		telephonicImpl.setTelephonicId(telephonicId);

		if (Tipo == null) {
			telephonicImpl.setTipo(StringPool.BLANK);
		}
		else {
			telephonicImpl.setTipo(Tipo);
		}

		if (tipoSede == null) {
			telephonicImpl.setTipoSede(StringPool.BLANK);
		}
		else {
			telephonicImpl.setTipoSede(tipoSede);
		}

		if (comuneSede == null) {
			telephonicImpl.setComuneSede(StringPool.BLANK);
		}
		else {
			telephonicImpl.setComuneSede(comuneSede);
		}

		if (descrizioneSede == null) {
			telephonicImpl.setDescrizioneSede(StringPool.BLANK);
		}
		else {
			telephonicImpl.setDescrizioneSede(descrizioneSede);
		}

		if (interno == null) {
			telephonicImpl.setInterno(StringPool.BLANK);
		}
		else {
			telephonicImpl.setInterno(interno);
		}

		if (piano == null) {
			telephonicImpl.setPiano(StringPool.BLANK);
		}
		else {
			telephonicImpl.setPiano(piano);
		}

		if (area == null) {
			telephonicImpl.setArea(StringPool.BLANK);
		}
		else {
			telephonicImpl.setArea(area);
		}

		if (blocco == null) {
			telephonicImpl.setBlocco(StringPool.BLANK);
		}
		else {
			telephonicImpl.setBlocco(blocco);
		}

		if (stanza == null) {
			telephonicImpl.setStanza(StringPool.BLANK);
		}
		else {
			telephonicImpl.setStanza(stanza);
		}

		if (marca == null) {
			telephonicImpl.setMarca(StringPool.BLANK);
		}
		else {
			telephonicImpl.setMarca(marca);
		}

		if (modello == null) {
			telephonicImpl.setModello(StringPool.BLANK);
		}
		else {
			telephonicImpl.setModello(modello);
		}

		if (inventarioSN == null) {
			telephonicImpl.setInventarioSN(StringPool.BLANK);
		}
		else {
			telephonicImpl.setInventarioSN(inventarioSN);
		}

		if (unitaOperativa == null) {
			telephonicImpl.setUnitaOperativa(StringPool.BLANK);
		}
		else {
			telephonicImpl.setUnitaOperativa(unitaOperativa);
		}

		if (descrizione == null) {
			telephonicImpl.setDescrizione(StringPool.BLANK);
		}
		else {
			telephonicImpl.setDescrizione(descrizione);
		}

		if (nome == null) {
			telephonicImpl.setNome(StringPool.BLANK);
		}
		else {
			telephonicImpl.setNome(nome);
		}

		if (note == null) {
			telephonicImpl.setNote(StringPool.BLANK);
		}
		else {
			telephonicImpl.setNote(note);
		}

		if (visibile == null) {
			telephonicImpl.setVisibile(StringPool.BLANK);
		}
		else {
			telephonicImpl.setVisibile(visibile);
		}

		telephonicImpl.resetOriginalValues();

		return telephonicImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		telephonicId = objectInput.readLong();
		Tipo = objectInput.readUTF();
		tipoSede = objectInput.readUTF();
		comuneSede = objectInput.readUTF();
		descrizioneSede = objectInput.readUTF();
		interno = objectInput.readUTF();
		piano = objectInput.readUTF();
		area = objectInput.readUTF();
		blocco = objectInput.readUTF();
		stanza = objectInput.readUTF();
		marca = objectInput.readUTF();
		modello = objectInput.readUTF();
		inventarioSN = objectInput.readUTF();
		unitaOperativa = objectInput.readUTF();
		descrizione = objectInput.readUTF();
		nome = objectInput.readUTF();
		note = objectInput.readUTF();
		visibile = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(telephonicId);

		if (Tipo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Tipo);
		}

		if (tipoSede == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tipoSede);
		}

		if (comuneSede == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(comuneSede);
		}

		if (descrizioneSede == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descrizioneSede);
		}

		if (interno == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(interno);
		}

		if (piano == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(piano);
		}

		if (area == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(area);
		}

		if (blocco == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(blocco);
		}

		if (stanza == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stanza);
		}

		if (marca == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(marca);
		}

		if (modello == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(modello);
		}

		if (inventarioSN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inventarioSN);
		}

		if (unitaOperativa == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitaOperativa);
		}

		if (descrizione == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descrizione);
		}

		if (nome == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nome);
		}

		if (note == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(note);
		}

		if (visibile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(visibile);
		}
	}

	public long telephonicId;
	public String Tipo;
	public String tipoSede;
	public String comuneSede;
	public String descrizioneSede;
	public String interno;
	public String piano;
	public String area;
	public String blocco;
	public String stanza;
	public String marca;
	public String modello;
	public String inventarioSN;
	public String unitaOperativa;
	public String descrizione;
	public String nome;
	public String note;
	public String visibile;
}