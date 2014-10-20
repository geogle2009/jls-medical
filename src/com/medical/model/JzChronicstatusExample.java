package com.medical.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JzChronicstatusExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	public JzChronicstatusExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	protected JzChronicstatusExample(JzChronicstatusExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Thu Apr 21 10:53:39 CST 2011
	 */
	public static class Criteria {
		protected List<String> criteriaWithoutValue;
		protected List<Map<String, Object>> criteriaWithSingleValue;
		protected List<Map<String, Object>> criteriaWithListValue;
		protected List<Map<String, Object>> criteriaWithBetweenValue;

		protected Criteria() {
			super();
			criteriaWithoutValue = new ArrayList<String>();
			criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
			criteriaWithListValue = new ArrayList<Map<String, Object>>();
			criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
		}

		public boolean isValid() {
			return criteriaWithoutValue.size() > 0
					|| criteriaWithSingleValue.size() > 0
					|| criteriaWithListValue.size() > 0
					|| criteriaWithBetweenValue.size() > 0;
		}

		public List<String> getCriteriaWithoutValue() {
			return criteriaWithoutValue;
		}

		public List<Map<String, Object>> getCriteriaWithSingleValue() {
			return criteriaWithSingleValue;
		}

		public List<Map<String, Object>> getCriteriaWithListValue() {
			return criteriaWithListValue;
		}

		public List<Map<String, Object>> getCriteriaWithBetweenValue() {
			return criteriaWithBetweenValue;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteriaWithoutValue.add(condition);
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("value", value);
			criteriaWithSingleValue.add(map);
		}

		protected void addCriterion(String condition,
				List<? extends Object> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("values", values);
			criteriaWithListValue.add(map);
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			List<Object> list = new ArrayList<Object>();
			list.add(value1);
			list.add(value2);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("values", list);
			criteriaWithBetweenValue.add(map);
		}

		public Criteria andChronicstatusIdIsNull() {
			addCriterion("CHRONICSTATUS_ID is null");
			return this;
		}

		public Criteria andChronicstatusIdIsNotNull() {
			addCriterion("CHRONICSTATUS_ID is not null");
			return this;
		}

		public Criteria andChronicstatusIdEqualTo(Long value) {
			addCriterion("CHRONICSTATUS_ID =", value, "chronicstatusId");
			return this;
		}

		public Criteria andChronicstatusIdNotEqualTo(Long value) {
			addCriterion("CHRONICSTATUS_ID <>", value, "chronicstatusId");
			return this;
		}

		public Criteria andChronicstatusIdGreaterThan(Long value) {
			addCriterion("CHRONICSTATUS_ID >", value, "chronicstatusId");
			return this;
		}

		public Criteria andChronicstatusIdGreaterThanOrEqualTo(Long value) {
			addCriterion("CHRONICSTATUS_ID >=", value, "chronicstatusId");
			return this;
		}

		public Criteria andChronicstatusIdLessThan(Long value) {
			addCriterion("CHRONICSTATUS_ID <", value, "chronicstatusId");
			return this;
		}

		public Criteria andChronicstatusIdLessThanOrEqualTo(Long value) {
			addCriterion("CHRONICSTATUS_ID <=", value, "chronicstatusId");
			return this;
		}

		public Criteria andChronicstatusIdIn(List<Long> values) {
			addCriterion("CHRONICSTATUS_ID in", values, "chronicstatusId");
			return this;
		}

		public Criteria andChronicstatusIdNotIn(List<Long> values) {
			addCriterion("CHRONICSTATUS_ID not in", values, "chronicstatusId");
			return this;
		}

		public Criteria andChronicstatusIdBetween(Long value1, Long value2) {
			addCriterion("CHRONICSTATUS_ID between", value1, value2,
					"chronicstatusId");
			return this;
		}

		public Criteria andChronicstatusIdNotBetween(Long value1, Long value2) {
			addCriterion("CHRONICSTATUS_ID not between", value1, value2,
					"chronicstatusId");
			return this;
		}

		public Criteria andFamilyIdIsNull() {
			addCriterion("FAMILY_ID is null");
			return this;
		}

		public Criteria andFamilyIdIsNotNull() {
			addCriterion("FAMILY_ID is not null");
			return this;
		}

		public Criteria andFamilyIdEqualTo(String value) {
			addCriterion("FAMILY_ID =", value, "familyId");
			return this;
		}

		public Criteria andFamilyIdNotEqualTo(String value) {
			addCriterion("FAMILY_ID <>", value, "familyId");
			return this;
		}

		public Criteria andFamilyIdGreaterThan(String value) {
			addCriterion("FAMILY_ID >", value, "familyId");
			return this;
		}

		public Criteria andFamilyIdGreaterThanOrEqualTo(String value) {
			addCriterion("FAMILY_ID >=", value, "familyId");
			return this;
		}

		public Criteria andFamilyIdLessThan(String value) {
			addCriterion("FAMILY_ID <", value, "familyId");
			return this;
		}

		public Criteria andFamilyIdLessThanOrEqualTo(String value) {
			addCriterion("FAMILY_ID <=", value, "familyId");
			return this;
		}

		public Criteria andFamilyIdLike(String value) {
			addCriterion("FAMILY_ID like", value, "familyId");
			return this;
		}

		public Criteria andFamilyIdNotLike(String value) {
			addCriterion("FAMILY_ID not like", value, "familyId");
			return this;
		}

		public Criteria andFamilyIdIn(List<String> values) {
			addCriterion("FAMILY_ID in", values, "familyId");
			return this;
		}

		public Criteria andFamilyIdNotIn(List<String> values) {
			addCriterion("FAMILY_ID not in", values, "familyId");
			return this;
		}

		public Criteria andFamilyIdBetween(String value1, String value2) {
			addCriterion("FAMILY_ID between", value1, value2, "familyId");
			return this;
		}

		public Criteria andFamilyIdNotBetween(String value1, String value2) {
			addCriterion("FAMILY_ID not between", value1, value2, "familyId");
			return this;
		}

		public Criteria andNameIsNull() {
			addCriterion("NAME is null");
			return this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("NAME is not null");
			return this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("NAME =", value, "name");
			return this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("NAME <>", value, "name");
			return this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("NAME >", value, "name");
			return this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("NAME >=", value, "name");
			return this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("NAME <", value, "name");
			return this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("NAME <=", value, "name");
			return this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("NAME like", value, "name");
			return this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("NAME not like", value, "name");
			return this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("NAME in", values, "name");
			return this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("NAME not in", values, "name");
			return this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("NAME between", value1, value2, "name");
			return this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("NAME not between", value1, value2, "name");
			return this;
		}

		public Criteria andSsnIsNull() {
			addCriterion("SSN is null");
			return this;
		}

		public Criteria andSsnIsNotNull() {
			addCriterion("SSN is not null");
			return this;
		}

		public Criteria andSsnEqualTo(String value) {
			addCriterion("SSN =", value, "ssn");
			return this;
		}

		public Criteria andSsnNotEqualTo(String value) {
			addCriterion("SSN <>", value, "ssn");
			return this;
		}

		public Criteria andSsnGreaterThan(String value) {
			addCriterion("SSN >", value, "ssn");
			return this;
		}

		public Criteria andSsnGreaterThanOrEqualTo(String value) {
			addCriterion("SSN >=", value, "ssn");
			return this;
		}

		public Criteria andSsnLessThan(String value) {
			addCriterion("SSN <", value, "ssn");
			return this;
		}

		public Criteria andSsnLessThanOrEqualTo(String value) {
			addCriterion("SSN <=", value, "ssn");
			return this;
		}

		public Criteria andSsnLike(String value) {
			addCriterion("SSN like", value, "ssn");
			return this;
		}

		public Criteria andSsnNotLike(String value) {
			addCriterion("SSN not like", value, "ssn");
			return this;
		}

		public Criteria andSsnIn(List<String> values) {
			addCriterion("SSN in", values, "ssn");
			return this;
		}

		public Criteria andSsnNotIn(List<String> values) {
			addCriterion("SSN not in", values, "ssn");
			return this;
		}

		public Criteria andSsnBetween(String value1, String value2) {
			addCriterion("SSN between", value1, value2, "ssn");
			return this;
		}

		public Criteria andSsnNotBetween(String value1, String value2) {
			addCriterion("SSN not between", value1, value2, "ssn");
			return this;
		}

		public Criteria andEntityIsNull() {
			addCriterion("ENTITY is null");
			return this;
		}

		public Criteria andEntityIsNotNull() {
			addCriterion("ENTITY is not null");
			return this;
		}

		public Criteria andEntityEqualTo(Integer value) {
			addCriterion("ENTITY =", value, "entity");
			return this;
		}

		public Criteria andEntityNotEqualTo(Integer value) {
			addCriterion("ENTITY <>", value, "entity");
			return this;
		}

		public Criteria andEntityGreaterThan(Integer value) {
			addCriterion("ENTITY >", value, "entity");
			return this;
		}

		public Criteria andEntityGreaterThanOrEqualTo(Integer value) {
			addCriterion("ENTITY >=", value, "entity");
			return this;
		}

		public Criteria andEntityLessThan(Integer value) {
			addCriterion("ENTITY <", value, "entity");
			return this;
		}

		public Criteria andEntityLessThanOrEqualTo(Integer value) {
			addCriterion("ENTITY <=", value, "entity");
			return this;
		}

		public Criteria andEntityIn(List<Integer> values) {
			addCriterion("ENTITY in", values, "entity");
			return this;
		}

		public Criteria andEntityNotIn(List<Integer> values) {
			addCriterion("ENTITY not in", values, "entity");
			return this;
		}

		public Criteria andEntityBetween(Integer value1, Integer value2) {
			addCriterion("ENTITY between", value1, value2, "entity");
			return this;
		}

		public Criteria andEntityNotBetween(Integer value1, Integer value2) {
			addCriterion("ENTITY not between", value1, value2, "entity");
			return this;
		}

		public Criteria andStateIsNull() {
			addCriterion("STATE is null");
			return this;
		}

		public Criteria andStateIsNotNull() {
			addCriterion("STATE is not null");
			return this;
		}

		public Criteria andStateEqualTo(String value) {
			addCriterion("STATE =", value, "state");
			return this;
		}

		public Criteria andStateNotEqualTo(String value) {
			addCriterion("STATE <>", value, "state");
			return this;
		}

		public Criteria andStateGreaterThan(String value) {
			addCriterion("STATE >", value, "state");
			return this;
		}

		public Criteria andStateGreaterThanOrEqualTo(String value) {
			addCriterion("STATE >=", value, "state");
			return this;
		}

		public Criteria andStateLessThan(String value) {
			addCriterion("STATE <", value, "state");
			return this;
		}

		public Criteria andStateLessThanOrEqualTo(String value) {
			addCriterion("STATE <=", value, "state");
			return this;
		}

		public Criteria andStateLike(String value) {
			addCriterion("STATE like", value, "state");
			return this;
		}

		public Criteria andStateNotLike(String value) {
			addCriterion("STATE not like", value, "state");
			return this;
		}

		public Criteria andStateIn(List<String> values) {
			addCriterion("STATE in", values, "state");
			return this;
		}

		public Criteria andStateNotIn(List<String> values) {
			addCriterion("STATE not in", values, "state");
			return this;
		}

		public Criteria andStateBetween(String value1, String value2) {
			addCriterion("STATE between", value1, value2, "state");
			return this;
		}

		public Criteria andStateNotBetween(String value1, String value2) {
			addCriterion("STATE not between", value1, value2, "state");
			return this;
		}

		public Criteria andApptimeIsNull() {
			addCriterion("APPTIME is null");
			return this;
		}

		public Criteria andApptimeIsNotNull() {
			addCriterion("APPTIME is not null");
			return this;
		}

		public Criteria andApptimeEqualTo(Date value) {
			addCriterion("APPTIME =", value, "apptime");
			return this;
		}

		public Criteria andApptimeNotEqualTo(Date value) {
			addCriterion("APPTIME <>", value, "apptime");
			return this;
		}

		public Criteria andApptimeGreaterThan(Date value) {
			addCriterion("APPTIME >", value, "apptime");
			return this;
		}

		public Criteria andApptimeGreaterThanOrEqualTo(Date value) {
			addCriterion("APPTIME >=", value, "apptime");
			return this;
		}

		public Criteria andApptimeLessThan(Date value) {
			addCriterion("APPTIME <", value, "apptime");
			return this;
		}

		public Criteria andApptimeLessThanOrEqualTo(Date value) {
			addCriterion("APPTIME <=", value, "apptime");
			return this;
		}

		public Criteria andApptimeIn(List<Date> values) {
			addCriterion("APPTIME in", values, "apptime");
			return this;
		}

		public Criteria andApptimeNotIn(List<Date> values) {
			addCriterion("APPTIME not in", values, "apptime");
			return this;
		}

		public Criteria andApptimeBetween(Date value1, Date value2) {
			addCriterion("APPTIME between", value1, value2, "apptime");
			return this;
		}

		public Criteria andApptimeNotBetween(Date value1, Date value2) {
			addCriterion("APPTIME not between", value1, value2, "apptime");
			return this;
		}

		public Criteria andFlagIsNull() {
			addCriterion("FLAG is null");
			return this;
		}

		public Criteria andFlagIsNotNull() {
			addCriterion("FLAG is not null");
			return this;
		}

		public Criteria andFlagEqualTo(String value) {
			addCriterion("FLAG =", value, "flag");
			return this;
		}

		public Criteria andFlagNotEqualTo(String value) {
			addCriterion("FLAG <>", value, "flag");
			return this;
		}

		public Criteria andFlagGreaterThan(String value) {
			addCriterion("FLAG >", value, "flag");
			return this;
		}

		public Criteria andFlagGreaterThanOrEqualTo(String value) {
			addCriterion("FLAG >=", value, "flag");
			return this;
		}

		public Criteria andFlagLessThan(String value) {
			addCriterion("FLAG <", value, "flag");
			return this;
		}

		public Criteria andFlagLessThanOrEqualTo(String value) {
			addCriterion("FLAG <=", value, "flag");
			return this;
		}

		public Criteria andFlagLike(String value) {
			addCriterion("FLAG like", value, "flag");
			return this;
		}

		public Criteria andFlagNotLike(String value) {
			addCriterion("FLAG not like", value, "flag");
			return this;
		}

		public Criteria andFlagIn(List<String> values) {
			addCriterion("FLAG in", values, "flag");
			return this;
		}

		public Criteria andFlagNotIn(List<String> values) {
			addCriterion("FLAG not in", values, "flag");
			return this;
		}

		public Criteria andFlagBetween(String value1, String value2) {
			addCriterion("FLAG between", value1, value2, "flag");
			return this;
		}

		public Criteria andFlagNotBetween(String value1, String value2) {
			addCriterion("FLAG not between", value1, value2, "flag");
			return this;
		}

		public Criteria andMemberIdIsNull() {
			addCriterion("MEMBER_ID is null");
			return this;
		}

		public Criteria andMemberIdIsNotNull() {
			addCriterion("MEMBER_ID is not null");
			return this;
		}

		public Criteria andMemberIdEqualTo(String value) {
			addCriterion("MEMBER_ID =", value, "memberId");
			return this;
		}

		public Criteria andMemberIdNotEqualTo(String value) {
			addCriterion("MEMBER_ID <>", value, "memberId");
			return this;
		}

		public Criteria andMemberIdGreaterThan(String value) {
			addCriterion("MEMBER_ID >", value, "memberId");
			return this;
		}

		public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
			addCriterion("MEMBER_ID >=", value, "memberId");
			return this;
		}

		public Criteria andMemberIdLessThan(String value) {
			addCriterion("MEMBER_ID <", value, "memberId");
			return this;
		}

		public Criteria andMemberIdLessThanOrEqualTo(String value) {
			addCriterion("MEMBER_ID <=", value, "memberId");
			return this;
		}

		public Criteria andMemberIdLike(String value) {
			addCriterion("MEMBER_ID like", value, "memberId");
			return this;
		}

		public Criteria andMemberIdNotLike(String value) {
			addCriterion("MEMBER_ID not like", value, "memberId");
			return this;
		}

		public Criteria andMemberIdIn(List<String> values) {
			addCriterion("MEMBER_ID in", values, "memberId");
			return this;
		}

		public Criteria andMemberIdNotIn(List<String> values) {
			addCriterion("MEMBER_ID not in", values, "memberId");
			return this;
		}

		public Criteria andMemberIdBetween(String value1, String value2) {
			addCriterion("MEMBER_ID between", value1, value2, "memberId");
			return this;
		}

		public Criteria andMemberIdNotBetween(String value1, String value2) {
			addCriterion("MEMBER_ID not between", value1, value2, "memberId");
			return this;
		}

		public Criteria andMemberTypeIsNull() {
			addCriterion("MEMBER_TYPE is null");
			return this;
		}

		public Criteria andMemberTypeIsNotNull() {
			addCriterion("MEMBER_TYPE is not null");
			return this;
		}

		public Criteria andMemberTypeEqualTo(String value) {
			addCriterion("MEMBER_TYPE =", value, "memberType");
			return this;
		}

		public Criteria andMemberTypeNotEqualTo(String value) {
			addCriterion("MEMBER_TYPE <>", value, "memberType");
			return this;
		}

		public Criteria andMemberTypeGreaterThan(String value) {
			addCriterion("MEMBER_TYPE >", value, "memberType");
			return this;
		}

		public Criteria andMemberTypeGreaterThanOrEqualTo(String value) {
			addCriterion("MEMBER_TYPE >=", value, "memberType");
			return this;
		}

		public Criteria andMemberTypeLessThan(String value) {
			addCriterion("MEMBER_TYPE <", value, "memberType");
			return this;
		}

		public Criteria andMemberTypeLessThanOrEqualTo(String value) {
			addCriterion("MEMBER_TYPE <=", value, "memberType");
			return this;
		}

		public Criteria andMemberTypeLike(String value) {
			addCriterion("MEMBER_TYPE like", value, "memberType");
			return this;
		}

		public Criteria andMemberTypeNotLike(String value) {
			addCriterion("MEMBER_TYPE not like", value, "memberType");
			return this;
		}

		public Criteria andMemberTypeIn(List<String> values) {
			addCriterion("MEMBER_TYPE in", values, "memberType");
			return this;
		}

		public Criteria andMemberTypeNotIn(List<String> values) {
			addCriterion("MEMBER_TYPE not in", values, "memberType");
			return this;
		}

		public Criteria andMemberTypeBetween(String value1, String value2) {
			addCriterion("MEMBER_TYPE between", value1, value2, "memberType");
			return this;
		}

		public Criteria andMemberTypeNotBetween(String value1, String value2) {
			addCriterion("MEMBER_TYPE not between", value1, value2,
					"memberType");
			return this;
		}
	}
}