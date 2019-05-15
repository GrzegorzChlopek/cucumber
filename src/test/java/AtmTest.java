import org.junit.Assert;
import org.junit.Test;

public class AtmTest {

  @Test
  public void payInTest() {
    AtmApp atm = new AtmApp();
    Assert.assertTrue(atm.showBalance() == 200);
    atm.cashWithdrawal(500);
    Assert.assertTrue(atm.showBalance() == 200);
  }

  @Test
  public void cashWithdrawalTest() {
    AtmApp atm = new AtmApp();
    Assert.assertTrue(atm.showBalance() == 200);
    atm.cashWithdrawal(300);
    Assert.assertTrue(atm.showBalance() == 200);
  }
}
