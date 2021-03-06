package com.zyc.travel.model.dto;

import com.zyc.travel.common.page.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JTravelAgencyContactsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public JTravelAgencyContactsExample() {
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

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTravelIdIsNull() {
            addCriterion("travel_id is null");
            return (Criteria) this;
        }

        public Criteria andTravelIdIsNotNull() {
            addCriterion("travel_id is not null");
            return (Criteria) this;
        }

        public Criteria andTravelIdEqualTo(Integer value) {
            addCriterion("travel_id =", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdNotEqualTo(Integer value) {
            addCriterion("travel_id <>", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdGreaterThan(Integer value) {
            addCriterion("travel_id >", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("travel_id >=", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdLessThan(Integer value) {
            addCriterion("travel_id <", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdLessThanOrEqualTo(Integer value) {
            addCriterion("travel_id <=", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdIn(List<Integer> values) {
            addCriterion("travel_id in", values, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdNotIn(List<Integer> values) {
            addCriterion("travel_id not in", values, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdBetween(Integer value1, Integer value2) {
            addCriterion("travel_id between", value1, value2, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("travel_id not between", value1, value2, "travelId");
            return (Criteria) this;
        }

        public Criteria andContactsNameIsNull() {
            addCriterion("contacts_name is null");
            return (Criteria) this;
        }

        public Criteria andContactsNameIsNotNull() {
            addCriterion("contacts_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactsNameEqualTo(String value) {
            addCriterion("contacts_name =", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotEqualTo(String value) {
            addCriterion("contacts_name <>", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameGreaterThan(String value) {
            addCriterion("contacts_name >", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_name >=", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLessThan(String value) {
            addCriterion("contacts_name <", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLessThanOrEqualTo(String value) {
            addCriterion("contacts_name <=", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLike(String value) {
            addCriterion("contacts_name like", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotLike(String value) {
            addCriterion("contacts_name not like", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameIn(List<String> values) {
            addCriterion("contacts_name in", values, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotIn(List<String> values) {
            addCriterion("contacts_name not in", values, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameBetween(String value1, String value2) {
            addCriterion("contacts_name between", value1, value2, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotBetween(String value1, String value2) {
            addCriterion("contacts_name not between", value1, value2, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIsNull() {
            addCriterion("contacts_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIsNotNull() {
            addCriterion("contacts_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneEqualTo(String value) {
            addCriterion("contacts_phone =", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotEqualTo(String value) {
            addCriterion("contacts_phone <>", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneGreaterThan(String value) {
            addCriterion("contacts_phone >", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_phone >=", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLessThan(String value) {
            addCriterion("contacts_phone <", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLessThanOrEqualTo(String value) {
            addCriterion("contacts_phone <=", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLike(String value) {
            addCriterion("contacts_phone like", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotLike(String value) {
            addCriterion("contacts_phone not like", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIn(List<String> values) {
            addCriterion("contacts_phone in", values, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotIn(List<String> values) {
            addCriterion("contacts_phone not in", values, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneBetween(String value1, String value2) {
            addCriterion("contacts_phone between", value1, value2, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotBetween(String value1, String value2) {
            addCriterion("contacts_phone not between", value1, value2, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsWeixinIsNull() {
            addCriterion("contacts_weixin is null");
            return (Criteria) this;
        }

        public Criteria andContactsWeixinIsNotNull() {
            addCriterion("contacts_weixin is not null");
            return (Criteria) this;
        }

        public Criteria andContactsWeixinEqualTo(String value) {
            addCriterion("contacts_weixin =", value, "contactsWeixin");
            return (Criteria) this;
        }

        public Criteria andContactsWeixinNotEqualTo(String value) {
            addCriterion("contacts_weixin <>", value, "contactsWeixin");
            return (Criteria) this;
        }

        public Criteria andContactsWeixinGreaterThan(String value) {
            addCriterion("contacts_weixin >", value, "contactsWeixin");
            return (Criteria) this;
        }

        public Criteria andContactsWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_weixin >=", value, "contactsWeixin");
            return (Criteria) this;
        }

        public Criteria andContactsWeixinLessThan(String value) {
            addCriterion("contacts_weixin <", value, "contactsWeixin");
            return (Criteria) this;
        }

        public Criteria andContactsWeixinLessThanOrEqualTo(String value) {
            addCriterion("contacts_weixin <=", value, "contactsWeixin");
            return (Criteria) this;
        }

        public Criteria andContactsWeixinLike(String value) {
            addCriterion("contacts_weixin like", value, "contactsWeixin");
            return (Criteria) this;
        }

        public Criteria andContactsWeixinNotLike(String value) {
            addCriterion("contacts_weixin not like", value, "contactsWeixin");
            return (Criteria) this;
        }

        public Criteria andContactsWeixinIn(List<String> values) {
            addCriterion("contacts_weixin in", values, "contactsWeixin");
            return (Criteria) this;
        }

        public Criteria andContactsWeixinNotIn(List<String> values) {
            addCriterion("contacts_weixin not in", values, "contactsWeixin");
            return (Criteria) this;
        }

        public Criteria andContactsWeixinBetween(String value1, String value2) {
            addCriterion("contacts_weixin between", value1, value2, "contactsWeixin");
            return (Criteria) this;
        }

        public Criteria andContactsWeixinNotBetween(String value1, String value2) {
            addCriterion("contacts_weixin not between", value1, value2, "contactsWeixin");
            return (Criteria) this;
        }

        public Criteria andContactsQqIsNull() {
            addCriterion("contacts_qq is null");
            return (Criteria) this;
        }

        public Criteria andContactsQqIsNotNull() {
            addCriterion("contacts_qq is not null");
            return (Criteria) this;
        }

        public Criteria andContactsQqEqualTo(String value) {
            addCriterion("contacts_qq =", value, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsQqNotEqualTo(String value) {
            addCriterion("contacts_qq <>", value, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsQqGreaterThan(String value) {
            addCriterion("contacts_qq >", value, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsQqGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_qq >=", value, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsQqLessThan(String value) {
            addCriterion("contacts_qq <", value, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsQqLessThanOrEqualTo(String value) {
            addCriterion("contacts_qq <=", value, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsQqLike(String value) {
            addCriterion("contacts_qq like", value, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsQqNotLike(String value) {
            addCriterion("contacts_qq not like", value, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsQqIn(List<String> values) {
            addCriterion("contacts_qq in", values, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsQqNotIn(List<String> values) {
            addCriterion("contacts_qq not in", values, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsQqBetween(String value1, String value2) {
            addCriterion("contacts_qq between", value1, value2, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsQqNotBetween(String value1, String value2) {
            addCriterion("contacts_qq not between", value1, value2, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsPositionIsNull() {
            addCriterion("contacts_position is null");
            return (Criteria) this;
        }

        public Criteria andContactsPositionIsNotNull() {
            addCriterion("contacts_position is not null");
            return (Criteria) this;
        }

        public Criteria andContactsPositionEqualTo(String value) {
            addCriterion("contacts_position =", value, "contactsPosition");
            return (Criteria) this;
        }

        public Criteria andContactsPositionNotEqualTo(String value) {
            addCriterion("contacts_position <>", value, "contactsPosition");
            return (Criteria) this;
        }

        public Criteria andContactsPositionGreaterThan(String value) {
            addCriterion("contacts_position >", value, "contactsPosition");
            return (Criteria) this;
        }

        public Criteria andContactsPositionGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_position >=", value, "contactsPosition");
            return (Criteria) this;
        }

        public Criteria andContactsPositionLessThan(String value) {
            addCriterion("contacts_position <", value, "contactsPosition");
            return (Criteria) this;
        }

        public Criteria andContactsPositionLessThanOrEqualTo(String value) {
            addCriterion("contacts_position <=", value, "contactsPosition");
            return (Criteria) this;
        }

        public Criteria andContactsPositionLike(String value) {
            addCriterion("contacts_position like", value, "contactsPosition");
            return (Criteria) this;
        }

        public Criteria andContactsPositionNotLike(String value) {
            addCriterion("contacts_position not like", value, "contactsPosition");
            return (Criteria) this;
        }

        public Criteria andContactsPositionIn(List<String> values) {
            addCriterion("contacts_position in", values, "contactsPosition");
            return (Criteria) this;
        }

        public Criteria andContactsPositionNotIn(List<String> values) {
            addCriterion("contacts_position not in", values, "contactsPosition");
            return (Criteria) this;
        }

        public Criteria andContactsPositionBetween(String value1, String value2) {
            addCriterion("contacts_position between", value1, value2, "contactsPosition");
            return (Criteria) this;
        }

        public Criteria andContactsPositionNotBetween(String value1, String value2) {
            addCriterion("contacts_position not between", value1, value2, "contactsPosition");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andContactsNameLikeInsensitive(String value) {
            addCriterion("upper(contacts_name) like", value.toUpperCase(), "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLikeInsensitive(String value) {
            addCriterion("upper(contacts_phone) like", value.toUpperCase(), "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsWeixinLikeInsensitive(String value) {
            addCriterion("upper(contacts_weixin) like", value.toUpperCase(), "contactsWeixin");
            return (Criteria) this;
        }

        public Criteria andContactsQqLikeInsensitive(String value) {
            addCriterion("upper(contacts_qq) like", value.toUpperCase(), "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsPositionLikeInsensitive(String value) {
            addCriterion("upper(contacts_position) like", value.toUpperCase(), "contactsPosition");
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