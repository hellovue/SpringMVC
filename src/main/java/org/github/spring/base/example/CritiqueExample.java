//*****************************************************************************
// The file is automatically generated by the program, do not manually modify. 
//*****************************************************************************

package org.github.spring.base.example;

import java.util.ArrayList;
import java.util.List;

public class CritiqueExample {
  protected String orderByClause;

  protected boolean distinct;

  protected List<Criteria> oredCriteria;

  public CritiqueExample() {
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
    Criteria criteria = new Criteria(this);
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

    public Criteria andIdEqualTo(Integer value) {
      if(value != null) addCriterion("id =", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotEqualTo(Integer value) {
      if(value != null) addCriterion("id <>", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdGreaterThan(Integer value) {
      if(value != null) addCriterion("id >", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdGreaterThanOrEqualTo(Integer value) {
      if(value != null) addCriterion("id >=", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdLessThan(Integer value) {
      if(value != null) addCriterion("id <", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdLessThanOrEqualTo(Integer value) {
      if(value != null) addCriterion("id <=", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdIn(List<Integer> values) {
      if (values != null && ! values.isEmpty()) addCriterion("id in", values, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotIn(List<Integer> values) {
      if (values != null && ! values.isEmpty()) addCriterion("id not in", values, "id");
      return (Criteria) this;
    }

    public Criteria andIdBetween(Integer head, Integer tail) {
      if(head != null && tail != null) addCriterion("id between", head, tail, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotBetween(Integer head, Integer tail) {
      if(head != null && tail != null) addCriterion("id not between", head, tail, "id");
      return (Criteria) this;
    }

    public Criteria andArticleIdIsNull() {
      addCriterion("article_id is null");
      return (Criteria) this;
    }

    public Criteria andArticleIdIsNotNull() {
      addCriterion("article_id is not null");
      return (Criteria) this;
    }

    public Criteria andArticleIdEqualTo(Integer value) {
      if(value != null) addCriterion("article_id =", value, "articleId");
      return (Criteria) this;
    }

    public Criteria andArticleIdNotEqualTo(Integer value) {
      if(value != null) addCriterion("article_id <>", value, "articleId");
      return (Criteria) this;
    }

    public Criteria andArticleIdGreaterThan(Integer value) {
      if(value != null) addCriterion("article_id >", value, "articleId");
      return (Criteria) this;
    }

    public Criteria andArticleIdGreaterThanOrEqualTo(Integer value) {
      if(value != null) addCriterion("article_id >=", value, "articleId");
      return (Criteria) this;
    }

    public Criteria andArticleIdLessThan(Integer value) {
      if(value != null) addCriterion("article_id <", value, "articleId");
      return (Criteria) this;
    }

    public Criteria andArticleIdLessThanOrEqualTo(Integer value) {
      if(value != null) addCriterion("article_id <=", value, "articleId");
      return (Criteria) this;
    }

    public Criteria andArticleIdIn(List<Integer> values) {
      if (values != null && ! values.isEmpty()) addCriterion("article_id in", values, "articleId");
      return (Criteria) this;
    }

    public Criteria andArticleIdNotIn(List<Integer> values) {
      if (values != null && ! values.isEmpty()) addCriterion("article_id not in", values, "articleId");
      return (Criteria) this;
    }

    public Criteria andArticleIdBetween(Integer head, Integer tail) {
      if(head != null && tail != null) addCriterion("article_id between", head, tail, "articleId");
      return (Criteria) this;
    }

    public Criteria andArticleIdNotBetween(Integer head, Integer tail) {
      if(head != null && tail != null) addCriterion("article_id not between", head, tail, "articleId");
      return (Criteria) this;
    }

    public Criteria andContentIsNull() {
      addCriterion("content is null");
      return (Criteria) this;
    }

    public Criteria andContentIsNotNull() {
      addCriterion("content is not null");
      return (Criteria) this;
    }

    public Criteria andContentEqualTo(String value) {
      if(value != null) addCriterion("content =", value, "content");
      return (Criteria) this;
    }

    public Criteria andContentNotEqualTo(String value) {
      if(value != null) addCriterion("content <>", value, "content");
      return (Criteria) this;
    }

    public Criteria andContentGreaterThan(String value) {
      if(value != null) addCriterion("content >", value, "content");
      return (Criteria) this;
    }

    public Criteria andContentGreaterThanOrEqualTo(String value) {
      if(value != null) addCriterion("content >=", value, "content");
      return (Criteria) this;
    }

    public Criteria andContentLessThan(String value) {
      if(value != null) addCriterion("content <", value, "content");
      return (Criteria) this;
    }

    public Criteria andContentLessThanOrEqualTo(String value) {
      if(value != null) addCriterion("content <=", value, "content");
      return (Criteria) this;
    }

    public Criteria andContentLike(String value) {
      if(value != null) addCriterion("content like", value, "content");
      return (Criteria) this;
    }

    public Criteria andContentNotLike(String value) {
      if(value != null) addCriterion("content not like", value, "content");
      return (Criteria) this;
    }

    public Criteria andContentIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("content in", values, "content");
      return (Criteria) this;
    }

    public Criteria andContentNotIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("content not in", values, "content");
      return (Criteria) this;
    }

    public Criteria andContentBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("content between", head, tail, "content");
      return (Criteria) this;
    }

    public Criteria andContentNotBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("content not between", head, tail, "content");
      return (Criteria) this;
    }

    public Criteria andNameIsNull() {
      addCriterion("`name` is null");
      return (Criteria) this;
    }

    public Criteria andNameIsNotNull() {
      addCriterion("`name` is not null");
      return (Criteria) this;
    }

    public Criteria andNameEqualTo(String value) {
      if(value != null) addCriterion("`name` =", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameNotEqualTo(String value) {
      if(value != null) addCriterion("`name` <>", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameGreaterThan(String value) {
      if(value != null) addCriterion("`name` >", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameGreaterThanOrEqualTo(String value) {
      if(value != null) addCriterion("`name` >=", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameLessThan(String value) {
      if(value != null) addCriterion("`name` <", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameLessThanOrEqualTo(String value) {
      if(value != null) addCriterion("`name` <=", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameLike(String value) {
      if(value != null) addCriterion("`name` like", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameNotLike(String value) {
      if(value != null) addCriterion("`name` not like", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("`name` in", values, "name");
      return (Criteria) this;
    }

    public Criteria andNameNotIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("`name` not in", values, "name");
      return (Criteria) this;
    }

    public Criteria andNameBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("`name` between", head, tail, "name");
      return (Criteria) this;
    }

    public Criteria andNameNotBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("`name` not between", head, tail, "name");
      return (Criteria) this;
    }

    public Criteria andTimeIsNull() {
      addCriterion("`time` is null");
      return (Criteria) this;
    }

    public Criteria andTimeIsNotNull() {
      addCriterion("`time` is not null");
      return (Criteria) this;
    }

    public Criteria andTimeEqualTo(String value) {
      if(value != null) addCriterion("`time` =", value, "time");
      return (Criteria) this;
    }

    public Criteria andTimeNotEqualTo(String value) {
      if(value != null) addCriterion("`time` <>", value, "time");
      return (Criteria) this;
    }

    public Criteria andTimeGreaterThan(String value) {
      if(value != null) addCriterion("`time` >", value, "time");
      return (Criteria) this;
    }

    public Criteria andTimeGreaterThanOrEqualTo(String value) {
      if(value != null) addCriterion("`time` >=", value, "time");
      return (Criteria) this;
    }

    public Criteria andTimeLessThan(String value) {
      if(value != null) addCriterion("`time` <", value, "time");
      return (Criteria) this;
    }

    public Criteria andTimeLessThanOrEqualTo(String value) {
      if(value != null) addCriterion("`time` <=", value, "time");
      return (Criteria) this;
    }

    public Criteria andTimeLike(String value) {
      if(value != null) addCriterion("`time` like", value, "time");
      return (Criteria) this;
    }

    public Criteria andTimeNotLike(String value) {
      if(value != null) addCriterion("`time` not like", value, "time");
      return (Criteria) this;
    }

    public Criteria andTimeIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("`time` in", values, "time");
      return (Criteria) this;
    }

    public Criteria andTimeNotIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("`time` not in", values, "time");
      return (Criteria) this;
    }

    public Criteria andTimeBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("`time` between", head, tail, "time");
      return (Criteria) this;
    }

    public Criteria andTimeNotBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("`time` not between", head, tail, "time");
      return (Criteria) this;
    }

    public Criteria andPhotoIsNull() {
      addCriterion("photo is null");
      return (Criteria) this;
    }

    public Criteria andPhotoIsNotNull() {
      addCriterion("photo is not null");
      return (Criteria) this;
    }

    public Criteria andPhotoEqualTo(String value) {
      if(value != null) addCriterion("photo =", value, "photo");
      return (Criteria) this;
    }

    public Criteria andPhotoNotEqualTo(String value) {
      if(value != null) addCriterion("photo <>", value, "photo");
      return (Criteria) this;
    }

    public Criteria andPhotoGreaterThan(String value) {
      if(value != null) addCriterion("photo >", value, "photo");
      return (Criteria) this;
    }

    public Criteria andPhotoGreaterThanOrEqualTo(String value) {
      if(value != null) addCriterion("photo >=", value, "photo");
      return (Criteria) this;
    }

    public Criteria andPhotoLessThan(String value) {
      if(value != null) addCriterion("photo <", value, "photo");
      return (Criteria) this;
    }

    public Criteria andPhotoLessThanOrEqualTo(String value) {
      if(value != null) addCriterion("photo <=", value, "photo");
      return (Criteria) this;
    }

    public Criteria andPhotoLike(String value) {
      if(value != null) addCriterion("photo like", value, "photo");
      return (Criteria) this;
    }

    public Criteria andPhotoNotLike(String value) {
      if(value != null) addCriterion("photo not like", value, "photo");
      return (Criteria) this;
    }

    public Criteria andPhotoIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("photo in", values, "photo");
      return (Criteria) this;
    }

    public Criteria andPhotoNotIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("photo not in", values, "photo");
      return (Criteria) this;
    }

    public Criteria andPhotoBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("photo between", head, tail, "photo");
      return (Criteria) this;
    }

    public Criteria andPhotoNotBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("photo not between", head, tail, "photo");
      return (Criteria) this;
    }

    public Criteria andTypeIsNull() {
      addCriterion("`flag` is null");
      return (Criteria) this;
    }

    public Criteria andTypeIsNotNull() {
      addCriterion("`flag` is not null");
      return (Criteria) this;
    }

    public Criteria andTypeEqualTo(String value) {
      if(value != null) addCriterion("`flag` =", value, "flag");
      return (Criteria) this;
    }

    public Criteria andTypeNotEqualTo(String value) {
      if(value != null) addCriterion("`flag` <>", value, "flag");
      return (Criteria) this;
    }

    public Criteria andTypeGreaterThan(String value) {
      if(value != null) addCriterion("`flag` >", value, "flag");
      return (Criteria) this;
    }

    public Criteria andTypeGreaterThanOrEqualTo(String value) {
      if(value != null) addCriterion("`flag` >=", value, "flag");
      return (Criteria) this;
    }

    public Criteria andTypeLessThan(String value) {
      if(value != null) addCriterion("`flag` <", value, "flag");
      return (Criteria) this;
    }

    public Criteria andTypeLessThanOrEqualTo(String value) {
      if(value != null) addCriterion("`flag` <=", value, "flag");
      return (Criteria) this;
    }

    public Criteria andTypeLike(String value) {
      if(value != null) addCriterion("`flag` like", value, "flag");
      return (Criteria) this;
    }

    public Criteria andTypeNotLike(String value) {
      if(value != null) addCriterion("`flag` not like", value, "flag");
      return (Criteria) this;
    }

    public Criteria andTypeIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("`flag` in", values, "flag");
      return (Criteria) this;
    }

    public Criteria andTypeNotIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("`flag` not in", values, "flag");
      return (Criteria) this;
    }

    public Criteria andTypeBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("`flag` between", head, tail, "flag");
      return (Criteria) this;
    }

    public Criteria andTypeNotBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("`flag` not between", head, tail, "flag");
      return (Criteria) this;
    }

    public Criteria andNoticeIsNull() {
      addCriterion("notice is null");
      return (Criteria) this;
    }

    public Criteria andNoticeIsNotNull() {
      addCriterion("notice is not null");
      return (Criteria) this;
    }

    public Criteria andNoticeEqualTo(String value) {
      if(value != null) addCriterion("notice =", value, "notice");
      return (Criteria) this;
    }

    public Criteria andNoticeNotEqualTo(String value) {
      if(value != null) addCriterion("notice <>", value, "notice");
      return (Criteria) this;
    }

    public Criteria andNoticeGreaterThan(String value) {
      if(value != null) addCriterion("notice >", value, "notice");
      return (Criteria) this;
    }

    public Criteria andNoticeGreaterThanOrEqualTo(String value) {
      if(value != null) addCriterion("notice >=", value, "notice");
      return (Criteria) this;
    }

    public Criteria andNoticeLessThan(String value) {
      if(value != null) addCriterion("notice <", value, "notice");
      return (Criteria) this;
    }

    public Criteria andNoticeLessThanOrEqualTo(String value) {
      if(value != null) addCriterion("notice <=", value, "notice");
      return (Criteria) this;
    }

    public Criteria andNoticeLike(String value) {
      if(value != null) addCriterion("notice like", value, "notice");
      return (Criteria) this;
    }

    public Criteria andNoticeNotLike(String value) {
      if(value != null) addCriterion("notice not like", value, "notice");
      return (Criteria) this;
    }

    public Criteria andNoticeIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("notice in", values, "notice");
      return (Criteria) this;
    }

    public Criteria andNoticeNotIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("notice not in", values, "notice");
      return (Criteria) this;
    }

    public Criteria andNoticeBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("notice between", head, tail, "notice");
      return (Criteria) this;
    }

    public Criteria andNoticeNotBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("notice not between", head, tail, "notice");
      return (Criteria) this;
    }
  }

  public static class Criteria extends GeneratedCriteria {
    private CritiqueExample example;

    protected Criteria(CritiqueExample example) {
      super();
      this.example = example;
    }

    public CritiqueExample example() {
      return this.example;
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