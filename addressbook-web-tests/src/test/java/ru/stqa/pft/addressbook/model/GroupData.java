package ru.stqa.pft.addressbook.model;

public class GroupData {
  private final String id;  //нужен для уникальности в списке и не "схлопавания элементов"
  private final String name;
  private final String header;
  private final String footer;

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

    if (id != null ? !id.equals(groupData.id) : groupData.id != null) return false;
    return name != null ? name.equals(groupData.name) : groupData.name == null;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    return result;
  }

  public GroupData(String id, String name, String header, String footer) {
    this.id = id;
    this.name = name;
    this.header = header;
    this.footer = footer;
  }

  //второй конструктор для не заполненного ID
  public GroupData(String name, String header, String footer) {
    this.id = null;
    this.name = name;
    this.header = header;
    this.footer = footer;
  }


  public String getName() {
    return name;
  }

  public String getId() { return id; }

  public String getHeader() {
    return header;
  }

  public String getFooter() {
    return footer;
  }

}
