package AutomationScripts;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobSearchStepDefinitions {
	
	private WebDriver driver;
	
	
	public JobSearchStepDefinitions() {
    	driver = WebDriverset.first();
	}

	
	
	
	
	@Given("user is on NSH job search page")
	public void user_is_on_NSH_job_search_page() 
	{
		driver.navigate().to("https://www.jobs.nhs.uk/candidate/search");
	}
	
	@When("^I typein the job title (.+)$")
	public void I_typein_the_jobTitle(String jobTitle) 
	{
		driver.findElement(By.id("keyword")).sendKeys(jobTitle);
	}
	
	@When("^I typein the location (.+)$")
	public void I_typein_the_location(String location) 
	{
		driver.findElement(By.name("location")).sendKeys(location);
	}
	
	
	@When("^I select the distance (.+)$")
	public void I_select_the_distance(String distance) 
	{
		WebElement staticDropdown= driver.findElement(By.id("distance"));
		Select distanceDropdown = new Select(staticDropdown);
		distanceDropdown.selectByIndex(2);
		
	}
	
	@When("^I click on moreOptions")
	public void I_click_on_moreOptions() {
		driver.findElement(By.id("searchOptionsBtn")).click();
	}
	
	@When("^I select the payRange (.+)$")
	public void I_select_the_payRange(String payRange) 
	{
		//driver.findElement(By.id("payRange")).click();
		WebElement staticDropdown2=driver.findElement(By.id("payRange"));
		Select payDropdown = new Select(staticDropdown2);
		payDropdown.selectByIndex(3);
	}
	
	@When("I click on Search button")
	public void I_click_on_Search()
	{
		driver.findElement(By.id("search")).click();
	}
	
	
	
	@Then("I sort by newest date posted")
	public void I_sort_by_newest_date_posted()
	{
		WebElement staticDropdown3=driver.findElement(By.id("sort"));
		Select sortDropdown = new Select(staticDropdown3);
		sortDropdown.selectByIndex(1);
	}
	
	@Then("I should see the search result count displayed")
	public void I_should_see_the_search_result_count()
	{
		
		System.out.println(driver.findElement(By.cssSelector("h2[class='nhsuk-heading-l']")).getText());
	}


}


	
