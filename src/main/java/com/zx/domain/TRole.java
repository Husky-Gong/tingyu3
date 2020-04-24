package com.zx.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

@TableName(value = "t_role")
public class TRole implements Serializable {
    @TableId(value = "rid", type = IdType.AUTO)
    private Integer rid;

    @TableField(value = "rname")
    private String rname;

    @TableField(value = "rdesc")
    private String rdesc;

    private static final long serialVersionUID = 1L;

    public static final String COL_RID = "rid";

    public static final String COL_RNAME = "rname";

    public static final String COL_RDESC = "rdesc";

    /**
     * @return rid
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * @param rid
     */
    public void setRid(Integer rid) {
        this.rid = rid;
    }

    /**
     * @return rname
     */
    public String getRname() {
        return rname;
    }

    /**
     * @param rname
     */
    public void setRname(String rname) {
        this.rname = rname;
    }

    /**
     * @return rdesc
     */
    public String getRdesc() {
        return rdesc;
    }

    /**
     * @param rdesc
     */
    public void setRdesc(String rdesc) {
        this.rdesc = rdesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rid=").append(rid);
        sb.append(", rname=").append(rname);
        sb.append(", rdesc=").append(rdesc);
        sb.append("]");
        return sb.toString();
    }
}