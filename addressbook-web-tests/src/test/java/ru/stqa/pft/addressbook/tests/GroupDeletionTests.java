package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletionTests extends TestBase{


    @BeforeMethod
    public void ensurePreconditions() {
        app.goTo().groupPage();
        if (app.Group().List().size() == 0) {
            app.Group().create(new GroupData("test1", null, null));
        }
    }

    @Test
    public void testGroupDeletion() {
        app.goTo().groupPage();
        List<GroupData> before = app.Group().List();
        int index = before.size() - 1;
        app.Group().delete(index);
        List<GroupData> after = app.Group().List();
        Assert.assertEquals(after.size(), before.size() - 1);

        before.remove(index);
       Assert.assertEquals(before,after);
        }



}
