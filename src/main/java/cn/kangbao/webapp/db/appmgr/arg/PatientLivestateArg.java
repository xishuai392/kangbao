package cn.kangbao.webapp.db.appmgr.arg;

import java.util.*;
import java.math.*;
import org.apache.commons.lang.*;

public class PatientLivestateArg {
	private String pk_name = "liveStateId";
    private String orderByClause;

	private String groupByClause;

	private String columns;

	private String countsql1;
	
	private String countsql2;

    private boolean distinct;

	private int rowStart=0;
    
    private int rowEnd=10;

    private List<PatientLivestateCriteria> oredCriteria;
  
    public PatientLivestateArg() {
        oredCriteria = new ArrayList<PatientLivestateCriteria>();
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

    public List<PatientLivestateCriteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(PatientLivestateCriteria criteria) {
        oredCriteria.add(criteria);
    }

    public PatientLivestateCriteria or() {
        PatientLivestateCriteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public PatientLivestateCriteria createCriteria() {
        PatientLivestateCriteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected PatientLivestateCriteria createCriteriaInternal() {
        PatientLivestateCriteria criteria = new PatientLivestateCriteria();
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
        protected List<PatientLivestateCriterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<PatientLivestateCriterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<PatientLivestateCriterion> getAllCriteria() {
            return criteria;
        }

        public List<PatientLivestateCriterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new PatientLivestateCriterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new PatientLivestateCriterion(condition, value));
        }

		protected void addCriterion(String condition, Object value, String property,int likeType) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new PatientLivestateCriterion(condition, value,likeType));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new PatientLivestateCriterion(condition, value1, value2));
        }

		public PatientLivestateCriteria andCriterionEqualTo(String criterion) {
			if (StringUtils.isBlank(criterion)) {
				criterion="1=1";
			}
			addCriterion(criterion);
			return (PatientLivestateCriteria) this;
		}
				public PatientLivestateCriteria andLivestateidIsNull() {
			addCriterion("liveStateId is null");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateidIsNotNull() {
			addCriterion("liveStateId is not null");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateidEqualTo(Integer value) {
			addCriterion("liveStateId =", value, "liveStateId");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateidNotEqualTo(Integer value) {
			addCriterion("liveStateId <>", value, "liveStateId");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateidGreaterThan(Integer value) {
			addCriterion("liveStateId >", value, "liveStateId");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateidGreaterThanOrEqualTo(Integer value) {
			addCriterion("liveStateId >=", value, "liveStateId");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateidLessThan(Integer value) {
			addCriterion("liveStateId <", value, "liveStateId");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateidLessThanOrEqualTo(Integer value) {
			addCriterion("liveStateId <=", value, "liveStateId");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateidLike(Integer value) {
			addCriterion("liveStateId like ", value, "liveStateId",1);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateidNotLike(Integer value) {
			addCriterion("liveStateId  not like ", value, "liveStateId",1);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateidLeftLike(Integer value) {
			addCriterion("liveStateId like ", value, "liveStateId",0);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateidNotLeftLike(Integer value) {
			addCriterion("liveStateId  not like ", value, "liveStateId",0);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateidRightLike(Integer value) {
			addCriterion("liveStateId like ", value, "liveStateId",2);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateidNotRightLike(Integer value) {
			addCriterion("liveStateId  not like ", value, "liveStateId",2);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateidIn(List<Integer> values) {
			addCriterion("liveStateId  in ", values, "liveStateId");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateidNotIn(List<Integer> values) {
			addCriterion("liveStateId not in ", values, "liveStateId");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateidBetween(Integer value1,Integer value2) {
			addCriterion("liveStateId between ", value1, value2, "liveStateId");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateidNotBetween(Integer value1,Integer value2) {
			addCriterion("liveStateId not between ", value1, value2, "liveStateId");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andPersonidIsNull() {
			addCriterion("personId is null");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andPersonidIsNotNull() {
			addCriterion("personId is not null");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andPersonidEqualTo(Integer value) {
			addCriterion("personId =", value, "personId");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andPersonidNotEqualTo(Integer value) {
			addCriterion("personId <>", value, "personId");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andPersonidGreaterThan(Integer value) {
			addCriterion("personId >", value, "personId");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andPersonidGreaterThanOrEqualTo(Integer value) {
			addCriterion("personId >=", value, "personId");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andPersonidLessThan(Integer value) {
			addCriterion("personId <", value, "personId");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andPersonidLessThanOrEqualTo(Integer value) {
			addCriterion("personId <=", value, "personId");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andPersonidLike(Integer value) {
			addCriterion("personId like ", value, "personId",1);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andPersonidNotLike(Integer value) {
			addCriterion("personId  not like ", value, "personId",1);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andPersonidLeftLike(Integer value) {
			addCriterion("personId like ", value, "personId",0);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andPersonidNotLeftLike(Integer value) {
			addCriterion("personId  not like ", value, "personId",0);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andPersonidRightLike(Integer value) {
			addCriterion("personId like ", value, "personId",2);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andPersonidNotRightLike(Integer value) {
			addCriterion("personId  not like ", value, "personId",2);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andPersonidIn(List<Integer> values) {
			addCriterion("personId  in ", values, "personId");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andPersonidNotIn(List<Integer> values) {
			addCriterion("personId not in ", values, "personId");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andPersonidBetween(Integer value1,Integer value2) {
			addCriterion("personId between ", value1, value2, "personId");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andPersonidNotBetween(Integer value1,Integer value2) {
			addCriterion("personId not between ", value1, value2, "personId");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLiveitemIsNull() {
			addCriterion("liveItem is null");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLiveitemIsNotNull() {
			addCriterion("liveItem is not null");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLiveitemEqualTo(Integer value) {
			addCriterion("liveItem =", value, "liveItem");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLiveitemNotEqualTo(Integer value) {
			addCriterion("liveItem <>", value, "liveItem");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLiveitemGreaterThan(Integer value) {
			addCriterion("liveItem >", value, "liveItem");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLiveitemGreaterThanOrEqualTo(Integer value) {
			addCriterion("liveItem >=", value, "liveItem");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLiveitemLessThan(Integer value) {
			addCriterion("liveItem <", value, "liveItem");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLiveitemLessThanOrEqualTo(Integer value) {
			addCriterion("liveItem <=", value, "liveItem");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLiveitemLike(Integer value) {
			addCriterion("liveItem like ", value, "liveItem",1);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLiveitemNotLike(Integer value) {
			addCriterion("liveItem  not like ", value, "liveItem",1);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLiveitemLeftLike(Integer value) {
			addCriterion("liveItem like ", value, "liveItem",0);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLiveitemNotLeftLike(Integer value) {
			addCriterion("liveItem  not like ", value, "liveItem",0);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLiveitemRightLike(Integer value) {
			addCriterion("liveItem like ", value, "liveItem",2);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLiveitemNotRightLike(Integer value) {
			addCriterion("liveItem  not like ", value, "liveItem",2);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLiveitemIn(List<Integer> values) {
			addCriterion("liveItem  in ", values, "liveItem");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLiveitemNotIn(List<Integer> values) {
			addCriterion("liveItem not in ", values, "liveItem");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLiveitemBetween(Integer value1,Integer value2) {
			addCriterion("liveItem between ", value1, value2, "liveItem");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLiveitemNotBetween(Integer value1,Integer value2) {
			addCriterion("liveItem not between ", value1, value2, "liveItem");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateIsNull() {
			addCriterion("liveState is null");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateIsNotNull() {
			addCriterion("liveState is not null");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateEqualTo(String value) {
			addCriterion("liveState =", value, "liveState");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateNotEqualTo(String value) {
			addCriterion("liveState <>", value, "liveState");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateGreaterThan(String value) {
			addCriterion("liveState >", value, "liveState");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateGreaterThanOrEqualTo(String value) {
			addCriterion("liveState >=", value, "liveState");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateLessThan(String value) {
			addCriterion("liveState <", value, "liveState");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateLessThanOrEqualTo(String value) {
			addCriterion("liveState <=", value, "liveState");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateLike(String value) {
			addCriterion("liveState like ", value, "liveState",1);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateNotLike(String value) {
			addCriterion("liveState  not like ", value, "liveState",1);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateLeftLike(String value) {
			addCriterion("liveState like ", value, "liveState",0);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateNotLeftLike(String value) {
			addCriterion("liveState  not like ", value, "liveState",0);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateRightLike(String value) {
			addCriterion("liveState like ", value, "liveState",2);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateNotRightLike(String value) {
			addCriterion("liveState  not like ", value, "liveState",2);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateIn(List<String> values) {
			addCriterion("liveState  in ", values, "liveState");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateNotIn(List<String> values) {
			addCriterion("liveState not in ", values, "liveState");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateBetween(String value1,String value2) {
			addCriterion("liveState between ", value1, value2, "liveState");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andLivestateNotBetween(String value1,String value2) {
			addCriterion("liveState not between ", value1, value2, "liveState");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andCreatetimeIsNull() {
			addCriterion("createTime is null");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andCreatetimeIsNotNull() {
			addCriterion("createTime is not null");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andCreatetimeEqualTo(Date value) {
			addCriterion("createTime =", value, "createTime");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andCreatetimeNotEqualTo(Date value) {
			addCriterion("createTime <>", value, "createTime");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andCreatetimeGreaterThan(Date value) {
			addCriterion("createTime >", value, "createTime");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andCreatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("createTime >=", value, "createTime");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andCreatetimeLessThan(Date value) {
			addCriterion("createTime <", value, "createTime");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andCreatetimeLessThanOrEqualTo(Date value) {
			addCriterion("createTime <=", value, "createTime");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andCreatetimeLike(Date value) {
			addCriterion("createTime like ", value, "createTime",1);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andCreatetimeNotLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",1);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andCreatetimeLeftLike(Date value) {
			addCriterion("createTime like ", value, "createTime",0);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andCreatetimeNotLeftLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",0);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andCreatetimeRightLike(Date value) {
			addCriterion("createTime like ", value, "createTime",2);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andCreatetimeNotRightLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",2);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andCreatetimeIn(List<Date> values) {
			addCriterion("createTime  in ", values, "createTime");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andCreatetimeNotIn(List<Date> values) {
			addCriterion("createTime not in ", values, "createTime");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andCreatetimeBetween(Date value1,Date value2) {
			addCriterion("createTime between ", value1, value2, "createTime");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andCreatetimeNotBetween(Date value1,Date value2) {
			addCriterion("createTime not between ", value1, value2, "createTime");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andDrIsNull() {
			addCriterion("dr is null");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andDrIsNotNull() {
			addCriterion("dr is not null");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andDrEqualTo(Integer value) {
			addCriterion("dr =", value, "dr");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andDrNotEqualTo(Integer value) {
			addCriterion("dr <>", value, "dr");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andDrGreaterThan(Integer value) {
			addCriterion("dr >", value, "dr");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andDrGreaterThanOrEqualTo(Integer value) {
			addCriterion("dr >=", value, "dr");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andDrLessThan(Integer value) {
			addCriterion("dr <", value, "dr");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andDrLessThanOrEqualTo(Integer value) {
			addCriterion("dr <=", value, "dr");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andDrLike(Integer value) {
			addCriterion("dr like ", value, "dr",1);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andDrNotLike(Integer value) {
			addCriterion("dr  not like ", value, "dr",1);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andDrLeftLike(Integer value) {
			addCriterion("dr like ", value, "dr",0);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andDrNotLeftLike(Integer value) {
			addCriterion("dr  not like ", value, "dr",0);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andDrRightLike(Integer value) {
			addCriterion("dr like ", value, "dr",2);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andDrNotRightLike(Integer value) {
			addCriterion("dr  not like ", value, "dr",2);
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andDrIn(List<Integer> values) {
			addCriterion("dr  in ", values, "dr");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andDrNotIn(List<Integer> values) {
			addCriterion("dr not in ", values, "dr");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andDrBetween(Integer value1,Integer value2) {
			addCriterion("dr between ", value1, value2, "dr");
			return (PatientLivestateCriteria) this;
		}

		public PatientLivestateCriteria andDrNotBetween(Integer value1,Integer value2) {
			addCriterion("dr not between ", value1, value2, "dr");
			return (PatientLivestateCriteria) this;
		}

    }

    public static class PatientLivestateCriteria extends GeneratedCriteria {

        protected PatientLivestateCriteria() {
            super();
        }
    }

    public static class PatientLivestateCriterion {
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

        protected PatientLivestateCriterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

		protected PatientLivestateCriterion(String condition, Object value, int likeType) {
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

        protected PatientLivestateCriterion(String condition, Object value, String typeHandler) {
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

        protected PatientLivestateCriterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected PatientLivestateCriterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected PatientLivestateCriterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}