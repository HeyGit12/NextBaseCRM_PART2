package com.nextBase.pages;
import com.nextBase.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    public void navigateToMenu(String menu){
        Driver.get().findElement(By.xpath("//span[@class='menu-item-link-text' and contains(text(), '" + menu + "')]")).click();
    }

    public void navigateToTab(String tab){
        Driver.get().findElement(By.xpath("//span[@class='main-buttons-item-text-title' and contains(text(), '"+tab+"')]")).click();
    }

    @FindBy(xpath = "(//span[.='Poll'])[2]")
    public WebElement pollTab;

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

    @FindBy(xpath = "//*[@id=\"LIVEFEED_search\"]")
    public WebElement FilterAndSearchBox;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[1]/div[2]/div[1]/span[2]/span[1]")
    public WebElement WorkFilter;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[1]/div[2]/div[2]/span[2]/span[1]")
    public WebElement FavoritesFilter;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[1]/div[2]/div[3]/span[2]/span[1]")
    public WebElement MyActivityFilter;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[1]/div[2]/div[5]/span[2]/span[1]")
    public WebElement AnnouncementsFilter;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[1]/div[2]/div[6]/span[2]/span[1]")
    public WebElement WorkflowsFilter;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_fields_popup\"]/div/div[5]/div")
    public WebElement FavoritesField;

    @FindBy(xpath = " //*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[2]/div[2]/span[1]")
    public WebElement AddFieldBtn;
    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[2]/div[1]/div[5]/span[1]")
    public WebElement FavoritesDropdownField;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_fields_popup\"]/div/div[6]/div")
    public WebElement TagFieldChkBox;
    @FindBy(xpath = "//div[@data-name='DATE_CREATE_datesel']")
    public WebElement DateDropdownMenu;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[3]/div[2]/div/button")
    public WebElement SearchButton;

    @FindBy(xpath = "//*[@id=\"LIVEFEED_search_container\"]/div[1]/div[1]")
    public WebElement AssertionSearch;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[2]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]")
    public WebElement PostTypeVldtn;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[2]/div[1]/div[2]/div[1]/span[1]/span[2]/span[1]")
    public WebElement AnnouncementTypeVldtn;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[3]/div[1]/span[1]")
    public WebElement SaveFilterBtn;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[3]/div[3]/div/span[1]")
    public WebElement SaveBtn;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[1]/div[2]/div[8]/input")
    public WebElement NewFilterName;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[1]/div[2]/div[8]/span[2]/span[1]")
    public WebElement NewFilterVldtn;

    @FindBy(css = ".main-ui-filter-field-restore-items")
    public WebElement reset;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[2]/div[1]/div[2]/div[1]")
    public WebElement TypeField;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[3]/div[1]/span[2]")
    public WebElement SettingsIcon;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[1]/div[2]/div[2]/span[4]")
    public WebElement FavoritesFilterCloseBtn;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[3]/div[1]/span[3]/span")
    public WebElement ResetDefaultBtn;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[1]/div[2]/div[9]/span[2]/span[1]")
    public WebElement NewFilter;

    @FindBy(xpath = "//*[@id=\"LIVEFEED-confirm-dialog\"]/div[2]/span[1]")
    public WebElement ContinueBtn;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[1]/div[2]/div[8]/span[4]")
    public WebElement NewFilterCls;

    @FindBy(xpath = "//div[@class='main-ui-select-inner-item-element' and text()='This month']")
    public WebElement ThismonthDrpDwn;

    @FindBy(xpath = "//*[@id=\"popup-window-content-main-filter-control-popup\"]/div/div[1]/div")
    public WebElement PostsDrpDwn;

    @FindBy(xpath = "//*[@id=\"popup-window-content-main-filter-control-popup\"]/div/div[2]/div")
    public WebElement AnnouncementDrpDwn;

    @FindBy(xpath = "//*[@id=\"popup-window-content-main-filter-control-popup\"]/div/div[4]/div")
    public WebElement ThisWeekDrpDwn;

    @FindBy(xpath = "//*[@id=\"popup-window-content-main-filter-control-popup\"]/div/div[4]/div")
    public WebElement PollsDrpDwn;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[3]")
    public WebElement SpaceClck;

    @FindBy(xpath = "//div[@class='main-ui-select-inner-item-element' and text()='Yesterday']")
    public WebElement anyDate;

    @FindBy(css = ".main-ui-select-name")
    public WebElement inputBox;

    @FindBy(css = "#LIVEFEED_search")
    public WebElement filterAndSearch;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[1]/div[2]/div[6]/span[2]/span[1]")
    public WebElement AnnouncementFilter;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[2]/div[1]/div[1]/div[1]/div/span[1]")
    public WebElement DateDropdown;
}
