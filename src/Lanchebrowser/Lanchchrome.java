package Lanchebrowser;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lanchchrome {
	
	public static void main(String[] args) throws InterruptedException {
		
	//lanche browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nasser\\selenium21\\1st-Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		//maximaze
		driver.manage().window().maximize();
		//get to web site
		driver.get("https://www.google.com/");
		//identify web element and perform action
		driver.findElement(By.name("q")).sendKeys("selenium");
		//click on specific buttom
		//driver.findElement(By.name("btnK")).click();
		
		//manage time
		Thread.sleep(3000);
		//close browser
		driver.close();
		
		
		
	}

}
