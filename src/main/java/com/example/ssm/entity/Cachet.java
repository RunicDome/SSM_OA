package com.example.ssm.entity;


public class Cachet {

  private long id;
  private long userid;
  private long deptid;
  private long adminid;
  private long typeid;
  private java.sql.Timestamp usetime;
  private java.sql.Timestamp lauchtime;
  private String remark;

  @Override
  public String toString() {
    return "Cachet{" +
            "id=" + id +
            ", userid=" + userid +
            ", deptid=" + deptid +
            ", adminid=" + adminid +
            ", typeid=" + typeid +
            ", usetime=" + usetime +
            ", lauchtime=" + lauchtime +
            ", remark='" + remark + '\'' +
            ", state=" + state +
            ", isdelete=" + isdelete +
            ", cachetType=" + cachetType +
            '}';
  }

  private long state;
  private long isdelete;
  private CachetType cachetType;
  private User user;
  private User admin;

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public User getAdmin() {
    return admin;
  }

  public void setAdmin(User admin) {
    this.admin = admin;
  }

  public Dept getDept() {
    return dept;
  }

  public void setDept(Dept dept) {
    this.dept = dept;
  }

  private Dept dept;


  public CachetType getCachetType() {
    return cachetType;
  }

  public void setCachetType(CachetType cachetType) {
    this.cachetType = cachetType;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public long getDeptid() {
    return deptid;
  }

  public void setDeptid(long deptid) {
    this.deptid = deptid;
  }


  public long getAdminid() {
    return adminid;
  }

  public void setAdminid(long adminid) {
    this.adminid = adminid;
  }


  public long getTypeid() {
    return typeid;
  }

  public void setTypeid(long typeid) {
    this.typeid = typeid;
  }


  public java.sql.Timestamp getUsetime() {
    return usetime;
  }

  public void setUsetime(java.sql.Timestamp usetime) {
    this.usetime = usetime;
  }


  public java.sql.Timestamp getLauchtime() {
    return lauchtime;
  }

  public void setLauchtime(java.sql.Timestamp lauchtime) {
    this.lauchtime = lauchtime;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
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
