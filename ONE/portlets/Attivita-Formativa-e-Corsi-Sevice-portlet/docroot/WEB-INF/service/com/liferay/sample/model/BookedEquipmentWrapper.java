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
 * This class is a wrapper for {@link BookedEquipment}.
 * </p>
 *
 * @author Naveen Kumar
 * @see BookedEquipment
 * @generated
 */
public class BookedEquipmentWrapper implements BookedEquipment,
	ModelWrapper<BookedEquipment> {
	public BookedEquipmentWrapper(BookedEquipment bookedEquipment) {
		_bookedEquipment = bookedEquipment;
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

	/**
	* Returns the primary key of this booked equipment.
	*
	* @return the primary key of this booked equipment
	*/
	@Override
	public long getPrimaryKey() {
		return _bookedEquipment.getPrimaryKey();
	}

	/**
	* Sets the primary key of this booked equipment.
	*
	* @param primaryKey the primary key of this booked equipment
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_bookedEquipment.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the booked_equip_id of this booked equipment.
	*
	* @return the booked_equip_id of this booked equipment
	*/
	@Override
	public long getBooked_equip_id() {
		return _bookedEquipment.getBooked_equip_id();
	}

	/**
	* Sets the booked_equip_id of this booked equipment.
	*
	* @param booked_equip_id the booked_equip_id of this booked equipment
	*/
	@Override
	public void setBooked_equip_id(long booked_equip_id) {
		_bookedEquipment.setBooked_equip_id(booked_equip_id);
	}

	/**
	* Returns the equip_id of this booked equipment.
	*
	* @return the equip_id of this booked equipment
	*/
	@Override
	public long getEquip_id() {
		return _bookedEquipment.getEquip_id();
	}

	/**
	* Sets the equip_id of this booked equipment.
	*
	* @param equip_id the equip_id of this booked equipment
	*/
	@Override
	public void setEquip_id(long equip_id) {
		_bookedEquipment.setEquip_id(equip_id);
	}

	/**
	* Returns the course_id of this booked equipment.
	*
	* @return the course_id of this booked equipment
	*/
	@Override
	public long getCourse_id() {
		return _bookedEquipment.getCourse_id();
	}

	/**
	* Sets the course_id of this booked equipment.
	*
	* @param course_id the course_id of this booked equipment
	*/
	@Override
	public void setCourse_id(long course_id) {
		_bookedEquipment.setCourse_id(course_id);
	}

	/**
	* Returns the equip_quantity of this booked equipment.
	*
	* @return the equip_quantity of this booked equipment
	*/
	@Override
	public int getEquip_quantity() {
		return _bookedEquipment.getEquip_quantity();
	}

	/**
	* Sets the equip_quantity of this booked equipment.
	*
	* @param equip_quantity the equip_quantity of this booked equipment
	*/
	@Override
	public void setEquip_quantity(int equip_quantity) {
		_bookedEquipment.setEquip_quantity(equip_quantity);
	}

	/**
	* Returns the booked_equip_status of this booked equipment.
	*
	* @return the booked_equip_status of this booked equipment
	*/
	@Override
	public boolean getBooked_equip_status() {
		return _bookedEquipment.getBooked_equip_status();
	}

	/**
	* Returns <code>true</code> if this booked equipment is booked_equip_status.
	*
	* @return <code>true</code> if this booked equipment is booked_equip_status; <code>false</code> otherwise
	*/
	@Override
	public boolean isBooked_equip_status() {
		return _bookedEquipment.isBooked_equip_status();
	}

	/**
	* Sets whether this booked equipment is booked_equip_status.
	*
	* @param booked_equip_status the booked_equip_status of this booked equipment
	*/
	@Override
	public void setBooked_equip_status(boolean booked_equip_status) {
		_bookedEquipment.setBooked_equip_status(booked_equip_status);
	}

	/**
	* Returns the booked_equip_date of this booked equipment.
	*
	* @return the booked_equip_date of this booked equipment
	*/
	@Override
	public java.lang.String getBooked_equip_date() {
		return _bookedEquipment.getBooked_equip_date();
	}

	/**
	* Sets the booked_equip_date of this booked equipment.
	*
	* @param booked_equip_date the booked_equip_date of this booked equipment
	*/
	@Override
	public void setBooked_equip_date(java.lang.String booked_equip_date) {
		_bookedEquipment.setBooked_equip_date(booked_equip_date);
	}

	@Override
	public boolean isNew() {
		return _bookedEquipment.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_bookedEquipment.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _bookedEquipment.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_bookedEquipment.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _bookedEquipment.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _bookedEquipment.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_bookedEquipment.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _bookedEquipment.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_bookedEquipment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_bookedEquipment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_bookedEquipment.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BookedEquipmentWrapper((BookedEquipment)_bookedEquipment.clone());
	}

	@Override
	public int compareTo(
		com.liferay.sample.model.BookedEquipment bookedEquipment) {
		return _bookedEquipment.compareTo(bookedEquipment);
	}

	@Override
	public int hashCode() {
		return _bookedEquipment.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.sample.model.BookedEquipment> toCacheModel() {
		return _bookedEquipment.toCacheModel();
	}

	@Override
	public com.liferay.sample.model.BookedEquipment toEscapedModel() {
		return new BookedEquipmentWrapper(_bookedEquipment.toEscapedModel());
	}

	@Override
	public com.liferay.sample.model.BookedEquipment toUnescapedModel() {
		return new BookedEquipmentWrapper(_bookedEquipment.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _bookedEquipment.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _bookedEquipment.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_bookedEquipment.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BookedEquipmentWrapper)) {
			return false;
		}

		BookedEquipmentWrapper bookedEquipmentWrapper = (BookedEquipmentWrapper)obj;

		if (Validator.equals(_bookedEquipment,
					bookedEquipmentWrapper._bookedEquipment)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public BookedEquipment getWrappedBookedEquipment() {
		return _bookedEquipment;
	}

	@Override
	public BookedEquipment getWrappedModel() {
		return _bookedEquipment;
	}

	@Override
	public void resetOriginalValues() {
		_bookedEquipment.resetOriginalValues();
	}

	private BookedEquipment _bookedEquipment;
}