package prueba;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BusquedaReservaVuelos {

	WebDriver driver;
	
	@Before
	
	
	public void cargaInicial () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alejo\\eclipse-workspace\\SophosPrueba\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		driver.manage().window().maximize();
	}
	    @Test 
		@Given ("que se pueden viasualizar las diferentes opciones")
		
		public void busqueda ()  {
			
			WebElement lnkVuelos = driver.findElement(By.linkText("Flights"));
			lnkVuelos.click();
					
	}
	
	@When ("ingrese a la seccion de vuelos")
	public void registro() {
			
		WebElement usuario = driver.findElement(By.name("userName"));
		usuario.sendKeys("sofhos@banking.com.co");
		
		WebElement contraseña = driver.findElement(By.name("password"));
		contraseña.sendKeys("sophos123");
		
		WebElement btnIngresar = driver.findElement(By.name("login"));
		btnIngresar.click();
	}
		
		@Then ("se debe permitir realizar la busqueda de un vuelo para su posterior reserva")
		public void formulario()  {
			
		
		WebElement rdbOneWa = driver.findElement(By.name("tripType"));
		rdbOneWa.click();
		
		Select viajeOrigen = new Select(driver.findElement(By.name("fromPort")));
		viajeOrigen.selectByValue("London");
		
		WebElement fechaViaje = driver.findElement(By.name("fromMonth"));
		fechaViaje.sendKeys("August");
		
		Select diaViaje = new Select(driver.findElement(By.name("fromDay")));
		diaViaje.selectByValue("10");
		
		Select viajeDestino = new Select(driver.findElement(By.name("toPort")));
		viajeDestino.selectByValue("Paris");
		
		WebElement fechaRegreso = driver.findElement(By.name("toMonth"));
		fechaRegreso.sendKeys("August");
		
		Select diaRegreso = new Select(driver.findElement(By.name("toDay")));
		diaRegreso.selectByValue("25");
		
		WebElement tipoReserva = driver.findElement(By.name("servClass"));
		tipoReserva.click();
		
		WebElement aerolinea = driver.findElement(By.name("airline"));
		aerolinea.sendKeys("Unified Airlines");
		
		WebElement btnSiguiente = driver.findElement(By.name("findFlights"));
		btnSiguiente.click();
		
		
		Select rdbTarifa1 = new Select(driver.findElement(By.name("outFlight")));
		rdbTarifa1.selectByValue("Pangea Airlines$362$274$9:17");
		
		Select rdbTarifa2 = new Select(driver.findElement(By.name("inFlight")));
		rdbTarifa2.selectByValue("Unified Airlines$633$303$18:44");
		
		WebElement btnReservar = driver.findElement(By.name("reserveFlights"));
		btnReservar.click();
		
	}
	
}
