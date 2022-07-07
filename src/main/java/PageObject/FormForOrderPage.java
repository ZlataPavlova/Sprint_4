package PageObject;

import Locators.LocatorsOrderForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormForOrderPage {
    private WebDriver driver;
    public FormForOrderPage(WebDriver driver){

        this.driver = driver;
    }

    LocatorsOrderForm LocatorsOrderForm = new LocatorsOrderForm();

    public void setUserName(String userName) {
        driver.findElement(LocatorsOrderForm.firstNameField).sendKeys(userName);
    }

    public void setLastUserName(String lastUserName) {
        driver.findElement(LocatorsOrderForm.lastNameField).sendKeys(lastUserName);
    }

    public void setAddress(String address) {
        driver.findElement(LocatorsOrderForm.addressField).sendKeys(address);
    }

    public void clickMetroStationField() {
        driver.findElement(LocatorsOrderForm.metroStationField).click();
    }

    public void chooseMetroStation(String station) {
        driver.findElement(By.xpath(String.format("//*[text()='%s']", station))).click();
    }

    public void setPhoneNumber(String phoneNumber) {
        driver.findElement(LocatorsOrderForm.phoneNumberField).sendKeys(phoneNumber);
    }

    public void clickNextButton() {
        driver.findElement(LocatorsOrderForm.nextButton).click();
    }
}
