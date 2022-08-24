package PageObject;
import Locators.LocatorsMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    LocatorsMainPage LocatorsMainPage = new LocatorsMainPage();

    public void waitForLoadMainPage(){
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("Home_HomePage__ZXKIX")));
    }

    public void clickElement(WebElement element){
        element.click();
    }

    public void scrollElement(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickOrderButtonTop() {
        driver.findElement(LocatorsMainPage.orderButtonTop).click();
    }

    public void clickOrderButtonBottom() {
        WebElement element = driver.findElement(LocatorsMainPage.orderButtonBottom);
        scrollElement(element);
        clickElement(element);
    }

    public void clickCloseCookie(){
        driver.findElement(LocatorsMainPage.buttonCookie).click();
    }

    public void clickQuestionOne() {
        WebElement element = driver.findElement(LocatorsMainPage.questionOne);
        scrollElement(element);
        clickElement(element);
    }

    public void clickQuestionTwo() {
        WebElement element = driver.findElement(LocatorsMainPage.questionTwo);
        scrollElement(element);
        clickElement(element);
    }

    public void clickQuestionThree() {
        WebElement element = driver.findElement(LocatorsMainPage.questionThree);
        scrollElement(element);
        clickElement(element);
    }

    public void clickQuestionFour() {
        WebElement element = driver.findElement(LocatorsMainPage.questionFour);
        scrollElement(element);
        clickElement(element);
    }

    public void clickQuestionFive() {
        WebElement element = driver.findElement(LocatorsMainPage.questionFive);
        scrollElement(element);
        clickElement(element);
    }

    public void clickQuestionSix() {
        WebElement element = driver.findElement(LocatorsMainPage.questionSix);
        scrollElement(element);
        clickElement(element);
    }

    public void clickQuestionSeven() {
        WebElement element = driver.findElement(LocatorsMainPage.questionSeven);
        scrollElement(element);
        clickElement(element);
    }

    public void clickQuestionEight() {

        WebElement element = driver.findElement(LocatorsMainPage.questionEight);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        clickElement(element);
    }

    //получить текст ответа
    public String getAnswerOne() {
       return driver.findElement(LocatorsMainPage.answerOne).getText();
    }

    public String getAnswerTwo() {
        return driver.findElement(LocatorsMainPage.answerTwo).getText();
    }

    public String getAnswerThree() {
        return driver.findElement(LocatorsMainPage.answerThree).getText();
    }

    public String getAnswerFour() {
        return driver.findElement(LocatorsMainPage.answerFour).getText();
    }

    public String getAnswerFive() {
        return driver.findElement(LocatorsMainPage.answerFive).getText();
    }

    public String getAnswerSix() {
        return driver.findElement(LocatorsMainPage.answerSix).getText();
    }

    public String getAnswerSeven() {
        return driver.findElement(LocatorsMainPage.answerSeven).getText();
    }

    public String getAnswerEight() {
        return driver.findElement(LocatorsMainPage.answerEight).getText();
    }
}
