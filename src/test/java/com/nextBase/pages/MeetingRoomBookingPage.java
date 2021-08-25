package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MeetingRoomBookingPage extends BasePage{

    @FindBy(xpath = "//table[contains(@id,'sceleton_table')]")
    public WebElement eventCalendar;

    @FindBy(xpath = "//td[.='East Meeting Room']/../td[@class='bxec-checkbox']")
    public WebElement eastMeetingRoomCheckBoxOn;

    @FindBy(xpath = "//td[.='East Meeting Room']/../td[@class='bxec-checkbox-off']")
    public WebElement getEastMeetingRoomCheckBoxOff;

    @FindBy(xpath = "//a[.='Book meeting room']")
    public WebElement bookMeetingRoom;

    @FindBy(xpath = "//span[starts-with(@id,'calendar_slider')][@class='calendar-head-area-title-name']")
    public WebElement pageSubtitle;

    public void goByText(String text){
        Driver.get().findElement(By.xpath("//a[.='"+text+"']"));
    }


}

