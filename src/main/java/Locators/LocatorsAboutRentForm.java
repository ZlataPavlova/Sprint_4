package Locators;
import org.openqa.selenium.By;

public class LocatorsAboutRentForm {
    //локатор поля Когда привезти самокат
    public By dateRentField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //локатор поля с выбором срока аренды
    public By periodRentField = By.xpath(".//div[text() = '* Срок аренды']");
    //локатор элемента в выпадающем списке срока аренды
    public By periodRentString = By.xpath(".//div[@class = 'Dropdown-menu']/div[7]");
    //локатор чекбокса "Черный жемчуг" в блоке цвет самоката
    public By colourBlackCheckbox = By.id("black");
    //локатор поля Комментарий для курьера
    public By commentForСourier = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //локатор для кнопки Заказать
    public By buttonOrder = By.xpath(".//div[@class='Order_Buttons__1xGrp']//button[text() = 'Заказать']");
    //локатор для кнопки Да в попапе Хотите оформить заказ
    public By buttonYes = By.xpath(".//button[text()='Да']");
    //локатор для финальной страницы заказа
    public By finalPage = By.xpath(".//div[text()='Заказ оформлен']");
}
