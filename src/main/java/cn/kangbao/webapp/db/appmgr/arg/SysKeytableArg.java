package cn.kangbao.webapp.db.appmgr.arg;

import java.util.*;
import java.math.*;
import org.apache.commons.lang.*;

public class SysKeytableArg {
	private String pk_name = "tableId";
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
				public SysKeytableCriteria andTableidIsNull() {
			addCriterion("tableId is null");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTableidIsNotNull() {
			addCriterion("tableId is not null");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTableidEqualTo(Integer value) {
			addCriterion("tableId =", value, "tableId");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTableidNotEqualTo(Integer value) {
			addCriterion("tableId <>", value, "tableId");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTableidGreaterThan(Integer value) {
			addCriterion("tableId >", value, "tableId");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTableidGreaterThanOrEqualTo(Integer value) {
			addCriterion("tableId >=", value, "tableId");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTableidLessThan(Integer value) {
			addCriterion("tableId <", value, "tableId");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTableidLessThanOrEqualTo(Integer value) {
			addCriterion("tableId <=", value, "tableId");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTableidLike(Integer value) {
			addCriterion("tableId like ", value, "tableId",1);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTableidNotLike(Integer value) {
			addCriterion("tableId  not like ", value, "tableId",1);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTableidLeftLike(Integer value) {
			addCriterion("tableId like ", value, "tableId",0);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTableidNotLeftLike(Integer value) {
			addCriterion("tableId  not like ", value, "tableId",0);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTableidRightLike(Integer value) {
			addCriterion("tableId like ", value, "tableId",2);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTableidNotRightLike(Integer value) {
			addCriterion("tableId  not like ", value, "tableId",2);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTableidIn(List<Integer> values) {
			addCriterion("tableId  in ", values, "tableId");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTableidNotIn(List<Integer> values) {
			addCriterion("tableId not in ", values, "tableId");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTableidBetween(Integer value1,Integer value2) {
			addCriterion("tableId between ", value1, value2, "tableId");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTableidNotBetween(Integer value1,Integer value2) {
			addCriterion("tableId not between ", value1, value2, "tableId");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTalbenameIsNull() {
			addCriterion("talbeName is null");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTalbenameIsNotNull() {
			addCriterion("talbeName is not null");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTalbenameEqualTo(String value) {
			addCriterion("talbeName =", value, "talbeName");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTalbenameNotEqualTo(String value) {
			addCriterion("talbeName <>", value, "talbeName");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTalbenameGreaterThan(String value) {
			addCriterion("talbeName >", value, "talbeName");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTalbenameGreaterThanOrEqualTo(String value) {
			addCriterion("talbeName >=", value, "talbeName");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTalbenameLessThan(String value) {
			addCriterion("talbeName <", value, "talbeName");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTalbenameLessThanOrEqualTo(String value) {
			addCriterion("talbeName <=", value, "talbeName");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTalbenameLike(String value) {
			addCriterion("talbeName like ", value, "talbeName",1);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTalbenameNotLike(String value) {
			addCriterion("talbeName  not like ", value, "talbeName",1);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTalbenameLeftLike(String value) {
			addCriterion("talbeName like ", value, "talbeName",0);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTalbenameNotLeftLike(String value) {
			addCriterion("talbeName  not like ", value, "talbeName",0);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTalbenameRightLike(String value) {
			addCriterion("talbeName like ", value, "talbeName",2);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTalbenameNotRightLike(String value) {
			addCriterion("talbeName  not like ", value, "talbeName",2);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTalbenameIn(List<String> values) {
			addCriterion("talbeName  in ", values, "talbeName");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTalbenameNotIn(List<String> values) {
			addCriterion("talbeName not in ", values, "talbeName");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTalbenameBetween(String value1,String value2) {
			addCriterion("talbeName between ", value1, value2, "talbeName");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andTalbenameNotBetween(String value1,String value2) {
			addCriterion("talbeName not between ", value1, value2, "talbeName");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andNextidIsNull() {
			addCriterion("nextId is null");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andNextidIsNotNull() {
			addCriterion("nextId is not null");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andNextidEqualTo(Integer value) {
			addCriterion("nextId =", value, "nextId");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andNextidNotEqualTo(Integer value) {
			addCriterion("nextId <>", value, "nextId");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andNextidGreaterThan(Integer value) {
			addCriterion("nextId >", value, "nextId");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andNextidGreaterThanOrEqualTo(Integer value) {
			addCriterion("nextId >=", value, "nextId");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andNextidLessThan(Integer value) {
			addCriterion("nextId <", value, "nextId");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andNextidLessThanOrEqualTo(Integer value) {
			addCriterion("nextId <=", value, "nextId");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andNextidLike(Integer value) {
			addCriterion("nextId like ", value, "nextId",1);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andNextidNotLike(Integer value) {
			addCriterion("nextId  not like ", value, "nextId",1);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andNextidLeftLike(Integer value) {
			addCriterion("nextId like ", value, "nextId",0);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andNextidNotLeftLike(Integer value) {
			addCriterion("nextId  not like ", value, "nextId",0);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andNextidRightLike(Integer value) {
			addCriterion("nextId like ", value, "nextId",2);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andNextidNotRightLike(Integer value) {
			addCriterion("nextId  not like ", value, "nextId",2);
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andNextidIn(List<Integer> values) {
			addCriterion("nextId  in ", values, "nextId");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andNextidNotIn(List<Integer> values) {
			addCriterion("nextId not in ", values, "nextId");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andNextidBetween(Integer value1,Integer value2) {
			addCriterion("nextId between ", value1, value2, "nextId");
			return (SysKeytableCriteria) this;
		}

		public SysKeytableCriteria andNextidNotBetween(Integer value1,Integer value2) {
			addCriterion("nextId not between ", value1, value2, "nextId");
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