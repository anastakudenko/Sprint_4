package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MainPage {

    // переменная драйвера
    private final WebDriver driver;
    //первый тест - на раскрытие выпадающих списков
    // Раздел вопросы о важном
    private final By firstQuestion = By.id("accordion__heading-0");
    private final By firstAnswer = By.id("accordion__panel-0");
    private final By secondQuestion = By.id("accordion__heading-1");
    private final By secondAnswer = By.id("accordion__panel-1");
    private final By thirdQuestion = By.id("accordion__heading-2");
    private final By thirdAnswer = By.id("accordion__panel-2");
    private final By fourthQuestion = By.id("accordion__heading-3");
    private final By fourthAnswer = By.id("accordion__panel-3");
    private final By fifthQuestion = By.id("accordion__heading-4");
    private final By fifthAnswer = By.id("accordion__panel-4");
    private final By sixthQuestion = By.id("accordion__heading-5");
    private final By sixthAnswer = By.id("accordion__panel-5");
    private final By seventhQuestion = By.id("accordion__heading-6");
    private final By seventhAnswer = By.id("accordion__panel-6");
    private final By eighthQuestion = By.id("accordion__heading-7");
    private final By eighthAnswer = By.id("accordion__panel-7");

    // Кнопка "Заказать" в заголовке
    private final By orderButtonTitle = By.cssSelector(".Header_Nav__AGCXC .Button_Button__ra12g");
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
    public void clickFirstQuestion() {
        driver.findElement(firstQuestion).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    public String getFirstAnswer() {
        return driver.findElement(firstAnswer).getText();
    }
    public void clickSecondQuestion() {
        driver.findElement(secondQuestion).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    public String getSecondAnswer() {
        return driver.findElement(secondAnswer).getText();
    }
    public void clickThirdQuestion() {
        driver.findElement(thirdQuestion).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    public String getThirdAnswer() {
        return driver.findElement(thirdAnswer).getText();
    }
    public void clickFourthQuestion() {
        driver.findElement(fourthQuestion).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    public String getFourthAnswer() {
        return driver.findElement(fourthAnswer).getText();
    }
    public void clickFifthQuestion() {
        driver.findElement(fifthQuestion).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    public String getFifthAnswer() {
        return driver.findElement(fifthAnswer).getText();
    }
    public void clickSixthQuestion() {
        driver.findElement(sixthQuestion).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    public String getSixthAnswer() {
        return driver.findElement(sixthAnswer).getText();
    }
    public void clickSeventhQuestion() {
        driver.findElement(seventhQuestion).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    public String getSeventhAnswer() {
        return driver.findElement(seventhAnswer).getText();
    }
    public void clickEighthQuestion() {
        driver.findElement(eighthQuestion).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    public String getEighthAnswer() {
        return driver.findElement(eighthAnswer).getText();
    }
    public void clickOrderButtonTitle() {
        driver.findElement(orderButtonTitle).click();
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
        clickCookieButton();
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
