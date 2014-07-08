package cn.kangbao.webapp.db.appmgr.arg;

import java.util.*;
import java.math.*;
import org.apache.commons.lang.*;

public class SysMessageArg {
	private String pk_name = "messageId";
    private String orderByClause;

	private String groupByClause;

	private String columns;

	private String countsql1;
	
	private String countsql2;

    private boolean distinct;

	private int rowStart=0;
    
    private int rowEnd=10;

    private List<SysMessageCriteria> oredCriteria;
  
    public SysMessageArg() {
        oredCriteria = new ArrayList<SysMessageCriteria>();
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

    public List<SysMessageCriteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(SysMessageCriteria criteria) {
        oredCriteria.add(criteria);
    }

    public SysMessageCriteria or() {
        SysMessageCriteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public SysMessageCriteria createCriteria() {
        SysMessageCriteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected SysMessageCriteria createCriteriaInternal() {
        SysMessageCriteria criteria = new SysMessageCriteria();
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
        protected List<SysMessageCriterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<SysMessageCriterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<SysMessageCriterion> getAllCriteria() {
            return criteria;
        }

        public List<SysMessageCriterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new SysMessageCriterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new SysMessageCriterion(condition, value));
        }

		protected void addCriterion(String condition, Object value, String property,int likeType) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new SysMessageCriterion(condition, value,likeType));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new SysMessageCriterion(condition, value1, value2));
        }

		public SysMessageCriteria andCriterionEqualTo(String criterion) {
			if (StringUtils.isBlank(criterion)) {
				criterion="1=1";
			}
			addCriterion(criterion);
			return (SysMessageCriteria) this;
		}
				public SysMessageCriteria andMessageidIsNull() {
			addCriterion("messageId is null");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andMessageidIsNotNull() {
			addCriterion("messageId is not null");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andMessageidEqualTo(Integer value) {
			addCriterion("messageId =", value, "messageId");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andMessageidNotEqualTo(Integer value) {
			addCriterion("messageId <>", value, "messageId");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andMessageidGreaterThan(Integer value) {
			addCriterion("messageId >", value, "messageId");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andMessageidGreaterThanOrEqualTo(Integer value) {
			addCriterion("messageId >=", value, "messageId");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andMessageidLessThan(Integer value) {
			addCriterion("messageId <", value, "messageId");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andMessageidLessThanOrEqualTo(Integer value) {
			addCriterion("messageId <=", value, "messageId");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andMessageidLike(Integer value) {
			addCriterion("messageId like ", value, "messageId",1);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andMessageidNotLike(Integer value) {
			addCriterion("messageId  not like ", value, "messageId",1);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andMessageidLeftLike(Integer value) {
			addCriterion("messageId like ", value, "messageId",0);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andMessageidNotLeftLike(Integer value) {
			addCriterion("messageId  not like ", value, "messageId",0);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andMessageidRightLike(Integer value) {
			addCriterion("messageId like ", value, "messageId",2);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andMessageidNotRightLike(Integer value) {
			addCriterion("messageId  not like ", value, "messageId",2);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andMessageidIn(List<Integer> values) {
			addCriterion("messageId  in ", values, "messageId");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andMessageidNotIn(List<Integer> values) {
			addCriterion("messageId not in ", values, "messageId");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andMessageidBetween(Integer value1,Integer value2) {
			addCriterion("messageId between ", value1, value2, "messageId");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andMessageidNotBetween(Integer value1,Integer value2) {
			addCriterion("messageId not between ", value1, value2, "messageId");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andUseridIsNull() {
			addCriterion("userId is null");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andUseridIsNotNull() {
			addCriterion("userId is not null");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andUseridEqualTo(Integer value) {
			addCriterion("userId =", value, "userId");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andUseridNotEqualTo(Integer value) {
			addCriterion("userId <>", value, "userId");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andUseridGreaterThan(Integer value) {
			addCriterion("userId >", value, "userId");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andUseridGreaterThanOrEqualTo(Integer value) {
			addCriterion("userId >=", value, "userId");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andUseridLessThan(Integer value) {
			addCriterion("userId <", value, "userId");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andUseridLessThanOrEqualTo(Integer value) {
			addCriterion("userId <=", value, "userId");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andUseridLike(Integer value) {
			addCriterion("userId like ", value, "userId",1);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andUseridNotLike(Integer value) {
			addCriterion("userId  not like ", value, "userId",1);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andUseridLeftLike(Integer value) {
			addCriterion("userId like ", value, "userId",0);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andUseridNotLeftLike(Integer value) {
			addCriterion("userId  not like ", value, "userId",0);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andUseridRightLike(Integer value) {
			addCriterion("userId like ", value, "userId",2);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andUseridNotRightLike(Integer value) {
			addCriterion("userId  not like ", value, "userId",2);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andUseridIn(List<Integer> values) {
			addCriterion("userId  in ", values, "userId");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andUseridNotIn(List<Integer> values) {
			addCriterion("userId not in ", values, "userId");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andUseridBetween(Integer value1,Integer value2) {
			addCriterion("userId between ", value1, value2, "userId");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andUseridNotBetween(Integer value1,Integer value2) {
			addCriterion("userId not between ", value1, value2, "userId");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andTitleIsNull() {
			addCriterion("title is null");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andTitleIsNotNull() {
			addCriterion("title is not null");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andTitleEqualTo(String value) {
			addCriterion("title =", value, "title");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andTitleNotEqualTo(String value) {
			addCriterion("title <>", value, "title");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andTitleGreaterThan(String value) {
			addCriterion("title >", value, "title");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("title >=", value, "title");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andTitleLessThan(String value) {
			addCriterion("title <", value, "title");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("title <=", value, "title");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andTitleLike(String value) {
			addCriterion("title like ", value, "title",1);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andTitleNotLike(String value) {
			addCriterion("title  not like ", value, "title",1);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andTitleLeftLike(String value) {
			addCriterion("title like ", value, "title",0);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andTitleNotLeftLike(String value) {
			addCriterion("title  not like ", value, "title",0);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andTitleRightLike(String value) {
			addCriterion("title like ", value, "title",2);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andTitleNotRightLike(String value) {
			addCriterion("title  not like ", value, "title",2);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andTitleIn(List<String> values) {
			addCriterion("title  in ", values, "title");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andTitleNotIn(List<String> values) {
			addCriterion("title not in ", values, "title");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andTitleBetween(String value1,String value2) {
			addCriterion("title between ", value1, value2, "title");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andTitleNotBetween(String value1,String value2) {
			addCriterion("title not between ", value1, value2, "title");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andContentIsNull() {
			addCriterion("content is null");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andContentIsNotNull() {
			addCriterion("content is not null");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andContentEqualTo(String value) {
			addCriterion("content =", value, "content");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andContentNotEqualTo(String value) {
			addCriterion("content <>", value, "content");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andContentGreaterThan(String value) {
			addCriterion("content >", value, "content");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andContentGreaterThanOrEqualTo(String value) {
			addCriterion("content >=", value, "content");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andContentLessThan(String value) {
			addCriterion("content <", value, "content");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andContentLessThanOrEqualTo(String value) {
			addCriterion("content <=", value, "content");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andContentLike(String value) {
			addCriterion("content like ", value, "content",1);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andContentNotLike(String value) {
			addCriterion("content  not like ", value, "content",1);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andContentLeftLike(String value) {
			addCriterion("content like ", value, "content",0);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andContentNotLeftLike(String value) {
			addCriterion("content  not like ", value, "content",0);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andContentRightLike(String value) {
			addCriterion("content like ", value, "content",2);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andContentNotRightLike(String value) {
			addCriterion("content  not like ", value, "content",2);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andContentIn(List<String> values) {
			addCriterion("content  in ", values, "content");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andContentNotIn(List<String> values) {
			addCriterion("content not in ", values, "content");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andContentBetween(String value1,String value2) {
			addCriterion("content between ", value1, value2, "content");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andContentNotBetween(String value1,String value2) {
			addCriterion("content not between ", value1, value2, "content");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andCreatetimeIsNull() {
			addCriterion("createTime is null");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andCreatetimeIsNotNull() {
			addCriterion("createTime is not null");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andCreatetimeEqualTo(Date value) {
			addCriterion("createTime =", value, "createTime");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andCreatetimeNotEqualTo(Date value) {
			addCriterion("createTime <>", value, "createTime");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andCreatetimeGreaterThan(Date value) {
			addCriterion("createTime >", value, "createTime");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andCreatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("createTime >=", value, "createTime");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andCreatetimeLessThan(Date value) {
			addCriterion("createTime <", value, "createTime");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andCreatetimeLessThanOrEqualTo(Date value) {
			addCriterion("createTime <=", value, "createTime");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andCreatetimeLike(Date value) {
			addCriterion("createTime like ", value, "createTime",1);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andCreatetimeNotLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",1);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andCreatetimeLeftLike(Date value) {
			addCriterion("createTime like ", value, "createTime",0);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andCreatetimeNotLeftLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",0);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andCreatetimeRightLike(Date value) {
			addCriterion("createTime like ", value, "createTime",2);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andCreatetimeNotRightLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",2);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andCreatetimeIn(List<Date> values) {
			addCriterion("createTime  in ", values, "createTime");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andCreatetimeNotIn(List<Date> values) {
			addCriterion("createTime not in ", values, "createTime");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andCreatetimeBetween(Date value1,Date value2) {
			addCriterion("createTime between ", value1, value2, "createTime");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andCreatetimeNotBetween(Date value1,Date value2) {
			addCriterion("createTime not between ", value1, value2, "createTime");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andDrIsNull() {
			addCriterion("dr is null");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andDrIsNotNull() {
			addCriterion("dr is not null");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andDrEqualTo(Integer value) {
			addCriterion("dr =", value, "dr");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andDrNotEqualTo(Integer value) {
			addCriterion("dr <>", value, "dr");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andDrGreaterThan(Integer value) {
			addCriterion("dr >", value, "dr");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andDrGreaterThanOrEqualTo(Integer value) {
			addCriterion("dr >=", value, "dr");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andDrLessThan(Integer value) {
			addCriterion("dr <", value, "dr");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andDrLessThanOrEqualTo(Integer value) {
			addCriterion("dr <=", value, "dr");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andDrLike(Integer value) {
			addCriterion("dr like ", value, "dr",1);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andDrNotLike(Integer value) {
			addCriterion("dr  not like ", value, "dr",1);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andDrLeftLike(Integer value) {
			addCriterion("dr like ", value, "dr",0);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andDrNotLeftLike(Integer value) {
			addCriterion("dr  not like ", value, "dr",0);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andDrRightLike(Integer value) {
			addCriterion("dr like ", value, "dr",2);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andDrNotRightLike(Integer value) {
			addCriterion("dr  not like ", value, "dr",2);
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andDrIn(List<Integer> values) {
			addCriterion("dr  in ", values, "dr");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andDrNotIn(List<Integer> values) {
			addCriterion("dr not in ", values, "dr");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andDrBetween(Integer value1,Integer value2) {
			addCriterion("dr between ", value1, value2, "dr");
			return (SysMessageCriteria) this;
		}

		public SysMessageCriteria andDrNotBetween(Integer value1,Integer value2) {
			addCriterion("dr not between ", value1, value2, "dr");
			return (SysMessageCriteria) this;
		}

    }

    public static class SysMessageCriteria extends GeneratedCriteria {

        protected SysMessageCriteria() {
            super();
        }
    }

    public static class SysMessageCriterion {
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

        protected SysMessageCriterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

		protected SysMessageCriterion(String condition, Object value, int likeType) {
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

        protected SysMessageCriterion(String condition, Object value, String typeHandler) {
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

        protected SysMessageCriterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected SysMessageCriterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected SysMessageCriterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}