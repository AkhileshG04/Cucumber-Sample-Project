package stepDefinitions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import context.GoogleSearch;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import scenarioContext.ScenarioContext;

public class runSample {
	
	private ScenarioContext scenarioContext ;
	WebDriver driver;
//	scenarioContext = 
	
@Given("Get Data from Json")
public void get_data_from_json() {
	 
	String filePath = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome",filePath+"\\chromedriver.exe");
	driver = new ChromeDriver();
	scenarioContext = new ScenarioContext();
	
	

}
	
@Given("I want to get Data from json {string}")
public void get_data_from_json(String filename) throws FileNotFoundException, IOException, ParseException
{
	 String dataFilePath = System.getProperty("user.dir")+"/testData/testData.json";
	 dataFilePath= dataFilePath.replace("\\", "/");

	  Object o = new JSONParser().parse(new FileReader(dataFilePath));

      JSONObject j = (JSONObject) o;
      
      scenarioContext.setContext(GoogleSearch.search, j.get("Search1"));
      
}

@When("I want to search google with the data present in file")
public void want_to_search_google()
{
	
	driver.get("https://www.google.com");
	System.out.println("Test Run Success : "+driver.getTitle());
	driver.manage().window().maximize();
//	String search="weather";
	String search = (String)scenarioContext.getContext(GoogleSearch.search);
	System.out.println("To Search ---------->" +search);
	driver.findElement( By.id("APjFqb")).sendKeys(search);
	driver.findElement( By.id("APjFqb")).sendKeys(Keys.ENTER);
	
	System.out.println("Current Temperature is : "+driver.findElement(By.id("wob_tm")).getText());
}


}
