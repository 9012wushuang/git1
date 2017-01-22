package com.edianzu.cloud.assets.model.data.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssetBasicDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetBasicDataExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAssetStatusIsNull() {
            addCriterion("asset_status is null");
            return (Criteria) this;
        }

        public Criteria andAssetStatusIsNotNull() {
            addCriterion("asset_status is not null");
            return (Criteria) this;
        }

        public Criteria andAssetStatusEqualTo(String value) {
            addCriterion("asset_status =", value, "assetStatus");
            return (Criteria) this;
        }

        public Criteria andAssetStatusNotEqualTo(String value) {
            addCriterion("asset_status <>", value, "assetStatus");
            return (Criteria) this;
        }

        public Criteria andAssetStatusGreaterThan(String value) {
            addCriterion("asset_status >", value, "assetStatus");
            return (Criteria) this;
        }

        public Criteria andAssetStatusGreaterThanOrEqualTo(String value) {
            addCriterion("asset_status >=", value, "assetStatus");
            return (Criteria) this;
        }

        public Criteria andAssetStatusLessThan(String value) {
            addCriterion("asset_status <", value, "assetStatus");
            return (Criteria) this;
        }

        public Criteria andAssetStatusLessThanOrEqualTo(String value) {
            addCriterion("asset_status <=", value, "assetStatus");
            return (Criteria) this;
        }

        public Criteria andAssetStatusLike(String value) {
            addCriterion("asset_status like", value, "assetStatus");
            return (Criteria) this;
        }

        public Criteria andAssetStatusNotLike(String value) {
            addCriterion("asset_status not like", value, "assetStatus");
            return (Criteria) this;
        }

        public Criteria andAssetStatusIn(List<String> values) {
            addCriterion("asset_status in", values, "assetStatus");
            return (Criteria) this;
        }

        public Criteria andAssetStatusNotIn(List<String> values) {
            addCriterion("asset_status not in", values, "assetStatus");
            return (Criteria) this;
        }

        public Criteria andAssetStatusBetween(String value1, String value2) {
            addCriterion("asset_status between", value1, value2, "assetStatus");
            return (Criteria) this;
        }

        public Criteria andAssetStatusNotBetween(String value1, String value2) {
            addCriterion("asset_status not between", value1, value2, "assetStatus");
            return (Criteria) this;
        }

        public Criteria andAssetSourceIsNull() {
            addCriterion("asset_source is null");
            return (Criteria) this;
        }

        public Criteria andAssetSourceIsNotNull() {
            addCriterion("asset_source is not null");
            return (Criteria) this;
        }

        public Criteria andAssetSourceEqualTo(String value) {
            addCriterion("asset_source =", value, "assetSource");
            return (Criteria) this;
        }

        public Criteria andAssetSourceNotEqualTo(String value) {
            addCriterion("asset_source <>", value, "assetSource");
            return (Criteria) this;
        }

        public Criteria andAssetSourceGreaterThan(String value) {
            addCriterion("asset_source >", value, "assetSource");
            return (Criteria) this;
        }

        public Criteria andAssetSourceGreaterThanOrEqualTo(String value) {
            addCriterion("asset_source >=", value, "assetSource");
            return (Criteria) this;
        }

        public Criteria andAssetSourceLessThan(String value) {
            addCriterion("asset_source <", value, "assetSource");
            return (Criteria) this;
        }

        public Criteria andAssetSourceLessThanOrEqualTo(String value) {
            addCriterion("asset_source <=", value, "assetSource");
            return (Criteria) this;
        }

        public Criteria andAssetSourceLike(String value) {
            addCriterion("asset_source like", value, "assetSource");
            return (Criteria) this;
        }

        public Criteria andAssetSourceNotLike(String value) {
            addCriterion("asset_source not like", value, "assetSource");
            return (Criteria) this;
        }

        public Criteria andAssetSourceIn(List<String> values) {
            addCriterion("asset_source in", values, "assetSource");
            return (Criteria) this;
        }

        public Criteria andAssetSourceNotIn(List<String> values) {
            addCriterion("asset_source not in", values, "assetSource");
            return (Criteria) this;
        }

        public Criteria andAssetSourceBetween(String value1, String value2) {
            addCriterion("asset_source between", value1, value2, "assetSource");
            return (Criteria) this;
        }

        public Criteria andAssetSourceNotBetween(String value1, String value2) {
            addCriterion("asset_source not between", value1, value2, "assetSource");
            return (Criteria) this;
        }

        public Criteria andAssetOtherIsNull() {
            addCriterion("asset_other is null");
            return (Criteria) this;
        }

        public Criteria andAssetOtherIsNotNull() {
            addCriterion("asset_other is not null");
            return (Criteria) this;
        }

        public Criteria andAssetOtherEqualTo(String value) {
            addCriterion("asset_other =", value, "assetOther");
            return (Criteria) this;
        }

        public Criteria andAssetOtherNotEqualTo(String value) {
            addCriterion("asset_other <>", value, "assetOther");
            return (Criteria) this;
        }

        public Criteria andAssetOtherGreaterThan(String value) {
            addCriterion("asset_other >", value, "assetOther");
            return (Criteria) this;
        }

        public Criteria andAssetOtherGreaterThanOrEqualTo(String value) {
            addCriterion("asset_other >=", value, "assetOther");
            return (Criteria) this;
        }

        public Criteria andAssetOtherLessThan(String value) {
            addCriterion("asset_other <", value, "assetOther");
            return (Criteria) this;
        }

        public Criteria andAssetOtherLessThanOrEqualTo(String value) {
            addCriterion("asset_other <=", value, "assetOther");
            return (Criteria) this;
        }

        public Criteria andAssetOtherLike(String value) {
            addCriterion("asset_other like", value, "assetOther");
            return (Criteria) this;
        }

        public Criteria andAssetOtherNotLike(String value) {
            addCriterion("asset_other not like", value, "assetOther");
            return (Criteria) this;
        }

        public Criteria andAssetOtherIn(List<String> values) {
            addCriterion("asset_other in", values, "assetOther");
            return (Criteria) this;
        }

        public Criteria andAssetOtherNotIn(List<String> values) {
            addCriterion("asset_other not in", values, "assetOther");
            return (Criteria) this;
        }

        public Criteria andAssetOtherBetween(String value1, String value2) {
            addCriterion("asset_other between", value1, value2, "assetOther");
            return (Criteria) this;
        }

        public Criteria andAssetOtherNotBetween(String value1, String value2) {
            addCriterion("asset_other not between", value1, value2, "assetOther");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Long value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Long value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Long value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Long value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Long> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Long> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Long value1, Long value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andRootCompanyIdIsNull() {
            addCriterion("root_company_id is null");
            return (Criteria) this;
        }

        public Criteria andRootCompanyIdIsNotNull() {
            addCriterion("root_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andRootCompanyIdEqualTo(Long value) {
            addCriterion("root_company_id =", value, "rootCompanyId");
            return (Criteria) this;
        }

        public Criteria andRootCompanyIdNotEqualTo(Long value) {
            addCriterion("root_company_id <>", value, "rootCompanyId");
            return (Criteria) this;
        }

        public Criteria andRootCompanyIdGreaterThan(Long value) {
            addCriterion("root_company_id >", value, "rootCompanyId");
            return (Criteria) this;
        }

        public Criteria andRootCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("root_company_id >=", value, "rootCompanyId");
            return (Criteria) this;
        }

        public Criteria andRootCompanyIdLessThan(Long value) {
            addCriterion("root_company_id <", value, "rootCompanyId");
            return (Criteria) this;
        }

        public Criteria andRootCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("root_company_id <=", value, "rootCompanyId");
            return (Criteria) this;
        }

        public Criteria andRootCompanyIdIn(List<Long> values) {
            addCriterion("root_company_id in", values, "rootCompanyId");
            return (Criteria) this;
        }

        public Criteria andRootCompanyIdNotIn(List<Long> values) {
            addCriterion("root_company_id not in", values, "rootCompanyId");
            return (Criteria) this;
        }

        public Criteria andRootCompanyIdBetween(Long value1, Long value2) {
            addCriterion("root_company_id between", value1, value2, "rootCompanyId");
            return (Criteria) this;
        }

        public Criteria andRootCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("root_company_id not between", value1, value2, "rootCompanyId");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andMonthBeginHandEndIsNull() {
            addCriterion("month_begin_hand_end is null");
            return (Criteria) this;
        }

        public Criteria andMonthBeginHandEndIsNotNull() {
            addCriterion("month_begin_hand_end is not null");
            return (Criteria) this;
        }

        public Criteria andMonthBeginHandEndEqualTo(Integer value) {
            addCriterion("month_begin_hand_end =", value, "monthBeginHandEnd");
            return (Criteria) this;
        }

        public Criteria andMonthBeginHandEndNotEqualTo(Integer value) {
            addCriterion("month_begin_hand_end <>", value, "monthBeginHandEnd");
            return (Criteria) this;
        }

        public Criteria andMonthBeginHandEndGreaterThan(Integer value) {
            addCriterion("month_begin_hand_end >", value, "monthBeginHandEnd");
            return (Criteria) this;
        }

        public Criteria andMonthBeginHandEndGreaterThanOrEqualTo(Integer value) {
            addCriterion("month_begin_hand_end >=", value, "monthBeginHandEnd");
            return (Criteria) this;
        }

        public Criteria andMonthBeginHandEndLessThan(Integer value) {
            addCriterion("month_begin_hand_end <", value, "monthBeginHandEnd");
            return (Criteria) this;
        }

        public Criteria andMonthBeginHandEndLessThanOrEqualTo(Integer value) {
            addCriterion("month_begin_hand_end <=", value, "monthBeginHandEnd");
            return (Criteria) this;
        }

        public Criteria andMonthBeginHandEndIn(List<Integer> values) {
            addCriterion("month_begin_hand_end in", values, "monthBeginHandEnd");
            return (Criteria) this;
        }

        public Criteria andMonthBeginHandEndNotIn(List<Integer> values) {
            addCriterion("month_begin_hand_end not in", values, "monthBeginHandEnd");
            return (Criteria) this;
        }

        public Criteria andMonthBeginHandEndBetween(Integer value1, Integer value2) {
            addCriterion("month_begin_hand_end between", value1, value2, "monthBeginHandEnd");
            return (Criteria) this;
        }

        public Criteria andMonthBeginHandEndNotBetween(Integer value1, Integer value2) {
            addCriterion("month_begin_hand_end not between", value1, value2, "monthBeginHandEnd");
            return (Criteria) this;
        }

        public Criteria andCdateIsNull() {
            addCriterion("cdate is null");
            return (Criteria) this;
        }

        public Criteria andCdateIsNotNull() {
            addCriterion("cdate is not null");
            return (Criteria) this;
        }

        public Criteria andCdateEqualTo(Date value) {
            addCriterion("cdate =", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotEqualTo(Date value) {
            addCriterion("cdate <>", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateGreaterThan(Date value) {
            addCriterion("cdate >", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateGreaterThanOrEqualTo(Date value) {
            addCriterion("cdate >=", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateLessThan(Date value) {
            addCriterion("cdate <", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateLessThanOrEqualTo(Date value) {
            addCriterion("cdate <=", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateIn(List<Date> values) {
            addCriterion("cdate in", values, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotIn(List<Date> values) {
            addCriterion("cdate not in", values, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateBetween(Date value1, Date value2) {
            addCriterion("cdate between", value1, value2, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotBetween(Date value1, Date value2) {
            addCriterion("cdate not between", value1, value2, "cdate");
            return (Criteria) this;
        }

        public Criteria andMdateIsNull() {
            addCriterion("mdate is null");
            return (Criteria) this;
        }

        public Criteria andMdateIsNotNull() {
            addCriterion("mdate is not null");
            return (Criteria) this;
        }

        public Criteria andMdateEqualTo(Date value) {
            addCriterion("mdate =", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateNotEqualTo(Date value) {
            addCriterion("mdate <>", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateGreaterThan(Date value) {
            addCriterion("mdate >", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateGreaterThanOrEqualTo(Date value) {
            addCriterion("mdate >=", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateLessThan(Date value) {
            addCriterion("mdate <", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateLessThanOrEqualTo(Date value) {
            addCriterion("mdate <=", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateIn(List<Date> values) {
            addCriterion("mdate in", values, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateNotIn(List<Date> values) {
            addCriterion("mdate not in", values, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateBetween(Date value1, Date value2) {
            addCriterion("mdate between", value1, value2, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateNotBetween(Date value1, Date value2) {
            addCriterion("mdate not between", value1, value2, "mdate");
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