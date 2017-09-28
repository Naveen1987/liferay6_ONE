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

import com.liferay.sample.NoSuchTelephonicException;
import com.liferay.sample.model.Telephonic;
import com.liferay.sample.model.impl.TelephonicImpl;
import com.liferay.sample.model.impl.TelephonicModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the telephonic service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Administrator
 * @see TelephonicPersistence
 * @see TelephonicUtil
 * @generated
 */
public class TelephonicPersistenceImpl extends BasePersistenceImpl<Telephonic>
	implements TelephonicPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TelephonicUtil} to access the telephonic persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TelephonicImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TelephonicModelImpl.ENTITY_CACHE_ENABLED,
			TelephonicModelImpl.FINDER_CACHE_ENABLED, TelephonicImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TelephonicModelImpl.ENTITY_CACHE_ENABLED,
			TelephonicModelImpl.FINDER_CACHE_ENABLED, TelephonicImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TelephonicModelImpl.ENTITY_CACHE_ENABLED,
			TelephonicModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TelephonicPersistenceImpl() {
		setModelClass(Telephonic.class);
	}

	/**
	 * Caches the telephonic in the entity cache if it is enabled.
	 *
	 * @param telephonic the telephonic
	 */
	@Override
	public void cacheResult(Telephonic telephonic) {
		EntityCacheUtil.putResult(TelephonicModelImpl.ENTITY_CACHE_ENABLED,
			TelephonicImpl.class, telephonic.getPrimaryKey(), telephonic);

		telephonic.resetOriginalValues();
	}

	/**
	 * Caches the telephonics in the entity cache if it is enabled.
	 *
	 * @param telephonics the telephonics
	 */
	@Override
	public void cacheResult(List<Telephonic> telephonics) {
		for (Telephonic telephonic : telephonics) {
			if (EntityCacheUtil.getResult(
						TelephonicModelImpl.ENTITY_CACHE_ENABLED,
						TelephonicImpl.class, telephonic.getPrimaryKey()) == null) {
				cacheResult(telephonic);
			}
			else {
				telephonic.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all telephonics.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TelephonicImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TelephonicImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the telephonic.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Telephonic telephonic) {
		EntityCacheUtil.removeResult(TelephonicModelImpl.ENTITY_CACHE_ENABLED,
			TelephonicImpl.class, telephonic.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Telephonic> telephonics) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Telephonic telephonic : telephonics) {
			EntityCacheUtil.removeResult(TelephonicModelImpl.ENTITY_CACHE_ENABLED,
				TelephonicImpl.class, telephonic.getPrimaryKey());
		}
	}

	/**
	 * Creates a new telephonic with the primary key. Does not add the telephonic to the database.
	 *
	 * @param telephonicId the primary key for the new telephonic
	 * @return the new telephonic
	 */
	@Override
	public Telephonic create(long telephonicId) {
		Telephonic telephonic = new TelephonicImpl();

		telephonic.setNew(true);
		telephonic.setPrimaryKey(telephonicId);

		return telephonic;
	}

	/**
	 * Removes the telephonic with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param telephonicId the primary key of the telephonic
	 * @return the telephonic that was removed
	 * @throws com.liferay.sample.NoSuchTelephonicException if a telephonic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Telephonic remove(long telephonicId)
		throws NoSuchTelephonicException, SystemException {
		return remove((Serializable)telephonicId);
	}

	/**
	 * Removes the telephonic with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the telephonic
	 * @return the telephonic that was removed
	 * @throws com.liferay.sample.NoSuchTelephonicException if a telephonic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Telephonic remove(Serializable primaryKey)
		throws NoSuchTelephonicException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Telephonic telephonic = (Telephonic)session.get(TelephonicImpl.class,
					primaryKey);

			if (telephonic == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTelephonicException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(telephonic);
		}
		catch (NoSuchTelephonicException nsee) {
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
	protected Telephonic removeImpl(Telephonic telephonic)
		throws SystemException {
		telephonic = toUnwrappedModel(telephonic);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(telephonic)) {
				telephonic = (Telephonic)session.get(TelephonicImpl.class,
						telephonic.getPrimaryKeyObj());
			}

			if (telephonic != null) {
				session.delete(telephonic);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (telephonic != null) {
			clearCache(telephonic);
		}

		return telephonic;
	}

	@Override
	public Telephonic updateImpl(com.liferay.sample.model.Telephonic telephonic)
		throws SystemException {
		telephonic = toUnwrappedModel(telephonic);

		boolean isNew = telephonic.isNew();

		Session session = null;

		try {
			session = openSession();

			if (telephonic.isNew()) {
				session.save(telephonic);

				telephonic.setNew(false);
			}
			else {
				session.merge(telephonic);
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

		EntityCacheUtil.putResult(TelephonicModelImpl.ENTITY_CACHE_ENABLED,
			TelephonicImpl.class, telephonic.getPrimaryKey(), telephonic);

		return telephonic;
	}

	protected Telephonic toUnwrappedModel(Telephonic telephonic) {
		if (telephonic instanceof TelephonicImpl) {
			return telephonic;
		}

		TelephonicImpl telephonicImpl = new TelephonicImpl();

		telephonicImpl.setNew(telephonic.isNew());
		telephonicImpl.setPrimaryKey(telephonic.getPrimaryKey());

		telephonicImpl.setTelephonicId(telephonic.getTelephonicId());
		telephonicImpl.setTipo(telephonic.getTipo());
		telephonicImpl.setTipoSede(telephonic.getTipoSede());
		telephonicImpl.setComuneSede(telephonic.getComuneSede());
		telephonicImpl.setDescrizioneSede(telephonic.getDescrizioneSede());
		telephonicImpl.setInterno(telephonic.getInterno());
		telephonicImpl.setPiano(telephonic.getPiano());
		telephonicImpl.setArea(telephonic.getArea());
		telephonicImpl.setBlocco(telephonic.getBlocco());
		telephonicImpl.setStanza(telephonic.getStanza());
		telephonicImpl.setMarca(telephonic.getMarca());
		telephonicImpl.setModello(telephonic.getModello());
		telephonicImpl.setInventarioSN(telephonic.getInventarioSN());
		telephonicImpl.setUnitaOperativa(telephonic.getUnitaOperativa());
		telephonicImpl.setDescrizione(telephonic.getDescrizione());
		telephonicImpl.setNome(telephonic.getNome());
		telephonicImpl.setNote(telephonic.getNote());
		telephonicImpl.setVisibile(telephonic.getVisibile());

		return telephonicImpl;
	}

	/**
	 * Returns the telephonic with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the telephonic
	 * @return the telephonic
	 * @throws com.liferay.sample.NoSuchTelephonicException if a telephonic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Telephonic findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTelephonicException, SystemException {
		Telephonic telephonic = fetchByPrimaryKey(primaryKey);

		if (telephonic == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTelephonicException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return telephonic;
	}

	/**
	 * Returns the telephonic with the primary key or throws a {@link com.liferay.sample.NoSuchTelephonicException} if it could not be found.
	 *
	 * @param telephonicId the primary key of the telephonic
	 * @return the telephonic
	 * @throws com.liferay.sample.NoSuchTelephonicException if a telephonic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Telephonic findByPrimaryKey(long telephonicId)
		throws NoSuchTelephonicException, SystemException {
		return findByPrimaryKey((Serializable)telephonicId);
	}

	/**
	 * Returns the telephonic with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the telephonic
	 * @return the telephonic, or <code>null</code> if a telephonic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Telephonic fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Telephonic telephonic = (Telephonic)EntityCacheUtil.getResult(TelephonicModelImpl.ENTITY_CACHE_ENABLED,
				TelephonicImpl.class, primaryKey);

		if (telephonic == _nullTelephonic) {
			return null;
		}

		if (telephonic == null) {
			Session session = null;

			try {
				session = openSession();

				telephonic = (Telephonic)session.get(TelephonicImpl.class,
						primaryKey);

				if (telephonic != null) {
					cacheResult(telephonic);
				}
				else {
					EntityCacheUtil.putResult(TelephonicModelImpl.ENTITY_CACHE_ENABLED,
						TelephonicImpl.class, primaryKey, _nullTelephonic);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TelephonicModelImpl.ENTITY_CACHE_ENABLED,
					TelephonicImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return telephonic;
	}

	/**
	 * Returns the telephonic with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param telephonicId the primary key of the telephonic
	 * @return the telephonic, or <code>null</code> if a telephonic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Telephonic fetchByPrimaryKey(long telephonicId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)telephonicId);
	}

	/**
	 * Returns all the telephonics.
	 *
	 * @return the telephonics
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Telephonic> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the telephonics.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.TelephonicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of telephonics
	 * @param end the upper bound of the range of telephonics (not inclusive)
	 * @return the range of telephonics
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Telephonic> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the telephonics.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.TelephonicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of telephonics
	 * @param end the upper bound of the range of telephonics (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of telephonics
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Telephonic> findAll(int start, int end,
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

		List<Telephonic> list = (List<Telephonic>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TELEPHONIC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TELEPHONIC;

				if (pagination) {
					sql = sql.concat(TelephonicModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Telephonic>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Telephonic>(list);
				}
				else {
					list = (List<Telephonic>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the telephonics from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Telephonic telephonic : findAll()) {
			remove(telephonic);
		}
	}

	/**
	 * Returns the number of telephonics.
	 *
	 * @return the number of telephonics
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

				Query q = session.createQuery(_SQL_COUNT_TELEPHONIC);

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
	 * Initializes the telephonic persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.sample.model.Telephonic")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Telephonic>> listenersList = new ArrayList<ModelListener<Telephonic>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Telephonic>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TelephonicImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TELEPHONIC = "SELECT telephonic FROM Telephonic telephonic";
	private static final String _SQL_COUNT_TELEPHONIC = "SELECT COUNT(telephonic) FROM Telephonic telephonic";
	private static final String _ORDER_BY_ENTITY_ALIAS = "telephonic.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Telephonic exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TelephonicPersistenceImpl.class);
	private static Telephonic _nullTelephonic = new TelephonicImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Telephonic> toCacheModel() {
				return _nullTelephonicCacheModel;
			}
		};

	private static CacheModel<Telephonic> _nullTelephonicCacheModel = new CacheModel<Telephonic>() {
			@Override
			public Telephonic toEntityModel() {
				return _nullTelephonic;
			}
		};
}