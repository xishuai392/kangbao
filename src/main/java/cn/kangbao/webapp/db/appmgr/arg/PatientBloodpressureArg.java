package cn.kangbao.webapp.db.appmgr.arg;

import java.util.*;
import java.math.*;
import org.apache.commons.lang.*;

public class PatientBloodpressureArg {
	private String pk_name = "measurementId";
    private String orderByClause;

	private String groupByClause;

	private String columns;

	private String countsql1;
	
	private String countsql2;

    private boolean distinct;

	private int rowStart=0;
    
    private int rowEnd=10;

    private List<PatientBloodpressureCriteria> oredCriteria;
  
    public PatientBloodpressureArg() {
        oredCriteria = new ArrayList<PatientBloodpressureCriteria>();
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

    public List<PatientBloodpressureCriteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(PatientBloodpressureCriteria criteria) {
        oredCriteria.add(criteria);
    }

    public PatientBloodpressureCriteria or() {
        PatientBloodpressureCriteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public PatientBloodpressureCriteria createCriteria() {
        PatientBloodpressureCriteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected PatientBloodpressureCriteria createCriteriaInternal() {
        PatientBloodpressureCriteria criteria = new PatientBloodpressureCriteria();
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
        protected List<PatientBloodpressureCriterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<PatientBloodpressureCriterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<PatientBloodpressureCriterion> getAllCriteria() {
            return criteria;
        }

        public List<PatientBloodpressureCriterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new PatientBloodpressureCriterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new PatientBloodpressureCriterion(condition, value));
        }

		protected void addCriterion(String condition, Object value, String property,int likeType) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new PatientBloodpressureCriterion(condition, value,likeType));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new PatientBloodpressureCriterion(condition, value1, value2));
        }

		public PatientBloodpressureCriteria andCriterionEqualTo(String criterion) {
			if (StringUtils.isBlank(criterion)) {
				criterion="1=1";
			}
			addCriterion(criterion);
			return (PatientBloodpressureCriteria) this;
		}
				public PatientBloodpressureCriteria andMeasurementidIsNull() {
			addCriterion("measurementId is null");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andMeasurementidIsNotNull() {
			addCriterion("measurementId is not null");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andMeasurementidEqualTo(Integer value) {
			addCriterion("measurementId =", value, "measurementId");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andMeasurementidNotEqualTo(Integer value) {
			addCriterion("measurementId <>", value, "measurementId");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andMeasurementidGreaterThan(Integer value) {
			addCriterion("measurementId >", value, "measurementId");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andMeasurementidGreaterThanOrEqualTo(Integer value) {
			addCriterion("measurementId >=", value, "measurementId");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andMeasurementidLessThan(Integer value) {
			addCriterion("measurementId <", value, "measurementId");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andMeasurementidLessThanOrEqualTo(Integer value) {
			addCriterion("measurementId <=", value, "measurementId");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andMeasurementidLike(Integer value) {
			addCriterion("measurementId like ", value, "measurementId",1);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andMeasurementidNotLike(Integer value) {
			addCriterion("measurementId  not like ", value, "measurementId",1);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andMeasurementidLeftLike(Integer value) {
			addCriterion("measurementId like ", value, "measurementId",0);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andMeasurementidNotLeftLike(Integer value) {
			addCriterion("measurementId  not like ", value, "measurementId",0);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andMeasurementidRightLike(Integer value) {
			addCriterion("measurementId like ", value, "measurementId",2);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andMeasurementidNotRightLike(Integer value) {
			addCriterion("measurementId  not like ", value, "measurementId",2);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andMeasurementidIn(List<Integer> values) {
			addCriterion("measurementId  in ", values, "measurementId");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andMeasurementidNotIn(List<Integer> values) {
			addCriterion("measurementId not in ", values, "measurementId");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andMeasurementidBetween(Integer value1,Integer value2) {
			addCriterion("measurementId between ", value1, value2, "measurementId");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andMeasurementidNotBetween(Integer value1,Integer value2) {
			addCriterion("measurementId not between ", value1, value2, "measurementId");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andPersonidIsNull() {
			addCriterion("personid is null");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andPersonidIsNotNull() {
			addCriterion("personid is not null");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andPersonidEqualTo(Integer value) {
			addCriterion("personid =", value, "personid");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andPersonidNotEqualTo(Integer value) {
			addCriterion("personid <>", value, "personid");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andPersonidGreaterThan(Integer value) {
			addCriterion("personid >", value, "personid");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andPersonidGreaterThanOrEqualTo(Integer value) {
			addCriterion("personid >=", value, "personid");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andPersonidLessThan(Integer value) {
			addCriterion("personid <", value, "personid");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andPersonidLessThanOrEqualTo(Integer value) {
			addCriterion("personid <=", value, "personid");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andPersonidLike(Integer value) {
			addCriterion("personid like ", value, "personid",1);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andPersonidNotLike(Integer value) {
			addCriterion("personid  not like ", value, "personid",1);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andPersonidLeftLike(Integer value) {
			addCriterion("personid like ", value, "personid",0);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andPersonidNotLeftLike(Integer value) {
			addCriterion("personid  not like ", value, "personid",0);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andPersonidRightLike(Integer value) {
			addCriterion("personid like ", value, "personid",2);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andPersonidNotRightLike(Integer value) {
			addCriterion("personid  not like ", value, "personid",2);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andPersonidIn(List<Integer> values) {
			addCriterion("personid  in ", values, "personid");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andPersonidNotIn(List<Integer> values) {
			addCriterion("personid not in ", values, "personid");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andPersonidBetween(Integer value1,Integer value2) {
			addCriterion("personid between ", value1, value2, "personid");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andPersonidNotBetween(Integer value1,Integer value2) {
			addCriterion("personid not between ", value1, value2, "personid");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andUpnumIsNull() {
			addCriterion("upNum is null");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andUpnumIsNotNull() {
			addCriterion("upNum is not null");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andUpnumEqualTo(Integer value) {
			addCriterion("upNum =", value, "upNum");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andUpnumNotEqualTo(Integer value) {
			addCriterion("upNum <>", value, "upNum");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andUpnumGreaterThan(Integer value) {
			addCriterion("upNum >", value, "upNum");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andUpnumGreaterThanOrEqualTo(Integer value) {
			addCriterion("upNum >=", value, "upNum");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andUpnumLessThan(Integer value) {
			addCriterion("upNum <", value, "upNum");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andUpnumLessThanOrEqualTo(Integer value) {
			addCriterion("upNum <=", value, "upNum");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andUpnumLike(Integer value) {
			addCriterion("upNum like ", value, "upNum",1);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andUpnumNotLike(Integer value) {
			addCriterion("upNum  not like ", value, "upNum",1);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andUpnumLeftLike(Integer value) {
			addCriterion("upNum like ", value, "upNum",0);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andUpnumNotLeftLike(Integer value) {
			addCriterion("upNum  not like ", value, "upNum",0);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andUpnumRightLike(Integer value) {
			addCriterion("upNum like ", value, "upNum",2);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andUpnumNotRightLike(Integer value) {
			addCriterion("upNum  not like ", value, "upNum",2);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andUpnumIn(List<Integer> values) {
			addCriterion("upNum  in ", values, "upNum");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andUpnumNotIn(List<Integer> values) {
			addCriterion("upNum not in ", values, "upNum");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andUpnumBetween(Integer value1,Integer value2) {
			addCriterion("upNum between ", value1, value2, "upNum");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andUpnumNotBetween(Integer value1,Integer value2) {
			addCriterion("upNum not between ", value1, value2, "upNum");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andDownnumIsNull() {
			addCriterion("downNum is null");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andDownnumIsNotNull() {
			addCriterion("downNum is not null");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andDownnumEqualTo(Integer value) {
			addCriterion("downNum =", value, "downNum");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andDownnumNotEqualTo(Integer value) {
			addCriterion("downNum <>", value, "downNum");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andDownnumGreaterThan(Integer value) {
			addCriterion("downNum >", value, "downNum");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andDownnumGreaterThanOrEqualTo(Integer value) {
			addCriterion("downNum >=", value, "downNum");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andDownnumLessThan(Integer value) {
			addCriterion("downNum <", value, "downNum");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andDownnumLessThanOrEqualTo(Integer value) {
			addCriterion("downNum <=", value, "downNum");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andDownnumLike(Integer value) {
			addCriterion("downNum like ", value, "downNum",1);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andDownnumNotLike(Integer value) {
			addCriterion("downNum  not like ", value, "downNum",1);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andDownnumLeftLike(Integer value) {
			addCriterion("downNum like ", value, "downNum",0);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andDownnumNotLeftLike(Integer value) {
			addCriterion("downNum  not like ", value, "downNum",0);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andDownnumRightLike(Integer value) {
			addCriterion("downNum like ", value, "downNum",2);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andDownnumNotRightLike(Integer value) {
			addCriterion("downNum  not like ", value, "downNum",2);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andDownnumIn(List<Integer> values) {
			addCriterion("downNum  in ", values, "downNum");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andDownnumNotIn(List<Integer> values) {
			addCriterion("downNum not in ", values, "downNum");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andDownnumBetween(Integer value1,Integer value2) {
			addCriterion("downNum between ", value1, value2, "downNum");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andDownnumNotBetween(Integer value1,Integer value2) {
			addCriterion("downNum not between ", value1, value2, "downNum");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andHeartrateIsNull() {
			addCriterion("heartRate is null");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andHeartrateIsNotNull() {
			addCriterion("heartRate is not null");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andHeartrateEqualTo(Integer value) {
			addCriterion("heartRate =", value, "heartRate");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andHeartrateNotEqualTo(Integer value) {
			addCriterion("heartRate <>", value, "heartRate");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andHeartrateGreaterThan(Integer value) {
			addCriterion("heartRate >", value, "heartRate");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andHeartrateGreaterThanOrEqualTo(Integer value) {
			addCriterion("heartRate >=", value, "heartRate");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andHeartrateLessThan(Integer value) {
			addCriterion("heartRate <", value, "heartRate");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andHeartrateLessThanOrEqualTo(Integer value) {
			addCriterion("heartRate <=", value, "heartRate");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andHeartrateLike(Integer value) {
			addCriterion("heartRate like ", value, "heartRate",1);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andHeartrateNotLike(Integer value) {
			addCriterion("heartRate  not like ", value, "heartRate",1);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andHeartrateLeftLike(Integer value) {
			addCriterion("heartRate like ", value, "heartRate",0);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andHeartrateNotLeftLike(Integer value) {
			addCriterion("heartRate  not like ", value, "heartRate",0);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andHeartrateRightLike(Integer value) {
			addCriterion("heartRate like ", value, "heartRate",2);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andHeartrateNotRightLike(Integer value) {
			addCriterion("heartRate  not like ", value, "heartRate",2);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andHeartrateIn(List<Integer> values) {
			addCriterion("heartRate  in ", values, "heartRate");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andHeartrateNotIn(List<Integer> values) {
			addCriterion("heartRate not in ", values, "heartRate");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andHeartrateBetween(Integer value1,Integer value2) {
			addCriterion("heartRate between ", value1, value2, "heartRate");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andHeartrateNotBetween(Integer value1,Integer value2) {
			addCriterion("heartRate not between ", value1, value2, "heartRate");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andFeelingdescriptionIsNull() {
			addCriterion("feelingDescription is null");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andFeelingdescriptionIsNotNull() {
			addCriterion("feelingDescription is not null");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andFeelingdescriptionEqualTo(String value) {
			addCriterion("feelingDescription =", value, "feelingDescription");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andFeelingdescriptionNotEqualTo(String value) {
			addCriterion("feelingDescription <>", value, "feelingDescription");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andFeelingdescriptionGreaterThan(String value) {
			addCriterion("feelingDescription >", value, "feelingDescription");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andFeelingdescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("feelingDescription >=", value, "feelingDescription");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andFeelingdescriptionLessThan(String value) {
			addCriterion("feelingDescription <", value, "feelingDescription");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andFeelingdescriptionLessThanOrEqualTo(String value) {
			addCriterion("feelingDescription <=", value, "feelingDescription");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andFeelingdescriptionLike(String value) {
			addCriterion("feelingDescription like ", value, "feelingDescription",1);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andFeelingdescriptionNotLike(String value) {
			addCriterion("feelingDescription  not like ", value, "feelingDescription",1);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andFeelingdescriptionLeftLike(String value) {
			addCriterion("feelingDescription like ", value, "feelingDescription",0);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andFeelingdescriptionNotLeftLike(String value) {
			addCriterion("feelingDescription  not like ", value, "feelingDescription",0);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andFeelingdescriptionRightLike(String value) {
			addCriterion("feelingDescription like ", value, "feelingDescription",2);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andFeelingdescriptionNotRightLike(String value) {
			addCriterion("feelingDescription  not like ", value, "feelingDescription",2);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andFeelingdescriptionIn(List<String> values) {
			addCriterion("feelingDescription  in ", values, "feelingDescription");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andFeelingdescriptionNotIn(List<String> values) {
			addCriterion("feelingDescription not in ", values, "feelingDescription");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andFeelingdescriptionBetween(String value1,String value2) {
			addCriterion("feelingDescription between ", value1, value2, "feelingDescription");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andFeelingdescriptionNotBetween(String value1,String value2) {
			addCriterion("feelingDescription not between ", value1, value2, "feelingDescription");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andCreatetimeIsNull() {
			addCriterion("createTime is null");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andCreatetimeIsNotNull() {
			addCriterion("createTime is not null");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andCreatetimeEqualTo(Date value) {
			addCriterion("createTime =", value, "createTime");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andCreatetimeNotEqualTo(Date value) {
			addCriterion("createTime <>", value, "createTime");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andCreatetimeGreaterThan(Date value) {
			addCriterion("createTime >", value, "createTime");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andCreatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("createTime >=", value, "createTime");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andCreatetimeLessThan(Date value) {
			addCriterion("createTime <", value, "createTime");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andCreatetimeLessThanOrEqualTo(Date value) {
			addCriterion("createTime <=", value, "createTime");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andCreatetimeLike(Date value) {
			addCriterion("createTime like ", value, "createTime",1);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andCreatetimeNotLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",1);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andCreatetimeLeftLike(Date value) {
			addCriterion("createTime like ", value, "createTime",0);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andCreatetimeNotLeftLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",0);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andCreatetimeRightLike(Date value) {
			addCriterion("createTime like ", value, "createTime",2);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andCreatetimeNotRightLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",2);
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andCreatetimeIn(List<Date> values) {
			addCriterion("createTime  in ", values, "createTime");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andCreatetimeNotIn(List<Date> values) {
			addCriterion("createTime not in ", values, "createTime");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andCreatetimeBetween(Date value1,Date value2) {
			addCriterion("createTime between ", value1, value2, "createTime");
			return (PatientBloodpressureCriteria) this;
		}

		public PatientBloodpressureCriteria andCreatetimeNotBetween(Date value1,Date value2) {
			addCriterion("createTime not between ", value1, value2, "createTime");
			return (PatientBloodpressureCriteria) this;
		}

    }

    public static class PatientBloodpressureCriteria extends GeneratedCriteria {

        protected PatientBloodpressureCriteria() {
            super();
        }
    }

    public static class PatientBloodpressureCriterion {
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

        protected PatientBloodpressureCriterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

		protected PatientBloodpressureCriterion(String condition, Object value, int likeType) {
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

        protected PatientBloodpressureCriterion(String condition, Object value, String typeHandler) {
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

        protected PatientBloodpressureCriterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected PatientBloodpressureCriterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected PatientBloodpressureCriterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}