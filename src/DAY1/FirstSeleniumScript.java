package DAY1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Trilok\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
		driver.get("https://en-gb.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("dhatavkarshraddha@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abcd");
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//		List<WebElement> elements = driver.findElements(By.xpath("//*"));
//		for(WebElement el: elements ) 
//		{
//			System.out.println(el.getTagName()+ ":" + el.getText());
//		}
		driver.close();
		

	}

}
