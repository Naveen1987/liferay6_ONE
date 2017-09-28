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

import com.liferay.sample.model.suiluppo_application;

/**
 * The persistence interface for the suiluppo_application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen Kumar
 * @see suiluppo_applicationPersistenceImpl
 * @see suiluppo_applicationUtil
 * @generated
 */
public interface suiluppo_applicationPersistence extends BasePersistence<suiluppo_application> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link suiluppo_applicationUtil} to access the suiluppo_application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the suiluppo_applications where course_id = &#63;.
	*
	* @param course_id the course_id
	* @return the matching suiluppo_applications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.sample.model.suiluppo_application> findBycourse_id(
		long course_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the suiluppo_applications where course_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.suiluppo_applicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param course_id the course_id
	* @param start the lower bound of the range of suiluppo_applications
	* @param end the upper bound of the range of suiluppo_applications (not inclusive)
	* @return the range of matching suiluppo_applications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.sample.model.suiluppo_application> findBycourse_id(
		long course_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the suiluppo_applications where course_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.suiluppo_applicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param course_id the course_id
	* @param start the lower bound of the range of suiluppo_applications
	* @param end the upper bound of the range of suiluppo_applications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching suiluppo_applications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.sample.model.suiluppo_application> findBycourse_id(
		long course_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first suiluppo_application in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suiluppo_application
	* @throws com.liferay.sample.NoSuchsuiluppo_applicationException if a matching suiluppo_application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.suiluppo_application findBycourse_id_First(
		long course_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchsuiluppo_applicationException;

	/**
	* Returns the first suiluppo_application in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suiluppo_application, or <code>null</code> if a matching suiluppo_application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.suiluppo_application fetchBycourse_id_First(
		long course_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last suiluppo_application in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suiluppo_application
	* @throws com.liferay.sample.NoSuchsuiluppo_applicationException if a matching suiluppo_application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.suiluppo_application findBycourse_id_Last(
		long course_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchsuiluppo_applicationException;

	/**
	* Returns the last suiluppo_application in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suiluppo_application, or <code>null</code> if a matching suiluppo_application could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.suiluppo_application fetchBycourse_id_Last(
		long course_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the suiluppo_applications before and after the current suiluppo_application in the ordered set where course_id = &#63;.
	*
	* @param applicat_id the primary key of the current suiluppo_application
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next suiluppo_application
	* @throws com.liferay.sample.NoSuchsuiluppo_applicationException if a suiluppo_application with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.suiluppo_application[] findBycourse_id_PrevAndNext(
		long applicat_id, long course_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchsuiluppo_applicationException;

	/**
	* Removes all the suiluppo_applications where course_id = &#63; from the database.
	*
	* @param course_id the course_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycourse_id(long course_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of suiluppo_applications where course_id = &#63;.
	*
	* @param course_id the course_id
	* @return the number of matching suiluppo_applications
	* @throws SystemException if a system exception occurred
	*/
	public int countBycourse_id(long course_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the suiluppo_application in the entity cache if it is enabled.
	*
	* @param suiluppo_application the suiluppo_application
	*/
	public void cacheResult(
		com.liferay.sample.model.suiluppo_application suiluppo_application);

	/**
	* Caches the suiluppo_applications in the entity cache if it is enabled.
	*
	* @param suiluppo_applications the suiluppo_applications
	*/
	public void cacheResult(
		java.util.List<com.liferay.sample.model.suiluppo_application> suiluppo_applications);

	/**
	* Creates a new suiluppo_application with the primary key. Does not add the suiluppo_application to the database.
	*
	* @param applicat_id the primary key for the new suiluppo_application
	* @return the new suiluppo_application
	*/
	public com.liferay.sample.model.suiluppo_application create(
		long applicat_id);

	/**
	* Removes the suiluppo_application with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param applicat_id the primary key of the suiluppo_application
	* @return the suiluppo_application that was removed
	* @throws com.liferay.sample.NoSuchsuiluppo_applicationException if a suiluppo_application with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.suiluppo_application remove(
		long applicat_id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchsuiluppo_applicationException;

	public com.liferay.sample.model.suiluppo_application updateImpl(
		com.liferay.sample.model.suiluppo_application suiluppo_application)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the suiluppo_application with the primary key or throws a {@link com.liferay.sample.NoSuchsuiluppo_applicationException} if it could not be found.
	*
	* @param applicat_id the primary key of the suiluppo_application
	* @return the suiluppo_application
	* @throws com.liferay.sample.NoSuchsuiluppo_applicationException if a suiluppo_application with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.suiluppo_application findByPrimaryKey(
		long applicat_id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchsuiluppo_applicationException;

	/**
	* Returns the suiluppo_application with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param applicat_id the primary key of the suiluppo_application
	* @return the suiluppo_application, or <code>null</code> if a suiluppo_application with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.suiluppo_application fetchByPrimaryKey(
		long applicat_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the suiluppo_applications.
	*
	* @return the suiluppo_applications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.sample.model.suiluppo_application> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the suiluppo_applications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.suiluppo_applicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_applications
	* @param end the upper bound of the range of suiluppo_applications (not inclusive)
	* @return the range of suiluppo_applications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.sample.model.suiluppo_application> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the suiluppo_applications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.suiluppo_applicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_applications
	* @param end the upper bound of the range of suiluppo_applications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of suiluppo_applications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.sample.model.suiluppo_application> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the suiluppo_applications from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of suiluppo_applications.
	*
	* @return the number of suiluppo_applications
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}