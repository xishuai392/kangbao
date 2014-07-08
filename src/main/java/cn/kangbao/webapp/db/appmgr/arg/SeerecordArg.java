package cn.kangbao.webapp.db.appmgr.arg;

import java.util.*;
import java.math.*;
import org.apache.commons.lang.*;

public class SeerecordArg {
	private String pk_name = "caseId";
    private String orderByClause;

	private String groupByClause;

	private String columns;

	private String countsql1;
	
	private String countsql2;

    private boolean distinct;

	private int rowStart=0;
    
    private int rowEnd=10;

    private List<SeerecordCriteria> oredCriteria;
  
    public SeerecordArg() {
        oredCriteria = new ArrayList<SeerecordCriteria>();
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

    public List<SeerecordCriteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(SeerecordCriteria criteria) {
        oredCriteria.add(criteria);
    }

    public SeerecordCriteria or() {
        SeerecordCriteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public SeerecordCriteria createCriteria() {
        SeerecordCriteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected SeerecordCriteria createCriteriaInternal() {
        SeerecordCriteria criteria = new SeerecordCriteria();
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
        protected List<SeerecordCriterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<SeerecordCriterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<SeerecordCriterion> getAllCriteria() {
            return criteria;
        }

        public List<SeerecordCriterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new SeerecordCriterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new SeerecordCriterion(condition, value));
        }

		protected void addCriterion(String condition, Object value, String property,int likeType) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new SeerecordCriterion(condition, value,likeType));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new SeerecordCriterion(condition, value1, value2));
        }

		public SeerecordCriteria andCriterionEqualTo(String criterion) {
			if (StringUtils.isBlank(criterion)) {
				criterion="1=1";
			}
			addCriterion(criterion);
			return (SeerecordCriteria) this;
		}
				public SeerecordCriteria andCaseidIsNull() {
			addCriterion("caseId is null");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCaseidIsNotNull() {
			addCriterion("caseId is not null");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCaseidEqualTo(Integer value) {
			addCriterion("caseId =", value, "caseId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCaseidNotEqualTo(Integer value) {
			addCriterion("caseId <>", value, "caseId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCaseidGreaterThan(Integer value) {
			addCriterion("caseId >", value, "caseId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCaseidGreaterThanOrEqualTo(Integer value) {
			addCriterion("caseId >=", value, "caseId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCaseidLessThan(Integer value) {
			addCriterion("caseId <", value, "caseId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCaseidLessThanOrEqualTo(Integer value) {
			addCriterion("caseId <=", value, "caseId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCaseidLike(Integer value) {
			addCriterion("caseId like ", value, "caseId",1);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCaseidNotLike(Integer value) {
			addCriterion("caseId  not like ", value, "caseId",1);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCaseidLeftLike(Integer value) {
			addCriterion("caseId like ", value, "caseId",0);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCaseidNotLeftLike(Integer value) {
			addCriterion("caseId  not like ", value, "caseId",0);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCaseidRightLike(Integer value) {
			addCriterion("caseId like ", value, "caseId",2);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCaseidNotRightLike(Integer value) {
			addCriterion("caseId  not like ", value, "caseId",2);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCaseidIn(List<Integer> values) {
			addCriterion("caseId  in ", values, "caseId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCaseidNotIn(List<Integer> values) {
			addCriterion("caseId not in ", values, "caseId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCaseidBetween(Integer value1,Integer value2) {
			addCriterion("caseId between ", value1, value2, "caseId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCaseidNotBetween(Integer value1,Integer value2) {
			addCriterion("caseId not between ", value1, value2, "caseId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andPersonidIsNull() {
			addCriterion("personId is null");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andPersonidIsNotNull() {
			addCriterion("personId is not null");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andPersonidEqualTo(Integer value) {
			addCriterion("personId =", value, "personId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andPersonidNotEqualTo(Integer value) {
			addCriterion("personId <>", value, "personId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andPersonidGreaterThan(Integer value) {
			addCriterion("personId >", value, "personId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andPersonidGreaterThanOrEqualTo(Integer value) {
			addCriterion("personId >=", value, "personId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andPersonidLessThan(Integer value) {
			addCriterion("personId <", value, "personId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andPersonidLessThanOrEqualTo(Integer value) {
			addCriterion("personId <=", value, "personId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andPersonidLike(Integer value) {
			addCriterion("personId like ", value, "personId",1);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andPersonidNotLike(Integer value) {
			addCriterion("personId  not like ", value, "personId",1);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andPersonidLeftLike(Integer value) {
			addCriterion("personId like ", value, "personId",0);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andPersonidNotLeftLike(Integer value) {
			addCriterion("personId  not like ", value, "personId",0);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andPersonidRightLike(Integer value) {
			addCriterion("personId like ", value, "personId",2);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andPersonidNotRightLike(Integer value) {
			addCriterion("personId  not like ", value, "personId",2);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andPersonidIn(List<Integer> values) {
			addCriterion("personId  in ", values, "personId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andPersonidNotIn(List<Integer> values) {
			addCriterion("personId not in ", values, "personId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andPersonidBetween(Integer value1,Integer value2) {
			addCriterion("personId between ", value1, value2, "personId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andPersonidNotBetween(Integer value1,Integer value2) {
			addCriterion("personId not between ", value1, value2, "personId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andDoctoridIsNull() {
			addCriterion("doctorId is null");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andDoctoridIsNotNull() {
			addCriterion("doctorId is not null");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andDoctoridEqualTo(Integer value) {
			addCriterion("doctorId =", value, "doctorId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andDoctoridNotEqualTo(Integer value) {
			addCriterion("doctorId <>", value, "doctorId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andDoctoridGreaterThan(Integer value) {
			addCriterion("doctorId >", value, "doctorId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andDoctoridGreaterThanOrEqualTo(Integer value) {
			addCriterion("doctorId >=", value, "doctorId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andDoctoridLessThan(Integer value) {
			addCriterion("doctorId <", value, "doctorId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andDoctoridLessThanOrEqualTo(Integer value) {
			addCriterion("doctorId <=", value, "doctorId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andDoctoridLike(Integer value) {
			addCriterion("doctorId like ", value, "doctorId",1);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andDoctoridNotLike(Integer value) {
			addCriterion("doctorId  not like ", value, "doctorId",1);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andDoctoridLeftLike(Integer value) {
			addCriterion("doctorId like ", value, "doctorId",0);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andDoctoridNotLeftLike(Integer value) {
			addCriterion("doctorId  not like ", value, "doctorId",0);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andDoctoridRightLike(Integer value) {
			addCriterion("doctorId like ", value, "doctorId",2);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andDoctoridNotRightLike(Integer value) {
			addCriterion("doctorId  not like ", value, "doctorId",2);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andDoctoridIn(List<Integer> values) {
			addCriterion("doctorId  in ", values, "doctorId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andDoctoridNotIn(List<Integer> values) {
			addCriterion("doctorId not in ", values, "doctorId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andDoctoridBetween(Integer value1,Integer value2) {
			addCriterion("doctorId between ", value1, value2, "doctorId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andDoctoridNotBetween(Integer value1,Integer value2) {
			addCriterion("doctorId not between ", value1, value2, "doctorId");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReadtimeIsNull() {
			addCriterion("readTime is null");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReadtimeIsNotNull() {
			addCriterion("readTime is not null");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReadtimeEqualTo(Date value) {
			addCriterion("readTime =", value, "readTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReadtimeNotEqualTo(Date value) {
			addCriterion("readTime <>", value, "readTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReadtimeGreaterThan(Date value) {
			addCriterion("readTime >", value, "readTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReadtimeGreaterThanOrEqualTo(Date value) {
			addCriterion("readTime >=", value, "readTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReadtimeLessThan(Date value) {
			addCriterion("readTime <", value, "readTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReadtimeLessThanOrEqualTo(Date value) {
			addCriterion("readTime <=", value, "readTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReadtimeLike(Date value) {
			addCriterion("readTime like ", value, "readTime",1);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReadtimeNotLike(Date value) {
			addCriterion("readTime  not like ", value, "readTime",1);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReadtimeLeftLike(Date value) {
			addCriterion("readTime like ", value, "readTime",0);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReadtimeNotLeftLike(Date value) {
			addCriterion("readTime  not like ", value, "readTime",0);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReadtimeRightLike(Date value) {
			addCriterion("readTime like ", value, "readTime",2);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReadtimeNotRightLike(Date value) {
			addCriterion("readTime  not like ", value, "readTime",2);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReadtimeIn(List<Date> values) {
			addCriterion("readTime  in ", values, "readTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReadtimeNotIn(List<Date> values) {
			addCriterion("readTime not in ", values, "readTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReadtimeBetween(Date value1,Date value2) {
			addCriterion("readTime between ", value1, value2, "readTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReadtimeNotBetween(Date value1,Date value2) {
			addCriterion("readTime not between ", value1, value2, "readTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplyIsNull() {
			addCriterion("reply is null");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplyIsNotNull() {
			addCriterion("reply is not null");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplyEqualTo(String value) {
			addCriterion("reply =", value, "reply");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplyNotEqualTo(String value) {
			addCriterion("reply <>", value, "reply");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplyGreaterThan(String value) {
			addCriterion("reply >", value, "reply");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplyGreaterThanOrEqualTo(String value) {
			addCriterion("reply >=", value, "reply");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplyLessThan(String value) {
			addCriterion("reply <", value, "reply");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplyLessThanOrEqualTo(String value) {
			addCriterion("reply <=", value, "reply");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplyLike(String value) {
			addCriterion("reply like ", value, "reply",1);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplyNotLike(String value) {
			addCriterion("reply  not like ", value, "reply",1);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplyLeftLike(String value) {
			addCriterion("reply like ", value, "reply",0);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplyNotLeftLike(String value) {
			addCriterion("reply  not like ", value, "reply",0);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplyRightLike(String value) {
			addCriterion("reply like ", value, "reply",2);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplyNotRightLike(String value) {
			addCriterion("reply  not like ", value, "reply",2);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplyIn(List<String> values) {
			addCriterion("reply  in ", values, "reply");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplyNotIn(List<String> values) {
			addCriterion("reply not in ", values, "reply");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplyBetween(String value1,String value2) {
			addCriterion("reply between ", value1, value2, "reply");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplyNotBetween(String value1,String value2) {
			addCriterion("reply not between ", value1, value2, "reply");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplytimeIsNull() {
			addCriterion("replyTime is null");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplytimeIsNotNull() {
			addCriterion("replyTime is not null");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplytimeEqualTo(Date value) {
			addCriterion("replyTime =", value, "replyTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplytimeNotEqualTo(Date value) {
			addCriterion("replyTime <>", value, "replyTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplytimeGreaterThan(Date value) {
			addCriterion("replyTime >", value, "replyTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplytimeGreaterThanOrEqualTo(Date value) {
			addCriterion("replyTime >=", value, "replyTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplytimeLessThan(Date value) {
			addCriterion("replyTime <", value, "replyTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplytimeLessThanOrEqualTo(Date value) {
			addCriterion("replyTime <=", value, "replyTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplytimeLike(Date value) {
			addCriterion("replyTime like ", value, "replyTime",1);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplytimeNotLike(Date value) {
			addCriterion("replyTime  not like ", value, "replyTime",1);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplytimeLeftLike(Date value) {
			addCriterion("replyTime like ", value, "replyTime",0);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplytimeNotLeftLike(Date value) {
			addCriterion("replyTime  not like ", value, "replyTime",0);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplytimeRightLike(Date value) {
			addCriterion("replyTime like ", value, "replyTime",2);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplytimeNotRightLike(Date value) {
			addCriterion("replyTime  not like ", value, "replyTime",2);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplytimeIn(List<Date> values) {
			addCriterion("replyTime  in ", values, "replyTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplytimeNotIn(List<Date> values) {
			addCriterion("replyTime not in ", values, "replyTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplytimeBetween(Date value1,Date value2) {
			addCriterion("replyTime between ", value1, value2, "replyTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andReplytimeNotBetween(Date value1,Date value2) {
			addCriterion("replyTime not between ", value1, value2, "replyTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCreatetimeIsNull() {
			addCriterion("createTime is null");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCreatetimeIsNotNull() {
			addCriterion("createTime is not null");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCreatetimeEqualTo(Date value) {
			addCriterion("createTime =", value, "createTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCreatetimeNotEqualTo(Date value) {
			addCriterion("createTime <>", value, "createTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCreatetimeGreaterThan(Date value) {
			addCriterion("createTime >", value, "createTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCreatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("createTime >=", value, "createTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCreatetimeLessThan(Date value) {
			addCriterion("createTime <", value, "createTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCreatetimeLessThanOrEqualTo(Date value) {
			addCriterion("createTime <=", value, "createTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCreatetimeLike(Date value) {
			addCriterion("createTime like ", value, "createTime",1);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCreatetimeNotLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",1);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCreatetimeLeftLike(Date value) {
			addCriterion("createTime like ", value, "createTime",0);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCreatetimeNotLeftLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",0);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCreatetimeRightLike(Date value) {
			addCriterion("createTime like ", value, "createTime",2);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCreatetimeNotRightLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",2);
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCreatetimeIn(List<Date> values) {
			addCriterion("createTime  in ", values, "createTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCreatetimeNotIn(List<Date> values) {
			addCriterion("createTime not in ", values, "createTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCreatetimeBetween(Date value1,Date value2) {
			addCriterion("createTime between ", value1, value2, "createTime");
			return (SeerecordCriteria) this;
		}

		public SeerecordCriteria andCreatetimeNotBetween(Date value1,Date value2) {
			addCriterion("createTime not between ", value1, value2, "createTime");
			return (SeerecordCriteria) this;
		}

    }

    public static class SeerecordCriteria extends GeneratedCriteria {

        protected SeerecordCriteria() {
            super();
        }
    }

    public static class SeerecordCriterion {
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

        protected SeerecordCriterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

		protected SeerecordCriterion(String condition, Object value, int likeType) {
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

        protected SeerecordCriterion(String condition, Object value, String typeHandler) {
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

        protected SeerecordCriterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected SeerecordCriterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected SeerecordCriterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}