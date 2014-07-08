package cn.kangbao.webapp.db.appmgr.arg;

import java.util.*;
import java.math.*;
import org.apache.commons.lang.*;

public class PatientHealthArg {
	private String pk_name = "healthId";
    private String orderByClause;

	private String groupByClause;

	private String columns;

	private String countsql1;
	
	private String countsql2;

    private boolean distinct;

	private int rowStart=0;
    
    private int rowEnd=10;

    private List<PatientHealthCriteria> oredCriteria;
  
    public PatientHealthArg() {
        oredCriteria = new ArrayList<PatientHealthCriteria>();
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

    public List<PatientHealthCriteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(PatientHealthCriteria criteria) {
        oredCriteria.add(criteria);
    }

    public PatientHealthCriteria or() {
        PatientHealthCriteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public PatientHealthCriteria createCriteria() {
        PatientHealthCriteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected PatientHealthCriteria createCriteriaInternal() {
        PatientHealthCriteria criteria = new PatientHealthCriteria();
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
        protected List<PatientHealthCriterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<PatientHealthCriterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<PatientHealthCriterion> getAllCriteria() {
            return criteria;
        }

        public List<PatientHealthCriterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new PatientHealthCriterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new PatientHealthCriterion(condition, value));
        }

		protected void addCriterion(String condition, Object value, String property,int likeType) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new PatientHealthCriterion(condition, value,likeType));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new PatientHealthCriterion(condition, value1, value2));
        }

		public PatientHealthCriteria andCriterionEqualTo(String criterion) {
			if (StringUtils.isBlank(criterion)) {
				criterion="1=1";
			}
			addCriterion(criterion);
			return (PatientHealthCriteria) this;
		}
				public PatientHealthCriteria andHealthidIsNull() {
			addCriterion("healthId is null");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHealthidIsNotNull() {
			addCriterion("healthId is not null");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHealthidEqualTo(Integer value) {
			addCriterion("healthId =", value, "healthId");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHealthidNotEqualTo(Integer value) {
			addCriterion("healthId <>", value, "healthId");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHealthidGreaterThan(Integer value) {
			addCriterion("healthId >", value, "healthId");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHealthidGreaterThanOrEqualTo(Integer value) {
			addCriterion("healthId >=", value, "healthId");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHealthidLessThan(Integer value) {
			addCriterion("healthId <", value, "healthId");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHealthidLessThanOrEqualTo(Integer value) {
			addCriterion("healthId <=", value, "healthId");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHealthidLike(Integer value) {
			addCriterion("healthId like ", value, "healthId",1);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHealthidNotLike(Integer value) {
			addCriterion("healthId  not like ", value, "healthId",1);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHealthidLeftLike(Integer value) {
			addCriterion("healthId like ", value, "healthId",0);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHealthidNotLeftLike(Integer value) {
			addCriterion("healthId  not like ", value, "healthId",0);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHealthidRightLike(Integer value) {
			addCriterion("healthId like ", value, "healthId",2);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHealthidNotRightLike(Integer value) {
			addCriterion("healthId  not like ", value, "healthId",2);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHealthidIn(List<Integer> values) {
			addCriterion("healthId  in ", values, "healthId");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHealthidNotIn(List<Integer> values) {
			addCriterion("healthId not in ", values, "healthId");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHealthidBetween(Integer value1,Integer value2) {
			addCriterion("healthId between ", value1, value2, "healthId");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHealthidNotBetween(Integer value1,Integer value2) {
			addCriterion("healthId not between ", value1, value2, "healthId");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andPersonidIsNull() {
			addCriterion("personId is null");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andPersonidIsNotNull() {
			addCriterion("personId is not null");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andPersonidEqualTo(Integer value) {
			addCriterion("personId =", value, "personId");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andPersonidNotEqualTo(Integer value) {
			addCriterion("personId <>", value, "personId");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andPersonidGreaterThan(Integer value) {
			addCriterion("personId >", value, "personId");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andPersonidGreaterThanOrEqualTo(Integer value) {
			addCriterion("personId >=", value, "personId");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andPersonidLessThan(Integer value) {
			addCriterion("personId <", value, "personId");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andPersonidLessThanOrEqualTo(Integer value) {
			addCriterion("personId <=", value, "personId");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andPersonidLike(Integer value) {
			addCriterion("personId like ", value, "personId",1);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andPersonidNotLike(Integer value) {
			addCriterion("personId  not like ", value, "personId",1);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andPersonidLeftLike(Integer value) {
			addCriterion("personId like ", value, "personId",0);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andPersonidNotLeftLike(Integer value) {
			addCriterion("personId  not like ", value, "personId",0);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andPersonidRightLike(Integer value) {
			addCriterion("personId like ", value, "personId",2);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andPersonidNotRightLike(Integer value) {
			addCriterion("personId  not like ", value, "personId",2);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andPersonidIn(List<Integer> values) {
			addCriterion("personId  in ", values, "personId");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andPersonidNotIn(List<Integer> values) {
			addCriterion("personId not in ", values, "personId");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andPersonidBetween(Integer value1,Integer value2) {
			addCriterion("personId between ", value1, value2, "personId");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andPersonidNotBetween(Integer value1,Integer value2) {
			addCriterion("personId not between ", value1, value2, "personId");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andWeightIsNull() {
			addCriterion("weight is null");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andWeightIsNotNull() {
			addCriterion("weight is not null");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andWeightEqualTo(BigDecimal value) {
			addCriterion("weight =", value, "weight");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andWeightNotEqualTo(BigDecimal value) {
			addCriterion("weight <>", value, "weight");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andWeightGreaterThan(BigDecimal value) {
			addCriterion("weight >", value, "weight");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("weight >=", value, "weight");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andWeightLessThan(BigDecimal value) {
			addCriterion("weight <", value, "weight");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andWeightLessThanOrEqualTo(BigDecimal value) {
			addCriterion("weight <=", value, "weight");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andWeightLike(BigDecimal value) {
			addCriterion("weight like ", value, "weight",1);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andWeightNotLike(BigDecimal value) {
			addCriterion("weight  not like ", value, "weight",1);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andWeightLeftLike(BigDecimal value) {
			addCriterion("weight like ", value, "weight",0);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andWeightNotLeftLike(BigDecimal value) {
			addCriterion("weight  not like ", value, "weight",0);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andWeightRightLike(BigDecimal value) {
			addCriterion("weight like ", value, "weight",2);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andWeightNotRightLike(BigDecimal value) {
			addCriterion("weight  not like ", value, "weight",2);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andWeightIn(List<BigDecimal> values) {
			addCriterion("weight  in ", values, "weight");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andWeightNotIn(List<BigDecimal> values) {
			addCriterion("weight not in ", values, "weight");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andWeightBetween(BigDecimal value1,BigDecimal value2) {
			addCriterion("weight between ", value1, value2, "weight");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andWeightNotBetween(BigDecimal value1,BigDecimal value2) {
			addCriterion("weight not between ", value1, value2, "weight");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHeightIsNull() {
			addCriterion("height is null");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHeightIsNotNull() {
			addCriterion("height is not null");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHeightEqualTo(BigDecimal value) {
			addCriterion("height =", value, "height");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHeightNotEqualTo(BigDecimal value) {
			addCriterion("height <>", value, "height");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHeightGreaterThan(BigDecimal value) {
			addCriterion("height >", value, "height");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHeightGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("height >=", value, "height");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHeightLessThan(BigDecimal value) {
			addCriterion("height <", value, "height");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHeightLessThanOrEqualTo(BigDecimal value) {
			addCriterion("height <=", value, "height");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHeightLike(BigDecimal value) {
			addCriterion("height like ", value, "height",1);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHeightNotLike(BigDecimal value) {
			addCriterion("height  not like ", value, "height",1);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHeightLeftLike(BigDecimal value) {
			addCriterion("height like ", value, "height",0);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHeightNotLeftLike(BigDecimal value) {
			addCriterion("height  not like ", value, "height",0);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHeightRightLike(BigDecimal value) {
			addCriterion("height like ", value, "height",2);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHeightNotRightLike(BigDecimal value) {
			addCriterion("height  not like ", value, "height",2);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHeightIn(List<BigDecimal> values) {
			addCriterion("height  in ", values, "height");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHeightNotIn(List<BigDecimal> values) {
			addCriterion("height not in ", values, "height");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHeightBetween(BigDecimal value1,BigDecimal value2) {
			addCriterion("height between ", value1, value2, "height");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andHeightNotBetween(BigDecimal value1,BigDecimal value2) {
			addCriterion("height not between ", value1, value2, "height");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andIsfamilydiabetesIsNull() {
			addCriterion("isFamilyDiabetes is null");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andIsfamilydiabetesIsNotNull() {
			addCriterion("isFamilyDiabetes is not null");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andIsfamilydiabetesEqualTo(String value) {
			addCriterion("isFamilyDiabetes =", value, "isFamilyDiabetes");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andIsfamilydiabetesNotEqualTo(String value) {
			addCriterion("isFamilyDiabetes <>", value, "isFamilyDiabetes");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andIsfamilydiabetesGreaterThan(String value) {
			addCriterion("isFamilyDiabetes >", value, "isFamilyDiabetes");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andIsfamilydiabetesGreaterThanOrEqualTo(String value) {
			addCriterion("isFamilyDiabetes >=", value, "isFamilyDiabetes");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andIsfamilydiabetesLessThan(String value) {
			addCriterion("isFamilyDiabetes <", value, "isFamilyDiabetes");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andIsfamilydiabetesLessThanOrEqualTo(String value) {
			addCriterion("isFamilyDiabetes <=", value, "isFamilyDiabetes");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andIsfamilydiabetesLike(String value) {
			addCriterion("isFamilyDiabetes like ", value, "isFamilyDiabetes",1);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andIsfamilydiabetesNotLike(String value) {
			addCriterion("isFamilyDiabetes  not like ", value, "isFamilyDiabetes",1);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andIsfamilydiabetesLeftLike(String value) {
			addCriterion("isFamilyDiabetes like ", value, "isFamilyDiabetes",0);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andIsfamilydiabetesNotLeftLike(String value) {
			addCriterion("isFamilyDiabetes  not like ", value, "isFamilyDiabetes",0);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andIsfamilydiabetesRightLike(String value) {
			addCriterion("isFamilyDiabetes like ", value, "isFamilyDiabetes",2);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andIsfamilydiabetesNotRightLike(String value) {
			addCriterion("isFamilyDiabetes  not like ", value, "isFamilyDiabetes",2);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andIsfamilydiabetesIn(List<String> values) {
			addCriterion("isFamilyDiabetes  in ", values, "isFamilyDiabetes");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andIsfamilydiabetesNotIn(List<String> values) {
			addCriterion("isFamilyDiabetes not in ", values, "isFamilyDiabetes");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andIsfamilydiabetesBetween(String value1,String value2) {
			addCriterion("isFamilyDiabetes between ", value1, value2, "isFamilyDiabetes");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andIsfamilydiabetesNotBetween(String value1,String value2) {
			addCriterion("isFamilyDiabetes not between ", value1, value2, "isFamilyDiabetes");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andCreatetimeIsNull() {
			addCriterion("createTime is null");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andCreatetimeIsNotNull() {
			addCriterion("createTime is not null");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andCreatetimeEqualTo(Date value) {
			addCriterion("createTime =", value, "createTime");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andCreatetimeNotEqualTo(Date value) {
			addCriterion("createTime <>", value, "createTime");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andCreatetimeGreaterThan(Date value) {
			addCriterion("createTime >", value, "createTime");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andCreatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("createTime >=", value, "createTime");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andCreatetimeLessThan(Date value) {
			addCriterion("createTime <", value, "createTime");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andCreatetimeLessThanOrEqualTo(Date value) {
			addCriterion("createTime <=", value, "createTime");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andCreatetimeLike(Date value) {
			addCriterion("createTime like ", value, "createTime",1);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andCreatetimeNotLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",1);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andCreatetimeLeftLike(Date value) {
			addCriterion("createTime like ", value, "createTime",0);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andCreatetimeNotLeftLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",0);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andCreatetimeRightLike(Date value) {
			addCriterion("createTime like ", value, "createTime",2);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andCreatetimeNotRightLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",2);
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andCreatetimeIn(List<Date> values) {
			addCriterion("createTime  in ", values, "createTime");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andCreatetimeNotIn(List<Date> values) {
			addCriterion("createTime not in ", values, "createTime");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andCreatetimeBetween(Date value1,Date value2) {
			addCriterion("createTime between ", value1, value2, "createTime");
			return (PatientHealthCriteria) this;
		}

		public PatientHealthCriteria andCreatetimeNotBetween(Date value1,Date value2) {
			addCriterion("createTime not between ", value1, value2, "createTime");
			return (PatientHealthCriteria) this;
		}

    }

    public static class PatientHealthCriteria extends GeneratedCriteria {

        protected PatientHealthCriteria() {
            super();
        }
    }

    public static class PatientHealthCriterion {
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

        protected PatientHealthCriterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

		protected PatientHealthCriterion(String condition, Object value, int likeType) {
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

        protected PatientHealthCriterion(String condition, Object value, String typeHandler) {
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

        protected PatientHealthCriterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected PatientHealthCriterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected PatientHealthCriterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}