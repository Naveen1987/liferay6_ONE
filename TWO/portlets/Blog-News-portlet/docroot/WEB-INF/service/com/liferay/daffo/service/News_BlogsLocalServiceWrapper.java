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

package com.liferay.daffo.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link News_BlogsLocalService}.
 *
 * @author Naveen Kumar
 * @see News_BlogsLocalService
 * @generated
 */
public class News_BlogsLocalServiceWrapper implements News_BlogsLocalService,
	ServiceWrapper<News_BlogsLocalService> {
	public News_BlogsLocalServiceWrapper(
		News_BlogsLocalService news_BlogsLocalService) {
		_news_BlogsLocalService = news_BlogsLocalService;
	}

	/**
	* Adds the news_ blogs to the database. Also notifies the appropriate model listeners.
	*
	* @param news_Blogs the news_ blogs
	* @return the news_ blogs that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.daffo.model.News_Blogs addNews_Blogs(
		com.liferay.daffo.model.News_Blogs news_Blogs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _news_BlogsLocalService.addNews_Blogs(news_Blogs);
	}

	/**
	* Creates a new news_ blogs with the primary key. Does not add the news_ blogs to the database.
	*
	* @param News_Blogs_Id the primary key for the new news_ blogs
	* @return the new news_ blogs
	*/
	@Override
	public com.liferay.daffo.model.News_Blogs createNews_Blogs(
		long News_Blogs_Id) {
		return _news_BlogsLocalService.createNews_Blogs(News_Blogs_Id);
	}

	/**
	* Deletes the news_ blogs with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param News_Blogs_Id the primary key of the news_ blogs
	* @return the news_ blogs that was removed
	* @throws PortalException if a news_ blogs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.daffo.model.News_Blogs deleteNews_Blogs(
		long News_Blogs_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _news_BlogsLocalService.deleteNews_Blogs(News_Blogs_Id);
	}

	/**
	* Deletes the news_ blogs from the database. Also notifies the appropriate model listeners.
	*
	* @param news_Blogs the news_ blogs
	* @return the news_ blogs that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.daffo.model.News_Blogs deleteNews_Blogs(
		com.liferay.daffo.model.News_Blogs news_Blogs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _news_BlogsLocalService.deleteNews_Blogs(news_Blogs);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _news_BlogsLocalService.dynamicQuery();
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
		return _news_BlogsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.daffo.model.impl.News_BlogsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _news_BlogsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.daffo.model.impl.News_BlogsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _news_BlogsLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _news_BlogsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _news_BlogsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.daffo.model.News_Blogs fetchNews_Blogs(
		long News_Blogs_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _news_BlogsLocalService.fetchNews_Blogs(News_Blogs_Id);
	}

	/**
	* Returns the news_ blogs with the primary key.
	*
	* @param News_Blogs_Id the primary key of the news_ blogs
	* @return the news_ blogs
	* @throws PortalException if a news_ blogs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.daffo.model.News_Blogs getNews_Blogs(long News_Blogs_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _news_BlogsLocalService.getNews_Blogs(News_Blogs_Id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _news_BlogsLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<com.liferay.daffo.model.News_Blogs> getNews_Blogses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _news_BlogsLocalService.getNews_Blogses(start, end);
	}

	/**
	* Returns the number of news_ blogses.
	*
	* @return the number of news_ blogses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getNews_BlogsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _news_BlogsLocalService.getNews_BlogsesCount();
	}

	/**
	* Updates the news_ blogs in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param news_Blogs the news_ blogs
	* @return the news_ blogs that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.daffo.model.News_Blogs updateNews_Blogs(
		com.liferay.daffo.model.News_Blogs news_Blogs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _news_BlogsLocalService.updateNews_Blogs(news_Blogs);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _news_BlogsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_news_BlogsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _news_BlogsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public News_BlogsLocalService getWrappedNews_BlogsLocalService() {
		return _news_BlogsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedNews_BlogsLocalService(
		News_BlogsLocalService news_BlogsLocalService) {
		_news_BlogsLocalService = news_BlogsLocalService;
	}

	@Override
	public News_BlogsLocalService getWrappedService() {
		return _news_BlogsLocalService;
	}

	@Override
	public void setWrappedService(News_BlogsLocalService news_BlogsLocalService) {
		_news_BlogsLocalService = news_BlogsLocalService;
	}

	private News_BlogsLocalService _news_BlogsLocalService;
}