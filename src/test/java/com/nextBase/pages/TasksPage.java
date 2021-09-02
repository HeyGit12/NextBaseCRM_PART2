package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage extends BasePage {

    public TasksPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "#tasks-buttonAdd")
    public WebElement newTaskButton;

    @FindBy(xpath = "//iframe[contains(@id,'iframe_')]")
    public WebElement thingsToDoFrame;

    @FindBy(xpath = "//input[@data-bx-id='task-edit-title']")
    public WebElement thingsToDo;
    @FindBy(css = ".js-id-task-template-edit-title")
    public WebElement thingsToDoTaskTemplate;


    @FindBy(css = ".bx-editor-iframe")
    public WebElement descriptionFrame;



    @FindBy(xpath = "//body")
    public WebElement description;
    @FindBy(css = "#task-detail-description")
    public WebElement descriptionCheck;

    @FindBy(css = "#bx-b-mention-task-form-bitrix_tasks_task_default_1")
    public WebElement addMention;
    @FindBy(xpath = "//div[contains(text(),'marketing1@cybertekschool.com')]")
    public WebElement mentionPerson;
    @FindBy(css = "#bx-b-mention-task-form-bitrix_tasks_task_template_default_1")
    public WebElement addMentionTaskTemplate;

    @FindBy(css = "#tasks-task-priority-cb")
    public WebElement highPriorityCB;

    @FindBy(xpath = "//span[@data-bx-id='dateplanmanager-deadline']")
    public WebElement deadlineManager;
    @FindBy(css = ".bx-calendar-top-month")
    public WebElement deadlineMonthPicker;
    @FindBy(xpath = "//span[contains(text(),'October')]")
    public WebElement deadlineMonth;
    @FindBy(xpath = "//a[@data-date='1634688000000']")
    public WebElement deadlineDay;
    @FindBy(xpath = "//input[@class='bx-calendar-form-input']")
    public WebElement deadlineHour;
    @FindBy(xpath = "//input[@class='bx-calendar-form-input'][2]")
    public WebElement deadlineMinute;
    @FindBy(css = ".bx-calendar-button-text")
    public WebElement deadlineSelectButton;
    @FindBy(css = ".js-id-dateplanmanager-display.task-options-inp")
    public WebElement deadlineIn;

    @FindBy(css = "//a[contains(text(),'Add more')]")
    public WebElement addMoreResponsiblePerson;
    @FindBy(css = ".inline.t-filled.t-max.tdp-mem-sel-is-max.tdp-mem-sel-is-min  .task-form-field-link")
    public  WebElement responsiblePersonChange;
    @FindBy(xpath = "//input[contains(@id,'name-selector')]")
    public WebElement resposiblePersonWrite;
    @FindBy(css = "#invite_email_user_button")
    public WebElement responsiblePersonOk;

    @FindBy(xpath = "//span[contains(text(),'Participants')]")
    public WebElement paticipants;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/form/div[3]/div[1]/div[3]/div/div/div/span[2]/a[2]")
    public WebElement addParticipant;
    @FindBy(xpath = "//input[contains(@id,'name-selector-')]")
    public WebElement writeParticipants;
    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div/div[9]/div[3]/div/div/div/a")
    public WebElement participantCheck;

    @FindBy(xpath = "//span[contains(text(),'Observers')]")
    public WebElement observers;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/form/div[3]/div[1]/div[4]/div/div/div/span[2]/a[2]")
    public WebElement addObservers;
    @FindBy(xpath = "(//input[contains(@id,'name-selector-')])[2]")
    public WebElement writeObservers;
    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div/div[10]/div[3]/div/div/div/a")
    public WebElement observersCheck;

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
    @FindBy(xpath = "//div[contains(text(),'02:30:00')]")
    public WebElement estimateTime;

    @FindBy(xpath = "//span[@data-bx-id='reminder-open-form']")
    public WebElement reminderModule;
    @FindBy(xpath = "//span[@title='Message will be sent on a specific date']")
    public WebElement selectReminderType;
    @FindBy(xpath = "//span[@title='Message will be sent in the specified time before deadline']/span[2]")
    public WebElement reminderType;
    @FindBy(css = ".task-options-reminder-link-mail")
    public WebElement reminderWithEmail;
    @FindBy(xpath = "//button/span/div")
    public WebElement reminderSummit;
    @FindBy(xpath = "//span[@data-bx-id='item-edit']")
    public WebElement reminderCheck;

    @FindBy(xpath = "//span[@class='task-item-set-empty-block-off']")
    public WebElement subtaskAdd;
    @FindBy(xpath = "(//div[contains(text(),'Test! [776]')])[3]")
    public WebElement subtask;
    @FindBy(xpath = "//div[@class='popup-window-buttons']/span[contains(text(),'Select')]")
    public WebElement subtaskSummit;
    @FindBy(css = ".ui-notification-balloon-action")
    public WebElement subTaskCheck;

    @FindBy(xpath = "//div[@id='bx-component-scope-bitrix_tasks_widget_tag_selector_1']/span[2]/a/span[2]")
    public WebElement tagsAdd;
    @FindBy(xpath = "//div[@id='task-tags-content']/div/div/input")
    public WebElement tagsWrite;
    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-create']")
    public WebElement tagsSummit;

    @FindBy(css = "#bx-component-scope-dependson-bitrix_tasks_task_default_1>.task-inline-selector-item>.feed-add-destination-link>.task-item-set-empty-block-off")
    public WebElement dependentTaskAdd;
    @FindBy(xpath = "(//div[@class='finder-box-item-text'][contains(text(),'Test [763]')])[3]")
    public WebElement dependentTask;
    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement depententTaskSummit;
    @FindBy(css = ".task-title-link")
    public WebElement dependentTaskCheck;

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
    @FindBy(css = "#pagetitle")
    public WebElement newTaskTemplatePageCheck;
    @FindBy(css = ".webform-small-button-text")
    public WebElement createTaskTemplateButton;

    @FindBy(xpath = "//a[contains(text(),'Edit')]")
    public WebElement edit;

    @FindBy(xpath = "//a[contains(@class,'task-title task-status-text')][text()='Test.hr.v.1']")
    public WebElement createdTask;

    @FindBy(xpath = "//a[contains(@class,'task-title task-status-text')][text()='Test.v.1']")
    public WebElement createdTaskMarketing;

    @FindBy(css = "#task-detail-description")
    public WebElement createdTaskDescription;

    @FindBy(xpath = "//span[@data-target='options']")
    public WebElement options;

    @FindBy(xpath = "//input[@data-target='allow-change-deadline']")
    public WebElement responsiblePChangeDeadline;

    @FindBy(css = "#pagetitle")
    public WebElement taskTemplateCheck;

    @FindBy(xpath = "//tr[8]/td[1]/span")
    public WebElement createdHrTaskCB;
    @FindBy(xpath = "//a[contains(text(),'Hello team')]")
    public WebElement createdHrTask;


    @FindBy(css = "#action_button_TASKS_GRID_ROLE_ID_4096_0_ADVANCED_N_control")
    public WebElement selectActionButton;
    @FindBy(xpath = "//span[@data-value='delete']")
    public WebElement delete;

    @FindBy(css = "#apply_button_control")
    public WebElement apply;

    @FindBy(xpath = "//span[contains(text(),'Continue')]")
    public WebElement Continue;











}
