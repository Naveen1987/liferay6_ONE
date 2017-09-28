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

import com.liferay.daffo.model.prontuario_drug;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the prontuario_drug service. This utility wraps {@link prontuario_drugPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen
 * @see prontuario_drugPersistence
 * @see prontuario_drugPersistenceImpl
 * @generated
 */
public class prontuario_drugUtil {
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
	public static void clearCache(prontuario_drug prontuario_drug) {
		getPersistence().clearCache(prontuario_drug);
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
	public static List<prontuario_drug> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<prontuario_drug> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<prontuario_drug> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static prontuario_drug update(prontuario_drug prontuario_drug)
		throws SystemException {
		return getPersistence().update(prontuario_drug);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static prontuario_drug update(prontuario_drug prontuario_drug,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(prontuario_drug, serviceContext);
	}

	/**
	* Caches the prontuario_drug in the entity cache if it is enabled.
	*
	* @param prontuario_drug the prontuario_drug
	*/
	public static void cacheResult(
		com.liferay.daffo.model.prontuario_drug prontuario_drug) {
		getPersistence().cacheResult(prontuario_drug);
	}

	/**
	* Caches the prontuario_drugs in the entity cache if it is enabled.
	*
	* @param prontuario_drugs the prontuario_drugs
	*/
	public static void cacheResult(
		java.util.List<com.liferay.daffo.model.prontuario_drug> prontuario_drugs) {
		getPersistence().cacheResult(prontuario_drugs);
	}

	/**
	* Creates a new prontuario_drug with the primary key. Does not add the prontuario_drug to the database.
	*
	* @param drug_id the primary key for the new prontuario_drug
	* @return the new prontuario_drug
	*/
	public static com.liferay.daffo.model.prontuario_drug create(long drug_id) {
		return getPersistence().create(drug_id);
	}

	/**
	* Removes the prontuario_drug with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param drug_id the primary key of the prontuario_drug
	* @return the prontuario_drug that was removed
	* @throws com.liferay.daffo.NoSuchprontuario_drugException if a prontuario_drug with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.daffo.model.prontuario_drug remove(long drug_id)
		throws com.liferay.daffo.NoSuchprontuario_drugException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(drug_id);
	}

	public static com.liferay.daffo.model.prontuario_drug updateImpl(
		com.liferay.daffo.model.prontuario_drug prontuario_drug)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(prontuario_drug);
	}

	/**
	* Returns the prontuario_drug with the primary key or throws a {@link com.liferay.daffo.NoSuchprontuario_drugException} if it could not be found.
	*
	* @param drug_id the primary key of the prontuario_drug
	* @return the prontuario_drug
	* @throws com.liferay.daffo.NoSuchprontuario_drugException if a prontuario_drug with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.daffo.model.prontuario_drug findByPrimaryKey(
		long drug_id)
		throws com.liferay.daffo.NoSuchprontuario_drugException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(drug_id);
	}

	/**
	* Returns the prontuario_drug with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param drug_id the primary key of the prontuario_drug
	* @return the prontuario_drug, or <code>null</code> if a prontuario_drug with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.daffo.model.prontuario_drug fetchByPrimaryKey(
		long drug_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(drug_id);
	}

	/**
	* Returns all the prontuario_drugs.
	*
	* @return the prontuario_drugs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.daffo.model.prontuario_drug> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the prontuario_drugs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.daffo.model.impl.prontuario_drugModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prontuario_drugs
	* @param end the upper bound of the range of prontuario_drugs (not inclusive)
	* @return the range of prontuario_drugs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.daffo.model.prontuario_drug> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the prontuario_drugs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.daffo.model.impl.prontuario_drugModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prontuario_drugs
	* @param end the upper bound of the range of prontuario_drugs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of prontuario_drugs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.daffo.model.prontuario_drug> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the prontuario_drugs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of prontuario_drugs.
	*
	* @return the number of prontuario_drugs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static prontuario_drugPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (prontuario_drugPersistence)PortletBeanLocatorUtil.locate(com.liferay.daffo.service.ClpSerializer.getServletContextName(),
					prontuario_drugPersistence.class.getName());

			ReferenceRegistry.registerReference(prontuario_drugUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(prontuario_drugPersistence persistence) {
	}

	private static prontuario_drugPersistence _persistence;
}