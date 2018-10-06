package com.TestExa.boot.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ExsubjectExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table exsubject
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table exsubject
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table exsubject
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exsubject
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public ExsubjectExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exsubject
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exsubject
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exsubject
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exsubject
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exsubject
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exsubject
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exsubject
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
     * This method corresponds to the database table exsubject
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
     * This method corresponds to the database table exsubject
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exsubject
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
     * This class corresponds to the database table exsubject
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

        public Criteria andExsubnameIsNull() {
            addCriterion("exsubname is null");
            return (Criteria) this;
        }

        public Criteria andExsubnameIsNotNull() {
            addCriterion("exsubname is not null");
            return (Criteria) this;
        }

        public Criteria andExsubnameEqualTo(String value) {
            addCriterion("exsubname =", value, "exsubname");
            return (Criteria) this;
        }

        public Criteria andExsubnameNotEqualTo(String value) {
            addCriterion("exsubname <>", value, "exsubname");
            return (Criteria) this;
        }

        public Criteria andExsubnameGreaterThan(String value) {
            addCriterion("exsubname >", value, "exsubname");
            return (Criteria) this;
        }

        public Criteria andExsubnameGreaterThanOrEqualTo(String value) {
            addCriterion("exsubname >=", value, "exsubname");
            return (Criteria) this;
        }

        public Criteria andExsubnameLessThan(String value) {
            addCriterion("exsubname <", value, "exsubname");
            return (Criteria) this;
        }

        public Criteria andExsubnameLessThanOrEqualTo(String value) {
            addCriterion("exsubname <=", value, "exsubname");
            return (Criteria) this;
        }

        public Criteria andExsubnameLike(String value) {
            addCriterion("exsubname like", value, "exsubname");
            return (Criteria) this;
        }

        public Criteria andExsubnameNotLike(String value) {
            addCriterion("exsubname not like", value, "exsubname");
            return (Criteria) this;
        }

        public Criteria andExsubnameIn(List<String> values) {
            addCriterion("exsubname in", values, "exsubname");
            return (Criteria) this;
        }

        public Criteria andExsubnameNotIn(List<String> values) {
            addCriterion("exsubname not in", values, "exsubname");
            return (Criteria) this;
        }

        public Criteria andExsubnameBetween(String value1, String value2) {
            addCriterion("exsubname between", value1, value2, "exsubname");
            return (Criteria) this;
        }

        public Criteria andExsubnameNotBetween(String value1, String value2) {
            addCriterion("exsubname not between", value1, value2, "exsubname");
            return (Criteria) this;
        }

        public Criteria andExsubtimeIsNull() {
            addCriterion("exsubtime is null");
            return (Criteria) this;
        }

        public Criteria andExsubtimeIsNotNull() {
            addCriterion("exsubtime is not null");
            return (Criteria) this;
        }

        public Criteria andExsubtimeEqualTo(Date value) {
            addCriterionForJDBCDate("exsubtime =", value, "exsubtime");
            return (Criteria) this;
        }

        public Criteria andExsubtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("exsubtime <>", value, "exsubtime");
            return (Criteria) this;
        }

        public Criteria andExsubtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("exsubtime >", value, "exsubtime");
            return (Criteria) this;
        }

        public Criteria andExsubtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exsubtime >=", value, "exsubtime");
            return (Criteria) this;
        }

        public Criteria andExsubtimeLessThan(Date value) {
            addCriterionForJDBCDate("exsubtime <", value, "exsubtime");
            return (Criteria) this;
        }

        public Criteria andExsubtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exsubtime <=", value, "exsubtime");
            return (Criteria) this;
        }

        public Criteria andExsubtimeIn(List<Date> values) {
            addCriterionForJDBCDate("exsubtime in", values, "exsubtime");
            return (Criteria) this;
        }

        public Criteria andExsubtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("exsubtime not in", values, "exsubtime");
            return (Criteria) this;
        }

        public Criteria andExsubtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exsubtime between", value1, value2, "exsubtime");
            return (Criteria) this;
        }

        public Criteria andExsubtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exsubtime not between", value1, value2, "exsubtime");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table exsubject
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
     * This class corresponds to the database table exsubject
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