package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListsPage extends BasePage{

    @FindBy (id = "workarea-content")
    public WebElement listsWorkArea;

}
