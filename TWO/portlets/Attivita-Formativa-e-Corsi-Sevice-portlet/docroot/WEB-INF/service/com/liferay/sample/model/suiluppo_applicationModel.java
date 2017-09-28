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
 * The base model interface for the suiluppo_application service. Represents a row in the &quot;suiluppo_application&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.sample.model.impl.suiluppo_applicationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.sample.model.impl.suiluppo_applicationImpl}.
 * </p>
 *
 * @author Naveen Kumar
 * @see suiluppo_application
 * @see com.liferay.sample.model.impl.suiluppo_applicationImpl
 * @see com.liferay.sample.model.impl.suiluppo_applicationModelImpl
 * @generated
 */
public interface suiluppo_applicationModel extends BaseModel<suiluppo_application> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a suiluppo_application model instance should use the {@link suiluppo_application} interface instead.
	 */

	/**
	 * Returns the primary key of this suiluppo_application.
	 *
	 * @return the primary key of this suiluppo_application
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this suiluppo_application.
	 *
	 * @param primaryKey the primary key of this suiluppo_application
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the applicat_id of this suiluppo_application.
	 *
	 * @return the applicat_id of this suiluppo_application
	 */
	public long getApplicat_id();

	/**
	 * Sets the applicat_id of this suiluppo_application.
	 *
	 * @param applicat_id the applicat_id of this suiluppo_application
	 */
	public void setApplicat_id(long applicat_id);

	/**
	 * Returns the applicat_name of this suiluppo_application.
	 *
	 * @return the applicat_name of this suiluppo_application
	 */
	@AutoEscape
	public String getApplicat_name();

	/**
	 * Sets the applicat_name of this suiluppo_application.
	 *
	 * @param applicat_name the applicat_name of this suiluppo_application
	 */
	public void setApplicat_name(String applicat_name);

	/**
	 * Returns the applicat_email of this suiluppo_application.
	 *
	 * @return the applicat_email of this suiluppo_application
	 */
	@AutoEscape
	public String getApplicat_email();

	/**
	 * Sets the applicat_email of this suiluppo_application.
	 *
	 * @param applicat_email the applicat_email of this suiluppo_application
	 */
	public void setApplicat_email(String applicat_email);

	/**
	 * Returns the applicat_phone of this suiluppo_application.
	 *
	 * @return the applicat_phone of this suiluppo_application
	 */
	@AutoEscape
	public String getApplicat_phone();

	/**
	 * Sets the applicat_phone of this suiluppo_application.
	 *
	 * @param applicat_phone the applicat_phone of this suiluppo_application
	 */
	public void setApplicat_phone(String applicat_phone);

	/**
	 * Returns the course_id of this suiluppo_application.
	 *
	 * @return the course_id of this suiluppo_application
	 */
	public long getCourse_id();

	/**
	 * Sets the course_id of this suiluppo_application.
	 *
	 * @param course_id the course_id of this suiluppo_application
	 */
	public void setCourse_id(long course_id);

	/**
	 * Returns the applicat_confirm of this suiluppo_application.
	 *
	 * @return the applicat_confirm of this suiluppo_application
	 */
	@AutoEscape
	public String getApplicat_confirm();

	/**
	 * Sets the applicat_confirm of this suiluppo_application.
	 *
	 * @param applicat_confirm the applicat_confirm of this suiluppo_application
	 */
	public void setApplicat_confirm(String applicat_confirm);

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
	public int compareTo(
		com.liferay.sample.model.suiluppo_application suiluppo_application);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.sample.model.suiluppo_application> toCacheModel();

	@Override
	public com.liferay.sample.model.suiluppo_application toEscapedModel();

	@Override
	public com.liferay.sample.model.suiluppo_application toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}