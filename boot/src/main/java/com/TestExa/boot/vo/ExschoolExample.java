package com.TestExa.boot.vo;

import java.util.ArrayList;
import java.util.List;

public class ExschoolExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table exschool
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table exschool
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table exschool
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exschool
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public ExschoolExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exschool
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exschool
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exschool
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exschool
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exschool
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exschool
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exschool
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
     * This method corresponds to the database table exschool
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
     * This method corresponds to the database table exschool
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exschool
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
     * This class corresponds to the database table exschool
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

        public Criteria andExsnameIsNull() {
            addCriterion("exsname is null");
            return (Criteria) this;
        }

        public Criteria andExsnameIsNotNull() {
            addCriterion("exsname is not null");
            return (Criteria) this;
        }

        public Criteria andExsnameEqualTo(String value) {
            addCriterion("exsname =", value, "exsname");
            return (Criteria) this;
        }

        public Criteria andExsnameNotEqualTo(String value) {
            addCriterion("exsname <>", value, "exsname");
            return (Criteria) this;
        }

        public Criteria andExsnameGreaterThan(String value) {
            addCriterion("exsname >", value, "exsname");
            return (Criteria) this;
        }

        public Criteria andExsnameGreaterThanOrEqualTo(String value) {
            addCriterion("exsname >=", value, "exsname");
            return (Criteria) this;
        }

        public Criteria andExsnameLessThan(String value) {
            addCriterion("exsname <", value, "exsname");
            return (Criteria) this;
        }

        public Criteria andExsnameLessThanOrEqualTo(String value) {
            addCriterion("exsname <=", value, "exsname");
            return (Criteria) this;
        }

        public Criteria andExsnameLike(String value) {
            addCriterion("exsname like", value, "exsname");
            return (Criteria) this;
        }

        public Criteria andExsnameNotLike(String value) {
            addCriterion("exsname not like", value, "exsname");
            return (Criteria) this;
        }

        public Criteria andExsnameIn(List<String> values) {
            addCriterion("exsname in", values, "exsname");
            return (Criteria) this;
        }

        public Criteria andExsnameNotIn(List<String> values) {
            addCriterion("exsname not in", values, "exsname");
            return (Criteria) this;
        }

        public Criteria andExsnameBetween(String value1, String value2) {
            addCriterion("exsname between", value1, value2, "exsname");
            return (Criteria) this;
        }

        public Criteria andExsnameNotBetween(String value1, String value2) {
            addCriterion("exsname not between", value1, value2, "exsname");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table exschool
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
     * This class corresponds to the database table exschool
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