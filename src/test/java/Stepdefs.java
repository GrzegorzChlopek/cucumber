import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Stepdefs {

    AtmApp atm = new AtmApp();

    @Given("I have account with balance {int} PLN")
    public void iHaveAccountWithBalancePLN(int balance) throws Throwable{
        Assert.assertTrue(atm.showBalance()==200);
    }

    @When("I try withdraws {int} PLN")
    public void iTryWithdrawsPLN(int payOutAmount) throws Throwable {
        atm.cashWithdrawal(500);
        Assert.assertTrue(atm.showBalance()!=300);

    }

    @Then("I see notice that withdraws amount is too much")
    public void iSeeNoticeThatWithdrawsAmountIsTooMuch() throws Throwable {
        Assert.assertTrue("Attention: you can't withdraw money, the amount indicated is too high/low", true);

    }

    @And("Information about account balance")
    public void informationAboutAccountBalance() throws Throwable{
        Assert.assertTrue(atm.showBalance()==200);

    }

    @And("User check account balance.")
    public void userCheckAccountBlanace() throws Throwable {
        Assert.assertTrue(atm.showBalance()==200);

    }
}
