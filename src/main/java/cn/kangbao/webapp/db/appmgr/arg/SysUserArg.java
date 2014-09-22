package cn.kangbao.webapp.db.appmgr.arg;

import java.util.*;
import java.math.*;
import org.apache.commons.lang.*;

public class SysUserArg {
	private String pk_name = "userId";
    private String orderByClause;

	private String groupByClause;

	private String columns;

	private String countsql1;
	
	private String countsql2;

    private boolean distinct;

	private int rowStart=0;
    
    private int rowEnd=10;

    private List<SysUserCriteria> oredCriteria;
  
    public SysUserArg() {
        oredCriteria = new ArrayList<SysUserCriteria>();
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

    public List<SysUserCriteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(SysUserCriteria criteria) {
        oredCriteria.add(criteria);
    }

    public SysUserCriteria or() {
        SysUserCriteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public SysUserCriteria createCriteria() {
        SysUserCriteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected SysUserCriteria createCriteriaInternal() {
        SysUserCriteria criteria = new SysUserCriteria();
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
        protected List<SysUserCriterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<SysUserCriterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<SysUserCriterion> getAllCriteria() {
            return criteria;
        }

        public List<SysUserCriterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new SysUserCriterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new SysUserCriterion(condition, value));
        }

		protected void addCriterion(String condition, Object value, String property,int likeType) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new SysUserCriterion(condition, value,likeType));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new SysUserCriterion(condition, value1, value2));
        }

		public SysUserCriteria andCriterionEqualTo(String criterion) {
			if (StringUtils.isBlank(criterion)) {
				criterion="1=1";
			}
			addCriterion(criterion);
			return (SysUserCriteria) this;
		}
				public SysUserCriteria andUseridIsNull() {
			addCriterion("userId is null");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUseridIsNotNull() {
			addCriterion("userId is not null");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUseridEqualTo(Integer value) {
			addCriterion("userId =", value, "userId");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUseridNotEqualTo(Integer value) {
			addCriterion("userId <>", value, "userId");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUseridGreaterThan(Integer value) {
			addCriterion("userId >", value, "userId");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUseridGreaterThanOrEqualTo(Integer value) {
			addCriterion("userId >=", value, "userId");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUseridLessThan(Integer value) {
			addCriterion("userId <", value, "userId");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUseridLessThanOrEqualTo(Integer value) {
			addCriterion("userId <=", value, "userId");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUseridLike(Integer value) {
			addCriterion("userId like ", value, "userId",1);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUseridNotLike(Integer value) {
			addCriterion("userId  not like ", value, "userId",1);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUseridLeftLike(Integer value) {
			addCriterion("userId like ", value, "userId",0);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUseridNotLeftLike(Integer value) {
			addCriterion("userId  not like ", value, "userId",0);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUseridRightLike(Integer value) {
			addCriterion("userId like ", value, "userId",2);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUseridNotRightLike(Integer value) {
			addCriterion("userId  not like ", value, "userId",2);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUseridIn(List<Integer> values) {
			addCriterion("userId  in ", values, "userId");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUseridNotIn(List<Integer> values) {
			addCriterion("userId not in ", values, "userId");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUseridBetween(Integer value1,Integer value2) {
			addCriterion("userId between ", value1, value2, "userId");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUseridNotBetween(Integer value1,Integer value2) {
			addCriterion("userId not between ", value1, value2, "userId");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsernameIsNull() {
			addCriterion("userName is null");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsernameIsNotNull() {
			addCriterion("userName is not null");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsernameEqualTo(String value) {
			addCriterion("userName =", value, "userName");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsernameNotEqualTo(String value) {
			addCriterion("userName <>", value, "userName");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsernameGreaterThan(String value) {
			addCriterion("userName >", value, "userName");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsernameGreaterThanOrEqualTo(String value) {
			addCriterion("userName >=", value, "userName");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsernameLessThan(String value) {
			addCriterion("userName <", value, "userName");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsernameLessThanOrEqualTo(String value) {
			addCriterion("userName <=", value, "userName");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsernameLike(String value) {
			addCriterion("userName like ", value, "userName",1);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsernameNotLike(String value) {
			addCriterion("userName  not like ", value, "userName",1);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsernameLeftLike(String value) {
			addCriterion("userName like ", value, "userName",0);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsernameNotLeftLike(String value) {
			addCriterion("userName  not like ", value, "userName",0);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsernameRightLike(String value) {
			addCriterion("userName like ", value, "userName",2);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsernameNotRightLike(String value) {
			addCriterion("userName  not like ", value, "userName",2);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsernameIn(List<String> values) {
			addCriterion("userName  in ", values, "userName");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsernameNotIn(List<String> values) {
			addCriterion("userName not in ", values, "userName");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsernameBetween(String value1,String value2) {
			addCriterion("userName between ", value1, value2, "userName");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsernameNotBetween(String value1,String value2) {
			addCriterion("userName not between ", value1, value2, "userName");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andPasswordIsNull() {
			addCriterion("password is null");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andPasswordIsNotNull() {
			addCriterion("password is not null");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andPasswordEqualTo(String value) {
			addCriterion("password =", value, "password");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andPasswordNotEqualTo(String value) {
			addCriterion("password <>", value, "password");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andPasswordGreaterThan(String value) {
			addCriterion("password >", value, "password");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("password >=", value, "password");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andPasswordLessThan(String value) {
			addCriterion("password <", value, "password");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andPasswordLessThanOrEqualTo(String value) {
			addCriterion("password <=", value, "password");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andPasswordLike(String value) {
			addCriterion("password like ", value, "password",1);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andPasswordNotLike(String value) {
			addCriterion("password  not like ", value, "password",1);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andPasswordLeftLike(String value) {
			addCriterion("password like ", value, "password",0);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andPasswordNotLeftLike(String value) {
			addCriterion("password  not like ", value, "password",0);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andPasswordRightLike(String value) {
			addCriterion("password like ", value, "password",2);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andPasswordNotRightLike(String value) {
			addCriterion("password  not like ", value, "password",2);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andPasswordIn(List<String> values) {
			addCriterion("password  in ", values, "password");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andPasswordNotIn(List<String> values) {
			addCriterion("password not in ", values, "password");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andPasswordBetween(String value1,String value2) {
			addCriterion("password between ", value1, value2, "password");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andPasswordNotBetween(String value1,String value2) {
			addCriterion("password not between ", value1, value2, "password");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsertypeIsNull() {
			addCriterion("userType is null");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsertypeIsNotNull() {
			addCriterion("userType is not null");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsertypeEqualTo(String value) {
			addCriterion("userType =", value, "userType");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsertypeNotEqualTo(String value) {
			addCriterion("userType <>", value, "userType");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsertypeGreaterThan(String value) {
			addCriterion("userType >", value, "userType");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsertypeGreaterThanOrEqualTo(String value) {
			addCriterion("userType >=", value, "userType");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsertypeLessThan(String value) {
			addCriterion("userType <", value, "userType");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsertypeLessThanOrEqualTo(String value) {
			addCriterion("userType <=", value, "userType");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsertypeLike(String value) {
			addCriterion("userType like ", value, "userType",1);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsertypeNotLike(String value) {
			addCriterion("userType  not like ", value, "userType",1);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsertypeLeftLike(String value) {
			addCriterion("userType like ", value, "userType",0);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsertypeNotLeftLike(String value) {
			addCriterion("userType  not like ", value, "userType",0);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsertypeRightLike(String value) {
			addCriterion("userType like ", value, "userType",2);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsertypeNotRightLike(String value) {
			addCriterion("userType  not like ", value, "userType",2);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsertypeIn(List<String> values) {
			addCriterion("userType  in ", values, "userType");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsertypeNotIn(List<String> values) {
			addCriterion("userType not in ", values, "userType");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsertypeBetween(String value1,String value2) {
			addCriterion("userType between ", value1, value2, "userType");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andUsertypeNotBetween(String value1,String value2) {
			addCriterion("userType not between ", value1, value2, "userType");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andCreatetimeIsNull() {
			addCriterion("createTime is null");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andCreatetimeIsNotNull() {
			addCriterion("createTime is not null");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andCreatetimeEqualTo(Date value) {
			addCriterion("createTime =", value, "createTime");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andCreatetimeNotEqualTo(Date value) {
			addCriterion("createTime <>", value, "createTime");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andCreatetimeGreaterThan(Date value) {
			addCriterion("createTime >", value, "createTime");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andCreatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("createTime >=", value, "createTime");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andCreatetimeLessThan(Date value) {
			addCriterion("createTime <", value, "createTime");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andCreatetimeLessThanOrEqualTo(Date value) {
			addCriterion("createTime <=", value, "createTime");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andCreatetimeLike(Date value) {
			addCriterion("createTime like ", value, "createTime",1);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andCreatetimeNotLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",1);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andCreatetimeLeftLike(Date value) {
			addCriterion("createTime like ", value, "createTime",0);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andCreatetimeNotLeftLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",0);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andCreatetimeRightLike(Date value) {
			addCriterion("createTime like ", value, "createTime",2);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andCreatetimeNotRightLike(Date value) {
			addCriterion("createTime  not like ", value, "createTime",2);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andCreatetimeIn(List<Date> values) {
			addCriterion("createTime  in ", values, "createTime");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andCreatetimeNotIn(List<Date> values) {
			addCriterion("createTime not in ", values, "createTime");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andCreatetimeBetween(Date value1,Date value2) {
			addCriterion("createTime between ", value1, value2, "createTime");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andCreatetimeNotBetween(Date value1,Date value2) {
			addCriterion("createTime not between ", value1, value2, "createTime");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andDrIsNull() {
			addCriterion("dr is null");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andDrIsNotNull() {
			addCriterion("dr is not null");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andDrEqualTo(Integer value) {
			addCriterion("dr =", value, "dr");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andDrNotEqualTo(Integer value) {
			addCriterion("dr <>", value, "dr");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andDrGreaterThan(Integer value) {
			addCriterion("dr >", value, "dr");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andDrGreaterThanOrEqualTo(Integer value) {
			addCriterion("dr >=", value, "dr");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andDrLessThan(Integer value) {
			addCriterion("dr <", value, "dr");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andDrLessThanOrEqualTo(Integer value) {
			addCriterion("dr <=", value, "dr");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andDrLike(Integer value) {
			addCriterion("dr like ", value, "dr",1);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andDrNotLike(Integer value) {
			addCriterion("dr  not like ", value, "dr",1);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andDrLeftLike(Integer value) {
			addCriterion("dr like ", value, "dr",0);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andDrNotLeftLike(Integer value) {
			addCriterion("dr  not like ", value, "dr",0);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andDrRightLike(Integer value) {
			addCriterion("dr like ", value, "dr",2);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andDrNotRightLike(Integer value) {
			addCriterion("dr  not like ", value, "dr",2);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andDrIn(List<Integer> values) {
			addCriterion("dr  in ", values, "dr");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andDrNotIn(List<Integer> values) {
			addCriterion("dr not in ", values, "dr");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andDrBetween(Integer value1,Integer value2) {
			addCriterion("dr between ", value1, value2, "dr");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andDrNotBetween(Integer value1,Integer value2) {
			addCriterion("dr not between ", value1, value2, "dr");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andEmailIsNull() {
			addCriterion("email is null");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andEmailIsNotNull() {
			addCriterion("email is not null");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "email");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andEmailLike(String value) {
			addCriterion("email like ", value, "email",1);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andEmailNotLike(String value) {
			addCriterion("email  not like ", value, "email",1);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andEmailLeftLike(String value) {
			addCriterion("email like ", value, "email",0);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andEmailNotLeftLike(String value) {
			addCriterion("email  not like ", value, "email",0);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andEmailRightLike(String value) {
			addCriterion("email like ", value, "email",2);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andEmailNotRightLike(String value) {
			addCriterion("email  not like ", value, "email",2);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andEmailIn(List<String> values) {
			addCriterion("email  in ", values, "email");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andEmailNotIn(List<String> values) {
			addCriterion("email not in ", values, "email");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andEmailBetween(String value1,String value2) {
			addCriterion("email between ", value1, value2, "email");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andEmailNotBetween(String value1,String value2) {
			addCriterion("email not between ", value1, value2, "email");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andRegistertimeIsNull() {
			addCriterion("registertime is null");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andRegistertimeIsNotNull() {
			addCriterion("registertime is not null");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andRegistertimeEqualTo(Date value) {
			addCriterion("registertime =", value, "registertime");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andRegistertimeNotEqualTo(Date value) {
			addCriterion("registertime <>", value, "registertime");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andRegistertimeGreaterThan(Date value) {
			addCriterion("registertime >", value, "registertime");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andRegistertimeGreaterThanOrEqualTo(Date value) {
			addCriterion("registertime >=", value, "registertime");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andRegistertimeLessThan(Date value) {
			addCriterion("registertime <", value, "registertime");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andRegistertimeLessThanOrEqualTo(Date value) {
			addCriterion("registertime <=", value, "registertime");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andRegistertimeLike(Date value) {
			addCriterion("registertime like ", value, "registertime",1);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andRegistertimeNotLike(Date value) {
			addCriterion("registertime  not like ", value, "registertime",1);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andRegistertimeLeftLike(Date value) {
			addCriterion("registertime like ", value, "registertime",0);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andRegistertimeNotLeftLike(Date value) {
			addCriterion("registertime  not like ", value, "registertime",0);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andRegistertimeRightLike(Date value) {
			addCriterion("registertime like ", value, "registertime",2);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andRegistertimeNotRightLike(Date value) {
			addCriterion("registertime  not like ", value, "registertime",2);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andRegistertimeIn(List<Date> values) {
			addCriterion("registertime  in ", values, "registertime");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andRegistertimeNotIn(List<Date> values) {
			addCriterion("registertime not in ", values, "registertime");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andRegistertimeBetween(Date value1,Date value2) {
			addCriterion("registertime between ", value1, value2, "registertime");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andRegistertimeNotBetween(Date value1,Date value2) {
			addCriterion("registertime not between ", value1, value2, "registertime");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andStateIsNull() {
			addCriterion("state is null");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andStateIsNotNull() {
			addCriterion("state is not null");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andStateEqualTo(String value) {
			addCriterion("state =", value, "state");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andStateNotEqualTo(String value) {
			addCriterion("state <>", value, "state");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andStateGreaterThan(String value) {
			addCriterion("state >", value, "state");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andStateGreaterThanOrEqualTo(String value) {
			addCriterion("state >=", value, "state");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andStateLessThan(String value) {
			addCriterion("state <", value, "state");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andStateLessThanOrEqualTo(String value) {
			addCriterion("state <=", value, "state");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andStateLike(String value) {
			addCriterion("state like ", value, "state",1);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andStateNotLike(String value) {
			addCriterion("state  not like ", value, "state",1);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andStateLeftLike(String value) {
			addCriterion("state like ", value, "state",0);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andStateNotLeftLike(String value) {
			addCriterion("state  not like ", value, "state",0);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andStateRightLike(String value) {
			addCriterion("state like ", value, "state",2);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andStateNotRightLike(String value) {
			addCriterion("state  not like ", value, "state",2);
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andStateIn(List<String> values) {
			addCriterion("state  in ", values, "state");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andStateNotIn(List<String> values) {
			addCriterion("state not in ", values, "state");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andStateBetween(String value1,String value2) {
			addCriterion("state between ", value1, value2, "state");
			return (SysUserCriteria) this;
		}

		public SysUserCriteria andStateNotBetween(String value1,String value2) {
			addCriterion("state not between ", value1, value2, "state");
			return (SysUserCriteria) this;
		}

    }

    public static class SysUserCriteria extends GeneratedCriteria {

        protected SysUserCriteria() {
            super();
        }
    }

    public static class SysUserCriterion {
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

        protected SysUserCriterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

		protected SysUserCriterion(String condition, Object value, int likeType) {
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

        protected SysUserCriterion(String condition, Object value, String typeHandler) {
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

        protected SysUserCriterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected SysUserCriterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected SysUserCriterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}