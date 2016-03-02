package xyz.grega.mavenjenkinssample;

import junit.framework.Assert;
import org.junit.Test;

public class TestBankAccount {

    @Test
    public void testDebitWithSufficientFunds() {
        BankAccount ba = new BankAccount(10);
        double amount = ba.debit(5);
        Assert.assertEquals(5.0, amount);
    }

}
