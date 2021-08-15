package week2.day1;

import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafAssignment {
	// opencart
	// facebook
	// salesforce
	// leaftaps
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Free Lancer");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Poorna");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chandru M");
		WebElement drpdwn1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop1 = new Select(drpdwn1);
		drop1.selectByIndex(7);
		WebElement drpdwn2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop2 = new Select(drpdwn2);
		drop2.selectByIndex(4);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Poorna");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Chandru M");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Hello");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("06/10/1997");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr.");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("25 lakhs");
		WebElement drpdwn3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select drop3 = new Select(drpdwn3);
		drop3.selectByVisibleText("INR - Indian Rupee");
		WebElement drpdwn4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drop4 = new Select(drpdwn4);
		drop4.selectByIndex(4);
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1");
		WebElement drpdwn5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop5 = new Select(drpdwn5);
		drop5.selectByIndex(2);
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("6600");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("FL");
		driver.findElement(By.id("createLeadForm_description")).sendKeys(
				"The software industry includes businesses for development, maintenance and publication of software that are using different business models, mainly either \"license/maintenance based\" (on-premises) or \"Cloud based\" (such as SaaS, PaaS, IaaS, MBaaS, MSaaS, DCaaS etc.). The industry also includes software services, such as training, documentation, consulting and data recovery.");
		driver.findElement(By.id("createLeadForm_importantNote"))
				.sendKeys("See how software is developed and how it can help your business compete.");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9976466524");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mchandru006@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.co.in");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Poorna Chandru M");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Chandru");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Nellaiappar St.");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Chrompet");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		WebElement drpdwn6 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drop6 = new Select(drpdwn6);
		drop6.selectByVisibleText("India");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebElement drpdwn7 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drop7 = new Select(drpdwn7);
		drop7.selectByVisibleText("TAMILNADU");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600044");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("NIL");
		driver.findElement(By.name("submitButton")).click();
		String title = "View Lead | opentaps CRM";
		String autotitle = driver.getTitle();
		System.out.println(autotitle);
		if (title.equals(autotitle)) {
			System.out.println("In the home page correcty. The title is    " + title);

		} else {
			System.out.println("Not in the home page ");
		}

	}
}
