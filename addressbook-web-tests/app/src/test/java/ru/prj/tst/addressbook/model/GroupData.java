package ru.prj.tst.addressbook.model;

import java.util.Objects;

public class GroupData {
  public String name;
  public String header;
  public String footer;

  public GroupData(String name,String header,String footer){
    this.name=name;
    this.header=header;
    this.footer=footer;
  }

  public String getName() {
    return name;
  }

  public String getHeader() {
    return header;
  }

  public String getFooter() {
    return footer;
  }

  @Override
  public String toString() {
    return "GroupData{" +
            "name='" + name + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) { //работало и без этого, но т.к. сравниваем только часть списка, то лучше генерить
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    GroupData groupData = (GroupData) o;

    return Objects.equals(name, groupData.name);
  }

  @Override
  public int hashCode() {
    return name != null ? name.hashCode() : 0;
  }
}
