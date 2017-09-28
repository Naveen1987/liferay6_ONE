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

import com.liferay.sample.service.BookedEquipmentLocalServiceUtil;
import com.liferay.sample.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Naveen Kumar
 */
public class BookedEquipmentClp extends BaseModelImpl<BookedEquipment>
	implements BookedEquipment {
	public BookedEquipmentClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return BookedEquipment.class;
	}

	@Override
	public String getModelClassName() {
		return BookedEquipment.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _booked_equip_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBooked_equip_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _booked_equip_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("booked_equip_id", getBooked_equip_id());
		attributes.put("equip_id", getEquip_id());
		attributes.put("course_id", getCourse_id());
		attributes.put("equip_quantity", getEquip_quantity());
		attributes.put("booked_equip_status", getBooked_equip_status());
		attributes.put("booked_equip_date", getBooked_equip_date());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long booked_equip_id = (Long)attributes.get("booked_equip_id");

		if (booked_equip_id != null) {
			setBooked_equip_id(booked_equip_id);
		}

		Long equip_id = (Long)attributes.get("equip_id");

		if (equip_id != null) {
			setEquip_id(equip_id);
		}

		Long course_id = (Long)attributes.get("course_id");

		if (course_id != null) {
			setCourse_id(course_id);
		}

		Integer equip_quantity = (Integer)attributes.get("equip_quantity");

		if (equip_quantity != null) {
			setEquip_quantity(equip_quantity);
		}

		Boolean booked_equip_status = (Boolean)attributes.get(
				"booked_equip_status");

		if (booked_equip_status != null) {
			setBooked_equip_status(booked_equip_status);
		}

		String booked_equip_date = (String)attributes.get("booked_equip_date");

		if (booked_equip_date != null) {
			setBooked_equip_date(booked_equip_date);
		}
	}

	@Override
	public long getBooked_equip_id() {
		return _booked_equip_id;
	}

	@Override
	public void setBooked_equip_id(long booked_equip_id) {
		_booked_equip_id = booked_equip_id;

		if (_bookedEquipmentRemoteModel != null) {
			try {
				Class<?> clazz = _bookedEquipmentRemoteModel.getClass();

				Method method = clazz.getMethod("setBooked_equip_id", long.class);

				method.invoke(_bookedEquipmentRemoteModel, booked_equip_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEquip_id() {
		return _equip_id;
	}

	@Override
	public void setEquip_id(long equip_id) {
		_equip_id = equip_id;

		if (_bookedEquipmentRemoteModel != null) {
			try {
				Class<?> clazz = _bookedEquipmentRemoteModel.getClass();

				Method method = clazz.getMethod("setEquip_id", long.class);

				method.invoke(_bookedEquipmentRemoteModel, equip_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCourse_id() {
		return _course_id;
	}

	@Override
	public void setCourse_id(long course_id) {
		_course_id = course_id;

		if (_bookedEquipmentRemoteModel != null) {
			try {
				Class<?> clazz = _bookedEquipmentRemoteModel.getClass();

				Method method = clazz.getMethod("setCourse_id", long.class);

				method.invoke(_bookedEquipmentRemoteModel, course_id);
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

		if (_bookedEquipmentRemoteModel != null) {
			try {
				Class<?> clazz = _bookedEquipmentRemoteModel.getClass();

				Method method = clazz.getMethod("setEquip_quantity", int.class);

				method.invoke(_bookedEquipmentRemoteModel, equip_quantity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getBooked_equip_status() {
		return _booked_equip_status;
	}

	@Override
	public boolean isBooked_equip_status() {
		return _booked_equip_status;
	}

	@Override
	public void setBooked_equip_status(boolean booked_equip_status) {
		_booked_equip_status = booked_equip_status;

		if (_bookedEquipmentRemoteModel != null) {
			try {
				Class<?> clazz = _bookedEquipmentRemoteModel.getClass();

				Method method = clazz.getMethod("setBooked_equip_status",
						boolean.class);

				method.invoke(_bookedEquipmentRemoteModel, booked_equip_status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBooked_equip_date() {
		return _booked_equip_date;
	}

	@Override
	public void setBooked_equip_date(String booked_equip_date) {
		_booked_equip_date = booked_equip_date;

		if (_bookedEquipmentRemoteModel != null) {
			try {
				Class<?> clazz = _bookedEquipmentRemoteModel.getClass();

				Method method = clazz.getMethod("setBooked_equip_date",
						String.class);

				method.invoke(_bookedEquipmentRemoteModel, booked_equip_date);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getBookedEquipmentRemoteModel() {
		return _bookedEquipmentRemoteModel;
	}

	public void setBookedEquipmentRemoteModel(
		BaseModel<?> bookedEquipmentRemoteModel) {
		_bookedEquipmentRemoteModel = bookedEquipmentRemoteModel;
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

		Class<?> remoteModelClass = _bookedEquipmentRemoteModel.getClass();

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

		Object returnValue = method.invoke(_bookedEquipmentRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			BookedEquipmentLocalServiceUtil.addBookedEquipment(this);
		}
		else {
			BookedEquipmentLocalServiceUtil.updateBookedEquipment(this);
		}
	}

	@Override
	public BookedEquipment toEscapedModel() {
		return (BookedEquipment)ProxyUtil.newProxyInstance(BookedEquipment.class.getClassLoader(),
			new Class[] { BookedEquipment.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		BookedEquipmentClp clone = new BookedEquipmentClp();

		clone.setBooked_equip_id(getBooked_equip_id());
		clone.setEquip_id(getEquip_id());
		clone.setCourse_id(getCourse_id());
		clone.setEquip_quantity(getEquip_quantity());
		clone.setBooked_equip_status(getBooked_equip_status());
		clone.setBooked_equip_date(getBooked_equip_date());

		return clone;
	}

	@Override
	public int compareTo(BookedEquipment bookedEquipment) {
		long primaryKey = bookedEquipment.getPrimaryKey();

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

		if (!(obj instanceof BookedEquipmentClp)) {
			return false;
		}

		BookedEquipmentClp bookedEquipment = (BookedEquipmentClp)obj;

		long primaryKey = bookedEquipment.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{booked_equip_id=");
		sb.append(getBooked_equip_id());
		sb.append(", equip_id=");
		sb.append(getEquip_id());
		sb.append(", course_id=");
		sb.append(getCourse_id());
		sb.append(", equip_quantity=");
		sb.append(getEquip_quantity());
		sb.append(", booked_equip_status=");
		sb.append(getBooked_equip_status());
		sb.append(", booked_equip_date=");
		sb.append(getBooked_equip_date());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.liferay.sample.model.BookedEquipment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>booked_equip_id</column-name><column-value><![CDATA[");
		sb.append(getBooked_equip_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>equip_id</column-name><column-value><![CDATA[");
		sb.append(getEquip_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>course_id</column-name><column-value><![CDATA[");
		sb.append(getCourse_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>equip_quantity</column-name><column-value><![CDATA[");
		sb.append(getEquip_quantity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>booked_equip_status</column-name><column-value><![CDATA[");
		sb.append(getBooked_equip_status());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>booked_equip_date</column-name><column-value><![CDATA[");
		sb.append(getBooked_equip_date());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _booked_equip_id;
	private long _equip_id;
	private long _course_id;
	private int _equip_quantity;
	private boolean _booked_equip_status;
	private String _booked_equip_date;
	private BaseModel<?> _bookedEquipmentRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.sample.service.ClpSerializer.class;
}