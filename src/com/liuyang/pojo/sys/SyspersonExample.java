package com.liuyang.pojo.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SyspersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyspersonExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMynameIsNull() {
            addCriterion("MyName is null");
            return (Criteria) this;
        }

        public Criteria andMynameIsNotNull() {
            addCriterion("MyName is not null");
            return (Criteria) this;
        }

        public Criteria andMynameEqualTo(String value) {
            addCriterion("MyName =", value, "myname");
            return (Criteria) this;
        }

        public Criteria andMynameNotEqualTo(String value) {
            addCriterion("MyName <>", value, "myname");
            return (Criteria) this;
        }

        public Criteria andMynameGreaterThan(String value) {
            addCriterion("MyName >", value, "myname");
            return (Criteria) this;
        }

        public Criteria andMynameGreaterThanOrEqualTo(String value) {
            addCriterion("MyName >=", value, "myname");
            return (Criteria) this;
        }

        public Criteria andMynameLessThan(String value) {
            addCriterion("MyName <", value, "myname");
            return (Criteria) this;
        }

        public Criteria andMynameLessThanOrEqualTo(String value) {
            addCriterion("MyName <=", value, "myname");
            return (Criteria) this;
        }

        public Criteria andMynameLike(String value) {
            addCriterion("MyName like", value, "myname");
            return (Criteria) this;
        }

        public Criteria andMynameNotLike(String value) {
            addCriterion("MyName not like", value, "myname");
            return (Criteria) this;
        }

        public Criteria andMynameIn(List<String> values) {
            addCriterion("MyName in", values, "myname");
            return (Criteria) this;
        }

        public Criteria andMynameNotIn(List<String> values) {
            addCriterion("MyName not in", values, "myname");
            return (Criteria) this;
        }

        public Criteria andMynameBetween(String value1, String value2) {
            addCriterion("MyName between", value1, value2, "myname");
            return (Criteria) this;
        }

        public Criteria andMynameNotBetween(String value1, String value2) {
            addCriterion("MyName not between", value1, value2, "myname");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andSurepasswordIsNull() {
            addCriterion("SurePassword is null");
            return (Criteria) this;
        }

        public Criteria andSurepasswordIsNotNull() {
            addCriterion("SurePassword is not null");
            return (Criteria) this;
        }

        public Criteria andSurepasswordEqualTo(String value) {
            addCriterion("SurePassword =", value, "surepassword");
            return (Criteria) this;
        }

        public Criteria andSurepasswordNotEqualTo(String value) {
            addCriterion("SurePassword <>", value, "surepassword");
            return (Criteria) this;
        }

        public Criteria andSurepasswordGreaterThan(String value) {
            addCriterion("SurePassword >", value, "surepassword");
            return (Criteria) this;
        }

        public Criteria andSurepasswordGreaterThanOrEqualTo(String value) {
            addCriterion("SurePassword >=", value, "surepassword");
            return (Criteria) this;
        }

        public Criteria andSurepasswordLessThan(String value) {
            addCriterion("SurePassword <", value, "surepassword");
            return (Criteria) this;
        }

        public Criteria andSurepasswordLessThanOrEqualTo(String value) {
            addCriterion("SurePassword <=", value, "surepassword");
            return (Criteria) this;
        }

        public Criteria andSurepasswordLike(String value) {
            addCriterion("SurePassword like", value, "surepassword");
            return (Criteria) this;
        }

        public Criteria andSurepasswordNotLike(String value) {
            addCriterion("SurePassword not like", value, "surepassword");
            return (Criteria) this;
        }

        public Criteria andSurepasswordIn(List<String> values) {
            addCriterion("SurePassword in", values, "surepassword");
            return (Criteria) this;
        }

        public Criteria andSurepasswordNotIn(List<String> values) {
            addCriterion("SurePassword not in", values, "surepassword");
            return (Criteria) this;
        }

        public Criteria andSurepasswordBetween(String value1, String value2) {
            addCriterion("SurePassword between", value1, value2, "surepassword");
            return (Criteria) this;
        }

        public Criteria andSurepasswordNotBetween(String value1, String value2) {
            addCriterion("SurePassword not between", value1, value2, "surepassword");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("Sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("Sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("Sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("Sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("Sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("Sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("Sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("Sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("Sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("Sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("Sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSysdepartmentidIsNull() {
            addCriterion("SysDepartmentId is null");
            return (Criteria) this;
        }

        public Criteria andSysdepartmentidIsNotNull() {
            addCriterion("SysDepartmentId is not null");
            return (Criteria) this;
        }

        public Criteria andSysdepartmentidEqualTo(String value) {
            addCriterion("SysDepartmentId =", value, "sysdepartmentid");
            return (Criteria) this;
        }

        public Criteria andSysdepartmentidNotEqualTo(String value) {
            addCriterion("SysDepartmentId <>", value, "sysdepartmentid");
            return (Criteria) this;
        }

        public Criteria andSysdepartmentidGreaterThan(String value) {
            addCriterion("SysDepartmentId >", value, "sysdepartmentid");
            return (Criteria) this;
        }

        public Criteria andSysdepartmentidGreaterThanOrEqualTo(String value) {
            addCriterion("SysDepartmentId >=", value, "sysdepartmentid");
            return (Criteria) this;
        }

        public Criteria andSysdepartmentidLessThan(String value) {
            addCriterion("SysDepartmentId <", value, "sysdepartmentid");
            return (Criteria) this;
        }

        public Criteria andSysdepartmentidLessThanOrEqualTo(String value) {
            addCriterion("SysDepartmentId <=", value, "sysdepartmentid");
            return (Criteria) this;
        }

        public Criteria andSysdepartmentidLike(String value) {
            addCriterion("SysDepartmentId like", value, "sysdepartmentid");
            return (Criteria) this;
        }

        public Criteria andSysdepartmentidNotLike(String value) {
            addCriterion("SysDepartmentId not like", value, "sysdepartmentid");
            return (Criteria) this;
        }

        public Criteria andSysdepartmentidIn(List<String> values) {
            addCriterion("SysDepartmentId in", values, "sysdepartmentid");
            return (Criteria) this;
        }

        public Criteria andSysdepartmentidNotIn(List<String> values) {
            addCriterion("SysDepartmentId not in", values, "sysdepartmentid");
            return (Criteria) this;
        }

        public Criteria andSysdepartmentidBetween(String value1, String value2) {
            addCriterion("SysDepartmentId between", value1, value2, "sysdepartmentid");
            return (Criteria) this;
        }

        public Criteria andSysdepartmentidNotBetween(String value1, String value2) {
            addCriterion("SysDepartmentId not between", value1, value2, "sysdepartmentid");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("Position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("Position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("Position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("Position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("Position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("Position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("Position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("Position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("Position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("Position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("Position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("Position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("Position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("Position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andMobilephonenumberIsNull() {
            addCriterion("MobilePhoneNumber is null");
            return (Criteria) this;
        }

        public Criteria andMobilephonenumberIsNotNull() {
            addCriterion("MobilePhoneNumber is not null");
            return (Criteria) this;
        }

        public Criteria andMobilephonenumberEqualTo(String value) {
            addCriterion("MobilePhoneNumber =", value, "mobilephonenumber");
            return (Criteria) this;
        }

        public Criteria andMobilephonenumberNotEqualTo(String value) {
            addCriterion("MobilePhoneNumber <>", value, "mobilephonenumber");
            return (Criteria) this;
        }

        public Criteria andMobilephonenumberGreaterThan(String value) {
            addCriterion("MobilePhoneNumber >", value, "mobilephonenumber");
            return (Criteria) this;
        }

        public Criteria andMobilephonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("MobilePhoneNumber >=", value, "mobilephonenumber");
            return (Criteria) this;
        }

        public Criteria andMobilephonenumberLessThan(String value) {
            addCriterion("MobilePhoneNumber <", value, "mobilephonenumber");
            return (Criteria) this;
        }

        public Criteria andMobilephonenumberLessThanOrEqualTo(String value) {
            addCriterion("MobilePhoneNumber <=", value, "mobilephonenumber");
            return (Criteria) this;
        }

        public Criteria andMobilephonenumberLike(String value) {
            addCriterion("MobilePhoneNumber like", value, "mobilephonenumber");
            return (Criteria) this;
        }

        public Criteria andMobilephonenumberNotLike(String value) {
            addCriterion("MobilePhoneNumber not like", value, "mobilephonenumber");
            return (Criteria) this;
        }

        public Criteria andMobilephonenumberIn(List<String> values) {
            addCriterion("MobilePhoneNumber in", values, "mobilephonenumber");
            return (Criteria) this;
        }

        public Criteria andMobilephonenumberNotIn(List<String> values) {
            addCriterion("MobilePhoneNumber not in", values, "mobilephonenumber");
            return (Criteria) this;
        }

        public Criteria andMobilephonenumberBetween(String value1, String value2) {
            addCriterion("MobilePhoneNumber between", value1, value2, "mobilephonenumber");
            return (Criteria) this;
        }

        public Criteria andMobilephonenumberNotBetween(String value1, String value2) {
            addCriterion("MobilePhoneNumber not between", value1, value2, "mobilephonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNull() {
            addCriterion("PhoneNumber is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNotNull() {
            addCriterion("PhoneNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberEqualTo(String value) {
            addCriterion("PhoneNumber =", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotEqualTo(String value) {
            addCriterion("PhoneNumber <>", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThan(String value) {
            addCriterion("PhoneNumber >", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("PhoneNumber >=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThan(String value) {
            addCriterion("PhoneNumber <", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("PhoneNumber <=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLike(String value) {
            addCriterion("PhoneNumber like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotLike(String value) {
            addCriterion("PhoneNumber not like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIn(List<String> values) {
            addCriterion("PhoneNumber in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotIn(List<String> values) {
            addCriterion("PhoneNumber not in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberBetween(String value1, String value2) {
            addCriterion("PhoneNumber between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotBetween(String value1, String value2) {
            addCriterion("PhoneNumber not between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("Province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("Province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("Province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("Province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("Province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("Province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("Province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("Province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("Province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("Province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("Province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("Province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("Province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("Province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("City is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("City is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("City =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("City <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("City >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("City >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("City <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("City <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("City like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("City not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("City in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("City not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("City between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("City not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andVillageIsNull() {
            addCriterion("Village is null");
            return (Criteria) this;
        }

        public Criteria andVillageIsNotNull() {
            addCriterion("Village is not null");
            return (Criteria) this;
        }

        public Criteria andVillageEqualTo(String value) {
            addCriterion("Village =", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageNotEqualTo(String value) {
            addCriterion("Village <>", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageGreaterThan(String value) {
            addCriterion("Village >", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageGreaterThanOrEqualTo(String value) {
            addCriterion("Village >=", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageLessThan(String value) {
            addCriterion("Village <", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageLessThanOrEqualTo(String value) {
            addCriterion("Village <=", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageLike(String value) {
            addCriterion("Village like", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageNotLike(String value) {
            addCriterion("Village not like", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageIn(List<String> values) {
            addCriterion("Village in", values, "village");
            return (Criteria) this;
        }

        public Criteria andVillageNotIn(List<String> values) {
            addCriterion("Village not in", values, "village");
            return (Criteria) this;
        }

        public Criteria andVillageBetween(String value1, String value2) {
            addCriterion("Village between", value1, value2, "village");
            return (Criteria) this;
        }

        public Criteria andVillageNotBetween(String value1, String value2) {
            addCriterion("Village not between", value1, value2, "village");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andEmailaddressIsNull() {
            addCriterion("EmailAddress is null");
            return (Criteria) this;
        }

        public Criteria andEmailaddressIsNotNull() {
            addCriterion("EmailAddress is not null");
            return (Criteria) this;
        }

        public Criteria andEmailaddressEqualTo(String value) {
            addCriterion("EmailAddress =", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressNotEqualTo(String value) {
            addCriterion("EmailAddress <>", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressGreaterThan(String value) {
            addCriterion("EmailAddress >", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressGreaterThanOrEqualTo(String value) {
            addCriterion("EmailAddress >=", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressLessThan(String value) {
            addCriterion("EmailAddress <", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressLessThanOrEqualTo(String value) {
            addCriterion("EmailAddress <=", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressLike(String value) {
            addCriterion("EmailAddress like", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressNotLike(String value) {
            addCriterion("EmailAddress not like", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressIn(List<String> values) {
            addCriterion("EmailAddress in", values, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressNotIn(List<String> values) {
            addCriterion("EmailAddress not in", values, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressBetween(String value1, String value2) {
            addCriterion("EmailAddress between", value1, value2, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressNotBetween(String value1, String value2) {
            addCriterion("EmailAddress not between", value1, value2, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("State not between", value1, value2, "state");
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

        public Criteria andCreatepersonIsNull() {
            addCriterion("CreatePerson is null");
            return (Criteria) this;
        }

        public Criteria andCreatepersonIsNotNull() {
            addCriterion("CreatePerson is not null");
            return (Criteria) this;
        }

        public Criteria andCreatepersonEqualTo(String value) {
            addCriterion("CreatePerson =", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotEqualTo(String value) {
            addCriterion("CreatePerson <>", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonGreaterThan(String value) {
            addCriterion("CreatePerson >", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonGreaterThanOrEqualTo(String value) {
            addCriterion("CreatePerson >=", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonLessThan(String value) {
            addCriterion("CreatePerson <", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonLessThanOrEqualTo(String value) {
            addCriterion("CreatePerson <=", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonLike(String value) {
            addCriterion("CreatePerson like", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotLike(String value) {
            addCriterion("CreatePerson not like", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonIn(List<String> values) {
            addCriterion("CreatePerson in", values, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotIn(List<String> values) {
            addCriterion("CreatePerson not in", values, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonBetween(String value1, String value2) {
            addCriterion("CreatePerson between", value1, value2, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotBetween(String value1, String value2) {
            addCriterion("CreatePerson not between", value1, value2, "createperson");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andLogonnumIsNull() {
            addCriterion("LogonNum is null");
            return (Criteria) this;
        }

        public Criteria andLogonnumIsNotNull() {
            addCriterion("LogonNum is not null");
            return (Criteria) this;
        }

        public Criteria andLogonnumEqualTo(Integer value) {
            addCriterion("LogonNum =", value, "logonnum");
            return (Criteria) this;
        }

        public Criteria andLogonnumNotEqualTo(Integer value) {
            addCriterion("LogonNum <>", value, "logonnum");
            return (Criteria) this;
        }

        public Criteria andLogonnumGreaterThan(Integer value) {
            addCriterion("LogonNum >", value, "logonnum");
            return (Criteria) this;
        }

        public Criteria andLogonnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("LogonNum >=", value, "logonnum");
            return (Criteria) this;
        }

        public Criteria andLogonnumLessThan(Integer value) {
            addCriterion("LogonNum <", value, "logonnum");
            return (Criteria) this;
        }

        public Criteria andLogonnumLessThanOrEqualTo(Integer value) {
            addCriterion("LogonNum <=", value, "logonnum");
            return (Criteria) this;
        }

        public Criteria andLogonnumIn(List<Integer> values) {
            addCriterion("LogonNum in", values, "logonnum");
            return (Criteria) this;
        }

        public Criteria andLogonnumNotIn(List<Integer> values) {
            addCriterion("LogonNum not in", values, "logonnum");
            return (Criteria) this;
        }

        public Criteria andLogonnumBetween(Integer value1, Integer value2) {
            addCriterion("LogonNum between", value1, value2, "logonnum");
            return (Criteria) this;
        }

        public Criteria andLogonnumNotBetween(Integer value1, Integer value2) {
            addCriterion("LogonNum not between", value1, value2, "logonnum");
            return (Criteria) this;
        }

        public Criteria andLastlogontimeIsNull() {
            addCriterion("LastLogonTime is null");
            return (Criteria) this;
        }

        public Criteria andLastlogontimeIsNotNull() {
            addCriterion("LastLogonTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogontimeEqualTo(Date value) {
            addCriterion("LastLogonTime =", value, "lastlogontime");
            return (Criteria) this;
        }

        public Criteria andLastlogontimeNotEqualTo(Date value) {
            addCriterion("LastLogonTime <>", value, "lastlogontime");
            return (Criteria) this;
        }

        public Criteria andLastlogontimeGreaterThan(Date value) {
            addCriterion("LastLogonTime >", value, "lastlogontime");
            return (Criteria) this;
        }

        public Criteria andLastlogontimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastLogonTime >=", value, "lastlogontime");
            return (Criteria) this;
        }

        public Criteria andLastlogontimeLessThan(Date value) {
            addCriterion("LastLogonTime <", value, "lastlogontime");
            return (Criteria) this;
        }

        public Criteria andLastlogontimeLessThanOrEqualTo(Date value) {
            addCriterion("LastLogonTime <=", value, "lastlogontime");
            return (Criteria) this;
        }

        public Criteria andLastlogontimeIn(List<Date> values) {
            addCriterion("LastLogonTime in", values, "lastlogontime");
            return (Criteria) this;
        }

        public Criteria andLastlogontimeNotIn(List<Date> values) {
            addCriterion("LastLogonTime not in", values, "lastlogontime");
            return (Criteria) this;
        }

        public Criteria andLastlogontimeBetween(Date value1, Date value2) {
            addCriterion("LastLogonTime between", value1, value2, "lastlogontime");
            return (Criteria) this;
        }

        public Criteria andLastlogontimeNotBetween(Date value1, Date value2) {
            addCriterion("LastLogonTime not between", value1, value2, "lastlogontime");
            return (Criteria) this;
        }

        public Criteria andLastlogonipIsNull() {
            addCriterion("LastLogonIP is null");
            return (Criteria) this;
        }

        public Criteria andLastlogonipIsNotNull() {
            addCriterion("LastLogonIP is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogonipEqualTo(String value) {
            addCriterion("LastLogonIP =", value, "lastlogonip");
            return (Criteria) this;
        }

        public Criteria andLastlogonipNotEqualTo(String value) {
            addCriterion("LastLogonIP <>", value, "lastlogonip");
            return (Criteria) this;
        }

        public Criteria andLastlogonipGreaterThan(String value) {
            addCriterion("LastLogonIP >", value, "lastlogonip");
            return (Criteria) this;
        }

        public Criteria andLastlogonipGreaterThanOrEqualTo(String value) {
            addCriterion("LastLogonIP >=", value, "lastlogonip");
            return (Criteria) this;
        }

        public Criteria andLastlogonipLessThan(String value) {
            addCriterion("LastLogonIP <", value, "lastlogonip");
            return (Criteria) this;
        }

        public Criteria andLastlogonipLessThanOrEqualTo(String value) {
            addCriterion("LastLogonIP <=", value, "lastlogonip");
            return (Criteria) this;
        }

        public Criteria andLastlogonipLike(String value) {
            addCriterion("LastLogonIP like", value, "lastlogonip");
            return (Criteria) this;
        }

        public Criteria andLastlogonipNotLike(String value) {
            addCriterion("LastLogonIP not like", value, "lastlogonip");
            return (Criteria) this;
        }

        public Criteria andLastlogonipIn(List<String> values) {
            addCriterion("LastLogonIP in", values, "lastlogonip");
            return (Criteria) this;
        }

        public Criteria andLastlogonipNotIn(List<String> values) {
            addCriterion("LastLogonIP not in", values, "lastlogonip");
            return (Criteria) this;
        }

        public Criteria andLastlogonipBetween(String value1, String value2) {
            addCriterion("LastLogonIP between", value1, value2, "lastlogonip");
            return (Criteria) this;
        }

        public Criteria andLastlogonipNotBetween(String value1, String value2) {
            addCriterion("LastLogonIP not between", value1, value2, "lastlogonip");
            return (Criteria) this;
        }

        public Criteria andHdpicIsNull() {
            addCriterion("HDpic is null");
            return (Criteria) this;
        }

        public Criteria andHdpicIsNotNull() {
            addCriterion("HDpic is not null");
            return (Criteria) this;
        }

        public Criteria andHdpicEqualTo(String value) {
            addCriterion("HDpic =", value, "hdpic");
            return (Criteria) this;
        }

        public Criteria andHdpicNotEqualTo(String value) {
            addCriterion("HDpic <>", value, "hdpic");
            return (Criteria) this;
        }

        public Criteria andHdpicGreaterThan(String value) {
            addCriterion("HDpic >", value, "hdpic");
            return (Criteria) this;
        }

        public Criteria andHdpicGreaterThanOrEqualTo(String value) {
            addCriterion("HDpic >=", value, "hdpic");
            return (Criteria) this;
        }

        public Criteria andHdpicLessThan(String value) {
            addCriterion("HDpic <", value, "hdpic");
            return (Criteria) this;
        }

        public Criteria andHdpicLessThanOrEqualTo(String value) {
            addCriterion("HDpic <=", value, "hdpic");
            return (Criteria) this;
        }

        public Criteria andHdpicLike(String value) {
            addCriterion("HDpic like", value, "hdpic");
            return (Criteria) this;
        }

        public Criteria andHdpicNotLike(String value) {
            addCriterion("HDpic not like", value, "hdpic");
            return (Criteria) this;
        }

        public Criteria andHdpicIn(List<String> values) {
            addCriterion("HDpic in", values, "hdpic");
            return (Criteria) this;
        }

        public Criteria andHdpicNotIn(List<String> values) {
            addCriterion("HDpic not in", values, "hdpic");
            return (Criteria) this;
        }

        public Criteria andHdpicBetween(String value1, String value2) {
            addCriterion("HDpic between", value1, value2, "hdpic");
            return (Criteria) this;
        }

        public Criteria andHdpicNotBetween(String value1, String value2) {
            addCriterion("HDpic not between", value1, value2, "hdpic");
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