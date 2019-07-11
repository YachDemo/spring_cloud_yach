package com.yach.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Yach on 2019/7/11
 *
 * @version v4.0
 */
public class BasePojo implements Serializable {
    private String id;
    private Date createTime;
    private Date updateTime;
    private Integer isDelete;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}
