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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Naveen Kumar
 * @generated
 */
public class News_BlogsSoap implements Serializable {
	public static News_BlogsSoap toSoapModel(News_Blogs model) {
		News_BlogsSoap soapModel = new News_BlogsSoap();

		soapModel.setNews_Blogs_Id(model.getNews_Blogs_Id());
		soapModel.setTitle(model.getTitle());
		soapModel.setBody(model.getBody());
		soapModel.setPublish_Date(model.getPublish_Date());
		soapModel.setExpiration_Date(model.getExpiration_Date());
		soapModel.setAuthor(model.getAuthor());
		soapModel.setVisible(model.getVisible());

		return soapModel;
	}

	public static News_BlogsSoap[] toSoapModels(News_Blogs[] models) {
		News_BlogsSoap[] soapModels = new News_BlogsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static News_BlogsSoap[][] toSoapModels(News_Blogs[][] models) {
		News_BlogsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new News_BlogsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new News_BlogsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static News_BlogsSoap[] toSoapModels(List<News_Blogs> models) {
		List<News_BlogsSoap> soapModels = new ArrayList<News_BlogsSoap>(models.size());

		for (News_Blogs model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new News_BlogsSoap[soapModels.size()]);
	}

	public News_BlogsSoap() {
	}

	public long getPrimaryKey() {
		return _News_Blogs_Id;
	}

	public void setPrimaryKey(long pk) {
		setNews_Blogs_Id(pk);
	}

	public long getNews_Blogs_Id() {
		return _News_Blogs_Id;
	}

	public void setNews_Blogs_Id(long News_Blogs_Id) {
		_News_Blogs_Id = News_Blogs_Id;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getBody() {
		return _body;
	}

	public void setBody(String body) {
		_body = body;
	}

	public Date getPublish_Date() {
		return _Publish_Date;
	}

	public void setPublish_Date(Date Publish_Date) {
		_Publish_Date = Publish_Date;
	}

	public Date getExpiration_Date() {
		return _Expiration_Date;
	}

	public void setExpiration_Date(Date Expiration_Date) {
		_Expiration_Date = Expiration_Date;
	}

	public String getAuthor() {
		return _author;
	}

	public void setAuthor(String author) {
		_author = author;
	}

	public String getVisible() {
		return _visible;
	}

	public void setVisible(String visible) {
		_visible = visible;
	}

	private long _News_Blogs_Id;
	private String _title;
	private String _body;
	private Date _Publish_Date;
	private Date _Expiration_Date;
	private String _author;
	private String _visible;
}