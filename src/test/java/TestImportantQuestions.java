import org.openqa.selenium.WebDriver;
import org.junit.After;
import pages.MainPage;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class TestImportantQuestions {
    private WebDriver driver;

    @org.junit.Test
    public void checkActivity() {
        System.setProperty("webdriver.chrome.driver", "/Users/anastasiia/webDriver/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru");
        MainPage testImportantQuestions = new MainPage(driver);
        testImportantQuestions.clickCookieButton();
        testImportantQuestions.clickFirstQuestion();
        assertEquals("Текст первого ответа отличается", testImportantQuestions.getFirstAnswer(), "Сутки — 400 рублей. Оплата курьеру — наличными или картой.");
        testImportantQuestions.clickSecondQuestion();
        assertEquals("Текст второго ответа отличается", testImportantQuestions.getSecondAnswer(), "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.");
        testImportantQuestions.clickThirdQuestion();
        assertEquals("Текст третьего ответа отличается", testImportantQuestions.getThirdAnswer(), "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.");
        testImportantQuestions.clickFourthQuestion();
        assertEquals("Текст четвертого ответа отличается", testImportantQuestions.getFourthAnswer(), "Только начиная с завтрашнего дня. Но скоро станем расторопнее.");
        testImportantQuestions.clickFifthQuestion();
        assertEquals("Текст пятого ответа отличается", testImportantQuestions.getFifthAnswer(), "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.");
        testImportantQuestions.clickSixthQuestion();
        assertEquals("Текст шестого ответа отличается", testImportantQuestions.getSixthAnswer(), "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.");
        testImportantQuestions.clickSeventhQuestion();
        assertEquals("Текст седьмого ответа отличается", testImportantQuestions.getSeventhAnswer(), "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.");
        testImportantQuestions.clickEighthQuestion();
        assertEquals("Текст восьмого ответа отличается", testImportantQuestions.getEighthAnswer(), "Да, обязательно. Всем самокатов! И Москве, и Московской области.");
    }
    @After
    public void teardown() {
        driver.quit();
    }
}
