package stepDefinitions;

import java.io.File;

import java.io.IOException;


import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import io.cucumber.java.en.Given;

import scenarioContext.ScenarioContext;

public class pdfRead {
	
	private ScenarioContext scenarioContext ;
	WebDriver driver;
//	scenarioContext = 
	
@Given("Read File from PDF and print output")
public void read_file_from_pdf_and_print_output() throws IOException {
	 
	String filePath = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome",filePath+"\\chromedriver.exe");
	driver = new ChromeDriver();
	
	String dataFilePath = System.getProperty("user.dir")+"/testData/Attendence.pdf";
	 dataFilePath= dataFilePath.replace("\\", "/");
	 

        File file = new File(dataFilePath);
        PDDocument document = Loader.loadPDF(file);
        
       
//        PDPage page = document.getPage(0);
       
        PDFTextStripper stripper = new PDFTextStripper();
      
        String text = stripper.getText(document);
        System.out.println(text);
       
       
        Assert.assertTrue(text.contains("Face Recognition Based Attendance"));
        Assert.assertTrue(text.contains("Marking System"));
        Assert.assertTrue(text.contains("Computer Science And Engineering"));
	

}
}
