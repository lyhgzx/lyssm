package com.liuyang.pojo.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysloginhistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysloginhistoryExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNull() {
            addCriterion("UserCode is null");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNotNull() {
            addCriterion("UserCode is not null");
            return (Criteria) this;
        }

        public Criteria andUsercodeEqualTo(String value) {
            addCriterion("UserCode =", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotEqualTo(String value) {
            addCriterion("UserCode <>", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThan(String value) {
            addCriterion("UserCode >", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThanOrEqualTo(String value) {
            addCriterion("UserCode >=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThan(String value) {
            addCriterion("UserCode <", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThanOrEqualTo(String value) {
            addCriterion("UserCode <=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLike(String value) {
            addCriterion("UserCode like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotLike(String value) {
            addCriterion("UserCode not like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeIn(List<String> values) {
            addCriterion("UserCode in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotIn(List<String> values) {
            addCriterion("UserCode not in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeBetween(String value1, String value2) {
            addCriterion("UserCode between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotBetween(String value1, String value2) {
            addCriterion("UserCode not between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNull() {
            addCriterion("HostName is null");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNotNull() {
            addCriterion("HostName is not null");
            return (Criteria) this;
        }

        public Criteria andHostnameEqualTo(String value) {
            addCriterion("HostName =", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotEqualTo(String value) {
            addCriterion("HostName <>", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThan(String value) {
            addCriterion("HostName >", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThanOrEqualTo(String value) {
            addCriterion("HostName >=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThan(String value) {
            addCriterion("HostName <", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThanOrEqualTo(String value) {
            addCriterion("HostName <=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLike(String value) {
            addCriterion("HostName like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotLike(String value) {
            addCriterion("HostName not like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameIn(List<String> values) {
            addCriterion("HostName in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotIn(List<String> values) {
            addCriterion("HostName not in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameBetween(String value1, String value2) {
            addCriterion("HostName between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotBetween(String value1, String value2) {
            addCriterion("HostName not between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostipIsNull() {
            addCriterion("HostIP is null");
            return (Criteria) this;
        }

        public Criteria andHostipIsNotNull() {
            addCriterion("HostIP is not null");
            return (Criteria) this;
        }

        public Criteria andHostipEqualTo(String value) {
            addCriterion("HostIP =", value, "hostip");
            return (Criteria) this;
        }

        public Criteria andHostipNotEqualTo(String value) {
            addCriterion("HostIP <>", value, "hostip");
            return (Criteria) this;
        }

        public Criteria andHostipGreaterThan(String value) {
            addCriterion("HostIP >", value, "hostip");
            return (Criteria) this;
        }

        public Criteria andHostipGreaterThanOrEqualTo(String value) {
            addCriterion("HostIP >=", value, "hostip");
            return (Criteria) this;
        }

        public Criteria andHostipLessThan(String value) {
            addCriterion("HostIP <", value, "hostip");
            return (Criteria) this;
        }

        public Criteria andHostipLessThanOrEqualTo(String value) {
            addCriterion("HostIP <=", value, "hostip");
            return (Criteria) this;
        }

        public Criteria andHostipLike(String value) {
            addCriterion("HostIP like", value, "hostip");
            return (Criteria) this;
        }

        public Criteria andHostipNotLike(String value) {
            addCriterion("HostIP not like", value, "hostip");
            return (Criteria) this;
        }

        public Criteria andHostipIn(List<String> values) {
            addCriterion("HostIP in", values, "hostip");
            return (Criteria) this;
        }

        public Criteria andHostipNotIn(List<String> values) {
            addCriterion("HostIP not in", values, "hostip");
            return (Criteria) this;
        }

        public Criteria andHostipBetween(String value1, String value2) {
            addCriterion("HostIP between", value1, value2, "hostip");
            return (Criteria) this;
        }

        public Criteria andHostipNotBetween(String value1, String value2) {
            addCriterion("HostIP not between", value1, value2, "hostip");
            return (Criteria) this;
        }

        public Criteria andLogincityIsNull() {
            addCriterion("LoginCity is null");
            return (Criteria) this;
        }

        public Criteria andLogincityIsNotNull() {
            addCriterion("LoginCity is not null");
            return (Criteria) this;
        }

        public Criteria andLogincityEqualTo(String value) {
            addCriterion("LoginCity =", value, "logincity");
            return (Criteria) this;
        }

        public Criteria andLogincityNotEqualTo(String value) {
            addCriterion("LoginCity <>", value, "logincity");
            return (Criteria) this;
        }

        public Criteria andLogincityGreaterThan(String value) {
            addCriterion("LoginCity >", value, "logincity");
            return (Criteria) this;
        }

        public Criteria andLogincityGreaterThanOrEqualTo(String value) {
            addCriterion("LoginCity >=", value, "logincity");
            return (Criteria) this;
        }

        public Criteria andLogincityLessThan(String value) {
            addCriterion("LoginCity <", value, "logincity");
            return (Criteria) this;
        }

        public Criteria andLogincityLessThanOrEqualTo(String value) {
            addCriterion("LoginCity <=", value, "logincity");
            return (Criteria) this;
        }

        public Criteria andLogincityLike(String value) {
            addCriterion("LoginCity like", value, "logincity");
            return (Criteria) this;
        }

        public Criteria andLogincityNotLike(String value) {
            addCriterion("LoginCity not like", value, "logincity");
            return (Criteria) this;
        }

        public Criteria andLogincityIn(List<String> values) {
            addCriterion("LoginCity in", values, "logincity");
            return (Criteria) this;
        }

        public Criteria andLogincityNotIn(List<String> values) {
            addCriterion("LoginCity not in", values, "logincity");
            return (Criteria) this;
        }

        public Criteria andLogincityBetween(String value1, String value2) {
            addCriterion("LoginCity between", value1, value2, "logincity");
            return (Criteria) this;
        }

        public Criteria andLogincityNotBetween(String value1, String value2) {
            addCriterion("LoginCity not between", value1, value2, "logincity");
            return (Criteria) this;
        }

        public Criteria andLogindateIsNull() {
            addCriterion("LoginDate is null");
            return (Criteria) this;
        }

        public Criteria andLogindateIsNotNull() {
            addCriterion("LoginDate is not null");
            return (Criteria) this;
        }

        public Criteria andLogindateEqualTo(Date value) {
            addCriterion("LoginDate =", value, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateNotEqualTo(Date value) {
            addCriterion("LoginDate <>", value, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateGreaterThan(Date value) {
            addCriterion("LoginDate >", value, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateGreaterThanOrEqualTo(Date value) {
            addCriterion("LoginDate >=", value, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateLessThan(Date value) {
            addCriterion("LoginDate <", value, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateLessThanOrEqualTo(Date value) {
            addCriterion("LoginDate <=", value, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateIn(List<Date> values) {
            addCriterion("LoginDate in", values, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateNotIn(List<Date> values) {
            addCriterion("LoginDate not in", values, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateBetween(Date value1, Date value2) {
            addCriterion("LoginDate between", value1, value2, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateNotBetween(Date value1, Date value2) {
            addCriterion("LoginDate not between", value1, value2, "logindate");
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