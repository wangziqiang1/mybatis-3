package org.apache.ibatis.personalTest;

public class Tstat {
  private Integer id;
  private String name;
  private Integer statType;
  private Integer statValue;
  private String statDate;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getStatType() {
    return statType;
  }

  public void setStatType(Integer statType) {
    this.statType = statType;
  }

  public Integer getStatValue() {
    return statValue;
  }

  public void setStatValue(Integer statValue) {
    this.statValue = statValue;
  }

  public String getStatDate() {
    return statDate;
  }

  public void setStatDate(String statDate) {
    this.statDate = statDate;
  }

  @Override
  public String toString() {
    return "Tstat{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", statType=" + statType +
      ", statValue=" + statValue +
      ", statDate='" + statDate + '\'' +
      '}';
  }
}
