package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation() {
        gotoHomePage();
        initContactCreation();
        fillContactForm(new ContactData("Ekaterina", "Karikova", "karikova_e@mail.ru"));
        submitContactCreation();
        returnToContactPage();
    }

}
