package com.example.ssm.entity;


public class Task {

  private long id;
  private String name;
  private long typeid;
  private long taskid;
  private long userid;
  private long adminid;
  private java.sql.Timestamp lauchtime;
  private java.sql.Timestamp subtime;
  private long state;
  private long isdelete;
  private TaskType taskType;
  private User user;
  private Role role;

  public TaskType getTaskType() {
    return taskType;
  }

  public void setTaskType(TaskType taskType) {
    this.taskType = taskType;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getTypeid() {
    return typeid;
  }

  public void setTypeid(long typeid) {
    this.typeid = typeid;
  }


  public long getTaskid() {
    return taskid;
  }

  public void setTaskid(long taskid) {
    this.taskid = taskid;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public long getAdminid() {
    return adminid;
  }

  public void setAdminid(long adminid) {
    this.adminid = adminid;
  }


  public java.sql.Timestamp getLauchtime() {
    return lauchtime;
  }

  public void setLauchtime(java.sql.Timestamp lauchtime) {
    this.lauchtime = lauchtime;
  }


  public java.sql.Timestamp getSubtime() {
    return subtime;
  }

  public void setSubtime(java.sql.Timestamp subtime) {
    this.subtime = subtime;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }


  public long getIsdelete() {
    return isdelete;
  }

  public void setIsdelete(long isdelete) {
    this.isdelete = isdelete;
  }

}
