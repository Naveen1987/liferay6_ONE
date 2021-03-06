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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.liferay.sample.model.Telephonic;
import com.liferay.sample.model.TelephonicModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Telephonic service. Represents a row in the &quot;telephonic&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.sample.model.TelephonicModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TelephonicImpl}.
 * </p>
 *
 * @author Administrator
 * @see TelephonicImpl
 * @see com.liferay.sample.model.Telephonic
 * @see com.liferay.sample.model.TelephonicModel
 * @generated
 */
public class TelephonicModelImpl extends BaseModelImpl<Telephonic>
	implements TelephonicModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a telephonic model instance should use the {@link com.liferay.sample.model.Telephonic} interface instead.
	 */
	public static final String TABLE_NAME = "telephonic";
	public static final Object[][] TABLE_COLUMNS = {
			{ "telephonicId", Types.BIGINT },
			{ "Tipo", Types.VARCHAR },
			{ "tipoSede", Types.VARCHAR },
			{ "comuneSede", Types.VARCHAR },
			{ "descrizioneSede", Types.VARCHAR },
			{ "interno", Types.VARCHAR },
			{ "piano", Types.VARCHAR },
			{ "area", Types.VARCHAR },
			{ "blocco", Types.VARCHAR },
			{ "stanza", Types.VARCHAR },
			{ "marca", Types.VARCHAR },
			{ "modello", Types.VARCHAR },
			{ "inventarioSN", Types.VARCHAR },
			{ "unitaOperativa", Types.VARCHAR },
			{ "descrizione", Types.VARCHAR },
			{ "nome", Types.VARCHAR },
			{ "note", Types.VARCHAR },
			{ "visibile", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table telephonic (telephonicId LONG not null primary key,Tipo VARCHAR(75) null,tipoSede VARCHAR(75) null,comuneSede VARCHAR(75) null,descrizioneSede VARCHAR(75) null,interno VARCHAR(75) null,piano VARCHAR(75) null,area VARCHAR(75) null,blocco VARCHAR(75) null,stanza VARCHAR(75) null,marca VARCHAR(75) null,modello VARCHAR(75) null,inventarioSN VARCHAR(75) null,unitaOperativa VARCHAR(75) null,descrizione VARCHAR(75) null,nome VARCHAR(75) null,note VARCHAR(75) null,visibile VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table telephonic";
	public static final String ORDER_BY_JPQL = " ORDER BY telephonic.telephonicId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY telephonic.telephonicId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.sample.model.Telephonic"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.sample.model.Telephonic"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.sample.model.Telephonic"));

	public TelephonicModelImpl() {
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

	@Override
	public long getTelephonicId() {
		return _telephonicId;
	}

	@Override
	public void setTelephonicId(long telephonicId) {
		_telephonicId = telephonicId;
	}

	@Override
	public String getTipo() {
		if (_Tipo == null) {
			return StringPool.BLANK;
		}
		else {
			return _Tipo;
		}
	}

	@Override
	public void setTipo(String Tipo) {
		_Tipo = Tipo;
	}

	@Override
	public String getTipoSede() {
		if (_tipoSede == null) {
			return StringPool.BLANK;
		}
		else {
			return _tipoSede;
		}
	}

	@Override
	public void setTipoSede(String tipoSede) {
		_tipoSede = tipoSede;
	}

	@Override
	public String getComuneSede() {
		if (_comuneSede == null) {
			return StringPool.BLANK;
		}
		else {
			return _comuneSede;
		}
	}

	@Override
	public void setComuneSede(String comuneSede) {
		_comuneSede = comuneSede;
	}

	@Override
	public String getDescrizioneSede() {
		if (_descrizioneSede == null) {
			return StringPool.BLANK;
		}
		else {
			return _descrizioneSede;
		}
	}

	@Override
	public void setDescrizioneSede(String descrizioneSede) {
		_descrizioneSede = descrizioneSede;
	}

	@Override
	public String getInterno() {
		if (_interno == null) {
			return StringPool.BLANK;
		}
		else {
			return _interno;
		}
	}

	@Override
	public void setInterno(String interno) {
		_interno = interno;
	}

	@Override
	public String getPiano() {
		if (_piano == null) {
			return StringPool.BLANK;
		}
		else {
			return _piano;
		}
	}

	@Override
	public void setPiano(String piano) {
		_piano = piano;
	}

	@Override
	public String getArea() {
		if (_area == null) {
			return StringPool.BLANK;
		}
		else {
			return _area;
		}
	}

	@Override
	public void setArea(String area) {
		_area = area;
	}

	@Override
	public String getBlocco() {
		if (_blocco == null) {
			return StringPool.BLANK;
		}
		else {
			return _blocco;
		}
	}

	@Override
	public void setBlocco(String blocco) {
		_blocco = blocco;
	}

	@Override
	public String getStanza() {
		if (_stanza == null) {
			return StringPool.BLANK;
		}
		else {
			return _stanza;
		}
	}

	@Override
	public void setStanza(String stanza) {
		_stanza = stanza;
	}

	@Override
	public String getMarca() {
		if (_marca == null) {
			return StringPool.BLANK;
		}
		else {
			return _marca;
		}
	}

	@Override
	public void setMarca(String marca) {
		_marca = marca;
	}

	@Override
	public String getModello() {
		if (_modello == null) {
			return StringPool.BLANK;
		}
		else {
			return _modello;
		}
	}

	@Override
	public void setModello(String modello) {
		_modello = modello;
	}

	@Override
	public String getInventarioSN() {
		if (_inventarioSN == null) {
			return StringPool.BLANK;
		}
		else {
			return _inventarioSN;
		}
	}

	@Override
	public void setInventarioSN(String inventarioSN) {
		_inventarioSN = inventarioSN;
	}

	@Override
	public String getUnitaOperativa() {
		if (_unitaOperativa == null) {
			return StringPool.BLANK;
		}
		else {
			return _unitaOperativa;
		}
	}

	@Override
	public void setUnitaOperativa(String unitaOperativa) {
		_unitaOperativa = unitaOperativa;
	}

	@Override
	public String getDescrizione() {
		if (_descrizione == null) {
			return StringPool.BLANK;
		}
		else {
			return _descrizione;
		}
	}

	@Override
	public void setDescrizione(String descrizione) {
		_descrizione = descrizione;
	}

	@Override
	public String getNome() {
		if (_nome == null) {
			return StringPool.BLANK;
		}
		else {
			return _nome;
		}
	}

	@Override
	public void setNome(String nome) {
		_nome = nome;
	}

	@Override
	public String getNote() {
		if (_note == null) {
			return StringPool.BLANK;
		}
		else {
			return _note;
		}
	}

	@Override
	public void setNote(String note) {
		_note = note;
	}

	@Override
	public String getVisibile() {
		if (_visibile == null) {
			return StringPool.BLANK;
		}
		else {
			return _visibile;
		}
	}

	@Override
	public void setVisibile(String visibile) {
		_visibile = visibile;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Telephonic.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Telephonic toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Telephonic)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TelephonicImpl telephonicImpl = new TelephonicImpl();

		telephonicImpl.setTelephonicId(getTelephonicId());
		telephonicImpl.setTipo(getTipo());
		telephonicImpl.setTipoSede(getTipoSede());
		telephonicImpl.setComuneSede(getComuneSede());
		telephonicImpl.setDescrizioneSede(getDescrizioneSede());
		telephonicImpl.setInterno(getInterno());
		telephonicImpl.setPiano(getPiano());
		telephonicImpl.setArea(getArea());
		telephonicImpl.setBlocco(getBlocco());
		telephonicImpl.setStanza(getStanza());
		telephonicImpl.setMarca(getMarca());
		telephonicImpl.setModello(getModello());
		telephonicImpl.setInventarioSN(getInventarioSN());
		telephonicImpl.setUnitaOperativa(getUnitaOperativa());
		telephonicImpl.setDescrizione(getDescrizione());
		telephonicImpl.setNome(getNome());
		telephonicImpl.setNote(getNote());
		telephonicImpl.setVisibile(getVisibile());

		telephonicImpl.resetOriginalValues();

		return telephonicImpl;
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

		if (!(obj instanceof Telephonic)) {
			return false;
		}

		Telephonic telephonic = (Telephonic)obj;

		long primaryKey = telephonic.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Telephonic> toCacheModel() {
		TelephonicCacheModel telephonicCacheModel = new TelephonicCacheModel();

		telephonicCacheModel.telephonicId = getTelephonicId();

		telephonicCacheModel.Tipo = getTipo();

		String Tipo = telephonicCacheModel.Tipo;

		if ((Tipo != null) && (Tipo.length() == 0)) {
			telephonicCacheModel.Tipo = null;
		}

		telephonicCacheModel.tipoSede = getTipoSede();

		String tipoSede = telephonicCacheModel.tipoSede;

		if ((tipoSede != null) && (tipoSede.length() == 0)) {
			telephonicCacheModel.tipoSede = null;
		}

		telephonicCacheModel.comuneSede = getComuneSede();

		String comuneSede = telephonicCacheModel.comuneSede;

		if ((comuneSede != null) && (comuneSede.length() == 0)) {
			telephonicCacheModel.comuneSede = null;
		}

		telephonicCacheModel.descrizioneSede = getDescrizioneSede();

		String descrizioneSede = telephonicCacheModel.descrizioneSede;

		if ((descrizioneSede != null) && (descrizioneSede.length() == 0)) {
			telephonicCacheModel.descrizioneSede = null;
		}

		telephonicCacheModel.interno = getInterno();

		String interno = telephonicCacheModel.interno;

		if ((interno != null) && (interno.length() == 0)) {
			telephonicCacheModel.interno = null;
		}

		telephonicCacheModel.piano = getPiano();

		String piano = telephonicCacheModel.piano;

		if ((piano != null) && (piano.length() == 0)) {
			telephonicCacheModel.piano = null;
		}

		telephonicCacheModel.area = getArea();

		String area = telephonicCacheModel.area;

		if ((area != null) && (area.length() == 0)) {
			telephonicCacheModel.area = null;
		}

		telephonicCacheModel.blocco = getBlocco();

		String blocco = telephonicCacheModel.blocco;

		if ((blocco != null) && (blocco.length() == 0)) {
			telephonicCacheModel.blocco = null;
		}

		telephonicCacheModel.stanza = getStanza();

		String stanza = telephonicCacheModel.stanza;

		if ((stanza != null) && (stanza.length() == 0)) {
			telephonicCacheModel.stanza = null;
		}

		telephonicCacheModel.marca = getMarca();

		String marca = telephonicCacheModel.marca;

		if ((marca != null) && (marca.length() == 0)) {
			telephonicCacheModel.marca = null;
		}

		telephonicCacheModel.modello = getModello();

		String modello = telephonicCacheModel.modello;

		if ((modello != null) && (modello.length() == 0)) {
			telephonicCacheModel.modello = null;
		}

		telephonicCacheModel.inventarioSN = getInventarioSN();

		String inventarioSN = telephonicCacheModel.inventarioSN;

		if ((inventarioSN != null) && (inventarioSN.length() == 0)) {
			telephonicCacheModel.inventarioSN = null;
		}

		telephonicCacheModel.unitaOperativa = getUnitaOperativa();

		String unitaOperativa = telephonicCacheModel.unitaOperativa;

		if ((unitaOperativa != null) && (unitaOperativa.length() == 0)) {
			telephonicCacheModel.unitaOperativa = null;
		}

		telephonicCacheModel.descrizione = getDescrizione();

		String descrizione = telephonicCacheModel.descrizione;

		if ((descrizione != null) && (descrizione.length() == 0)) {
			telephonicCacheModel.descrizione = null;
		}

		telephonicCacheModel.nome = getNome();

		String nome = telephonicCacheModel.nome;

		if ((nome != null) && (nome.length() == 0)) {
			telephonicCacheModel.nome = null;
		}

		telephonicCacheModel.note = getNote();

		String note = telephonicCacheModel.note;

		if ((note != null) && (note.length() == 0)) {
			telephonicCacheModel.note = null;
		}

		telephonicCacheModel.visibile = getVisibile();

		String visibile = telephonicCacheModel.visibile;

		if ((visibile != null) && (visibile.length() == 0)) {
			telephonicCacheModel.visibile = null;
		}

		return telephonicCacheModel;
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

	private static ClassLoader _classLoader = Telephonic.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Telephonic.class
		};
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
	private Telephonic _escapedModel;
}