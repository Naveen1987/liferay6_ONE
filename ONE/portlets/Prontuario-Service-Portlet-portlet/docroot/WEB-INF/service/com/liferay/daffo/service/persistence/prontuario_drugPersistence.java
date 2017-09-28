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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the prontuario_drug service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen
 * @see prontuario_drugPersistenceImpl
 * @see prontuario_drugUtil
 * @generated
 */
public interface prontuario_drugPersistence extends BasePersistence<prontuario_drug> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link prontuario_drugUtil} to access the prontuario_drug persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the prontuario_drug in the entity cache if it is enabled.
	*
	* @param prontuario_drug the prontuario_drug
	*/
	public void cacheResult(
		com.liferay.daffo.model.prontuario_drug prontuario_drug);

	/**
	* Caches the prontuario_drugs in the entity cache if it is enabled.
	*
	* @param prontuario_drugs the prontuario_drugs
	*/
	public void cacheResult(
		java.util.List<com.liferay.daffo.model.prontuario_drug> prontuario_drugs);

	/**
	* Creates a new prontuario_drug with the primary key. Does not add the prontuario_drug to the database.
	*
	* @param drug_id the primary key for the new prontuario_drug
	* @return the new prontuario_drug
	*/
	public com.liferay.daffo.model.prontuario_drug create(long drug_id);

	/**
	* Removes the prontuario_drug with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param drug_id the primary key of the prontuario_drug
	* @return the prontuario_drug that was removed
	* @throws com.liferay.daffo.NoSuchprontuario_drugException if a prontuario_drug with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.daffo.model.prontuario_drug remove(long drug_id)
		throws com.liferay.daffo.NoSuchprontuario_drugException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.daffo.model.prontuario_drug updateImpl(
		com.liferay.daffo.model.prontuario_drug prontuario_drug)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the prontuario_drug with the primary key or throws a {@link com.liferay.daffo.NoSuchprontuario_drugException} if it could not be found.
	*
	* @param drug_id the primary key of the prontuario_drug
	* @return the prontuario_drug
	* @throws com.liferay.daffo.NoSuchprontuario_drugException if a prontuario_drug with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.daffo.model.prontuario_drug findByPrimaryKey(
		long drug_id)
		throws com.liferay.daffo.NoSuchprontuario_drugException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the prontuario_drug with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param drug_id the primary key of the prontuario_drug
	* @return the prontuario_drug, or <code>null</code> if a prontuario_drug with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.daffo.model.prontuario_drug fetchByPrimaryKey(
		long drug_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the prontuario_drugs.
	*
	* @return the prontuario_drugs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.daffo.model.prontuario_drug> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.daffo.model.prontuario_drug> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.daffo.model.prontuario_drug> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the prontuario_drugs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of prontuario_drugs.
	*
	* @return the number of prontuario_drugs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}