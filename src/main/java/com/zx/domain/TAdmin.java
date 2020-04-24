package com.zx.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

@TableName(value = "t_admin")
public class TAdmin implements Serializable {
    @TableId(value = "aid", type = IdType.AUTO)
    private Integer aid;

    @TableField(value = "aname")
    private String aname;

    @TableField(value = "apwd")
    private String apwd;

    @TableField(value = "aphone")
    private String aphone;

    @TableField(value = "starttime")
    private Date starttime;

    private static final long serialVersionUID = 1L;

    public static final String COL_AID = "aid";

    public static final String COL_ANAME = "aname";

    public static final String COL_APWD = "apwd";

    public static final String COL_APHONE = "aphone";

    public static final String COL_STARTTIME = "starttime";

    /**
     * @return aid
     */
    public Integer getAid() {
        return aid;
    }

    /**
     * @param aid
     */
    public void setAid(Integer aid) {
        this.aid = aid;
    }

    /**
     * @return aname
     */
    public String getAname() {
        return aname;
    }

    /**
     * @param aname
     */
    public void setAname(String aname) {
        this.aname = aname;
    }

    /**
     * @return apwd
     */
    public String getApwd() {
        return apwd;
    }

    /**
     * @param apwd
     */
    public void setApwd(String apwd) {
        this.apwd = apwd;
    }

    /**
     * @return aphone
     */
    public String getAphone() {
        return aphone;
    }

    /**
     * @param aphone
     */
    public void setAphone(String aphone) {
        this.aphone = aphone;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aid=").append(aid);
        sb.append(", aname=").append(aname);
        sb.append(", apwd=").append(apwd);
        sb.append(", aphone=").append(aphone);
        sb.append(", starttime=").append(starttime);
        sb.append("]");
        return sb.toString();
    }
}