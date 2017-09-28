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
import com.liferay.sample.service.EquipmentLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Naveen Kumar
 */
public class EquipmentClp extends BaseModelImpl<Equipment> implements Equipment {
	public EquipmentClp() {
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

		if (_equipmentRemoteModel != null) {
			try {
				Class<?> clazz = _equipmentRemoteModel.getClass();

				Method method = clazz.getMethod("setEquip_id", long.class);

				method.invoke(_equipmentRemoteModel, equip_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEquipment_name() {
		return _equipment_name;
	}

	@Override
	public void setEquipment_name(String equipment_name) {
		_equipment_name = equipment_name;

		if (_equipmentRemoteModel != null) {
			try {
				Class<?> clazz = _equipmentRemoteModel.getClass();

				Method method = clazz.getMethod("setEquipment_name",
						String.class);

				method.invoke(_equipmentRemoteModel, equipment_name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getEquip_quantity() {
		return _equip_quantity;
	}

	@Override
	public void setEquip_quantity(int equip_quantity) {
		_equip_quantity = equip_quantity;

		if (_equipmentRemoteModel != null) {
			try {
				Class<?> clazz = _equipmentRemoteModel.getClass();

				Method method = clazz.getMethod("setEquip_quantity", int.class);

				method.invoke(_equipmentRemoteModel, equip_quantity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEquip_description() {
		return _equip_description;
	}

	@Override
	public void setEquip_description(String equip_description) {
		_equip_description = equip_description;

		if (_equipmentRemoteModel != null) {
			try {
				Class<?> clazz = _equipmentRemoteModel.getClass();

				Method method = clazz.getMethod("setEquip_description",
						String.class);

				method.invoke(_equipmentRemoteModel, equip_description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
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

		if (_equipmentRemoteModel != null) {
			try {
				Class<?> clazz = _equipmentRemoteModel.getClass();

				Method method = clazz.getMethod("setEquip_status", boolean.class);

				method.invoke(_equipmentRemoteModel, equip_status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEquipmentRemoteModel() {
		return _equipmentRemoteModel;
	}

	public void setEquipmentRemoteModel(BaseModel<?> equipmentRemoteModel) {
		_equipmentRemoteModel = equipmentRemoteModel;
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

		Class<?> remoteModelClass = _equipmentRemoteModel.getClass();

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

		Object returnValue = method.invoke(_equipmentRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EquipmentLocalServiceUtil.addEquipment(this);
		}
		else {
			EquipmentLocalServiceUtil.updateEquipment(this);
		}
	}

	@Override
	public Equipment toEscapedModel() {
		return (Equipment)ProxyUtil.newProxyInstance(Equipment.class.getClassLoader(),
			new Class[] { Equipment.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EquipmentClp clone = new EquipmentClp();

		clone.setEquip_id(getEquip_id());
		clone.setEquipment_name(getEquipment_name());
		clone.setEquip_quantity(getEquip_quantity());
		clone.setEquip_description(getEquip_description());
		clone.setEquip_status(getEquip_status());

		return clone;
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

		if (!(obj instanceof EquipmentClp)) {
			return false;
		}

		EquipmentClp equipment = (EquipmentClp)obj;

		long primaryKey = equipment.getPrimaryKey();

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

	private long _equip_id;
	private String _equipment_name;
	private int _equip_quantity;
	private String _equip_description;
	private boolean _equip_status;
	private BaseModel<?> _equipmentRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.sample.service.ClpSerializer.class;
}