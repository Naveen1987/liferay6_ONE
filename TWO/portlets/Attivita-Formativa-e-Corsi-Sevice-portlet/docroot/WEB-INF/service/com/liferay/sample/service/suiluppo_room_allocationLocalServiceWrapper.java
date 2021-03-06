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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link suiluppo_room_allocationLocalService}.
 *
 * @author Naveen Kumar
 * @see suiluppo_room_allocationLocalService
 * @generated
 */
public class suiluppo_room_allocationLocalServiceWrapper
	implements suiluppo_room_allocationLocalService,
		ServiceWrapper<suiluppo_room_allocationLocalService> {
	public suiluppo_room_allocationLocalServiceWrapper(
		suiluppo_room_allocationLocalService suiluppo_room_allocationLocalService) {
		_suiluppo_room_allocationLocalService = suiluppo_room_allocationLocalService;
	}

	/**
	* Adds the suiluppo_room_allocation to the database. Also notifies the appropriate model listeners.
	*
	* @param suiluppo_room_allocation the suiluppo_room_allocation
	* @return the suiluppo_room_allocation that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.suiluppo_room_allocation addsuiluppo_room_allocation(
		com.liferay.sample.model.suiluppo_room_allocation suiluppo_room_allocation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suiluppo_room_allocationLocalService.addsuiluppo_room_allocation(suiluppo_room_allocation);
	}

	/**
	* Creates a new suiluppo_room_allocation with the primary key. Does not add the suiluppo_room_allocation to the database.
	*
	* @param room_allocat_id the primary key for the new suiluppo_room_allocation
	* @return the new suiluppo_room_allocation
	*/
	@Override
	public com.liferay.sample.model.suiluppo_room_allocation createsuiluppo_room_allocation(
		long room_allocat_id) {
		return _suiluppo_room_allocationLocalService.createsuiluppo_room_allocation(room_allocat_id);
	}

	/**
	* Deletes the suiluppo_room_allocation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param room_allocat_id the primary key of the suiluppo_room_allocation
	* @return the suiluppo_room_allocation that was removed
	* @throws PortalException if a suiluppo_room_allocation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.suiluppo_room_allocation deletesuiluppo_room_allocation(
		long room_allocat_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _suiluppo_room_allocationLocalService.deletesuiluppo_room_allocation(room_allocat_id);
	}

	/**
	* Deletes the suiluppo_room_allocation from the database. Also notifies the appropriate model listeners.
	*
	* @param suiluppo_room_allocation the suiluppo_room_allocation
	* @return the suiluppo_room_allocation that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.suiluppo_room_allocation deletesuiluppo_room_allocation(
		com.liferay.sample.model.suiluppo_room_allocation suiluppo_room_allocation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suiluppo_room_allocationLocalService.deletesuiluppo_room_allocation(suiluppo_room_allocation);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _suiluppo_room_allocationLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suiluppo_room_allocationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.suiluppo_room_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _suiluppo_room_allocationLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.suiluppo_room_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suiluppo_room_allocationLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suiluppo_room_allocationLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suiluppo_room_allocationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.sample.model.suiluppo_room_allocation fetchsuiluppo_room_allocation(
		long room_allocat_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suiluppo_room_allocationLocalService.fetchsuiluppo_room_allocation(room_allocat_id);
	}

	/**
	* Returns the suiluppo_room_allocation with the primary key.
	*
	* @param room_allocat_id the primary key of the suiluppo_room_allocation
	* @return the suiluppo_room_allocation
	* @throws PortalException if a suiluppo_room_allocation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.suiluppo_room_allocation getsuiluppo_room_allocation(
		long room_allocat_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _suiluppo_room_allocationLocalService.getsuiluppo_room_allocation(room_allocat_id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _suiluppo_room_allocationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the suiluppo_room_allocations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.suiluppo_room_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_room_allocations
	* @param end the upper bound of the range of suiluppo_room_allocations (not inclusive)
	* @return the range of suiluppo_room_allocations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.sample.model.suiluppo_room_allocation> getsuiluppo_room_allocations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suiluppo_room_allocationLocalService.getsuiluppo_room_allocations(start,
			end);
	}

	/**
	* Returns the number of suiluppo_room_allocations.
	*
	* @return the number of suiluppo_room_allocations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getsuiluppo_room_allocationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suiluppo_room_allocationLocalService.getsuiluppo_room_allocationsCount();
	}

	/**
	* Updates the suiluppo_room_allocation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param suiluppo_room_allocation the suiluppo_room_allocation
	* @return the suiluppo_room_allocation that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.suiluppo_room_allocation updatesuiluppo_room_allocation(
		com.liferay.sample.model.suiluppo_room_allocation suiluppo_room_allocation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suiluppo_room_allocationLocalService.updatesuiluppo_room_allocation(suiluppo_room_allocation);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _suiluppo_room_allocationLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_suiluppo_room_allocationLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _suiluppo_room_allocationLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public suiluppo_room_allocationLocalService getWrappedsuiluppo_room_allocationLocalService() {
		return _suiluppo_room_allocationLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedsuiluppo_room_allocationLocalService(
		suiluppo_room_allocationLocalService suiluppo_room_allocationLocalService) {
		_suiluppo_room_allocationLocalService = suiluppo_room_allocationLocalService;
	}

	@Override
	public suiluppo_room_allocationLocalService getWrappedService() {
		return _suiluppo_room_allocationLocalService;
	}

	@Override
	public void setWrappedService(
		suiluppo_room_allocationLocalService suiluppo_room_allocationLocalService) {
		_suiluppo_room_allocationLocalService = suiluppo_room_allocationLocalService;
	}

	private suiluppo_room_allocationLocalService _suiluppo_room_allocationLocalService;
}