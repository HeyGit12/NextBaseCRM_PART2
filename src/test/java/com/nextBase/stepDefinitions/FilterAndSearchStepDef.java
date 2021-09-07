package com.nextBase.stepDefinitions;

import com.nextBase.pages.HomePage;
import com.nextBase.pages.LoginPage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import com.sun.org.apache.xerces.internal.xs.StringList;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterAndSearchStepDef {
    @Given("user lands on activity stream page with valid {string} and {string} as {string}")
    public void user_lands_on_activity_stream_page_with_valid_and_as(String username, String password, String user) {
        String url = ConfigurationReader.get("url");

        Driver.get().get(url);
        BrowserUtils.waitFor(1);
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

    }

    @When("User clicks filter and search box which stands below the quick navigate menu")
    public void user_clicks_filter_and_search_box_which_stands_below_the_quick_navigate_menu() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(3);
        //Driver.get().findElement(By.xpath("//*[@id=\"LIVEFEED_search\"]")).click();
       FilterAndSearch.FilterAndSearchBox.click();
        BrowserUtils.waitFor(2);



    }

    @When("user validates default filters as {string}")
    public void user_validates_default_filters_as(String filterList) {

      /* BrowserUtils.waitFor(1);
       HomePage FilterAndSearch = new HomePage();
       List<WebElement> elements=new ArrayList<>();
        BrowserUtils.waitFor(1);
        elements=Arrays.asList(FilterAndSearch.WorkflowsFilter,FilterAndSearch.AnnouncementsFilter,FilterAndSearch.MyActivityFilter,FilterAndSearch.FavoritesFilter,FilterAndSearch.WorkFilter);
        string= Arrays.asList("Workflows","Announcements","My Activity","Favorites","Work");
        BrowserUtils.waitFor(1);
        BrowserUtils.waitFor(1);
        for (int i=0; i<string.size(); i++){
            for (int b=0;b<elements.size();b++) {
                Assert.assertTrue(string.get(i).equals(elements.get(b).getText()));
            }
        }
        BrowserUtils.waitFor(1);*/
        BrowserUtils.waitFor(1);
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);

       Assert.assertTrue( filterList.contains(FilterAndSearch.AnnouncementsFilter.getText()));
        BrowserUtils.waitFor(1);

        Assert.assertTrue( filterList.contains(FilterAndSearch.FavoritesFilter.getText()));
        BrowserUtils.waitFor(1);

        Assert.assertTrue( filterList.contains(FilterAndSearch.WorkFilter.getText()));
        BrowserUtils.waitFor(1);

        Assert.assertTrue( filterList.contains(FilterAndSearch.WorkflowsFilter.getText()));
        BrowserUtils.waitFor(1);
        System.out.println(filterList.contains(FilterAndSearch.MyActivityFilter.getText()));


        Assert.assertTrue( filterList.contains(FilterAndSearch.MyActivityFilter.getText()));
        BrowserUtils.waitFor(1);



    }

    @When("user clicks Add field button which located above the Search button and below the To: dropdown menu.")
    public void user_clicks_Add_field_button_which_located_above_the_Search_button_and_below_the_To_dropdown_menu() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);
        Assert.assertTrue(FilterAndSearch.AddFieldBtn.isEnabled());
        FilterAndSearch.AddFieldBtn.click();



    }

    @When("user sees opened check boxes located under the add Add field button")
    public void user_sees_opened_check_boxes_located_under_the_add_Add_field_button() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);
        Assert.assertTrue(FilterAndSearch.TagFieldChkBox.isDisplayed());
    }


    @When("user clicks Favorites checkbox.")
    public void user_clicks_Favorites_checkbox() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);

        FilterAndSearch.FavoritesField.click();
    }

    @When("user sees Favorites dropdown menu existed under the To: dropdown menu")
    public void user_sees_Favorites_dropdown_menu_existed_under_the_To_dropdown_menu() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);
        FilterAndSearch.FavoritesDropdownField.isDisplayed();
    }


    @When("user validates Favorites field is not available in the fields section")
    public void user_validates_Favorites_field_is_not_available_in_the_fields_section() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);
        Assert.assertFalse(FilterAndSearch.FavoritesField.isSelected());
        BrowserUtils.waitFor(1);
    }



    @When("user clicks on Tag field that located above the Type field")
    public void user_clicks_on_Tag_field_that_located_above_the_Type_field() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);
        FilterAndSearch.TagFieldChkBox.click();
        BrowserUtils.waitFor(1);
        FilterAndSearch.TagFieldChkBox.click();


    }



    @When("user clicks This month tab from dropdown list")
    public void user_clicks_This_month_tab_from_dropdown_list() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);
        FilterAndSearch.DateDropdownMenu.click();

        BrowserUtils.waitFor(1);
        FilterAndSearch.ThismonthDrpDwn.click();
        BrowserUtils.waitFor(1);


    }

    @When("user validates This month is visible inside the Date field box")
    public void user_validates_This_month_is_visible_inside_the_Date_field_box() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);
        FilterAndSearch.ThismonthDrpDwn.isDisplayed();

    }

    @When("user clicks to the search button")
    public void user_clicks_to_the_search_button() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);
        FilterAndSearch.SearchButton.click();

    }

    @Then("user validates searched posts are existed")
    public void user_validates_searched_posts_are_existed() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);
        FilterAndSearch.AssertionSearch.isDisplayed();

    }

    @When("user clicks on Type field that located below the Date field")
    public void user_clicks_on_Type_field_that_located_below_the_Date_field() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);
        FilterAndSearch.TypeField.click();

    }

    @When("user clicks Posts and Announcements tabs under inside the Type dropdown menu")
    public void user_clicks_Posts_and_Announcements_tabs_under_inside_the_Type_dropdown_menu() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);
        FilterAndSearch.PostsDrpDwn.click();
        BrowserUtils.waitFor(1);
        FilterAndSearch.AnnouncementDrpDwn.click();



    }

    @When("user validates Posts and Announcements are visible inside the Type box")
    public void user_validates_Posts_and_Announcements_are_visible_inside_the_Type_box() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);
        FilterAndSearch.AnnouncementTypeVldtn.isDisplayed();
        BrowserUtils.waitFor(1);
        FilterAndSearch.PostTypeVldtn.isDisplayed();

    }


    @When("user clicks Save filter button that located under the Home filter")
    public void user_clicks_Save_filter_button_that_located_under_the_Home_filter() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);
        FilterAndSearch.SaveFilterBtn.click();
    }

    @When("user validates save button existed")
    public void user_validates_save_button_existed() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);
        FilterAndSearch.SaveBtn.isDisplayed();

    }

    @When("user types the new filter name")
    public void user_types_the_new_filter_name() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);
        FilterAndSearch.NewFilterName.sendKeys("NEWFILTER");

    }

    @When("user clicks on the save button that located at the bottom of the field's")
    public void user_clicks_on_the_save_button_that_located_at_the_bottom_of_the_field_s() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);
        FilterAndSearch.SaveBtn.click();
    }

    @Then("user validates new filter created")
    public void user_validates_new_filter_created() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);
        Assert.assertTrue(FilterAndSearch.NewFilterVldtn.isDisplayed());
        BrowserUtils.waitFor(1);


        BrowserUtils.waitFor(1);
        FilterAndSearch.SettingsIcon.click();
        BrowserUtils.waitFor(1);

        BrowserUtils.waitFor(1);
        FilterAndSearch.NewFilterCls.click();
        BrowserUtils.waitFor(1);




    }





    @When("user clicks Restore default fields button that located under the To: field")
    public void user_clicks_Restore_default_fields_button_that_located_under_the_To_field() {
        HomePage homePage = new HomePage();
        BrowserUtils.waitFor(2);
        homePage.reset.click();

    }

    @Then("user validates that fields are restored")
    public void user_validates_that_fields_are_restored() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);
        FilterAndSearch.DateDropdown.getText().contains("Any date");

    }

    @When("user clicks the settings icon that located right bottom of grey filters area")
    public void user_clicks_the_settings_icon_that_located_right_bottom_of_grey_filters_area() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);
        FilterAndSearch.SettingsIcon.click();
        BrowserUtils.waitFor(1);

    }

    @When("user validates that settings icons existed")
    public void user_validates_that_settings_icons_existed() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);
        Assert.assertTrue(FilterAndSearch.ResetDefaultBtn.isDisplayed());
    }

    @When("user clicks on the Reset to default button that stands left next of settings icon")
    public void user_clicks_on_the_Reset_to_default_button_that_stands_left_next_of_settings_icon() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);
        FilterAndSearch.ResetDefaultBtn.click();
        BrowserUtils.waitFor(2);
        FilterAndSearch.ContinueBtn.click();
    }


    @Then("user validates that filters are reseted")
    public void user_validates_that_filters_are_reseted() {
        HomePage FilterAndSearch = new HomePage();
        BrowserUtils.waitFor(1);
        FilterAndSearch.DateDropdown.getText().contains("Any date");


    }


    @Then("user deletes the new filter")
    public void user_deletes_the_new_filter() {

        HomePage FilterAndSearch = new HomePage();

        BrowserUtils.waitFor(1);
        FilterAndSearch.NewFilterCls.click();
        BrowserUtils.waitFor(1);


    }
    @When("user clicks on the Announcements filter")
    public void user_clicks_on_the_Announcements_filter() {
        HomePage FilterAndSearch = new HomePage();

        BrowserUtils.waitFor(1);
        FilterAndSearch.AnnouncementFilter.click();

    }




}
