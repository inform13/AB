package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

  @Test
  public void testContsctModification (){
    app.getNavigationHelper().gotoHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Ekaterina", "Karikova", "karikova_e@mail.ru", "test1"), true );
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Ekaterina2", "Karikova2", "karikova_e2@mail.ru", null), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToContactPage();

  }
}
