package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String first_name;
  private final String second_name;
  private final String email;

  public ContactData(String first_name, String second_name, String email) {
    this.first_name = first_name;
    this.second_name = second_name;
    this.email = email;
  }

  public String getFirst_name() {
    return first_name;
  }

  public String getSecond_name() {
    return second_name;
  }

  public String getEmail() {
    return email;
  }
}
