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
 * This class is a wrapper for {@link Equipment}.
 * </p>
 *
 * @author Naveen Kumar
 * @see Equipment
 * @generated
 */
public class EquipmentWrapper implements Equipment, ModelWrapper<Equipment> {
	public EquipmentWrapper(Equipment equipment) {
		_equipment = equipment;
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

	/**
	* Returns the primary key of this equipment.
	*
	* @return the primary key of this equipment
	*/
	@Override
	public long getPrimaryKey() {
		return _equipment.getPrimaryKey();
	}

	/**
	* Sets the primary key of this equipment.
	*
	* @param primaryKey the primary key of this equipment
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_equipment.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the equip_id of this equipment.
	*
	* @return the equip_id of this equipment
	*/
	@Override
	public long getEquip_id() {
		return _equipment.getEquip_id();
	}

	/**
	* Sets the equip_id of this equipment.
	*
	* @param equip_id the equip_id of this equipment
	*/
	@Override
	public void setEquip_id(long equip_id) {
		_equipment.setEquip_id(equip_id);
	}

	/**
	* Returns the equipment_name of this equipment.
	*
	* @return the equipment_name of this equipment
	*/
	@Override
	public java.lang.String getEquipment_name() {
		return _equipment.getEquipment_name();
	}

	/**
	* Sets the equipment_name of this equipment.
	*
	* @param equipment_name the equipment_name of this equipment
	*/
	@Override
	public void setEquipment_name(java.lang.String equipment_name) {
		_equipment.setEquipment_name(equipment_name);
	}

	/**
	* Returns the equip_quantity of this equipment.
	*
	* @return the equip_quantity of this equipment
	*/
	@Override
	public int getEquip_quantity() {
		return _equipment.getEquip_quantity();
	}

	/**
	* Sets the equip_quantity of this equipment.
	*
	* @param equip_quantity the equip_quantity of this equipment
	*/
	@Override
	public void setEquip_quantity(int equip_quantity) {
		_equipment.setEquip_quantity(equip_quantity);
	}

	/**
	* Returns the equip_description of this equipment.
	*
	* @return the equip_description of this equipment
	*/
	@Override
	public java.lang.String getEquip_description() {
		return _equipment.getEquip_description();
	}

	/**
	* Sets the equip_description of this equipment.
	*
	* @param equip_description the equip_description of this equipment
	*/
	@Override
	public void setEquip_description(java.lang.String equip_description) {
		_equipment.setEquip_description(equip_description);
	}

	/**
	* Returns the equip_status of this equipment.
	*
	* @return the equip_status of this equipment
	*/
	@Override
	public boolean getEquip_status() {
		return _equipment.getEquip_status();
	}

	/**
	* Returns <code>true</code> if this equipment is equip_status.
	*
	* @return <code>true</code> if this equipment is equip_status; <code>false</code> otherwise
	*/
	@Override
	public boolean isEquip_status() {
		return _equipment.isEquip_status();
	}

	/**
	* Sets whether this equipment is equip_status.
	*
	* @param equip_status the equip_status of this equipment
	*/
	@Override
	public void setEquip_status(boolean equip_status) {
		_equipment.setEquip_status(equip_status);
	}

	@Override
	public boolean isNew() {
		return _equipment.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_equipment.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _equipment.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_equipment.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _equipment.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _equipment.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_equipment.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _equipment.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_equipment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_equipment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_equipment.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EquipmentWrapper((Equipment)_equipment.clone());
	}

	@Override
	public int compareTo(com.liferay.sample.model.Equipment equipment) {
		return _equipment.compareTo(equipment);
	}

	@Override
	public int hashCode() {
		return _equipment.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.sample.model.Equipment> toCacheModel() {
		return _equipment.toCacheModel();
	}

	@Override
	public com.liferay.sample.model.Equipment toEscapedModel() {
		return new EquipmentWrapper(_equipment.toEscapedModel());
	}

	@Override
	public com.liferay.sample.model.Equipment toUnescapedModel() {
		return new EquipmentWrapper(_equipment.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _equipment.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _equipment.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_equipment.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EquipmentWrapper)) {
			return false;
		}

		EquipmentWrapper equipmentWrapper = (EquipmentWrapper)obj;

		if (Validator.equals(_equipment, equipmentWrapper._equipment)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Equipment getWrappedEquipment() {
		return _equipment;
	}

	@Override
	public Equipment getWrappedModel() {
		return _equipment;
	}

	@Override
	public void resetOriginalValues() {
		_equipment.resetOriginalValues();
	}

	private Equipment _equipment;
}