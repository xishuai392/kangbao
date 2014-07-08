package cn.kangbao.webapp.db.appmgr.arg;

import java.util.*;
import java.math.*;
import org.apache.commons.lang.*;

public class SysKeytableArg {
	private String pk_name = "tableName";
    private String orderByClause;

	private String groupByClause;

	private String columns;

	private String countsql1;
	
	private String countsql2;

    private boolean distinct;

	private int rowStart=0;
    
    private int rowEnd=10;

    private List<SysKeytableCriteria> oredCriteria;
  
    public SysKeytableArg() {
        oredCriteria = new ArrayList<SysKeytableCriteria>();
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

    public List<SysKeytableCriteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(SysKeytableCriteria criteria) {
        oredCriteria.add(criteria);
    }

    public SysKeytableCriteria or() {
        SysKeytableCriteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public SysKeytableCriteria createCriteria() {
        SysKeytableCriteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected SysKeytableCriteria createCriteriaInternal() {
        SysKeytableCriteria criteria = new SysKeytableCriteria();
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
        protected List<SysKeytableCriterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<SysKeytableCriterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<SysKeytableCriterion> getAllCriteria() {
            return criteria;
        }

        public List<SysKeytableCriterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new SysKeytableCriterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new SysKeytableCriterion(condition, value));
        }

		protected void addCriterion(String condition, Object value, String property,int likeType) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new SysKeytableCriterion(condition, value,likeType));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new SysKeytableCriterion(condition, value1, value2));
        }

		public SysKeytableCriteria andCriterionEqualTo(String criterion) {
			if (StringUtils.isBlank(criterion)) {
				criterion="1=1";
			}
			addCriterion(criterion);
			return (SysKeytableCriteria) this;
		}
				public SysKeytableCriteria andTablenameIsNull() {
			addCriterion("tableName is null");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTablenameIsNotNull() {
			addCriterion("tableName is not null");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTablenameEqualTo(String value) {
			addCriterion("tableName =", value, "tableName");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTablenameNotEqualTo(String value) {
			addCriterion("tableName <>", value, "tableName");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTablenameGreaterThan(String value) {
			addCriterion("tableName >", value, "tableName");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTablenameGreaterThanOrEqualTo(String value) {
			addCriterion("tableName >=", value, "tableName");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTablenameLessThan(String value) {
			addCriterion("tableName <", value, "tableName");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTablenameLessThanOrEqualTo(String value) {
			addCriterion("tableName <=", value, "tableName");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTablenameLike(String value) {
			addCriterion("tableName like ", value, "tableName",1);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTablenameNotLike(String value) {
			addCriterion("tableName  not like ", value, "tableName",1);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTablenameLeftLike(String value) {
			addCriterion("tableName like ", value, "tableName",0);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTablenameNotLeftLike(String value) {
			addCriterion("tableName  not like ", value, "tableName",0);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTablenameRightLike(String value) {
			addCriterion("tableName like ", value, "tableName",2);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTablenameNotRightLike(String value) {
			addCriterion("tableName  not like ", value, "tableName",2);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTablenameIn(List<String> values) {
			addCriterion("tableName  in ", values, "tableName");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTablenameNotIn(List<String> values) {
			addCriterion("tableName not in ", values, "tableName");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTablenameBetween(String value1,String value2) {
			addCriterion("tableName between ", value1, value2, "tableName");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTablenameNotBetween(String value1,String value2) {
			addCriterion("tableName not between ", value1, value2, "tableName");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCurrentvalueIsNull() {
			addCriterion("currentValue is null");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCurrentvalueIsNotNull() {
			addCriterion("currentValue is not null");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCurrentvalueEqualTo(Integer value) {
			addCriterion("currentValue =", value, "currentValue");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCurrentvalueNotEqualTo(Integer value) {
			addCriterion("currentValue <>", value, "currentValue");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCurrentvalueGreaterThan(Integer value) {
			addCriterion("currentValue >", value, "currentValue");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCurrentvalueGreaterThanOrEqualTo(Integer value) {
			addCriterion("currentValue >=", value, "currentValue");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCurrentvalueLessThan(Integer value) {
			addCriterion("currentValue <", value, "currentValue");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCurrentvalueLessThanOrEqualTo(Integer value) {
			addCriterion("currentValue <=", value, "currentValue");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCurrentvalueLike(Integer value) {
			addCriterion("currentValue like ", value, "currentValue",1);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCurrentvalueNotLike(Integer value) {
			addCriterion("currentValue  not like ", value, "currentValue",1);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCurrentvalueLeftLike(Integer value) {
			addCriterion("currentValue like ", value, "currentValue",0);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCurrentvalueNotLeftLike(Integer value) {
			addCriterion("currentValue  not like ", value, "currentValue",0);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCurrentvalueRightLike(Integer value) {
			addCriterion("currentValue like ", value, "currentValue",2);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCurrentvalueNotRightLike(Integer value) {
			addCriterion("currentValue  not like ", value, "currentValue",2);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCurrentvalueIn(List<Integer> values) {
			addCriterion("currentValue  in ", values, "currentValue");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCurrentvalueNotIn(List<Integer> values) {
			addCriterion("currentValue not in ", values, "currentValue");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCurrentvalueBetween(Integer value1,Integer value2) {
			addCriterion("currentValue between ", value1, value2, "currentValue");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCurrentvalueNotBetween(Integer value1,Integer value2) {
			addCriterion("currentValue not between ", value1, value2, "currentValue");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andIncrementIsNull() {
			addCriterion("increment is null");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andIncrementIsNotNull() {
			addCriterion("increment is not null");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andIncrementEqualTo(Integer value) {
			addCriterion("increment =", value, "increment");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andIncrementNotEqualTo(Integer value) {
			addCriterion("increment <>", value, "increment");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andIncrementGreaterThan(Integer value) {
			addCriterion("increment >", value, "increment");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andIncrementGreaterThanOrEqualTo(Integer value) {
			addCriterion("increment >=", value, "increment");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andIncrementLessThan(Integer value) {
			addCriterion("increment <", value, "increment");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andIncrementLessThanOrEqualTo(Integer value) {
			addCriterion("increment <=", value, "increment");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andIncrementLike(Integer value) {
			addCriterion("increment like ", value, "increment",1);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andIncrementNotLike(Integer value) {
			addCriterion("increment  not like ", value, "increment",1);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andIncrementLeftLike(Integer value) {
			addCriterion("increment like ", value, "increment",0);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andIncrementNotLeftLike(Integer value) {
			addCriterion("increment  not like ", value, "increment",0);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andIncrementRightLike(Integer value) {
			addCriterion("increment like ", value, "increment",2);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andIncrementNotRightLike(Integer value) {
			addCriterion("increment  not like ", value, "increment",2);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andIncrementIn(List<Integer> values) {
			addCriterion("increment  in ", values, "increment");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andIncrementNotIn(List<Integer> values) {
			addCriterion("increment not in ", values, "increment");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andIncrementBetween(Integer value1,Integer value2) {
			addCriterion("increment between ", value1, value2, "increment");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andIncrementNotBetween(Integer value1,Integer value2) {
			addCriterion("increment not between ", value1, value2, "increment");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCreatetimeIsNull() {
			addCriterion("createTime is null");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCreatetimeIsNotNull() {
			addCriterion("createTime is not null");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCreatetimeEqualTo(Date value) {
			addCriterion("createTime =", value, "createTime");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCreatetimeNotEqualTo(Date value) {
			addCriterion("createTime <>", value, "createTime");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCreatetimeGreaterThan(Date value) {
			addCriterion("createTime >", value, "createTime");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCreatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("createTime >=", value, "createTime");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCreatetimeLessThan(Date value) {
			addCriterion("createTime <", value, "createTime");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCreatetimeLessThanOrEqualTo(Date value) {
			addCriterion("createTime <=", value, "createTime");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCreatetimeLike(Date value) {
			addCriterion("createTime like ", value, "createTime",1);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCreatetimeNotLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",1);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCreatetimeLeftLike(Date value) {
			addCriterion("createTime like ", value, "createTime",0);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCreatetimeNotLeftLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",0);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCreatetimeRightLike(Date value) {
			addCriterion("createTime like ", value, "createTime",2);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCreatetimeNotRightLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",2);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCreatetimeIn(List<Date> values) {
			addCriterion("createTime  in ", values, "createTime");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCreatetimeNotIn(List<Date> values) {
			addCriterion("createTime not in ", values, "createTime");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCreatetimeBetween(Date value1,Date value2) {
			addCriterion("createTime between ", value1, value2, "createTime");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andCreatetimeNotBetween(Date value1,Date value2) {
			addCriterion("createTime not between ", value1, value2, "createTime");
			return (SysKeytableCriteria) this;
		}

    }

    public static class SysKeytableCriteria extends GeneratedCriteria {

        protected SysKeytableCriteria() {
            super();
        }
    }

    public static class SysKeytableCriterion {
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

        protected SysKeytableCriterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

		protected SysKeytableCriterion(String condition, Object value, int likeType) {
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

        protected SysKeytableCriterion(String condition, Object value, String typeHandler) {
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

        protected SysKeytableCriterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected SysKeytableCriterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected SysKeytableCriterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}