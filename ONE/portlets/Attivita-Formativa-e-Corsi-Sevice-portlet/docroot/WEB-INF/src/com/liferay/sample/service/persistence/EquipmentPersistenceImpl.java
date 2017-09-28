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

import com.liferay.sample.NoSuchEquipmentException;
import com.liferay.sample.model.Equipment;
import com.liferay.sample.model.impl.EquipmentImpl;
import com.liferay.sample.model.impl.EquipmentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen Kumar
 * @see EquipmentPersistence
 * @see EquipmentUtil
 * @generated
 */
public class EquipmentPersistenceImpl extends BasePersistenceImpl<Equipment>
	implements EquipmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EquipmentUtil} to access the equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EquipmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EquipmentModelImpl.ENTITY_CACHE_ENABLED,
			EquipmentModelImpl.FINDER_CACHE_ENABLED, EquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EquipmentModelImpl.ENTITY_CACHE_ENABLED,
			EquipmentModelImpl.FINDER_CACHE_ENABLED, EquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EquipmentModelImpl.ENTITY_CACHE_ENABLED,
			EquipmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EquipmentPersistenceImpl() {
		setModelClass(Equipment.class);
	}

	/**
	 * Caches the equipment in the entity cache if it is enabled.
	 *
	 * @param equipment the equipment
	 */
	@Override
	public void cacheResult(Equipment equipment) {
		EntityCacheUtil.putResult(EquipmentModelImpl.ENTITY_CACHE_ENABLED,
			EquipmentImpl.class, equipment.getPrimaryKey(), equipment);

		equipment.resetOriginalValues();
	}

	/**
	 * Caches the equipments in the entity cache if it is enabled.
	 *
	 * @param equipments the equipments
	 */
	@Override
	public void cacheResult(List<Equipment> equipments) {
		for (Equipment equipment : equipments) {
			if (EntityCacheUtil.getResult(
						EquipmentModelImpl.ENTITY_CACHE_ENABLED,
						EquipmentImpl.class, equipment.getPrimaryKey()) == null) {
				cacheResult(equipment);
			}
			else {
				equipment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all equipments.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EquipmentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EquipmentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the equipment.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Equipment equipment) {
		EntityCacheUtil.removeResult(EquipmentModelImpl.ENTITY_CACHE_ENABLED,
			EquipmentImpl.class, equipment.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Equipment> equipments) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Equipment equipment : equipments) {
			EntityCacheUtil.removeResult(EquipmentModelImpl.ENTITY_CACHE_ENABLED,
				EquipmentImpl.class, equipment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new equipment with the primary key. Does not add the equipment to the database.
	 *
	 * @param equip_id the primary key for the new equipment
	 * @return the new equipment
	 */
	@Override
	public Equipment create(long equip_id) {
		Equipment equipment = new EquipmentImpl();

		equipment.setNew(true);
		equipment.setPrimaryKey(equip_id);

		return equipment;
	}

	/**
	 * Removes the equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param equip_id the primary key of the equipment
	 * @return the equipment that was removed
	 * @throws com.liferay.sample.NoSuchEquipmentException if a equipment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Equipment remove(long equip_id)
		throws NoSuchEquipmentException, SystemException {
		return remove((Serializable)equip_id);
	}

	/**
	 * Removes the equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the equipment
	 * @return the equipment that was removed
	 * @throws com.liferay.sample.NoSuchEquipmentException if a equipment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Equipment remove(Serializable primaryKey)
		throws NoSuchEquipmentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Equipment equipment = (Equipment)session.get(EquipmentImpl.class,
					primaryKey);

			if (equipment == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(equipment);
		}
		catch (NoSuchEquipmentException nsee) {
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
	protected Equipment removeImpl(Equipment equipment)
		throws SystemException {
		equipment = toUnwrappedModel(equipment);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(equipment)) {
				equipment = (Equipment)session.get(EquipmentImpl.class,
						equipment.getPrimaryKeyObj());
			}

			if (equipment != null) {
				session.delete(equipment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (equipment != null) {
			clearCache(equipment);
		}

		return equipment;
	}

	@Override
	public Equipment updateImpl(com.liferay.sample.model.Equipment equipment)
		throws SystemException {
		equipment = toUnwrappedModel(equipment);

		boolean isNew = equipment.isNew();

		Session session = null;

		try {
			session = openSession();

			if (equipment.isNew()) {
				session.save(equipment);

				equipment.setNew(false);
			}
			else {
				session.merge(equipment);
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

		EntityCacheUtil.putResult(EquipmentModelImpl.ENTITY_CACHE_ENABLED,
			EquipmentImpl.class, equipment.getPrimaryKey(), equipment);

		return equipment;
	}

	protected Equipment toUnwrappedModel(Equipment equipment) {
		if (equipment instanceof EquipmentImpl) {
			return equipment;
		}

		EquipmentImpl equipmentImpl = new EquipmentImpl();

		equipmentImpl.setNew(equipment.isNew());
		equipmentImpl.setPrimaryKey(equipment.getPrimaryKey());

		equipmentImpl.setEquip_id(equipment.getEquip_id());
		equipmentImpl.setEquipment_name(equipment.getEquipment_name());
		equipmentImpl.setEquip_quantity(equipment.getEquip_quantity());
		equipmentImpl.setEquip_description(equipment.getEquip_description());
		equipmentImpl.setEquip_status(equipment.isEquip_status());

		return equipmentImpl;
	}

	/**
	 * Returns the equipment with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the equipment
	 * @return the equipment
	 * @throws com.liferay.sample.NoSuchEquipmentException if a equipment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Equipment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEquipmentException, SystemException {
		Equipment equipment = fetchByPrimaryKey(primaryKey);

		if (equipment == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return equipment;
	}

	/**
	 * Returns the equipment with the primary key or throws a {@link com.liferay.sample.NoSuchEquipmentException} if it could not be found.
	 *
	 * @param equip_id the primary key of the equipment
	 * @return the equipment
	 * @throws com.liferay.sample.NoSuchEquipmentException if a equipment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Equipment findByPrimaryKey(long equip_id)
		throws NoSuchEquipmentException, SystemException {
		return findByPrimaryKey((Serializable)equip_id);
	}

	/**
	 * Returns the equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the equipment
	 * @return the equipment, or <code>null</code> if a equipment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Equipment fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Equipment equipment = (Equipment)EntityCacheUtil.getResult(EquipmentModelImpl.ENTITY_CACHE_ENABLED,
				EquipmentImpl.class, primaryKey);

		if (equipment == _nullEquipment) {
			return null;
		}

		if (equipment == null) {
			Session session = null;

			try {
				session = openSession();

				equipment = (Equipment)session.get(EquipmentImpl.class,
						primaryKey);

				if (equipment != null) {
					cacheResult(equipment);
				}
				else {
					EntityCacheUtil.putResult(EquipmentModelImpl.ENTITY_CACHE_ENABLED,
						EquipmentImpl.class, primaryKey, _nullEquipment);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EquipmentModelImpl.ENTITY_CACHE_ENABLED,
					EquipmentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return equipment;
	}

	/**
	 * Returns the equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param equip_id the primary key of the equipment
	 * @return the equipment, or <code>null</code> if a equipment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Equipment fetchByPrimaryKey(long equip_id) throws SystemException {
		return fetchByPrimaryKey((Serializable)equip_id);
	}

	/**
	 * Returns all the equipments.
	 *
	 * @return the equipments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Equipment> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.EquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of equipments
	 * @param end the upper bound of the range of equipments (not inclusive)
	 * @return the range of equipments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Equipment> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.EquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of equipments
	 * @param end the upper bound of the range of equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of equipments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Equipment> findAll(int start, int end,
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

		List<Equipment> list = (List<Equipment>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EQUIPMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EQUIPMENT;

				if (pagination) {
					sql = sql.concat(EquipmentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Equipment>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Equipment>(list);
				}
				else {
					list = (List<Equipment>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the equipments from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Equipment equipment : findAll()) {
			remove(equipment);
		}
	}

	/**
	 * Returns the number of equipments.
	 *
	 * @return the number of equipments
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

				Query q = session.createQuery(_SQL_COUNT_EQUIPMENT);

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
	 * Initializes the equipment persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.sample.model.Equipment")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Equipment>> listenersList = new ArrayList<ModelListener<Equipment>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Equipment>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EquipmentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EQUIPMENT = "SELECT equipment FROM Equipment equipment";
	private static final String _SQL_COUNT_EQUIPMENT = "SELECT COUNT(equipment) FROM Equipment equipment";
	private static final String _ORDER_BY_ENTITY_ALIAS = "equipment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Equipment exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EquipmentPersistenceImpl.class);
	private static Equipment _nullEquipment = new EquipmentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Equipment> toCacheModel() {
				return _nullEquipmentCacheModel;
			}
		};

	private static CacheModel<Equipment> _nullEquipmentCacheModel = new CacheModel<Equipment>() {
			@Override
			public Equipment toEntityModel() {
				return _nullEquipment;
			}
		};
}