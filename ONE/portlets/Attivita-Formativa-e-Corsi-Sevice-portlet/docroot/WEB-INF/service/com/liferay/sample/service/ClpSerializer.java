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

package com.liferay.sample.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import com.liferay.sample.model.BookedEquipmentClp;
import com.liferay.sample.model.EquipmentClp;
import com.liferay.sample.model.suiluppo_applicationClp;
import com.liferay.sample.model.suiluppo_courseClp;
import com.liferay.sample.model.suiluppo_roomClp;
import com.liferay.sample.model.suiluppo_room_allocationClp;
import com.liferay.sample.model.suiluppo_room_allocation_archiveClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Naveen Kumar
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"Attivita-Formativa-e-Corsi-Sevice-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"Attivita-Formativa-e-Corsi-Sevice-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "Attivita-Formativa-e-Corsi-Sevice-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(BookedEquipmentClp.class.getName())) {
			return translateInputBookedEquipment(oldModel);
		}

		if (oldModelClassName.equals(EquipmentClp.class.getName())) {
			return translateInputEquipment(oldModel);
		}

		if (oldModelClassName.equals(suiluppo_applicationClp.class.getName())) {
			return translateInputsuiluppo_application(oldModel);
		}

		if (oldModelClassName.equals(suiluppo_courseClp.class.getName())) {
			return translateInputsuiluppo_course(oldModel);
		}

		if (oldModelClassName.equals(suiluppo_roomClp.class.getName())) {
			return translateInputsuiluppo_room(oldModel);
		}

		if (oldModelClassName.equals(
					suiluppo_room_allocationClp.class.getName())) {
			return translateInputsuiluppo_room_allocation(oldModel);
		}

		if (oldModelClassName.equals(
					suiluppo_room_allocation_archiveClp.class.getName())) {
			return translateInputsuiluppo_room_allocation_archive(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputBookedEquipment(BaseModel<?> oldModel) {
		BookedEquipmentClp oldClpModel = (BookedEquipmentClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getBookedEquipmentRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEquipment(BaseModel<?> oldModel) {
		EquipmentClp oldClpModel = (EquipmentClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEquipmentRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputsuiluppo_application(
		BaseModel<?> oldModel) {
		suiluppo_applicationClp oldClpModel = (suiluppo_applicationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getsuiluppo_applicationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputsuiluppo_course(BaseModel<?> oldModel) {
		suiluppo_courseClp oldClpModel = (suiluppo_courseClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getsuiluppo_courseRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputsuiluppo_room(BaseModel<?> oldModel) {
		suiluppo_roomClp oldClpModel = (suiluppo_roomClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getsuiluppo_roomRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputsuiluppo_room_allocation(
		BaseModel<?> oldModel) {
		suiluppo_room_allocationClp oldClpModel = (suiluppo_room_allocationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getsuiluppo_room_allocationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputsuiluppo_room_allocation_archive(
		BaseModel<?> oldModel) {
		suiluppo_room_allocation_archiveClp oldClpModel = (suiluppo_room_allocation_archiveClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getsuiluppo_room_allocation_archiveRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"com.liferay.sample.model.impl.BookedEquipmentImpl")) {
			return translateOutputBookedEquipment(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.liferay.sample.model.impl.EquipmentImpl")) {
			return translateOutputEquipment(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.liferay.sample.model.impl.suiluppo_applicationImpl")) {
			return translateOutputsuiluppo_application(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.liferay.sample.model.impl.suiluppo_courseImpl")) {
			return translateOutputsuiluppo_course(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.liferay.sample.model.impl.suiluppo_roomImpl")) {
			return translateOutputsuiluppo_room(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.liferay.sample.model.impl.suiluppo_room_allocationImpl")) {
			return translateOutputsuiluppo_room_allocation(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.liferay.sample.model.impl.suiluppo_room_allocation_archiveImpl")) {
			return translateOutputsuiluppo_room_allocation_archive(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals(
					"com.liferay.sample.NoSuchBookedEquipmentException")) {
			return new com.liferay.sample.NoSuchBookedEquipmentException();
		}

		if (className.equals("com.liferay.sample.NoSuchEquipmentException")) {
			return new com.liferay.sample.NoSuchEquipmentException();
		}

		if (className.equals(
					"com.liferay.sample.NoSuchsuiluppo_applicationException")) {
			return new com.liferay.sample.NoSuchsuiluppo_applicationException();
		}

		if (className.equals(
					"com.liferay.sample.NoSuchsuiluppo_courseException")) {
			return new com.liferay.sample.NoSuchsuiluppo_courseException();
		}

		if (className.equals("com.liferay.sample.NoSuchsuiluppo_roomException")) {
			return new com.liferay.sample.NoSuchsuiluppo_roomException();
		}

		if (className.equals(
					"com.liferay.sample.NoSuchsuiluppo_room_allocationException")) {
			return new com.liferay.sample.NoSuchsuiluppo_room_allocationException();
		}

		if (className.equals(
					"com.liferay.sample.NoSuchsuiluppo_room_allocation_archiveException")) {
			return new com.liferay.sample.NoSuchsuiluppo_room_allocation_archiveException();
		}

		return throwable;
	}

	public static Object translateOutputBookedEquipment(BaseModel<?> oldModel) {
		BookedEquipmentClp newModel = new BookedEquipmentClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setBookedEquipmentRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEquipment(BaseModel<?> oldModel) {
		EquipmentClp newModel = new EquipmentClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEquipmentRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputsuiluppo_application(
		BaseModel<?> oldModel) {
		suiluppo_applicationClp newModel = new suiluppo_applicationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setsuiluppo_applicationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputsuiluppo_course(BaseModel<?> oldModel) {
		suiluppo_courseClp newModel = new suiluppo_courseClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setsuiluppo_courseRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputsuiluppo_room(BaseModel<?> oldModel) {
		suiluppo_roomClp newModel = new suiluppo_roomClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setsuiluppo_roomRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputsuiluppo_room_allocation(
		BaseModel<?> oldModel) {
		suiluppo_room_allocationClp newModel = new suiluppo_room_allocationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setsuiluppo_room_allocationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputsuiluppo_room_allocation_archive(
		BaseModel<?> oldModel) {
		suiluppo_room_allocation_archiveClp newModel = new suiluppo_room_allocation_archiveClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setsuiluppo_room_allocation_archiveRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}