package com.TestExa.boot.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExaminfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table examinfo
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table examinfo
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table examinfo
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examinfo
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public ExaminfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examinfo
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examinfo
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examinfo
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examinfo
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examinfo
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examinfo
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examinfo
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
     * This method corresponds to the database table examinfo
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
     * This method corresponds to the database table examinfo
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examinfo
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
     * This class corresponds to the database table examinfo
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

        public Criteria andExstuidIsNull() {
            addCriterion("exstuid is null");
            return (Criteria) this;
        }

        public Criteria andExstuidIsNotNull() {
            addCriterion("exstuid is not null");
            return (Criteria) this;
        }

        public Criteria andExstuidEqualTo(Integer value) {
            addCriterion("exstuid =", value, "exstuid");
            return (Criteria) this;
        }

        public Criteria andExstuidNotEqualTo(Integer value) {
            addCriterion("exstuid <>", value, "exstuid");
            return (Criteria) this;
        }

        public Criteria andExstuidGreaterThan(Integer value) {
            addCriterion("exstuid >", value, "exstuid");
            return (Criteria) this;
        }

        public Criteria andExstuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("exstuid >=", value, "exstuid");
            return (Criteria) this;
        }

        public Criteria andExstuidLessThan(Integer value) {
            addCriterion("exstuid <", value, "exstuid");
            return (Criteria) this;
        }

        public Criteria andExstuidLessThanOrEqualTo(Integer value) {
            addCriterion("exstuid <=", value, "exstuid");
            return (Criteria) this;
        }

        public Criteria andExstuidIn(List<Integer> values) {
            addCriterion("exstuid in", values, "exstuid");
            return (Criteria) this;
        }

        public Criteria andExstuidNotIn(List<Integer> values) {
            addCriterion("exstuid not in", values, "exstuid");
            return (Criteria) this;
        }

        public Criteria andExstuidBetween(Integer value1, Integer value2) {
            addCriterion("exstuid between", value1, value2, "exstuid");
            return (Criteria) this;
        }

        public Criteria andExstuidNotBetween(Integer value1, Integer value2) {
            addCriterion("exstuid not between", value1, value2, "exstuid");
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

        public Criteria andExrecordIsNull() {
            addCriterion("exrecord is null");
            return (Criteria) this;
        }

        public Criteria andExrecordIsNotNull() {
            addCriterion("exrecord is not null");
            return (Criteria) this;
        }

        public Criteria andExrecordEqualTo(String value) {
            addCriterion("exrecord =", value, "exrecord");
            return (Criteria) this;
        }

        public Criteria andExrecordNotEqualTo(String value) {
            addCriterion("exrecord <>", value, "exrecord");
            return (Criteria) this;
        }

        public Criteria andExrecordGreaterThan(String value) {
            addCriterion("exrecord >", value, "exrecord");
            return (Criteria) this;
        }

        public Criteria andExrecordGreaterThanOrEqualTo(String value) {
            addCriterion("exrecord >=", value, "exrecord");
            return (Criteria) this;
        }

        public Criteria andExrecordLessThan(String value) {
            addCriterion("exrecord <", value, "exrecord");
            return (Criteria) this;
        }

        public Criteria andExrecordLessThanOrEqualTo(String value) {
            addCriterion("exrecord <=", value, "exrecord");
            return (Criteria) this;
        }

        public Criteria andExrecordLike(String value) {
            addCriterion("exrecord like", value, "exrecord");
            return (Criteria) this;
        }

        public Criteria andExrecordNotLike(String value) {
            addCriterion("exrecord not like", value, "exrecord");
            return (Criteria) this;
        }

        public Criteria andExrecordIn(List<String> values) {
            addCriterion("exrecord in", values, "exrecord");
            return (Criteria) this;
        }

        public Criteria andExrecordNotIn(List<String> values) {
            addCriterion("exrecord not in", values, "exrecord");
            return (Criteria) this;
        }

        public Criteria andExrecordBetween(String value1, String value2) {
            addCriterion("exrecord between", value1, value2, "exrecord");
            return (Criteria) this;
        }

        public Criteria andExrecordNotBetween(String value1, String value2) {
            addCriterion("exrecord not between", value1, value2, "exrecord");
            return (Criteria) this;
        }

        public Criteria andStartimeIsNull() {
            addCriterion("startime is null");
            return (Criteria) this;
        }

        public Criteria andStartimeIsNotNull() {
            addCriterion("startime is not null");
            return (Criteria) this;
        }

        public Criteria andStartimeEqualTo(Date value) {
            addCriterion("startime =", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeNotEqualTo(Date value) {
            addCriterion("startime <>", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeGreaterThan(Date value) {
            addCriterion("startime >", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startime >=", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeLessThan(Date value) {
            addCriterion("startime <", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeLessThanOrEqualTo(Date value) {
            addCriterion("startime <=", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeIn(List<Date> values) {
            addCriterion("startime in", values, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeNotIn(List<Date> values) {
            addCriterion("startime not in", values, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeBetween(Date value1, Date value2) {
            addCriterion("startime between", value1, value2, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeNotBetween(Date value1, Date value2) {
            addCriterion("startime not between", value1, value2, "startime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andSparetimeIsNull() {
            addCriterion("sparetime is null");
            return (Criteria) this;
        }

        public Criteria andSparetimeIsNotNull() {
            addCriterion("sparetime is not null");
            return (Criteria) this;
        }

        public Criteria andSparetimeEqualTo(Integer value) {
            addCriterion("sparetime =", value, "sparetime");
            return (Criteria) this;
        }

        public Criteria andSparetimeNotEqualTo(Integer value) {
            addCriterion("sparetime <>", value, "sparetime");
            return (Criteria) this;
        }

        public Criteria andSparetimeGreaterThan(Integer value) {
            addCriterion("sparetime >", value, "sparetime");
            return (Criteria) this;
        }

        public Criteria andSparetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sparetime >=", value, "sparetime");
            return (Criteria) this;
        }

        public Criteria andSparetimeLessThan(Integer value) {
            addCriterion("sparetime <", value, "sparetime");
            return (Criteria) this;
        }

        public Criteria andSparetimeLessThanOrEqualTo(Integer value) {
            addCriterion("sparetime <=", value, "sparetime");
            return (Criteria) this;
        }

        public Criteria andSparetimeIn(List<Integer> values) {
            addCriterion("sparetime in", values, "sparetime");
            return (Criteria) this;
        }

        public Criteria andSparetimeNotIn(List<Integer> values) {
            addCriterion("sparetime not in", values, "sparetime");
            return (Criteria) this;
        }

        public Criteria andSparetimeBetween(Integer value1, Integer value2) {
            addCriterion("sparetime between", value1, value2, "sparetime");
            return (Criteria) this;
        }

        public Criteria andSparetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("sparetime not between", value1, value2, "sparetime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table examinfo
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
     * This class corresponds to the database table examinfo
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