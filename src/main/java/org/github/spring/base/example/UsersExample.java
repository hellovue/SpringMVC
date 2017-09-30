//*****************************************************************************
// The file is automatically generated by the program, do not manually modify. 
//*****************************************************************************

package org.github.spring.base.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
  protected String orderByClause;

  protected boolean distinct;

  protected List<Criteria> oredCriteria;

  public UsersExample() {
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

    public Criteria andUserIdIsNull() {
      addCriterion("user_id is null");
      return (Criteria) this;
    }

    public Criteria andUserIdIsNotNull() {
      addCriterion("user_id is not null");
      return (Criteria) this;
    }

    public Criteria andUserIdEqualTo(String value) {
      if(value != null) addCriterion("user_id =", value, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdNotEqualTo(String value) {
      if(value != null) addCriterion("user_id <>", value, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdGreaterThan(String value) {
      if(value != null) addCriterion("user_id >", value, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdGreaterThanOrEqualTo(String value) {
      if(value != null) addCriterion("user_id >=", value, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdLessThan(String value) {
      if(value != null) addCriterion("user_id <", value, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdLessThanOrEqualTo(String value) {
      if(value != null) addCriterion("user_id <=", value, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdLike(String value) {
      if(value != null) addCriterion("user_id like", value, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdNotLike(String value) {
      if(value != null) addCriterion("user_id not like", value, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("user_id in", values, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdNotIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("user_id not in", values, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("user_id between", head, tail, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdNotBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("user_id not between", head, tail, "userId");
      return (Criteria) this;
    }

    public Criteria andUsernameIsNull() {
      addCriterion("username is null");
      return (Criteria) this;
    }

    public Criteria andUsernameIsNotNull() {
      addCriterion("username is not null");
      return (Criteria) this;
    }

    public Criteria andUsernameEqualTo(String value) {
      if(value != null) addCriterion("username =", value, "username");
      return (Criteria) this;
    }

    public Criteria andUsernameNotEqualTo(String value) {
      if(value != null) addCriterion("username <>", value, "username");
      return (Criteria) this;
    }

    public Criteria andUsernameGreaterThan(String value) {
      if(value != null) addCriterion("username >", value, "username");
      return (Criteria) this;
    }

    public Criteria andUsernameGreaterThanOrEqualTo(String value) {
      if(value != null) addCriterion("username >=", value, "username");
      return (Criteria) this;
    }

    public Criteria andUsernameLessThan(String value) {
      if(value != null) addCriterion("username <", value, "username");
      return (Criteria) this;
    }

    public Criteria andUsernameLessThanOrEqualTo(String value) {
      if(value != null) addCriterion("username <=", value, "username");
      return (Criteria) this;
    }

    public Criteria andUsernameLike(String value) {
      if(value != null) addCriterion("username like", value, "username");
      return (Criteria) this;
    }

    public Criteria andUsernameNotLike(String value) {
      if(value != null) addCriterion("username not like", value, "username");
      return (Criteria) this;
    }

    public Criteria andUsernameIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("username in", values, "username");
      return (Criteria) this;
    }

    public Criteria andUsernameNotIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("username not in", values, "username");
      return (Criteria) this;
    }

    public Criteria andUsernameBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("username between", head, tail, "username");
      return (Criteria) this;
    }

    public Criteria andUsernameNotBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("username not between", head, tail, "username");
      return (Criteria) this;
    }

    public Criteria andPasswordIsNull() {
      addCriterion("`password` is null");
      return (Criteria) this;
    }

    public Criteria andPasswordIsNotNull() {
      addCriterion("`password` is not null");
      return (Criteria) this;
    }

    public Criteria andPasswordEqualTo(String value) {
      if(value != null) addCriterion("`password` =", value, "password");
      return (Criteria) this;
    }

    public Criteria andPasswordNotEqualTo(String value) {
      if(value != null) addCriterion("`password` <>", value, "password");
      return (Criteria) this;
    }

    public Criteria andPasswordGreaterThan(String value) {
      if(value != null) addCriterion("`password` >", value, "password");
      return (Criteria) this;
    }

    public Criteria andPasswordGreaterThanOrEqualTo(String value) {
      if(value != null) addCriterion("`password` >=", value, "password");
      return (Criteria) this;
    }

    public Criteria andPasswordLessThan(String value) {
      if(value != null) addCriterion("`password` <", value, "password");
      return (Criteria) this;
    }

    public Criteria andPasswordLessThanOrEqualTo(String value) {
      if(value != null) addCriterion("`password` <=", value, "password");
      return (Criteria) this;
    }

    public Criteria andPasswordLike(String value) {
      if(value != null) addCriterion("`password` like", value, "password");
      return (Criteria) this;
    }

    public Criteria andPasswordNotLike(String value) {
      if(value != null) addCriterion("`password` not like", value, "password");
      return (Criteria) this;
    }

    public Criteria andPasswordIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("`password` in", values, "password");
      return (Criteria) this;
    }

    public Criteria andPasswordNotIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("`password` not in", values, "password");
      return (Criteria) this;
    }

    public Criteria andPasswordBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("`password` between", head, tail, "password");
      return (Criteria) this;
    }

    public Criteria andPasswordNotBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("`password` not between", head, tail, "password");
      return (Criteria) this;
    }

    public Criteria andQuestionIsNull() {
      addCriterion("question is null");
      return (Criteria) this;
    }

    public Criteria andQuestionIsNotNull() {
      addCriterion("question is not null");
      return (Criteria) this;
    }

    public Criteria andQuestionEqualTo(String value) {
      if(value != null) addCriterion("question =", value, "question");
      return (Criteria) this;
    }

    public Criteria andQuestionNotEqualTo(String value) {
      if(value != null) addCriterion("question <>", value, "question");
      return (Criteria) this;
    }

    public Criteria andQuestionGreaterThan(String value) {
      if(value != null) addCriterion("question >", value, "question");
      return (Criteria) this;
    }

    public Criteria andQuestionGreaterThanOrEqualTo(String value) {
      if(value != null) addCriterion("question >=", value, "question");
      return (Criteria) this;
    }

    public Criteria andQuestionLessThan(String value) {
      if(value != null) addCriterion("question <", value, "question");
      return (Criteria) this;
    }

    public Criteria andQuestionLessThanOrEqualTo(String value) {
      if(value != null) addCriterion("question <=", value, "question");
      return (Criteria) this;
    }

    public Criteria andQuestionLike(String value) {
      if(value != null) addCriterion("question like", value, "question");
      return (Criteria) this;
    }

    public Criteria andQuestionNotLike(String value) {
      if(value != null) addCriterion("question not like", value, "question");
      return (Criteria) this;
    }

    public Criteria andQuestionIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("question in", values, "question");
      return (Criteria) this;
    }

    public Criteria andQuestionNotIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("question not in", values, "question");
      return (Criteria) this;
    }

    public Criteria andQuestionBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("question between", head, tail, "question");
      return (Criteria) this;
    }

    public Criteria andQuestionNotBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("question not between", head, tail, "question");
      return (Criteria) this;
    }

    public Criteria andAnswerIsNull() {
      addCriterion("answer is null");
      return (Criteria) this;
    }

    public Criteria andAnswerIsNotNull() {
      addCriterion("answer is not null");
      return (Criteria) this;
    }

    public Criteria andAnswerEqualTo(String value) {
      if(value != null) addCriterion("answer =", value, "answer");
      return (Criteria) this;
    }

    public Criteria andAnswerNotEqualTo(String value) {
      if(value != null) addCriterion("answer <>", value, "answer");
      return (Criteria) this;
    }

    public Criteria andAnswerGreaterThan(String value) {
      if(value != null) addCriterion("answer >", value, "answer");
      return (Criteria) this;
    }

    public Criteria andAnswerGreaterThanOrEqualTo(String value) {
      if(value != null) addCriterion("answer >=", value, "answer");
      return (Criteria) this;
    }

    public Criteria andAnswerLessThan(String value) {
      if(value != null) addCriterion("answer <", value, "answer");
      return (Criteria) this;
    }

    public Criteria andAnswerLessThanOrEqualTo(String value) {
      if(value != null) addCriterion("answer <=", value, "answer");
      return (Criteria) this;
    }

    public Criteria andAnswerLike(String value) {
      if(value != null) addCriterion("answer like", value, "answer");
      return (Criteria) this;
    }

    public Criteria andAnswerNotLike(String value) {
      if(value != null) addCriterion("answer not like", value, "answer");
      return (Criteria) this;
    }

    public Criteria andAnswerIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("answer in", values, "answer");
      return (Criteria) this;
    }

    public Criteria andAnswerNotIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("answer not in", values, "answer");
      return (Criteria) this;
    }

    public Criteria andAnswerBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("answer between", head, tail, "answer");
      return (Criteria) this;
    }

    public Criteria andAnswerNotBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("answer not between", head, tail, "answer");
      return (Criteria) this;
    }

    public Criteria andUserImgIsNull() {
      addCriterion("user_img is null");
      return (Criteria) this;
    }

    public Criteria andUserImgIsNotNull() {
      addCriterion("user_img is not null");
      return (Criteria) this;
    }

    public Criteria andUserImgEqualTo(String value) {
      if(value != null) addCriterion("user_img =", value, "userImg");
      return (Criteria) this;
    }

    public Criteria andUserImgNotEqualTo(String value) {
      if(value != null) addCriterion("user_img <>", value, "userImg");
      return (Criteria) this;
    }

    public Criteria andUserImgGreaterThan(String value) {
      if(value != null) addCriterion("user_img >", value, "userImg");
      return (Criteria) this;
    }

    public Criteria andUserImgGreaterThanOrEqualTo(String value) {
      if(value != null) addCriterion("user_img >=", value, "userImg");
      return (Criteria) this;
    }

    public Criteria andUserImgLessThan(String value) {
      if(value != null) addCriterion("user_img <", value, "userImg");
      return (Criteria) this;
    }

    public Criteria andUserImgLessThanOrEqualTo(String value) {
      if(value != null) addCriterion("user_img <=", value, "userImg");
      return (Criteria) this;
    }

    public Criteria andUserImgLike(String value) {
      if(value != null) addCriterion("user_img like", value, "userImg");
      return (Criteria) this;
    }

    public Criteria andUserImgNotLike(String value) {
      if(value != null) addCriterion("user_img not like", value, "userImg");
      return (Criteria) this;
    }

    public Criteria andUserImgIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("user_img in", values, "userImg");
      return (Criteria) this;
    }

    public Criteria andUserImgNotIn(List<String> values) {
      if (values != null && ! values.isEmpty()) addCriterion("user_img not in", values, "userImg");
      return (Criteria) this;
    }

    public Criteria andUserImgBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("user_img between", head, tail, "userImg");
      return (Criteria) this;
    }

    public Criteria andUserImgNotBetween(String head, String tail) {
      if(head != null && tail != null) addCriterion("user_img not between", head, tail, "userImg");
      return (Criteria) this;
    }

    public Criteria andRegtimeIsNull() {
      addCriterion("regtime is null");
      return (Criteria) this;
    }

    public Criteria andRegtimeIsNotNull() {
      addCriterion("regtime is not null");
      return (Criteria) this;
    }

    public Criteria andRegtimeEqualTo(Date value) {
      if(value != null) addCriterion("regtime =", value, "regtime");
      return (Criteria) this;
    }

    public Criteria andRegtimeNotEqualTo(Date value) {
      if(value != null) addCriterion("regtime <>", value, "regtime");
      return (Criteria) this;
    }

    public Criteria andRegtimeGreaterThan(Date value) {
      if(value != null) addCriterion("regtime >", value, "regtime");
      return (Criteria) this;
    }

    public Criteria andRegtimeGreaterThanOrEqualTo(Date value) {
      if(value != null) addCriterion("regtime >=", value, "regtime");
      return (Criteria) this;
    }

    public Criteria andRegtimeLessThan(Date value) {
      if(value != null) addCriterion("regtime <", value, "regtime");
      return (Criteria) this;
    }

    public Criteria andRegtimeLessThanOrEqualTo(Date value) {
      if(value != null) addCriterion("regtime <=", value, "regtime");
      return (Criteria) this;
    }

    public Criteria andRegtimeIn(List<Date> values) {
      if (values != null && ! values.isEmpty()) addCriterion("regtime in", values, "regtime");
      return (Criteria) this;
    }

    public Criteria andRegtimeNotIn(List<Date> values) {
      if (values != null && ! values.isEmpty()) addCriterion("regtime not in", values, "regtime");
      return (Criteria) this;
    }

    public Criteria andRegtimeBetween(Date head, Date tail) {
      if(head != null && tail != null) addCriterion("regtime between", head, tail, "regtime");
      return (Criteria) this;
    }

    public Criteria andRegtimeNotBetween(Date head, Date tail) {
      if(head != null && tail != null) addCriterion("regtime not between", head, tail, "regtime");
      return (Criteria) this;
    }
  }

  public static class Criteria extends GeneratedCriteria {
    private UsersExample example;

    protected Criteria(UsersExample example) {
      super();
      this.example = example;
    }

    public UsersExample example() {
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