import PageObject.MainPage;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.junit.After;
import org.junit.Test;


public class AnswerAboutImportantTest {
    private WebDriver driver;
    private String expectedOne="Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private String expectedTwo="Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private String expectedThree="Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private String expectedFour="Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private String expectedFive="Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private String expectedSix="Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private String expectedSeven="Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private String expectedEight="Да, обязательно. Всем самокатов! И Москве, и Московской области.";


    // Создаём драйвер для браузера Chrome и открываем в нем главную страницу
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
    public void checkAnswerForQuestionOne() {

        //createChromeDriver();
        createSafariDriver();
        MainPage objMainPage = new MainPage (driver);
        objMainPage.waitForLoadMainPage();
        objMainPage.clickQuestionOne();

        String answerOne = objMainPage.getAnswerOne();

        assertEquals(expectedOne, answerOne);
}

    @Test
    public void checkAnswerForQuestionTwo() {
        createChromeDriver();

        MainPage objMainPage = new MainPage (driver);
        objMainPage.waitForLoadMainPage();
        objMainPage.clickQuestionTwo();

        String answerTwo = objMainPage.getAnswerTwo();

        assertEquals(expectedTwo, answerTwo);
    }


    @Test
    public void checkAnswerForQuestionThree() {
        createChromeDriver();

        MainPage objMainPage = new MainPage (driver);
        objMainPage.waitForLoadMainPage();
        objMainPage.clickQuestionThree();

        String answerThree = objMainPage.getAnswerThree();

        assertEquals(expectedThree, answerThree);
    }


    @Test
    public void checkAnswerForQuestionFour() {
        createChromeDriver();

        MainPage objMainPage = new MainPage (driver);
        objMainPage.waitForLoadMainPage();
        objMainPage.clickQuestionFour();

        String answerFour = objMainPage.getAnswerFour();

        assertEquals(expectedFour, answerFour);
    }


    @Test
    public void checkAnswerForQuestionFive() {
        createChromeDriver();

        MainPage objMainPage = new MainPage (driver);
        objMainPage.waitForLoadMainPage();
        objMainPage.clickQuestionFive();

        String answerFive = objMainPage.getAnswerFive();

        assertEquals( expectedFive, answerFive);
    }


    @Test
    public void checkAnswerForQuestionSix() {
        createChromeDriver();

        MainPage objMainPage = new MainPage (driver);
        objMainPage.waitForLoadMainPage();
        objMainPage.clickQuestionSix();

        String answerSix = objMainPage.getAnswerSix();

        assertEquals(expectedSix, answerSix);
    }


    @Test
    public void checkAnswerForQuestionSeven() {
        createChromeDriver();

        MainPage objMainPage = new MainPage (driver);
        objMainPage.waitForLoadMainPage();
        objMainPage.clickQuestionSeven();

        String answerSeven = objMainPage.getAnswerSeven();

        assertEquals(expectedSeven, answerSeven);
    }


    @Test
    public void checkAnswerForQuestionEight() {
        createChromeDriver();

        MainPage objMainPage = new MainPage (driver);
        objMainPage.waitForLoadMainPage();
        objMainPage.clickQuestionEight();

        String answerEight = objMainPage.getAnswerEight();

        assertEquals(expectedEight, answerEight);
    }
    @After
    public void teardown() {
        driver.quit();
    }
}
