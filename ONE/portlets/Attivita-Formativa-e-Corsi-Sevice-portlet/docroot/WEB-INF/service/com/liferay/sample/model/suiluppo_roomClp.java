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
import com.liferay.sample.service.suiluppo_roomLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Naveen Kumar
 */
public class suiluppo_roomClp extends BaseModelImpl<suiluppo_room>
	implements suiluppo_room {
	public suiluppo_roomClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return suiluppo_room.class;
	}

	@Override
	public String getModelClassName() {
		return suiluppo_room.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _roomID;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRoomID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _roomID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("roomID", getRoomID());
		attributes.put("room_name", getRoom_name());
		attributes.put("room_description", getRoom_description());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long roomID = (Long)attributes.get("roomID");

		if (roomID != null) {
			setRoomID(roomID);
		}

		String room_name = (String)attributes.get("room_name");

		if (room_name != null) {
			setRoom_name(room_name);
		}

		String room_description = (String)attributes.get("room_description");

		if (room_description != null) {
			setRoom_description(room_description);
		}
	}

	@Override
	public long getRoomID() {
		return _roomID;
	}

	@Override
	public void setRoomID(long roomID) {
		_roomID = roomID;

		if (_suiluppo_roomRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_roomRemoteModel.getClass();

				Method method = clazz.getMethod("setRoomID", long.class);

				method.invoke(_suiluppo_roomRemoteModel, roomID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRoom_name() {
		return _room_name;
	}

	@Override
	public void setRoom_name(String room_name) {
		_room_name = room_name;

		if (_suiluppo_roomRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_roomRemoteModel.getClass();

				Method method = clazz.getMethod("setRoom_name", String.class);

				method.invoke(_suiluppo_roomRemoteModel, room_name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRoom_description() {
		return _room_description;
	}

	@Override
	public void setRoom_description(String room_description) {
		_room_description = room_description;

		if (_suiluppo_roomRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_roomRemoteModel.getClass();

				Method method = clazz.getMethod("setRoom_description",
						String.class);

				method.invoke(_suiluppo_roomRemoteModel, room_description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getsuiluppo_roomRemoteModel() {
		return _suiluppo_roomRemoteModel;
	}

	public void setsuiluppo_roomRemoteModel(
		BaseModel<?> suiluppo_roomRemoteModel) {
		_suiluppo_roomRemoteModel = suiluppo_roomRemoteModel;
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

		Class<?> remoteModelClass = _suiluppo_roomRemoteModel.getClass();

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

		Object returnValue = method.invoke(_suiluppo_roomRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			suiluppo_roomLocalServiceUtil.addsuiluppo_room(this);
		}
		else {
			suiluppo_roomLocalServiceUtil.updatesuiluppo_room(this);
		}
	}

	@Override
	public suiluppo_room toEscapedModel() {
		return (suiluppo_room)ProxyUtil.newProxyInstance(suiluppo_room.class.getClassLoader(),
			new Class[] { suiluppo_room.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		suiluppo_roomClp clone = new suiluppo_roomClp();

		clone.setRoomID(getRoomID());
		clone.setRoom_name(getRoom_name());
		clone.setRoom_description(getRoom_description());

		return clone;
	}

	@Override
	public int compareTo(suiluppo_room suiluppo_room) {
		long primaryKey = suiluppo_room.getPrimaryKey();

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

		if (!(obj instanceof suiluppo_roomClp)) {
			return false;
		}

		suiluppo_roomClp suiluppo_room = (suiluppo_roomClp)obj;

		long primaryKey = suiluppo_room.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{roomID=");
		sb.append(getRoomID());
		sb.append(", room_name=");
		sb.append(getRoom_name());
		sb.append(", room_description=");
		sb.append(getRoom_description());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.liferay.sample.model.suiluppo_room");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>roomID</column-name><column-value><![CDATA[");
		sb.append(getRoomID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>room_name</column-name><column-value><![CDATA[");
		sb.append(getRoom_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>room_description</column-name><column-value><![CDATA[");
		sb.append(getRoom_description());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _roomID;
	private String _room_name;
	private String _room_description;
	private BaseModel<?> _suiluppo_roomRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.sample.service.ClpSerializer.class;
}