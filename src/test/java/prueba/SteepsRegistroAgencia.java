package prueba;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SteepsRegistroAgencia {

	//WebDriver driver;
	//Scenario scenario;
	
	@Before
	public void cargaInicial () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alejo\\eclipse-workspace\\SophosPrueba\\chromedriver.exe");
		
		
	}
	
	
	WebDriver driver = new ChromeDriver();	
	//@Test
		@Given ("^que se realice el ingreso a la URL$")
		
		public void ingreso ()  {
			driver.get("http://newtours.demoaut.com/mercurysignon.php");
			driver.manage().window().maximize();
	}
	
	
	@When ("^de clic en la opción de registro$")
	
	public void registro() {
		
		WebElement lnkRegistrar = driver.findElement(By.linkText("REGISTER"));
		lnkRegistrar.click();
	}
	
		@Then ("^se debe cargar un formulario que me permita ingresar los datos para el registro^")
		public void formulario()  {
		
		WebElement frsName = driver.findElement(By.name("firstName"));
		frsName.sendKeys("Sophos");
		
		WebElement lstName = driver.findElement(By.name("lastName"));
		lstName.sendKeys("Banking");
		
		WebElement telefono = driver.findElement(By.name("phone"));
		telefono.sendKeys("987654321");
		
		WebElement correo = driver.findElement(By.name("userName"));
		correo.sendKeys("sofhos@banking.com.co");
		
		WebElement direccion = driver.findElement(By.name("address1"));
		direccion.sendKeys("cll 10 - 21-14");
		
		WebElement ciudad = driver.findElement(By.name("city"));
		ciudad.sendKeys("Medellin");
		
		WebElement departamento = driver.findElement(By.name("state"));
		departamento.sendKeys("Antioquia");
		
		WebElement codigoPostal = driver.findElement(By.name("postalCode"));
		codigoPostal.sendKeys("54237");
		
		WebElement pais = driver.findElement(By.name("country"));
		pais.sendKeys("Colombia");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("sofhos@banking.com.co");
		
		WebElement clave = driver.findElement(By.name("password"));
		clave.sendKeys("sophos123");
		
		WebElement confimarCalve = driver.findElement(By.name("confirmPassword"));
		confimarCalve.sendKeys("sophos123");
		
		WebElement btnRegistrar = driver.findElement(By.name("register"));
		btnRegistrar.click();
		
	}
		
		
	}
