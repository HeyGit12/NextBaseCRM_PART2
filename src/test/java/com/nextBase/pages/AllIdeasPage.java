package com.nextBase.pages;

import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllIdeasPage extends BasePage {

    @FindBy(xpath = "//span[.='New idea']")
    public WebElement newIdeaIcon;

    //sort by date added
    @FindBy(css = ".idea-owner")
    public List<WebElement> sortedByDate;
    //sort by rating
    @FindBy(xpath = "//span[contains(@id,'rating-vote-BLOG')][contains(@class,'rating-vote-result')]")
    public List<WebElement> sortedByRating;



    //like and unlike icons attributes are dynamic so that two methods created.
    //likeOrUnlike AND afterClickingIcon

    //according to the user input like or unlike the idea
    public WebElement likeOrUnlike(String s) {
        return Driver.get().findElement(By.xpath("//a[@title='" + s + "']"));
    }

    //after clicking the plus or minus sign. Attributes are changing, to assert use this method
    public WebElement afterClickingIcon(String icon) {
        return Driver.get().findElement(By.xpath("//a[@title='Stop liking this item'][contains(@class,'" + icon + "-active')]"));
    }

    //according to the user input, method locate sorting types(date added or rating) and click
    public void sortByType(String sortingType) {
        Driver.get().findElement(By.xpath("//a[.='" + sortingType + "']")).click();
    }

    //this method takes the rating point and convserts to the Double data type as a list
    public List<Double> compareTheRating() {

        List<WebElement> ratingElements = Driver.get().findElements(By.xpath("//span[contains(@id,'rating-vote-BLOG')][contains(@class,'rating-vote-result')]"));
        List<Double> valueOfRating = new ArrayList<>();

        for (WebElement ratingElement : ratingElements) {
            valueOfRating.add(Double.parseDouble(ratingElement.getText()));
        }

        return valueOfRating;
    }

    public List<String> dateAdded() {
        List<WebElement> elements = Driver.get().findElements(By.cssSelector(".idea-owner"));
        List<String> textOfElements = new ArrayList<>();
        List<String> dates = new ArrayList<>();

        for (WebElement element : elements) {
            textOfElements.add(element.getText());
        }
        //System.out.println(textOfElements.get(2));
        for (int i = 1; i < textOfElements.size(); i++) {
            String[] s = textOfElements.get(i).replace(",", "").split("Suggested by ");
            //System.out.println(s[1]);
            s = s[1].split(" ");
            switch (s[1]) {
                case "January":
                    s[1] = "01";
                    break;
                case "February":
                    s[1] = "02";
                    break;
                case "March":
                    s[1] = "03";
                    break;
                case "April":
                    s[1] = "04";
                    break;
                case "May":
                    s[1] = "05";
                    break;
                case "June":
                    s[1] = "06";
                    break;
                case "July":
                    s[1] = "07";
                    break;
                case "August":
                    s[1] = "08";
                    break;
                case "September":
                    s[1] = "09";
                    break;
                case "October":
                    s[1] = "10";
                    break;
                case "November":
                    s[1] = "11";
                    break;
                case "December":
                    s[1] = "12";
                    break;
            }
            dates.add(s[3] + "-" + s[1] + "-" + s[2] + " " + s[4] + ":00");
        }
        return dates;
    }


}
