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

import com.liferay.sample.NoSuchsuiluppo_room_allocation_archiveException;
import com.liferay.sample.model.impl.suiluppo_room_allocation_archiveImpl;
import com.liferay.sample.model.impl.suiluppo_room_allocation_archiveModelImpl;
import com.liferay.sample.model.suiluppo_room_allocation_archive;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the suiluppo_room_allocation_archive service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen Kumar
 * @see suiluppo_room_allocation_archivePersistence
 * @see suiluppo_room_allocation_archiveUtil
 * @generated
 */
public class suiluppo_room_allocation_archivePersistenceImpl
	extends BasePersistenceImpl<suiluppo_room_allocation_archive>
	implements suiluppo_room_allocation_archivePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link suiluppo_room_allocation_archiveUtil} to access the suiluppo_room_allocation_archive persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = suiluppo_room_allocation_archiveImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_room_allocation_archiveModelImpl.FINDER_CACHE_ENABLED,
			suiluppo_room_allocation_archiveImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_room_allocation_archiveModelImpl.FINDER_CACHE_ENABLED,
			suiluppo_room_allocation_archiveImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_room_allocation_archiveModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public suiluppo_room_allocation_archivePersistenceImpl() {
		setModelClass(suiluppo_room_allocation_archive.class);
	}

	/**
	 * Caches the suiluppo_room_allocation_archive in the entity cache if it is enabled.
	 *
	 * @param suiluppo_room_allocation_archive the suiluppo_room_allocation_archive
	 */
	@Override
	public void cacheResult(
		suiluppo_room_allocation_archive suiluppo_room_allocation_archive) {
		EntityCacheUtil.putResult(suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_room_allocation_archiveImpl.class,
			suiluppo_room_allocation_archive.getPrimaryKey(),
			suiluppo_room_allocation_archive);

		suiluppo_room_allocation_archive.resetOriginalValues();
	}

	/**
	 * Caches the suiluppo_room_allocation_archives in the entity cache if it is enabled.
	 *
	 * @param suiluppo_room_allocation_archives the suiluppo_room_allocation_archives
	 */
	@Override
	public void cacheResult(
		List<suiluppo_room_allocation_archive> suiluppo_room_allocation_archives) {
		for (suiluppo_room_allocation_archive suiluppo_room_allocation_archive : suiluppo_room_allocation_archives) {
			if (EntityCacheUtil.getResult(
						suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
						suiluppo_room_allocation_archiveImpl.class,
						suiluppo_room_allocation_archive.getPrimaryKey()) == null) {
				cacheResult(suiluppo_room_allocation_archive);
			}
			else {
				suiluppo_room_allocation_archive.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all suiluppo_room_allocation_archives.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(suiluppo_room_allocation_archiveImpl.class.getName());
		}

		EntityCacheUtil.clearCache(suiluppo_room_allocation_archiveImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the suiluppo_room_allocation_archive.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		suiluppo_room_allocation_archive suiluppo_room_allocation_archive) {
		EntityCacheUtil.removeResult(suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_room_allocation_archiveImpl.class,
			suiluppo_room_allocation_archive.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<suiluppo_room_allocation_archive> suiluppo_room_allocation_archives) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (suiluppo_room_allocation_archive suiluppo_room_allocation_archive : suiluppo_room_allocation_archives) {
			EntityCacheUtil.removeResult(suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
				suiluppo_room_allocation_archiveImpl.class,
				suiluppo_room_allocation_archive.getPrimaryKey());
		}
	}

	/**
	 * Creates a new suiluppo_room_allocation_archive with the primary key. Does not add the suiluppo_room_allocation_archive to the database.
	 *
	 * @param room_allocat_archive_id the primary key for the new suiluppo_room_allocation_archive
	 * @return the new suiluppo_room_allocation_archive
	 */
	@Override
	public suiluppo_room_allocation_archive create(long room_allocat_archive_id) {
		suiluppo_room_allocation_archive suiluppo_room_allocation_archive = new suiluppo_room_allocation_archiveImpl();

		suiluppo_room_allocation_archive.setNew(true);
		suiluppo_room_allocation_archive.setPrimaryKey(room_allocat_archive_id);

		return suiluppo_room_allocation_archive;
	}

	/**
	 * Removes the suiluppo_room_allocation_archive with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param room_allocat_archive_id the primary key of the suiluppo_room_allocation_archive
	 * @return the suiluppo_room_allocation_archive that was removed
	 * @throws com.liferay.sample.NoSuchsuiluppo_room_allocation_archiveException if a suiluppo_room_allocation_archive with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public suiluppo_room_allocation_archive remove(long room_allocat_archive_id)
		throws NoSuchsuiluppo_room_allocation_archiveException, SystemException {
		return remove((Serializable)room_allocat_archive_id);
	}

	/**
	 * Removes the suiluppo_room_allocation_archive with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the suiluppo_room_allocation_archive
	 * @return the suiluppo_room_allocation_archive that was removed
	 * @throws com.liferay.sample.NoSuchsuiluppo_room_allocation_archiveException if a suiluppo_room_allocation_archive with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public suiluppo_room_allocation_archive remove(Serializable primaryKey)
		throws NoSuchsuiluppo_room_allocation_archiveException, SystemException {
		Session session = null;

		try {
			session = openSession();

			suiluppo_room_allocation_archive suiluppo_room_allocation_archive = (suiluppo_room_allocation_archive)session.get(suiluppo_room_allocation_archiveImpl.class,
					primaryKey);

			if (suiluppo_room_allocation_archive == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchsuiluppo_room_allocation_archiveException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(suiluppo_room_allocation_archive);
		}
		catch (NoSuchsuiluppo_room_allocation_archiveException nsee) {
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
	protected suiluppo_room_allocation_archive removeImpl(
		suiluppo_room_allocation_archive suiluppo_room_allocation_archive)
		throws SystemException {
		suiluppo_room_allocation_archive = toUnwrappedModel(suiluppo_room_allocation_archive);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(suiluppo_room_allocation_archive)) {
				suiluppo_room_allocation_archive = (suiluppo_room_allocation_archive)session.get(suiluppo_room_allocation_archiveImpl.class,
						suiluppo_room_allocation_archive.getPrimaryKeyObj());
			}

			if (suiluppo_room_allocation_archive != null) {
				session.delete(suiluppo_room_allocation_archive);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (suiluppo_room_allocation_archive != null) {
			clearCache(suiluppo_room_allocation_archive);
		}

		return suiluppo_room_allocation_archive;
	}

	@Override
	public suiluppo_room_allocation_archive updateImpl(
		com.liferay.sample.model.suiluppo_room_allocation_archive suiluppo_room_allocation_archive)
		throws SystemException {
		suiluppo_room_allocation_archive = toUnwrappedModel(suiluppo_room_allocation_archive);

		boolean isNew = suiluppo_room_allocation_archive.isNew();

		Session session = null;

		try {
			session = openSession();

			if (suiluppo_room_allocation_archive.isNew()) {
				session.save(suiluppo_room_allocation_archive);

				suiluppo_room_allocation_archive.setNew(false);
			}
			else {
				session.merge(suiluppo_room_allocation_archive);
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

		EntityCacheUtil.putResult(suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_room_allocation_archiveImpl.class,
			suiluppo_room_allocation_archive.getPrimaryKey(),
			suiluppo_room_allocation_archive);

		return suiluppo_room_allocation_archive;
	}

	protected suiluppo_room_allocation_archive toUnwrappedModel(
		suiluppo_room_allocation_archive suiluppo_room_allocation_archive) {
		if (suiluppo_room_allocation_archive instanceof suiluppo_room_allocation_archiveImpl) {
			return suiluppo_room_allocation_archive;
		}

		suiluppo_room_allocation_archiveImpl suiluppo_room_allocation_archiveImpl =
			new suiluppo_room_allocation_archiveImpl();

		suiluppo_room_allocation_archiveImpl.setNew(suiluppo_room_allocation_archive.isNew());
		suiluppo_room_allocation_archiveImpl.setPrimaryKey(suiluppo_room_allocation_archive.getPrimaryKey());

		suiluppo_room_allocation_archiveImpl.setRoom_allocat_archive_id(suiluppo_room_allocation_archive.getRoom_allocat_archive_id());
		suiluppo_room_allocation_archiveImpl.setRoomID(suiluppo_room_allocation_archive.getRoomID());
		suiluppo_room_allocation_archiveImpl.setCourse_id(suiluppo_room_allocation_archive.getCourse_id());
		suiluppo_room_allocation_archiveImpl.setRoom_allocat_date(suiluppo_room_allocation_archive.getRoom_allocat_date());
		suiluppo_room_allocation_archiveImpl.setRoom_allocat_startTime(suiluppo_room_allocation_archive.getRoom_allocat_startTime());
		suiluppo_room_allocation_archiveImpl.setRoom_allocat_start(suiluppo_room_allocation_archive.getRoom_allocat_start());
		suiluppo_room_allocation_archiveImpl.setRoom_allocat_end(suiluppo_room_allocation_archive.getRoom_allocat_end());
		suiluppo_room_allocation_archiveImpl.setRoom_allocat_status(suiluppo_room_allocation_archive.getRoom_allocat_status());
		suiluppo_room_allocation_archiveImpl.setRoom_allocat_endTime(suiluppo_room_allocation_archive.getRoom_allocat_endTime());
		suiluppo_room_allocation_archiveImpl.setRoom_archive_date(suiluppo_room_allocation_archive.getRoom_archive_date());

		return suiluppo_room_allocation_archiveImpl;
	}

	/**
	 * Returns the suiluppo_room_allocation_archive with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the suiluppo_room_allocation_archive
	 * @return the suiluppo_room_allocation_archive
	 * @throws com.liferay.sample.NoSuchsuiluppo_room_allocation_archiveException if a suiluppo_room_allocation_archive with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public suiluppo_room_allocation_archive findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchsuiluppo_room_allocation_archiveException, SystemException {
		suiluppo_room_allocation_archive suiluppo_room_allocation_archive = fetchByPrimaryKey(primaryKey);

		if (suiluppo_room_allocation_archive == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchsuiluppo_room_allocation_archiveException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return suiluppo_room_allocation_archive;
	}

	/**
	 * Returns the suiluppo_room_allocation_archive with the primary key or throws a {@link com.liferay.sample.NoSuchsuiluppo_room_allocation_archiveException} if it could not be found.
	 *
	 * @param room_allocat_archive_id the primary key of the suiluppo_room_allocation_archive
	 * @return the suiluppo_room_allocation_archive
	 * @throws com.liferay.sample.NoSuchsuiluppo_room_allocation_archiveException if a suiluppo_room_allocation_archive with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public suiluppo_room_allocation_archive findByPrimaryKey(
		long room_allocat_archive_id)
		throws NoSuchsuiluppo_room_allocation_archiveException, SystemException {
		return findByPrimaryKey((Serializable)room_allocat_archive_id);
	}

	/**
	 * Returns the suiluppo_room_allocation_archive with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the suiluppo_room_allocation_archive
	 * @return the suiluppo_room_allocation_archive, or <code>null</code> if a suiluppo_room_allocation_archive with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public suiluppo_room_allocation_archive fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		suiluppo_room_allocation_archive suiluppo_room_allocation_archive = (suiluppo_room_allocation_archive)EntityCacheUtil.getResult(suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
				suiluppo_room_allocation_archiveImpl.class, primaryKey);

		if (suiluppo_room_allocation_archive == _nullsuiluppo_room_allocation_archive) {
			return null;
		}

		if (suiluppo_room_allocation_archive == null) {
			Session session = null;

			try {
				session = openSession();

				suiluppo_room_allocation_archive = (suiluppo_room_allocation_archive)session.get(suiluppo_room_allocation_archiveImpl.class,
						primaryKey);

				if (suiluppo_room_allocation_archive != null) {
					cacheResult(suiluppo_room_allocation_archive);
				}
				else {
					EntityCacheUtil.putResult(suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
						suiluppo_room_allocation_archiveImpl.class, primaryKey,
						_nullsuiluppo_room_allocation_archive);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
					suiluppo_room_allocation_archiveImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return suiluppo_room_allocation_archive;
	}

	/**
	 * Returns the suiluppo_room_allocation_archive with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param room_allocat_archive_id the primary key of the suiluppo_room_allocation_archive
	 * @return the suiluppo_room_allocation_archive, or <code>null</code> if a suiluppo_room_allocation_archive with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public suiluppo_room_allocation_archive fetchByPrimaryKey(
		long room_allocat_archive_id) throws SystemException {
		return fetchByPrimaryKey((Serializable)room_allocat_archive_id);
	}

	/**
	 * Returns all the suiluppo_room_allocation_archives.
	 *
	 * @return the suiluppo_room_allocation_archives
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<suiluppo_room_allocation_archive> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the suiluppo_room_allocation_archives.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.suiluppo_room_allocation_archiveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of suiluppo_room_allocation_archives
	 * @param end the upper bound of the range of suiluppo_room_allocation_archives (not inclusive)
	 * @return the range of suiluppo_room_allocation_archives
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<suiluppo_room_allocation_archive> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the suiluppo_room_allocation_archives.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.suiluppo_room_allocation_archiveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of suiluppo_room_allocation_archives
	 * @param end the upper bound of the range of suiluppo_room_allocation_archives (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of suiluppo_room_allocation_archives
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<suiluppo_room_allocation_archive> findAll(int start, int end,
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

		List<suiluppo_room_allocation_archive> list = (List<suiluppo_room_allocation_archive>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SUILUPPO_ROOM_ALLOCATION_ARCHIVE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SUILUPPO_ROOM_ALLOCATION_ARCHIVE;

				if (pagination) {
					sql = sql.concat(suiluppo_room_allocation_archiveModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<suiluppo_room_allocation_archive>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<suiluppo_room_allocation_archive>(list);
				}
				else {
					list = (List<suiluppo_room_allocation_archive>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the suiluppo_room_allocation_archives from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (suiluppo_room_allocation_archive suiluppo_room_allocation_archive : findAll()) {
			remove(suiluppo_room_allocation_archive);
		}
	}

	/**
	 * Returns the number of suiluppo_room_allocation_archives.
	 *
	 * @return the number of suiluppo_room_allocation_archives
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

				Query q = session.createQuery(_SQL_COUNT_SUILUPPO_ROOM_ALLOCATION_ARCHIVE);

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
	 * Initializes the suiluppo_room_allocation_archive persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.sample.model.suiluppo_room_allocation_archive")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<suiluppo_room_allocation_archive>> listenersList =
					new ArrayList<ModelListener<suiluppo_room_allocation_archive>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<suiluppo_room_allocation_archive>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(suiluppo_room_allocation_archiveImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SUILUPPO_ROOM_ALLOCATION_ARCHIVE = "SELECT suiluppo_room_allocation_archive FROM suiluppo_room_allocation_archive suiluppo_room_allocation_archive";
	private static final String _SQL_COUNT_SUILUPPO_ROOM_ALLOCATION_ARCHIVE = "SELECT COUNT(suiluppo_room_allocation_archive) FROM suiluppo_room_allocation_archive suiluppo_room_allocation_archive";
	private static final String _ORDER_BY_ENTITY_ALIAS = "suiluppo_room_allocation_archive.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No suiluppo_room_allocation_archive exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(suiluppo_room_allocation_archivePersistenceImpl.class);
	private static suiluppo_room_allocation_archive _nullsuiluppo_room_allocation_archive =
		new suiluppo_room_allocation_archiveImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<suiluppo_room_allocation_archive> toCacheModel() {
				return _nullsuiluppo_room_allocation_archiveCacheModel;
			}
		};

	private static CacheModel<suiluppo_room_allocation_archive> _nullsuiluppo_room_allocation_archiveCacheModel =
		new CacheModel<suiluppo_room_allocation_archive>() {
			@Override
			public suiluppo_room_allocation_archive toEntityModel() {
				return _nullsuiluppo_room_allocation_archive;
			}
		};
}