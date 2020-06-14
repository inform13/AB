package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactCreationTests extends TestBase{

    @Test (enabled = false)
    public void testContactCreation() {
        app.getNavigationHelper().gotoHomePage();
        int before = app.getContactHelper().getContactCount();
        //List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().createContact(new ContactData("Ekaterina", "Karikova", "karikova_e@mail.ru", "test1"), true );
        int after = app.getContactHelper().getContactCount();
        //List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after, before + 1);
        //Assert.assertEquals(after.size(), before.size() + 1);

    }

}
