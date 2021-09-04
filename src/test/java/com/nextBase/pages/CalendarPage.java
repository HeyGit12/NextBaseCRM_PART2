package com.nextBase.pages;

import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;

import java.util.*;


public class CalendarPage extends BasePage {
    @FindBy(xpath = "//button[@class='ui-btn-main']")
    public WebElement add;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement eventName;

    @FindBy(xpath = "//span[@data-bx-calendar-view='list']")
    public WebElement schedule;

    @FindBy(xpath = "//input[@name='importance']")
    public WebElement importance;

    @FindBy(xpath = "//input[@name='date_from']")
    public WebElement dateFrom;

    @FindBy(xpath = "//input[@name='date_to']")
    public WebElement dateTo;

    @FindBy(css = ".calendar-options-timezone-collapse-btn")
    public WebElement timeZone;

    @FindBy(xpath = "//select[@name='tz_from']")
    public WebElement timeZoneFrom;

    @FindBy(xpath = "//select[@name='EVENT_RRULE[FREQ]']")
    public WebElement repeat;

    @FindBy(xpath = "//input[@name='lo_cation']")
    public WebElement location;

    @FindBy(css = ".event-grid-dest-wrap")
    public WebElement attendeesField;

    @FindBy(css = ".event-grid-dest-text")
    public List<WebElement> allAttendees;

    @FindBy(xpath = "(//span[@class='feed-event-del-but'])[2]")
    public WebElement removeFirstAttendee;

    @FindBy(css = ".calendar-slider-sidebar-user-info-name")
    public List<WebElement> invitedParticipants;

    @FindBy(css = ".calendar-member-total-count")
    public WebElement invitedButton;

    @FindBy(css = ".bx-lm-tab-department")
    public WebElement employeesAndDeps;

    @FindBy(css = ".calendar-additional-alt-promo")
    public WebElement more;

    @FindBy(css = ".calendar-field-colorpicker-color-item-more-link")
    public WebElement otherColor;

    @FindBy(css = ".main-color-picker-custom-action")
    public WebElement customColor;

    @FindBy(css = ".main-color-picker-custom-input")
    public WebElement colorCode;

    @FindBy(xpath = "//select[@name='accessibility']")
    public WebElement availability;

    @FindBy(xpath = "//body")
    public WebElement descriptionInput;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement descriptionFrame;

    @FindBy(xpath = "//span[contains(text(),'Ctrl+Enter')]")
    public WebElement save;

    @FindBy(xpath = "//span[@class='calendar-right-block-event-info-btn'][2]")
    public WebElement editEvent;

    @FindBy(xpath = "//span[@class='calendar-right-block-event-info-btn'][1]")
    public WebElement openEvent;

    @FindBy(xpath = "(//span[@class='calendar-timeline-stream-content-event-color'])[1]")
    public WebElement eventColor;

    @FindBy(xpath = "//input[@name='private_event']")
    public WebElement privateEvent;

    @FindBy(xpath = "(//div[@class='calendar-slider-detail-option-value'])[1]")
    public WebElement getAvailability;

    @FindBy(css = ".calendar-timeline-stream-content-event")
    public WebElement eventDetails;

    @FindBy(xpath = "(//div[@class='calendar-slider-detail-option-value'])[3]")
    public WebElement specialNotes;

    @FindBy(xpath = "//*[@class='calendar-timeline-stream-content-event-name-link']")
    public List<WebElement> allEvents;

    @FindBy(css = "#calendar-filter-personal_search")
    public WebElement filterAndSearch;

    @FindBy(css = ".main-ui-square-item")
    public WebElement currentFilter;

    @FindBy(css = ".main-ui-filter-field-add-item")
    public WebElement addField;

    @FindBy(xpath = "//div[.='Participation status']/div")
    public WebElement participationStatus;

    @FindBy(xpath = "(//div[@data-name='MEETING_STATUS'])[2]")
    public WebElement participationStatusField;

    @FindBy(xpath = "(//div[@data-name='IS_MEETING']/div)[1]")
    public WebElement eventWithParticipants;

    @FindBy(xpath = "//div[@data-item='{\"NAME\":\"Yes\",\"VALUE\":\"Y\"}']")
    public WebElement participantsYes;

    @FindBy(xpath = "//div[@data-item='{\"NAME\":\"Invited\",\"VALUE\":\"Q\"}']/div")
    public WebElement participationInvited;

    @FindBy(xpath = "//span[.='Invitations']")
    public WebElement invitations;

    @FindBy(xpath = "//span[.=\"I'm an organiser\"]")
    public WebElement i_am_an_organiser;

