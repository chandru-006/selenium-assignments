package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathFacebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@title,'English (UK)')]")).click();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Chan");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("dru");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("testingxpath@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("testingxpath@gmail.com");
		driver.findElement(By.xpath("(//input)[13]")).sendKeys("testpassword");

		WebElement drpdwn1 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select drop1 = new Select(drpdwn1);
		drop1.selectByIndex(6);

		WebElement drpdwn2 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select drop2 = new Select(drpdwn2);
		drop2.selectByVisibleText("Oct");

		WebElement drpdwn3 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select drop3 = new Select(drpdwn3);
		drop3.selectByValue("1997");

		driver.findElement(By.xpath("(//input)[17]")).click();

		driver.findElement(By.xpath("//div[@class='_1lch']/button")).click();
		// driver.findElement(By.xpath("//button[text()='Sign Up']")).click();

		String title = "Facebook – log in or sign up";
		String title2 = driver.getTitle();

		System.out.println(title2);
		
		if (title.equals(title2)) {
			System.out.println("The page is correct " + title2);
		} else {
			System.out.println("the page is incorrect");
		}

	}

}
