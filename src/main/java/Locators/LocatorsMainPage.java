package Locators;
import org.openqa.selenium.By;

public class LocatorsMainPage {
    //локатор кнопки Да все привыкли в куках
    public By buttonCookie = By.xpath(".//button[text()='да все привыкли']");
    //локатор кнопки Заказать в заголовке
    public By orderButtonTop = By.className("Button_Button__ra12g");
    //локатор кнопки Заказать внизу страницы
    public By orderButtonBottom = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']");
    //локатор первого пункта, выпадающего списка Вопросы о важном
    public By questionOne = By.id("accordion__heading-0");
    //локатор второго пункта, выпадающего списка Вопросы о важном
    public By questionTwo = By.id("accordion__heading-1");
    //локатор третьего пункта, выпадающего списка Вопросы о важном
    public By questionThree = By.id("accordion__heading-2");
    //локатор четвертого пункта, выпадающего списка Вопросы о важном
    public By questionFour = By.id("accordion__heading-3");
    //локатор пятого пункта, выпадающего списка Вопросы о важном
    public By questionFive = By.id("accordion__heading-4");
    //локатор шестого пункта, выпадающего списка Вопросы о важном
    public By questionSix = By.id("accordion__heading-5");
    //локатор седьмого пункта, выпадающего списка Вопросы о важном
    public By questionSeven = By.id("accordion__heading-6");
    //локатор восьмого пункта, выпадающего списка Вопросы о важном
    public By questionEight = By.id("accordion__heading-7");
    // локатор первого ответа в выпадающем списке Вопросы о важном
    public By answerOne = By.xpath(".//div[@id='accordion__panel-0']/p");
    // локатор второго ответа в выпадающем списке Вопросы о важном
    public By answerTwo = By.xpath(".//div[@id='accordion__panel-1']/p");
    // локатор третьего ответа в выпадающем списке Вопросы о важном
    public By answerThree = By.xpath(".//div[@id='accordion__panel-2']/p");
    // локатор четветрого ответа в выпадающем списке Вопросы о важном
    public By answerFour = By.xpath(".//div[@id='accordion__panel-3']/p");
    // локатор пятого ответа в выпадающем списке Вопросы о важном
    public By answerFive = By.xpath(".//div[@id='accordion__panel-4']/p");
    // локатор шестого ответа в выпадающем списке Вопросы о важном
    public By answerSix = By.xpath(".//div[@id='accordion__panel-5']/p");
    // локатор седьмого ответа в выпадающем списке Вопросы о важном
    public By answerSeven = By.xpath(".//div[@id='accordion__panel-6']/p");
    // локатор восьмого ответа в выпадающем списке Вопросы о важном
    public By answerEight = By.xpath(".//div[@id='accordion__panel-7']/p");
}
