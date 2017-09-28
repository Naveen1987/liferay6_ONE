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

package com.liferay.daffo.model.impl;

import com.liferay.daffo.model.News_Blogs;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing News_Blogs in entity cache.
 *
 * @author Naveen Kumar
 * @see News_Blogs
 * @generated
 */
public class News_BlogsCacheModel implements CacheModel<News_Blogs>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{News_Blogs_Id=");
		sb.append(News_Blogs_Id);
		sb.append(", title=");
		sb.append(title);
		sb.append(", body=");
		sb.append(body);
		sb.append(", Publish_Date=");
		sb.append(Publish_Date);
		sb.append(", Expiration_Date=");
		sb.append(Expiration_Date);
		sb.append(", author=");
		sb.append(author);
		sb.append(", visible=");
		sb.append(visible);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public News_Blogs toEntityModel() {
		News_BlogsImpl news_BlogsImpl = new News_BlogsImpl();

		news_BlogsImpl.setNews_Blogs_Id(News_Blogs_Id);

		if (title == null) {
			news_BlogsImpl.setTitle(StringPool.BLANK);
		}
		else {
			news_BlogsImpl.setTitle(title);
		}

		if (body == null) {
			news_BlogsImpl.setBody(StringPool.BLANK);
		}
		else {
			news_BlogsImpl.setBody(body);
		}

		if (Publish_Date == Long.MIN_VALUE) {
			news_BlogsImpl.setPublish_Date(null);
		}
		else {
			news_BlogsImpl.setPublish_Date(new Date(Publish_Date));
		}

		if (Expiration_Date == Long.MIN_VALUE) {
			news_BlogsImpl.setExpiration_Date(null);
		}
		else {
			news_BlogsImpl.setExpiration_Date(new Date(Expiration_Date));
		}

		if (author == null) {
			news_BlogsImpl.setAuthor(StringPool.BLANK);
		}
		else {
			news_BlogsImpl.setAuthor(author);
		}

		if (visible == null) {
			news_BlogsImpl.setVisible(StringPool.BLANK);
		}
		else {
			news_BlogsImpl.setVisible(visible);
		}

		news_BlogsImpl.resetOriginalValues();

		return news_BlogsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		News_Blogs_Id = objectInput.readLong();
		title = objectInput.readUTF();
		body = objectInput.readUTF();
		Publish_Date = objectInput.readLong();
		Expiration_Date = objectInput.readLong();
		author = objectInput.readUTF();
		visible = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(News_Blogs_Id);

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (body == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(body);
		}

		objectOutput.writeLong(Publish_Date);
		objectOutput.writeLong(Expiration_Date);

		if (author == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(author);
		}

		if (visible == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(visible);
		}
	}

	public long News_Blogs_Id;
	public String title;
	public String body;
	public long Publish_Date;
	public long Expiration_Date;
	public String author;
	public String visible;
}