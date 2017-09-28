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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Equipment service. Represents a row in the &quot;equipment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.sample.model.impl.EquipmentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.sample.model.impl.EquipmentImpl}.
 * </p>
 *
 * @author Naveen Kumar
 * @see Equipment
 * @see com.liferay.sample.model.impl.EquipmentImpl
 * @see com.liferay.sample.model.impl.EquipmentModelImpl
 * @generated
 */
public interface EquipmentModel extends BaseModel<Equipment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a equipment model instance should use the {@link Equipment} interface instead.
	 */

	/**
	 * Returns the primary key of this equipment.
	 *
	 * @return the primary key of this equipment
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this equipment.
	 *
	 * @param primaryKey the primary key of this equipment
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the equip_id of this equipment.
	 *
	 * @return the equip_id of this equipment
	 */
	public long getEquip_id();

	/**
	 * Sets the equip_id of this equipment.
	 *
	 * @param equip_id the equip_id of this equipment
	 */
	public void setEquip_id(long equip_id);

	/**
	 * Returns the equipment_name of this equipment.
	 *
	 * @return the equipment_name of this equipment
	 */
	@AutoEscape
	public String getEquipment_name();

	/**
	 * Sets the equipment_name of this equipment.
	 *
	 * @param equipment_name the equipment_name of this equipment
	 */
	public void setEquipment_name(String equipment_name);

	/**
	 * Returns the equip_quantity of this equipment.
	 *
	 * @return the equip_quantity of this equipment
	 */
	public int getEquip_quantity();

	/**
	 * Sets the equip_quantity of this equipment.
	 *
	 * @param equip_quantity the equip_quantity of this equipment
	 */
	public void setEquip_quantity(int equip_quantity);

	/**
	 * Returns the equip_description of this equipment.
	 *
	 * @return the equip_description of this equipment
	 */
	@AutoEscape
	public String getEquip_description();

	/**
	 * Sets the equip_description of this equipment.
	 *
	 * @param equip_description the equip_description of this equipment
	 */
	public void setEquip_description(String equip_description);

	/**
	 * Returns the equip_status of this equipment.
	 *
	 * @return the equip_status of this equipment
	 */
	public boolean getEquip_status();

	/**
	 * Returns <code>true</code> if this equipment is equip_status.
	 *
	 * @return <code>true</code> if this equipment is equip_status; <code>false</code> otherwise
	 */
	public boolean isEquip_status();

	/**
	 * Sets whether this equipment is equip_status.
	 *
	 * @param equip_status the equip_status of this equipment
	 */
	public void setEquip_status(boolean equip_status);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.liferay.sample.model.Equipment equipment);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.sample.model.Equipment> toCacheModel();

	@Override
	public com.liferay.sample.model.Equipment toEscapedModel();

	@Override
	public com.liferay.sample.model.Equipment toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}