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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.liferay.sample.model.Telephonic;

import java.util.List;

/**
 * The persistence utility for the telephonic service. This utility wraps {@link TelephonicPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Administrator
 * @see TelephonicPersistence
 * @see TelephonicPersistenceImpl
 * @generated
 */
public class TelephonicUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Telephonic telephonic) {
		getPersistence().clearCache(telephonic);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Telephonic> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Telephonic> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Telephonic> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Telephonic update(Telephonic telephonic)
		throws SystemException {
		return getPersistence().update(telephonic);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Telephonic update(Telephonic telephonic,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(telephonic, serviceContext);
	}

	/**
	* Caches the telephonic in the entity cache if it is enabled.
	*
	* @param telephonic the telephonic
	*/
	public static void cacheResult(
		com.liferay.sample.model.Telephonic telephonic) {
		getPersistence().cacheResult(telephonic);
	}

	/**
	* Caches the telephonics in the entity cache if it is enabled.
	*
	* @param telephonics the telephonics
	*/
	public static void cacheResult(
		java.util.List<com.liferay.sample.model.Telephonic> telephonics) {
		getPersistence().cacheResult(telephonics);
	}

	/**
	* Creates a new telephonic with the primary key. Does not add the telephonic to the database.
	*
	* @param telephonicId the primary key for the new telephonic
	* @return the new telephonic
	*/
	public static com.liferay.sample.model.Telephonic create(long telephonicId) {
		return getPersistence().create(telephonicId);
	}

	/**
	* Removes the telephonic with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param telephonicId the primary key of the telephonic
	* @return the telephonic that was removed
	* @throws com.liferay.sample.NoSuchTelephonicException if a telephonic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.sample.model.Telephonic remove(long telephonicId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchTelephonicException {
		return getPersistence().remove(telephonicId);
	}

	public static com.liferay.sample.model.Telephonic updateImpl(
		com.liferay.sample.model.Telephonic telephonic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(telephonic);
	}

	/**
	* Returns the telephonic with the primary key or throws a {@link com.liferay.sample.NoSuchTelephonicException} if it could not be found.
	*
	* @param telephonicId the primary key of the telephonic
	* @return the telephonic
	* @throws com.liferay.sample.NoSuchTelephonicException if a telephonic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.sample.model.Telephonic findByPrimaryKey(
		long telephonicId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchTelephonicException {
		return getPersistence().findByPrimaryKey(telephonicId);
	}

	/**
	* Returns the telephonic with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param telephonicId the primary key of the telephonic
	* @return the telephonic, or <code>null</code> if a telephonic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.sample.model.Telephonic fetchByPrimaryKey(
		long telephonicId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(telephonicId);
	}

	/**
	* Returns all the telephonics.
	*
	* @return the telephonics
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.sample.model.Telephonic> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the telephonics.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.TelephonicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of telephonics
	* @param end the upper bound of the range of telephonics (not inclusive)
	* @return the range of telephonics
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.sample.model.Telephonic> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the telephonics.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.TelephonicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of telephonics
	* @param end the upper bound of the range of telephonics (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of telephonics
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.sample.model.Telephonic> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the telephonics from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of telephonics.
	*
	* @return the number of telephonics
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TelephonicPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TelephonicPersistence)PortletBeanLocatorUtil.locate(com.liferay.sample.service.ClpSerializer.getServletContextName(),
					TelephonicPersistence.class.getName());

			ReferenceRegistry.registerReference(TelephonicUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TelephonicPersistence persistence) {
	}

	private static TelephonicPersistence _persistence;
}