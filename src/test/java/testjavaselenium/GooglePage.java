package testjavaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GooglePage extends BasePage{
	//WebDriver driver=new ChromeDriver();
	ChromeOptions options = new ChromeOptions();

	WebDriver driver = new ChromeDriver(options);

	private By checkboxes = By.xpath("//a[@href='/checkboxes']");
	private By checkbox1 = By.xpath("(//input[@type='checkbox'])[1]");
	private By dropdown = By.xpath("//a[@href='/dropdown']");
	private By openDropdown = By.xpath("//select[@id='dropdown']");
	private By option = By.xpath("//option[contains(text(), 'Option 2')]");

	
	public GooglePage(WebDriver driver) {
	    super(driver);
	}
	
	public void open() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    public void search() {
        //wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
        driver.findElement(checkboxes).click();
        driver.findElement(checkbox1).click();
        driver.navigate().back();
        driver.findElement(dropdown).click();
        driver.findElement(openDropdown).click();
        driver.findElement(option).click();
    }

    public String getTitle() {
        return driver.getTitle();
    }

}
