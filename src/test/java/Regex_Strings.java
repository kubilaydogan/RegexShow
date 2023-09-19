import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Regex_Strings {

    @When("^(?:I'm logged|I log) in as an? (.*)$")
    public void LogInAs(String role) {

    }

    @Then("^the value needs to be a \"([a-zA-Z]*)\"$")
    public void the_value_needs_to_be_a(String string) {

    }

    @Then("^the value has to be a ([a-zA-Z]*)$")
    public void the_value_has_to_be_a(String string) {

    }

    @Given("^I can be ([a-zA-Z0-9]*)$")
    public void needAstring3(String str) {

    }

    @Given("^I like (red|blue) colou?r$")
    public void likecolor(String color) {
        // colou?r matches colour or color
    }

}
