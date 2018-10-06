package com.TestExa.boot.vo;

import java.util.ArrayList;
import java.util.List;

public class ExquestionsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table exquestions
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table exquestions
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table exquestions
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exquestions
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public ExquestionsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exquestions
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exquestions
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exquestions
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exquestions
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exquestions
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exquestions
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exquestions
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
     * This method corresponds to the database table exquestions
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
     * This method corresponds to the database table exquestions
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exquestions
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
     * This class corresponds to the database table exquestions
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

        public Criteria andExqidIsNull() {
            addCriterion("exqid is null");
            return (Criteria) this;
        }

        public Criteria andExqidIsNotNull() {
            addCriterion("exqid is not null");
            return (Criteria) this;
        }

        public Criteria andExqidEqualTo(Integer value) {
            addCriterion("exqid =", value, "exqid");
            return (Criteria) this;
        }

        public Criteria andExqidNotEqualTo(Integer value) {
            addCriterion("exqid <>", value, "exqid");
            return (Criteria) this;
        }

        public Criteria andExqidGreaterThan(Integer value) {
            addCriterion("exqid >", value, "exqid");
            return (Criteria) this;
        }

        public Criteria andExqidGreaterThanOrEqualTo(Integer value) {
            addCriterion("exqid >=", value, "exqid");
            return (Criteria) this;
        }

        public Criteria andExqidLessThan(Integer value) {
            addCriterion("exqid <", value, "exqid");
            return (Criteria) this;
        }

        public Criteria andExqidLessThanOrEqualTo(Integer value) {
            addCriterion("exqid <=", value, "exqid");
            return (Criteria) this;
        }

        public Criteria andExqidIn(List<Integer> values) {
            addCriterion("exqid in", values, "exqid");
            return (Criteria) this;
        }

        public Criteria andExqidNotIn(List<Integer> values) {
            addCriterion("exqid not in", values, "exqid");
            return (Criteria) this;
        }

        public Criteria andExqidBetween(Integer value1, Integer value2) {
            addCriterion("exqid between", value1, value2, "exqid");
            return (Criteria) this;
        }

        public Criteria andExqidNotBetween(Integer value1, Integer value2) {
            addCriterion("exqid not between", value1, value2, "exqid");
            return (Criteria) this;
        }

        public Criteria andExqinfoIsNull() {
            addCriterion("exqinfo is null");
            return (Criteria) this;
        }

        public Criteria andExqinfoIsNotNull() {
            addCriterion("exqinfo is not null");
            return (Criteria) this;
        }

        public Criteria andExqinfoEqualTo(String value) {
            addCriterion("exqinfo =", value, "exqinfo");
            return (Criteria) this;
        }

        public Criteria andExqinfoNotEqualTo(String value) {
            addCriterion("exqinfo <>", value, "exqinfo");
            return (Criteria) this;
        }

        public Criteria andExqinfoGreaterThan(String value) {
            addCriterion("exqinfo >", value, "exqinfo");
            return (Criteria) this;
        }

        public Criteria andExqinfoGreaterThanOrEqualTo(String value) {
            addCriterion("exqinfo >=", value, "exqinfo");
            return (Criteria) this;
        }

        public Criteria andExqinfoLessThan(String value) {
            addCriterion("exqinfo <", value, "exqinfo");
            return (Criteria) this;
        }

        public Criteria andExqinfoLessThanOrEqualTo(String value) {
            addCriterion("exqinfo <=", value, "exqinfo");
            return (Criteria) this;
        }

        public Criteria andExqinfoLike(String value) {
            addCriterion("exqinfo like", value, "exqinfo");
            return (Criteria) this;
        }

        public Criteria andExqinfoNotLike(String value) {
            addCriterion("exqinfo not like", value, "exqinfo");
            return (Criteria) this;
        }

        public Criteria andExqinfoIn(List<String> values) {
            addCriterion("exqinfo in", values, "exqinfo");
            return (Criteria) this;
        }

        public Criteria andExqinfoNotIn(List<String> values) {
            addCriterion("exqinfo not in", values, "exqinfo");
            return (Criteria) this;
        }

        public Criteria andExqinfoBetween(String value1, String value2) {
            addCriterion("exqinfo between", value1, value2, "exqinfo");
            return (Criteria) this;
        }

        public Criteria andExqinfoNotBetween(String value1, String value2) {
            addCriterion("exqinfo not between", value1, value2, "exqinfo");
            return (Criteria) this;
        }

        public Criteria andExtidIsNull() {
            addCriterion("extid is null");
            return (Criteria) this;
        }

        public Criteria andExtidIsNotNull() {
            addCriterion("extid is not null");
            return (Criteria) this;
        }

        public Criteria andExtidEqualTo(Integer value) {
            addCriterion("extid =", value, "extid");
            return (Criteria) this;
        }

        public Criteria andExtidNotEqualTo(Integer value) {
            addCriterion("extid <>", value, "extid");
            return (Criteria) this;
        }

        public Criteria andExtidGreaterThan(Integer value) {
            addCriterion("extid >", value, "extid");
            return (Criteria) this;
        }

        public Criteria andExtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("extid >=", value, "extid");
            return (Criteria) this;
        }

        public Criteria andExtidLessThan(Integer value) {
            addCriterion("extid <", value, "extid");
            return (Criteria) this;
        }

        public Criteria andExtidLessThanOrEqualTo(Integer value) {
            addCriterion("extid <=", value, "extid");
            return (Criteria) this;
        }

        public Criteria andExtidIn(List<Integer> values) {
            addCriterion("extid in", values, "extid");
            return (Criteria) this;
        }

        public Criteria andExtidNotIn(List<Integer> values) {
            addCriterion("extid not in", values, "extid");
            return (Criteria) this;
        }

        public Criteria andExtidBetween(Integer value1, Integer value2) {
            addCriterion("extid between", value1, value2, "extid");
            return (Criteria) this;
        }

        public Criteria andExtidNotBetween(Integer value1, Integer value2) {
            addCriterion("extid not between", value1, value2, "extid");
            return (Criteria) this;
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

        public Criteria andExsubidIsNull() {
            addCriterion("exsubid is null");
            return (Criteria) this;
        }

        public Criteria andExsubidIsNotNull() {
            addCriterion("exsubid is not null");
            return (Criteria) this;
        }

        public Criteria andExsubidEqualTo(Integer value) {
            addCriterion("exsubid =", value, "exsubid");
            return (Criteria) this;
        }

        public Criteria andExsubidNotEqualTo(Integer value) {
            addCriterion("exsubid <>", value, "exsubid");
            return (Criteria) this;
        }

        public Criteria andExsubidGreaterThan(Integer value) {
            addCriterion("exsubid >", value, "exsubid");
            return (Criteria) this;
        }

        public Criteria andExsubidGreaterThanOrEqualTo(Integer value) {
            addCriterion("exsubid >=", value, "exsubid");
            return (Criteria) this;
        }

        public Criteria andExsubidLessThan(Integer value) {
            addCriterion("exsubid <", value, "exsubid");
            return (Criteria) this;
        }

        public Criteria andExsubidLessThanOrEqualTo(Integer value) {
            addCriterion("exsubid <=", value, "exsubid");
            return (Criteria) this;
        }

        public Criteria andExsubidIn(List<Integer> values) {
            addCriterion("exsubid in", values, "exsubid");
            return (Criteria) this;
        }

        public Criteria andExsubidNotIn(List<Integer> values) {
            addCriterion("exsubid not in", values, "exsubid");
            return (Criteria) this;
        }

        public Criteria andExsubidBetween(Integer value1, Integer value2) {
            addCriterion("exsubid between", value1, value2, "exsubid");
            return (Criteria) this;
        }

        public Criteria andExsubidNotBetween(Integer value1, Integer value2) {
            addCriterion("exsubid not between", value1, value2, "exsubid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table exquestions
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
     * This class corresponds to the database table exquestions
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