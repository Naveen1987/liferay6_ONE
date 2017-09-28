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

package com.liferay.sample.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.sample.model.suiluppo_application;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing suiluppo_application in entity cache.
 *
 * @author Naveen Kumar
 * @see suiluppo_application
 * @generated
 */
public class suiluppo_applicationCacheModel implements CacheModel<suiluppo_application>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{applicat_id=");
		sb.append(applicat_id);
		sb.append(", applicat_name=");
		sb.append(applicat_name);
		sb.append(", applicat_email=");
		sb.append(applicat_email);
		sb.append(", applicat_phone=");
		sb.append(applicat_phone);
		sb.append(", course_id=");
		sb.append(course_id);
		sb.append(", applicat_confirm=");
		sb.append(applicat_confirm);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public suiluppo_application toEntityModel() {
		suiluppo_applicationImpl suiluppo_applicationImpl = new suiluppo_applicationImpl();

		suiluppo_applicationImpl.setApplicat_id(applicat_id);

		if (applicat_name == null) {
			suiluppo_applicationImpl.setApplicat_name(StringPool.BLANK);
		}
		else {
			suiluppo_applicationImpl.setApplicat_name(applicat_name);
		}

		if (applicat_email == null) {
			suiluppo_applicationImpl.setApplicat_email(StringPool.BLANK);
		}
		else {
			suiluppo_applicationImpl.setApplicat_email(applicat_email);
		}

		if (applicat_phone == null) {
			suiluppo_applicationImpl.setApplicat_phone(StringPool.BLANK);
		}
		else {
			suiluppo_applicationImpl.setApplicat_phone(applicat_phone);
		}

		suiluppo_applicationImpl.setCourse_id(course_id);

		if (applicat_confirm == null) {
			suiluppo_applicationImpl.setApplicat_confirm(StringPool.BLANK);
		}
		else {
			suiluppo_applicationImpl.setApplicat_confirm(applicat_confirm);
		}

		suiluppo_applicationImpl.resetOriginalValues();

		return suiluppo_applicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		applicat_id = objectInput.readLong();
		applicat_name = objectInput.readUTF();
		applicat_email = objectInput.readUTF();
		applicat_phone = objectInput.readUTF();
		course_id = objectInput.readLong();
		applicat_confirm = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(applicat_id);

		if (applicat_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicat_name);
		}

		if (applicat_email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicat_email);
		}

		if (applicat_phone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicat_phone);
		}

		objectOutput.writeLong(course_id);

		if (applicat_confirm == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicat_confirm);
		}
	}

	public long applicat_id;
	public String applicat_name;
	public String applicat_email;
	public String applicat_phone;
	public long course_id;
	public String applicat_confirm;
}