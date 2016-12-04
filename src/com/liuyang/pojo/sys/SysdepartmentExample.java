package com.liuyang.pojo.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysdepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysdepartmentExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andParentidIsNull() {
            addCriterion("ParentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("ParentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("ParentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("ParentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("ParentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("ParentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("ParentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("ParentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("ParentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("ParentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentId not between", value1, value2, "parentid");
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

        public Criteria andUpdatepersonIsNull() {
            addCriterion("UpdatePerson is null");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonIsNotNull() {
            addCriterion("UpdatePerson is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonEqualTo(String value) {
            addCriterion("UpdatePerson =", value, "updateperson");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonNotEqualTo(String value) {
            addCriterion("UpdatePerson <>", value, "updateperson");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonGreaterThan(String value) {
            addCriterion("UpdatePerson >", value, "updateperson");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonGreaterThanOrEqualTo(String value) {
            addCriterion("UpdatePerson >=", value, "updateperson");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonLessThan(String value) {
            addCriterion("UpdatePerson <", value, "updateperson");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonLessThanOrEqualTo(String value) {
            addCriterion("UpdatePerson <=", value, "updateperson");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonLike(String value) {
            addCriterion("UpdatePerson like", value, "updateperson");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonNotLike(String value) {
            addCriterion("UpdatePerson not like", value, "updateperson");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonIn(List<String> values) {
            addCriterion("UpdatePerson in", values, "updateperson");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonNotIn(List<String> values) {
            addCriterion("UpdatePerson not in", values, "updateperson");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonBetween(String value1, String value2) {
            addCriterion("UpdatePerson between", value1, value2, "updateperson");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonNotBetween(String value1, String value2) {
            addCriterion("UpdatePerson not between", value1, value2, "updateperson");
            return (Criteria) this;
        }

        public Criteria andIsleafIsNull() {
            addCriterion("IsLeaf is null");
            return (Criteria) this;
        }

        public Criteria andIsleafIsNotNull() {
            addCriterion("IsLeaf is not null");
            return (Criteria) this;
        }

        public Criteria andIsleafEqualTo(Byte value) {
            addCriterion("IsLeaf =", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafNotEqualTo(Byte value) {
            addCriterion("IsLeaf <>", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafGreaterThan(Byte value) {
            addCriterion("IsLeaf >", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsLeaf >=", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafLessThan(Byte value) {
            addCriterion("IsLeaf <", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafLessThanOrEqualTo(Byte value) {
            addCriterion("IsLeaf <=", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafIn(List<Byte> values) {
            addCriterion("IsLeaf in", values, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafNotIn(List<Byte> values) {
            addCriterion("IsLeaf not in", values, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafBetween(Byte value1, Byte value2) {
            addCriterion("IsLeaf between", value1, value2, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafNotBetween(Byte value1, Byte value2) {
            addCriterion("IsLeaf not between", value1, value2, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandIsNull() {
            addCriterion("IsAutoExpand is null");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandIsNotNull() {
            addCriterion("IsAutoExpand is not null");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandEqualTo(Byte value) {
            addCriterion("IsAutoExpand =", value, "isautoexpand");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandNotEqualTo(Byte value) {
            addCriterion("IsAutoExpand <>", value, "isautoexpand");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandGreaterThan(Byte value) {
            addCriterion("IsAutoExpand >", value, "isautoexpand");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsAutoExpand >=", value, "isautoexpand");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandLessThan(Byte value) {
            addCriterion("IsAutoExpand <", value, "isautoexpand");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandLessThanOrEqualTo(Byte value) {
            addCriterion("IsAutoExpand <=", value, "isautoexpand");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandIn(List<Byte> values) {
            addCriterion("IsAutoExpand in", values, "isautoexpand");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandNotIn(List<Byte> values) {
            addCriterion("IsAutoExpand not in", values, "isautoexpand");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandBetween(Byte value1, Byte value2) {
            addCriterion("IsAutoExpand between", value1, value2, "isautoexpand");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandNotBetween(Byte value1, Byte value2) {
            addCriterion("IsAutoExpand not between", value1, value2, "isautoexpand");
            return (Criteria) this;
        }

        public Criteria andIconnameIsNull() {
            addCriterion("IconName is null");
            return (Criteria) this;
        }

        public Criteria andIconnameIsNotNull() {
            addCriterion("IconName is not null");
            return (Criteria) this;
        }

        public Criteria andIconnameEqualTo(String value) {
            addCriterion("IconName =", value, "iconname");
            return (Criteria) this;
        }

        public Criteria andIconnameNotEqualTo(String value) {
            addCriterion("IconName <>", value, "iconname");
            return (Criteria) this;
        }

        public Criteria andIconnameGreaterThan(String value) {
            addCriterion("IconName >", value, "iconname");
            return (Criteria) this;
        }

        public Criteria andIconnameGreaterThanOrEqualTo(String value) {
            addCriterion("IconName >=", value, "iconname");
            return (Criteria) this;
        }

        public Criteria andIconnameLessThan(String value) {
            addCriterion("IconName <", value, "iconname");
            return (Criteria) this;
        }

        public Criteria andIconnameLessThanOrEqualTo(String value) {
            addCriterion("IconName <=", value, "iconname");
            return (Criteria) this;
        }

        public Criteria andIconnameLike(String value) {
            addCriterion("IconName like", value, "iconname");
            return (Criteria) this;
        }

        public Criteria andIconnameNotLike(String value) {
            addCriterion("IconName not like", value, "iconname");
            return (Criteria) this;
        }

        public Criteria andIconnameIn(List<String> values) {
            addCriterion("IconName in", values, "iconname");
            return (Criteria) this;
        }

        public Criteria andIconnameNotIn(List<String> values) {
            addCriterion("IconName not in", values, "iconname");
            return (Criteria) this;
        }

        public Criteria andIconnameBetween(String value1, String value2) {
            addCriterion("IconName between", value1, value2, "iconname");
            return (Criteria) this;
        }

        public Criteria andIconnameNotBetween(String value1, String value2) {
            addCriterion("IconName not between", value1, value2, "iconname");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCascadeidIsNull() {
            addCriterion("CascadeId is null");
            return (Criteria) this;
        }

        public Criteria andCascadeidIsNotNull() {
            addCriterion("CascadeId is not null");
            return (Criteria) this;
        }

        public Criteria andCascadeidEqualTo(String value) {
            addCriterion("CascadeId =", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidNotEqualTo(String value) {
            addCriterion("CascadeId <>", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidGreaterThan(String value) {
            addCriterion("CascadeId >", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidGreaterThanOrEqualTo(String value) {
            addCriterion("CascadeId >=", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidLessThan(String value) {
            addCriterion("CascadeId <", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidLessThanOrEqualTo(String value) {
            addCriterion("CascadeId <=", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidLike(String value) {
            addCriterion("CascadeId like", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidNotLike(String value) {
            addCriterion("CascadeId not like", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidIn(List<String> values) {
            addCriterion("CascadeId in", values, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidNotIn(List<String> values) {
            addCriterion("CascadeId not in", values, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidBetween(String value1, String value2) {
            addCriterion("CascadeId between", value1, value2, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidNotBetween(String value1, String value2) {
            addCriterion("CascadeId not between", value1, value2, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andParentnameIsNull() {
            addCriterion("ParentName is null");
            return (Criteria) this;
        }

        public Criteria andParentnameIsNotNull() {
            addCriterion("ParentName is not null");
            return (Criteria) this;
        }

        public Criteria andParentnameEqualTo(String value) {
            addCriterion("ParentName =", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotEqualTo(String value) {
            addCriterion("ParentName <>", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameGreaterThan(String value) {
            addCriterion("ParentName >", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameGreaterThanOrEqualTo(String value) {
            addCriterion("ParentName >=", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameLessThan(String value) {
            addCriterion("ParentName <", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameLessThanOrEqualTo(String value) {
            addCriterion("ParentName <=", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameLike(String value) {
            addCriterion("ParentName like", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotLike(String value) {
            addCriterion("ParentName not like", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameIn(List<String> values) {
            addCriterion("ParentName in", values, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotIn(List<String> values) {
            addCriterion("ParentName not in", values, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameBetween(String value1, String value2) {
            addCriterion("ParentName between", value1, value2, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotBetween(String value1, String value2) {
            addCriterion("ParentName not between", value1, value2, "parentname");
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