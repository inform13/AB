package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SessionHelper extends HelperBase {

  public SessionHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void login(String username, String password) {
    type (By.name("user"), username);
    type (By.name("user"), password);

    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(username);
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    new Actions(wd).doubleClick(wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]"))).build().perform();
  }
}
