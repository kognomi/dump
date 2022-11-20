package ru.prj.tst.addressbook.model;

import java.util.Objects;

public class GroupData {
  public final String id;
  public String name;
  public String header;
  public String footer;

  public GroupData(String id, String name, String header, String footer){
    this.id = id;
    this.name=name;
    this.header=header;
    this.footer=footer;
  }

  public GroupData( String name, String header, String footer){
    this.id = null;
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

  public String getId() {
    return id;
  }

  @Override
  public String toString() {
    return "GroupData{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    GroupData groupData = (GroupData) o;

    if (!Objects.equals(id, groupData.id)) return false;
    return Objects.equals(name, groupData.name);
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    return result;
  }
}
