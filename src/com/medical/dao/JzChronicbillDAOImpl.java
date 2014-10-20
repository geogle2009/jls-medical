package com.medical.dao;

import com.medical.model.JzChronicbill;
import com.medical.model.JzChronicbillExample;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class JzChronicbillDAOImpl extends SqlMapClientDaoSupport implements
		JzChronicbillDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICBILL
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	public JzChronicbillDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICBILL
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	public int countByExample(JzChronicbillExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"JZ_CHRONICBILL.ibatorgenerated_countByExample", example);
		return count;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICBILL
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	public int deleteByExample(JzChronicbillExample example) {
		int rows = getSqlMapClientTemplate().delete(
				"JZ_CHRONICBILL.ibatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICBILL
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	public int deleteByPrimaryKey(BigDecimal chronicbillId) {
		JzChronicbill key = new JzChronicbill();
		key.setChronicbillId(chronicbillId);
		int rows = getSqlMapClientTemplate().delete(
				"JZ_CHRONICBILL.ibatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICBILL
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	public BigDecimal insert(JzChronicbill record) {
		Object newKey = getSqlMapClientTemplate().insert(
				"JZ_CHRONICBILL.ibatorgenerated_insert", record);
		return (BigDecimal) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICBILL
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	public BigDecimal insertSelective(JzChronicbill record) {
		Object newKey = getSqlMapClientTemplate().insert(
				"JZ_CHRONICBILL.ibatorgenerated_insertSelective", record);
		return (BigDecimal) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICBILL
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	@SuppressWarnings("unchecked")
	public List<JzChronicbill> selectByExample(JzChronicbillExample example) {
		List<JzChronicbill> list = getSqlMapClientTemplate().queryForList(
				"JZ_CHRONICBILL.ibatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICBILL
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	public JzChronicbill selectByPrimaryKey(BigDecimal chronicbillId) {
		JzChronicbill key = new JzChronicbill();
		key.setChronicbillId(chronicbillId);
		JzChronicbill record = (JzChronicbill) getSqlMapClientTemplate()
				.queryForObject(
						"JZ_CHRONICBILL.ibatorgenerated_selectByPrimaryKey",
						key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICBILL
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	public int updateByExampleSelective(JzChronicbill record,
			JzChronicbillExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"JZ_CHRONICBILL.ibatorgenerated_updateByExampleSelective",
				parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICBILL
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	public int updateByExample(JzChronicbill record,
			JzChronicbillExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"JZ_CHRONICBILL.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICBILL
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	public int updateByPrimaryKeySelective(JzChronicbill record) {
		int rows = getSqlMapClientTemplate().update(
				"JZ_CHRONICBILL.ibatorgenerated_updateByPrimaryKeySelective",
				record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICBILL
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	public int updateByPrimaryKey(JzChronicbill record) {
		int rows = getSqlMapClientTemplate().update(
				"JZ_CHRONICBILL.ibatorgenerated_updateByPrimaryKey", record);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table YLJZN.JZ_CHRONICBILL
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	private static class UpdateByExampleParms extends JzChronicbillExample {
		private Object record;

		public UpdateByExampleParms(Object record, JzChronicbillExample example) {
			super(example);
			this.record = record;
		}

		@SuppressWarnings("unused")
		public Object getRecord() {
			return record;
		}
	}

	@SuppressWarnings("unchecked")
	public List<JzChronicbill> selectByExample(JzChronicbillExample example,
			int start, int pagesize) {
		List<JzChronicbill> list = getSqlMapClientTemplate().queryForList(
				"JZ_CHRONICBILL.ibatorgenerated_selectByExample", example,
				start, pagesize);
		return list;
	}
}