package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String NAME = "firstname";
    public static final String SURNAME = "lastname";
    public static final String EMAIL = "reg_email__";
    public static final String PASSWORD = "reg_passwd__";
    public static final String XPATH_WAIT_FOR = "//select[1]";
    public static final String XPATH_BITHDAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_BITHMONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_BITHYEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";
    public static final String SEX = "u_0_8";
    //public static final String CREATEACCOUNT = "u_0_13";


    public static void main(String[] args){
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement nameField = driver.findElement(By.name(NAME));
        nameField.sendKeys("test");

        WebElement surnameField = driver.findElement(By.name(SURNAME));
        surnameField.sendKeys("test");

        WebElement emailField = driver.findElement(By.name(EMAIL));
        emailField.sendKeys("test");

        WebElement passField = driver.findElement(By.name(PASSWORD));
        passField.sendKeys("test");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement selectCombo1 = driver.findElement(By.xpath(XPATH_BITHDAY));
        Select selectBirthday = new Select(selectCombo1);
        selectBirthday.selectByIndex(6);

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_BITHMONTH));
        Select selectBirthmonth = new Select(selectCombo2);
        selectBirthmonth.selectByIndex(6);

        WebElement selectCombo3 = driver.findElement(By.xpath(XPATH_BITHYEAR));
        Select selectBirthyear = new Select(selectCombo3);
        selectBirthyear.selectByIndex(6);

        driver.findElement(By.id(SEX)).click();

        //driver.findElement(By.id(CREATEACCOUNT)).click();

    }

}
