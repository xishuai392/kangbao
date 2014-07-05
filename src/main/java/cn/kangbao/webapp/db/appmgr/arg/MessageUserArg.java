package cn.kangbao.webapp.db.appmgr.arg;

import java.util.*;
import java.math.*;
import org.apache.commons.lang.*;

public class MessageUserArg {
	private String pk_name = "messageId,userId";
    private String orderByClause;

	private String groupByClause;

	private String columns;

	private String countsql1;
	
	private String countsql2;

    private boolean distinct;

	private int rowStart=0;
    
    private int rowEnd=10;

    private List<MessageUserCriteria> oredCriteria;
  
    public MessageUserArg() {
        oredCriteria = new ArrayList<MessageUserCriteria>();
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

    public List<MessageUserCriteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(MessageUserCriteria criteria) {
        oredCriteria.add(criteria);
    }

    public MessageUserCriteria or() {
        MessageUserCriteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public MessageUserCriteria createCriteria() {
        MessageUserCriteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected MessageUserCriteria createCriteriaInternal() {
        MessageUserCriteria criteria = new MessageUserCriteria();
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
        protected List<MessageUserCriterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<MessageUserCriterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<MessageUserCriterion> getAllCriteria() {
            return criteria;
        }

        public List<MessageUserCriterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new MessageUserCriterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new MessageUserCriterion(condition, value));
        }

		protected void addCriterion(String condition, Object value, String property,int likeType) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new MessageUserCriterion(condition, value,likeType));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new MessageUserCriterion(condition, value1, value2));
        }

		public MessageUserCriteria andCriterionEqualTo(String criterion) {
			if (StringUtils.isBlank(criterion)) {
				criterion="1=1";
			}
			addCriterion(criterion);
			return (MessageUserCriteria) this;
		}
				public MessageUserCriteria andMessageidIsNull() {
			addCriterion("messageId is null");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andMessageidIsNotNull() {
			addCriterion("messageId is not null");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andMessageidEqualTo(Integer value) {
			addCriterion("messageId =", value, "messageId");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andMessageidNotEqualTo(Integer value) {
			addCriterion("messageId <>", value, "messageId");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andMessageidGreaterThan(Integer value) {
			addCriterion("messageId >", value, "messageId");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andMessageidGreaterThanOrEqualTo(Integer value) {
			addCriterion("messageId >=", value, "messageId");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andMessageidLessThan(Integer value) {
			addCriterion("messageId <", value, "messageId");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andMessageidLessThanOrEqualTo(Integer value) {
			addCriterion("messageId <=", value, "messageId");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andMessageidLike(Integer value) {
			addCriterion("messageId like ", value, "messageId",1);
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andMessageidNotLike(Integer value) {
			addCriterion("messageId  not like ", value, "messageId",1);
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andMessageidLeftLike(Integer value) {
			addCriterion("messageId like ", value, "messageId",0);
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andMessageidNotLeftLike(Integer value) {
			addCriterion("messageId  not like ", value, "messageId",0);
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andMessageidRightLike(Integer value) {
			addCriterion("messageId like ", value, "messageId",2);
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andMessageidNotRightLike(Integer value) {
			addCriterion("messageId  not like ", value, "messageId",2);
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andMessageidIn(List<Integer> values) {
			addCriterion("messageId  in ", values, "messageId");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andMessageidNotIn(List<Integer> values) {
			addCriterion("messageId not in ", values, "messageId");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andMessageidBetween(Integer value1,Integer value2) {
			addCriterion("messageId between ", value1, value2, "messageId");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andMessageidNotBetween(Integer value1,Integer value2) {
			addCriterion("messageId not between ", value1, value2, "messageId");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andUseridIsNull() {
			addCriterion("userId is null");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andUseridIsNotNull() {
			addCriterion("userId is not null");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andUseridEqualTo(Integer value) {
			addCriterion("userId =", value, "userId");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andUseridNotEqualTo(Integer value) {
			addCriterion("userId <>", value, "userId");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andUseridGreaterThan(Integer value) {
			addCriterion("userId >", value, "userId");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andUseridGreaterThanOrEqualTo(Integer value) {
			addCriterion("userId >=", value, "userId");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andUseridLessThan(Integer value) {
			addCriterion("userId <", value, "userId");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andUseridLessThanOrEqualTo(Integer value) {
			addCriterion("userId <=", value, "userId");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andUseridLike(Integer value) {
			addCriterion("userId like ", value, "userId",1);
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andUseridNotLike(Integer value) {
			addCriterion("userId  not like ", value, "userId",1);
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andUseridLeftLike(Integer value) {
			addCriterion("userId like ", value, "userId",0);
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andUseridNotLeftLike(Integer value) {
			addCriterion("userId  not like ", value, "userId",0);
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andUseridRightLike(Integer value) {
			addCriterion("userId like ", value, "userId",2);
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andUseridNotRightLike(Integer value) {
			addCriterion("userId  not like ", value, "userId",2);
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andUseridIn(List<Integer> values) {
			addCriterion("userId  in ", values, "userId");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andUseridNotIn(List<Integer> values) {
			addCriterion("userId not in ", values, "userId");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andUseridBetween(Integer value1,Integer value2) {
			addCriterion("userId between ", value1, value2, "userId");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andUseridNotBetween(Integer value1,Integer value2) {
			addCriterion("userId not between ", value1, value2, "userId");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andCreatetimeIsNull() {
			addCriterion("createTime is null");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andCreatetimeIsNotNull() {
			addCriterion("createTime is not null");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andCreatetimeEqualTo(Date value) {
			addCriterion("createTime =", value, "createTime");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andCreatetimeNotEqualTo(Date value) {
			addCriterion("createTime <>", value, "createTime");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andCreatetimeGreaterThan(Date value) {
			addCriterion("createTime >", value, "createTime");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andCreatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("createTime >=", value, "createTime");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andCreatetimeLessThan(Date value) {
			addCriterion("createTime <", value, "createTime");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andCreatetimeLessThanOrEqualTo(Date value) {
			addCriterion("createTime <=", value, "createTime");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andCreatetimeLike(Date value) {
			addCriterion("createTime like ", value, "createTime",1);
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andCreatetimeNotLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",1);
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andCreatetimeLeftLike(Date value) {
			addCriterion("createTime like ", value, "createTime",0);
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andCreatetimeNotLeftLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",0);
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andCreatetimeRightLike(Date value) {
			addCriterion("createTime like ", value, "createTime",2);
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andCreatetimeNotRightLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",2);
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andCreatetimeIn(List<Date> values) {
			addCriterion("createTime  in ", values, "createTime");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andCreatetimeNotIn(List<Date> values) {
			addCriterion("createTime not in ", values, "createTime");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andCreatetimeBetween(Date value1,Date value2) {
			addCriterion("createTime between ", value1, value2, "createTime");
			return (MessageUserCriteria) this;
		}

		public MessageUserCriteria andCreatetimeNotBetween(Date value1,Date value2) {
			addCriterion("createTime not between ", value1, value2, "createTime");
			return (MessageUserCriteria) this;
		}

    }

    public static class MessageUserCriteria extends GeneratedCriteria {

        protected MessageUserCriteria() {
            super();
        }
    }

    public static class MessageUserCriterion {
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

        protected MessageUserCriterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

		protected MessageUserCriterion(String condition, Object value, int likeType) {
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

        protected MessageUserCriterion(String condition, Object value, String typeHandler) {
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

        protected MessageUserCriterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected MessageUserCriterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected MessageUserCriterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}