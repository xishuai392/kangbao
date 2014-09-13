package cn.kangbao.webapp.db.appmgr.arg;

import java.util.*;
import java.math.*;
import org.apache.commons.lang.*;

public class PatientBloodsugarArg {
	private String pk_name = "bloodSugarId";
    private String orderByClause;

	private String groupByClause;

	private String columns;

	private String countsql1;
	
	private String countsql2;

    private boolean distinct;

	private int rowStart=0;
    
    private int rowEnd=10;

    private List<PatientBloodsugarCriteria> oredCriteria;
  
    public PatientBloodsugarArg() {
        oredCriteria = new ArrayList<PatientBloodsugarCriteria>();
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

    public List<PatientBloodsugarCriteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(PatientBloodsugarCriteria criteria) {
        oredCriteria.add(criteria);
    }

    public PatientBloodsugarCriteria or() {
        PatientBloodsugarCriteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public PatientBloodsugarCriteria createCriteria() {
        PatientBloodsugarCriteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected PatientBloodsugarCriteria createCriteriaInternal() {
        PatientBloodsugarCriteria criteria = new PatientBloodsugarCriteria();
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
        protected List<PatientBloodsugarCriterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<PatientBloodsugarCriterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<PatientBloodsugarCriterion> getAllCriteria() {
            return criteria;
        }

        public List<PatientBloodsugarCriterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new PatientBloodsugarCriterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new PatientBloodsugarCriterion(condition, value));
        }

		protected void addCriterion(String condition, Object value, String property,int likeType) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new PatientBloodsugarCriterion(condition, value,likeType));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new PatientBloodsugarCriterion(condition, value1, value2));
        }

		public PatientBloodsugarCriteria andCriterionEqualTo(String criterion) {
			if (StringUtils.isBlank(criterion)) {
				criterion="1=1";
			}
			addCriterion(criterion);
			return (PatientBloodsugarCriteria) this;
		}
				public PatientBloodsugarCriteria andBloodsugaridIsNull() {
			addCriterion("bloodSugarId is null");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugaridIsNotNull() {
			addCriterion("bloodSugarId is not null");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugaridEqualTo(Integer value) {
			addCriterion("bloodSugarId =", value, "bloodSugarId");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugaridNotEqualTo(Integer value) {
			addCriterion("bloodSugarId <>", value, "bloodSugarId");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugaridGreaterThan(Integer value) {
			addCriterion("bloodSugarId >", value, "bloodSugarId");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugaridGreaterThanOrEqualTo(Integer value) {
			addCriterion("bloodSugarId >=", value, "bloodSugarId");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugaridLessThan(Integer value) {
			addCriterion("bloodSugarId <", value, "bloodSugarId");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugaridLessThanOrEqualTo(Integer value) {
			addCriterion("bloodSugarId <=", value, "bloodSugarId");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugaridLike(Integer value) {
			addCriterion("bloodSugarId like ", value, "bloodSugarId",1);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugaridNotLike(Integer value) {
			addCriterion("bloodSugarId  not like ", value, "bloodSugarId",1);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugaridLeftLike(Integer value) {
			addCriterion("bloodSugarId like ", value, "bloodSugarId",0);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugaridNotLeftLike(Integer value) {
			addCriterion("bloodSugarId  not like ", value, "bloodSugarId",0);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugaridRightLike(Integer value) {
			addCriterion("bloodSugarId like ", value, "bloodSugarId",2);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugaridNotRightLike(Integer value) {
			addCriterion("bloodSugarId  not like ", value, "bloodSugarId",2);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugaridIn(List<Integer> values) {
			addCriterion("bloodSugarId  in ", values, "bloodSugarId");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugaridNotIn(List<Integer> values) {
			addCriterion("bloodSugarId not in ", values, "bloodSugarId");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugaridBetween(Integer value1,Integer value2) {
			addCriterion("bloodSugarId between ", value1, value2, "bloodSugarId");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugaridNotBetween(Integer value1,Integer value2) {
			addCriterion("bloodSugarId not between ", value1, value2, "bloodSugarId");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugarnumIsNull() {
			addCriterion("bloodSugarNum is null");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugarnumIsNotNull() {
			addCriterion("bloodSugarNum is not null");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugarnumEqualTo(BigDecimal value) {
			addCriterion("bloodSugarNum =", value, "bloodSugarNum");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugarnumNotEqualTo(BigDecimal value) {
			addCriterion("bloodSugarNum <>", value, "bloodSugarNum");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugarnumGreaterThan(BigDecimal value) {
			addCriterion("bloodSugarNum >", value, "bloodSugarNum");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugarnumGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("bloodSugarNum >=", value, "bloodSugarNum");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugarnumLessThan(BigDecimal value) {
			addCriterion("bloodSugarNum <", value, "bloodSugarNum");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugarnumLessThanOrEqualTo(BigDecimal value) {
			addCriterion("bloodSugarNum <=", value, "bloodSugarNum");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugarnumLike(BigDecimal value) {
			addCriterion("bloodSugarNum like ", value, "bloodSugarNum",1);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugarnumNotLike(BigDecimal value) {
			addCriterion("bloodSugarNum  not like ", value, "bloodSugarNum",1);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugarnumLeftLike(BigDecimal value) {
			addCriterion("bloodSugarNum like ", value, "bloodSugarNum",0);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugarnumNotLeftLike(BigDecimal value) {
			addCriterion("bloodSugarNum  not like ", value, "bloodSugarNum",0);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugarnumRightLike(BigDecimal value) {
			addCriterion("bloodSugarNum like ", value, "bloodSugarNum",2);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugarnumNotRightLike(BigDecimal value) {
			addCriterion("bloodSugarNum  not like ", value, "bloodSugarNum",2);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugarnumIn(List<BigDecimal> values) {
			addCriterion("bloodSugarNum  in ", values, "bloodSugarNum");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugarnumNotIn(List<BigDecimal> values) {
			addCriterion("bloodSugarNum not in ", values, "bloodSugarNum");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugarnumBetween(BigDecimal value1,BigDecimal value2) {
			addCriterion("bloodSugarNum between ", value1, value2, "bloodSugarNum");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andBloodsugarnumNotBetween(BigDecimal value1,BigDecimal value2) {
			addCriterion("bloodSugarNum not between ", value1, value2, "bloodSugarNum");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andInfluenceIsNull() {
			addCriterion("influence is null");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andInfluenceIsNotNull() {
			addCriterion("influence is not null");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andInfluenceEqualTo(String value) {
			addCriterion("influence =", value, "influence");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andInfluenceNotEqualTo(String value) {
			addCriterion("influence <>", value, "influence");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andInfluenceGreaterThan(String value) {
			addCriterion("influence >", value, "influence");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andInfluenceGreaterThanOrEqualTo(String value) {
			addCriterion("influence >=", value, "influence");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andInfluenceLessThan(String value) {
			addCriterion("influence <", value, "influence");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andInfluenceLessThanOrEqualTo(String value) {
			addCriterion("influence <=", value, "influence");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andInfluenceLike(String value) {
			addCriterion("influence like ", value, "influence",1);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andInfluenceNotLike(String value) {
			addCriterion("influence  not like ", value, "influence",1);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andInfluenceLeftLike(String value) {
			addCriterion("influence like ", value, "influence",0);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andInfluenceNotLeftLike(String value) {
			addCriterion("influence  not like ", value, "influence",0);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andInfluenceRightLike(String value) {
			addCriterion("influence like ", value, "influence",2);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andInfluenceNotRightLike(String value) {
			addCriterion("influence  not like ", value, "influence",2);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andInfluenceIn(List<String> values) {
			addCriterion("influence  in ", values, "influence");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andInfluenceNotIn(List<String> values) {
			addCriterion("influence not in ", values, "influence");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andInfluenceBetween(String value1,String value2) {
			addCriterion("influence between ", value1, value2, "influence");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andInfluenceNotBetween(String value1,String value2) {
			addCriterion("influence not between ", value1, value2, "influence");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andPersonidIsNull() {
			addCriterion("personId is null");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andPersonidIsNotNull() {
			addCriterion("personId is not null");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andPersonidEqualTo(Integer value) {
			addCriterion("personId =", value, "personId");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andPersonidNotEqualTo(Integer value) {
			addCriterion("personId <>", value, "personId");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andPersonidGreaterThan(Integer value) {
			addCriterion("personId >", value, "personId");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andPersonidGreaterThanOrEqualTo(Integer value) {
			addCriterion("personId >=", value, "personId");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andPersonidLessThan(Integer value) {
			addCriterion("personId <", value, "personId");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andPersonidLessThanOrEqualTo(Integer value) {
			addCriterion("personId <=", value, "personId");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andPersonidLike(Integer value) {
			addCriterion("personId like ", value, "personId",1);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andPersonidNotLike(Integer value) {
			addCriterion("personId  not like ", value, "personId",1);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andPersonidLeftLike(Integer value) {
			addCriterion("personId like ", value, "personId",0);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andPersonidNotLeftLike(Integer value) {
			addCriterion("personId  not like ", value, "personId",0);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andPersonidRightLike(Integer value) {
			addCriterion("personId like ", value, "personId",2);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andPersonidNotRightLike(Integer value) {
			addCriterion("personId  not like ", value, "personId",2);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andPersonidIn(List<Integer> values) {
			addCriterion("personId  in ", values, "personId");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andPersonidNotIn(List<Integer> values) {
			addCriterion("personId not in ", values, "personId");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andPersonidBetween(Integer value1,Integer value2) {
			addCriterion("personId between ", value1, value2, "personId");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andPersonidNotBetween(Integer value1,Integer value2) {
			addCriterion("personId not between ", value1, value2, "personId");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTestperiodIsNull() {
			addCriterion("testPeriod is null");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTestperiodIsNotNull() {
			addCriterion("testPeriod is not null");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTestperiodEqualTo(String value) {
			addCriterion("testPeriod =", value, "testPeriod");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTestperiodNotEqualTo(String value) {
			addCriterion("testPeriod <>", value, "testPeriod");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTestperiodGreaterThan(String value) {
			addCriterion("testPeriod >", value, "testPeriod");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTestperiodGreaterThanOrEqualTo(String value) {
			addCriterion("testPeriod >=", value, "testPeriod");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTestperiodLessThan(String value) {
			addCriterion("testPeriod <", value, "testPeriod");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTestperiodLessThanOrEqualTo(String value) {
			addCriterion("testPeriod <=", value, "testPeriod");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTestperiodLike(String value) {
			addCriterion("testPeriod like ", value, "testPeriod",1);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTestperiodNotLike(String value) {
			addCriterion("testPeriod  not like ", value, "testPeriod",1);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTestperiodLeftLike(String value) {
			addCriterion("testPeriod like ", value, "testPeriod",0);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTestperiodNotLeftLike(String value) {
			addCriterion("testPeriod  not like ", value, "testPeriod",0);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTestperiodRightLike(String value) {
			addCriterion("testPeriod like ", value, "testPeriod",2);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTestperiodNotRightLike(String value) {
			addCriterion("testPeriod  not like ", value, "testPeriod",2);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTestperiodIn(List<String> values) {
			addCriterion("testPeriod  in ", values, "testPeriod");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTestperiodNotIn(List<String> values) {
			addCriterion("testPeriod not in ", values, "testPeriod");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTestperiodBetween(String value1,String value2) {
			addCriterion("testPeriod between ", value1, value2, "testPeriod");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTestperiodNotBetween(String value1,String value2) {
			addCriterion("testPeriod not between ", value1, value2, "testPeriod");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTesttimeIsNull() {
			addCriterion("testTime is null");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTesttimeIsNotNull() {
			addCriterion("testTime is not null");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTesttimeEqualTo(Date value) {
			addCriterion("testTime =", value, "testTime");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTesttimeNotEqualTo(Date value) {
			addCriterion("testTime <>", value, "testTime");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTesttimeGreaterThan(Date value) {
			addCriterion("testTime >", value, "testTime");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTesttimeGreaterThanOrEqualTo(Date value) {
			addCriterion("testTime >=", value, "testTime");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTesttimeLessThan(Date value) {
			addCriterion("testTime <", value, "testTime");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTesttimeLessThanOrEqualTo(Date value) {
			addCriterion("testTime <=", value, "testTime");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTesttimeLike(Date value) {
			addCriterion("testTime like ", value, "testTime",1);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTesttimeNotLike(Date value) {
			addCriterion("testTime  not like ", value, "testTime",1);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTesttimeLeftLike(Date value) {
			addCriterion("testTime like ", value, "testTime",0);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTesttimeNotLeftLike(Date value) {
			addCriterion("testTime  not like ", value, "testTime",0);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTesttimeRightLike(Date value) {
			addCriterion("testTime like ", value, "testTime",2);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTesttimeNotRightLike(Date value) {
			addCriterion("testTime  not like ", value, "testTime",2);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTesttimeIn(List<Date> values) {
			addCriterion("testTime  in ", values, "testTime");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTesttimeNotIn(List<Date> values) {
			addCriterion("testTime not in ", values, "testTime");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTesttimeBetween(Date value1,Date value2) {
			addCriterion("testTime between ", value1, value2, "testTime");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andTesttimeNotBetween(Date value1,Date value2) {
			addCriterion("testTime not between ", value1, value2, "testTime");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andCreatetimeIsNull() {
			addCriterion("createTime is null");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andCreatetimeIsNotNull() {
			addCriterion("createTime is not null");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andCreatetimeEqualTo(Date value) {
			addCriterion("createTime =", value, "createTime");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andCreatetimeNotEqualTo(Date value) {
			addCriterion("createTime <>", value, "createTime");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andCreatetimeGreaterThan(Date value) {
			addCriterion("createTime >", value, "createTime");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andCreatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("createTime >=", value, "createTime");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andCreatetimeLessThan(Date value) {
			addCriterion("createTime <", value, "createTime");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andCreatetimeLessThanOrEqualTo(Date value) {
			addCriterion("createTime <=", value, "createTime");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andCreatetimeLike(Date value) {
			addCriterion("createTime like ", value, "createTime",1);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andCreatetimeNotLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",1);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andCreatetimeLeftLike(Date value) {
			addCriterion("createTime like ", value, "createTime",0);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andCreatetimeNotLeftLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",0);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andCreatetimeRightLike(Date value) {
			addCriterion("createTime like ", value, "createTime",2);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andCreatetimeNotRightLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",2);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andCreatetimeIn(List<Date> values) {
			addCriterion("createTime  in ", values, "createTime");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andCreatetimeNotIn(List<Date> values) {
			addCriterion("createTime not in ", values, "createTime");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andCreatetimeBetween(Date value1,Date value2) {
			addCriterion("createTime between ", value1, value2, "createTime");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andCreatetimeNotBetween(Date value1,Date value2) {
			addCriterion("createTime not between ", value1, value2, "createTime");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andDrIsNull() {
			addCriterion("dr is null");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andDrIsNotNull() {
			addCriterion("dr is not null");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andDrEqualTo(Integer value) {
			addCriterion("dr =", value, "dr");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andDrNotEqualTo(Integer value) {
			addCriterion("dr <>", value, "dr");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andDrGreaterThan(Integer value) {
			addCriterion("dr >", value, "dr");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andDrGreaterThanOrEqualTo(Integer value) {
			addCriterion("dr >=", value, "dr");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andDrLessThan(Integer value) {
			addCriterion("dr <", value, "dr");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andDrLessThanOrEqualTo(Integer value) {
			addCriterion("dr <=", value, "dr");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andDrLike(Integer value) {
			addCriterion("dr like ", value, "dr",1);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andDrNotLike(Integer value) {
			addCriterion("dr  not like ", value, "dr",1);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andDrLeftLike(Integer value) {
			addCriterion("dr like ", value, "dr",0);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andDrNotLeftLike(Integer value) {
			addCriterion("dr  not like ", value, "dr",0);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andDrRightLike(Integer value) {
			addCriterion("dr like ", value, "dr",2);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andDrNotRightLike(Integer value) {
			addCriterion("dr  not like ", value, "dr",2);
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andDrIn(List<Integer> values) {
			addCriterion("dr  in ", values, "dr");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andDrNotIn(List<Integer> values) {
			addCriterion("dr not in ", values, "dr");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andDrBetween(Integer value1,Integer value2) {
			addCriterion("dr between ", value1, value2, "dr");
			return (PatientBloodsugarCriteria) this;
		}

		public PatientBloodsugarCriteria andDrNotBetween(Integer value1,Integer value2) {
			addCriterion("dr not between ", value1, value2, "dr");
			return (PatientBloodsugarCriteria) this;
		}

    }

    public static class PatientBloodsugarCriteria extends GeneratedCriteria {

        protected PatientBloodsugarCriteria() {
            super();
        }
    }

    public static class PatientBloodsugarCriterion {
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

        protected PatientBloodsugarCriterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

		protected PatientBloodsugarCriterion(String condition, Object value, int likeType) {
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

        protected PatientBloodsugarCriterion(String condition, Object value, String typeHandler) {
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

        protected PatientBloodsugarCriterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected PatientBloodsugarCriterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected PatientBloodsugarCriterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}