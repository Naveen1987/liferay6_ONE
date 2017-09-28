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
import com.liferay.sample.service.suiluppo_room_allocation_archiveLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Naveen Kumar
 */
public class suiluppo_room_allocation_archiveClp extends BaseModelImpl<suiluppo_room_allocation_archive>
	implements suiluppo_room_allocation_archive {
	public suiluppo_room_allocation_archiveClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return suiluppo_room_allocation_archive.class;
	}

	@Override
	public String getModelClassName() {
		return suiluppo_room_allocation_archive.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _room_allocat_archive_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRoom_allocat_archive_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _room_allocat_archive_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("room_allocat_archive_id", getRoom_allocat_archive_id());
		attributes.put("roomID", getRoomID());
		attributes.put("course_id", getCourse_id());
		attributes.put("room_allocat_date", getRoom_allocat_date());
		attributes.put("room_allocat_startTime", getRoom_allocat_startTime());
		attributes.put("room_allocat_start", getRoom_allocat_start());
		attributes.put("room_allocat_end", getRoom_allocat_end());
		attributes.put("room_allocat_status", getRoom_allocat_status());
		attributes.put("room_allocat_endTime", getRoom_allocat_endTime());
		attributes.put("room_archive_date", getRoom_archive_date());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long room_allocat_archive_id = (Long)attributes.get(
				"room_allocat_archive_id");

		if (room_allocat_archive_id != null) {
			setRoom_allocat_archive_id(room_allocat_archive_id);
		}

		Long roomID = (Long)attributes.get("roomID");

		if (roomID != null) {
			setRoomID(roomID);
		}

		Long course_id = (Long)attributes.get("course_id");

		if (course_id != null) {
			setCourse_id(course_id);
		}

		String room_allocat_date = (String)attributes.get("room_allocat_date");

		if (room_allocat_date != null) {
			setRoom_allocat_date(room_allocat_date);
		}

		String room_allocat_startTime = (String)attributes.get(
				"room_allocat_startTime");

		if (room_allocat_startTime != null) {
			setRoom_allocat_startTime(room_allocat_startTime);
		}

		String room_allocat_start = (String)attributes.get("room_allocat_start");

		if (room_allocat_start != null) {
			setRoom_allocat_start(room_allocat_start);
		}

		String room_allocat_end = (String)attributes.get("room_allocat_end");

		if (room_allocat_end != null) {
			setRoom_allocat_end(room_allocat_end);
		}

		String room_allocat_status = (String)attributes.get(
				"room_allocat_status");

		if (room_allocat_status != null) {
			setRoom_allocat_status(room_allocat_status);
		}

		String room_allocat_endTime = (String)attributes.get(
				"room_allocat_endTime");

		if (room_allocat_endTime != null) {
			setRoom_allocat_endTime(room_allocat_endTime);
		}

		String room_archive_date = (String)attributes.get("room_archive_date");

		if (room_archive_date != null) {
			setRoom_archive_date(room_archive_date);
		}
	}

	@Override
	public long getRoom_allocat_archive_id() {
		return _room_allocat_archive_id;
	}

	@Override
	public void setRoom_allocat_archive_id(long room_allocat_archive_id) {
		_room_allocat_archive_id = room_allocat_archive_id;

		if (_suiluppo_room_allocation_archiveRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_room_allocation_archiveRemoteModel.getClass();

				Method method = clazz.getMethod("setRoom_allocat_archive_id",
						long.class);

				method.invoke(_suiluppo_room_allocation_archiveRemoteModel,
					room_allocat_archive_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRoomID() {
		return _roomID;
	}

	@Override
	public void setRoomID(long roomID) {
		_roomID = roomID;

		if (_suiluppo_room_allocation_archiveRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_room_allocation_archiveRemoteModel.getClass();

				Method method = clazz.getMethod("setRoomID", long.class);

				method.invoke(_suiluppo_room_allocation_archiveRemoteModel,
					roomID);
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

		if (_suiluppo_room_allocation_archiveRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_room_allocation_archiveRemoteModel.getClass();

				Method method = clazz.getMethod("setCourse_id", long.class);

				method.invoke(_suiluppo_room_allocation_archiveRemoteModel,
					course_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRoom_allocat_date() {
		return _room_allocat_date;
	}

	@Override
	public void setRoom_allocat_date(String room_allocat_date) {
		_room_allocat_date = room_allocat_date;

		if (_suiluppo_room_allocation_archiveRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_room_allocation_archiveRemoteModel.getClass();

				Method method = clazz.getMethod("setRoom_allocat_date",
						String.class);

				method.invoke(_suiluppo_room_allocation_archiveRemoteModel,
					room_allocat_date);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRoom_allocat_startTime() {
		return _room_allocat_startTime;
	}

	@Override
	public void setRoom_allocat_startTime(String room_allocat_startTime) {
		_room_allocat_startTime = room_allocat_startTime;

		if (_suiluppo_room_allocation_archiveRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_room_allocation_archiveRemoteModel.getClass();

				Method method = clazz.getMethod("setRoom_allocat_startTime",
						String.class);

				method.invoke(_suiluppo_room_allocation_archiveRemoteModel,
					room_allocat_startTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRoom_allocat_start() {
		return _room_allocat_start;
	}

	@Override
	public void setRoom_allocat_start(String room_allocat_start) {
		_room_allocat_start = room_allocat_start;

		if (_suiluppo_room_allocation_archiveRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_room_allocation_archiveRemoteModel.getClass();

				Method method = clazz.getMethod("setRoom_allocat_start",
						String.class);

				method.invoke(_suiluppo_room_allocation_archiveRemoteModel,
					room_allocat_start);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRoom_allocat_end() {
		return _room_allocat_end;
	}

	@Override
	public void setRoom_allocat_end(String room_allocat_end) {
		_room_allocat_end = room_allocat_end;

		if (_suiluppo_room_allocation_archiveRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_room_allocation_archiveRemoteModel.getClass();

				Method method = clazz.getMethod("setRoom_allocat_end",
						String.class);

				method.invoke(_suiluppo_room_allocation_archiveRemoteModel,
					room_allocat_end);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRoom_allocat_status() {
		return _room_allocat_status;
	}

	@Override
	public void setRoom_allocat_status(String room_allocat_status) {
		_room_allocat_status = room_allocat_status;

		if (_suiluppo_room_allocation_archiveRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_room_allocation_archiveRemoteModel.getClass();

				Method method = clazz.getMethod("setRoom_allocat_status",
						String.class);

				method.invoke(_suiluppo_room_allocation_archiveRemoteModel,
					room_allocat_status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRoom_allocat_endTime() {
		return _room_allocat_endTime;
	}

	@Override
	public void setRoom_allocat_endTime(String room_allocat_endTime) {
		_room_allocat_endTime = room_allocat_endTime;

		if (_suiluppo_room_allocation_archiveRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_room_allocation_archiveRemoteModel.getClass();

				Method method = clazz.getMethod("setRoom_allocat_endTime",
						String.class);

				method.invoke(_suiluppo_room_allocation_archiveRemoteModel,
					room_allocat_endTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRoom_archive_date() {
		return _room_archive_date;
	}

	@Override
	public void setRoom_archive_date(String room_archive_date) {
		_room_archive_date = room_archive_date;

		if (_suiluppo_room_allocation_archiveRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_room_allocation_archiveRemoteModel.getClass();

				Method method = clazz.getMethod("setRoom_archive_date",
						String.class);

				method.invoke(_suiluppo_room_allocation_archiveRemoteModel,
					room_archive_date);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getsuiluppo_room_allocation_archiveRemoteModel() {
		return _suiluppo_room_allocation_archiveRemoteModel;
	}

	public void setsuiluppo_room_allocation_archiveRemoteModel(
		BaseModel<?> suiluppo_room_allocation_archiveRemoteModel) {
		_suiluppo_room_allocation_archiveRemoteModel = suiluppo_room_allocation_archiveRemoteModel;
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

		Class<?> remoteModelClass = _suiluppo_room_allocation_archiveRemoteModel.getClass();

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

		Object returnValue = method.invoke(_suiluppo_room_allocation_archiveRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			suiluppo_room_allocation_archiveLocalServiceUtil.addsuiluppo_room_allocation_archive(this);
		}
		else {
			suiluppo_room_allocation_archiveLocalServiceUtil.updatesuiluppo_room_allocation_archive(this);
		}
	}

	@Override
	public suiluppo_room_allocation_archive toEscapedModel() {
		return (suiluppo_room_allocation_archive)ProxyUtil.newProxyInstance(suiluppo_room_allocation_archive.class.getClassLoader(),
			new Class[] { suiluppo_room_allocation_archive.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		suiluppo_room_allocation_archiveClp clone = new suiluppo_room_allocation_archiveClp();

		clone.setRoom_allocat_archive_id(getRoom_allocat_archive_id());
		clone.setRoomID(getRoomID());
		clone.setCourse_id(getCourse_id());
		clone.setRoom_allocat_date(getRoom_allocat_date());
		clone.setRoom_allocat_startTime(getRoom_allocat_startTime());
		clone.setRoom_allocat_start(getRoom_allocat_start());
		clone.setRoom_allocat_end(getRoom_allocat_end());
		clone.setRoom_allocat_status(getRoom_allocat_status());
		clone.setRoom_allocat_endTime(getRoom_allocat_endTime());
		clone.setRoom_archive_date(getRoom_archive_date());

		return clone;
	}

	@Override
	public int compareTo(
		suiluppo_room_allocation_archive suiluppo_room_allocation_archive) {
		long primaryKey = suiluppo_room_allocation_archive.getPrimaryKey();

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

		if (!(obj instanceof suiluppo_room_allocation_archiveClp)) {
			return false;
		}

		suiluppo_room_allocation_archiveClp suiluppo_room_allocation_archive = (suiluppo_room_allocation_archiveClp)obj;

		long primaryKey = suiluppo_room_allocation_archive.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{room_allocat_archive_id=");
		sb.append(getRoom_allocat_archive_id());
		sb.append(", roomID=");
		sb.append(getRoomID());
		sb.append(", course_id=");
		sb.append(getCourse_id());
		sb.append(", room_allocat_date=");
		sb.append(getRoom_allocat_date());
		sb.append(", room_allocat_startTime=");
		sb.append(getRoom_allocat_startTime());
		sb.append(", room_allocat_start=");
		sb.append(getRoom_allocat_start());
		sb.append(", room_allocat_end=");
		sb.append(getRoom_allocat_end());
		sb.append(", room_allocat_status=");
		sb.append(getRoom_allocat_status());
		sb.append(", room_allocat_endTime=");
		sb.append(getRoom_allocat_endTime());
		sb.append(", room_archive_date=");
		sb.append(getRoom_archive_date());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.liferay.sample.model.suiluppo_room_allocation_archive");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>room_allocat_archive_id</column-name><column-value><![CDATA[");
		sb.append(getRoom_allocat_archive_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roomID</column-name><column-value><![CDATA[");
		sb.append(getRoomID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>course_id</column-name><column-value><![CDATA[");
		sb.append(getCourse_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>room_allocat_date</column-name><column-value><![CDATA[");
		sb.append(getRoom_allocat_date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>room_allocat_startTime</column-name><column-value><![CDATA[");
		sb.append(getRoom_allocat_startTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>room_allocat_start</column-name><column-value><![CDATA[");
		sb.append(getRoom_allocat_start());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>room_allocat_end</column-name><column-value><![CDATA[");
		sb.append(getRoom_allocat_end());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>room_allocat_status</column-name><column-value><![CDATA[");
		sb.append(getRoom_allocat_status());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>room_allocat_endTime</column-name><column-value><![CDATA[");
		sb.append(getRoom_allocat_endTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>room_archive_date</column-name><column-value><![CDATA[");
		sb.append(getRoom_archive_date());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _room_allocat_archive_id;
	private long _roomID;
	private long _course_id;
	private String _room_allocat_date;
	private String _room_allocat_startTime;
	private String _room_allocat_start;
	private String _room_allocat_end;
	private String _room_allocat_status;
	private String _room_allocat_endTime;
	private String _room_archive_date;
	private BaseModel<?> _suiluppo_room_allocation_archiveRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.sample.service.ClpSerializer.class;
}