package com.nextBase.pages;
import com.nextBase.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    @FindBy(xpath = "(//span[.='Poll'])[2]")
    public WebElement pollTab;

    public HomePage(){
        PageFactory.initElements(Driver.get(),this);
    }
    public void navigateToMenu(String menu){
        Driver.get().findElement(By.xpath("//span[@class='menu-item-link-text' and contains(text(), '" + menu + "')]")).click();
    }
    public void navigateToTab(String tab){
        Driver.get().findElement(By.xpath("//span[@class='main-buttons-item-text-title' and contains(text(), '"+tab+"')]")).click();
    }
}
