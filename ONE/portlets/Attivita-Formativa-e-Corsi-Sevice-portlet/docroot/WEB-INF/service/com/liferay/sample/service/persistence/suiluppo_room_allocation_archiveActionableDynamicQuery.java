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

package com.liferay.sample.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.sample.model.suiluppo_room_allocation_archive;
import com.liferay.sample.service.suiluppo_room_allocation_archiveLocalServiceUtil;

/**
 * @author Naveen Kumar
 * @generated
 */
public abstract class suiluppo_room_allocation_archiveActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public suiluppo_room_allocation_archiveActionableDynamicQuery()
		throws SystemException {
		setBaseLocalService(suiluppo_room_allocation_archiveLocalServiceUtil.getService());
		setClass(suiluppo_room_allocation_archive.class);

		setClassLoader(com.liferay.sample.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("room_allocat_archive_id");
	}
}