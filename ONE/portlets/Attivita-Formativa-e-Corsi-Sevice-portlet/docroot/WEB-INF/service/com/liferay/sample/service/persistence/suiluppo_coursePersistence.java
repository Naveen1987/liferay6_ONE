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

import com.liferay.portal.service.persistence.BasePersistence;

import com.liferay.sample.model.suiluppo_course;

/**
 * The persistence interface for the suiluppo_course service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen Kumar
 * @see suiluppo_coursePersistenceImpl
 * @see suiluppo_courseUtil
 * @generated
 */
public interface suiluppo_coursePersistence extends BasePersistence<suiluppo_course> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link suiluppo_courseUtil} to access the suiluppo_course persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the suiluppo_course in the entity cache if it is enabled.
	*
	* @param suiluppo_course the suiluppo_course
	*/
	public void cacheResult(
		com.liferay.sample.model.suiluppo_course suiluppo_course);

	/**
	* Caches the suiluppo_courses in the entity cache if it is enabled.
	*
	* @param suiluppo_courses the suiluppo_courses
	*/
	public void cacheResult(
		java.util.List<com.liferay.sample.model.suiluppo_course> suiluppo_courses);

	/**
	* Creates a new suiluppo_course with the primary key. Does not add the suiluppo_course to the database.
	*
	* @param course_id the primary key for the new suiluppo_course
	* @return the new suiluppo_course
	*/
	public com.liferay.sample.model.suiluppo_course create(long course_id);

	/**
	* Removes the suiluppo_course with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param course_id the primary key of the suiluppo_course
	* @return the suiluppo_course that was removed
	* @throws com.liferay.sample.NoSuchsuiluppo_courseException if a suiluppo_course with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.suiluppo_course remove(long course_id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchsuiluppo_courseException;

	public com.liferay.sample.model.suiluppo_course updateImpl(
		com.liferay.sample.model.suiluppo_course suiluppo_course)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the suiluppo_course with the primary key or throws a {@link com.liferay.sample.NoSuchsuiluppo_courseException} if it could not be found.
	*
	* @param course_id the primary key of the suiluppo_course
	* @return the suiluppo_course
	* @throws com.liferay.sample.NoSuchsuiluppo_courseException if a suiluppo_course with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.suiluppo_course findByPrimaryKey(
		long course_id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchsuiluppo_courseException;

	/**
	* Returns the suiluppo_course with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param course_id the primary key of the suiluppo_course
	* @return the suiluppo_course, or <code>null</code> if a suiluppo_course with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.suiluppo_course fetchByPrimaryKey(
		long course_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the suiluppo_courses.
	*
	* @return the suiluppo_courses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.sample.model.suiluppo_course> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the suiluppo_courses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.suiluppo_courseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_courses
	* @param end the upper bound of the range of suiluppo_courses (not inclusive)
	* @return the range of suiluppo_courses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.sample.model.suiluppo_course> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the suiluppo_courses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.suiluppo_courseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_courses
	* @param end the upper bound of the range of suiluppo_courses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of suiluppo_courses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.sample.model.suiluppo_course> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the suiluppo_courses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of suiluppo_courses.
	*
	* @return the number of suiluppo_courses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}