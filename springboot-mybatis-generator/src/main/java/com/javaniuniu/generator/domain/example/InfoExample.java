package com.javaniuniu.generator.domain.example;

import com.javaniuniu.generator.domain.Info;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class InfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table info
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table info
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table info
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table info
     *
     * @mbg.generated
     */
    protected Integer offset;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table info
     *
     * @mbg.generated
     */
    protected Integer rows;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated
     */
    public InfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated
     */
    public InfoExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated
     */
    public InfoExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
        rows = null;
        offset = null;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated
     */
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated
     */
    public Integer getRows() {
        return this.rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated
     */
    public InfoExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated
     */
    public InfoExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated
     */
    public InfoExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated
     */
    public static Criteria newAndCreateCriteria() {
        InfoExample example = new InfoExample();
        return example.createCriteria();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated
     */
    public InfoExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated
     */
    public InfoExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table info
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andInfoIdIsNull() {
            addCriterion("info_id is null");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNotNull() {
            addCriterion("info_id is not null");
            return (Criteria) this;
        }

        public Criteria andInfoIdEqualTo(Integer value) {
            addCriterion("info_id =", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdEqualToColumn(Info.Column column) {
            addCriterion(new StringBuilder("info_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInfoIdNotEqualTo(Integer value) {
            addCriterion("info_id <>", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotEqualToColumn(Info.Column column) {
            addCriterion(new StringBuilder("info_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThan(Integer value) {
            addCriterion("info_id >", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThanColumn(Info.Column column) {
            addCriterion(new StringBuilder("info_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("info_id >=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThanOrEqualToColumn(Info.Column column) {
            addCriterion(new StringBuilder("info_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThan(Integer value) {
            addCriterion("info_id <", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThanColumn(Info.Column column) {
            addCriterion(new StringBuilder("info_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("info_id <=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThanOrEqualToColumn(Info.Column column) {
            addCriterion(new StringBuilder("info_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInfoIdIn(List<Integer> values) {
            addCriterion("info_id in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotIn(List<Integer> values) {
            addCriterion("info_id not in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("info_id between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("info_id not between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualToColumn(Info.Column column) {
            addCriterion(new StringBuilder("username = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualToColumn(Info.Column column) {
            addCriterion(new StringBuilder("username <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanColumn(Info.Column column) {
            addCriterion(new StringBuilder("username > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualToColumn(Info.Column column) {
            addCriterion(new StringBuilder("username >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanColumn(Info.Column column) {
            addCriterion(new StringBuilder("username < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualToColumn(Info.Column column) {
            addCriterion(new StringBuilder("username <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andCheckedDateIsNull() {
            addCriterion("checked_date is null");
            return (Criteria) this;
        }

        public Criteria andCheckedDateIsNotNull() {
            addCriterion("checked_date is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedDateEqualTo(LocalDate value) {
            addCriterion("checked_date =", value, "checkedDate");
            return (Criteria) this;
        }

        public Criteria andCheckedDateEqualToColumn(Info.Column column) {
            addCriterion(new StringBuilder("checked_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedDateNotEqualTo(LocalDate value) {
            addCriterion("checked_date <>", value, "checkedDate");
            return (Criteria) this;
        }

        public Criteria andCheckedDateNotEqualToColumn(Info.Column column) {
            addCriterion(new StringBuilder("checked_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedDateGreaterThan(LocalDate value) {
            addCriterion("checked_date >", value, "checkedDate");
            return (Criteria) this;
        }

        public Criteria andCheckedDateGreaterThanColumn(Info.Column column) {
            addCriterion(new StringBuilder("checked_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedDateGreaterThanOrEqualTo(LocalDate value) {
            addCriterion("checked_date >=", value, "checkedDate");
            return (Criteria) this;
        }

        public Criteria andCheckedDateGreaterThanOrEqualToColumn(Info.Column column) {
            addCriterion(new StringBuilder("checked_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedDateLessThan(LocalDate value) {
            addCriterion("checked_date <", value, "checkedDate");
            return (Criteria) this;
        }

        public Criteria andCheckedDateLessThanColumn(Info.Column column) {
            addCriterion(new StringBuilder("checked_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedDateLessThanOrEqualTo(LocalDate value) {
            addCriterion("checked_date <=", value, "checkedDate");
            return (Criteria) this;
        }

        public Criteria andCheckedDateLessThanOrEqualToColumn(Info.Column column) {
            addCriterion(new StringBuilder("checked_date <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedDateIn(List<LocalDate> values) {
            addCriterion("checked_date in", values, "checkedDate");
            return (Criteria) this;
        }

        public Criteria andCheckedDateNotIn(List<LocalDate> values) {
            addCriterion("checked_date not in", values, "checkedDate");
            return (Criteria) this;
        }

        public Criteria andCheckedDateBetween(LocalDate value1, LocalDate value2) {
            addCriterion("checked_date between", value1, value2, "checkedDate");
            return (Criteria) this;
        }

        public Criteria andCheckedDateNotBetween(LocalDate value1, LocalDate value2) {
            addCriterion("checked_date not between", value1, value2, "checkedDate");
            return (Criteria) this;
        }

        public Criteria andCheckedIsNull() {
            addCriterion("`checked` is null");
            return (Criteria) this;
        }

        public Criteria andCheckedIsNotNull() {
            addCriterion("`checked` is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedEqualTo(Byte value) {
            addCriterion("`checked` =", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedEqualToColumn(Info.Column column) {
            addCriterion(new StringBuilder("`checked` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedNotEqualTo(Byte value) {
            addCriterion("`checked` <>", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotEqualToColumn(Info.Column column) {
            addCriterion(new StringBuilder("`checked` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThan(Byte value) {
            addCriterion("`checked` >", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThanColumn(Info.Column column) {
            addCriterion(new StringBuilder("`checked` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThanOrEqualTo(Byte value) {
            addCriterion("`checked` >=", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThanOrEqualToColumn(Info.Column column) {
            addCriterion(new StringBuilder("`checked` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedLessThan(Byte value) {
            addCriterion("`checked` <", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedLessThanColumn(Info.Column column) {
            addCriterion(new StringBuilder("`checked` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedLessThanOrEqualTo(Byte value) {
            addCriterion("`checked` <=", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedLessThanOrEqualToColumn(Info.Column column) {
            addCriterion(new StringBuilder("`checked` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedIn(List<Byte> values) {
            addCriterion("`checked` in", values, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotIn(List<Byte> values) {
            addCriterion("`checked` not in", values, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedBetween(Byte value1, Byte value2) {
            addCriterion("`checked` between", value1, value2, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotBetween(Byte value1, Byte value2) {
            addCriterion("`checked` not between", value1, value2, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedTimeIsNull() {
            addCriterion("checked_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckedTimeIsNotNull() {
            addCriterion("checked_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedTimeEqualTo(LocalDateTime value) {
            addCriterion("checked_time =", value, "checkedTime");
            return (Criteria) this;
        }

        public Criteria andCheckedTimeEqualToColumn(Info.Column column) {
            addCriterion(new StringBuilder("checked_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedTimeNotEqualTo(LocalDateTime value) {
            addCriterion("checked_time <>", value, "checkedTime");
            return (Criteria) this;
        }

        public Criteria andCheckedTimeNotEqualToColumn(Info.Column column) {
            addCriterion(new StringBuilder("checked_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedTimeGreaterThan(LocalDateTime value) {
            addCriterion("checked_time >", value, "checkedTime");
            return (Criteria) this;
        }

        public Criteria andCheckedTimeGreaterThanColumn(Info.Column column) {
            addCriterion(new StringBuilder("checked_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("checked_time >=", value, "checkedTime");
            return (Criteria) this;
        }

        public Criteria andCheckedTimeGreaterThanOrEqualToColumn(Info.Column column) {
            addCriterion(new StringBuilder("checked_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedTimeLessThan(LocalDateTime value) {
            addCriterion("checked_time <", value, "checkedTime");
            return (Criteria) this;
        }

        public Criteria andCheckedTimeLessThanColumn(Info.Column column) {
            addCriterion(new StringBuilder("checked_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("checked_time <=", value, "checkedTime");
            return (Criteria) this;
        }

        public Criteria andCheckedTimeLessThanOrEqualToColumn(Info.Column column) {
            addCriterion(new StringBuilder("checked_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedTimeIn(List<LocalDateTime> values) {
            addCriterion("checked_time in", values, "checkedTime");
            return (Criteria) this;
        }

        public Criteria andCheckedTimeNotIn(List<LocalDateTime> values) {
            addCriterion("checked_time not in", values, "checkedTime");
            return (Criteria) this;
        }

        public Criteria andCheckedTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("checked_time between", value1, value2, "checkedTime");
            return (Criteria) this;
        }

        public Criteria andCheckedTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("checked_time not between", value1, value2, "checkedTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table info
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table info
         *
         * @mbg.generated
         */
        private InfoExample example;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table info
         *
         * @mbg.generated
         */
        protected Criteria(InfoExample example) {
            super();
            this.example = example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table info
         *
         * @mbg.generated
         */
        public InfoExample example() {
            return this.example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table info
         *
         * @mbg.generated
         */
        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table info
         *
         * @mbg.generated
         */
        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table info
         *
         * @mbg.generated
         */
        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        @Deprecated
        public interface ICriteriaAdd {
            /**
             * This method was generated by MyBatis Generator.
             * This method corresponds to the database table info
             *
             * @mbg.generated
             */
            Criteria add(Criteria add);
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table info
     *
     * @mbg.generated
     */
    public static class Criterion {
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

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
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

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    public interface ICriteriaWhen {
        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table info
         *
         * @mbg.generated
         */
        void criteria(Criteria criteria);
    }

    public interface IExampleWhen {
        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table info
         *
         * @mbg.generated
         */
        void example(com.javaniuniu.generator.domain.example.InfoExample example);
    }
}