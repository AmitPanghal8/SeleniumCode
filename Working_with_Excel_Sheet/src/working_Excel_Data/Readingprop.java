package working_Excel_Data;

		import java.io.FileInputStream;
		import java.io.IOException;
		import java.util.Properties;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;


		public class Readingprop {

			
			public static void main(String[] args) throws IOException {
				
				System.setProperty("webdriver.chrome.driver","F:\\Eclips\\chromedriver.exe" );
				WebDriver driver = new ChromeDriver();
			
				Properties prop = new Properties();
				FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\obj.properties");
				
				prop.load(fis);
				
				System.out.println(prop.getProperty("name"));
				System.out.println(System.getProperty("user.dir"));
				System.out.println(prop.getProperty("company"));
				driver.get("http://google.com");
				driver.findElement(By.name(prop.getProperty("google"))).sendKeys("High Technology solutions");

			}

	

		// TODO Auto-generated method stub

	}

