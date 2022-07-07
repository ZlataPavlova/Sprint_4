package Locators;
import org.openqa.selenium.By;

public class LocatorsOrderForm {
    //локатор поля Имя
    public By firstNameField = By.xpath(".//input[@placeholder='* Имя']");
    //локатор поля Фамилия
    public By lastNameField = By.xpath(".//input[@placeholder='* Фамилия']");
    //локатор поля Адрес
    public By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //локатор поля Станция метро
    public By metroStationField = By.xpath(".//input[@placeholder='* Станция метро']");
    //локатор поля номер телефона
    public By phoneNumberField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //локатор кнопки Далее
    public By nextButton = By.xpath(".//button[text()='Далее']");
}
