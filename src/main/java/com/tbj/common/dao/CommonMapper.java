package com.tbj.common.dao;

import java.util.List;

/**
 * @author bjtang
 * @date   2017年5月18日  
 * @desc   公用mapper
 */
public interface CommonMapper<T> {

	/**
	 * add model
	 * @param t
	 * @return
	 */
	int insert(T t);
	
	/**
	 * delete model
	 * @param t
	 * @return
	 */
	int delete(T t);
	
	/**
	 * update model
	 * @param t
	 * @return
	 */
	int update(T t);
	
	/**
	 * get model
	 * @param t
	 * @return
	 */
	T getModel(T t);
	
	/**
	 * batch get model
	 * @param t
	 * @return
	 */
	List<T> batchSelect(T t);
	
	/**
	 * bacth insert model
	 * @param list
	 * @return
	 */
	int batchInsert(List<T> list);
	
	/**
	 * batch update model
	 * @param list
	 * @return
	 */
	int batchUpdate(List<T> list);
	
	/**
	 * batch delete model
	 * @param list
	 * @return
	 */
	int batchDelete(List<T> list);
	
	
}
