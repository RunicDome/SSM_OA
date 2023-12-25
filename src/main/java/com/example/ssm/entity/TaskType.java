package com.example.ssm.entity;


public class TaskType {

  private long id;
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private long state;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }



  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }

}
