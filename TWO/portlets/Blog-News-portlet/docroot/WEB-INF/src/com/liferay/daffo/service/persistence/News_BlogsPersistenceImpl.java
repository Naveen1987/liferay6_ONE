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

import com.liferay.daffo.NoSuchNews_BlogsException;
import com.liferay.daffo.model.News_Blogs;
import com.liferay.daffo.model.impl.News_BlogsImpl;
import com.liferay.daffo.model.impl.News_BlogsModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the news_ blogs service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen Kumar
 * @see News_BlogsPersistence
 * @see News_BlogsUtil
 * @generated
 */
public class News_BlogsPersistenceImpl extends BasePersistenceImpl<News_Blogs>
	implements News_BlogsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link News_BlogsUtil} to access the news_ blogs persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = News_BlogsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(News_BlogsModelImpl.ENTITY_CACHE_ENABLED,
			News_BlogsModelImpl.FINDER_CACHE_ENABLED, News_BlogsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(News_BlogsModelImpl.ENTITY_CACHE_ENABLED,
			News_BlogsModelImpl.FINDER_CACHE_ENABLED, News_BlogsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(News_BlogsModelImpl.ENTITY_CACHE_ENABLED,
			News_BlogsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public News_BlogsPersistenceImpl() {
		setModelClass(News_Blogs.class);
	}

	/**
	 * Caches the news_ blogs in the entity cache if it is enabled.
	 *
	 * @param news_Blogs the news_ blogs
	 */
	@Override
	public void cacheResult(News_Blogs news_Blogs) {
		EntityCacheUtil.putResult(News_BlogsModelImpl.ENTITY_CACHE_ENABLED,
			News_BlogsImpl.class, news_Blogs.getPrimaryKey(), news_Blogs);

		news_Blogs.resetOriginalValues();
	}

	/**
	 * Caches the news_ blogses in the entity cache if it is enabled.
	 *
	 * @param news_Blogses the news_ blogses
	 */
	@Override
	public void cacheResult(List<News_Blogs> news_Blogses) {
		for (News_Blogs news_Blogs : news_Blogses) {
			if (EntityCacheUtil.getResult(
						News_BlogsModelImpl.ENTITY_CACHE_ENABLED,
						News_BlogsImpl.class, news_Blogs.getPrimaryKey()) == null) {
				cacheResult(news_Blogs);
			}
			else {
				news_Blogs.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all news_ blogses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(News_BlogsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(News_BlogsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the news_ blogs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(News_Blogs news_Blogs) {
		EntityCacheUtil.removeResult(News_BlogsModelImpl.ENTITY_CACHE_ENABLED,
			News_BlogsImpl.class, news_Blogs.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<News_Blogs> news_Blogses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (News_Blogs news_Blogs : news_Blogses) {
			EntityCacheUtil.removeResult(News_BlogsModelImpl.ENTITY_CACHE_ENABLED,
				News_BlogsImpl.class, news_Blogs.getPrimaryKey());
		}
	}

	/**
	 * Creates a new news_ blogs with the primary key. Does not add the news_ blogs to the database.
	 *
	 * @param News_Blogs_Id the primary key for the new news_ blogs
	 * @return the new news_ blogs
	 */
	@Override
	public News_Blogs create(long News_Blogs_Id) {
		News_Blogs news_Blogs = new News_BlogsImpl();

		news_Blogs.setNew(true);
		news_Blogs.setPrimaryKey(News_Blogs_Id);

		return news_Blogs;
	}

	/**
	 * Removes the news_ blogs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param News_Blogs_Id the primary key of the news_ blogs
	 * @return the news_ blogs that was removed
	 * @throws com.liferay.daffo.NoSuchNews_BlogsException if a news_ blogs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public News_Blogs remove(long News_Blogs_Id)
		throws NoSuchNews_BlogsException, SystemException {
		return remove((Serializable)News_Blogs_Id);
	}

	/**
	 * Removes the news_ blogs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the news_ blogs
	 * @return the news_ blogs that was removed
	 * @throws com.liferay.daffo.NoSuchNews_BlogsException if a news_ blogs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public News_Blogs remove(Serializable primaryKey)
		throws NoSuchNews_BlogsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			News_Blogs news_Blogs = (News_Blogs)session.get(News_BlogsImpl.class,
					primaryKey);

			if (news_Blogs == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNews_BlogsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(news_Blogs);
		}
		catch (NoSuchNews_BlogsException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected News_Blogs removeImpl(News_Blogs news_Blogs)
		throws SystemException {
		news_Blogs = toUnwrappedModel(news_Blogs);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(news_Blogs)) {
				news_Blogs = (News_Blogs)session.get(News_BlogsImpl.class,
						news_Blogs.getPrimaryKeyObj());
			}

			if (news_Blogs != null) {
				session.delete(news_Blogs);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (news_Blogs != null) {
			clearCache(news_Blogs);
		}

		return news_Blogs;
	}

	@Override
	public News_Blogs updateImpl(com.liferay.daffo.model.News_Blogs news_Blogs)
		throws SystemException {
		news_Blogs = toUnwrappedModel(news_Blogs);

		boolean isNew = news_Blogs.isNew();

		Session session = null;

		try {
			session = openSession();

			if (news_Blogs.isNew()) {
				session.save(news_Blogs);

				news_Blogs.setNew(false);
			}
			else {
				session.merge(news_Blogs);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(News_BlogsModelImpl.ENTITY_CACHE_ENABLED,
			News_BlogsImpl.class, news_Blogs.getPrimaryKey(), news_Blogs);

		return news_Blogs;
	}

	protected News_Blogs toUnwrappedModel(News_Blogs news_Blogs) {
		if (news_Blogs instanceof News_BlogsImpl) {
			return news_Blogs;
		}

		News_BlogsImpl news_BlogsImpl = new News_BlogsImpl();

		news_BlogsImpl.setNew(news_Blogs.isNew());
		news_BlogsImpl.setPrimaryKey(news_Blogs.getPrimaryKey());

		news_BlogsImpl.setNews_Blogs_Id(news_Blogs.getNews_Blogs_Id());
		news_BlogsImpl.setTitle(news_Blogs.getTitle());
		news_BlogsImpl.setBody(news_Blogs.getBody());
		news_BlogsImpl.setPublish_Date(news_Blogs.getPublish_Date());
		news_BlogsImpl.setExpiration_Date(news_Blogs.getExpiration_Date());
		news_BlogsImpl.setAuthor(news_Blogs.getAuthor());
		news_BlogsImpl.setVisible(news_Blogs.getVisible());

		return news_BlogsImpl;
	}

	/**
	 * Returns the news_ blogs with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the news_ blogs
	 * @return the news_ blogs
	 * @throws com.liferay.daffo.NoSuchNews_BlogsException if a news_ blogs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public News_Blogs findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNews_BlogsException, SystemException {
		News_Blogs news_Blogs = fetchByPrimaryKey(primaryKey);

		if (news_Blogs == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNews_BlogsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return news_Blogs;
	}

	/**
	 * Returns the news_ blogs with the primary key or throws a {@link com.liferay.daffo.NoSuchNews_BlogsException} if it could not be found.
	 *
	 * @param News_Blogs_Id the primary key of the news_ blogs
	 * @return the news_ blogs
	 * @throws com.liferay.daffo.NoSuchNews_BlogsException if a news_ blogs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public News_Blogs findByPrimaryKey(long News_Blogs_Id)
		throws NoSuchNews_BlogsException, SystemException {
		return findByPrimaryKey((Serializable)News_Blogs_Id);
	}

	/**
	 * Returns the news_ blogs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the news_ blogs
	 * @return the news_ blogs, or <code>null</code> if a news_ blogs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public News_Blogs fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		News_Blogs news_Blogs = (News_Blogs)EntityCacheUtil.getResult(News_BlogsModelImpl.ENTITY_CACHE_ENABLED,
				News_BlogsImpl.class, primaryKey);

		if (news_Blogs == _nullNews_Blogs) {
			return null;
		}

		if (news_Blogs == null) {
			Session session = null;

			try {
				session = openSession();

				news_Blogs = (News_Blogs)session.get(News_BlogsImpl.class,
						primaryKey);

				if (news_Blogs != null) {
					cacheResult(news_Blogs);
				}
				else {
					EntityCacheUtil.putResult(News_BlogsModelImpl.ENTITY_CACHE_ENABLED,
						News_BlogsImpl.class, primaryKey, _nullNews_Blogs);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(News_BlogsModelImpl.ENTITY_CACHE_ENABLED,
					News_BlogsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return news_Blogs;
	}

	/**
	 * Returns the news_ blogs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param News_Blogs_Id the primary key of the news_ blogs
	 * @return the news_ blogs, or <code>null</code> if a news_ blogs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public News_Blogs fetchByPrimaryKey(long News_Blogs_Id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)News_Blogs_Id);
	}

	/**
	 * Returns all the news_ blogses.
	 *
	 * @return the news_ blogses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<News_Blogs> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<News_Blogs> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<News_Blogs> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<News_Blogs> list = (List<News_Blogs>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_NEWS_BLOGS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NEWS_BLOGS;

				if (pagination) {
					sql = sql.concat(News_BlogsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<News_Blogs>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<News_Blogs>(list);
				}
				else {
					list = (List<News_Blogs>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the news_ blogses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (News_Blogs news_Blogs : findAll()) {
			remove(news_Blogs);
		}
	}

	/**
	 * Returns the number of news_ blogses.
	 *
	 * @return the number of news_ blogses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_NEWS_BLOGS);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the news_ blogs persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.daffo.model.News_Blogs")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<News_Blogs>> listenersList = new ArrayList<ModelListener<News_Blogs>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<News_Blogs>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(News_BlogsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_NEWS_BLOGS = "SELECT news_Blogs FROM News_Blogs news_Blogs";
	private static final String _SQL_COUNT_NEWS_BLOGS = "SELECT COUNT(news_Blogs) FROM News_Blogs news_Blogs";
	private static final String _ORDER_BY_ENTITY_ALIAS = "news_Blogs.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No News_Blogs exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(News_BlogsPersistenceImpl.class);
	private static News_Blogs _nullNews_Blogs = new News_BlogsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<News_Blogs> toCacheModel() {
				return _nullNews_BlogsCacheModel;
			}
		};

	private static CacheModel<News_Blogs> _nullNews_BlogsCacheModel = new CacheModel<News_Blogs>() {
			@Override
			public News_Blogs toEntityModel() {
				return _nullNews_Blogs;
			}
		};
}