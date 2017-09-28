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

package com.liferay.daffo.model;

import com.liferay.daffo.service.ClpSerializer;
import com.liferay.daffo.service.News_BlogsLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Naveen Kumar
 */
public class News_BlogsClp extends BaseModelImpl<News_Blogs>
	implements News_Blogs {
	public News_BlogsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return News_Blogs.class;
	}

	@Override
	public String getModelClassName() {
		return News_Blogs.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _News_Blogs_Id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setNews_Blogs_Id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _News_Blogs_Id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("News_Blogs_Id", getNews_Blogs_Id());
		attributes.put("title", getTitle());
		attributes.put("body", getBody());
		attributes.put("Publish_Date", getPublish_Date());
		attributes.put("Expiration_Date", getExpiration_Date());
		attributes.put("author", getAuthor());
		attributes.put("visible", getVisible());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long News_Blogs_Id = (Long)attributes.get("News_Blogs_Id");

		if (News_Blogs_Id != null) {
			setNews_Blogs_Id(News_Blogs_Id);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String body = (String)attributes.get("body");

		if (body != null) {
			setBody(body);
		}

		Date Publish_Date = (Date)attributes.get("Publish_Date");

		if (Publish_Date != null) {
			setPublish_Date(Publish_Date);
		}

		Date Expiration_Date = (Date)attributes.get("Expiration_Date");

		if (Expiration_Date != null) {
			setExpiration_Date(Expiration_Date);
		}

		String author = (String)attributes.get("author");

		if (author != null) {
			setAuthor(author);
		}

		String visible = (String)attributes.get("visible");

		if (visible != null) {
			setVisible(visible);
		}
	}

	@Override
	public long getNews_Blogs_Id() {
		return _News_Blogs_Id;
	}

	@Override
	public void setNews_Blogs_Id(long News_Blogs_Id) {
		_News_Blogs_Id = News_Blogs_Id;

		if (_news_BlogsRemoteModel != null) {
			try {
				Class<?> clazz = _news_BlogsRemoteModel.getClass();

				Method method = clazz.getMethod("setNews_Blogs_Id", long.class);

				method.invoke(_news_BlogsRemoteModel, News_Blogs_Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTitle() {
		return _title;
	}

	@Override
	public void setTitle(String title) {
		_title = title;

		if (_news_BlogsRemoteModel != null) {
			try {
				Class<?> clazz = _news_BlogsRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_news_BlogsRemoteModel, title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBody() {
		return _body;
	}

	@Override
	public void setBody(String body) {
		_body = body;

		if (_news_BlogsRemoteModel != null) {
			try {
				Class<?> clazz = _news_BlogsRemoteModel.getClass();

				Method method = clazz.getMethod("setBody", String.class);

				method.invoke(_news_BlogsRemoteModel, body);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getPublish_Date() {
		return _Publish_Date;
	}

	@Override
	public void setPublish_Date(Date Publish_Date) {
		_Publish_Date = Publish_Date;

		if (_news_BlogsRemoteModel != null) {
			try {
				Class<?> clazz = _news_BlogsRemoteModel.getClass();

				Method method = clazz.getMethod("setPublish_Date", Date.class);

				method.invoke(_news_BlogsRemoteModel, Publish_Date);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getExpiration_Date() {
		return _Expiration_Date;
	}

	@Override
	public void setExpiration_Date(Date Expiration_Date) {
		_Expiration_Date = Expiration_Date;

		if (_news_BlogsRemoteModel != null) {
			try {
				Class<?> clazz = _news_BlogsRemoteModel.getClass();

				Method method = clazz.getMethod("setExpiration_Date", Date.class);

				method.invoke(_news_BlogsRemoteModel, Expiration_Date);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAuthor() {
		return _author;
	}

	@Override
	public void setAuthor(String author) {
		_author = author;

		if (_news_BlogsRemoteModel != null) {
			try {
				Class<?> clazz = _news_BlogsRemoteModel.getClass();

				Method method = clazz.getMethod("setAuthor", String.class);

				method.invoke(_news_BlogsRemoteModel, author);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVisible() {
		return _visible;
	}

	@Override
	public void setVisible(String visible) {
		_visible = visible;

		if (_news_BlogsRemoteModel != null) {
			try {
				Class<?> clazz = _news_BlogsRemoteModel.getClass();

				Method method = clazz.getMethod("setVisible", String.class);

				method.invoke(_news_BlogsRemoteModel, visible);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getNews_BlogsRemoteModel() {
		return _news_BlogsRemoteModel;
	}

	public void setNews_BlogsRemoteModel(BaseModel<?> news_BlogsRemoteModel) {
		_news_BlogsRemoteModel = news_BlogsRemoteModel;
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

		Class<?> remoteModelClass = _news_BlogsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_news_BlogsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			News_BlogsLocalServiceUtil.addNews_Blogs(this);
		}
		else {
			News_BlogsLocalServiceUtil.updateNews_Blogs(this);
		}
	}

	@Override
	public News_Blogs toEscapedModel() {
		return (News_Blogs)ProxyUtil.newProxyInstance(News_Blogs.class.getClassLoader(),
			new Class[] { News_Blogs.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		News_BlogsClp clone = new News_BlogsClp();

		clone.setNews_Blogs_Id(getNews_Blogs_Id());
		clone.setTitle(getTitle());
		clone.setBody(getBody());
		clone.setPublish_Date(getPublish_Date());
		clone.setExpiration_Date(getExpiration_Date());
		clone.setAuthor(getAuthor());
		clone.setVisible(getVisible());

		return clone;
	}

	@Override
	public int compareTo(News_Blogs news_Blogs) {
		long primaryKey = news_Blogs.getPrimaryKey();

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

		if (!(obj instanceof News_BlogsClp)) {
			return false;
		}

		News_BlogsClp news_Blogs = (News_BlogsClp)obj;

		long primaryKey = news_Blogs.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{News_Blogs_Id=");
		sb.append(getNews_Blogs_Id());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", body=");
		sb.append(getBody());
		sb.append(", Publish_Date=");
		sb.append(getPublish_Date());
		sb.append(", Expiration_Date=");
		sb.append(getExpiration_Date());
		sb.append(", author=");
		sb.append(getAuthor());
		sb.append(", visible=");
		sb.append(getVisible());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.liferay.daffo.model.News_Blogs");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>News_Blogs_Id</column-name><column-value><![CDATA[");
		sb.append(getNews_Blogs_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>body</column-name><column-value><![CDATA[");
		sb.append(getBody());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Publish_Date</column-name><column-value><![CDATA[");
		sb.append(getPublish_Date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Expiration_Date</column-name><column-value><![CDATA[");
		sb.append(getExpiration_Date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>author</column-name><column-value><![CDATA[");
		sb.append(getAuthor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>visible</column-name><column-value><![CDATA[");
		sb.append(getVisible());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _News_Blogs_Id;
	private String _title;
	private String _body;
	private Date _Publish_Date;
	private Date _Expiration_Date;
	private String _author;
	private String _visible;
	private BaseModel<?> _news_BlogsRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.daffo.service.ClpSerializer.class;
}