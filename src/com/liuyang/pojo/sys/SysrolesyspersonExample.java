package com.liuyang.pojo.sys;

import java.util.ArrayList;
import java.util.List;

public class SysrolesyspersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysrolesyspersonExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andSyspersonidIsNull() {
            addCriterion("SysPersonId is null");
            return (Criteria) this;
        }

        public Criteria andSyspersonidIsNotNull() {
            addCriterion("SysPersonId is not null");
            return (Criteria) this;
        }

        public Criteria andSyspersonidEqualTo(String value) {
            addCriterion("SysPersonId =", value, "syspersonid");
            return (Criteria) this;
        }

        public Criteria andSyspersonidNotEqualTo(String value) {
            addCriterion("SysPersonId <>", value, "syspersonid");
            return (Criteria) this;
        }

        public Criteria andSyspersonidGreaterThan(String value) {
            addCriterion("SysPersonId >", value, "syspersonid");
            return (Criteria) this;
        }

        public Criteria andSyspersonidGreaterThanOrEqualTo(String value) {
            addCriterion("SysPersonId >=", value, "syspersonid");
            return (Criteria) this;
        }

        public Criteria andSyspersonidLessThan(String value) {
            addCriterion("SysPersonId <", value, "syspersonid");
            return (Criteria) this;
        }

        public Criteria andSyspersonidLessThanOrEqualTo(String value) {
            addCriterion("SysPersonId <=", value, "syspersonid");
            return (Criteria) this;
        }

        public Criteria andSyspersonidLike(String value) {
            addCriterion("SysPersonId like", value, "syspersonid");
            return (Criteria) this;
        }

        public Criteria andSyspersonidNotLike(String value) {
            addCriterion("SysPersonId not like", value, "syspersonid");
            return (Criteria) this;
        }

        public Criteria andSyspersonidIn(List<String> values) {
            addCriterion("SysPersonId in", values, "syspersonid");
            return (Criteria) this;
        }

        public Criteria andSyspersonidNotIn(List<String> values) {
            addCriterion("SysPersonId not in", values, "syspersonid");
            return (Criteria) this;
        }

        public Criteria andSyspersonidBetween(String value1, String value2) {
            addCriterion("SysPersonId between", value1, value2, "syspersonid");
            return (Criteria) this;
        }

        public Criteria andSyspersonidNotBetween(String value1, String value2) {
            addCriterion("SysPersonId not between", value1, value2, "syspersonid");
            return (Criteria) this;
        }

        public Criteria andSysroleidIsNull() {
            addCriterion("SysRoleId is null");
            return (Criteria) this;
        }

        public Criteria andSysroleidIsNotNull() {
            addCriterion("SysRoleId is not null");
            return (Criteria) this;
        }

        public Criteria andSysroleidEqualTo(String value) {
            addCriterion("SysRoleId =", value, "sysroleid");
            return (Criteria) this;
        }

        public Criteria andSysroleidNotEqualTo(String value) {
            addCriterion("SysRoleId <>", value, "sysroleid");
            return (Criteria) this;
        }

        public Criteria andSysroleidGreaterThan(String value) {
            addCriterion("SysRoleId >", value, "sysroleid");
            return (Criteria) this;
        }

        public Criteria andSysroleidGreaterThanOrEqualTo(String value) {
            addCriterion("SysRoleId >=", value, "sysroleid");
            return (Criteria) this;
        }

        public Criteria andSysroleidLessThan(String value) {
            addCriterion("SysRoleId <", value, "sysroleid");
            return (Criteria) this;
        }

        public Criteria andSysroleidLessThanOrEqualTo(String value) {
            addCriterion("SysRoleId <=", value, "sysroleid");
            return (Criteria) this;
        }

        public Criteria andSysroleidLike(String value) {
            addCriterion("SysRoleId like", value, "sysroleid");
            return (Criteria) this;
        }

        public Criteria andSysroleidNotLike(String value) {
            addCriterion("SysRoleId not like", value, "sysroleid");
            return (Criteria) this;
        }

        public Criteria andSysroleidIn(List<String> values) {
            addCriterion("SysRoleId in", values, "sysroleid");
            return (Criteria) this;
        }

        public Criteria andSysroleidNotIn(List<String> values) {
            addCriterion("SysRoleId not in", values, "sysroleid");
            return (Criteria) this;
        }

        public Criteria andSysroleidBetween(String value1, String value2) {
            addCriterion("SysRoleId between", value1, value2, "sysroleid");
            return (Criteria) this;
        }

        public Criteria andSysroleidNotBetween(String value1, String value2) {
            addCriterion("SysRoleId not between", value1, value2, "sysroleid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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