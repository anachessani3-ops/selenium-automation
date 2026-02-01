package testjavaselenium;

import static org.testng.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	WebDriver driver = new ChromeDriver();
    GooglePage googlePage = new GooglePage(driver);;

    /*@BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        googlePage = new GooglePage(driver);
    }*/

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
