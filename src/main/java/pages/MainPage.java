package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MainPage {
    // переменная драйвера
    private final WebDriver driver;
    // Поле ввода имени
    private final By fieldName = By.cssSelector(".Input_Responsible__1jDKN[placeholder='* Имя']");
    // Поле ввода фамилии
    private final By fieldSurname = By.cssSelector(".Input_Responsible__1jDKN[placeholder='* Фамилия']");
    // Поле ввода адреса
    private final By fieldAddress = By.cssSelector(".Input_Responsible__1jDKN[placeholder='* Адрес: куда привезти заказ']");
    // Поле выбора станции метро
    private final By fieldChooseMetro = By.className("select-search__input");
    // Поле ввода номера телефона
    private final By fieldPhone = By.cssSelector(".Input_Responsible__1jDKN[placeholder='* Телефон: на него позвонит курьер']");
    // Кнопка далее
    private final By buttonNext = By.className("Button_Middle__1CSJM");
    // Поле выбора даты доставки самоката
    private final  By fieldChooseDate = By.cssSelector(".Input_Responsible__1jDKN[placeholder='* Когда привезти самокат']");
    // Поле выбора даты доставки самоката
    private final By ChooseTimeRent = By.className("Dropdown-control");
    // Поле срока аренды самоката
    private final By TimeRentOneDay = By.xpath("//div[contains(@class,'Dropdown-menu')]//div[text()='сутки']");
    //кнопка "Заказать"
    private final By buttonOrder = By.xpath("//div[contains(@class,'Order_Buttons')]//button[text()='Заказать']");
    // Модальное окно подтверждения заказа
    private final By buttonYesOrderModal = By.xpath("//div[contains(@class,'Order_Buttons')]//button[text()='Да']");
    //Модальное окно с успешным заказом
    private final By titleOrder = By.className("Order_ModalHeader__3FDaJ");
    //Плашка куки
    private final By cookieButton = By.className("App_CookieButton__3cvqF");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickQuestion(String question) {
        driver.findElement(By.id(question)).click();
    }
    public String getAnswer(String answer) {
        return driver.findElement(By.id(answer)).getText();
    }
    public void clickOrderButton(String orderButton) {
        driver.findElement(By.xpath(orderButton)).click();
    }
    public void setName(String userName) {
        driver.findElement(fieldName).sendKeys(userName);
    }
    public void setSurname(String userSurname) {
        driver.findElement(fieldSurname).sendKeys(userSurname);
    }
    public void setAddress(String address) {
        driver.findElement(fieldAddress).sendKeys(address);
    }
    public void chooseMetro(String metroStation) {
        driver.findElement(fieldChooseMetro).sendKeys(metroStation);
        driver.findElement(fieldChooseMetro).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(fieldChooseMetro).sendKeys(Keys.ENTER);
    }
    public void setPhone(String phone) {
        driver.findElement(fieldPhone).sendKeys(phone);
    }
    public void clickButtonNext() {
        driver.findElement(buttonNext).click();
    }
    public void clickCookieButton() {
        driver.findElement(cookieButton).click();
    }
    public void personalData(String username, String userSurname, String address, String metroStation, String phone) {
        setName(username);
        setSurname(userSurname);
        setAddress(address);
        chooseMetro(metroStation);
        setPhone(phone);
        clickButtonNext();
    }
    public void setChoseDate(String date) {
        driver.findElement(fieldChooseDate).sendKeys(date);
        driver.findElement(fieldChooseDate).sendKeys(Keys.ENTER);
    }
    public void choseTimeRent() {
        driver.findElement(ChooseTimeRent).click();
        driver.findElement(TimeRentOneDay).click();
    }
    public void colorScooter(String color) {
        driver.findElement(By.id(color)).click();
    }
    public void makeOrder() {
        driver.findElement(buttonOrder).click();
    }
    public void aboutRent(String date, String color) {
        setChoseDate(date);
        choseTimeRent();
        colorScooter(color);
        makeOrder();
    }
    public void clickYesOnOrder() {
        driver.findElement(buttonYesOrderModal).click();
    }
    public String getTitleOrder() {
        return driver.findElement(titleOrder).getText();
    }
}
