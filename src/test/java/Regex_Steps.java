import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class Regex_Steps {

    @Then("^(?:validate|verify) (error|success|warning) \"(.+)\" in \"(.+)\" page$")
    public void verifyError(String type, String message, String page) {

        switch(type){
            case ("error"):

                break;
            case ("success"):

                break;
            case ("warning"):

                break;
        }
    }

    @Then("^\"(.+)\" (success|error|info) alert message should be displayed$")
    public void verifyToastMessage(String message, String messageType) {

    }

    @Given("^I have (|(\\d+) |a )(|not a )(flight|bus) (?:ticket|tickets) to \"([^\"]*)\"$")
    public void ride(Integer count, String flag, String vehicle, String destination) {

    }

    @When("^\"([^\"]*)\" creates a \"([^\"]*)\" using below mentioned values$")
    public void createsAUsingBelowMentionedValues(String userProfile, String record, DataTable dataTable) {

        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String companyName = data.get(0).get("Company Name");
        String accountStatus = data.get(0).get("Account Status");
        String companySize = data.get(0).get("Company Size");

    }

    @And("^(?:I|) click (?:a|an) (button|link|icon|tab) \"([^\"]*)\" on \"([^\"]*)\" (page|popup|widget|section|app|header|menu|alert)$")
    public void iClickALinkOnPage(String type, String label, String pageName, String pageType) {

        if(pageType.equalsIgnoreCase("alert")){
            if(label.equalsIgnoreCase("cancel")){
                // pages.xxxpage.switchToAlert().dismiss();
            }
        }else if(pageType.equalsIgnoreCase("Menu")){
            // pages.xxxpage.clickOptionOnMenu(buttonName, pageName);
        }else if(type.equalsIgnoreCase("link") || type.equalsIgnoreCase("tab") || type.equalsIgnoreCase("tabHeader")){
            // pages.xxxpage.clickLink(buttonName, pageName);
        }else if(type.equalsIgnoreCase("button") && (pageType.equalsIgnoreCase("popup"))){
            // pages.xxxpage.clickButtonOnPopUp(buttonName, pageName);
        }
        //...
    }

    @Then("^verify that the below mentioned (?:fields |columns |)should (|not )be displayed on \"(.+)\" page$")
    public void verifyPageComponentsInPage(String visibility, String page, DataTable components) throws Exception {   // <<==

        boolean flag = true;
        if(visibility.equalsIgnoreCase("not")){
            flag = false;
        }

//        List<String> columnNames = pages.homePage().retrieveData(flag, components);
//        for(String column : columnNames){
//            System.out.println(column);
//        }
//        pages.basePage().verifyPageComponents(flag, page, components);
    }

    // same step without regex

    @Then("verify that the below mentioned fields/columns should not/ be displayed on {string} page")
    public void verify_that_the_below_mentioned_columns_should_be_displayed_on_page(String visibility, String page, DataTable dataTable) {

        System.out.println("*********************");
        System.out.println(visibility);
        System.out.println(page);
        System.out.println(dataTable);
    }


    @And("^I click on the \"(.+)\" (.+)$")
    public void iClickOn(String name, String type) {
    }
//    @And("^I click on the \"(.+)\" (button|link|tab|icon)$")
//    public void iClickOn(String name, String type) {
//    }
}
