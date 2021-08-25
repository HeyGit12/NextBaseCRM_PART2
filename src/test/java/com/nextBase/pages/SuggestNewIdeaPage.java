package com.nextBase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuggestNewIdeaPage extends BasePage{

    @FindBy(css = "#POST_TITLE")
    public WebElement titleInput;

    //description input inside the iframe, because of that if you want to use this input, you must switch the frame
    @FindBy(css = ".vsc-initialized")
    public WebElement descriptionInput;

    @FindBy(xpath = "//select[@name='UF_CATEGORY_CODE']")
    public WebElement selectCategory;

    @FindBy(xpath = "//span[.='Suggest New Idea!'][@class='t']")
    public WebElement suggestNewIdeaBtn;

}

