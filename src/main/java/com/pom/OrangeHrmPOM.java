package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.basepage;

public class OrangeHrmPOM {
	//WebDriver driver;
@FindBy(id="txtUsername")
private WebElement untextbox;

@FindBy(id="txtPassword")
private WebElement pwdtextbox;

@FindBy(id="btnLogin")
private WebElement loginbutton;

@FindBy(id="menu_pim_viewPimModule")
private WebElement pimlink;

@FindBy(id="menu_pim_addEmployee")
private WebElement addemployeelink;

@FindBy(id="firstName")
private WebElement fstnmtextfield;

@FindBy(id="middleName")
private WebElement middlenmtextfield;

@FindBy(id="lastName")
private WebElement lastnmtextfield;

@FindBy(id="employeeId")
private WebElement empidtextfield;

@FindBy(id="photofile")
private WebElement photofile;

@FindBy(id="chkLogin")
private WebElement chklogin;

@FindBy(id="user_name")
private WebElement usernametxtfield;

@FindBy(id="user_password")
private WebElement pwdnametxtfield;

@FindBy(id="re_password")
private WebElement repwdnametxtfield;

@FindBy(id="status")
private WebElement statuslink;

@FindBy(id="btnSave")
private WebElement savelink;




public OrangeHrmPOM(WebDriver driver)
{
PageFactory.initElements(driver, this);
}
public void login() {
	untextbox.sendKeys("Admin");
	pwdtextbox.sendKeys("admin123");
	loginbutton.click();
	
}
public void addEmp() throws InterruptedException
{
	Thread.sleep(8000);
	pimlink.click();
	Thread.sleep(8000);
	addemployeelink.click();
	fstnmtextfield.sendKeys("Diganta");
	middlenmtextfield.sendKeys("kumar");
	lastnmtextfield.sendKeys("behera");
	empidtextfield.sendKeys("1234");
	chklogin.click();
	usernametxtfield.sendKeys("diganta123");
	pwdnametxtfield.sendKeys("Behera@123");
	repwdnametxtfield.sendKeys("Behera@123");
	basepage.selectbyvisibletext(statuslink, "Disabled");
	savelink.click();
}

}
