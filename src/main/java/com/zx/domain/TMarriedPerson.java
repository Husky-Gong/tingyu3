package com.zx.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

@TableName(value = "t_married_person")
public class TMarriedPerson implements Serializable {
    @TableId(value = "pid", type = IdType.AUTO)
    private Integer pid;

    @TableField(value = "ppwd")
    private String ppwd;

    @TableField(value = "pname")
    private String pname;

    @TableField(value = "phone")
    private String phone;

    @TableField(value = "pmail")
    private String pmail;

    @TableField(value = "marrydate")
    private Date marrydate;

    @TableField(value = "regdate")
    private Date regdate;

    @TableField(value = "status")
    private String status;

    private static final long serialVersionUID = 1L;

    public static final String COL_PID = "pid";

    public static final String COL_PPWD = "ppwd";

    public static final String COL_PNAME = "pname";

    public static final String COL_PHONE = "phone";

    public static final String COL_PMAIL = "pmail";

    public static final String COL_MARRYDATE = "marrydate";

    public static final String COL_REGDATE = "regdate";

    public static final String COL_STATUS = "status";

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
     * @return ppwd
     */
    public String getPpwd() {
        return ppwd;
    }

    /**
     * @param ppwd
     */
    public void setPpwd(String ppwd) {
        this.ppwd = ppwd;
    }

    /**
     * @return pname
     */
    public String getPname() {
        return pname;
    }

    /**
     * @param pname
     */
    public void setPname(String pname) {
        this.pname = pname;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return pmail
     */
    public String getPmail() {
        return pmail;
    }

    /**
     * @param pmail
     */
    public void setPmail(String pmail) {
        this.pmail = pmail;
    }

    /**
     * @return marrydate
     */
    public Date getMarrydate() {
        return marrydate;
    }

    /**
     * @param marrydate
     */
    public void setMarrydate(Date marrydate) {
        this.marrydate = marrydate;
    }

    /**
     * @return regdate
     */
    public Date getRegdate() {
        return regdate;
    }

    /**
     * @param regdate
     */
    public void setRegdate(Date regdate) {
        this.regdate = regdate;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", ppwd=").append(ppwd);
        sb.append(", pname=").append(pname);
        sb.append(", phone=").append(phone);
        sb.append(", pmail=").append(pmail);
        sb.append(", marrydate=").append(marrydate);
        sb.append(", regdate=").append(regdate);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}