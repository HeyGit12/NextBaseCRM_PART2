package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MeetingRoomsPage extends BasePage{

    @FindBy(xpath = "//a[.='Meeting Room Booking Calendar View']")
    public WebElement meetingRoomBookingCalendarView;

    public void goByText(String text){
        Driver.get().findElement(By.xpath("//a[.='"+text+"']")).click();
    }

}
