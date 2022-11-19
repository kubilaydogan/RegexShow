import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

/*
        (.*)                String (don't use with "string")
        ([a-zA-Z]*)         Only String (integers not allowed)
        ([a-zA-Z0-9]*       Only String or Integers (no special characters)
        \"([a-zA-Z]*)\"     Only "String"
        \"([^\"]*)\"        "..."
        \"(.+)\"           "..."

        (|not )             empty or not
        (?:...|...)         You can see these options, but they are not parameters  ==> (?:validate|verify)
        (error|success|warning)     ==> parameter can take 3 values

        an?	matches a or an (the question mark makes the n optional)
        colou?r matches colour or color
 */

public class Regex_Strings {

    @When("^(?:I'm logged|I log) in as an? (.*)$")
    public void LogInAs(String role) {

    }

    @Given("^I need to be a \"([a-zA-Z]*)\"$")
    public void needAstring(String str) {

    }

    @Given("^you too need to be a ([a-zA-Z]*)$")
    public void needAstring2(String str) {

    }

    @Given("^I can be ([a-zA-Z0-9]*)$")
    public void needAstring3(String str) {

    }

    @Given("^I like (red|blue) colou?r$")
    public void likecolor(String color) {
        // colou?r matches colour or color
    }





//   \"([^\"]*)\"

}
