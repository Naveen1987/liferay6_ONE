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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for News_Blogs. This utility wraps
 * {@link com.liferay.daffo.service.impl.News_BlogsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Naveen Kumar
 * @see News_BlogsLocalService
 * @see com.liferay.daffo.service.base.News_BlogsLocalServiceBaseImpl
 * @see com.liferay.daffo.service.impl.News_BlogsLocalServiceImpl
 * @generated
 */
public class News_BlogsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.daffo.service.impl.News_BlogsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the news_ blogs to the database. Also notifies the appropriate model listeners.
	*
	* @param news_Blogs the news_ blogs
	* @return the news_ blogs that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.daffo.model.News_Blogs addNews_Blogs(
		com.liferay.daffo.model.News_Blogs news_Blogs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addNews_Blogs(news_Blogs);
	}

	/**
	* Creates a new news_ blogs with the primary key. Does not add the news_ blogs to the database.
	*
	* @param News_Blogs_Id the primary key for the new news_ blogs
	* @return the new news_ blogs
	*/
	public static com.liferay.daffo.model.News_Blogs createNews_Blogs(
		long News_Blogs_Id) {
		return getService().createNews_Blogs(News_Blogs_Id);
	}

	/**
	* Deletes the news_ blogs with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param News_Blogs_Id the primary key of the news_ blogs
	* @return the news_ blogs that was removed
	* @throws PortalException if a news_ blogs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.daffo.model.News_Blogs deleteNews_Blogs(
		long News_Blogs_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteNews_Blogs(News_Blogs_Id);
	}

	/**
	* Deletes the news_ blogs from the database. Also notifies the appropriate model listeners.
	*
	* @param news_Blogs the news_ blogs
	* @return the news_ blogs that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.daffo.model.News_Blogs deleteNews_Blogs(
		com.liferay.daffo.model.News_Blogs news_Blogs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteNews_Blogs(news_Blogs);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.daffo.model.News_Blogs fetchNews_Blogs(
		long News_Blogs_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchNews_Blogs(News_Blogs_Id);
	}

	/**
	* Returns the news_ blogs with the primary key.
	*
	* @param News_Blogs_Id the primary key of the news_ blogs
	* @return the news_ blogs
	* @throws PortalException if a news_ blogs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.daffo.model.News_Blogs getNews_Blogs(
		long News_Blogs_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getNews_Blogs(News_Blogs_Id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.liferay.daffo.model.News_Blogs> getNews_Blogses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getNews_Blogses(start, end);
	}

	/**
	* Returns the number of news_ blogses.
	*
	* @return the number of news_ blogses
	* @throws SystemException if a system exception occurred
	*/
	public static int getNews_BlogsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getNews_BlogsesCount();
	}

	/**
	* Updates the news_ blogs in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param news_Blogs the news_ blogs
	* @return the news_ blogs that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.daffo.model.News_Blogs updateNews_Blogs(
		com.liferay.daffo.model.News_Blogs news_Blogs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateNews_Blogs(news_Blogs);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static News_BlogsLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					News_BlogsLocalService.class.getName());

			if (invokableLocalService instanceof News_BlogsLocalService) {
				_service = (News_BlogsLocalService)invokableLocalService;
			}
			else {
				_service = new News_BlogsLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(News_BlogsLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(News_BlogsLocalService service) {
	}

	private static News_BlogsLocalService _service;
}