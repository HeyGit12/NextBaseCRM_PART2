package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(){
        PageFactory.initElements(Driver.get(), this);
    }

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
