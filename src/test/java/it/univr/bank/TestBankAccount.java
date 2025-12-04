package it.univr.bank;

import org.junit.Assert;
import org.junit.Test;

public class TestBankAccount {
    //TODO: fill this class with test methods

    @Test
    public void testNewBankAccount(){
        BankAccount bankAccount = new BankAccount();
        Assert.assertEquals(0, bankAccount.lastMove);
    }
}
