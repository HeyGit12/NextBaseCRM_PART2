package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Locale;

public class CalendarPage extends BasePage{
    @FindBy(css=".ui-btn-main")
    public WebElement add;

    @FindBy(xpath = "//input[@name='importance']")
    public WebElement importance;

    @FindBy(xpath = "//input[@name='date_from']")
    public WebElement dateFrom;

    @FindBy(xpath = "//input[@name='date_to']")
    public WebElement dateTo;

    @FindBy(id="calendar_slider_557471_timezone_btn")
    public WebElement timeZone;

    @FindBy(xpath="//select[@name='tz_from']")
    public WebElement timeZoneFrom;

    @FindBy(xpath = "//input[@name='lo_cation']")
    public List<WebElement> location;

    @FindBy(css = ".feed-add-destination-inp")
    public WebElement attendees;

    @FindBy(css = "..calendar-field-colorpicker-color-item-more-link")
    public WebElement otherColor;

    @FindBy(css = ".main-color-picker-custom-action")
    public WebElement customColor;

    @FindBy(xpath = "//select[@name='accessibility']")
    public List<WebElement> availability;

    @FindBy(css = ".bx-editor-iframe")
    public WebElement descriptionIframe;

    @FindBy(css = ".vsc-initialized")
    public WebElement descriptionInput;


    public void eventDescription(String description){
        Driver.get().switchTo().frame(descriptionIframe);
        descriptionInput.sendKeys(description);
        Driver.get().switchTo().frame(0);
    }


}
