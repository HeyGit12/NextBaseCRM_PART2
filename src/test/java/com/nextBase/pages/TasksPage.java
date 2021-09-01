package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {

    public TasksPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "#tasks-buttonAdd")
    public WebElement newTaskButton;

    @FindBy(xpath = "//iframe[contains(@id,'iframe_')]")
    public WebElement thingsToDoFrame;

    @FindBy(xpath = "//input[@data-bx-id='task-edit-title']")
    public WebElement thingsToDo;

    @FindBy(css = ".bx-editor-iframe")
    public WebElement descriptionFrame;

    @FindBy(xpath = "//body")
    public WebElement description;

    @FindBy(css = "#bx-b-mention-task-form-bitrix_tasks_task_default_1")
    public WebElement addMention;
    @FindBy(xpath = "//div[contains(text(),'marketing1@cybertekschool.com')]")
    public WebElement mentionPerson;

    @FindBy(css = "#tasks-task-priority-cb")
    public WebElement highPriorityCB;

    @FindBy(xpath = "//span[@data-bx-id='dateplanmanager-deadline']")
    public WebElement deadlineManager;
    @FindBy(css = ".bx-calendar-top-month")
    public WebElement deadlineMonthPicker;
    @FindBy(css = "//span[contains(text(),'October')]")
    public WebElement deadlineMonth;
    @FindBy(xpath = "//a[@data-date='1634688000000']")
    public WebElement deadlineDay;
    @FindBy(xpath = "//input[@class='bx-calendar-form-input']")
    public WebElement deadlineHour;
    @FindBy(xpath = "//input[@class='bx-calendar-form-input'][2]")
    public WebElement deadlineMinute;
    @FindBy(css = ".bx-calendar-button-text")
    public WebElement deadlineSelectButton;

    @FindBy(css = "//a[contains(text(),'Add more')]")
    public WebElement addMoreResponsiblePerson;

    @FindBy(xpath = "//span[contains(text(),'Participants')]")
    public WebElement paticipants;
    @FindBy(xpath = "(//a[contains(text(),'Add')])[4]")
    public WebElement addParticipant;
    @FindBy(xpath = "//input[contains(@id,'name-selector-')]")
    public WebElement writeParticipants;

    @FindBy(xpath = "//span[contains(text(),'Observers')]")
    public WebElement observers;
    @FindBy(xpath = "(//a[contains(text(),'Add')])[6]")
    public WebElement addObservers;
    @FindBy(xpath = "(//input[contains(@id,'name-selector-')])[2]")
    public WebElement writeObservers;

    @FindBy(xpath = "//span[@data-target='checklist']")
    public WebElement checklist;
    @FindBy(xpath = "(//input[@placeholder='Things to do'])[2]")
    public WebElement writeChecklist;
    @FindBy(xpath = "//span[contains(text(),'add')]")
    public WebElement summitChecklist;

    @FindBy(css = ".task-additional-alt-more")
    public WebElement moreButton;

    @FindBy(xpath = "//input[@data-target='allow-time-tracking']")
    public WebElement timeTrackingCB;
    @FindBy(css = "#bx-component-scope-bitrix_tasks_widget_timeestimate_1>span>span>input")
    public WebElement timeTrackingHour;
    @FindBy(xpath = "(//div[@id='bx-component-scope-bitrix_tasks_widget_timeestimate_1']/span/span/input)[2]")
    public WebElement timeTrackingMinute;

    @FindBy(xpath = "//span[@data-bx-id='reminder-open-form']")
    public WebElement reminderModule;
    @FindBy(xpath = "//span[@title='Message will be sent on a specific date']")
    public WebElement selectReminderType;
    @FindBy(xpath = "//span[@title='Message will be sent in the specified time before deadline']/span[2]")
    public WebElement remiderType;
    @FindBy(css = ".task-options-reminder-link-mail")
    public WebElement reminderWithEmail;
    @FindBy(xpath = "//button/span/div")
    public WebElement reminderSummit;

    @FindBy(xpath = "//span[@class='task-item-set-empty-block-off']")
    public WebElement subtaskAdd;
    @FindBy(xpath = "(//div[contains(text(),'things to do [762]')])[3]")
    public WebElement subtask;
    @FindBy(xpath = "//div[@class='popup-window-buttons']/span[contains(text(),'Select')]")
    public WebElement subtaskSummit;

    @FindBy(xpath = "//div[@id='bx-component-scope-bitrix_tasks_widget_tag_selector_1']/span[2]/a/span[2]")
    public WebElement tagsAdd;
    @FindBy(xpath = "//div[@id='task-tags-content']/div/div/input")
    public WebElement tagsWrite;
    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-create']")
    public WebElement tagsSummit;

    @FindBy(xpath = "//span[@class='task-item-set-empty-block-on'][contains(text(),'+ Add more')]")
    public WebElement dependentTaskAdd;
    @FindBy(xpath = "(//div[@class='finder-box-item-text'][contains(text(),'things to do [765]')])[3]")
    public WebElement dependentTask;
    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement depententTaskSummit;

    @FindBy(xpath = "//button[@data-bx-id='task-edit-submit']")
    public WebElement saveChanges;

    @FindBy(css = ".menu-item-plus-icon")
    public WebElement plusIcon;

    @FindBy(css = "#tasks-popupMenuAdd")
    public WebElement newTaskArrowIcon;

    @FindBy(xpath = "//span[contains(text(),'All templates')]")
    public WebElement allTemplates;
    @FindBy(xpath = "//a[contains(text(),'Add')]")
    public WebElement add;
    @FindBy(css = ".webform-small-button-text")
    public WebElement createTaskTemplateButton;











}
