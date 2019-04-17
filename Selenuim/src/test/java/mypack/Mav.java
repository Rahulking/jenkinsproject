
	package mypack;

	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeMethod;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;

	public class Mav {
		WebDriver driver;
	  @Test
	  public void Login() {
		  System.out.println("Login Test Script");
		  
		  driver.findElement(By.linkText("SignIn")).click();
		  driver.findElement(By.name("userName")).sendKeys("lalitha");
		  driver.findElement(By.name("password")).sendKeys("password123");
		  driver.findElement(By.name("Login")).click();
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Launch the browser and aplication");
	  
		  System.setProperty("webdriver.chrome.driver", "C:\\Rahul\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("close application");
		  driver.close();
	  }

	}