    @FindBy(xpath = "(//span[contains(text(),'Reset')])[2]")
    public WebElement reset;

    @FindBy(xpath = "//span[.='Delete']")
    public WebElement delete;

    public void eventDescription(String description) {
        BrowserUtils.waitForVisibility(descriptionFrame, 10);
        Driver.get().switchTo().frame(descriptionFrame);
        descriptionInput.click();
        descriptionInput.sendKeys(description);
        Driver.get().switchTo().defaultContent();
    }

    public void addAttendees(String list) {
        attendeesField.click();
        employeesAndDeps.click();
        if (list.contains("/")) {
            String[] split = list.split("/");
            for (String s : split) {
                Driver.get().findElement(By.xpath("//div[@class='bx-finder-company-department-employee-name' and contains(text(),'" + s + "')]")).click();
            }
        } else {
            Driver.get().findElement(By.xpath("//div[@class='bx-finder-company-department-employee-name' and contains(text(),'" + list + "')]")).click();
        }
    }

    public void selectColor(String color) {
        Color color1 = Color.fromString(color);
        String colorAsHex = color1.asHex();
        otherColor.click();
        customColor.click();
        colorCode.sendKeys(colorAsHex + Keys.ENTER);

//        String[][] array = {{"maroon", "#800000"}, {"darkred", "#8B0000"}, {"brown", "#A52A2A"}, {"firebrick", "#B22222"}, {"crimson", "#DC143C"}, {"red", "#FF0000"}, {"tomato", "#FF6347"}, {"coral", "#FF7F50"}, {"indianred", "#CD5C5C"}, {"lightcoral", "#F08080"}, {"darksalmon", "#E9967A"}, {"salmon", "#FA8072"}, {"lightsalmon", "#FFA07A"}, {"orangered", "#FF4500"}, {"darkorange", "#FF8C00"}, {"orange", "#FFA500"}, {"gold", "#FFD700"}, {"darkgoldenrod", "#B8860B"}, {"goldenrod", "#DAA520"}, {"palegoldenrod", "#EEE8AA"}, {"darkkhaki", "#BDB76B"}, {"khaki", "#F0E68C"}, {"olive", "#808000"}, {"yellow", "#FFFF00"}, {"yellowgreen", "#9ACD32"}, {"darkolivegreen", "#556B2F"}, {"olivedrab", "#6B8E23"}, {"lawngreen", "#7CFC00"}, {"chartreuse", "#7FFF00"}, {"greenyellow", "#ADFF2F"}, {"darkgreen", "#006400"}, {"green", "#008000"}, {"forestgreen", "#228B22"}, {"lime", "#00FF00"}, {"limegreen", "#32CD32"}, {"lightgreen", "#90EE90"}, {"palegreen", "#98FB98"}, {"darkseagreen", "#8FBC8F"}, {"mediumspringgreen", "#00FA9A"}, {"springgreen", "#00FF7F"}, {"seagreen", "#2E8B57"}, {"mediumaquamarine", "#66CDAA"}, {"mediumseagreen", "#3CB371"}, {"lightseagreen", "#20B2AA"}, {"darkslategray", "#2F4F4F"}, {"teal", "#008080"}, {"darkcyan", "#008B8B"}, {"aqua", "#00FFFF"}, {"cyan", "#00FFFF"}, {"lightcyan", "#E0FFFF"}, {"darkturquoise", "#00CED1"}, {"turquoise", "#40E0D0"}, {"mediumturquoise", "#48D1CC"}, {"paleturquoise", "#AFEEEE"}, {"aquamarine", "#7FFFD4"}, {"powderblue", "#B0E0E6"}, {"cadetblue", "#5F9EA0"}, {"steelblue", "#4682B4"}, {"cornflowerblue", "#6495ED"}, {"deepskyblue", "#00BFFF"}, {"dodgerblue", "#1E90FF"}, {"lightblue", "#ADD8E6"}, {"skyblue", "#87CEEB"}, {"lightskyblue", "#87CEFA"}, {"midnightblue", "#191970"}, {"navyblue", "#000080"}, {"darkblue", "#00008B"}, {"mediumblue", "#0000CD"}, {"blue", "#0000FF"}, {"royalblue", "#4169E1"}, {"blueviolet", "#8A2BE2"}, {"indigo", "#4B0082"}, {"darkslateblue", "#483D8B"}, {"slateblue", "#6A5ACD"}, {"mediumslateblue", "#7B68EE"}, {"mediumpurple", "#9370DB"}, {"darkmagenta", "#8B008B"}, {"darkviolet", "#9400D3"}, {"darkorchid", "#9932CC"}, {"mediumorchid", "#BA55D3"}, {"purple", "#800080"}, {"thistle", "#D8BFD8"}, {"plum", "#DDA0DD"}, {"violet", "#EE82EE"}, {"magenta/fuchsia", "#FF00FF"}, {"orchid", "#DA70D6"}, {"mediumvioletred", "#C71585"}, {"palevioletred", "#DB7093"}, {"deeppink", "#FF1493"}, {"hotpink", "#FF69B4"}, {"lightpink", "#FFB6C1"}, {"pink", "#FFC0CB"}, {"antiquewhite", "#FAEBD7"}, {"beige", "#F5F5DC"}, {"bisque", "#FFE4C4"}, {"blanchedalmond", "#FFEBCD"}, {"wheat", "#F5DEB3"}, {"cornsilk", "#FFF8DC"}, {"lemonchiffon", "#FFFACD"}, {"lightgoldenrodyellow", "#FAFAD2"}, {"lightyellow", "#FFFFE0"}, {"saddlebrown", "#8B4513"}, {"sienna", "#A0522D"}, {"chocolate", "#D2691E"}, {"peru", "#CD853F"}, {"sandybrown", "#F4A460"}, {"burlywood", "#DEB887"}, {"tan", "#D2B48C"}, {"rosybrown", "#BC8F8F"}, {"moccasin", "#FFE4B5"}, {"navajowhite", "#FFDEAD"}, {"peachpuff", "#FFDAB9"}, {"mistyrose", "#FFE4E1"}, {"lavenderblush", "#FFF0F5"}, {"linen", "#FAF0E6"}, {"oldlace", "#FDF5E6"}, {"papayawhip", "#FFEFD5"}, {"seashell", "#FFF5EE"}, {"mintcream", "#F5FFFA"}, {"slategray", "#708090"}, {"lightslategray", "#778899"}, {"lightsteelblue", "#B0C4DE"}, {"lavender", "#E6E6FA"}, {"floralwhite", "#FFFAF0"}, {"aliceblue", "#F0F8FF"}, {"ghostwhite", "#F8F8FF"}, {"honeydew", "#F0FFF0"}, {"ivory", "#FFFFF0"}, {"azure", "#F0FFFF"}, {"snow", "#FFFAFA"}, {"black", "#000000"}, {"dimgray/dimgrey", "#696969"}, {"gray/grey", "#808080"}, {"darkgray/darkgrey", "#A9A9A9"}, {"silver", "#C0C0C0"}, {"lightgray/lightgrey", "#D3D3D3"}, {"gainsboro", "#DCDCDC"}, {"whitesmoke", "#F5F5F5"}, {"white", "#FFFFFF"}};
//        Map<String, String> colour = new HashMap<>();
//        for (int i = 0; i < 139; i++) {
//            for (int j = 0; j < 1; j++) {
//                colour.put(array[i][j], array[i][j + 1]);
//            }
//        }

    }

