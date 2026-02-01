package testjavaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePage extends BasePage{
	WebDriver driver=new ChromeDriver();
	private By checkboxes = By.xpath("//a[@href='/checkboxes']");

	
	public GooglePage(WebDriver driver) {
	    super(driver);
	}
	
	public void open() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    public void search() {
        //wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
        driver.findElement(checkboxes).click();
    }

    public String getTitle() {
        return driver.getTitle();
    }

}
