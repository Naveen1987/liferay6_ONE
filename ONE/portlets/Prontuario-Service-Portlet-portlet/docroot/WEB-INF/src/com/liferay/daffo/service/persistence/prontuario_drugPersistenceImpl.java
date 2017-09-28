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

import com.liferay.daffo.NoSuchprontuario_drugException;
import com.liferay.daffo.model.impl.prontuario_drugImpl;
import com.liferay.daffo.model.impl.prontuario_drugModelImpl;
import com.liferay.daffo.model.prontuario_drug;

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
 * The persistence implementation for the prontuario_drug service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen
 * @see prontuario_drugPersistence
 * @see prontuario_drugUtil
 * @generated
 */
public class prontuario_drugPersistenceImpl extends BasePersistenceImpl<prontuario_drug>
	implements prontuario_drugPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link prontuario_drugUtil} to access the prontuario_drug persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = prontuario_drugImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
			prontuario_drugModelImpl.FINDER_CACHE_ENABLED,
			prontuario_drugImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
			prontuario_drugModelImpl.FINDER_CACHE_ENABLED,
			prontuario_drugImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
			prontuario_drugModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public prontuario_drugPersistenceImpl() {
		setModelClass(prontuario_drug.class);
	}

	/**
	 * Caches the prontuario_drug in the entity cache if it is enabled.
	 *
	 * @param prontuario_drug the prontuario_drug
	 */
	@Override
	public void cacheResult(prontuario_drug prontuario_drug) {
		EntityCacheUtil.putResult(prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
			prontuario_drugImpl.class, prontuario_drug.getPrimaryKey(),
			prontuario_drug);

		prontuario_drug.resetOriginalValues();
	}

	/**
	 * Caches the prontuario_drugs in the entity cache if it is enabled.
	 *
	 * @param prontuario_drugs the prontuario_drugs
	 */
	@Override
	public void cacheResult(List<prontuario_drug> prontuario_drugs) {
		for (prontuario_drug prontuario_drug : prontuario_drugs) {
			if (EntityCacheUtil.getResult(
						prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
						prontuario_drugImpl.class,
						prontuario_drug.getPrimaryKey()) == null) {
				cacheResult(prontuario_drug);
			}
			else {
				prontuario_drug.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all prontuario_drugs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(prontuario_drugImpl.class.getName());
		}

		EntityCacheUtil.clearCache(prontuario_drugImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the prontuario_drug.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(prontuario_drug prontuario_drug) {
		EntityCacheUtil.removeResult(prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
			prontuario_drugImpl.class, prontuario_drug.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<prontuario_drug> prontuario_drugs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (prontuario_drug prontuario_drug : prontuario_drugs) {
			EntityCacheUtil.removeResult(prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
				prontuario_drugImpl.class, prontuario_drug.getPrimaryKey());
		}
	}

	/**
	 * Creates a new prontuario_drug with the primary key. Does not add the prontuario_drug to the database.
	 *
	 * @param drug_id the primary key for the new prontuario_drug
	 * @return the new prontuario_drug
	 */
	@Override
	public prontuario_drug create(long drug_id) {
		prontuario_drug prontuario_drug = new prontuario_drugImpl();

		prontuario_drug.setNew(true);
		prontuario_drug.setPrimaryKey(drug_id);

		return prontuario_drug;
	}

	/**
	 * Removes the prontuario_drug with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param drug_id the primary key of the prontuario_drug
	 * @return the prontuario_drug that was removed
	 * @throws com.liferay.daffo.NoSuchprontuario_drugException if a prontuario_drug with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public prontuario_drug remove(long drug_id)
		throws NoSuchprontuario_drugException, SystemException {
		return remove((Serializable)drug_id);
	}

	/**
	 * Removes the prontuario_drug with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the prontuario_drug
	 * @return the prontuario_drug that was removed
	 * @throws com.liferay.daffo.NoSuchprontuario_drugException if a prontuario_drug with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public prontuario_drug remove(Serializable primaryKey)
		throws NoSuchprontuario_drugException, SystemException {
		Session session = null;

		try {
			session = openSession();

			prontuario_drug prontuario_drug = (prontuario_drug)session.get(prontuario_drugImpl.class,
					primaryKey);

			if (prontuario_drug == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchprontuario_drugException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(prontuario_drug);
		}
		catch (NoSuchprontuario_drugException nsee) {
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
	protected prontuario_drug removeImpl(prontuario_drug prontuario_drug)
		throws SystemException {
		prontuario_drug = toUnwrappedModel(prontuario_drug);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(prontuario_drug)) {
				prontuario_drug = (prontuario_drug)session.get(prontuario_drugImpl.class,
						prontuario_drug.getPrimaryKeyObj());
			}

			if (prontuario_drug != null) {
				session.delete(prontuario_drug);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (prontuario_drug != null) {
			clearCache(prontuario_drug);
		}

		return prontuario_drug;
	}

	@Override
	public prontuario_drug updateImpl(
		com.liferay.daffo.model.prontuario_drug prontuario_drug)
		throws SystemException {
		prontuario_drug = toUnwrappedModel(prontuario_drug);

		boolean isNew = prontuario_drug.isNew();

		Session session = null;

		try {
			session = openSession();

			if (prontuario_drug.isNew()) {
				session.save(prontuario_drug);

				prontuario_drug.setNew(false);
			}
			else {
				session.merge(prontuario_drug);
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

		EntityCacheUtil.putResult(prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
			prontuario_drugImpl.class, prontuario_drug.getPrimaryKey(),
			prontuario_drug);

		return prontuario_drug;
	}

	protected prontuario_drug toUnwrappedModel(prontuario_drug prontuario_drug) {
		if (prontuario_drug instanceof prontuario_drugImpl) {
			return prontuario_drug;
		}

		prontuario_drugImpl prontuario_drugImpl = new prontuario_drugImpl();

		prontuario_drugImpl.setNew(prontuario_drug.isNew());
		prontuario_drugImpl.setPrimaryKey(prontuario_drug.getPrimaryKey());

		prontuario_drugImpl.setDrug_id(prontuario_drug.getDrug_id());
		prontuario_drugImpl.setGruppo(prontuario_drug.getGruppo());
		prontuario_drugImpl.setSottoGruppo(prontuario_drug.getSottoGruppo());
		prontuario_drugImpl.setCodice(prontuario_drug.getCodice());
		prontuario_drugImpl.setPrincipio_Attivo(prontuario_drug.getPrincipio_Attivo());
		prontuario_drugImpl.setNome_Commerciale(prontuario_drug.getNome_Commerciale());

		return prontuario_drugImpl;
	}

	/**
	 * Returns the prontuario_drug with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the prontuario_drug
	 * @return the prontuario_drug
	 * @throws com.liferay.daffo.NoSuchprontuario_drugException if a prontuario_drug with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public prontuario_drug findByPrimaryKey(Serializable primaryKey)
		throws NoSuchprontuario_drugException, SystemException {
		prontuario_drug prontuario_drug = fetchByPrimaryKey(primaryKey);

		if (prontuario_drug == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchprontuario_drugException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return prontuario_drug;
	}

	/**
	 * Returns the prontuario_drug with the primary key or throws a {@link com.liferay.daffo.NoSuchprontuario_drugException} if it could not be found.
	 *
	 * @param drug_id the primary key of the prontuario_drug
	 * @return the prontuario_drug
	 * @throws com.liferay.daffo.NoSuchprontuario_drugException if a prontuario_drug with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public prontuario_drug findByPrimaryKey(long drug_id)
		throws NoSuchprontuario_drugException, SystemException {
		return findByPrimaryKey((Serializable)drug_id);
	}

	/**
	 * Returns the prontuario_drug with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the prontuario_drug
	 * @return the prontuario_drug, or <code>null</code> if a prontuario_drug with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public prontuario_drug fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		prontuario_drug prontuario_drug = (prontuario_drug)EntityCacheUtil.getResult(prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
				prontuario_drugImpl.class, primaryKey);

		if (prontuario_drug == _nullprontuario_drug) {
			return null;
		}

		if (prontuario_drug == null) {
			Session session = null;

			try {
				session = openSession();

				prontuario_drug = (prontuario_drug)session.get(prontuario_drugImpl.class,
						primaryKey);

				if (prontuario_drug != null) {
					cacheResult(prontuario_drug);
				}
				else {
					EntityCacheUtil.putResult(prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
						prontuario_drugImpl.class, primaryKey,
						_nullprontuario_drug);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
					prontuario_drugImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return prontuario_drug;
	}

	/**
	 * Returns the prontuario_drug with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param drug_id the primary key of the prontuario_drug
	 * @return the prontuario_drug, or <code>null</code> if a prontuario_drug with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public prontuario_drug fetchByPrimaryKey(long drug_id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)drug_id);
	}

	/**
	 * Returns all the prontuario_drugs.
	 *
	 * @return the prontuario_drugs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<prontuario_drug> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<prontuario_drug> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<prontuario_drug> findAll(int start, int end,
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

		List<prontuario_drug> list = (List<prontuario_drug>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PRONTUARIO_DRUG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PRONTUARIO_DRUG;

				if (pagination) {
					sql = sql.concat(prontuario_drugModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<prontuario_drug>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<prontuario_drug>(list);
				}
				else {
					list = (List<prontuario_drug>)QueryUtil.list(q,
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
	 * Removes all the prontuario_drugs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (prontuario_drug prontuario_drug : findAll()) {
			remove(prontuario_drug);
		}
	}

	/**
	 * Returns the number of prontuario_drugs.
	 *
	 * @return the number of prontuario_drugs
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

				Query q = session.createQuery(_SQL_COUNT_PRONTUARIO_DRUG);

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
	 * Initializes the prontuario_drug persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.daffo.model.prontuario_drug")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<prontuario_drug>> listenersList = new ArrayList<ModelListener<prontuario_drug>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<prontuario_drug>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(prontuario_drugImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PRONTUARIO_DRUG = "SELECT prontuario_drug FROM prontuario_drug prontuario_drug";
	private static final String _SQL_COUNT_PRONTUARIO_DRUG = "SELECT COUNT(prontuario_drug) FROM prontuario_drug prontuario_drug";
	private static final String _ORDER_BY_ENTITY_ALIAS = "prontuario_drug.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No prontuario_drug exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(prontuario_drugPersistenceImpl.class);
	private static prontuario_drug _nullprontuario_drug = new prontuario_drugImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<prontuario_drug> toCacheModel() {
				return _nullprontuario_drugCacheModel;
			}
		};

	private static CacheModel<prontuario_drug> _nullprontuario_drugCacheModel = new CacheModel<prontuario_drug>() {
			@Override
			public prontuario_drug toEntityModel() {
				return _nullprontuario_drug;
			}
		};
}