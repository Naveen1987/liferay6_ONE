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

import com.liferay.sample.model.suiluppo_room_allocation_archive;
import com.liferay.sample.model.suiluppo_room_allocation_archiveModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the suiluppo_room_allocation_archive service. Represents a row in the &quot;suiluppo_room_allocation_archive&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.sample.model.suiluppo_room_allocation_archiveModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link suiluppo_room_allocation_archiveImpl}.
 * </p>
 *
 * @author Naveen Kumar
 * @see suiluppo_room_allocation_archiveImpl
 * @see com.liferay.sample.model.suiluppo_room_allocation_archive
 * @see com.liferay.sample.model.suiluppo_room_allocation_archiveModel
 * @generated
 */
public class suiluppo_room_allocation_archiveModelImpl extends BaseModelImpl<suiluppo_room_allocation_archive>
	implements suiluppo_room_allocation_archiveModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a suiluppo_room_allocation_archive model instance should use the {@link com.liferay.sample.model.suiluppo_room_allocation_archive} interface instead.
	 */
	public static final String TABLE_NAME = "suiluppo_room_allocation_archive";
	public static final Object[][] TABLE_COLUMNS = {
			{ "room_allocat_archive_id", Types.BIGINT },
			{ "roomID", Types.BIGINT },
			{ "course_id", Types.BIGINT },
			{ "room_allocat_date", Types.VARCHAR },
			{ "room_allocat_startTime", Types.VARCHAR },
			{ "room_allocat_start", Types.VARCHAR },
			{ "room_allocat_end", Types.VARCHAR },
			{ "room_allocat_status", Types.VARCHAR },
			{ "room_allocat_endTime", Types.VARCHAR },
			{ "room_archive_date", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table suiluppo_room_allocation_archive (room_allocat_archive_id LONG not null primary key,roomID LONG,course_id LONG,room_allocat_date VARCHAR(75) null,room_allocat_startTime VARCHAR(75) null,room_allocat_start VARCHAR(75) null,room_allocat_end VARCHAR(75) null,room_allocat_status VARCHAR(75) null,room_allocat_endTime VARCHAR(75) null,room_archive_date VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table suiluppo_room_allocation_archive";
	public static final String ORDER_BY_JPQL = " ORDER BY suiluppo_room_allocation_archive.room_allocat_archive_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY suiluppo_room_allocation_archive.room_allocat_archive_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.sample.model.suiluppo_room_allocation_archive"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.sample.model.suiluppo_room_allocation_archive"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.sample.model.suiluppo_room_allocation_archive"));

	public suiluppo_room_allocation_archiveModelImpl() {
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
	public Class<?> getModelClass() {
		return suiluppo_room_allocation_archive.class;
	}

	@Override
	public String getModelClassName() {
		return suiluppo_room_allocation_archive.class.getName();
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
	}

	@Override
	public long getRoomID() {
		return _roomID;
	}

	@Override
	public void setRoomID(long roomID) {
		_roomID = roomID;
	}

	@Override
	public long getCourse_id() {
		return _course_id;
	}

	@Override
	public void setCourse_id(long course_id) {
		_course_id = course_id;
	}

	@Override
	public String getRoom_allocat_date() {
		if (_room_allocat_date == null) {
			return StringPool.BLANK;
		}
		else {
			return _room_allocat_date;
		}
	}

	@Override
	public void setRoom_allocat_date(String room_allocat_date) {
		_room_allocat_date = room_allocat_date;
	}

	@Override
	public String getRoom_allocat_startTime() {
		if (_room_allocat_startTime == null) {
			return StringPool.BLANK;
		}
		else {
			return _room_allocat_startTime;
		}
	}

	@Override
	public void setRoom_allocat_startTime(String room_allocat_startTime) {
		_room_allocat_startTime = room_allocat_startTime;
	}

	@Override
	public String getRoom_allocat_start() {
		if (_room_allocat_start == null) {
			return StringPool.BLANK;
		}
		else {
			return _room_allocat_start;
		}
	}

	@Override
	public void setRoom_allocat_start(String room_allocat_start) {
		_room_allocat_start = room_allocat_start;
	}

	@Override
	public String getRoom_allocat_end() {
		if (_room_allocat_end == null) {
			return StringPool.BLANK;
		}
		else {
			return _room_allocat_end;
		}
	}

	@Override
	public void setRoom_allocat_end(String room_allocat_end) {
		_room_allocat_end = room_allocat_end;
	}

	@Override
	public String getRoom_allocat_status() {
		if (_room_allocat_status == null) {
			return StringPool.BLANK;
		}
		else {
			return _room_allocat_status;
		}
	}

	@Override
	public void setRoom_allocat_status(String room_allocat_status) {
		_room_allocat_status = room_allocat_status;
	}

	@Override
	public String getRoom_allocat_endTime() {
		if (_room_allocat_endTime == null) {
			return StringPool.BLANK;
		}
		else {
			return _room_allocat_endTime;
		}
	}

	@Override
	public void setRoom_allocat_endTime(String room_allocat_endTime) {
		_room_allocat_endTime = room_allocat_endTime;
	}

	@Override
	public String getRoom_archive_date() {
		if (_room_archive_date == null) {
			return StringPool.BLANK;
		}
		else {
			return _room_archive_date;
		}
	}

	@Override
	public void setRoom_archive_date(String room_archive_date) {
		_room_archive_date = room_archive_date;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			suiluppo_room_allocation_archive.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public suiluppo_room_allocation_archive toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (suiluppo_room_allocation_archive)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		suiluppo_room_allocation_archiveImpl suiluppo_room_allocation_archiveImpl =
			new suiluppo_room_allocation_archiveImpl();

		suiluppo_room_allocation_archiveImpl.setRoom_allocat_archive_id(getRoom_allocat_archive_id());
		suiluppo_room_allocation_archiveImpl.setRoomID(getRoomID());
		suiluppo_room_allocation_archiveImpl.setCourse_id(getCourse_id());
		suiluppo_room_allocation_archiveImpl.setRoom_allocat_date(getRoom_allocat_date());
		suiluppo_room_allocation_archiveImpl.setRoom_allocat_startTime(getRoom_allocat_startTime());
		suiluppo_room_allocation_archiveImpl.setRoom_allocat_start(getRoom_allocat_start());
		suiluppo_room_allocation_archiveImpl.setRoom_allocat_end(getRoom_allocat_end());
		suiluppo_room_allocation_archiveImpl.setRoom_allocat_status(getRoom_allocat_status());
		suiluppo_room_allocation_archiveImpl.setRoom_allocat_endTime(getRoom_allocat_endTime());
		suiluppo_room_allocation_archiveImpl.setRoom_archive_date(getRoom_archive_date());

		suiluppo_room_allocation_archiveImpl.resetOriginalValues();

		return suiluppo_room_allocation_archiveImpl;
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

		if (!(obj instanceof suiluppo_room_allocation_archive)) {
			return false;
		}

		suiluppo_room_allocation_archive suiluppo_room_allocation_archive = (suiluppo_room_allocation_archive)obj;

		long primaryKey = suiluppo_room_allocation_archive.getPrimaryKey();

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
	public CacheModel<suiluppo_room_allocation_archive> toCacheModel() {
		suiluppo_room_allocation_archiveCacheModel suiluppo_room_allocation_archiveCacheModel =
			new suiluppo_room_allocation_archiveCacheModel();

		suiluppo_room_allocation_archiveCacheModel.room_allocat_archive_id = getRoom_allocat_archive_id();

		suiluppo_room_allocation_archiveCacheModel.roomID = getRoomID();

		suiluppo_room_allocation_archiveCacheModel.course_id = getCourse_id();

		suiluppo_room_allocation_archiveCacheModel.room_allocat_date = getRoom_allocat_date();

		String room_allocat_date = suiluppo_room_allocation_archiveCacheModel.room_allocat_date;

		if ((room_allocat_date != null) && (room_allocat_date.length() == 0)) {
			suiluppo_room_allocation_archiveCacheModel.room_allocat_date = null;
		}

		suiluppo_room_allocation_archiveCacheModel.room_allocat_startTime = getRoom_allocat_startTime();

		String room_allocat_startTime = suiluppo_room_allocation_archiveCacheModel.room_allocat_startTime;

		if ((room_allocat_startTime != null) &&
				(room_allocat_startTime.length() == 0)) {
			suiluppo_room_allocation_archiveCacheModel.room_allocat_startTime = null;
		}

		suiluppo_room_allocation_archiveCacheModel.room_allocat_start = getRoom_allocat_start();

		String room_allocat_start = suiluppo_room_allocation_archiveCacheModel.room_allocat_start;

		if ((room_allocat_start != null) && (room_allocat_start.length() == 0)) {
			suiluppo_room_allocation_archiveCacheModel.room_allocat_start = null;
		}

		suiluppo_room_allocation_archiveCacheModel.room_allocat_end = getRoom_allocat_end();

		String room_allocat_end = suiluppo_room_allocation_archiveCacheModel.room_allocat_end;

		if ((room_allocat_end != null) && (room_allocat_end.length() == 0)) {
			suiluppo_room_allocation_archiveCacheModel.room_allocat_end = null;
		}

		suiluppo_room_allocation_archiveCacheModel.room_allocat_status = getRoom_allocat_status();

		String room_allocat_status = suiluppo_room_allocation_archiveCacheModel.room_allocat_status;

		if ((room_allocat_status != null) &&
				(room_allocat_status.length() == 0)) {
			suiluppo_room_allocation_archiveCacheModel.room_allocat_status = null;
		}

		suiluppo_room_allocation_archiveCacheModel.room_allocat_endTime = getRoom_allocat_endTime();

		String room_allocat_endTime = suiluppo_room_allocation_archiveCacheModel.room_allocat_endTime;

		if ((room_allocat_endTime != null) &&
				(room_allocat_endTime.length() == 0)) {
			suiluppo_room_allocation_archiveCacheModel.room_allocat_endTime = null;
		}

		suiluppo_room_allocation_archiveCacheModel.room_archive_date = getRoom_archive_date();

		String room_archive_date = suiluppo_room_allocation_archiveCacheModel.room_archive_date;

		if ((room_archive_date != null) && (room_archive_date.length() == 0)) {
			suiluppo_room_allocation_archiveCacheModel.room_archive_date = null;
		}

		return suiluppo_room_allocation_archiveCacheModel;
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

	private static ClassLoader _classLoader = suiluppo_room_allocation_archive.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			suiluppo_room_allocation_archive.class
		};
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
	private suiluppo_room_allocation_archive _escapedModel;
}