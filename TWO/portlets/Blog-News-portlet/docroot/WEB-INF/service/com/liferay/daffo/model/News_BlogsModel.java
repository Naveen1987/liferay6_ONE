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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the News_Blogs service. Represents a row in the &quot;News_Blogs&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.daffo.model.impl.News_BlogsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.daffo.model.impl.News_BlogsImpl}.
 * </p>
 *
 * @author Naveen Kumar
 * @see News_Blogs
 * @see com.liferay.daffo.model.impl.News_BlogsImpl
 * @see com.liferay.daffo.model.impl.News_BlogsModelImpl
 * @generated
 */
public interface News_BlogsModel extends BaseModel<News_Blogs> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a news_ blogs model instance should use the {@link News_Blogs} interface instead.
	 */

	/**
	 * Returns the primary key of this news_ blogs.
	 *
	 * @return the primary key of this news_ blogs
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this news_ blogs.
	 *
	 * @param primaryKey the primary key of this news_ blogs
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the news_ blogs_ ID of this news_ blogs.
	 *
	 * @return the news_ blogs_ ID of this news_ blogs
	 */
	public long getNews_Blogs_Id();

	/**
	 * Sets the news_ blogs_ ID of this news_ blogs.
	 *
	 * @param News_Blogs_Id the news_ blogs_ ID of this news_ blogs
	 */
	public void setNews_Blogs_Id(long News_Blogs_Id);

	/**
	 * Returns the title of this news_ blogs.
	 *
	 * @return the title of this news_ blogs
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this news_ blogs.
	 *
	 * @param title the title of this news_ blogs
	 */
	public void setTitle(String title);

	/**
	 * Returns the body of this news_ blogs.
	 *
	 * @return the body of this news_ blogs
	 */
	@AutoEscape
	public String getBody();

	/**
	 * Sets the body of this news_ blogs.
	 *
	 * @param body the body of this news_ blogs
	 */
	public void setBody(String body);

	/**
	 * Returns the publish_ date of this news_ blogs.
	 *
	 * @return the publish_ date of this news_ blogs
	 */
	public Date getPublish_Date();

	/**
	 * Sets the publish_ date of this news_ blogs.
	 *
	 * @param Publish_Date the publish_ date of this news_ blogs
	 */
	public void setPublish_Date(Date Publish_Date);

	/**
	 * Returns the expiration_ date of this news_ blogs.
	 *
	 * @return the expiration_ date of this news_ blogs
	 */
	public Date getExpiration_Date();

	/**
	 * Sets the expiration_ date of this news_ blogs.
	 *
	 * @param Expiration_Date the expiration_ date of this news_ blogs
	 */
	public void setExpiration_Date(Date Expiration_Date);

	/**
	 * Returns the author of this news_ blogs.
	 *
	 * @return the author of this news_ blogs
	 */
	@AutoEscape
	public String getAuthor();

	/**
	 * Sets the author of this news_ blogs.
	 *
	 * @param author the author of this news_ blogs
	 */
	public void setAuthor(String author);

	/**
	 * Returns the visible of this news_ blogs.
	 *
	 * @return the visible of this news_ blogs
	 */
	@AutoEscape
	public String getVisible();

	/**
	 * Sets the visible of this news_ blogs.
	 *
	 * @param visible the visible of this news_ blogs
	 */
	public void setVisible(String visible);

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
	public int compareTo(com.liferay.daffo.model.News_Blogs news_Blogs);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.daffo.model.News_Blogs> toCacheModel();

	@Override
	public com.liferay.daffo.model.News_Blogs toEscapedModel();

	@Override
	public com.liferay.daffo.model.News_Blogs toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}