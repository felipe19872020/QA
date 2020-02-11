package Extra1;






import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuscaExtra1 {
String url;
WebDriver driver;
String nomePasta = new SimpleDateFormat("yyyy-MM-dd HH-mm").format(Calendar.getInstance() .getTime());

//Funcoes e metodos de Apoio
//Tirar Print da Tela

public void Print (String nomePrint) throws IOException {
	File foto = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(foto, new File("C:\\Users\\Felipe\\eclipse-workspace\\Extra\\target\\Evidencias\\" + nomePasta + "\\"+ nomePrint +".png"));
}




private DateFormat SimpleDateFormat(String string) {
	// TODO Auto-generated method stub
	return null;
}




@Before
public void iniciar () {
url = "https://www.submarino.com.br";
System.setProperty ("webdriver.chrome.driver", "C:\\Users\\Felipe\\eclipse-workspace\\Extra\\drivers\\Chrome\\79\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(60000,TimeUnit.MILLISECONDS);
driver.manage().window().maximize();

}
	

@After
public void Finalizar() {
	driver.quit();
}

@Given("^que acesso o site do Submarino$")
public void que_acesso_o_site_do_Submarino() throws Throwable {
	driver.get (url);


}

@When("^preencho o termo \"([^\"]*)\"  e clico na Lupa$")
public void preencho_o_termo_e_clico_na_Lupa(String termo) throws Throwable {
   driver.findElement(By.id("h_search-input")).clear(); 
   driver.findElement(By.id("h_search-input")).sendKeys(termo+Keys.ENTER );
   assertEquals("smartphone com ofertas incríveis no Submarino.com", driver.getTitle());
   

//assertEquals("smartphone", driver.findElement(By.cssSelector("ul.neemu-breadcrumb-container")).getText());
   
    
   
    
}


@Then("^exibe a lista de produtos$")
public void exibe_a_lista_de_produtos() throws Throwable {
	//Thread.sleep(12000);

    throw new PendingException();
}

@Then("^exibe a mensagem de produto n?o encontrado$")
public void exibe_a_mensagem_de_produto_não_encontrado() throws Throwable {
  
 
}



}
