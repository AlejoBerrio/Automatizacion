package prueba;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class SteepsIngresoAgencia {
	
	WebDriver driver;
	//Scenario scenario;
	
	@Before
	public void cargaInicial () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alejo\\eclipse-workspace\\SophosPrueba\\chromedriver.exe");
		driver= new ChromeDriver();	
		/*driver.get("http://newtours.demoaut.com/mercurysignon.php");
		driver.manage().window().maximize();*/	
		
	}	
	
	@Test ()
	
	@Given ("que el registro sea exitoso")
	
	public void ingresoAgencia ()  {
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		driver.manage().window().maximize();
}
	
	@When ("ingrese los datos de usuario y contraseña de forma correcta")
	public void usuarioContraseña() throws InterruptedException  {
				
		WebElement usuario = driver.findElement(By.name("userName"));
		usuario.sendKeys("sofhos@banking.com.co");
		
		WebElement contraseña = driver.findElement(By.name("password"));
		contraseña.sendKeys("sophos123");
		
		WebElement btnIngresar = driver.findElement(By.name("login"));
		btnIngresar.click();

	}
	

	@Then ("se deben visualizar las diferentes opciones")
	public void login()  {
	
		WebElement tittle =driver.findElement(By.xpath("//td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img/@src"));				
		Assert.assertTrue(tittle.isDisplayed());

	}
}
