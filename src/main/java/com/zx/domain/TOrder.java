package com.zx.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

@TableName(value = "t_order")
public class TOrder implements Serializable {
    @TableId(value = "oid", type = IdType.AUTO)
    private Integer oid;

    @TableField(value = "pid")
    private Integer pid;

    @TableField(value = "cid")
    private Integer cid;

    @TableField(value = "hid")
    private Integer hid;

    @TableField(value = "hotelname")
    private String hotelname;

    @TableField(value = "hoteladdress")
    private String hoteladdress;

    @TableField(value = "ordertime")
    private Date ordertime;

    @TableField(value = "wedding_time")
    private Date weddingTime;

    @TableField(value = "wedding_split")
    private String weddingSplit;

    @TableField(value = "deposit")
    private Double deposit;

    @TableField(value = "money")
    private Double money;

    @TableField(value = "status")
    private String status;

    @TableField(value = "comment")
    private String comment;

    private static final long serialVersionUID = 1L;

    public static final String COL_OID = "oid";

    public static final String COL_PID = "pid";

    public static final String COL_CID = "cid";

    public static final String COL_HID = "hid";

    public static final String COL_HOTELNAME = "hotelname";

    public static final String COL_HOTELADDRESS = "hoteladdress";

    public static final String COL_ORDERTIME = "ordertime";

    public static final String COL_WEDDING_TIME = "wedding_time";

    public static final String COL_WEDDING_SPLIT = "wedding_split";

    public static final String COL_DEPOSIT = "deposit";

    public static final String COL_MONEY = "money";

    public static final String COL_STATUS = "status";

    public static final String COL_COMMENT = "comment";

    /**
     * @return oid
     */
    public Integer getOid() {
        return oid;
    }

    /**
     * @param oid
     */
    public void setOid(Integer oid) {
        this.oid = oid;
    }

    /**
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * @return cid
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * @param cid
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * @return hid
     */
    public Integer getHid() {
        return hid;
    }

    /**
     * @param hid
     */
    public void setHid(Integer hid) {
        this.hid = hid;
    }

    /**
     * @return hotelname
     */
    public String getHotelname() {
        return hotelname;
    }

    /**
     * @param hotelname
     */
    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    /**
     * @return hoteladdress
     */
    public String getHoteladdress() {
        return hoteladdress;
    }

    /**
     * @param hoteladdress
     */
    public void setHoteladdress(String hoteladdress) {
        this.hoteladdress = hoteladdress;
    }

    /**
     * @return ordertime
     */
    public Date getOrdertime() {
        return ordertime;
    }

    /**
     * @param ordertime
     */
    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    /**
     * @return wedding_time
     */
    public Date getWeddingTime() {
        return weddingTime;
    }

    /**
     * @param weddingTime
     */
    public void setWeddingTime(Date weddingTime) {
        this.weddingTime = weddingTime;
    }

    /**
     * @return wedding_split
     */
    public String getWeddingSplit() {
        return weddingSplit;
    }

    /**
     * @param weddingSplit
     */
    public void setWeddingSplit(String weddingSplit) {
        this.weddingSplit = weddingSplit;
    }

    /**
     * @return deposit
     */
    public Double getDeposit() {
        return deposit;
    }

    /**
     * @param deposit
     */
    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    /**
     * @return money
     */
    public Double getMoney() {
        return money;
    }

    /**
     * @param money
     */
    public void setMoney(Double money) {
        this.money = money;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", pid=").append(pid);
        sb.append(", cid=").append(cid);
        sb.append(", hid=").append(hid);
        sb.append(", hotelname=").append(hotelname);
        sb.append(", hoteladdress=").append(hoteladdress);
        sb.append(", ordertime=").append(ordertime);
        sb.append(", weddingTime=").append(weddingTime);
        sb.append(", weddingSplit=").append(weddingSplit);
        sb.append(", deposit=").append(deposit);
        sb.append(", money=").append(money);
        sb.append(", status=").append(status);
        sb.append(", comment=").append(comment);
        sb.append("]");
        return sb.toString();
    }
}