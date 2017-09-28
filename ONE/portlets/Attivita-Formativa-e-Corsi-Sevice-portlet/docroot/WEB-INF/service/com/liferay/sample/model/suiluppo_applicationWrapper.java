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
 * This class is a wrapper for {@link suiluppo_application}.
 * </p>
 *
 * @author Naveen Kumar
 * @see suiluppo_application
 * @generated
 */
public class suiluppo_applicationWrapper implements suiluppo_application,
	ModelWrapper<suiluppo_application> {
	public suiluppo_applicationWrapper(
		suiluppo_application suiluppo_application) {
		_suiluppo_application = suiluppo_application;
	}

	@Override
	public Class<?> getModelClass() {
		return suiluppo_application.class;
	}

	@Override
	public String getModelClassName() {
		return suiluppo_application.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("applicat_id", getApplicat_id());
		attributes.put("applicat_name", getApplicat_name());
		attributes.put("applicat_email", getApplicat_email());
		attributes.put("applicat_phone", getApplicat_phone());
		attributes.put("course_id", getCourse_id());
		attributes.put("applicat_confirm", getApplicat_confirm());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long applicat_id = (Long)attributes.get("applicat_id");

		if (applicat_id != null) {
			setApplicat_id(applicat_id);
		}

		String applicat_name = (String)attributes.get("applicat_name");

		if (applicat_name != null) {
			setApplicat_name(applicat_name);
		}

		String applicat_email = (String)attributes.get("applicat_email");

		if (applicat_email != null) {
			setApplicat_email(applicat_email);
		}

		String applicat_phone = (String)attributes.get("applicat_phone");

		if (applicat_phone != null) {
			setApplicat_phone(applicat_phone);
		}

		Long course_id = (Long)attributes.get("course_id");

		if (course_id != null) {
			setCourse_id(course_id);
		}

		String applicat_confirm = (String)attributes.get("applicat_confirm");

		if (applicat_confirm != null) {
			setApplicat_confirm(applicat_confirm);
		}
	}

	/**
	* Returns the primary key of this suiluppo_application.
	*
	* @return the primary key of this suiluppo_application
	*/
	@Override
	public long getPrimaryKey() {
		return _suiluppo_application.getPrimaryKey();
	}

	/**
	* Sets the primary key of this suiluppo_application.
	*
	* @param primaryKey the primary key of this suiluppo_application
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_suiluppo_application.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the applicat_id of this suiluppo_application.
	*
	* @return the applicat_id of this suiluppo_application
	*/
	@Override
	public long getApplicat_id() {
		return _suiluppo_application.getApplicat_id();
	}

	/**
	* Sets the applicat_id of this suiluppo_application.
	*
	* @param applicat_id the applicat_id of this suiluppo_application
	*/
	@Override
	public void setApplicat_id(long applicat_id) {
		_suiluppo_application.setApplicat_id(applicat_id);
	}

	/**
	* Returns the applicat_name of this suiluppo_application.
	*
	* @return the applicat_name of this suiluppo_application
	*/
	@Override
	public java.lang.String getApplicat_name() {
		return _suiluppo_application.getApplicat_name();
	}

	/**
	* Sets the applicat_name of this suiluppo_application.
	*
	* @param applicat_name the applicat_name of this suiluppo_application
	*/
	@Override
	public void setApplicat_name(java.lang.String applicat_name) {
		_suiluppo_application.setApplicat_name(applicat_name);
	}

	/**
	* Returns the applicat_email of this suiluppo_application.
	*
	* @return the applicat_email of this suiluppo_application
	*/
	@Override
	public java.lang.String getApplicat_email() {
		return _suiluppo_application.getApplicat_email();
	}

	/**
	* Sets the applicat_email of this suiluppo_application.
	*
	* @param applicat_email the applicat_email of this suiluppo_application
	*/
	@Override
	public void setApplicat_email(java.lang.String applicat_email) {
		_suiluppo_application.setApplicat_email(applicat_email);
	}

	/**
	* Returns the applicat_phone of this suiluppo_application.
	*
	* @return the applicat_phone of this suiluppo_application
	*/
	@Override
	public java.lang.String getApplicat_phone() {
		return _suiluppo_application.getApplicat_phone();
	}

	/**
	* Sets the applicat_phone of this suiluppo_application.
	*
	* @param applicat_phone the applicat_phone of this suiluppo_application
	*/
	@Override
	public void setApplicat_phone(java.lang.String applicat_phone) {
		_suiluppo_application.setApplicat_phone(applicat_phone);
	}

	/**
	* Returns the course_id of this suiluppo_application.
	*
	* @return the course_id of this suiluppo_application
	*/
	@Override
	public long getCourse_id() {
		return _suiluppo_application.getCourse_id();
	}

	/**
	* Sets the course_id of this suiluppo_application.
	*
	* @param course_id the course_id of this suiluppo_application
	*/
	@Override
	public void setCourse_id(long course_id) {
		_suiluppo_application.setCourse_id(course_id);
	}

	/**
	* Returns the applicat_confirm of this suiluppo_application.
	*
	* @return the applicat_confirm of this suiluppo_application
	*/
	@Override
	public java.lang.String getApplicat_confirm() {
		return _suiluppo_application.getApplicat_confirm();
	}

	/**
	* Sets the applicat_confirm of this suiluppo_application.
	*
	* @param applicat_confirm the applicat_confirm of this suiluppo_application
	*/
	@Override
	public void setApplicat_confirm(java.lang.String applicat_confirm) {
		_suiluppo_application.setApplicat_confirm(applicat_confirm);
	}

	@Override
	public boolean isNew() {
		return _suiluppo_application.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_suiluppo_application.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _suiluppo_application.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_suiluppo_application.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _suiluppo_application.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _suiluppo_application.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_suiluppo_application.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _suiluppo_application.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_suiluppo_application.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_suiluppo_application.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_suiluppo_application.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new suiluppo_applicationWrapper((suiluppo_application)_suiluppo_application.clone());
	}

	@Override
	public int compareTo(
		com.liferay.sample.model.suiluppo_application suiluppo_application) {
		return _suiluppo_application.compareTo(suiluppo_application);
	}

	@Override
	public int hashCode() {
		return _suiluppo_application.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.sample.model.suiluppo_application> toCacheModel() {
		return _suiluppo_application.toCacheModel();
	}

	@Override
	public com.liferay.sample.model.suiluppo_application toEscapedModel() {
		return new suiluppo_applicationWrapper(_suiluppo_application.toEscapedModel());
	}

	@Override
	public com.liferay.sample.model.suiluppo_application toUnescapedModel() {
		return new suiluppo_applicationWrapper(_suiluppo_application.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _suiluppo_application.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _suiluppo_application.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_suiluppo_application.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof suiluppo_applicationWrapper)) {
			return false;
		}

		suiluppo_applicationWrapper suiluppo_applicationWrapper = (suiluppo_applicationWrapper)obj;

		if (Validator.equals(_suiluppo_application,
					suiluppo_applicationWrapper._suiluppo_application)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public suiluppo_application getWrappedsuiluppo_application() {
		return _suiluppo_application;
	}

	@Override
	public suiluppo_application getWrappedModel() {
		return _suiluppo_application;
	}

	@Override
	public void resetOriginalValues() {
		_suiluppo_application.resetOriginalValues();
	}

	private suiluppo_application _suiluppo_application;
}