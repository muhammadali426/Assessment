package pages;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class homepage extends PageObject  {
	
	
	

	public void validate() throws InterruptedException

	{
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].click();", $(By.xpath("//input[@id='usernameInput']"))); 
		$(By.xpath("//input[@id='usernameInput']")).click();
		String hint = $(By.xpath("//*[@id='app']/div/div[2]/form/div[1]/div/label")).getText();
        assertEquals( hint, "Email");
       
       js.executeScript("arguments[0].click();", $(By.xpath("//input[@id='passwordInput']")));   
       $(By.xpath("//input[@id='passwordInput']")).click();
	   String hint1 = $(By.xpath("//*[@id='app']/div/div[2]/form/div[2]/div[2]/label")).getText();
       assertEquals( hint1, "Password");
	}
	
	public void validatePostion() 
	{  
		
		String xpath1="//*[@id='app']/div/div[2]/form";//parent element
		String password  = "./div[2]"; 
		String keep_me_signin  = "./div[3]"; 
		String button  = "./button"; 
		
		WebElement ele1 = $(By.xpath(xpath1));
		WebElement ele2 = ele1.findElement(By.xpath(keep_me_signin));
		assertEquals(ele2.getText() , "Keep me signed in for today");	
		
		
	}
	 
	public void validatePostion1() 
	{  
		
		String xpath1="//*[@id='app']/div/div[2]/form";  //parent element
		String sign_in_button  = "./button"; 
		String forget_password = "./a[1]"; 
		
		WebElement ele1 = $(By.xpath(xpath1));
		WebElement ele2 = ele1.findElement(By.xpath(sign_in_button));
		WebElement ele3 = ele1.findElement(By.xpath(forget_password));
		assertEquals(ele2.getText() , "Sign in");	
		assertEquals(ele3.getText() , "Forgot password?");
	}

	public void minimizeWindow() 
	{  
		
		Dimension windowMinSize = new Dimension(400,700); 
		getDriver().manage().window().setSize(windowMinSize);

		
		
	}
	
	public void enterWrongLoginDetails() throws InterruptedException 
	{  
		
		$(By.xpath("//input[@id='usernameInput']")).sendKeys("fast_mani@yahoo.com");
		$(By.xpath("//input[@id='passwordInput']")).sendKeys("abc45@");
		
		$(By.xpath("//button[normalize-space()='Sign in']")).click();
		

		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].click();", $(By.xpath("//div[contains(text(),'Got it!')]"))); 
		
		
	}
	
	public void enterLoginDetails() throws InterruptedException 
	{  
		
		
		$(By.xpath("//input[@id='usernameInput']")).clear();
		$(By.xpath("//input[@id='usernameInput']")).sendKeys("fast_mani@yahoo.com");
		$(By.xpath("//input[@id='passwordInput']")).clear();
		$(By.xpath("//input[@id='passwordInput']")).sendKeys("abcde12345@");
		$(By.xpath("//button[normalize-space()='Sign in']")).click();
		
	}

	public void nextPage() throws InterruptedException 
	{  
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].click();", $(By.xpath("//div[contains(@class,'mrls hand button got-it-btn color-white text-size-l')]"))); 
		
		
	}

}
