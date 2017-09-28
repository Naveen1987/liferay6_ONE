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

import com.liferay.daffo.model.News_Blogs;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the news_ blogs service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen Kumar
 * @see News_BlogsPersistenceImpl
 * @see News_BlogsUtil
 * @generated
 */
public interface News_BlogsPersistence extends BasePersistence<News_Blogs> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link News_BlogsUtil} to access the news_ blogs persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the news_ blogs in the entity cache if it is enabled.
	*
	* @param news_Blogs the news_ blogs
	*/
	public void cacheResult(com.liferay.daffo.model.News_Blogs news_Blogs);

	/**
	* Caches the news_ blogses in the entity cache if it is enabled.
	*
	* @param news_Blogses the news_ blogses
	*/
	public void cacheResult(
		java.util.List<com.liferay.daffo.model.News_Blogs> news_Blogses);

	/**
	* Creates a new news_ blogs with the primary key. Does not add the news_ blogs to the database.
	*
	* @param News_Blogs_Id the primary key for the new news_ blogs
	* @return the new news_ blogs
	*/
	public com.liferay.daffo.model.News_Blogs create(long News_Blogs_Id);

	/**
	* Removes the news_ blogs with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param News_Blogs_Id the primary key of the news_ blogs
	* @return the news_ blogs that was removed
	* @throws com.liferay.daffo.NoSuchNews_BlogsException if a news_ blogs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.daffo.model.News_Blogs remove(long News_Blogs_Id)
		throws com.liferay.daffo.NoSuchNews_BlogsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.daffo.model.News_Blogs updateImpl(
		com.liferay.daffo.model.News_Blogs news_Blogs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the news_ blogs with the primary key or throws a {@link com.liferay.daffo.NoSuchNews_BlogsException} if it could not be found.
	*
	* @param News_Blogs_Id the primary key of the news_ blogs
	* @return the news_ blogs
	* @throws com.liferay.daffo.NoSuchNews_BlogsException if a news_ blogs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.daffo.model.News_Blogs findByPrimaryKey(
		long News_Blogs_Id)
		throws com.liferay.daffo.NoSuchNews_BlogsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the news_ blogs with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param News_Blogs_Id the primary key of the news_ blogs
	* @return the news_ blogs, or <code>null</code> if a news_ blogs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.daffo.model.News_Blogs fetchByPrimaryKey(
		long News_Blogs_Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the news_ blogses.
	*
	* @return the news_ blogses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.daffo.model.News_Blogs> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the news_ blogses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.daffo.model.impl.News_BlogsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of news_ blogses
	* @param end the upper bound of the range of news_ blogses (not inclusive)
	* @return the range of news_ blogses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.daffo.model.News_Blogs> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the news_ blogses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.daffo.model.impl.News_BlogsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of news_ blogses
	* @param end the upper bound of the range of news_ blogses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of news_ blogses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.daffo.model.News_Blogs> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the news_ blogses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of news_ blogses.
	*
	* @return the number of news_ blogses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}