package com.nextBase.pages;
import com.nextBase.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    @FindBy(xpath = "(//span[.='Poll'])[2]")
    public WebElement pollTab;

    public HomePage(){
        PageFactory.initElements(Driver.get(),this);
    }
    public void navigateToMenu(String menu){
        Driver.get().findElement(By.xpath("//span[@class='menu-item-link-text' and contains(text(), '" + menu + "')]")).click();
    }
    public void navigateToTab(String tab){
        Driver.get().findElement(By.xpath("//span[@class='main-buttons-item-text-title' and contains(text(), '"+tab+"')]")).click();
    }

    @FindBy(xpath = "//*[@id=\"user-name\"]")
    public WebElement profilName;

    @FindBy(xpath = "//*[@id=\"microoPostFormLHE_blogPostForm_inner\"]")
    public WebElement messageBox;

    @FindBy(xpath = "//*[@id=\"bx-b-uploadfile-blogPostForm\"]")
    public WebElement fileUpload;

    @FindBy(xpath = "//*[@id=\"bx-destination-tag\"]")
    public WebElement addMore;

    @FindBy(xpath = "//a[@rel=\"UA\"]")
    public WebElement allEmployees;

    @FindBy(xpath = "//a[@class=\"bx-finder-box-tab bx-lm-tab-department\"]")
    public WebElement employeesDepartment;

    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[1]/div[1]")
    public WebElement marketing;

    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[2]/div[1]")
    public WebElement helpDesk;

    @FindBy(xpath = "//*[@id=\"feed-add-post-destination-container\"]")
    public WebElement toBox;

    @FindBy(xpath = "//*[@id=\"bx-b-link-blogPostForm\"]/span")
    public WebElement linkIcon;

    @FindBy(xpath = "//*[@id=\"linkidPostFormLHE_blogPostForm-href\"]")
    public WebElement link;

    @FindBy(xpath = "//*[@id=\"linkidPostFormLHE_blogPostForm-text\"]")
    public WebElement text;

    @FindBy(xpath = "//*[@id=\"undefined\"]")
    public WebElement linkSave;

    @FindBy(xpath = "//*[@id=\"bx-b-quote-blogPostForm\"]/span")
    public WebElement quoteIcon;

    @FindBy(xpath = "//*[@id=\"bx-b-mention-blogPostForm\"]")
    public WebElement mention;

    @FindBy(xpath = "//*[@id=\"blog-submit-button-save\"]")
    public WebElement send;

    @FindBy(xpath= "//*[@class='feed-post-block feed-post-block-short feed-post-block-separator'][1]")
    public WebElement sender;

    @FindBy(css = "span[class='feed-post-more-text']")
    public WebElement more;

    @FindBy(xpath = "//span[text()='Delete']")
    public WebElement delete;

    @FindBy(xpath = "//*[@id=\"bx-b-video-blogPostForm\"]/span")
    public WebElement videoInsertIcon;

    @FindBy(xpath = "//*[@id=\"video_idPostFormLHE_blogPostForm-source\"]")
    public WebElement videoUrlBox;

    @FindBy(xpath = "//*[@id=\"undefined\"]")
    public WebElement urlSaveIcon;

    @FindBy(xpath = "//*[@id=\"bx-admin-prefix\"]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td/span")
    public WebElement videoError;















}
