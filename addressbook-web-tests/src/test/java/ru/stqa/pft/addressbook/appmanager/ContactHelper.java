package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper {
  WebDriver wd;

  public ContactHelper(WebDriver wd) {
    this.wd = wd;
  }

  public void returnToContactPage() {
      wd.findElement(By.linkText("home page")).click();
  }

  public void submitContactCreation() {
      wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getFirst_name());
    type(By.name("lastname"), contactData.getSecond_name());
    type(By.name("email"), contactData.getEmail());

  }

  private void type(By locator, String text) {
    wd.findElement(locator).click();
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }

  public void initContactCreation() {
      wd.findElement(By.linkText("add new")).click();
  }

  public void selectContact() {
    if (!wd.findElement(By.id("22")).isSelected()) {
      wd.findElement(By.id("22")).click();
    }
  }

  public void initContactModification() {
    wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img")).click();
  }


  public void submitContactModification() {
    wd.findElement(By.name("update")).click();
    }



}
