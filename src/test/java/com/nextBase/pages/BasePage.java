package com.nextBase.pages;

import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@title='Drive']")
    public WebElement Drive;

    @FindBy(xpath = "//span [contains(text(),'Tasks')]")
    public WebElement tasksTab;
    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreBtn;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[3]")
    public WebElement announcementBtn;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadBtn;

    @FindBy(name = "bxu_files[]")
    public WebElement uploadBtn2;

    @FindBy(xpath = "//span[@class='f-wrap']")
    public WebElement uploadedFilesPanel;

    @FindBy(id = "bx-destination-tag")
    public WebElement addMoreBtn;

    @FindBy(xpath = "//a[@class=\"bx-finder-box-tab bx-lm-tab-department\"]")
    public WebElement listBtn;

    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[2]")
    public WebElement firstOfList;

    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[4]")
    public WebElement secondOfList;

    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[5]")
    public WebElement thirdOfList;

    @FindBy(xpath = "//*[@id=\"feed-add-post-destination-item\"]/span[2]/span[1]")
    public WebElement getFirstOfList;

    @FindBy(xpath = "//*[@id=\"feed-add-post-destination-item\"]/span[3]/span[1]")
    public WebElement getSecondOfList;

    @FindBy(xpath = "//*[@id=\"feed-add-post-destination-item\"]/span[4]/span[1]")
    public WebElement getThirdOfList;

    @FindBy(xpath = "//*[@id=\"bx-b-link-blogPostForm\"]/span/i")
    public WebElement linkAttachment;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement linkURLM;

    @FindBy(xpath = "//input[@id='undefined']")
    public WebElement saveBtn;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-video']/i[1]")
    public WebElement videoBtn;

    @FindBy(xpath = "//input[@id='video_idPostFormLHE_blogPostForm-source']")
    public WebElement videoURL;

    @FindBy(xpath = "//span[@class='bxhtmled-video-error']")
    public WebElement errorMessage;

    @FindBy(xpath = "//*[@id=\"bx-b-quote-blogPostForm\"]/span/i")
    public WebElement quoteBtn;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement quoteBox;

    @FindBy(xpath = "//*[@id=\"bx-b-mention-blogPostForm\"]")
    public WebElement mentionBtn;

    @FindBy(xpath = "//*[@id=\"blog-submit-button-save\"]")
    public WebElement sendBtn;

    @FindBy(xpath = "//*[@id=\"blg-post-436\"]")
    public WebElement iHaveReadThis;

    public void navigateToModule(String tab, String module) {
        String tabLocator = "//a[@title='" + tab + "']";
        String moduleLocator = "(//span[.='" + module + "'])[1]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
            new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath(moduleLocator)));
            Driver.get().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)), 5);
        }
    }

    //to click Themes or Print, You can use this method
    public void goByLinkText(String text){
        Driver.get().findElement(By.xpath("//span[.='"+text+"']")).click();
    }

}