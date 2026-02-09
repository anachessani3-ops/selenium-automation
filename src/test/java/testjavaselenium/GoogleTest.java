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
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--headless");
    	options.addArguments("--disable-gpu");
    	options.addArguments("--window-size=1920,1080");

    	options.addArguments("--headless=new");
    	options.addArguments("--no-sandbox");
    	options.addArguments("--disable-dev-shm-usage");
    	WebDriver driver = new ChromeDriver(options);

        driver = new ChromeDriver();
        googlePage = new GooglePage(driver);
        
        System.setProperty("webdriver.chrome.verboseLogging", "true");
        System.setProperty("webdriver.chrome.logfile", "chromedriver.log");
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
       //driver.close();
    }
}
