import PageObject.MainPage;
import PageObject.FormForOrderPage;
import PageObject.FormAboutRentPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.safari.SafariDriver;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class OrderScooterTest {
    private WebDriver driver;
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String phoneNumber;
    private final String metroStation;
    private final String date;
    private final String comment;

    public OrderScooterTest(String firstName, String lastName, String address, String phoneNumber, String metroStation, String date, String comment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber =phoneNumber;
        this.metroStation =metroStation;
        this.date =date;
        this.comment=comment;
    }
    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][] {
                { "Злата", "Павлова", "г. Москва улица Николая Химушина д3к1", "+79806987898", "Щукинская", "9", "   "},
                { "Иванов", "Иван", "г. Москва улица Чернышевского д1", "89809876523", "Сокольники", "30", "привезите, пожалуйста, самый лучший самокат1@34"},
        };
    }

    public void createChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }
    public void createSafariDriver() {
        driver = new SafariDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void checkOrderScooterButtonTop() {
        createChromeDriver();
        //createSafariDriver();
        MainPage objMainPage = new MainPage (driver);
        objMainPage.waitForLoadMainPage();
        objMainPage.clickCloseCookie();
        objMainPage.clickOrderButtonTop();
        checkOrderScooter();
    }

    @Test
    public void checkOrderScooterButtonBottom() {
       createChromeDriver();
       //createSafariDriver();
        MainPage objMainPage = new MainPage (driver);
        objMainPage.waitForLoadMainPage();
        objMainPage.clickCloseCookie();
        objMainPage.clickOrderButtonBottom();
        checkOrderScooter();
    }
    @After
    public void teardown() {
        driver.quit();
    }
    public void checkOrderScooter() {
        //заполнение формы для кого самокат
        FormForOrderPage orderPage = new FormForOrderPage (driver);

        orderPage.setUserName(firstName);
        orderPage.setLastUserName(lastName);
        orderPage.setAddress(address);
        orderPage.clickMetroStationField();
        orderPage.chooseMetroStation(metroStation);
        orderPage.setPhoneNumber(phoneNumber);
        orderPage.clickNextButton();

        //заполнение формы об аренде
        FormAboutRentPage aboutRentPage = new FormAboutRentPage (driver);
        aboutRentPage.clickDateRentField();
        aboutRentPage.clickDateInCalendar(date);
        aboutRentPage.clickRentPeriodField();
        aboutRentPage.clickPeriodRentString();
        aboutRentPage.chooseColourBlackCheckbox();
        aboutRentPage.setCommentForСourier(comment);
        aboutRentPage.clickButtonOrder();
        aboutRentPage.clickButtonYes();
        aboutRentPage.waitForLoadFinalPage();
    }

    }
