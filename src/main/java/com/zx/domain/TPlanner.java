package com.zx.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

@TableName(value = "t_planner")
public class TPlanner implements Serializable {
    @TableId(value = "nid", type = IdType.AUTO)
    private Integer nid;

    @TableField(value = "nname")
    private String nname;

    @TableField(value = "nphone")
    private String nphone;

    @TableField(value = "addtime")
    private Date addtime;

    @TableField(value = "status")
    private String status;

    @TableField(value = "cid")
    private Integer cid;

    @TableField(value = "ordernumber")
    private Integer ordernumber;

    private static final long serialVersionUID = 1L;

    public static final String COL_NID = "nid";

    public static final String COL_NNAME = "nname";

    public static final String COL_NPHONE = "nphone";

    public static final String COL_ADDTIME = "addtime";

    public static final String COL_STATUS = "status";

    public static final String COL_CID = "cid";

    public static final String COL_ORDERNUMBER = "ordernumber";

    /**
     * @return nid
     */
    public Integer getNid() {
        return nid;
    }

    /**
     * @param nid
     */
    public void setNid(Integer nid) {
        this.nid = nid;
    }

    /**
     * @return nname
     */
    public String getNname() {
        return nname;
    }

    /**
     * @param nname
     */
    public void setNname(String nname) {
        this.nname = nname;
    }

    /**
     * @return nphone
     */
    public String getNphone() {
        return nphone;
    }

    /**
     * @param nphone
     */
    public void setNphone(String nphone) {
        this.nphone = nphone;
    }

    /**
     * @return addtime
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * @param addtime
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
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
        sb.append(", nid=").append(nid);
        sb.append(", nname=").append(nname);
        sb.append(", nphone=").append(nphone);
        sb.append(", addtime=").append(addtime);
        sb.append(", status=").append(status);
        sb.append(", cid=").append(cid);
        sb.append(", ordernumber=").append(ordernumber);
        sb.append("]");
        return sb.toString();
    }
}