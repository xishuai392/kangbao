package cn.kangbao.webapp.db.appmgr.arg;

import java.util.*;
import java.math.*;
import org.apache.commons.lang.*;

public class SysCityArg {
	private String pk_name = "cityId";
    private String orderByClause;

	private String groupByClause;

	private String columns;

	private String countsql1;
	
	private String countsql2;

    private boolean distinct;

	private int rowStart=0;
    
    private int rowEnd=10;

    private List<SysCityCriteria> oredCriteria;
  
    public SysCityArg() {
        oredCriteria = new ArrayList<SysCityCriteria>();
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

    public List<SysCityCriteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(SysCityCriteria criteria) {
        oredCriteria.add(criteria);
    }

    public SysCityCriteria or() {
        SysCityCriteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public SysCityCriteria createCriteria() {
        SysCityCriteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected SysCityCriteria createCriteriaInternal() {
        SysCityCriteria criteria = new SysCityCriteria();
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
        protected List<SysCityCriterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<SysCityCriterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<SysCityCriterion> getAllCriteria() {
            return criteria;
        }

        public List<SysCityCriterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new SysCityCriterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new SysCityCriterion(condition, value));
        }

		protected void addCriterion(String condition, Object value, String property,int likeType) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new SysCityCriterion(condition, value,likeType));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new SysCityCriterion(condition, value1, value2));
        }

		public SysCityCriteria andCriterionEqualTo(String criterion) {
			if (StringUtils.isBlank(criterion)) {
				criterion="1=1";
			}
			addCriterion(criterion);
			return (SysCityCriteria) this;
		}
				public SysCityCriteria andCityidIsNull() {
			addCriterion("cityId is null");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCityidIsNotNull() {
			addCriterion("cityId is not null");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCityidEqualTo(Integer value) {
			addCriterion("cityId =", value, "cityId");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCityidNotEqualTo(Integer value) {
			addCriterion("cityId <>", value, "cityId");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCityidGreaterThan(Integer value) {
			addCriterion("cityId >", value, "cityId");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCityidGreaterThanOrEqualTo(Integer value) {
			addCriterion("cityId >=", value, "cityId");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCityidLessThan(Integer value) {
			addCriterion("cityId <", value, "cityId");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCityidLessThanOrEqualTo(Integer value) {
			addCriterion("cityId <=", value, "cityId");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCityidLike(Integer value) {
			addCriterion("cityId like ", value, "cityId",1);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCityidNotLike(Integer value) {
			addCriterion("cityId  not like ", value, "cityId",1);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCityidLeftLike(Integer value) {
			addCriterion("cityId like ", value, "cityId",0);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCityidNotLeftLike(Integer value) {
			addCriterion("cityId  not like ", value, "cityId",0);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCityidRightLike(Integer value) {
			addCriterion("cityId like ", value, "cityId",2);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCityidNotRightLike(Integer value) {
			addCriterion("cityId  not like ", value, "cityId",2);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCityidIn(List<Integer> values) {
			addCriterion("cityId  in ", values, "cityId");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCityidNotIn(List<Integer> values) {
			addCriterion("cityId not in ", values, "cityId");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCityidBetween(Integer value1,Integer value2) {
			addCriterion("cityId between ", value1, value2, "cityId");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCityidNotBetween(Integer value1,Integer value2) {
			addCriterion("cityId not between ", value1, value2, "cityId");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCitynameIsNull() {
			addCriterion("cityName is null");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCitynameIsNotNull() {
			addCriterion("cityName is not null");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCitynameEqualTo(String value) {
			addCriterion("cityName =", value, "cityName");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCitynameNotEqualTo(String value) {
			addCriterion("cityName <>", value, "cityName");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCitynameGreaterThan(String value) {
			addCriterion("cityName >", value, "cityName");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCitynameGreaterThanOrEqualTo(String value) {
			addCriterion("cityName >=", value, "cityName");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCitynameLessThan(String value) {
			addCriterion("cityName <", value, "cityName");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCitynameLessThanOrEqualTo(String value) {
			addCriterion("cityName <=", value, "cityName");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCitynameLike(String value) {
			addCriterion("cityName like ", value, "cityName",1);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCitynameNotLike(String value) {
			addCriterion("cityName  not like ", value, "cityName",1);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCitynameLeftLike(String value) {
			addCriterion("cityName like ", value, "cityName",0);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCitynameNotLeftLike(String value) {
			addCriterion("cityName  not like ", value, "cityName",0);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCitynameRightLike(String value) {
			addCriterion("cityName like ", value, "cityName",2);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCitynameNotRightLike(String value) {
			addCriterion("cityName  not like ", value, "cityName",2);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCitynameIn(List<String> values) {
			addCriterion("cityName  in ", values, "cityName");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCitynameNotIn(List<String> values) {
			addCriterion("cityName not in ", values, "cityName");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCitynameBetween(String value1,String value2) {
			addCriterion("cityName between ", value1, value2, "cityName");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCitynameNotBetween(String value1,String value2) {
			addCriterion("cityName not between ", value1, value2, "cityName");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andUpcityidIsNull() {
			addCriterion("upCityId is null");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andUpcityidIsNotNull() {
			addCriterion("upCityId is not null");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andUpcityidEqualTo(Integer value) {
			addCriterion("upCityId =", value, "upCityId");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andUpcityidNotEqualTo(Integer value) {
			addCriterion("upCityId <>", value, "upCityId");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andUpcityidGreaterThan(Integer value) {
			addCriterion("upCityId >", value, "upCityId");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andUpcityidGreaterThanOrEqualTo(Integer value) {
			addCriterion("upCityId >=", value, "upCityId");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andUpcityidLessThan(Integer value) {
			addCriterion("upCityId <", value, "upCityId");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andUpcityidLessThanOrEqualTo(Integer value) {
			addCriterion("upCityId <=", value, "upCityId");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andUpcityidLike(Integer value) {
			addCriterion("upCityId like ", value, "upCityId",1);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andUpcityidNotLike(Integer value) {
			addCriterion("upCityId  not like ", value, "upCityId",1);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andUpcityidLeftLike(Integer value) {
			addCriterion("upCityId like ", value, "upCityId",0);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andUpcityidNotLeftLike(Integer value) {
			addCriterion("upCityId  not like ", value, "upCityId",0);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andUpcityidRightLike(Integer value) {
			addCriterion("upCityId like ", value, "upCityId",2);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andUpcityidNotRightLike(Integer value) {
			addCriterion("upCityId  not like ", value, "upCityId",2);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andUpcityidIn(List<Integer> values) {
			addCriterion("upCityId  in ", values, "upCityId");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andUpcityidNotIn(List<Integer> values) {
			addCriterion("upCityId not in ", values, "upCityId");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andUpcityidBetween(Integer value1,Integer value2) {
			addCriterion("upCityId between ", value1, value2, "upCityId");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andUpcityidNotBetween(Integer value1,Integer value2) {
			addCriterion("upCityId not between ", value1, value2, "upCityId");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCreatetimeIsNull() {
			addCriterion("createTime is null");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCreatetimeIsNotNull() {
			addCriterion("createTime is not null");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCreatetimeEqualTo(Date value) {
			addCriterion("createTime =", value, "createTime");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCreatetimeNotEqualTo(Date value) {
			addCriterion("createTime <>", value, "createTime");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCreatetimeGreaterThan(Date value) {
			addCriterion("createTime >", value, "createTime");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCreatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("createTime >=", value, "createTime");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCreatetimeLessThan(Date value) {
			addCriterion("createTime <", value, "createTime");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCreatetimeLessThanOrEqualTo(Date value) {
			addCriterion("createTime <=", value, "createTime");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCreatetimeLike(Date value) {
			addCriterion("createTime like ", value, "createTime",1);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCreatetimeNotLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",1);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCreatetimeLeftLike(Date value) {
			addCriterion("createTime like ", value, "createTime",0);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCreatetimeNotLeftLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",0);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCreatetimeRightLike(Date value) {
			addCriterion("createTime like ", value, "createTime",2);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCreatetimeNotRightLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",2);
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCreatetimeIn(List<Date> values) {
			addCriterion("createTime  in ", values, "createTime");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCreatetimeNotIn(List<Date> values) {
			addCriterion("createTime not in ", values, "createTime");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCreatetimeBetween(Date value1,Date value2) {
			addCriterion("createTime between ", value1, value2, "createTime");
			return (SysCityCriteria) this;
		}

		public SysCityCriteria andCreatetimeNotBetween(Date value1,Date value2) {
			addCriterion("createTime not between ", value1, value2, "createTime");
			return (SysCityCriteria) this;
		}

    }

    public static class SysCityCriteria extends GeneratedCriteria {

        protected SysCityCriteria() {
            super();
        }
    }

    public static class SysCityCriterion {
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

        protected SysCityCriterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

		protected SysCityCriterion(String condition, Object value, int likeType) {
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

        protected SysCityCriterion(String condition, Object value, String typeHandler) {
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

        protected SysCityCriterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected SysCityCriterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected SysCityCriterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}