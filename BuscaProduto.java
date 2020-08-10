package siteSubmarino;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class BuscaProduto {

	String url; 
	WebDriver driver;
	
	
	@Before //Antes do Teste
	public void Iniciar() {
		url = "https://www.submarino.com.br/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rosi & Felipe\\eclipse-workspace\\Google\\siteSubmarino\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
	}
	
	@After // Depois do Teste
	public void Finalizar() {
	driver.quit();
	
	}
	
	@Given("^que acesso o site do Submarino$")
	public void que_acesso_o_site_do_Submarino() throws Throwable {
	
	 driver.get(url); //Abre o browser na página da url
	 System.out.println("Passo 1 - Acessou o site do Submarino");
	}

	@When("^Preencho o termo \"([^\"]*)\" e clico na Lupa$")
	public void preencho_o_termo_e_clico_na_Lupa(String termo ) throws Throwable {
		driver.findElement(By.id("h_search-input")).clear();
		driver.findElement(By.id("h_search-input")).sendKeys(termo + Keys.ENTER);
		System.out.println("Passo 2 - Pesquisar Smartphone");

		
	}

	
	@And("^Escolhe o produto$")
	public void Escolhe_o_produto() throws Throwable {
		driver.findElement(By.cssSelector("div.TitleUI-bwhjk3-15 khKJTM.TitleH2-sc-1wh9e1x-1.fINzxm"))
				.click();
         System.out.println("Passo 3 - Escolheu o produto");  
	
	}
	
	
	
	

	}
	
	
	


   
    

	
	
		
	
		
		
	


	
	

