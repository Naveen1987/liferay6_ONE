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

package com.daffo.form_di_segnalazione.service.persistence;

import com.daffo.form_di_segnalazione.model.form_di_segnalazione;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the form_di_segnalazione service. This utility wraps {@link form_di_segnalazionePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see form_di_segnalazionePersistence
 * @see form_di_segnalazionePersistenceImpl
 * @generated
 */
public class form_di_segnalazioneUtil {
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
	public static void clearCache(form_di_segnalazione form_di_segnalazione) {
		getPersistence().clearCache(form_di_segnalazione);
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
	public static List<form_di_segnalazione> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<form_di_segnalazione> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<form_di_segnalazione> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static form_di_segnalazione update(
		form_di_segnalazione form_di_segnalazione) throws SystemException {
		return getPersistence().update(form_di_segnalazione);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static form_di_segnalazione update(
		form_di_segnalazione form_di_segnalazione, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(form_di_segnalazione, serviceContext);
	}

	/**
	* Caches the form_di_segnalazione in the entity cache if it is enabled.
	*
	* @param form_di_segnalazione the form_di_segnalazione
	*/
	public static void cacheResult(
		com.daffo.form_di_segnalazione.model.form_di_segnalazione form_di_segnalazione) {
		getPersistence().cacheResult(form_di_segnalazione);
	}

	/**
	* Caches the form_di_segnalaziones in the entity cache if it is enabled.
	*
	* @param form_di_segnalaziones the form_di_segnalaziones
	*/
	public static void cacheResult(
		java.util.List<com.daffo.form_di_segnalazione.model.form_di_segnalazione> form_di_segnalaziones) {
		getPersistence().cacheResult(form_di_segnalaziones);
	}

	/**
	* Creates a new form_di_segnalazione with the primary key. Does not add the form_di_segnalazione to the database.
	*
	* @param Form_di_segnalazione_id the primary key for the new form_di_segnalazione
	* @return the new form_di_segnalazione
	*/
	public static com.daffo.form_di_segnalazione.model.form_di_segnalazione create(
		long Form_di_segnalazione_id) {
		return getPersistence().create(Form_di_segnalazione_id);
	}

	/**
	* Removes the form_di_segnalazione with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Form_di_segnalazione_id the primary key of the form_di_segnalazione
	* @return the form_di_segnalazione that was removed
	* @throws com.daffo.form_di_segnalazione.NoSuchform_di_segnalazioneException if a form_di_segnalazione with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.daffo.form_di_segnalazione.model.form_di_segnalazione remove(
		long Form_di_segnalazione_id)
		throws com.daffo.form_di_segnalazione.NoSuchform_di_segnalazioneException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(Form_di_segnalazione_id);
	}

	public static com.daffo.form_di_segnalazione.model.form_di_segnalazione updateImpl(
		com.daffo.form_di_segnalazione.model.form_di_segnalazione form_di_segnalazione)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(form_di_segnalazione);
	}

	/**
	* Returns the form_di_segnalazione with the primary key or throws a {@link com.daffo.form_di_segnalazione.NoSuchform_di_segnalazioneException} if it could not be found.
	*
	* @param Form_di_segnalazione_id the primary key of the form_di_segnalazione
	* @return the form_di_segnalazione
	* @throws com.daffo.form_di_segnalazione.NoSuchform_di_segnalazioneException if a form_di_segnalazione with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.daffo.form_di_segnalazione.model.form_di_segnalazione findByPrimaryKey(
		long Form_di_segnalazione_id)
		throws com.daffo.form_di_segnalazione.NoSuchform_di_segnalazioneException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(Form_di_segnalazione_id);
	}

	/**
	* Returns the form_di_segnalazione with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Form_di_segnalazione_id the primary key of the form_di_segnalazione
	* @return the form_di_segnalazione, or <code>null</code> if a form_di_segnalazione with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.daffo.form_di_segnalazione.model.form_di_segnalazione fetchByPrimaryKey(
		long Form_di_segnalazione_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Form_di_segnalazione_id);
	}

	/**
	* Returns all the form_di_segnalaziones.
	*
	* @return the form_di_segnalaziones
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.daffo.form_di_segnalazione.model.form_di_segnalazione> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the form_di_segnalaziones.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.form_di_segnalazione.model.impl.form_di_segnalazioneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of form_di_segnalaziones
	* @param end the upper bound of the range of form_di_segnalaziones (not inclusive)
	* @return the range of form_di_segnalaziones
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.daffo.form_di_segnalazione.model.form_di_segnalazione> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the form_di_segnalaziones.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.form_di_segnalazione.model.impl.form_di_segnalazioneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of form_di_segnalaziones
	* @param end the upper bound of the range of form_di_segnalaziones (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of form_di_segnalaziones
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.daffo.form_di_segnalazione.model.form_di_segnalazione> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the form_di_segnalaziones from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of form_di_segnalaziones.
	*
	* @return the number of form_di_segnalaziones
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static form_di_segnalazionePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (form_di_segnalazionePersistence)PortletBeanLocatorUtil.locate(com.daffo.form_di_segnalazione.service.ClpSerializer.getServletContextName(),
					form_di_segnalazionePersistence.class.getName());

			ReferenceRegistry.registerReference(form_di_segnalazioneUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(form_di_segnalazionePersistence persistence) {
	}

	private static form_di_segnalazionePersistence _persistence;
}