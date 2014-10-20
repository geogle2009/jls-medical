package com.medical.dao;

import com.medical.model.SysTEmployee;
import com.medical.model.SysTEmployeeExample;
import java.util.List;

public interface SysTEmployeeDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.SYS_T_EMPLOYEE
	 * @ibatorgenerated  Mon Sep 01 13:14:48 CST 2014
	 */
	int countByExample(SysTEmployeeExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.SYS_T_EMPLOYEE
	 * @ibatorgenerated  Mon Sep 01 13:14:48 CST 2014
	 */
	int deleteByExample(SysTEmployeeExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.SYS_T_EMPLOYEE
	 * @ibatorgenerated  Mon Sep 01 13:14:48 CST 2014
	 */
	void insert(SysTEmployee record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.SYS_T_EMPLOYEE
	 * @ibatorgenerated  Mon Sep 01 13:14:48 CST 2014
	 */
	void insertSelective(SysTEmployee record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.SYS_T_EMPLOYEE
	 * @ibatorgenerated  Mon Sep 01 13:14:48 CST 2014
	 */
	List<SysTEmployee> selectByExample(SysTEmployeeExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.SYS_T_EMPLOYEE
	 * @ibatorgenerated  Mon Sep 01 13:14:48 CST 2014
	 */
	int updateByExampleSelective(SysTEmployee record,
			SysTEmployeeExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.SYS_T_EMPLOYEE
	 * @ibatorgenerated  Mon Sep 01 13:14:48 CST 2014
	 */
	int updateByExample(SysTEmployee record, SysTEmployeeExample example);
}