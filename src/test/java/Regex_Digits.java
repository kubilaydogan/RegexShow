import io.cucumber.java.en.Given;

public class Regex_Digits {

    @Given("^I have (\\d+) cukes$")
    public void IHaveNCukes(int cukeCount) {

    }

    @Given("^I have \"(\\d+)\" cukes$")
    public void IHaveNCukes2(int cukeCount) {

    }

    @Given("^status code is ([0-9]{3}+)$")
    public void statusCode(int cukeCount) {
        // ONLY 3 DIGITS
    }

    @Given("^The deadline is in \"(\\d+)\" weeks (\\d+) days$")
    public void days(Integer n, Integer m) {

    }

    @Given("^I have (|(\\d+) |a )(|not a )toys?$")
    public void ride(Integer count, String flag) {
        System.out.println("Count: " + count + " flag: " + flag);

        if (count == null) {
            count=0;
        }
        if (flag.contentEquals("not a"))
            flag = "false";
        else
            flag = "true";
    }

}
