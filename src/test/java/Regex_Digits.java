import io.cucumber.java.en.Given;
import jdk.swing.interop.SwingInterOpUtils;

public class Regex_Digits {

    @Given("^I have (\\d+) cookies$")
    public void iHaveCookies(int cookiesCount) {
        //...
    }

    @Given("^I have \"(\\d+)\" cookies$")
    public void iHaveCookies2(int cookiesCount) {
        //...
    }

    @Given("^status code is ([0-9]{3}+)$")
    public void statusCode(int cukeCount) {
        // Only 3 digits allowed
    }

    @Given("^the deadline is in \"(\\d+)\" weeks (\\d+) days$")
    public void days(Integer n, Integer m) {
        //...
    }

    @Given("^I have (|(\\d+) |a )(|not a )toys?$")
    public void ride(Integer count, String flag) {

        if (count == null) {
            count=0;
        }
        if (flag.contentEquals("not a"))
            flag = "false";
        else
            flag = "true";

        System.out.println("Count: " + count + " flag: " + flag);
    }

}