    public boolean checkEvents(String eventName) {
        Set<String> set = new HashSet<>();
        for (WebElement allEvent : allEvents) {
            set.add(allEvent.getText());
        }
        return set.contains(eventName);
    }

    public void eventHandler(String event, String date) {
        String[] array = date.split("/");
        int year = Integer.parseInt(array[2]);
        int month = Integer.parseInt(array[0]);
        int day = Integer.parseInt(array[1]);
        List<WebElement> list = Driver.get().findElements(By.xpath("//div[@data-bx-calendar-list-year='" + year + "']/div[@data-bx-calendar-list-month='" + month + "']/div[@data-bx-calendar-list-day='" + day + "']//span[@class='calendar-timeline-stream-content-event-name-link' and text()='" + event + "']"));
        if (list.size() > 0) {
            for (WebElement webElement : list) {
                webElement.click();
                delete.click();
                Driver.get().switchTo().alert().accept();
            }
        }
        List<WebElement> editedEvents = Driver.get().findElements(By.xpath("//div[@data-bx-calendar-list-year='" + year + "']/div[@data-bx-calendar-list-month='" + month + "']/div[@data-bx-calendar-list-day='" + day + "']//span[@class='calendar-timeline-stream-content-event-name-link' and text()='MY_TEST_EVENT']"));
        if (editedEvents.size() > 0) {
            for (WebElement editedEvent : editedEvents) {
                editedEvent.click();
                delete.click();
                Driver.get().switchTo().alert().accept();
            }
        }
    }

}