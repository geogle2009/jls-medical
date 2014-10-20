package com.medical.dao;

import com.medical.model.SysTOrganization;
import com.medical.model.SysTOrganizationExample;
import java.util.List;

public interface SysTOrganizationDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    int countByExample(SysTOrganizationExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    int deleteByExample(SysTOrganizationExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    int deleteByPrimaryKey(String organizationId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    void insert(SysTOrganization record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    void insertSelective(SysTOrganization record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    List<SysTOrganization> selectByExample(SysTOrganizationExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    SysTOrganization selectByPrimaryKey(String organizationId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    int updateByExampleSelective(SysTOrganization record, SysTOrganizationExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    int updateByExample(SysTOrganization record, SysTOrganizationExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    int updateByPrimaryKeySelective(SysTOrganization record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    int updateByPrimaryKey(SysTOrganization record);
}