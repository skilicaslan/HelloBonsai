package bonsai_invoice_automation_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BonsaiInvoiceLocators {
	
	
	public static WebElement element;

	public static WebElement emailOrPhone(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@name='user[email]']"));

		return element;

	}

	public static WebElement passWord(WebDriver driver) {

		return element = driver.findElement(By.xpath("//input[@name='user[password]']"));

	 

	}

	public static WebElement loginButton(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@type='submit']"));
		
		return element;
 
	}
	
	public static WebElement selectInvoices(WebDriver driver) {
		return element = driver.findElement(By.xpath("//a[contains(text(),'Invoices')]"));
	}
	
	public static WebElement clickNewInvoice(WebDriver driver) {
		return element = driver.findElement(By.xpath("//a[@class='btn btn-primary hidden-xs top-action-btn']"));
	}
	public static WebElement selectAClient(WebDriver driver) {
		return element = driver.findElement(By.xpath("//div[@class='css-1hwfws3 Select__value-container']"));
		
	}
	
	public static WebElement selectANewClient(WebDriver driver) {
		
		  return element = driver.findElement(By.xpath("//div[contains(text(),'+ New Client')]"));
	}
	
	public static WebElement clientName(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//input[@name='client_organization_name']"));
	}
	
	public static WebElement clientEmail(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//input[@name='client_organization_email']"));
	}
	
	public static WebElement projectName(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//input[@name='invoice[project_title]']"));
	}
	
	public static WebElement selectOneTime(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//div[contains(text(),'One-Time')]"));
	}
	public static WebElement clickCreateInvoice(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//button[contains(text(),'Create Invoice')]"));
	}

}
