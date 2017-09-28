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
 * This class is a wrapper for {@link suiluppo_room}.
 * </p>
 *
 * @author Naveen Kumar
 * @see suiluppo_room
 * @generated
 */
public class suiluppo_roomWrapper implements suiluppo_room,
	ModelWrapper<suiluppo_room> {
	public suiluppo_roomWrapper(suiluppo_room suiluppo_room) {
		_suiluppo_room = suiluppo_room;
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

	/**
	* Returns the primary key of this suiluppo_room.
	*
	* @return the primary key of this suiluppo_room
	*/
	@Override
	public long getPrimaryKey() {
		return _suiluppo_room.getPrimaryKey();
	}

	/**
	* Sets the primary key of this suiluppo_room.
	*
	* @param primaryKey the primary key of this suiluppo_room
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_suiluppo_room.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the room i d of this suiluppo_room.
	*
	* @return the room i d of this suiluppo_room
	*/
	@Override
	public long getRoomID() {
		return _suiluppo_room.getRoomID();
	}

	/**
	* Sets the room i d of this suiluppo_room.
	*
	* @param roomID the room i d of this suiluppo_room
	*/
	@Override
	public void setRoomID(long roomID) {
		_suiluppo_room.setRoomID(roomID);
	}

	/**
	* Returns the room_name of this suiluppo_room.
	*
	* @return the room_name of this suiluppo_room
	*/
	@Override
	public java.lang.String getRoom_name() {
		return _suiluppo_room.getRoom_name();
	}

	/**
	* Sets the room_name of this suiluppo_room.
	*
	* @param room_name the room_name of this suiluppo_room
	*/
	@Override
	public void setRoom_name(java.lang.String room_name) {
		_suiluppo_room.setRoom_name(room_name);
	}

	/**
	* Returns the room_description of this suiluppo_room.
	*
	* @return the room_description of this suiluppo_room
	*/
	@Override
	public java.lang.String getRoom_description() {
		return _suiluppo_room.getRoom_description();
	}

	/**
	* Sets the room_description of this suiluppo_room.
	*
	* @param room_description the room_description of this suiluppo_room
	*/
	@Override
	public void setRoom_description(java.lang.String room_description) {
		_suiluppo_room.setRoom_description(room_description);
	}

	@Override
	public boolean isNew() {
		return _suiluppo_room.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_suiluppo_room.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _suiluppo_room.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_suiluppo_room.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _suiluppo_room.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _suiluppo_room.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_suiluppo_room.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _suiluppo_room.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_suiluppo_room.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_suiluppo_room.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_suiluppo_room.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new suiluppo_roomWrapper((suiluppo_room)_suiluppo_room.clone());
	}

	@Override
	public int compareTo(com.liferay.sample.model.suiluppo_room suiluppo_room) {
		return _suiluppo_room.compareTo(suiluppo_room);
	}

	@Override
	public int hashCode() {
		return _suiluppo_room.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.sample.model.suiluppo_room> toCacheModel() {
		return _suiluppo_room.toCacheModel();
	}

	@Override
	public com.liferay.sample.model.suiluppo_room toEscapedModel() {
		return new suiluppo_roomWrapper(_suiluppo_room.toEscapedModel());
	}

	@Override
	public com.liferay.sample.model.suiluppo_room toUnescapedModel() {
		return new suiluppo_roomWrapper(_suiluppo_room.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _suiluppo_room.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _suiluppo_room.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_suiluppo_room.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof suiluppo_roomWrapper)) {
			return false;
		}

		suiluppo_roomWrapper suiluppo_roomWrapper = (suiluppo_roomWrapper)obj;

		if (Validator.equals(_suiluppo_room, suiluppo_roomWrapper._suiluppo_room)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public suiluppo_room getWrappedsuiluppo_room() {
		return _suiluppo_room;
	}

	@Override
	public suiluppo_room getWrappedModel() {
		return _suiluppo_room;
	}

	@Override
	public void resetOriginalValues() {
		_suiluppo_room.resetOriginalValues();
	}

	private suiluppo_room _suiluppo_room;
}