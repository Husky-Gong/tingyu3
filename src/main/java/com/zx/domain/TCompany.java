package com.zx.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

@TableName(value = "t_company")
public class TCompany implements Serializable {
    @TableId(value = "cid", type = IdType.AUTO)
    private Integer cid;

    @TableField(value = "cpwd")
    private String cpwd;

    @TableField(value = "cname")
    private String cname;

    @TableField(value = "cphone")
    private String cphone;

    @TableField(value = "ceo")
    private String ceo;

    @TableField(value = "cmail")
    private String cmail;

    @TableField(value = "starttime")
    private Date starttime;

    @TableField(value = "status")
    private String status;

    @TableField(value = "ordernumber")
    private Integer ordernumber;

    private static final long serialVersionUID = 1L;

    public static final String COL_CID = "cid";

    public static final String COL_CPWD = "cpwd";

    public static final String COL_CNAME = "cname";

    public static final String COL_CPHONE = "cphone";

    public static final String COL_CEO = "ceo";

    public static final String COL_CMAIL = "cmail";

    public static final String COL_STARTTIME = "starttime";

    public static final String COL_STATUS = "status";

    public static final String COL_ORDERNUMBER = "ordernumber";

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
     * @return cpwd
     */
    public String getCpwd() {
        return cpwd;
    }

    /**
     * @param cpwd
     */
    public void setCpwd(String cpwd) {
        this.cpwd = cpwd;
    }

    /**
     * @return cname
     */
    public String getCname() {
        return cname;
    }

    /**
     * @param cname
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * @return cphone
     */
    public String getCphone() {
        return cphone;
    }

    /**
     * @param cphone
     */
    public void setCphone(String cphone) {
        this.cphone = cphone;
    }

    /**
     * @return ceo
     */
    public String getCeo() {
        return ceo;
    }

    /**
     * @param ceo
     */
    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    /**
     * @return cmail
     */
    public String getCmail() {
        return cmail;
    }

    /**
     * @param cmail
     */
    public void setCmail(String cmail) {
        this.cmail = cmail;
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
        sb.append(", cid=").append(cid);
        sb.append(", cpwd=").append(cpwd);
        sb.append(", cname=").append(cname);
        sb.append(", cphone=").append(cphone);
        sb.append(", ceo=").append(ceo);
        sb.append(", cmail=").append(cmail);
        sb.append(", starttime=").append(starttime);
        sb.append(", status=").append(status);
        sb.append(", ordernumber=").append(ordernumber);
        sb.append("]");
        return sb.toString();
    }
}