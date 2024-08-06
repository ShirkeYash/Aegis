package aegis.GenericUtility;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import aegis.pomClass.homePage;
import aegis.pomClass.signInPage;

public class baseTest {
	
	WebDriver driver;
	public static WebDriver listnerDriver;
	public signInPage SignIn;
	public homePage HomePage;
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;
	public fileUtility file=new fileUtility();
	public javaUtility java=new javaUtility();
	
	@BeforeSuite
	public void BeforSuite() {
	System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("Before Test");
		spark = new ExtentSparkReporter("./reports/testreports"+java.localdateTime()+".html");
		report = new ExtentReports();
		report.attachReporter(spark);
		test = report.createTest("Demo");
	}
	
	@BeforeClass
	public void BeforeClass() throws IOException, InterruptedException {
	String url = file.propertyFile("url");
	String browser = file.propertyFile("browser");
	
	if(browser.contains("chrome")) {
		driver = new ChromeDriver();
		test.log(Status.PASS, "Browser launched");
	}else {
		System.out.println("Enter valid browser");
		test.log(Status.FAIL, "Invalid Browser Details");
	}
	
	listnerDriver = driver;
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get(url);
	
	
	SignIn = new signInPage(driver);
	SignIn.emailTextField.sendKeys(file.propertyFile("superadmin"));
	//SignIn.emailTextField.sendKeys(username);
	Thread.sleep(2000);
	SignIn.passwordTextField.sendKeys(file.propertyFile("pass"));
	//SignIn.passwordTextField.sendKeys(pass);
	Thread.sleep(2000);
	SignIn.LoginButton.click();
	Thread.sleep(2000);
	
	}
	
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After Method");
		HomePage = new homePage(driver);
		HomePage.profileIconButton.click();
		HomePage.logOutButton.click();
	}
	
	@AfterClass
	public void AfterClass() throws InterruptedException {
		System.out.println("After Class");
		Thread.sleep(3000);
		driver.quit();
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");
		report.flush();
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite");
	}
	

}
