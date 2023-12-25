package com.example.ssm.entity;


public class Dept {

  private long id;
  private String name;
  private long state;
  private long orgid;
  private long isdelete;


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


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }


  public long getOrgid() {
    return orgid;
  }

  public void setOrgid(long orgid) {
    this.orgid = orgid;
  }


  public long getIsdelete() {
    return isdelete;
  }

  public void setIsdelete(long isdelete) {
    this.isdelete = isdelete;
  }

}
