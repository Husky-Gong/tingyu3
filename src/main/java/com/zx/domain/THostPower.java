package com.zx.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

@TableName(value = "t_host_power")
public class THostPower implements Serializable {
    @TableId(value = "hpid", type = IdType.AUTO)
    private Integer hpid;

    @TableField(value = "hpstar")
    private String hpstar;

    @TableField(value = "hpstart_begindate")
    private Date hpstartBegindate;

    @TableField(value = "hpstar_enddate")
    private Date hpstarEnddate;

    @TableField(value = "hp_order_power")
    private String hpOrderPower;

    @TableField(value = "hpstar_begintime")
    private Date hpstarBegintime;

    @TableField(value = "hpstar_endtime")
    private Date hpstarEndtime;

    @TableField(value = "hpdiscount")
    private Integer hpdiscount;

    @TableField(value = "hp_dis_starttime")
    private Date hpDisStarttime;

    @TableField(value = "hp_dis_endtime")
    private Date hpDisEndtime;

    @TableField(value = "hpprice")
    private Double hpprice;

    @TableField(value = "hpcosts")
    private Double hpcosts;

    @TableField(value = "hostid")
    private Integer hostid;

    private static final long serialVersionUID = 1L;

    public static final String COL_HPID = "hpid";

    public static final String COL_HPSTAR = "hpstar";

    public static final String COL_HPSTART_BEGINDATE = "hpstart_begindate";

    public static final String COL_HPSTAR_ENDDATE = "hpstar_enddate";

    public static final String COL_HP_ORDER_POWER = "hp_order_power";

    public static final String COL_HPSTAR_BEGINTIME = "hpstar_begintime";

    public static final String COL_HPSTAR_ENDTIME = "hpstar_endtime";

    public static final String COL_HPDISCOUNT = "hpdiscount";

    public static final String COL_HP_DIS_STARTTIME = "hp_dis_starttime";

    public static final String COL_HP_DIS_ENDTIME = "hp_dis_endtime";

    public static final String COL_HPPRICE = "hpprice";

    public static final String COL_HPCOSTS = "hpcosts";

    public static final String COL_HOSTID = "hostid";

    /**
     * @return hpid
     */
    public Integer getHpid() {
        return hpid;
    }

    /**
     * @param hpid
     */
    public void setHpid(Integer hpid) {
        this.hpid = hpid;
    }

    /**
     * @return hpstar
     */
    public String getHpstar() {
        return hpstar;
    }

    /**
     * @param hpstar
     */
    public void setHpstar(String hpstar) {
        this.hpstar = hpstar;
    }

    /**
     * @return hpstart_begindate
     */
    public Date getHpstartBegindate() {
        return hpstartBegindate;
    }

    /**
     * @param hpstartBegindate
     */
    public void setHpstartBegindate(Date hpstartBegindate) {
        this.hpstartBegindate = hpstartBegindate;
    }

    /**
     * @return hpstar_enddate
     */
    public Date getHpstarEnddate() {
        return hpstarEnddate;
    }

    /**
     * @param hpstarEnddate
     */
    public void setHpstarEnddate(Date hpstarEnddate) {
        this.hpstarEnddate = hpstarEnddate;
    }

    /**
     * @return hp_order_power
     */
    public String getHpOrderPower() {
        return hpOrderPower;
    }

    /**
     * @param hpOrderPower
     */
    public void setHpOrderPower(String hpOrderPower) {
        this.hpOrderPower = hpOrderPower;
    }

    /**
     * @return hpstar_begintime
     */
    public Date getHpstarBegintime() {
        return hpstarBegintime;
    }

    /**
     * @param hpstarBegintime
     */
    public void setHpstarBegintime(Date hpstarBegintime) {
        this.hpstarBegintime = hpstarBegintime;
    }

    /**
     * @return hpstar_endtime
     */
    public Date getHpstarEndtime() {
        return hpstarEndtime;
    }

    /**
     * @param hpstarEndtime
     */
    public void setHpstarEndtime(Date hpstarEndtime) {
        this.hpstarEndtime = hpstarEndtime;
    }

    /**
     * @return hpdiscount
     */
    public Integer getHpdiscount() {
        return hpdiscount;
    }

    /**
     * @param hpdiscount
     */
    public void setHpdiscount(Integer hpdiscount) {
        this.hpdiscount = hpdiscount;
    }

    /**
     * @return hp_dis_starttime
     */
    public Date getHpDisStarttime() {
        return hpDisStarttime;
    }

    /**
     * @param hpDisStarttime
     */
    public void setHpDisStarttime(Date hpDisStarttime) {
        this.hpDisStarttime = hpDisStarttime;
    }

    /**
     * @return hp_dis_endtime
     */
    public Date getHpDisEndtime() {
        return hpDisEndtime;
    }

    /**
     * @param hpDisEndtime
     */
    public void setHpDisEndtime(Date hpDisEndtime) {
        this.hpDisEndtime = hpDisEndtime;
    }

    /**
     * @return hpprice
     */
    public Double getHpprice() {
        return hpprice;
    }

    /**
     * @param hpprice
     */
    public void setHpprice(Double hpprice) {
        this.hpprice = hpprice;
    }

    /**
     * @return hpcosts
     */
    public Double getHpcosts() {
        return hpcosts;
    }

    /**
     * @param hpcosts
     */
    public void setHpcosts(Double hpcosts) {
        this.hpcosts = hpcosts;
    }

    /**
     * @return hostid
     */
    public Integer getHostid() {
        return hostid;
    }

    /**
     * @param hostid
     */
    public void setHostid(Integer hostid) {
        this.hostid = hostid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hpid=").append(hpid);
        sb.append(", hpstar=").append(hpstar);
        sb.append(", hpstartBegindate=").append(hpstartBegindate);
        sb.append(", hpstarEnddate=").append(hpstarEnddate);
        sb.append(", hpOrderPower=").append(hpOrderPower);
        sb.append(", hpstarBegintime=").append(hpstarBegintime);
        sb.append(", hpstarEndtime=").append(hpstarEndtime);
        sb.append(", hpdiscount=").append(hpdiscount);
        sb.append(", hpDisStarttime=").append(hpDisStarttime);
        sb.append(", hpDisEndtime=").append(hpDisEndtime);
        sb.append(", hpprice=").append(hpprice);
        sb.append(", hpcosts=").append(hpcosts);
        sb.append(", hostid=").append(hostid);
        sb.append("]");
        return sb.toString();
    }
}