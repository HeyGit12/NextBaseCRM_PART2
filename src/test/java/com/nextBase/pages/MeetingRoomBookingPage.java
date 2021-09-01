package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MeetingRoomBookingPage extends BasePage {

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

    //to click Meeting Room Booking Calendar View, you can use this method
    public void goByText(String text) {
        Driver.get().findElement(By.xpath("//a[.='" + text + "']")).click();
    }


    //The meeting rooms checkboxes are dynamic so that 2 method created. You can use checkBoxOn method when the checkboxes are selected.
    //You can use checkBoxOff when the chexkboxes are not selected.
    public WebElement checkBoxOn(String checkBoxText) {
        return Driver.get().findElement(By.xpath("//td[.='" + checkBoxText + "']/../td[@class='bxec-checkbox']"));
    }

    public WebElement checkBoxOff(String checkBoxText) {
        return Driver.get().findElement(By.xpath("//td[.='" + checkBoxText + "']/../td[@class='bxec-checkbox-off']"));
    }


}

