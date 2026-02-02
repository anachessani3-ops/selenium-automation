package testjavaselenium;

import static org.testng.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleTest {
	WebDriver driver;
    GooglePage googlePage;

    @BeforeEach
    void setUp() {
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--headless");
    	options.addArguments("--disable-gpu");
    	options.addArguments("--window-size=1920,1080");

    	WebDriver driver = new ChromeDriver(options);
        driver = new ChromeDriver();
        googlePage = new GooglePage(driver);
    }

    @Test
    void buscarEnGoogle() {
        googlePage.open();
        googlePage.search();
        //assertTrue(googlePage.getTitle().contains("Checkboxes"));
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
