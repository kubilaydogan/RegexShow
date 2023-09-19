import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Regex_Digits {

    @Given("^company has (\\d+) employees?$")
    public void company_has_employees(int count) {

    }

    @Given("^company has \"(\\d+)\" employees$")
    public void company_has_employees(String count) {

    }

    @Then("^status code is ([0-9]{3}+)$")
    public void statusCode(int statusCode) {
        // Only 3 digits allowed
    }

    @Given("^the deadline is in \"(\\d+)\" weeks (\\d+) days$")
    public void days(int n, int m) {

    }

    @Then("^verify table has (|(\\d+))(|a|not a) rows?$")
    public void verify_table_has_rows(Integer count, String flag) {

        if (flag.contentEquals("not a")) {
            count = 0;
        } else if (flag.contentEquals("a")) {
            count = 1;
        }
        System.out.println("Count: " + count);
    }

}

