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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link News_Blogs}.
 * </p>
 *
 * @author Naveen Kumar
 * @see News_Blogs
 * @generated
 */
public class News_BlogsWrapper implements News_Blogs, ModelWrapper<News_Blogs> {
	public News_BlogsWrapper(News_Blogs news_Blogs) {
		_news_Blogs = news_Blogs;
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

	/**
	* Returns the primary key of this news_ blogs.
	*
	* @return the primary key of this news_ blogs
	*/
	@Override
	public long getPrimaryKey() {
		return _news_Blogs.getPrimaryKey();
	}

	/**
	* Sets the primary key of this news_ blogs.
	*
	* @param primaryKey the primary key of this news_ blogs
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_news_Blogs.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the news_ blogs_ ID of this news_ blogs.
	*
	* @return the news_ blogs_ ID of this news_ blogs
	*/
	@Override
	public long getNews_Blogs_Id() {
		return _news_Blogs.getNews_Blogs_Id();
	}

	/**
	* Sets the news_ blogs_ ID of this news_ blogs.
	*
	* @param News_Blogs_Id the news_ blogs_ ID of this news_ blogs
	*/
	@Override
	public void setNews_Blogs_Id(long News_Blogs_Id) {
		_news_Blogs.setNews_Blogs_Id(News_Blogs_Id);
	}

	/**
	* Returns the title of this news_ blogs.
	*
	* @return the title of this news_ blogs
	*/
	@Override
	public java.lang.String getTitle() {
		return _news_Blogs.getTitle();
	}

	/**
	* Sets the title of this news_ blogs.
	*
	* @param title the title of this news_ blogs
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_news_Blogs.setTitle(title);
	}

	/**
	* Returns the body of this news_ blogs.
	*
	* @return the body of this news_ blogs
	*/
	@Override
	public java.lang.String getBody() {
		return _news_Blogs.getBody();
	}

	/**
	* Sets the body of this news_ blogs.
	*
	* @param body the body of this news_ blogs
	*/
	@Override
	public void setBody(java.lang.String body) {
		_news_Blogs.setBody(body);
	}

	/**
	* Returns the publish_ date of this news_ blogs.
	*
	* @return the publish_ date of this news_ blogs
	*/
	@Override
	public java.util.Date getPublish_Date() {
		return _news_Blogs.getPublish_Date();
	}

	/**
	* Sets the publish_ date of this news_ blogs.
	*
	* @param Publish_Date the publish_ date of this news_ blogs
	*/
	@Override
	public void setPublish_Date(java.util.Date Publish_Date) {
		_news_Blogs.setPublish_Date(Publish_Date);
	}

	/**
	* Returns the expiration_ date of this news_ blogs.
	*
	* @return the expiration_ date of this news_ blogs
	*/
	@Override
	public java.util.Date getExpiration_Date() {
		return _news_Blogs.getExpiration_Date();
	}

	/**
	* Sets the expiration_ date of this news_ blogs.
	*
	* @param Expiration_Date the expiration_ date of this news_ blogs
	*/
	@Override
	public void setExpiration_Date(java.util.Date Expiration_Date) {
		_news_Blogs.setExpiration_Date(Expiration_Date);
	}

	/**
	* Returns the author of this news_ blogs.
	*
	* @return the author of this news_ blogs
	*/
	@Override
	public java.lang.String getAuthor() {
		return _news_Blogs.getAuthor();
	}

	/**
	* Sets the author of this news_ blogs.
	*
	* @param author the author of this news_ blogs
	*/
	@Override
	public void setAuthor(java.lang.String author) {
		_news_Blogs.setAuthor(author);
	}

	/**
	* Returns the visible of this news_ blogs.
	*
	* @return the visible of this news_ blogs
	*/
	@Override
	public java.lang.String getVisible() {
		return _news_Blogs.getVisible();
	}

	/**
	* Sets the visible of this news_ blogs.
	*
	* @param visible the visible of this news_ blogs
	*/
	@Override
	public void setVisible(java.lang.String visible) {
		_news_Blogs.setVisible(visible);
	}

	@Override
	public boolean isNew() {
		return _news_Blogs.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_news_Blogs.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _news_Blogs.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_news_Blogs.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _news_Blogs.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _news_Blogs.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_news_Blogs.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _news_Blogs.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_news_Blogs.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_news_Blogs.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_news_Blogs.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new News_BlogsWrapper((News_Blogs)_news_Blogs.clone());
	}

	@Override
	public int compareTo(com.liferay.daffo.model.News_Blogs news_Blogs) {
		return _news_Blogs.compareTo(news_Blogs);
	}

	@Override
	public int hashCode() {
		return _news_Blogs.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.daffo.model.News_Blogs> toCacheModel() {
		return _news_Blogs.toCacheModel();
	}

	@Override
	public com.liferay.daffo.model.News_Blogs toEscapedModel() {
		return new News_BlogsWrapper(_news_Blogs.toEscapedModel());
	}

	@Override
	public com.liferay.daffo.model.News_Blogs toUnescapedModel() {
		return new News_BlogsWrapper(_news_Blogs.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _news_Blogs.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _news_Blogs.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_news_Blogs.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof News_BlogsWrapper)) {
			return false;
		}

		News_BlogsWrapper news_BlogsWrapper = (News_BlogsWrapper)obj;

		if (Validator.equals(_news_Blogs, news_BlogsWrapper._news_Blogs)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public News_Blogs getWrappedNews_Blogs() {
		return _news_Blogs;
	}

	@Override
	public News_Blogs getWrappedModel() {
		return _news_Blogs;
	}

	@Override
	public void resetOriginalValues() {
		_news_Blogs.resetOriginalValues();
	}

	private News_Blogs _news_Blogs;
}