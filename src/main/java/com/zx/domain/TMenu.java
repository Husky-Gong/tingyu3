package com.zx.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

@TableName(value = "t_menu")
public class TMenu implements Serializable {
    @TableId(value = "mid", type = IdType.AUTO)
    private Integer mid;

    @TableField(value = "mname")
    private String mname;

    @TableField(value = "pid")
    private Integer pid;

    @TableField(value = "isparent")
    private String isparent;

    @TableField(value = "status")
    private String status;

    @TableField(value = "url")
    private String url;

    @TableField(value = "mdesc")
    private String mdesc;

    private static final long serialVersionUID = 1L;

    public static final String COL_MID = "mid";

    public static final String COL_MNAME = "mname";

    public static final String COL_PID = "pid";

    public static final String COL_ISPARENT = "isparent";

    public static final String COL_STATUS = "status";

    public static final String COL_URL = "url";

    public static final String COL_MDESC = "mdesc";

    /**
     * @return mid
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * @param mid
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    /**
     * @return mname
     */
    public String getMname() {
        return mname;
    }

    /**
     * @param mname
     */
    public void setMname(String mname) {
        this.mname = mname;
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
     * @return isparent
     */
    public String getIsparent() {
        return isparent;
    }

    /**
     * @param isparent
     */
    public void setIsparent(String isparent) {
        this.isparent = isparent;
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
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return mdesc
     */
    public String getMdesc() {
        return mdesc;
    }

    /**
     * @param mdesc
     */
    public void setMdesc(String mdesc) {
        this.mdesc = mdesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mid=").append(mid);
        sb.append(", mname=").append(mname);
        sb.append(", pid=").append(pid);
        sb.append(", isparent=").append(isparent);
        sb.append(", status=").append(status);
        sb.append(", url=").append(url);
        sb.append(", mdesc=").append(mdesc);
        sb.append("]");
        return sb.toString();
    }
}