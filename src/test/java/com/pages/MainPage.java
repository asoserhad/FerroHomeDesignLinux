package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;


public class MainPage {
	
	
	@FindBy(xpath ="//li[@id='menu-item-68']//a[@class='nav-top-link'][contains(text(),'Collections')]")
	public WebElement collections_link;
	
	@FindBy(xpath ="//h3[contains(text(),'COLLECTIONS')]")
	public WebElement collections_verify;
	
	
	
	
	public MainPage() {
		PageFactory.initElements(Base.driver, this);
	}
}
