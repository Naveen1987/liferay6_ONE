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

import com.liferay.sample.model.Equipment;
import com.liferay.sample.model.EquipmentModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Equipment service. Represents a row in the &quot;equipment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.sample.model.EquipmentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EquipmentImpl}.
 * </p>
 *
 * @author Naveen Kumar
 * @see EquipmentImpl
 * @see com.liferay.sample.model.Equipment
 * @see com.liferay.sample.model.EquipmentModel
 * @generated
 */
public class EquipmentModelImpl extends BaseModelImpl<Equipment>
	implements EquipmentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a equipment model instance should use the {@link com.liferay.sample.model.Equipment} interface instead.
	 */
	public static final String TABLE_NAME = "equipment";
	public static final Object[][] TABLE_COLUMNS = {
			{ "equip_id", Types.BIGINT },
			{ "equipment_name", Types.VARCHAR },
			{ "equip_quantity", Types.INTEGER },
			{ "equip_description", Types.VARCHAR },
			{ "equip_status", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table equipment (equip_id LONG not null primary key,equipment_name VARCHAR(75) null,equip_quantity INTEGER,equip_description VARCHAR(75) null,equip_status BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table equipment";
	public static final String ORDER_BY_JPQL = " ORDER BY equipment.equip_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY equipment.equip_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.sample.model.Equipment"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.sample.model.Equipment"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.sample.model.Equipment"));

	public EquipmentModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _equip_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEquip_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _equip_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Equipment.class;
	}

	@Override
	public String getModelClassName() {
		return Equipment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("equip_id", getEquip_id());
		attributes.put("equipment_name", getEquipment_name());
		attributes.put("equip_quantity", getEquip_quantity());
		attributes.put("equip_description", getEquip_description());
		attributes.put("equip_status", getEquip_status());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long equip_id = (Long)attributes.get("equip_id");

		if (equip_id != null) {
			setEquip_id(equip_id);
		}

		String equipment_name = (String)attributes.get("equipment_name");

		if (equipment_name != null) {
			setEquipment_name(equipment_name);
		}

		Integer equip_quantity = (Integer)attributes.get("equip_quantity");

		if (equip_quantity != null) {
			setEquip_quantity(equip_quantity);
		}

		String equip_description = (String)attributes.get("equip_description");

		if (equip_description != null) {
			setEquip_description(equip_description);
		}

		Boolean equip_status = (Boolean)attributes.get("equip_status");

		if (equip_status != null) {
			setEquip_status(equip_status);
		}
	}

	@Override
	public long getEquip_id() {
		return _equip_id;
	}

	@Override
	public void setEquip_id(long equip_id) {
		_equip_id = equip_id;
	}

	@Override
	public String getEquipment_name() {
		if (_equipment_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _equipment_name;
		}
	}

	@Override
	public void setEquipment_name(String equipment_name) {
		_equipment_name = equipment_name;
	}

	@Override
	public int getEquip_quantity() {
		return _equip_quantity;
	}

	@Override
	public void setEquip_quantity(int equip_quantity) {
		_equip_quantity = equip_quantity;
	}

	@Override
	public String getEquip_description() {
		if (_equip_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _equip_description;
		}
	}

	@Override
	public void setEquip_description(String equip_description) {
		_equip_description = equip_description;
	}

	@Override
	public boolean getEquip_status() {
		return _equip_status;
	}

	@Override
	public boolean isEquip_status() {
		return _equip_status;
	}

	@Override
	public void setEquip_status(boolean equip_status) {
		_equip_status = equip_status;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Equipment.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Equipment toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Equipment)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EquipmentImpl equipmentImpl = new EquipmentImpl();

		equipmentImpl.setEquip_id(getEquip_id());
		equipmentImpl.setEquipment_name(getEquipment_name());
		equipmentImpl.setEquip_quantity(getEquip_quantity());
		equipmentImpl.setEquip_description(getEquip_description());
		equipmentImpl.setEquip_status(getEquip_status());

		equipmentImpl.resetOriginalValues();

		return equipmentImpl;
	}

	@Override
	public int compareTo(Equipment equipment) {
		long primaryKey = equipment.getPrimaryKey();

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

		if (!(obj instanceof Equipment)) {
			return false;
		}

		Equipment equipment = (Equipment)obj;

		long primaryKey = equipment.getPrimaryKey();

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
	public CacheModel<Equipment> toCacheModel() {
		EquipmentCacheModel equipmentCacheModel = new EquipmentCacheModel();

		equipmentCacheModel.equip_id = getEquip_id();

		equipmentCacheModel.equipment_name = getEquipment_name();

		String equipment_name = equipmentCacheModel.equipment_name;

		if ((equipment_name != null) && (equipment_name.length() == 0)) {
			equipmentCacheModel.equipment_name = null;
		}

		equipmentCacheModel.equip_quantity = getEquip_quantity();

		equipmentCacheModel.equip_description = getEquip_description();

		String equip_description = equipmentCacheModel.equip_description;

		if ((equip_description != null) && (equip_description.length() == 0)) {
			equipmentCacheModel.equip_description = null;
		}

		equipmentCacheModel.equip_status = getEquip_status();

		return equipmentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{equip_id=");
		sb.append(getEquip_id());
		sb.append(", equipment_name=");
		sb.append(getEquipment_name());
		sb.append(", equip_quantity=");
		sb.append(getEquip_quantity());
		sb.append(", equip_description=");
		sb.append(getEquip_description());
		sb.append(", equip_status=");
		sb.append(getEquip_status());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.liferay.sample.model.Equipment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>equip_id</column-name><column-value><![CDATA[");
		sb.append(getEquip_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>equipment_name</column-name><column-value><![CDATA[");
		sb.append(getEquipment_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>equip_quantity</column-name><column-value><![CDATA[");
		sb.append(getEquip_quantity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>equip_description</column-name><column-value><![CDATA[");
		sb.append(getEquip_description());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>equip_status</column-name><column-value><![CDATA[");
		sb.append(getEquip_status());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Equipment.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Equipment.class
		};
	private long _equip_id;
	private String _equipment_name;
	private int _equip_quantity;
	private String _equip_description;
	private boolean _equip_status;
	private Equipment _escapedModel;
}