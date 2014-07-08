package cn.kangbao.webapp.db.appmgr.arg;

import java.util.*;
import java.math.*;
import org.apache.commons.lang.*;

public class PersonArg {
	private String pk_name = "personId";
    private String orderByClause;

	private String groupByClause;

	private String columns;

	private String countsql1;
	
	private String countsql2;

    private boolean distinct;

	private int rowStart=0;
    
    private int rowEnd=10;

    private List<PersonCriteria> oredCriteria;
  
    public PersonArg() {
        oredCriteria = new ArrayList<PersonCriteria>();
    }

    public void setPk_name(String pk_name) {
        this.pk_name =StringEscapeUtils.escapeSql( pk_name);
    }

    public String getPk_name() {
        return pk_name;
    }
    
    
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = StringEscapeUtils.escapeSql(orderByClause);
    }

    public String getOrderByClause() {
        return orderByClause;
    }

	public void setGroupByClause(String groupByClause) {
        this.groupByClause = StringEscapeUtils.escapeSql(groupByClause);
    }

    public String geGroupByClause() {
        return groupByClause;
    }

	public void setColumns(String columns) {
        this.columns = StringEscapeUtils.escapeSql(columns);
    }

    public String geColumns() {
        return columns;
    }

	public void setCountsql1(String countsql1) {
        this.countsql1 = StringEscapeUtils.escapeSql(countsql1);
    }

    public String geCountsql1() {
        return countsql1;
    }
    public void setCountsql2(String countsql2) {
        this.countsql2 = StringEscapeUtils.escapeSql(countsql2);
    }

    public String geCountsql2() {
        return countsql2;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

	public void setRowStart(int rowStart){
    	this.rowStart=rowStart;
    }
    
    public void setRowEnd(int rowEnd){
    	this.rowEnd=rowEnd;
    }
    
    public int getRowStart(){
    	return rowStart;
    }
    
    public int getRowEnd(){
    	return rowEnd;
    }

    public List<PersonCriteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(PersonCriteria criteria) {
        oredCriteria.add(criteria);
    }

    public PersonCriteria or() {
        PersonCriteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public PersonCriteria createCriteria() {
        PersonCriteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected PersonCriteria createCriteriaInternal() {
        PersonCriteria criteria = new PersonCriteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
		groupByClause = null;
		columns = null;
		countsql1 = null;
		countsql2 = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<PersonCriterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<PersonCriterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<PersonCriterion> getAllCriteria() {
            return criteria;
        }

        public List<PersonCriterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new PersonCriterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new PersonCriterion(condition, value));
        }

		protected void addCriterion(String condition, Object value, String property,int likeType) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new PersonCriterion(condition, value,likeType));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new PersonCriterion(condition, value1, value2));
        }

		public PersonCriteria andCriterionEqualTo(String criterion) {
			if (StringUtils.isBlank(criterion)) {
				criterion="1=1";
			}
			addCriterion(criterion);
			return (PersonCriteria) this;
		}
				public PersonCriteria andPersonidIsNull() {
			addCriterion("personId is null");
			return (PersonCriteria) this;
		}

		public PersonCriteria andPersonidIsNotNull() {
			addCriterion("personId is not null");
			return (PersonCriteria) this;
		}

		public PersonCriteria andPersonidEqualTo(Integer value) {
			addCriterion("personId =", value, "personId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andPersonidNotEqualTo(Integer value) {
			addCriterion("personId <>", value, "personId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andPersonidGreaterThan(Integer value) {
			addCriterion("personId >", value, "personId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andPersonidGreaterThanOrEqualTo(Integer value) {
			addCriterion("personId >=", value, "personId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andPersonidLessThan(Integer value) {
			addCriterion("personId <", value, "personId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andPersonidLessThanOrEqualTo(Integer value) {
			addCriterion("personId <=", value, "personId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andPersonidLike(Integer value) {
			addCriterion("personId like ", value, "personId",1);
			return (PersonCriteria) this;
		}

		public PersonCriteria andPersonidNotLike(Integer value) {
			addCriterion("personId  not like ", value, "personId",1);
			return (PersonCriteria) this;
		}

		public PersonCriteria andPersonidLeftLike(Integer value) {
			addCriterion("personId like ", value, "personId",0);
			return (PersonCriteria) this;
		}

		public PersonCriteria andPersonidNotLeftLike(Integer value) {
			addCriterion("personId  not like ", value, "personId",0);
			return (PersonCriteria) this;
		}

		public PersonCriteria andPersonidRightLike(Integer value) {
			addCriterion("personId like ", value, "personId",2);
			return (PersonCriteria) this;
		}

		public PersonCriteria andPersonidNotRightLike(Integer value) {
			addCriterion("personId  not like ", value, "personId",2);
			return (PersonCriteria) this;
		}

		public PersonCriteria andPersonidIn(List<Integer> values) {
			addCriterion("personId  in ", values, "personId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andPersonidNotIn(List<Integer> values) {
			addCriterion("personId not in ", values, "personId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andPersonidBetween(Integer value1,Integer value2) {
			addCriterion("personId between ", value1, value2, "personId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andPersonidNotBetween(Integer value1,Integer value2) {
			addCriterion("personId not between ", value1, value2, "personId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUseridIsNull() {
			addCriterion("userId is null");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUseridIsNotNull() {
			addCriterion("userId is not null");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUseridEqualTo(Integer value) {
			addCriterion("userId =", value, "userId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUseridNotEqualTo(Integer value) {
			addCriterion("userId <>", value, "userId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUseridGreaterThan(Integer value) {
			addCriterion("userId >", value, "userId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUseridGreaterThanOrEqualTo(Integer value) {
			addCriterion("userId >=", value, "userId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUseridLessThan(Integer value) {
			addCriterion("userId <", value, "userId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUseridLessThanOrEqualTo(Integer value) {
			addCriterion("userId <=", value, "userId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUseridLike(Integer value) {
			addCriterion("userId like ", value, "userId",1);
			return (PersonCriteria) this;
		}

		public PersonCriteria andUseridNotLike(Integer value) {
			addCriterion("userId  not like ", value, "userId",1);
			return (PersonCriteria) this;
		}

		public PersonCriteria andUseridLeftLike(Integer value) {
			addCriterion("userId like ", value, "userId",0);
			return (PersonCriteria) this;
		}

		public PersonCriteria andUseridNotLeftLike(Integer value) {
			addCriterion("userId  not like ", value, "userId",0);
			return (PersonCriteria) this;
		}

		public PersonCriteria andUseridRightLike(Integer value) {
			addCriterion("userId like ", value, "userId",2);
			return (PersonCriteria) this;
		}

		public PersonCriteria andUseridNotRightLike(Integer value) {
			addCriterion("userId  not like ", value, "userId",2);
			return (PersonCriteria) this;
		}

		public PersonCriteria andUseridIn(List<Integer> values) {
			addCriterion("userId  in ", values, "userId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUseridNotIn(List<Integer> values) {
			addCriterion("userId not in ", values, "userId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUseridBetween(Integer value1,Integer value2) {
			addCriterion("userId between ", value1, value2, "userId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUseridNotBetween(Integer value1,Integer value2) {
			addCriterion("userId not between ", value1, value2, "userId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMainpersonidIsNull() {
			addCriterion("mainPersonId is null");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMainpersonidIsNotNull() {
			addCriterion("mainPersonId is not null");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMainpersonidEqualTo(Integer value) {
			addCriterion("mainPersonId =", value, "mainPersonId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMainpersonidNotEqualTo(Integer value) {
			addCriterion("mainPersonId <>", value, "mainPersonId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMainpersonidGreaterThan(Integer value) {
			addCriterion("mainPersonId >", value, "mainPersonId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMainpersonidGreaterThanOrEqualTo(Integer value) {
			addCriterion("mainPersonId >=", value, "mainPersonId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMainpersonidLessThan(Integer value) {
			addCriterion("mainPersonId <", value, "mainPersonId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMainpersonidLessThanOrEqualTo(Integer value) {
			addCriterion("mainPersonId <=", value, "mainPersonId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMainpersonidLike(Integer value) {
			addCriterion("mainPersonId like ", value, "mainPersonId",1);
			return (PersonCriteria) this;
		}

		public PersonCriteria andMainpersonidNotLike(Integer value) {
			addCriterion("mainPersonId  not like ", value, "mainPersonId",1);
			return (PersonCriteria) this;
		}

		public PersonCriteria andMainpersonidLeftLike(Integer value) {
			addCriterion("mainPersonId like ", value, "mainPersonId",0);
			return (PersonCriteria) this;
		}

		public PersonCriteria andMainpersonidNotLeftLike(Integer value) {
			addCriterion("mainPersonId  not like ", value, "mainPersonId",0);
			return (PersonCriteria) this;
		}

		public PersonCriteria andMainpersonidRightLike(Integer value) {
			addCriterion("mainPersonId like ", value, "mainPersonId",2);
			return (PersonCriteria) this;
		}

		public PersonCriteria andMainpersonidNotRightLike(Integer value) {
			addCriterion("mainPersonId  not like ", value, "mainPersonId",2);
			return (PersonCriteria) this;
		}

		public PersonCriteria andMainpersonidIn(List<Integer> values) {
			addCriterion("mainPersonId  in ", values, "mainPersonId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMainpersonidNotIn(List<Integer> values) {
			addCriterion("mainPersonId not in ", values, "mainPersonId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMainpersonidBetween(Integer value1,Integer value2) {
			addCriterion("mainPersonId between ", value1, value2, "mainPersonId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMainpersonidNotBetween(Integer value1,Integer value2) {
			addCriterion("mainPersonId not between ", value1, value2, "mainPersonId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUsertypeIsNull() {
			addCriterion("userType is null");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUsertypeIsNotNull() {
			addCriterion("userType is not null");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUsertypeEqualTo(String value) {
			addCriterion("userType =", value, "userType");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUsertypeNotEqualTo(String value) {
			addCriterion("userType <>", value, "userType");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUsertypeGreaterThan(String value) {
			addCriterion("userType >", value, "userType");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUsertypeGreaterThanOrEqualTo(String value) {
			addCriterion("userType >=", value, "userType");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUsertypeLessThan(String value) {
			addCriterion("userType <", value, "userType");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUsertypeLessThanOrEqualTo(String value) {
			addCriterion("userType <=", value, "userType");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUsertypeLike(String value) {
			addCriterion("userType like ", value, "userType",1);
			return (PersonCriteria) this;
		}

		public PersonCriteria andUsertypeNotLike(String value) {
			addCriterion("userType  not like ", value, "userType",1);
			return (PersonCriteria) this;
		}

		public PersonCriteria andUsertypeLeftLike(String value) {
			addCriterion("userType like ", value, "userType",0);
			return (PersonCriteria) this;
		}

		public PersonCriteria andUsertypeNotLeftLike(String value) {
			addCriterion("userType  not like ", value, "userType",0);
			return (PersonCriteria) this;
		}

		public PersonCriteria andUsertypeRightLike(String value) {
			addCriterion("userType like ", value, "userType",2);
			return (PersonCriteria) this;
		}

		public PersonCriteria andUsertypeNotRightLike(String value) {
			addCriterion("userType  not like ", value, "userType",2);
			return (PersonCriteria) this;
		}

		public PersonCriteria andUsertypeIn(List<String> values) {
			addCriterion("userType  in ", values, "userType");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUsertypeNotIn(List<String> values) {
			addCriterion("userType not in ", values, "userType");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUsertypeBetween(String value1,String value2) {
			addCriterion("userType between ", value1, value2, "userType");
			return (PersonCriteria) this;
		}

		public PersonCriteria andUsertypeNotBetween(String value1,String value2) {
			addCriterion("userType not between ", value1, value2, "userType");
			return (PersonCriteria) this;
		}

		public PersonCriteria andFullnameIsNull() {
			addCriterion("fullName is null");
			return (PersonCriteria) this;
		}

		public PersonCriteria andFullnameIsNotNull() {
			addCriterion("fullName is not null");
			return (PersonCriteria) this;
		}

		public PersonCriteria andFullnameEqualTo(String value) {
			addCriterion("fullName =", value, "fullName");
			return (PersonCriteria) this;
		}

		public PersonCriteria andFullnameNotEqualTo(String value) {
			addCriterion("fullName <>", value, "fullName");
			return (PersonCriteria) this;
		}

		public PersonCriteria andFullnameGreaterThan(String value) {
			addCriterion("fullName >", value, "fullName");
			return (PersonCriteria) this;
		}

		public PersonCriteria andFullnameGreaterThanOrEqualTo(String value) {
			addCriterion("fullName >=", value, "fullName");
			return (PersonCriteria) this;
		}

		public PersonCriteria andFullnameLessThan(String value) {
			addCriterion("fullName <", value, "fullName");
			return (PersonCriteria) this;
		}

		public PersonCriteria andFullnameLessThanOrEqualTo(String value) {
			addCriterion("fullName <=", value, "fullName");
			return (PersonCriteria) this;
		}

		public PersonCriteria andFullnameLike(String value) {
			addCriterion("fullName like ", value, "fullName",1);
			return (PersonCriteria) this;
		}

		public PersonCriteria andFullnameNotLike(String value) {
			addCriterion("fullName  not like ", value, "fullName",1);
			return (PersonCriteria) this;
		}

		public PersonCriteria andFullnameLeftLike(String value) {
			addCriterion("fullName like ", value, "fullName",0);
			return (PersonCriteria) this;
		}

		public PersonCriteria andFullnameNotLeftLike(String value) {
			addCriterion("fullName  not like ", value, "fullName",0);
			return (PersonCriteria) this;
		}

		public PersonCriteria andFullnameRightLike(String value) {
			addCriterion("fullName like ", value, "fullName",2);
			return (PersonCriteria) this;
		}

		public PersonCriteria andFullnameNotRightLike(String value) {
			addCriterion("fullName  not like ", value, "fullName",2);
			return (PersonCriteria) this;
		}

		public PersonCriteria andFullnameIn(List<String> values) {
			addCriterion("fullName  in ", values, "fullName");
			return (PersonCriteria) this;
		}

		public PersonCriteria andFullnameNotIn(List<String> values) {
			addCriterion("fullName not in ", values, "fullName");
			return (PersonCriteria) this;
		}

		public PersonCriteria andFullnameBetween(String value1,String value2) {
			addCriterion("fullName between ", value1, value2, "fullName");
			return (PersonCriteria) this;
		}

		public PersonCriteria andFullnameNotBetween(String value1,String value2) {
			addCriterion("fullName not between ", value1, value2, "fullName");
			return (PersonCriteria) this;
		}

		public PersonCriteria andSextypeIsNull() {
			addCriterion("sexType is null");
			return (PersonCriteria) this;
		}

		public PersonCriteria andSextypeIsNotNull() {
			addCriterion("sexType is not null");
			return (PersonCriteria) this;
		}

		public PersonCriteria andSextypeEqualTo(Integer value) {
			addCriterion("sexType =", value, "sexType");
			return (PersonCriteria) this;
		}

		public PersonCriteria andSextypeNotEqualTo(Integer value) {
			addCriterion("sexType <>", value, "sexType");
			return (PersonCriteria) this;
		}

		public PersonCriteria andSextypeGreaterThan(Integer value) {
			addCriterion("sexType >", value, "sexType");
			return (PersonCriteria) this;
		}

		public PersonCriteria andSextypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("sexType >=", value, "sexType");
			return (PersonCriteria) this;
		}

		public PersonCriteria andSextypeLessThan(Integer value) {
			addCriterion("sexType <", value, "sexType");
			return (PersonCriteria) this;
		}

		public PersonCriteria andSextypeLessThanOrEqualTo(Integer value) {
			addCriterion("sexType <=", value, "sexType");
			return (PersonCriteria) this;
		}

		public PersonCriteria andSextypeLike(Integer value) {
			addCriterion("sexType like ", value, "sexType",1);
			return (PersonCriteria) this;
		}

		public PersonCriteria andSextypeNotLike(Integer value) {
			addCriterion("sexType  not like ", value, "sexType",1);
			return (PersonCriteria) this;
		}

		public PersonCriteria andSextypeLeftLike(Integer value) {
			addCriterion("sexType like ", value, "sexType",0);
			return (PersonCriteria) this;
		}

		public PersonCriteria andSextypeNotLeftLike(Integer value) {
			addCriterion("sexType  not like ", value, "sexType",0);
			return (PersonCriteria) this;
		}

		public PersonCriteria andSextypeRightLike(Integer value) {
			addCriterion("sexType like ", value, "sexType",2);
			return (PersonCriteria) this;
		}

		public PersonCriteria andSextypeNotRightLike(Integer value) {
			addCriterion("sexType  not like ", value, "sexType",2);
			return (PersonCriteria) this;
		}

		public PersonCriteria andSextypeIn(List<Integer> values) {
			addCriterion("sexType  in ", values, "sexType");
			return (PersonCriteria) this;
		}

		public PersonCriteria andSextypeNotIn(List<Integer> values) {
			addCriterion("sexType not in ", values, "sexType");
			return (PersonCriteria) this;
		}

		public PersonCriteria andSextypeBetween(Integer value1,Integer value2) {
			addCriterion("sexType between ", value1, value2, "sexType");
			return (PersonCriteria) this;
		}

		public PersonCriteria andSextypeNotBetween(Integer value1,Integer value2) {
			addCriterion("sexType not between ", value1, value2, "sexType");
			return (PersonCriteria) this;
		}

		public PersonCriteria andBirthdayIsNull() {
			addCriterion("birthday is null");
			return (PersonCriteria) this;
		}

		public PersonCriteria andBirthdayIsNotNull() {
			addCriterion("birthday is not null");
			return (PersonCriteria) this;
		}

		public PersonCriteria andBirthdayEqualTo(Date value) {
			addCriterion("birthday =", value, "birthday");
			return (PersonCriteria) this;
		}

		public PersonCriteria andBirthdayNotEqualTo(Date value) {
			addCriterion("birthday <>", value, "birthday");
			return (PersonCriteria) this;
		}

		public PersonCriteria andBirthdayGreaterThan(Date value) {
			addCriterion("birthday >", value, "birthday");
			return (PersonCriteria) this;
		}

		public PersonCriteria andBirthdayGreaterThanOrEqualTo(Date value) {
			addCriterion("birthday >=", value, "birthday");
			return (PersonCriteria) this;
		}

		public PersonCriteria andBirthdayLessThan(Date value) {
			addCriterion("birthday <", value, "birthday");
			return (PersonCriteria) this;
		}

		public PersonCriteria andBirthdayLessThanOrEqualTo(Date value) {
			addCriterion("birthday <=", value, "birthday");
			return (PersonCriteria) this;
		}

		public PersonCriteria andBirthdayLike(Date value) {
			addCriterion("birthday like ", value, "birthday",1);
			return (PersonCriteria) this;
		}

		public PersonCriteria andBirthdayNotLike(Date value) {
			addCriterion("birthday  not like ", value, "birthday",1);
			return (PersonCriteria) this;
		}

		public PersonCriteria andBirthdayLeftLike(Date value) {
			addCriterion("birthday like ", value, "birthday",0);
			return (PersonCriteria) this;
		}

		public PersonCriteria andBirthdayNotLeftLike(Date value) {
			addCriterion("birthday  not like ", value, "birthday",0);
			return (PersonCriteria) this;
		}

		public PersonCriteria andBirthdayRightLike(Date value) {
			addCriterion("birthday like ", value, "birthday",2);
			return (PersonCriteria) this;
		}

		public PersonCriteria andBirthdayNotRightLike(Date value) {
			addCriterion("birthday  not like ", value, "birthday",2);
			return (PersonCriteria) this;
		}

		public PersonCriteria andBirthdayIn(List<Date> values) {
			addCriterion("birthday  in ", values, "birthday");
			return (PersonCriteria) this;
		}

		public PersonCriteria andBirthdayNotIn(List<Date> values) {
			addCriterion("birthday not in ", values, "birthday");
			return (PersonCriteria) this;
		}

		public PersonCriteria andBirthdayBetween(Date value1,Date value2) {
			addCriterion("birthday between ", value1, value2, "birthday");
			return (PersonCriteria) this;
		}

		public PersonCriteria andBirthdayNotBetween(Date value1,Date value2) {
			addCriterion("birthday not between ", value1, value2, "birthday");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMobileIsNull() {
			addCriterion("mobile is null");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMobileIsNotNull() {
			addCriterion("mobile is not null");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMobileEqualTo(String value) {
			addCriterion("mobile =", value, "mobile");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMobileNotEqualTo(String value) {
			addCriterion("mobile <>", value, "mobile");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMobileGreaterThan(String value) {
			addCriterion("mobile >", value, "mobile");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMobileGreaterThanOrEqualTo(String value) {
			addCriterion("mobile >=", value, "mobile");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMobileLessThan(String value) {
			addCriterion("mobile <", value, "mobile");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMobileLessThanOrEqualTo(String value) {
			addCriterion("mobile <=", value, "mobile");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMobileLike(String value) {
			addCriterion("mobile like ", value, "mobile",1);
			return (PersonCriteria) this;
		}

		public PersonCriteria andMobileNotLike(String value) {
			addCriterion("mobile  not like ", value, "mobile",1);
			return (PersonCriteria) this;
		}

		public PersonCriteria andMobileLeftLike(String value) {
			addCriterion("mobile like ", value, "mobile",0);
			return (PersonCriteria) this;
		}

		public PersonCriteria andMobileNotLeftLike(String value) {
			addCriterion("mobile  not like ", value, "mobile",0);
			return (PersonCriteria) this;
		}

		public PersonCriteria andMobileRightLike(String value) {
			addCriterion("mobile like ", value, "mobile",2);
			return (PersonCriteria) this;
		}

		public PersonCriteria andMobileNotRightLike(String value) {
			addCriterion("mobile  not like ", value, "mobile",2);
			return (PersonCriteria) this;
		}

		public PersonCriteria andMobileIn(List<String> values) {
			addCriterion("mobile  in ", values, "mobile");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMobileNotIn(List<String> values) {
			addCriterion("mobile not in ", values, "mobile");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMobileBetween(String value1,String value2) {
			addCriterion("mobile between ", value1, value2, "mobile");
			return (PersonCriteria) this;
		}

		public PersonCriteria andMobileNotBetween(String value1,String value2) {
			addCriterion("mobile not between ", value1, value2, "mobile");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCityidIsNull() {
			addCriterion("cityId is null");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCityidIsNotNull() {
			addCriterion("cityId is not null");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCityidEqualTo(Integer value) {
			addCriterion("cityId =", value, "cityId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCityidNotEqualTo(Integer value) {
			addCriterion("cityId <>", value, "cityId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCityidGreaterThan(Integer value) {
			addCriterion("cityId >", value, "cityId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCityidGreaterThanOrEqualTo(Integer value) {
			addCriterion("cityId >=", value, "cityId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCityidLessThan(Integer value) {
			addCriterion("cityId <", value, "cityId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCityidLessThanOrEqualTo(Integer value) {
			addCriterion("cityId <=", value, "cityId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCityidLike(Integer value) {
			addCriterion("cityId like ", value, "cityId",1);
			return (PersonCriteria) this;
		}

		public PersonCriteria andCityidNotLike(Integer value) {
			addCriterion("cityId  not like ", value, "cityId",1);
			return (PersonCriteria) this;
		}

		public PersonCriteria andCityidLeftLike(Integer value) {
			addCriterion("cityId like ", value, "cityId",0);
			return (PersonCriteria) this;
		}

		public PersonCriteria andCityidNotLeftLike(Integer value) {
			addCriterion("cityId  not like ", value, "cityId",0);
			return (PersonCriteria) this;
		}

		public PersonCriteria andCityidRightLike(Integer value) {
			addCriterion("cityId like ", value, "cityId",2);
			return (PersonCriteria) this;
		}

		public PersonCriteria andCityidNotRightLike(Integer value) {
			addCriterion("cityId  not like ", value, "cityId",2);
			return (PersonCriteria) this;
		}

		public PersonCriteria andCityidIn(List<Integer> values) {
			addCriterion("cityId  in ", values, "cityId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCityidNotIn(List<Integer> values) {
			addCriterion("cityId not in ", values, "cityId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCityidBetween(Integer value1,Integer value2) {
			addCriterion("cityId between ", value1, value2, "cityId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCityidNotBetween(Integer value1,Integer value2) {
			addCriterion("cityId not between ", value1, value2, "cityId");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCreatetimeIsNull() {
			addCriterion("createTime is null");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCreatetimeIsNotNull() {
			addCriterion("createTime is not null");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCreatetimeEqualTo(Date value) {
			addCriterion("createTime =", value, "createTime");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCreatetimeNotEqualTo(Date value) {
			addCriterion("createTime <>", value, "createTime");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCreatetimeGreaterThan(Date value) {
			addCriterion("createTime >", value, "createTime");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCreatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("createTime >=", value, "createTime");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCreatetimeLessThan(Date value) {
			addCriterion("createTime <", value, "createTime");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCreatetimeLessThanOrEqualTo(Date value) {
			addCriterion("createTime <=", value, "createTime");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCreatetimeLike(Date value) {
			addCriterion("createTime like ", value, "createTime",1);
			return (PersonCriteria) this;
		}

		public PersonCriteria andCreatetimeNotLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",1);
			return (PersonCriteria) this;
		}

		public PersonCriteria andCreatetimeLeftLike(Date value) {
			addCriterion("createTime like ", value, "createTime",0);
			return (PersonCriteria) this;
		}

		public PersonCriteria andCreatetimeNotLeftLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",0);
			return (PersonCriteria) this;
		}

		public PersonCriteria andCreatetimeRightLike(Date value) {
			addCriterion("createTime like ", value, "createTime",2);
			return (PersonCriteria) this;
		}

		public PersonCriteria andCreatetimeNotRightLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",2);
			return (PersonCriteria) this;
		}

		public PersonCriteria andCreatetimeIn(List<Date> values) {
			addCriterion("createTime  in ", values, "createTime");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCreatetimeNotIn(List<Date> values) {
			addCriterion("createTime not in ", values, "createTime");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCreatetimeBetween(Date value1,Date value2) {
			addCriterion("createTime between ", value1, value2, "createTime");
			return (PersonCriteria) this;
		}

		public PersonCriteria andCreatetimeNotBetween(Date value1,Date value2) {
			addCriterion("createTime not between ", value1, value2, "createTime");
			return (PersonCriteria) this;
		}

		public PersonCriteria andDrIsNull() {
			addCriterion("dr is null");
			return (PersonCriteria) this;
		}

		public PersonCriteria andDrIsNotNull() {
			addCriterion("dr is not null");
			return (PersonCriteria) this;
		}

		public PersonCriteria andDrEqualTo(Integer value) {
			addCriterion("dr =", value, "dr");
			return (PersonCriteria) this;
		}

		public PersonCriteria andDrNotEqualTo(Integer value) {
			addCriterion("dr <>", value, "dr");
			return (PersonCriteria) this;
		}

		public PersonCriteria andDrGreaterThan(Integer value) {
			addCriterion("dr >", value, "dr");
			return (PersonCriteria) this;
		}

		public PersonCriteria andDrGreaterThanOrEqualTo(Integer value) {
			addCriterion("dr >=", value, "dr");
			return (PersonCriteria) this;
		}

		public PersonCriteria andDrLessThan(Integer value) {
			addCriterion("dr <", value, "dr");
			return (PersonCriteria) this;
		}

		public PersonCriteria andDrLessThanOrEqualTo(Integer value) {
			addCriterion("dr <=", value, "dr");
			return (PersonCriteria) this;
		}

		public PersonCriteria andDrLike(Integer value) {
			addCriterion("dr like ", value, "dr",1);
			return (PersonCriteria) this;
		}

		public PersonCriteria andDrNotLike(Integer value) {
			addCriterion("dr  not like ", value, "dr",1);
			return (PersonCriteria) this;
		}

		public PersonCriteria andDrLeftLike(Integer value) {
			addCriterion("dr like ", value, "dr",0);
			return (PersonCriteria) this;
		}

		public PersonCriteria andDrNotLeftLike(Integer value) {
			addCriterion("dr  not like ", value, "dr",0);
			return (PersonCriteria) this;
		}

		public PersonCriteria andDrRightLike(Integer value) {
			addCriterion("dr like ", value, "dr",2);
			return (PersonCriteria) this;
		}

		public PersonCriteria andDrNotRightLike(Integer value) {
			addCriterion("dr  not like ", value, "dr",2);
			return (PersonCriteria) this;
		}

		public PersonCriteria andDrIn(List<Integer> values) {
			addCriterion("dr  in ", values, "dr");
			return (PersonCriteria) this;
		}

		public PersonCriteria andDrNotIn(List<Integer> values) {
			addCriterion("dr not in ", values, "dr");
			return (PersonCriteria) this;
		}

		public PersonCriteria andDrBetween(Integer value1,Integer value2) {
			addCriterion("dr between ", value1, value2, "dr");
			return (PersonCriteria) this;
		}

		public PersonCriteria andDrNotBetween(Integer value1,Integer value2) {
			addCriterion("dr not between ", value1, value2, "dr");
			return (PersonCriteria) this;
		}

    }

    public static class PersonCriteria extends GeneratedCriteria {

        protected PersonCriteria() {
            super();
        }
    }

    public static class PersonCriterion {
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

        protected PersonCriterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

		protected PersonCriterion(String condition, Object value, int likeType) {
           this.condition = condition;
            if(likeType==0)
            {
           this.value = "%"+ value; 
            }
            else if(likeType==1)
            {
            	this.value= "%"+ value+"%"; 
			}
            else {
            	this.value= value+"%"; 
			}
			this.typeHandler = null;
            this.singleValue = true;
           
        }

        protected PersonCriterion(String condition, Object value, String typeHandler) {
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

        protected PersonCriterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected PersonCriterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected PersonCriterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}