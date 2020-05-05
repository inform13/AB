package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

  @Test
  public void testContsctModification (){
    app.gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Ekaterina2", "Karikova2", "karikova_e2@mail.ru"));
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToContactPage();

  }
}
