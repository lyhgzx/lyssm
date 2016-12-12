package com.liuyang.pojo.sys;

import java.util.ArrayList;
import java.util.List;

public class SysmenusysrolesysoperationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysmenusysrolesysoperationExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("Id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("Id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSysmenuidIsNull() {
            addCriterion("SysMenuId is null");
            return (Criteria) this;
        }

        public Criteria andSysmenuidIsNotNull() {
            addCriterion("SysMenuId is not null");
            return (Criteria) this;
        }

        public Criteria andSysmenuidEqualTo(String value) {
            addCriterion("SysMenuId =", value, "sysmenuid");
            return (Criteria) this;
        }

        public Criteria andSysmenuidNotEqualTo(String value) {
            addCriterion("SysMenuId <>", value, "sysmenuid");
            return (Criteria) this;
        }

        public Criteria andSysmenuidGreaterThan(String value) {
            addCriterion("SysMenuId >", value, "sysmenuid");
            return (Criteria) this;
        }

        public Criteria andSysmenuidGreaterThanOrEqualTo(String value) {
            addCriterion("SysMenuId >=", value, "sysmenuid");
            return (Criteria) this;
        }

        public Criteria andSysmenuidLessThan(String value) {
            addCriterion("SysMenuId <", value, "sysmenuid");
            return (Criteria) this;
        }

        public Criteria andSysmenuidLessThanOrEqualTo(String value) {
            addCriterion("SysMenuId <=", value, "sysmenuid");
            return (Criteria) this;
        }

        public Criteria andSysmenuidLike(String value) {
            addCriterion("SysMenuId like", value, "sysmenuid");
            return (Criteria) this;
        }

        public Criteria andSysmenuidNotLike(String value) {
            addCriterion("SysMenuId not like", value, "sysmenuid");
            return (Criteria) this;
        }

        public Criteria andSysmenuidIn(List<String> values) {
            addCriterion("SysMenuId in", values, "sysmenuid");
            return (Criteria) this;
        }

        public Criteria andSysmenuidNotIn(List<String> values) {
            addCriterion("SysMenuId not in", values, "sysmenuid");
            return (Criteria) this;
        }

        public Criteria andSysmenuidBetween(String value1, String value2) {
            addCriterion("SysMenuId between", value1, value2, "sysmenuid");
            return (Criteria) this;
        }

        public Criteria andSysmenuidNotBetween(String value1, String value2) {
            addCriterion("SysMenuId not between", value1, value2, "sysmenuid");
            return (Criteria) this;
        }

        public Criteria andSysoperationidIsNull() {
            addCriterion("SysOperationId is null");
            return (Criteria) this;
        }

        public Criteria andSysoperationidIsNotNull() {
            addCriterion("SysOperationId is not null");
            return (Criteria) this;
        }

        public Criteria andSysoperationidEqualTo(String value) {
            addCriterion("SysOperationId =", value, "sysoperationid");
            return (Criteria) this;
        }

        public Criteria andSysoperationidNotEqualTo(String value) {
            addCriterion("SysOperationId <>", value, "sysoperationid");
            return (Criteria) this;
        }

        public Criteria andSysoperationidGreaterThan(String value) {
            addCriterion("SysOperationId >", value, "sysoperationid");
            return (Criteria) this;
        }

        public Criteria andSysoperationidGreaterThanOrEqualTo(String value) {
            addCriterion("SysOperationId >=", value, "sysoperationid");
            return (Criteria) this;
        }

        public Criteria andSysoperationidLessThan(String value) {
            addCriterion("SysOperationId <", value, "sysoperationid");
            return (Criteria) this;
        }

        public Criteria andSysoperationidLessThanOrEqualTo(String value) {
            addCriterion("SysOperationId <=", value, "sysoperationid");
            return (Criteria) this;
        }

        public Criteria andSysoperationidLike(String value) {
            addCriterion("SysOperationId like", value, "sysoperationid");
            return (Criteria) this;
        }

        public Criteria andSysoperationidNotLike(String value) {
            addCriterion("SysOperationId not like", value, "sysoperationid");
            return (Criteria) this;
        }

        public Criteria andSysoperationidIn(List<String> values) {
            addCriterion("SysOperationId in", values, "sysoperationid");
            return (Criteria) this;
        }

        public Criteria andSysoperationidNotIn(List<String> values) {
            addCriterion("SysOperationId not in", values, "sysoperationid");
            return (Criteria) this;
        }

        public Criteria andSysoperationidBetween(String value1, String value2) {
            addCriterion("SysOperationId between", value1, value2, "sysoperationid");
            return (Criteria) this;
        }

        public Criteria andSysoperationidNotBetween(String value1, String value2) {
            addCriterion("SysOperationId not between", value1, value2, "sysoperationid");
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