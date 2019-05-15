public class AtmApp {

    private int balance = 200;

    public void payIn(int depositAmount) {
        if (depositAmount > 0) {
            balance = balance + depositAmount;
            System.out.println("You deposit: " + depositAmount + " PLN");
        }
    }

    public void cashWithdrawal(int payOutAmount) {
        if (payOutAmount <= balance && payOutAmount > 0) {
            balance = balance - payOutAmount;
            System.out.println("You pay out: " + (balance - payOutAmount) + " PLN");
        } else {
            System.out.println("Attention: you can't withdraw money, the amount indicated is too high/low");
        }
    }


    public int showBalance() {
        System.out.println("you have: " + balance + " PLN");
        return balance;
    }
}

