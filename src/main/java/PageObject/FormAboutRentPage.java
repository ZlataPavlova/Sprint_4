package PageObject;

import Locators.LocatorsAboutRentForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FormAboutRentPage {

    private WebDriver driver;
    public FormAboutRentPage(WebDriver driver){
        this.driver = driver;
    }

    LocatorsAboutRentForm locatorsAboutRentForm = new LocatorsAboutRentForm();

    public void clickDateRentField() {
        driver.findElement(locatorsAboutRentForm.dateRentField).click();
    }

    public void clickDateInCalendar(String date) {
        driver.findElement(By.xpath(String.format("//*[text()='%s']", date))).click();
    }

    public void clickRentPeriodField() {
        driver.findElement(locatorsAboutRentForm.periodRentField).click();
    }

    public void clickPeriodRentString() {
        driver.findElement(locatorsAboutRentForm.periodRentString).click();
    }

    public void chooseColourBlackCheckbox() {
        driver.findElement(locatorsAboutRentForm.colourBlackCheckbox).click();
    }

    public void setCommentForСourier(String comment) {
        driver.findElement(locatorsAboutRentForm.commentForСourier).sendKeys(comment);
    }

    public void clickButtonOrder() {
        driver.findElement(locatorsAboutRentForm.buttonOrder).click();
    }

    public void clickButtonYes() {
        driver.findElement(locatorsAboutRentForm.buttonYes).click();
    }

    public void waitForLoadFinalPage(){
        driver.findElement(locatorsAboutRentForm.finalPage);
    }

}
