package com.nextBase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage extends BasePage{
    @FindBy(css=".ui-btn-main")
    public WebElement add;
}
