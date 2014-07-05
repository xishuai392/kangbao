package cn.kangbao.webapp.db.appmgr.arg;

import java.util.*;
import java.math.*;
import org.apache.commons.lang.*;

public class HospitalArg {
	private String pk_name = "hospitalId";
    private String orderByClause;

	private String groupByClause;

	private String columns;

	private String countsql1;
	
	private String countsql2;

    private boolean distinct;

	private int rowStart=0;
    
    private int rowEnd=10;

    private List<HospitalCriteria> oredCriteria;
  
    public HospitalArg() {
        oredCriteria = new ArrayList<HospitalCriteria>();
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

    public List<HospitalCriteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(HospitalCriteria criteria) {
        oredCriteria.add(criteria);
    }

    public HospitalCriteria or() {
        HospitalCriteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public HospitalCriteria createCriteria() {
        HospitalCriteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected HospitalCriteria createCriteriaInternal() {
        HospitalCriteria criteria = new HospitalCriteria();
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
        protected List<HospitalCriterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<HospitalCriterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<HospitalCriterion> getAllCriteria() {
            return criteria;
        }

        public List<HospitalCriterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new HospitalCriterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new HospitalCriterion(condition, value));
        }

		protected void addCriterion(String condition, Object value, String property,int likeType) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new HospitalCriterion(condition, value,likeType));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new HospitalCriterion(condition, value1, value2));
        }

		public HospitalCriteria andCriterionEqualTo(String criterion) {
			if (StringUtils.isBlank(criterion)) {
				criterion="1=1";
			}
			addCriterion(criterion);
			return (HospitalCriteria) this;
		}
				public HospitalCriteria andHospitalidIsNull() {
			addCriterion("hospitalId is null");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalidIsNotNull() {
			addCriterion("hospitalId is not null");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalidEqualTo(Integer value) {
			addCriterion("hospitalId =", value, "hospitalId");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalidNotEqualTo(Integer value) {
			addCriterion("hospitalId <>", value, "hospitalId");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalidGreaterThan(Integer value) {
			addCriterion("hospitalId >", value, "hospitalId");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalidGreaterThanOrEqualTo(Integer value) {
			addCriterion("hospitalId >=", value, "hospitalId");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalidLessThan(Integer value) {
			addCriterion("hospitalId <", value, "hospitalId");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalidLessThanOrEqualTo(Integer value) {
			addCriterion("hospitalId <=", value, "hospitalId");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalidLike(Integer value) {
			addCriterion("hospitalId like ", value, "hospitalId",1);
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalidNotLike(Integer value) {
			addCriterion("hospitalId  not like ", value, "hospitalId",1);
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalidLeftLike(Integer value) {
			addCriterion("hospitalId like ", value, "hospitalId",0);
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalidNotLeftLike(Integer value) {
			addCriterion("hospitalId  not like ", value, "hospitalId",0);
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalidRightLike(Integer value) {
			addCriterion("hospitalId like ", value, "hospitalId",2);
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalidNotRightLike(Integer value) {
			addCriterion("hospitalId  not like ", value, "hospitalId",2);
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalidIn(List<Integer> values) {
			addCriterion("hospitalId  in ", values, "hospitalId");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalidNotIn(List<Integer> values) {
			addCriterion("hospitalId not in ", values, "hospitalId");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalidBetween(Integer value1,Integer value2) {
			addCriterion("hospitalId between ", value1, value2, "hospitalId");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalidNotBetween(Integer value1,Integer value2) {
			addCriterion("hospitalId not between ", value1, value2, "hospitalId");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalnameIsNull() {
			addCriterion("hospitalName is null");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalnameIsNotNull() {
			addCriterion("hospitalName is not null");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalnameEqualTo(String value) {
			addCriterion("hospitalName =", value, "hospitalName");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalnameNotEqualTo(String value) {
			addCriterion("hospitalName <>", value, "hospitalName");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalnameGreaterThan(String value) {
			addCriterion("hospitalName >", value, "hospitalName");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalnameGreaterThanOrEqualTo(String value) {
			addCriterion("hospitalName >=", value, "hospitalName");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalnameLessThan(String value) {
			addCriterion("hospitalName <", value, "hospitalName");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalnameLessThanOrEqualTo(String value) {
			addCriterion("hospitalName <=", value, "hospitalName");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalnameLike(String value) {
			addCriterion("hospitalName like ", value, "hospitalName",1);
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalnameNotLike(String value) {
			addCriterion("hospitalName  not like ", value, "hospitalName",1);
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalnameLeftLike(String value) {
			addCriterion("hospitalName like ", value, "hospitalName",0);
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalnameNotLeftLike(String value) {
			addCriterion("hospitalName  not like ", value, "hospitalName",0);
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalnameRightLike(String value) {
			addCriterion("hospitalName like ", value, "hospitalName",2);
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalnameNotRightLike(String value) {
			addCriterion("hospitalName  not like ", value, "hospitalName",2);
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalnameIn(List<String> values) {
			addCriterion("hospitalName  in ", values, "hospitalName");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalnameNotIn(List<String> values) {
			addCriterion("hospitalName not in ", values, "hospitalName");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalnameBetween(String value1,String value2) {
			addCriterion("hospitalName between ", value1, value2, "hospitalName");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andHospitalnameNotBetween(String value1,String value2) {
			addCriterion("hospitalName not between ", value1, value2, "hospitalName");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andCreatetimeIsNull() {
			addCriterion("createTime is null");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andCreatetimeIsNotNull() {
			addCriterion("createTime is not null");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andCreatetimeEqualTo(Date value) {
			addCriterion("createTime =", value, "createTime");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andCreatetimeNotEqualTo(Date value) {
			addCriterion("createTime <>", value, "createTime");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andCreatetimeGreaterThan(Date value) {
			addCriterion("createTime >", value, "createTime");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andCreatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("createTime >=", value, "createTime");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andCreatetimeLessThan(Date value) {
			addCriterion("createTime <", value, "createTime");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andCreatetimeLessThanOrEqualTo(Date value) {
			addCriterion("createTime <=", value, "createTime");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andCreatetimeLike(Date value) {
			addCriterion("createTime like ", value, "createTime",1);
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andCreatetimeNotLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",1);
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andCreatetimeLeftLike(Date value) {
			addCriterion("createTime like ", value, "createTime",0);
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andCreatetimeNotLeftLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",0);
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andCreatetimeRightLike(Date value) {
			addCriterion("createTime like ", value, "createTime",2);
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andCreatetimeNotRightLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",2);
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andCreatetimeIn(List<Date> values) {
			addCriterion("createTime  in ", values, "createTime");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andCreatetimeNotIn(List<Date> values) {
			addCriterion("createTime not in ", values, "createTime");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andCreatetimeBetween(Date value1,Date value2) {
			addCriterion("createTime between ", value1, value2, "createTime");
			return (HospitalCriteria) this;
		}

		public HospitalCriteria andCreatetimeNotBetween(Date value1,Date value2) {
			addCriterion("createTime not between ", value1, value2, "createTime");
			return (HospitalCriteria) this;
		}

    }

    public static class HospitalCriteria extends GeneratedCriteria {

        protected HospitalCriteria() {
            super();
        }
    }

    public static class HospitalCriterion {
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

        protected HospitalCriterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

		protected HospitalCriterion(String condition, Object value, int likeType) {
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

        protected HospitalCriterion(String condition, Object value, String typeHandler) {
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

        protected HospitalCriterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected HospitalCriterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected HospitalCriterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}