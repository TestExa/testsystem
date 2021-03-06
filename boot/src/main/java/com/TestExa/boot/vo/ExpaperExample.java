package com.TestExa.boot.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ExpaperExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table expaper
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table expaper
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table expaper
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expaper
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public ExpaperExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expaper
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expaper
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expaper
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expaper
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expaper
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expaper
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expaper
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expaper
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expaper
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expaper
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table expaper
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andExpidIsNull() {
            addCriterion("expid is null");
            return (Criteria) this;
        }

        public Criteria andExpidIsNotNull() {
            addCriterion("expid is not null");
            return (Criteria) this;
        }

        public Criteria andExpidEqualTo(Integer value) {
            addCriterion("expid =", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidNotEqualTo(Integer value) {
            addCriterion("expid <>", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidGreaterThan(Integer value) {
            addCriterion("expid >", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("expid >=", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidLessThan(Integer value) {
            addCriterion("expid <", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidLessThanOrEqualTo(Integer value) {
            addCriterion("expid <=", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidIn(List<Integer> values) {
            addCriterion("expid in", values, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidNotIn(List<Integer> values) {
            addCriterion("expid not in", values, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidBetween(Integer value1, Integer value2) {
            addCriterion("expid between", value1, value2, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidNotBetween(Integer value1, Integer value2) {
            addCriterion("expid not between", value1, value2, "expid");
            return (Criteria) this;
        }

        public Criteria andExstimeIsNull() {
            addCriterion("exstime is null");
            return (Criteria) this;
        }

        public Criteria andExstimeIsNotNull() {
            addCriterion("exstime is not null");
            return (Criteria) this;
        }

        public Criteria andExstimeEqualTo(Date value) {
            addCriterionForJDBCDate("exstime =", value, "exstime");
            return (Criteria) this;
        }

        public Criteria andExstimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("exstime <>", value, "exstime");
            return (Criteria) this;
        }

        public Criteria andExstimeGreaterThan(Date value) {
            addCriterionForJDBCDate("exstime >", value, "exstime");
            return (Criteria) this;
        }

        public Criteria andExstimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exstime >=", value, "exstime");
            return (Criteria) this;
        }

        public Criteria andExstimeLessThan(Date value) {
            addCriterionForJDBCDate("exstime <", value, "exstime");
            return (Criteria) this;
        }

        public Criteria andExstimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exstime <=", value, "exstime");
            return (Criteria) this;
        }

        public Criteria andExstimeIn(List<Date> values) {
            addCriterionForJDBCDate("exstime in", values, "exstime");
            return (Criteria) this;
        }

        public Criteria andExstimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("exstime not in", values, "exstime");
            return (Criteria) this;
        }

        public Criteria andExstimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exstime between", value1, value2, "exstime");
            return (Criteria) this;
        }

        public Criteria andExstimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exstime not between", value1, value2, "exstime");
            return (Criteria) this;
        }

        public Criteria andExteidIsNull() {
            addCriterion("exteid is null");
            return (Criteria) this;
        }

        public Criteria andExteidIsNotNull() {
            addCriterion("exteid is not null");
            return (Criteria) this;
        }

        public Criteria andExteidEqualTo(Integer value) {
            addCriterion("exteid =", value, "exteid");
            return (Criteria) this;
        }

        public Criteria andExteidNotEqualTo(Integer value) {
            addCriterion("exteid <>", value, "exteid");
            return (Criteria) this;
        }

        public Criteria andExteidGreaterThan(Integer value) {
            addCriterion("exteid >", value, "exteid");
            return (Criteria) this;
        }

        public Criteria andExteidGreaterThanOrEqualTo(Integer value) {
            addCriterion("exteid >=", value, "exteid");
            return (Criteria) this;
        }

        public Criteria andExteidLessThan(Integer value) {
            addCriterion("exteid <", value, "exteid");
            return (Criteria) this;
        }

        public Criteria andExteidLessThanOrEqualTo(Integer value) {
            addCriterion("exteid <=", value, "exteid");
            return (Criteria) this;
        }

        public Criteria andExteidIn(List<Integer> values) {
            addCriterion("exteid in", values, "exteid");
            return (Criteria) this;
        }

        public Criteria andExteidNotIn(List<Integer> values) {
            addCriterion("exteid not in", values, "exteid");
            return (Criteria) this;
        }

        public Criteria andExteidBetween(Integer value1, Integer value2) {
            addCriterion("exteid between", value1, value2, "exteid");
            return (Criteria) this;
        }

        public Criteria andExteidNotBetween(Integer value1, Integer value2) {
            addCriterion("exteid not between", value1, value2, "exteid");
            return (Criteria) this;
        }

        public Criteria andExsidIsNull() {
            addCriterion("exsid is null");
            return (Criteria) this;
        }

        public Criteria andExsidIsNotNull() {
            addCriterion("exsid is not null");
            return (Criteria) this;
        }

        public Criteria andExsidEqualTo(Integer value) {
            addCriterion("exsid =", value, "exsid");
            return (Criteria) this;
        }

        public Criteria andExsidNotEqualTo(Integer value) {
            addCriterion("exsid <>", value, "exsid");
            return (Criteria) this;
        }

        public Criteria andExsidGreaterThan(Integer value) {
            addCriterion("exsid >", value, "exsid");
            return (Criteria) this;
        }

        public Criteria andExsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("exsid >=", value, "exsid");
            return (Criteria) this;
        }

        public Criteria andExsidLessThan(Integer value) {
            addCriterion("exsid <", value, "exsid");
            return (Criteria) this;
        }

        public Criteria andExsidLessThanOrEqualTo(Integer value) {
            addCriterion("exsid <=", value, "exsid");
            return (Criteria) this;
        }

        public Criteria andExsidIn(List<Integer> values) {
            addCriterion("exsid in", values, "exsid");
            return (Criteria) this;
        }

        public Criteria andExsidNotIn(List<Integer> values) {
            addCriterion("exsid not in", values, "exsid");
            return (Criteria) this;
        }

        public Criteria andExsidBetween(Integer value1, Integer value2) {
            addCriterion("exsid between", value1, value2, "exsid");
            return (Criteria) this;
        }

        public Criteria andExsidNotBetween(Integer value1, Integer value2) {
            addCriterion("exsid not between", value1, value2, "exsid");
            return (Criteria) this;
        }

        public Criteria andExpdataIsNull() {
            addCriterion("expdata is null");
            return (Criteria) this;
        }

        public Criteria andExpdataIsNotNull() {
            addCriterion("expdata is not null");
            return (Criteria) this;
        }

        public Criteria andExpdataEqualTo(Date value) {
            addCriterion("expdata =", value, "expdata");
            return (Criteria) this;
        }

        public Criteria andExpdataNotEqualTo(Date value) {
            addCriterion("expdata <>", value, "expdata");
            return (Criteria) this;
        }

        public Criteria andExpdataGreaterThan(Date value) {
            addCriterion("expdata >", value, "expdata");
            return (Criteria) this;
        }

        public Criteria andExpdataGreaterThanOrEqualTo(Date value) {
            addCriterion("expdata >=", value, "expdata");
            return (Criteria) this;
        }

        public Criteria andExpdataLessThan(Date value) {
            addCriterion("expdata <", value, "expdata");
            return (Criteria) this;
        }

        public Criteria andExpdataLessThanOrEqualTo(Date value) {
            addCriterion("expdata <=", value, "expdata");
            return (Criteria) this;
        }

        public Criteria andExpdataIn(List<Date> values) {
            addCriterion("expdata in", values, "expdata");
            return (Criteria) this;
        }

        public Criteria andExpdataNotIn(List<Date> values) {
            addCriterion("expdata not in", values, "expdata");
            return (Criteria) this;
        }

        public Criteria andExpdataBetween(Date value1, Date value2) {
            addCriterion("expdata between", value1, value2, "expdata");
            return (Criteria) this;
        }

        public Criteria andExpdataNotBetween(Date value1, Date value2) {
            addCriterion("expdata not between", value1, value2, "expdata");
            return (Criteria) this;
        }

        public Criteria andExptimeIsNull() {
            addCriterion("exptime is null");
            return (Criteria) this;
        }

        public Criteria andExptimeIsNotNull() {
            addCriterion("exptime is not null");
            return (Criteria) this;
        }

        public Criteria andExptimeEqualTo(Date value) {
            addCriterion("exptime =", value, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeNotEqualTo(Date value) {
            addCriterion("exptime <>", value, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeGreaterThan(Date value) {
            addCriterion("exptime >", value, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exptime >=", value, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeLessThan(Date value) {
            addCriterion("exptime <", value, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeLessThanOrEqualTo(Date value) {
            addCriterion("exptime <=", value, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeIn(List<Date> values) {
            addCriterion("exptime in", values, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeNotIn(List<Date> values) {
            addCriterion("exptime not in", values, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeBetween(Date value1, Date value2) {
            addCriterion("exptime between", value1, value2, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeNotBetween(Date value1, Date value2) {
            addCriterion("exptime not between", value1, value2, "exptime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table expaper
     *
     * @mbg.generated do_not_delete_during_merge Sat Oct 06 10:45:40 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table expaper
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}