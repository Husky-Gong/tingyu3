package com.zx.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

@TableName(value = "t_host")
public class THost implements Serializable {
    @TableId(value = "hid", type = IdType.AUTO)
    private Integer hid;

    @TableField(value = "hname")
    private String hname;

    @TableField(value = "hpwd")
    private String hpwd;

    @TableField(value = "hphone")
    private String hphone;

    @TableField(value = "starttime")
    private Date starttime;

    @TableField(value = "status")
    private String status;

    @TableField(value = "strong")
    private String strong;

    @TableField(value = "ordernumber")
    private Integer ordernumber;

    private static final long serialVersionUID = 1L;

    public static final String COL_HID = "hid";

    public static final String COL_HNAME = "hname";

    public static final String COL_HPWD = "hpwd";

    public static final String COL_HPHONE = "hphone";

    public static final String COL_STARTTIME = "starttime";

    public static final String COL_STATUS = "status";

    public static final String COL_STRONG = "strong";

    public static final String COL_ORDERNUMBER = "ordernumber";

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
     * @return hname
     */
    public String getHname() {
        return hname;
    }

    /**
     * @param hname
     */
    public void setHname(String hname) {
        this.hname = hname;
    }

    /**
     * @return hpwd
     */
    public String getHpwd() {
        return hpwd;
    }

    /**
     * @param hpwd
     */
    public void setHpwd(String hpwd) {
        this.hpwd = hpwd;
    }

    /**
     * @return hphone
     */
    public String getHphone() {
        return hphone;
    }

    /**
     * @param hphone
     */
    public void setHphone(String hphone) {
        this.hphone = hphone;
    }

    /**
     * @return starttime
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * @param starttime
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
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
     * @return strong
     */
    public String getStrong() {
        return strong;
    }

    /**
     * @param strong
     */
    public void setStrong(String strong) {
        this.strong = strong;
    }

    /**
     * @return ordernumber
     */
    public Integer getOrdernumber() {
        return ordernumber;
    }

    /**
     * @param ordernumber
     */
    public void setOrdernumber(Integer ordernumber) {
        this.ordernumber = ordernumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hid=").append(hid);
        sb.append(", hname=").append(hname);
        sb.append(", hpwd=").append(hpwd);
        sb.append(", hphone=").append(hphone);
        sb.append(", starttime=").append(starttime);
        sb.append(", status=").append(status);
        sb.append(", strong=").append(strong);
        sb.append(", ordernumber=").append(ordernumber);
        sb.append("]");
        return sb.toString();
    }
}