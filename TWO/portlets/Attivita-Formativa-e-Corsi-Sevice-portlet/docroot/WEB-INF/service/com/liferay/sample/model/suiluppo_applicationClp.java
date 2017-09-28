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
import com.liferay.sample.service.suiluppo_applicationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Naveen Kumar
 */
public class suiluppo_applicationClp extends BaseModelImpl<suiluppo_application>
	implements suiluppo_application {
	public suiluppo_applicationClp() {
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
	public long getPrimaryKey() {
		return _applicat_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setApplicat_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _applicat_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getApplicat_id() {
		return _applicat_id;
	}

	@Override
	public void setApplicat_id(long applicat_id) {
		_applicat_id = applicat_id;

		if (_suiluppo_applicationRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_applicationRemoteModel.getClass();

				Method method = clazz.getMethod("setApplicat_id", long.class);

				method.invoke(_suiluppo_applicationRemoteModel, applicat_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApplicat_name() {
		return _applicat_name;
	}

	@Override
	public void setApplicat_name(String applicat_name) {
		_applicat_name = applicat_name;

		if (_suiluppo_applicationRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_applicationRemoteModel.getClass();

				Method method = clazz.getMethod("setApplicat_name", String.class);

				method.invoke(_suiluppo_applicationRemoteModel, applicat_name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApplicat_email() {
		return _applicat_email;
	}

	@Override
	public void setApplicat_email(String applicat_email) {
		_applicat_email = applicat_email;

		if (_suiluppo_applicationRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_applicationRemoteModel.getClass();

				Method method = clazz.getMethod("setApplicat_email",
						String.class);

				method.invoke(_suiluppo_applicationRemoteModel, applicat_email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApplicat_phone() {
		return _applicat_phone;
	}

	@Override
	public void setApplicat_phone(String applicat_phone) {
		_applicat_phone = applicat_phone;

		if (_suiluppo_applicationRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_applicationRemoteModel.getClass();

				Method method = clazz.getMethod("setApplicat_phone",
						String.class);

				method.invoke(_suiluppo_applicationRemoteModel, applicat_phone);
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

		if (_suiluppo_applicationRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_applicationRemoteModel.getClass();

				Method method = clazz.getMethod("setCourse_id", long.class);

				method.invoke(_suiluppo_applicationRemoteModel, course_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApplicat_confirm() {
		return _applicat_confirm;
	}

	@Override
	public void setApplicat_confirm(String applicat_confirm) {
		_applicat_confirm = applicat_confirm;

		if (_suiluppo_applicationRemoteModel != null) {
			try {
				Class<?> clazz = _suiluppo_applicationRemoteModel.getClass();

				Method method = clazz.getMethod("setApplicat_confirm",
						String.class);

				method.invoke(_suiluppo_applicationRemoteModel, applicat_confirm);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getsuiluppo_applicationRemoteModel() {
		return _suiluppo_applicationRemoteModel;
	}

	public void setsuiluppo_applicationRemoteModel(
		BaseModel<?> suiluppo_applicationRemoteModel) {
		_suiluppo_applicationRemoteModel = suiluppo_applicationRemoteModel;
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

		Class<?> remoteModelClass = _suiluppo_applicationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_suiluppo_applicationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			suiluppo_applicationLocalServiceUtil.addsuiluppo_application(this);
		}
		else {
			suiluppo_applicationLocalServiceUtil.updatesuiluppo_application(this);
		}
	}

	@Override
	public suiluppo_application toEscapedModel() {
		return (suiluppo_application)ProxyUtil.newProxyInstance(suiluppo_application.class.getClassLoader(),
			new Class[] { suiluppo_application.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		suiluppo_applicationClp clone = new suiluppo_applicationClp();

		clone.setApplicat_id(getApplicat_id());
		clone.setApplicat_name(getApplicat_name());
		clone.setApplicat_email(getApplicat_email());
		clone.setApplicat_phone(getApplicat_phone());
		clone.setCourse_id(getCourse_id());
		clone.setApplicat_confirm(getApplicat_confirm());

		return clone;
	}

	@Override
	public int compareTo(suiluppo_application suiluppo_application) {
		long primaryKey = suiluppo_application.getPrimaryKey();

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

		if (!(obj instanceof suiluppo_applicationClp)) {
			return false;
		}

		suiluppo_applicationClp suiluppo_application = (suiluppo_applicationClp)obj;

		long primaryKey = suiluppo_application.getPrimaryKey();

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

		sb.append("{applicat_id=");
		sb.append(getApplicat_id());
		sb.append(", applicat_name=");
		sb.append(getApplicat_name());
		sb.append(", applicat_email=");
		sb.append(getApplicat_email());
		sb.append(", applicat_phone=");
		sb.append(getApplicat_phone());
		sb.append(", course_id=");
		sb.append(getCourse_id());
		sb.append(", applicat_confirm=");
		sb.append(getApplicat_confirm());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.liferay.sample.model.suiluppo_application");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>applicat_id</column-name><column-value><![CDATA[");
		sb.append(getApplicat_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applicat_name</column-name><column-value><![CDATA[");
		sb.append(getApplicat_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applicat_email</column-name><column-value><![CDATA[");
		sb.append(getApplicat_email());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applicat_phone</column-name><column-value><![CDATA[");
		sb.append(getApplicat_phone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>course_id</column-name><column-value><![CDATA[");
		sb.append(getCourse_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applicat_confirm</column-name><column-value><![CDATA[");
		sb.append(getApplicat_confirm());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _applicat_id;
	private String _applicat_name;
	private String _applicat_email;
	private String _applicat_phone;
	private long _course_id;
	private String _applicat_confirm;
	private BaseModel<?> _suiluppo_applicationRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.sample.service.ClpSerializer.class;
}