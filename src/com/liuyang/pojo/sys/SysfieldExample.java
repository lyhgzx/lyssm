package com.liuyang.pojo.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysfieldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysfieldExample() {
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

        public Criteria andDicKeyIsNull() {
            addCriterion("Dic_Key is null");
            return (Criteria) this;
        }

        public Criteria andDicKeyIsNotNull() {
            addCriterion("Dic_Key is not null");
            return (Criteria) this;
        }

        public Criteria andDicKeyEqualTo(Integer value) {
            addCriterion("Dic_Key =", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyNotEqualTo(Integer value) {
            addCriterion("Dic_Key <>", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyGreaterThan(Integer value) {
            addCriterion("Dic_Key >", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("Dic_Key >=", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyLessThan(Integer value) {
            addCriterion("Dic_Key <", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyLessThanOrEqualTo(Integer value) {
            addCriterion("Dic_Key <=", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyIn(List<Integer> values) {
            addCriterion("Dic_Key in", values, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyNotIn(List<Integer> values) {
            addCriterion("Dic_Key not in", values, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyBetween(Integer value1, Integer value2) {
            addCriterion("Dic_Key between", value1, value2, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("Dic_Key not between", value1, value2, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicNameIsNull() {
            addCriterion("Dic_Name is null");
            return (Criteria) this;
        }

        public Criteria andDicNameIsNotNull() {
            addCriterion("Dic_Name is not null");
            return (Criteria) this;
        }

        public Criteria andDicNameEqualTo(String value) {
            addCriterion("Dic_Name =", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameNotEqualTo(String value) {
            addCriterion("Dic_Name <>", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameGreaterThan(String value) {
            addCriterion("Dic_Name >", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameGreaterThanOrEqualTo(String value) {
            addCriterion("Dic_Name >=", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameLessThan(String value) {
            addCriterion("Dic_Name <", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameLessThanOrEqualTo(String value) {
            addCriterion("Dic_Name <=", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameLike(String value) {
            addCriterion("Dic_Name like", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameNotLike(String value) {
            addCriterion("Dic_Name not like", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameIn(List<String> values) {
            addCriterion("Dic_Name in", values, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameNotIn(List<String> values) {
            addCriterion("Dic_Name not in", values, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameBetween(String value1, String value2) {
            addCriterion("Dic_Name between", value1, value2, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameNotBetween(String value1, String value2) {
            addCriterion("Dic_Name not between", value1, value2, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicTypeIsNull() {
            addCriterion("Dic_Type is null");
            return (Criteria) this;
        }

        public Criteria andDicTypeIsNotNull() {
            addCriterion("Dic_Type is not null");
            return (Criteria) this;
        }

        public Criteria andDicTypeEqualTo(String value) {
            addCriterion("Dic_Type =", value, "dicType");
            return (Criteria) this;
        }

        public Criteria andDicTypeNotEqualTo(String value) {
            addCriterion("Dic_Type <>", value, "dicType");
            return (Criteria) this;
        }

        public Criteria andDicTypeGreaterThan(String value) {
            addCriterion("Dic_Type >", value, "dicType");
            return (Criteria) this;
        }

        public Criteria andDicTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Dic_Type >=", value, "dicType");
            return (Criteria) this;
        }

        public Criteria andDicTypeLessThan(String value) {
            addCriterion("Dic_Type <", value, "dicType");
            return (Criteria) this;
        }

        public Criteria andDicTypeLessThanOrEqualTo(String value) {
            addCriterion("Dic_Type <=", value, "dicType");
            return (Criteria) this;
        }

        public Criteria andDicTypeLike(String value) {
            addCriterion("Dic_Type like", value, "dicType");
            return (Criteria) this;
        }

        public Criteria andDicTypeNotLike(String value) {
            addCriterion("Dic_Type not like", value, "dicType");
            return (Criteria) this;
        }

        public Criteria andDicTypeIn(List<String> values) {
            addCriterion("Dic_Type in", values, "dicType");
            return (Criteria) this;
        }

        public Criteria andDicTypeNotIn(List<String> values) {
            addCriterion("Dic_Type not in", values, "dicType");
            return (Criteria) this;
        }

        public Criteria andDicTypeBetween(String value1, String value2) {
            addCriterion("Dic_Type between", value1, value2, "dicType");
            return (Criteria) this;
        }

        public Criteria andDicTypeNotBetween(String value1, String value2) {
            addCriterion("Dic_Type not between", value1, value2, "dicType");
            return (Criteria) this;
        }

        public Criteria andDicTypenameIsNull() {
            addCriterion("Dic_TypeName is null");
            return (Criteria) this;
        }

        public Criteria andDicTypenameIsNotNull() {
            addCriterion("Dic_TypeName is not null");
            return (Criteria) this;
        }

        public Criteria andDicTypenameEqualTo(String value) {
            addCriterion("Dic_TypeName =", value, "dicTypename");
            return (Criteria) this;
        }

        public Criteria andDicTypenameNotEqualTo(String value) {
            addCriterion("Dic_TypeName <>", value, "dicTypename");
            return (Criteria) this;
        }

        public Criteria andDicTypenameGreaterThan(String value) {
            addCriterion("Dic_TypeName >", value, "dicTypename");
            return (Criteria) this;
        }

        public Criteria andDicTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("Dic_TypeName >=", value, "dicTypename");
            return (Criteria) this;
        }

        public Criteria andDicTypenameLessThan(String value) {
            addCriterion("Dic_TypeName <", value, "dicTypename");
            return (Criteria) this;
        }

        public Criteria andDicTypenameLessThanOrEqualTo(String value) {
            addCriterion("Dic_TypeName <=", value, "dicTypename");
            return (Criteria) this;
        }

        public Criteria andDicTypenameLike(String value) {
            addCriterion("Dic_TypeName like", value, "dicTypename");
            return (Criteria) this;
        }

        public Criteria andDicTypenameNotLike(String value) {
            addCriterion("Dic_TypeName not like", value, "dicTypename");
            return (Criteria) this;
        }

        public Criteria andDicTypenameIn(List<String> values) {
            addCriterion("Dic_TypeName in", values, "dicTypename");
            return (Criteria) this;
        }

        public Criteria andDicTypenameNotIn(List<String> values) {
            addCriterion("Dic_TypeName not in", values, "dicTypename");
            return (Criteria) this;
        }

        public Criteria andDicTypenameBetween(String value1, String value2) {
            addCriterion("Dic_TypeName between", value1, value2, "dicTypename");
            return (Criteria) this;
        }

        public Criteria andDicTypenameNotBetween(String value1, String value2) {
            addCriterion("Dic_TypeName not between", value1, value2, "dicTypename");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("Sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("Sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("Sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("Sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("Sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("Sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("Sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("Sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("Sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("Sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("Sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andRmIsNull() {
            addCriterion("RM is null");
            return (Criteria) this;
        }

        public Criteria andRmIsNotNull() {
            addCriterion("RM is not null");
            return (Criteria) this;
        }

        public Criteria andRmEqualTo(String value) {
            addCriterion("RM =", value, "rm");
            return (Criteria) this;
        }

        public Criteria andRmNotEqualTo(String value) {
            addCriterion("RM <>", value, "rm");
            return (Criteria) this;
        }

        public Criteria andRmGreaterThan(String value) {
            addCriterion("RM >", value, "rm");
            return (Criteria) this;
        }

        public Criteria andRmGreaterThanOrEqualTo(String value) {
            addCriterion("RM >=", value, "rm");
            return (Criteria) this;
        }

        public Criteria andRmLessThan(String value) {
            addCriterion("RM <", value, "rm");
            return (Criteria) this;
        }

        public Criteria andRmLessThanOrEqualTo(String value) {
            addCriterion("RM <=", value, "rm");
            return (Criteria) this;
        }

        public Criteria andRmLike(String value) {
            addCriterion("RM like", value, "rm");
            return (Criteria) this;
        }

        public Criteria andRmNotLike(String value) {
            addCriterion("RM not like", value, "rm");
            return (Criteria) this;
        }

        public Criteria andRmIn(List<String> values) {
            addCriterion("RM in", values, "rm");
            return (Criteria) this;
        }

        public Criteria andRmNotIn(List<String> values) {
            addCriterion("RM not in", values, "rm");
            return (Criteria) this;
        }

        public Criteria andRmBetween(String value1, String value2) {
            addCriterion("RM between", value1, value2, "rm");
            return (Criteria) this;
        }

        public Criteria andRmNotBetween(String value1, String value2) {
            addCriterion("RM not between", value1, value2, "rm");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
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