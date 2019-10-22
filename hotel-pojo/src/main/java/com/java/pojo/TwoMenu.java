package com.java.pojo;

import java.io.Serializable;

/**
 * @Desctiption 二级菜单
 * @Author 梦白
 * @Date 2019/10/22 11:17
 * @Version
 **/
public class TwoMenu implements Serializable {
    //序列号
    private static final long serialVersionUID = 5074096043029589629L;
    private Long twoId;
    private String twoName;
    private String url;
    private Long parent;

    public Long getTwoId() {
        return twoId;
    }

    public void setTwoId(Long twoId) {
        this.twoId = twoId;
    }

    public String getTwoName() {
        return twoName;
    }

    public void setTwoName(String twoName) {
        this.twoName = twoName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "TwoMenu{" +
                "twoId=" + twoId +
                ", twoName='" + twoName + '\'' +
                ", url='" + url + '\'' +
                ", parent=" + parent +
                '}';
    }
}
