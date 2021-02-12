package pages;


import net.thucydides.core.annotations.Step;





public class Login {

	
	homepage hp;
	
	@Step
	public void openUrl() 
	{
		hp.open();
		
		
		
	}
	@Step
	public void validateHints() throws InterruptedException
	{
		hp.validate();
	}
    
	@Step
	public void validatePosition()
	{
		hp.validatePostion();
	}
	
	public void validatePostion1() 
	{  
		
		
		hp.validatePostion1();
		
	}

	public void minimizeWindow() 
	{  
		
		hp.minimizeWindow();

		
		
	}
	
	public void enterWrongLoginDetails() throws InterruptedException 
	{  
		
		
		hp.enterWrongLoginDetails();
	}
	
	public void enterLoginDetails() throws InterruptedException 
	{  
		
		
		hp.enterLoginDetails();
	}

	public void nextPage() throws InterruptedException 
	{  
		
		hp.nextPage();
	}
	

}
