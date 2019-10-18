package com.ctrip.delos.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "blog")
public class Blog {

    @Id
    @Column(name = "BlogID", unique = true)
    @GeneratedValue
    private Long blogID;

    @Column(name = "UserName")
    private String userName;

    @Column(name = "BlogContent")
    private String blogContent;

    @Column(name = "BlogDate")
    private Timestamp blogDate;

    @Column(name = "DataChange_CreateTime")
    private Timestamp dataChangeCreateTime;

    @Column(name = "DataChange_LastTime")
    private Timestamp dataChangeLastTime;

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    public Long getBlogID() {
        return blogID;
    }

    public void setBlogID(Long blogID) {
        this.blogID = blogID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Timestamp getBlogDate() {
        return blogDate;
    }

    public void setBlogDate(Timestamp blogDate) {
        this.blogDate = blogDate;
    }

    public Timestamp getDataChangeCreateTime() {
        return dataChangeCreateTime;
    }

    public void setDataChangeCreateTime(Timestamp dataChangeCreateTime) {
        this.dataChangeCreateTime = dataChangeCreateTime;
    }

    public Timestamp getDataChangeLastTime() {
        return dataChangeLastTime;
    }

    public void setDataChangeLastTime(Timestamp dataChangeLastTime) {
        this.dataChangeLastTime = dataChangeLastTime;
    }

    @Override
    public String toString() {
        return "Blog{" +
            "blogID=" + blogID +
            ", userName='" + userName + '\'' +
            ", blogContent='" + blogContent + '\'' +
            ", blogDate=" + blogDate +
            ", dataChangeCreateTime=" + dataChangeCreateTime +
            ", dataChangeLastTime=" + dataChangeLastTime +
            '}';
    }
}
