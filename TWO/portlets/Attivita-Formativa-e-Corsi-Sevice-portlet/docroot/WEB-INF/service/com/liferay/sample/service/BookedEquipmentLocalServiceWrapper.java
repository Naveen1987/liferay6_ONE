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
 * Provides a wrapper for {@link BookedEquipmentLocalService}.
 *
 * @author Naveen Kumar
 * @see BookedEquipmentLocalService
 * @generated
 */
public class BookedEquipmentLocalServiceWrapper
	implements BookedEquipmentLocalService,
		ServiceWrapper<BookedEquipmentLocalService> {
	public BookedEquipmentLocalServiceWrapper(
		BookedEquipmentLocalService bookedEquipmentLocalService) {
		_bookedEquipmentLocalService = bookedEquipmentLocalService;
	}

	/**
	* Adds the booked equipment to the database. Also notifies the appropriate model listeners.
	*
	* @param bookedEquipment the booked equipment
	* @return the booked equipment that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.BookedEquipment addBookedEquipment(
		com.liferay.sample.model.BookedEquipment bookedEquipment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bookedEquipmentLocalService.addBookedEquipment(bookedEquipment);
	}

	/**
	* Creates a new booked equipment with the primary key. Does not add the booked equipment to the database.
	*
	* @param booked_equip_id the primary key for the new booked equipment
	* @return the new booked equipment
	*/
	@Override
	public com.liferay.sample.model.BookedEquipment createBookedEquipment(
		long booked_equip_id) {
		return _bookedEquipmentLocalService.createBookedEquipment(booked_equip_id);
	}

	/**
	* Deletes the booked equipment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param booked_equip_id the primary key of the booked equipment
	* @return the booked equipment that was removed
	* @throws PortalException if a booked equipment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.BookedEquipment deleteBookedEquipment(
		long booked_equip_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bookedEquipmentLocalService.deleteBookedEquipment(booked_equip_id);
	}

	/**
	* Deletes the booked equipment from the database. Also notifies the appropriate model listeners.
	*
	* @param bookedEquipment the booked equipment
	* @return the booked equipment that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.BookedEquipment deleteBookedEquipment(
		com.liferay.sample.model.BookedEquipment bookedEquipment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bookedEquipmentLocalService.deleteBookedEquipment(bookedEquipment);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bookedEquipmentLocalService.dynamicQuery();
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
		return _bookedEquipmentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.BookedEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _bookedEquipmentLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.BookedEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _bookedEquipmentLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _bookedEquipmentLocalService.dynamicQueryCount(dynamicQuery);
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
		return _bookedEquipmentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.sample.model.BookedEquipment fetchBookedEquipment(
		long booked_equip_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bookedEquipmentLocalService.fetchBookedEquipment(booked_equip_id);
	}

	/**
	* Returns the booked equipment with the primary key.
	*
	* @param booked_equip_id the primary key of the booked equipment
	* @return the booked equipment
	* @throws PortalException if a booked equipment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.BookedEquipment getBookedEquipment(
		long booked_equip_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bookedEquipmentLocalService.getBookedEquipment(booked_equip_id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bookedEquipmentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the booked equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.BookedEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of booked equipments
	* @param end the upper bound of the range of booked equipments (not inclusive)
	* @return the range of booked equipments
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.sample.model.BookedEquipment> getBookedEquipments(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bookedEquipmentLocalService.getBookedEquipments(start, end);
	}

	/**
	* Returns the number of booked equipments.
	*
	* @return the number of booked equipments
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getBookedEquipmentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bookedEquipmentLocalService.getBookedEquipmentsCount();
	}

	/**
	* Updates the booked equipment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bookedEquipment the booked equipment
	* @return the booked equipment that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.BookedEquipment updateBookedEquipment(
		com.liferay.sample.model.BookedEquipment bookedEquipment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bookedEquipmentLocalService.updateBookedEquipment(bookedEquipment);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _bookedEquipmentLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_bookedEquipmentLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _bookedEquipmentLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public BookedEquipmentLocalService getWrappedBookedEquipmentLocalService() {
		return _bookedEquipmentLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedBookedEquipmentLocalService(
		BookedEquipmentLocalService bookedEquipmentLocalService) {
		_bookedEquipmentLocalService = bookedEquipmentLocalService;
	}

	@Override
	public BookedEquipmentLocalService getWrappedService() {
		return _bookedEquipmentLocalService;
	}

	@Override
	public void setWrappedService(
		BookedEquipmentLocalService bookedEquipmentLocalService) {
		_bookedEquipmentLocalService = bookedEquipmentLocalService;
	}

	private BookedEquipmentLocalService _bookedEquipmentLocalService;
}