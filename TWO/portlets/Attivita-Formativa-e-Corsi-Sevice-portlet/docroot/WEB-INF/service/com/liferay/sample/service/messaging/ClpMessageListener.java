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

package com.liferay.sample.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.liferay.sample.service.BookedEquipmentLocalServiceUtil;
import com.liferay.sample.service.ClpSerializer;
import com.liferay.sample.service.EquipmentLocalServiceUtil;
import com.liferay.sample.service.suiluppo_applicationLocalServiceUtil;
import com.liferay.sample.service.suiluppo_courseLocalServiceUtil;
import com.liferay.sample.service.suiluppo_roomLocalServiceUtil;
import com.liferay.sample.service.suiluppo_room_allocationLocalServiceUtil;
import com.liferay.sample.service.suiluppo_room_allocation_archiveLocalServiceUtil;

/**
 * @author Naveen Kumar
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			BookedEquipmentLocalServiceUtil.clearService();

			EquipmentLocalServiceUtil.clearService();

			suiluppo_applicationLocalServiceUtil.clearService();

			suiluppo_courseLocalServiceUtil.clearService();

			suiluppo_roomLocalServiceUtil.clearService();

			suiluppo_room_allocationLocalServiceUtil.clearService();

			suiluppo_room_allocation_archiveLocalServiceUtil.clearService();
		}
	}
}