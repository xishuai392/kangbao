package cn.kangbao.webapp.db.appmgr.arg;

import java.util.*;
import java.math.*;
import org.apache.commons.lang.*;

public class SysBloorstandardArg {
	private String pk_name = "bloorStdId";
    private String orderByClause;

	private String groupByClause;

	private String columns;

	private String countsql1;
	
	private String countsql2;

    private boolean distinct;

	private int rowStart=0;
    
    private int rowEnd=10;

    private List<SysBloorstandardCriteria> oredCriteria;
  
    public SysBloorstandardArg() {
        oredCriteria = new ArrayList<SysBloorstandardCriteria>();
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

    public List<SysBloorstandardCriteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(SysBloorstandardCriteria criteria) {
        oredCriteria.add(criteria);
    }

    public SysBloorstandardCriteria or() {
        SysBloorstandardCriteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public SysBloorstandardCriteria createCriteria() {
        SysBloorstandardCriteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected SysBloorstandardCriteria createCriteriaInternal() {
        SysBloorstandardCriteria criteria = new SysBloorstandardCriteria();
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
        protected List<SysBloorstandardCriterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<SysBloorstandardCriterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<SysBloorstandardCriterion> getAllCriteria() {
            return criteria;
        }

        public List<SysBloorstandardCriterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new SysBloorstandardCriterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new SysBloorstandardCriterion(condition, value));
        }

		protected void addCriterion(String condition, Object value, String property,int likeType) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new SysBloorstandardCriterion(condition, value,likeType));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new SysBloorstandardCriterion(condition, value1, value2));
        }

		public SysBloorstandardCriteria andCriterionEqualTo(String criterion) {
			if (StringUtils.isBlank(criterion)) {
				criterion="1=1";
			}
			addCriterion(criterion);
			return (SysBloorstandardCriteria) this;
		}
				public SysBloorstandardCriteria andBloorstdidIsNull() {
			addCriterion("bloorStdId is null");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andBloorstdidIsNotNull() {
			addCriterion("bloorStdId is not null");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andBloorstdidEqualTo(Integer value) {
			addCriterion("bloorStdId =", value, "bloorStdId");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andBloorstdidNotEqualTo(Integer value) {
			addCriterion("bloorStdId <>", value, "bloorStdId");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andBloorstdidGreaterThan(Integer value) {
			addCriterion("bloorStdId >", value, "bloorStdId");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andBloorstdidGreaterThanOrEqualTo(Integer value) {
			addCriterion("bloorStdId >=", value, "bloorStdId");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andBloorstdidLessThan(Integer value) {
			addCriterion("bloorStdId <", value, "bloorStdId");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andBloorstdidLessThanOrEqualTo(Integer value) {
			addCriterion("bloorStdId <=", value, "bloorStdId");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andBloorstdidLike(Integer value) {
			addCriterion("bloorStdId like ", value, "bloorStdId",1);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andBloorstdidNotLike(Integer value) {
			addCriterion("bloorStdId  not like ", value, "bloorStdId",1);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andBloorstdidLeftLike(Integer value) {
			addCriterion("bloorStdId like ", value, "bloorStdId",0);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andBloorstdidNotLeftLike(Integer value) {
			addCriterion("bloorStdId  not like ", value, "bloorStdId",0);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andBloorstdidRightLike(Integer value) {
			addCriterion("bloorStdId like ", value, "bloorStdId",2);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andBloorstdidNotRightLike(Integer value) {
			addCriterion("bloorStdId  not like ", value, "bloorStdId",2);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andBloorstdidIn(List<Integer> values) {
			addCriterion("bloorStdId  in ", values, "bloorStdId");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andBloorstdidNotIn(List<Integer> values) {
			addCriterion("bloorStdId not in ", values, "bloorStdId");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andBloorstdidBetween(Integer value1,Integer value2) {
			addCriterion("bloorStdId between ", value1, value2, "bloorStdId");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andBloorstdidNotBetween(Integer value1,Integer value2) {
			addCriterion("bloorStdId not between ", value1, value2, "bloorStdId");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andStandardnameIsNull() {
			addCriterion("standardName is null");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andStandardnameIsNotNull() {
			addCriterion("standardName is not null");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andStandardnameEqualTo(String value) {
			addCriterion("standardName =", value, "standardName");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andStandardnameNotEqualTo(String value) {
			addCriterion("standardName <>", value, "standardName");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andStandardnameGreaterThan(String value) {
			addCriterion("standardName >", value, "standardName");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andStandardnameGreaterThanOrEqualTo(String value) {
			addCriterion("standardName >=", value, "standardName");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andStandardnameLessThan(String value) {
			addCriterion("standardName <", value, "standardName");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andStandardnameLessThanOrEqualTo(String value) {
			addCriterion("standardName <=", value, "standardName");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andStandardnameLike(String value) {
			addCriterion("standardName like ", value, "standardName",1);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andStandardnameNotLike(String value) {
			addCriterion("standardName  not like ", value, "standardName",1);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andStandardnameLeftLike(String value) {
			addCriterion("standardName like ", value, "standardName",0);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andStandardnameNotLeftLike(String value) {
			addCriterion("standardName  not like ", value, "standardName",0);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andStandardnameRightLike(String value) {
			addCriterion("standardName like ", value, "standardName",2);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andStandardnameNotRightLike(String value) {
			addCriterion("standardName  not like ", value, "standardName",2);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andStandardnameIn(List<String> values) {
			addCriterion("standardName  in ", values, "standardName");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andStandardnameNotIn(List<String> values) {
			addCriterion("standardName not in ", values, "standardName");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andStandardnameBetween(String value1,String value2) {
			addCriterion("standardName between ", value1, value2, "standardName");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andStandardnameNotBetween(String value1,String value2) {
			addCriterion("standardName not between ", value1, value2, "standardName");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractmaxnumIsNull() {
			addCriterion("contractMaxNum is null");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractmaxnumIsNotNull() {
			addCriterion("contractMaxNum is not null");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractmaxnumEqualTo(Integer value) {
			addCriterion("contractMaxNum =", value, "contractMaxNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractmaxnumNotEqualTo(Integer value) {
			addCriterion("contractMaxNum <>", value, "contractMaxNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractmaxnumGreaterThan(Integer value) {
			addCriterion("contractMaxNum >", value, "contractMaxNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractmaxnumGreaterThanOrEqualTo(Integer value) {
			addCriterion("contractMaxNum >=", value, "contractMaxNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractmaxnumLessThan(Integer value) {
			addCriterion("contractMaxNum <", value, "contractMaxNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractmaxnumLessThanOrEqualTo(Integer value) {
			addCriterion("contractMaxNum <=", value, "contractMaxNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractmaxnumLike(Integer value) {
			addCriterion("contractMaxNum like ", value, "contractMaxNum",1);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractmaxnumNotLike(Integer value) {
			addCriterion("contractMaxNum  not like ", value, "contractMaxNum",1);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractmaxnumLeftLike(Integer value) {
			addCriterion("contractMaxNum like ", value, "contractMaxNum",0);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractmaxnumNotLeftLike(Integer value) {
			addCriterion("contractMaxNum  not like ", value, "contractMaxNum",0);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractmaxnumRightLike(Integer value) {
			addCriterion("contractMaxNum like ", value, "contractMaxNum",2);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractmaxnumNotRightLike(Integer value) {
			addCriterion("contractMaxNum  not like ", value, "contractMaxNum",2);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractmaxnumIn(List<Integer> values) {
			addCriterion("contractMaxNum  in ", values, "contractMaxNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractmaxnumNotIn(List<Integer> values) {
			addCriterion("contractMaxNum not in ", values, "contractMaxNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractmaxnumBetween(Integer value1,Integer value2) {
			addCriterion("contractMaxNum between ", value1, value2, "contractMaxNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractmaxnumNotBetween(Integer value1,Integer value2) {
			addCriterion("contractMaxNum not between ", value1, value2, "contractMaxNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractminnumIsNull() {
			addCriterion("contractMinNum is null");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractminnumIsNotNull() {
			addCriterion("contractMinNum is not null");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractminnumEqualTo(Integer value) {
			addCriterion("contractMinNum =", value, "contractMinNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractminnumNotEqualTo(Integer value) {
			addCriterion("contractMinNum <>", value, "contractMinNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractminnumGreaterThan(Integer value) {
			addCriterion("contractMinNum >", value, "contractMinNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractminnumGreaterThanOrEqualTo(Integer value) {
			addCriterion("contractMinNum >=", value, "contractMinNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractminnumLessThan(Integer value) {
			addCriterion("contractMinNum <", value, "contractMinNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractminnumLessThanOrEqualTo(Integer value) {
			addCriterion("contractMinNum <=", value, "contractMinNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractminnumLike(Integer value) {
			addCriterion("contractMinNum like ", value, "contractMinNum",1);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractminnumNotLike(Integer value) {
			addCriterion("contractMinNum  not like ", value, "contractMinNum",1);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractminnumLeftLike(Integer value) {
			addCriterion("contractMinNum like ", value, "contractMinNum",0);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractminnumNotLeftLike(Integer value) {
			addCriterion("contractMinNum  not like ", value, "contractMinNum",0);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractminnumRightLike(Integer value) {
			addCriterion("contractMinNum like ", value, "contractMinNum",2);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractminnumNotRightLike(Integer value) {
			addCriterion("contractMinNum  not like ", value, "contractMinNum",2);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractminnumIn(List<Integer> values) {
			addCriterion("contractMinNum  in ", values, "contractMinNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractminnumNotIn(List<Integer> values) {
			addCriterion("contractMinNum not in ", values, "contractMinNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractminnumBetween(Integer value1,Integer value2) {
			addCriterion("contractMinNum between ", value1, value2, "contractMinNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andContractminnumNotBetween(Integer value1,Integer value2) {
			addCriterion("contractMinNum not between ", value1, value2, "contractMinNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicmaxnumIsNull() {
			addCriterion("diastolicMaxNum is null");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicmaxnumIsNotNull() {
			addCriterion("diastolicMaxNum is not null");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicmaxnumEqualTo(Integer value) {
			addCriterion("diastolicMaxNum =", value, "diastolicMaxNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicmaxnumNotEqualTo(Integer value) {
			addCriterion("diastolicMaxNum <>", value, "diastolicMaxNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicmaxnumGreaterThan(Integer value) {
			addCriterion("diastolicMaxNum >", value, "diastolicMaxNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicmaxnumGreaterThanOrEqualTo(Integer value) {
			addCriterion("diastolicMaxNum >=", value, "diastolicMaxNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicmaxnumLessThan(Integer value) {
			addCriterion("diastolicMaxNum <", value, "diastolicMaxNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicmaxnumLessThanOrEqualTo(Integer value) {
			addCriterion("diastolicMaxNum <=", value, "diastolicMaxNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicmaxnumLike(Integer value) {
			addCriterion("diastolicMaxNum like ", value, "diastolicMaxNum",1);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicmaxnumNotLike(Integer value) {
			addCriterion("diastolicMaxNum  not like ", value, "diastolicMaxNum",1);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicmaxnumLeftLike(Integer value) {
			addCriterion("diastolicMaxNum like ", value, "diastolicMaxNum",0);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicmaxnumNotLeftLike(Integer value) {
			addCriterion("diastolicMaxNum  not like ", value, "diastolicMaxNum",0);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicmaxnumRightLike(Integer value) {
			addCriterion("diastolicMaxNum like ", value, "diastolicMaxNum",2);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicmaxnumNotRightLike(Integer value) {
			addCriterion("diastolicMaxNum  not like ", value, "diastolicMaxNum",2);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicmaxnumIn(List<Integer> values) {
			addCriterion("diastolicMaxNum  in ", values, "diastolicMaxNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicmaxnumNotIn(List<Integer> values) {
			addCriterion("diastolicMaxNum not in ", values, "diastolicMaxNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicmaxnumBetween(Integer value1,Integer value2) {
			addCriterion("diastolicMaxNum between ", value1, value2, "diastolicMaxNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicmaxnumNotBetween(Integer value1,Integer value2) {
			addCriterion("diastolicMaxNum not between ", value1, value2, "diastolicMaxNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicminnumIsNull() {
			addCriterion("diastolicMinNum is null");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicminnumIsNotNull() {
			addCriterion("diastolicMinNum is not null");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicminnumEqualTo(Integer value) {
			addCriterion("diastolicMinNum =", value, "diastolicMinNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicminnumNotEqualTo(Integer value) {
			addCriterion("diastolicMinNum <>", value, "diastolicMinNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicminnumGreaterThan(Integer value) {
			addCriterion("diastolicMinNum >", value, "diastolicMinNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicminnumGreaterThanOrEqualTo(Integer value) {
			addCriterion("diastolicMinNum >=", value, "diastolicMinNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicminnumLessThan(Integer value) {
			addCriterion("diastolicMinNum <", value, "diastolicMinNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicminnumLessThanOrEqualTo(Integer value) {
			addCriterion("diastolicMinNum <=", value, "diastolicMinNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicminnumLike(Integer value) {
			addCriterion("diastolicMinNum like ", value, "diastolicMinNum",1);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicminnumNotLike(Integer value) {
			addCriterion("diastolicMinNum  not like ", value, "diastolicMinNum",1);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicminnumLeftLike(Integer value) {
			addCriterion("diastolicMinNum like ", value, "diastolicMinNum",0);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicminnumNotLeftLike(Integer value) {
			addCriterion("diastolicMinNum  not like ", value, "diastolicMinNum",0);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicminnumRightLike(Integer value) {
			addCriterion("diastolicMinNum like ", value, "diastolicMinNum",2);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicminnumNotRightLike(Integer value) {
			addCriterion("diastolicMinNum  not like ", value, "diastolicMinNum",2);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicminnumIn(List<Integer> values) {
			addCriterion("diastolicMinNum  in ", values, "diastolicMinNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicminnumNotIn(List<Integer> values) {
			addCriterion("diastolicMinNum not in ", values, "diastolicMinNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicminnumBetween(Integer value1,Integer value2) {
			addCriterion("diastolicMinNum between ", value1, value2, "diastolicMinNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andDiastolicminnumNotBetween(Integer value1,Integer value2) {
			addCriterion("diastolicMinNum not between ", value1, value2, "diastolicMinNum");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andCreatetimeIsNull() {
			addCriterion("createTime is null");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andCreatetimeIsNotNull() {
			addCriterion("createTime is not null");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andCreatetimeEqualTo(Date value) {
			addCriterion("createTime =", value, "createTime");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andCreatetimeNotEqualTo(Date value) {
			addCriterion("createTime <>", value, "createTime");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andCreatetimeGreaterThan(Date value) {
			addCriterion("createTime >", value, "createTime");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andCreatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("createTime >=", value, "createTime");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andCreatetimeLessThan(Date value) {
			addCriterion("createTime <", value, "createTime");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andCreatetimeLessThanOrEqualTo(Date value) {
			addCriterion("createTime <=", value, "createTime");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andCreatetimeLike(Date value) {
			addCriterion("createTime like ", value, "createTime",1);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andCreatetimeNotLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",1);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andCreatetimeLeftLike(Date value) {
			addCriterion("createTime like ", value, "createTime",0);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andCreatetimeNotLeftLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",0);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andCreatetimeRightLike(Date value) {
			addCriterion("createTime like ", value, "createTime",2);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andCreatetimeNotRightLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",2);
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andCreatetimeIn(List<Date> values) {
			addCriterion("createTime  in ", values, "createTime");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andCreatetimeNotIn(List<Date> values) {
			addCriterion("createTime not in ", values, "createTime");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andCreatetimeBetween(Date value1,Date value2) {
			addCriterion("createTime between ", value1, value2, "createTime");
			return (SysBloorstandardCriteria) this;
		}

		public SysBloorstandardCriteria andCreatetimeNotBetween(Date value1,Date value2) {
			addCriterion("createTime not between ", value1, value2, "createTime");
			return (SysBloorstandardCriteria) this;
		}

    }

    public static class SysBloorstandardCriteria extends GeneratedCriteria {

        protected SysBloorstandardCriteria() {
            super();
        }
    }

    public static class SysBloorstandardCriterion {
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

        protected SysBloorstandardCriterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

		protected SysBloorstandardCriterion(String condition, Object value, int likeType) {
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

        protected SysBloorstandardCriterion(String condition, Object value, String typeHandler) {
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

        protected SysBloorstandardCriterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected SysBloorstandardCriterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected SysBloorstandardCriterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}