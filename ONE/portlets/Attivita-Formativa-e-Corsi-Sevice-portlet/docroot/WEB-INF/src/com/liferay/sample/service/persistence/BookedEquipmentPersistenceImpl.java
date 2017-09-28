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

import com.liferay.sample.NoSuchBookedEquipmentException;
import com.liferay.sample.model.BookedEquipment;
import com.liferay.sample.model.impl.BookedEquipmentImpl;
import com.liferay.sample.model.impl.BookedEquipmentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the booked equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen Kumar
 * @see BookedEquipmentPersistence
 * @see BookedEquipmentUtil
 * @generated
 */
public class BookedEquipmentPersistenceImpl extends BasePersistenceImpl<BookedEquipment>
	implements BookedEquipmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BookedEquipmentUtil} to access the booked equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BookedEquipmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			BookedEquipmentModelImpl.FINDER_CACHE_ENABLED,
			BookedEquipmentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			BookedEquipmentModelImpl.FINDER_CACHE_ENABLED,
			BookedEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			BookedEquipmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public BookedEquipmentPersistenceImpl() {
		setModelClass(BookedEquipment.class);
	}

	/**
	 * Caches the booked equipment in the entity cache if it is enabled.
	 *
	 * @param bookedEquipment the booked equipment
	 */
	@Override
	public void cacheResult(BookedEquipment bookedEquipment) {
		EntityCacheUtil.putResult(BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			BookedEquipmentImpl.class, bookedEquipment.getPrimaryKey(),
			bookedEquipment);

		bookedEquipment.resetOriginalValues();
	}

	/**
	 * Caches the booked equipments in the entity cache if it is enabled.
	 *
	 * @param bookedEquipments the booked equipments
	 */
	@Override
	public void cacheResult(List<BookedEquipment> bookedEquipments) {
		for (BookedEquipment bookedEquipment : bookedEquipments) {
			if (EntityCacheUtil.getResult(
						BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
						BookedEquipmentImpl.class,
						bookedEquipment.getPrimaryKey()) == null) {
				cacheResult(bookedEquipment);
			}
			else {
				bookedEquipment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all booked equipments.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(BookedEquipmentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(BookedEquipmentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the booked equipment.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BookedEquipment bookedEquipment) {
		EntityCacheUtil.removeResult(BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			BookedEquipmentImpl.class, bookedEquipment.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<BookedEquipment> bookedEquipments) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (BookedEquipment bookedEquipment : bookedEquipments) {
			EntityCacheUtil.removeResult(BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
				BookedEquipmentImpl.class, bookedEquipment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new booked equipment with the primary key. Does not add the booked equipment to the database.
	 *
	 * @param booked_equip_id the primary key for the new booked equipment
	 * @return the new booked equipment
	 */
	@Override
	public BookedEquipment create(long booked_equip_id) {
		BookedEquipment bookedEquipment = new BookedEquipmentImpl();

		bookedEquipment.setNew(true);
		bookedEquipment.setPrimaryKey(booked_equip_id);

		return bookedEquipment;
	}

	/**
	 * Removes the booked equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param booked_equip_id the primary key of the booked equipment
	 * @return the booked equipment that was removed
	 * @throws com.liferay.sample.NoSuchBookedEquipmentException if a booked equipment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BookedEquipment remove(long booked_equip_id)
		throws NoSuchBookedEquipmentException, SystemException {
		return remove((Serializable)booked_equip_id);
	}

	/**
	 * Removes the booked equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the booked equipment
	 * @return the booked equipment that was removed
	 * @throws com.liferay.sample.NoSuchBookedEquipmentException if a booked equipment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BookedEquipment remove(Serializable primaryKey)
		throws NoSuchBookedEquipmentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			BookedEquipment bookedEquipment = (BookedEquipment)session.get(BookedEquipmentImpl.class,
					primaryKey);

			if (bookedEquipment == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBookedEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(bookedEquipment);
		}
		catch (NoSuchBookedEquipmentException nsee) {
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
	protected BookedEquipment removeImpl(BookedEquipment bookedEquipment)
		throws SystemException {
		bookedEquipment = toUnwrappedModel(bookedEquipment);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bookedEquipment)) {
				bookedEquipment = (BookedEquipment)session.get(BookedEquipmentImpl.class,
						bookedEquipment.getPrimaryKeyObj());
			}

			if (bookedEquipment != null) {
				session.delete(bookedEquipment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (bookedEquipment != null) {
			clearCache(bookedEquipment);
		}

		return bookedEquipment;
	}

	@Override
	public BookedEquipment updateImpl(
		com.liferay.sample.model.BookedEquipment bookedEquipment)
		throws SystemException {
		bookedEquipment = toUnwrappedModel(bookedEquipment);

		boolean isNew = bookedEquipment.isNew();

		Session session = null;

		try {
			session = openSession();

			if (bookedEquipment.isNew()) {
				session.save(bookedEquipment);

				bookedEquipment.setNew(false);
			}
			else {
				session.merge(bookedEquipment);
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

		EntityCacheUtil.putResult(BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			BookedEquipmentImpl.class, bookedEquipment.getPrimaryKey(),
			bookedEquipment);

		return bookedEquipment;
	}

	protected BookedEquipment toUnwrappedModel(BookedEquipment bookedEquipment) {
		if (bookedEquipment instanceof BookedEquipmentImpl) {
			return bookedEquipment;
		}

		BookedEquipmentImpl bookedEquipmentImpl = new BookedEquipmentImpl();

		bookedEquipmentImpl.setNew(bookedEquipment.isNew());
		bookedEquipmentImpl.setPrimaryKey(bookedEquipment.getPrimaryKey());

		bookedEquipmentImpl.setBooked_equip_id(bookedEquipment.getBooked_equip_id());
		bookedEquipmentImpl.setEquip_id(bookedEquipment.getEquip_id());
		bookedEquipmentImpl.setCourse_id(bookedEquipment.getCourse_id());
		bookedEquipmentImpl.setEquip_quantity(bookedEquipment.getEquip_quantity());
		bookedEquipmentImpl.setBooked_equip_status(bookedEquipment.isBooked_equip_status());
		bookedEquipmentImpl.setBooked_equip_date(bookedEquipment.getBooked_equip_date());

		return bookedEquipmentImpl;
	}

	/**
	 * Returns the booked equipment with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the booked equipment
	 * @return the booked equipment
	 * @throws com.liferay.sample.NoSuchBookedEquipmentException if a booked equipment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BookedEquipment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBookedEquipmentException, SystemException {
		BookedEquipment bookedEquipment = fetchByPrimaryKey(primaryKey);

		if (bookedEquipment == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBookedEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return bookedEquipment;
	}

	/**
	 * Returns the booked equipment with the primary key or throws a {@link com.liferay.sample.NoSuchBookedEquipmentException} if it could not be found.
	 *
	 * @param booked_equip_id the primary key of the booked equipment
	 * @return the booked equipment
	 * @throws com.liferay.sample.NoSuchBookedEquipmentException if a booked equipment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BookedEquipment findByPrimaryKey(long booked_equip_id)
		throws NoSuchBookedEquipmentException, SystemException {
		return findByPrimaryKey((Serializable)booked_equip_id);
	}

	/**
	 * Returns the booked equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the booked equipment
	 * @return the booked equipment, or <code>null</code> if a booked equipment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BookedEquipment fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		BookedEquipment bookedEquipment = (BookedEquipment)EntityCacheUtil.getResult(BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
				BookedEquipmentImpl.class, primaryKey);

		if (bookedEquipment == _nullBookedEquipment) {
			return null;
		}

		if (bookedEquipment == null) {
			Session session = null;

			try {
				session = openSession();

				bookedEquipment = (BookedEquipment)session.get(BookedEquipmentImpl.class,
						primaryKey);

				if (bookedEquipment != null) {
					cacheResult(bookedEquipment);
				}
				else {
					EntityCacheUtil.putResult(BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
						BookedEquipmentImpl.class, primaryKey,
						_nullBookedEquipment);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					BookedEquipmentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return bookedEquipment;
	}

	/**
	 * Returns the booked equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param booked_equip_id the primary key of the booked equipment
	 * @return the booked equipment, or <code>null</code> if a booked equipment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BookedEquipment fetchByPrimaryKey(long booked_equip_id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)booked_equip_id);
	}

	/**
	 * Returns all the booked equipments.
	 *
	 * @return the booked equipments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BookedEquipment> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<BookedEquipment> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the booked equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.BookedEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of booked equipments
	 * @param end the upper bound of the range of booked equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of booked equipments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BookedEquipment> findAll(int start, int end,
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

		List<BookedEquipment> list = (List<BookedEquipment>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BOOKEDEQUIPMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BOOKEDEQUIPMENT;

				if (pagination) {
					sql = sql.concat(BookedEquipmentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<BookedEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BookedEquipment>(list);
				}
				else {
					list = (List<BookedEquipment>)QueryUtil.list(q,
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
	 * Removes all the booked equipments from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (BookedEquipment bookedEquipment : findAll()) {
			remove(bookedEquipment);
		}
	}

	/**
	 * Returns the number of booked equipments.
	 *
	 * @return the number of booked equipments
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

				Query q = session.createQuery(_SQL_COUNT_BOOKEDEQUIPMENT);

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
	 * Initializes the booked equipment persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.sample.model.BookedEquipment")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<BookedEquipment>> listenersList = new ArrayList<ModelListener<BookedEquipment>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<BookedEquipment>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(BookedEquipmentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_BOOKEDEQUIPMENT = "SELECT bookedEquipment FROM BookedEquipment bookedEquipment";
	private static final String _SQL_COUNT_BOOKEDEQUIPMENT = "SELECT COUNT(bookedEquipment) FROM BookedEquipment bookedEquipment";
	private static final String _ORDER_BY_ENTITY_ALIAS = "bookedEquipment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BookedEquipment exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(BookedEquipmentPersistenceImpl.class);
	private static BookedEquipment _nullBookedEquipment = new BookedEquipmentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<BookedEquipment> toCacheModel() {
				return _nullBookedEquipmentCacheModel;
			}
		};

	private static CacheModel<BookedEquipment> _nullBookedEquipmentCacheModel = new CacheModel<BookedEquipment>() {
			@Override
			public BookedEquipment toEntityModel() {
				return _nullBookedEquipment;
			}
		};
}