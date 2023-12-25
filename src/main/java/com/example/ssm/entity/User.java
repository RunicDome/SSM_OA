package com.example.ssm.entity;


public class User {

  private long id;
  private String loginname;
  private String password;
  private String truename;
  private String idcard;
  private long age;
  private String phone;
  private long sex;
  private String job;
  private String photo;
  private long roleid;
  private long orgid;
  private long deptid;
  private long state;
  private long isdelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getLoginname() {
    return loginname;
  }

  public void setLoginname(String loginname) {
    this.loginname = loginname;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getTruename() {
    return truename;
  }

  public void setTruename(String truename) {
    this.truename = truename;
  }


  public String getIdcard() {
    return idcard;
  }

  public void setIdcard(String idcard) {
    this.idcard = idcard;
  }


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public long getSex() {
    return sex;
  }

  public void setSex(long sex) {
    this.sex = sex;
  }


  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }


  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }


  public long getRoleid() {
    return roleid;
  }

  public void setRoleid(long roleid) {
    this.roleid = roleid;
  }


  public long getOrgid() {
    return orgid;
  }

  public void setOrgid(long orgid) {
    this.orgid = orgid;
  }


  public long getDeptid() {
    return deptid;
  }

  public void setDeptid(long deptid) {
    this.deptid = deptid;
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
