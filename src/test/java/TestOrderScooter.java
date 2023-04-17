import org.openqa.selenium.WebDriver;
import org.junit.After;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.hamcrest.CoreMatchers.startsWith;
import org.hamcrest.MatcherAssert;
@RunWith(Parameterized.class)
public class TestOrderScooter {
    private WebDriver driver;
    private final String userName;
    private final String surName;
    private final String address;
    private final String metroStation;
    private final String phone;
    private final String date;
    private final String color;

    public TestOrderScooter(String userName, String surName, String address, String metroStation, String phone, String date, String color) {
        this.userName = userName;
        this.surName = surName;
        this.address = address;
        this.metroStation = metroStation;
        this.phone = phone;
        this.date = date;
        this.color = color;
    }
    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                { "Настя", "Куденко", "Джавовая", "Черкизовская", "89777777777", "30/04/2023", "grey"},
                { "Абдурахмангаджи", "Абдурахмангаджигиева", "Тестовая 16-92", "Сокольники", "+79777777777", "29.04.2023", "black"},
        };
    }

    @org.junit.Test
    public void checkActivity() {
        System.setProperty("webdriver.chrome.driver", "/Users/anastasiia/webDriver/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru");
        MainPage testOrderScooter = new MainPage(driver);
        testOrderScooter.clickOrderButtonTitle();
        testOrderScooter.personalData(userName,surName, address, metroStation, phone);
        testOrderScooter.aboutRent(date,color);
        testOrderScooter.clickYesOnOrder();
        MatcherAssert.assertThat("Нет информации о созданном заказе",testOrderScooter.getTitleOrder(), startsWith("Заказ оформлен"));
    }
    @After
    public void teardown() {
        driver.quit();
}
}

