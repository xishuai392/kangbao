package cn.kangbao.webapp.db.appmgr.arg;

import java.util.*;
import java.math.*;
import org.apache.commons.lang.*;

public class HospitalDoctorArg {
	private String pk_name = "hospitalDoctorId";
    private String orderByClause;

	private String groupByClause;

	private String columns;

	private String countsql1;
	
	private String countsql2;

    private boolean distinct;

	private int rowStart=0;
    
    private int rowEnd=10;

    private List<HospitalDoctorCriteria> oredCriteria;
  
    public HospitalDoctorArg() {
        oredCriteria = new ArrayList<HospitalDoctorCriteria>();
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

    public List<HospitalDoctorCriteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(HospitalDoctorCriteria criteria) {
        oredCriteria.add(criteria);
    }

    public HospitalDoctorCriteria or() {
        HospitalDoctorCriteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public HospitalDoctorCriteria createCriteria() {
        HospitalDoctorCriteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected HospitalDoctorCriteria createCriteriaInternal() {
        HospitalDoctorCriteria criteria = new HospitalDoctorCriteria();
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
        protected List<HospitalDoctorCriterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<HospitalDoctorCriterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<HospitalDoctorCriterion> getAllCriteria() {
            return criteria;
        }

        public List<HospitalDoctorCriterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new HospitalDoctorCriterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new HospitalDoctorCriterion(condition, value));
        }

		protected void addCriterion(String condition, Object value, String property,int likeType) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new HospitalDoctorCriterion(condition, value,likeType));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new HospitalDoctorCriterion(condition, value1, value2));
        }

		public HospitalDoctorCriteria andCriterionEqualTo(String criterion) {
			if (StringUtils.isBlank(criterion)) {
				criterion="1=1";
			}
			addCriterion(criterion);
			return (HospitalDoctorCriteria) this;
		}
				public HospitalDoctorCriteria andHospitaldoctoridIsNull() {
			addCriterion("hospitalDoctorId is null");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitaldoctoridIsNotNull() {
			addCriterion("hospitalDoctorId is not null");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitaldoctoridEqualTo(Integer value) {
			addCriterion("hospitalDoctorId =", value, "hospitalDoctorId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitaldoctoridNotEqualTo(Integer value) {
			addCriterion("hospitalDoctorId <>", value, "hospitalDoctorId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitaldoctoridGreaterThan(Integer value) {
			addCriterion("hospitalDoctorId >", value, "hospitalDoctorId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitaldoctoridGreaterThanOrEqualTo(Integer value) {
			addCriterion("hospitalDoctorId >=", value, "hospitalDoctorId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitaldoctoridLessThan(Integer value) {
			addCriterion("hospitalDoctorId <", value, "hospitalDoctorId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitaldoctoridLessThanOrEqualTo(Integer value) {
			addCriterion("hospitalDoctorId <=", value, "hospitalDoctorId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitaldoctoridLike(Integer value) {
			addCriterion("hospitalDoctorId like ", value, "hospitalDoctorId",1);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitaldoctoridNotLike(Integer value) {
			addCriterion("hospitalDoctorId  not like ", value, "hospitalDoctorId",1);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitaldoctoridLeftLike(Integer value) {
			addCriterion("hospitalDoctorId like ", value, "hospitalDoctorId",0);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitaldoctoridNotLeftLike(Integer value) {
			addCriterion("hospitalDoctorId  not like ", value, "hospitalDoctorId",0);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitaldoctoridRightLike(Integer value) {
			addCriterion("hospitalDoctorId like ", value, "hospitalDoctorId",2);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitaldoctoridNotRightLike(Integer value) {
			addCriterion("hospitalDoctorId  not like ", value, "hospitalDoctorId",2);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitaldoctoridIn(List<Integer> values) {
			addCriterion("hospitalDoctorId  in ", values, "hospitalDoctorId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitaldoctoridNotIn(List<Integer> values) {
			addCriterion("hospitalDoctorId not in ", values, "hospitalDoctorId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitaldoctoridBetween(Integer value1,Integer value2) {
			addCriterion("hospitalDoctorId between ", value1, value2, "hospitalDoctorId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitaldoctoridNotBetween(Integer value1,Integer value2) {
			addCriterion("hospitalDoctorId not between ", value1, value2, "hospitalDoctorId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitalidIsNull() {
			addCriterion("hospitalId is null");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitalidIsNotNull() {
			addCriterion("hospitalId is not null");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitalidEqualTo(Integer value) {
			addCriterion("hospitalId =", value, "hospitalId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitalidNotEqualTo(Integer value) {
			addCriterion("hospitalId <>", value, "hospitalId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitalidGreaterThan(Integer value) {
			addCriterion("hospitalId >", value, "hospitalId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitalidGreaterThanOrEqualTo(Integer value) {
			addCriterion("hospitalId >=", value, "hospitalId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitalidLessThan(Integer value) {
			addCriterion("hospitalId <", value, "hospitalId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitalidLessThanOrEqualTo(Integer value) {
			addCriterion("hospitalId <=", value, "hospitalId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitalidLike(Integer value) {
			addCriterion("hospitalId like ", value, "hospitalId",1);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitalidNotLike(Integer value) {
			addCriterion("hospitalId  not like ", value, "hospitalId",1);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitalidLeftLike(Integer value) {
			addCriterion("hospitalId like ", value, "hospitalId",0);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitalidNotLeftLike(Integer value) {
			addCriterion("hospitalId  not like ", value, "hospitalId",0);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitalidRightLike(Integer value) {
			addCriterion("hospitalId like ", value, "hospitalId",2);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitalidNotRightLike(Integer value) {
			addCriterion("hospitalId  not like ", value, "hospitalId",2);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitalidIn(List<Integer> values) {
			addCriterion("hospitalId  in ", values, "hospitalId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitalidNotIn(List<Integer> values) {
			addCriterion("hospitalId not in ", values, "hospitalId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitalidBetween(Integer value1,Integer value2) {
			addCriterion("hospitalId between ", value1, value2, "hospitalId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andHospitalidNotBetween(Integer value1,Integer value2) {
			addCriterion("hospitalId not between ", value1, value2, "hospitalId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDoctoridIsNull() {
			addCriterion("doctorId is null");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDoctoridIsNotNull() {
			addCriterion("doctorId is not null");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDoctoridEqualTo(String value) {
			addCriterion("doctorId =", value, "doctorId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDoctoridNotEqualTo(String value) {
			addCriterion("doctorId <>", value, "doctorId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDoctoridGreaterThan(String value) {
			addCriterion("doctorId >", value, "doctorId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDoctoridGreaterThanOrEqualTo(String value) {
			addCriterion("doctorId >=", value, "doctorId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDoctoridLessThan(String value) {
			addCriterion("doctorId <", value, "doctorId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDoctoridLessThanOrEqualTo(String value) {
			addCriterion("doctorId <=", value, "doctorId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDoctoridLike(String value) {
			addCriterion("doctorId like ", value, "doctorId",1);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDoctoridNotLike(String value) {
			addCriterion("doctorId  not like ", value, "doctorId",1);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDoctoridLeftLike(String value) {
			addCriterion("doctorId like ", value, "doctorId",0);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDoctoridNotLeftLike(String value) {
			addCriterion("doctorId  not like ", value, "doctorId",0);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDoctoridRightLike(String value) {
			addCriterion("doctorId like ", value, "doctorId",2);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDoctoridNotRightLike(String value) {
			addCriterion("doctorId  not like ", value, "doctorId",2);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDoctoridIn(List<String> values) {
			addCriterion("doctorId  in ", values, "doctorId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDoctoridNotIn(List<String> values) {
			addCriterion("doctorId not in ", values, "doctorId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDoctoridBetween(String value1,String value2) {
			addCriterion("doctorId between ", value1, value2, "doctorId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDoctoridNotBetween(String value1,String value2) {
			addCriterion("doctorId not between ", value1, value2, "doctorId");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andCreatetimeIsNull() {
			addCriterion("createTime is null");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andCreatetimeIsNotNull() {
			addCriterion("createTime is not null");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andCreatetimeEqualTo(Date value) {
			addCriterion("createTime =", value, "createTime");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andCreatetimeNotEqualTo(Date value) {
			addCriterion("createTime <>", value, "createTime");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andCreatetimeGreaterThan(Date value) {
			addCriterion("createTime >", value, "createTime");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andCreatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("createTime >=", value, "createTime");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andCreatetimeLessThan(Date value) {
			addCriterion("createTime <", value, "createTime");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andCreatetimeLessThanOrEqualTo(Date value) {
			addCriterion("createTime <=", value, "createTime");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andCreatetimeLike(Date value) {
			addCriterion("createTime like ", value, "createTime",1);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andCreatetimeNotLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",1);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andCreatetimeLeftLike(Date value) {
			addCriterion("createTime like ", value, "createTime",0);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andCreatetimeNotLeftLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",0);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andCreatetimeRightLike(Date value) {
			addCriterion("createTime like ", value, "createTime",2);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andCreatetimeNotRightLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",2);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andCreatetimeIn(List<Date> values) {
			addCriterion("createTime  in ", values, "createTime");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andCreatetimeNotIn(List<Date> values) {
			addCriterion("createTime not in ", values, "createTime");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andCreatetimeBetween(Date value1,Date value2) {
			addCriterion("createTime between ", value1, value2, "createTime");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andCreatetimeNotBetween(Date value1,Date value2) {
			addCriterion("createTime not between ", value1, value2, "createTime");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDrIsNull() {
			addCriterion("dr is null");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDrIsNotNull() {
			addCriterion("dr is not null");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDrEqualTo(Integer value) {
			addCriterion("dr =", value, "dr");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDrNotEqualTo(Integer value) {
			addCriterion("dr <>", value, "dr");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDrGreaterThan(Integer value) {
			addCriterion("dr >", value, "dr");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDrGreaterThanOrEqualTo(Integer value) {
			addCriterion("dr >=", value, "dr");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDrLessThan(Integer value) {
			addCriterion("dr <", value, "dr");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDrLessThanOrEqualTo(Integer value) {
			addCriterion("dr <=", value, "dr");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDrLike(Integer value) {
			addCriterion("dr like ", value, "dr",1);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDrNotLike(Integer value) {
			addCriterion("dr  not like ", value, "dr",1);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDrLeftLike(Integer value) {
			addCriterion("dr like ", value, "dr",0);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDrNotLeftLike(Integer value) {
			addCriterion("dr  not like ", value, "dr",0);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDrRightLike(Integer value) {
			addCriterion("dr like ", value, "dr",2);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDrNotRightLike(Integer value) {
			addCriterion("dr  not like ", value, "dr",2);
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDrIn(List<Integer> values) {
			addCriterion("dr  in ", values, "dr");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDrNotIn(List<Integer> values) {
			addCriterion("dr not in ", values, "dr");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDrBetween(Integer value1,Integer value2) {
			addCriterion("dr between ", value1, value2, "dr");
			return (HospitalDoctorCriteria) this;
		}

		public HospitalDoctorCriteria andDrNotBetween(Integer value1,Integer value2) {
			addCriterion("dr not between ", value1, value2, "dr");
			return (HospitalDoctorCriteria) this;
		}

    }

    public static class HospitalDoctorCriteria extends GeneratedCriteria {

        protected HospitalDoctorCriteria() {
            super();
        }
    }

    public static class HospitalDoctorCriterion {
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

        protected HospitalDoctorCriterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

		protected HospitalDoctorCriterion(String condition, Object value, int likeType) {
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

        protected HospitalDoctorCriterion(String condition, Object value, String typeHandler) {
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

        protected HospitalDoctorCriterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected HospitalDoctorCriterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected HospitalDoctorCriterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}