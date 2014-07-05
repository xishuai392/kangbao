package cn.kangbao.webapp.db.appmgr.arg;

import java.util.*;
import java.math.*;
import org.apache.commons.lang.*;

public class SysDictArg {
	private String pk_name = "dictId";
    private String orderByClause;

	private String groupByClause;

	private String columns;

	private String countsql1;
	
	private String countsql2;

    private boolean distinct;

	private int rowStart=0;
    
    private int rowEnd=10;

    private List<SysDictCriteria> oredCriteria;
  
    public SysDictArg() {
        oredCriteria = new ArrayList<SysDictCriteria>();
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

    public List<SysDictCriteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(SysDictCriteria criteria) {
        oredCriteria.add(criteria);
    }

    public SysDictCriteria or() {
        SysDictCriteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public SysDictCriteria createCriteria() {
        SysDictCriteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected SysDictCriteria createCriteriaInternal() {
        SysDictCriteria criteria = new SysDictCriteria();
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
        protected List<SysDictCriterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<SysDictCriterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<SysDictCriterion> getAllCriteria() {
            return criteria;
        }

        public List<SysDictCriterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new SysDictCriterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new SysDictCriterion(condition, value));
        }

		protected void addCriterion(String condition, Object value, String property,int likeType) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new SysDictCriterion(condition, value,likeType));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new SysDictCriterion(condition, value1, value2));
        }

		public SysDictCriteria andCriterionEqualTo(String criterion) {
			if (StringUtils.isBlank(criterion)) {
				criterion="1=1";
			}
			addCriterion(criterion);
			return (SysDictCriteria) this;
		}
				public SysDictCriteria andDictidIsNull() {
			addCriterion("dictId is null");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictidIsNotNull() {
			addCriterion("dictId is not null");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictidEqualTo(Long value) {
			addCriterion("dictId =", value, "dictId");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictidNotEqualTo(Long value) {
			addCriterion("dictId <>", value, "dictId");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictidGreaterThan(Long value) {
			addCriterion("dictId >", value, "dictId");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictidGreaterThanOrEqualTo(Long value) {
			addCriterion("dictId >=", value, "dictId");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictidLessThan(Long value) {
			addCriterion("dictId <", value, "dictId");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictidLessThanOrEqualTo(Long value) {
			addCriterion("dictId <=", value, "dictId");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictidLike(Long value) {
			addCriterion("dictId like ", value, "dictId",1);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictidNotLike(Long value) {
			addCriterion("dictId  not like ", value, "dictId",1);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictidLeftLike(Long value) {
			addCriterion("dictId like ", value, "dictId",0);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictidNotLeftLike(Long value) {
			addCriterion("dictId  not like ", value, "dictId",0);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictidRightLike(Long value) {
			addCriterion("dictId like ", value, "dictId",2);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictidNotRightLike(Long value) {
			addCriterion("dictId  not like ", value, "dictId",2);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictidIn(List<Long> values) {
			addCriterion("dictId  in ", values, "dictId");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictidNotIn(List<Long> values) {
			addCriterion("dictId not in ", values, "dictId");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictidBetween(Long value1,Long value2) {
			addCriterion("dictId between ", value1, value2, "dictId");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictidNotBetween(Long value1,Long value2) {
			addCriterion("dictId not between ", value1, value2, "dictId");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictnameIsNull() {
			addCriterion("dictName is null");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictnameIsNotNull() {
			addCriterion("dictName is not null");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictnameEqualTo(String value) {
			addCriterion("dictName =", value, "dictName");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictnameNotEqualTo(String value) {
			addCriterion("dictName <>", value, "dictName");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictnameGreaterThan(String value) {
			addCriterion("dictName >", value, "dictName");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictnameGreaterThanOrEqualTo(String value) {
			addCriterion("dictName >=", value, "dictName");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictnameLessThan(String value) {
			addCriterion("dictName <", value, "dictName");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictnameLessThanOrEqualTo(String value) {
			addCriterion("dictName <=", value, "dictName");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictnameLike(String value) {
			addCriterion("dictName like ", value, "dictName",1);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictnameNotLike(String value) {
			addCriterion("dictName  not like ", value, "dictName",1);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictnameLeftLike(String value) {
			addCriterion("dictName like ", value, "dictName",0);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictnameNotLeftLike(String value) {
			addCriterion("dictName  not like ", value, "dictName",0);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictnameRightLike(String value) {
			addCriterion("dictName like ", value, "dictName",2);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictnameNotRightLike(String value) {
			addCriterion("dictName  not like ", value, "dictName",2);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictnameIn(List<String> values) {
			addCriterion("dictName  in ", values, "dictName");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictnameNotIn(List<String> values) {
			addCriterion("dictName not in ", values, "dictName");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictnameBetween(String value1,String value2) {
			addCriterion("dictName between ", value1, value2, "dictName");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andDictnameNotBetween(String value1,String value2) {
			addCriterion("dictName not between ", value1, value2, "dictName");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andUpdictidIsNull() {
			addCriterion("updictId is null");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andUpdictidIsNotNull() {
			addCriterion("updictId is not null");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andUpdictidEqualTo(Integer value) {
			addCriterion("updictId =", value, "updictId");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andUpdictidNotEqualTo(Integer value) {
			addCriterion("updictId <>", value, "updictId");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andUpdictidGreaterThan(Integer value) {
			addCriterion("updictId >", value, "updictId");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andUpdictidGreaterThanOrEqualTo(Integer value) {
			addCriterion("updictId >=", value, "updictId");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andUpdictidLessThan(Integer value) {
			addCriterion("updictId <", value, "updictId");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andUpdictidLessThanOrEqualTo(Integer value) {
			addCriterion("updictId <=", value, "updictId");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andUpdictidLike(Integer value) {
			addCriterion("updictId like ", value, "updictId",1);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andUpdictidNotLike(Integer value) {
			addCriterion("updictId  not like ", value, "updictId",1);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andUpdictidLeftLike(Integer value) {
			addCriterion("updictId like ", value, "updictId",0);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andUpdictidNotLeftLike(Integer value) {
			addCriterion("updictId  not like ", value, "updictId",0);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andUpdictidRightLike(Integer value) {
			addCriterion("updictId like ", value, "updictId",2);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andUpdictidNotRightLike(Integer value) {
			addCriterion("updictId  not like ", value, "updictId",2);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andUpdictidIn(List<Integer> values) {
			addCriterion("updictId  in ", values, "updictId");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andUpdictidNotIn(List<Integer> values) {
			addCriterion("updictId not in ", values, "updictId");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andUpdictidBetween(Integer value1,Integer value2) {
			addCriterion("updictId between ", value1, value2, "updictId");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andUpdictidNotBetween(Integer value1,Integer value2) {
			addCriterion("updictId not between ", value1, value2, "updictId");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andConstantIsNull() {
			addCriterion("constant is null");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andConstantIsNotNull() {
			addCriterion("constant is not null");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andConstantEqualTo(String value) {
			addCriterion("constant =", value, "constant");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andConstantNotEqualTo(String value) {
			addCriterion("constant <>", value, "constant");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andConstantGreaterThan(String value) {
			addCriterion("constant >", value, "constant");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andConstantGreaterThanOrEqualTo(String value) {
			addCriterion("constant >=", value, "constant");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andConstantLessThan(String value) {
			addCriterion("constant <", value, "constant");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andConstantLessThanOrEqualTo(String value) {
			addCriterion("constant <=", value, "constant");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andConstantLike(String value) {
			addCriterion("constant like ", value, "constant",1);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andConstantNotLike(String value) {
			addCriterion("constant  not like ", value, "constant",1);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andConstantLeftLike(String value) {
			addCriterion("constant like ", value, "constant",0);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andConstantNotLeftLike(String value) {
			addCriterion("constant  not like ", value, "constant",0);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andConstantRightLike(String value) {
			addCriterion("constant like ", value, "constant",2);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andConstantNotRightLike(String value) {
			addCriterion("constant  not like ", value, "constant",2);
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andConstantIn(List<String> values) {
			addCriterion("constant  in ", values, "constant");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andConstantNotIn(List<String> values) {
			addCriterion("constant not in ", values, "constant");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andConstantBetween(String value1,String value2) {
			addCriterion("constant between ", value1, value2, "constant");
			return (SysDictCriteria) this;
		}

		public SysDictCriteria andConstantNotBetween(String value1,String value2) {
			addCriterion("constant not between ", value1, value2, "constant");
			return (SysDictCriteria) this;
		}

    }

    public static class SysDictCriteria extends GeneratedCriteria {

        protected SysDictCriteria() {
            super();
        }
    }

    public static class SysDictCriterion {
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

        protected SysDictCriterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

		protected SysDictCriterion(String condition, Object value, int likeType) {
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

        protected SysDictCriterion(String condition, Object value, String typeHandler) {
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

        protected SysDictCriterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected SysDictCriterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected SysDictCriterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}