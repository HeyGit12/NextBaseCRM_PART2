package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AllIdeasPage extends BasePage{

    @FindBy(xpath = "//span[.='New idea']")
    public WebElement newIdeaIcon;

    @FindBy(xpath = "//a[@title='Like']")
    public WebElement likeBtn;

    @FindBy(xpath = "//a[@title='Unlike']")
    public WebElement unlikeBtn;

    @FindBy (xpath = "//a[.='date added']")
    public WebElement sortBynDateAdded;

    @FindBy (xpath = "//a[.='rating']")
    public WebElement sortByRating;

    @FindBy (css = ".idea-owner")
    public List<WebElement> sortedByDate;

    public WebElement likeOrUnlike(String s){
        return Driver.get().findElement(By.xpath("//a[@title='"+s+"']"));
    }

    public WebElement afterClickingIcon(String icon){
        return Driver.get().findElement(By.xpath("//a[@title='Stop liking this item'][contains(@class,'"+icon+"-active')]"));
    }

    public void sortByType(String sortingType){
        Driver.get().findElement(By.xpath("//a[.='"+sortingType+"']")).click();
    }

}
