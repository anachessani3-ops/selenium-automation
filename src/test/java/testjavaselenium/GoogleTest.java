package testjavaselenium;


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
    	  // Logs de ChromeDriver (ANTES de crear el driver)
        System.setProperty("webdriver.chrome.verboseLogging", "true");
        System.setProperty("webdriver.chrome.logfile", "chromedriver.log");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        driver = new ChromeDriver(options); // ✅ SOLO UNA VEZ
        googlePage = new GooglePage(driver);
        
    }

    @Test
    void buscarEnGoogle() {
        googlePage.open();
        googlePage.search();
        System.out.print("X");
        //assertTrue(googlePage.getTitle().contains("Checkboxes"));
    }

    @AfterEach
    void tearDown() {
    	if (driver != null) {
            driver.quit(); // 🔥 obligatorio en CI
        }
    }
}
