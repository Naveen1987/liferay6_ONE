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

package com.liferay.daffo.service.persistence;

import com.liferay.daffo.model.News_Blogs;
import com.liferay.daffo.service.News_BlogsLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Naveen Kumar
 * @generated
 */
public abstract class News_BlogsActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public News_BlogsActionableDynamicQuery() throws SystemException {
		setBaseLocalService(News_BlogsLocalServiceUtil.getService());
		setClass(News_Blogs.class);

		setClassLoader(com.liferay.daffo.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("News_Blogs_Id");
	}
}