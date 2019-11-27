package org.jalasoft;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * BankTests
 */
public class BankTests {

    @Test
    public void createNewAccount() {
        //Arrange
        Bank bank = new Bank();
        
        //Act
        int accountZero = bank.newAccount(true);
        int accountOne = bank.newAccount(true);
        int accountTwo = bank.newAccount(true);
        int accountThree = bank.newAccount(true);
        
        //Assert
        assertEquals(0, accountZero);
        assertEquals(1, accountOne);
        assertEquals(2, accountTwo);
        assertEquals(3, accountThree);
    }

    @Test
    public void getAccountGivenTheAccountNumber() {
        //Arrange
        Bank bank = new Bank();
        int accountZero = bank.newAccount(true);
        
        //Act
        BankAccount accountOne = bank.getBankAccount(accountZero);
        
        //Assert
        assertEquals(accountZero, accountOne.getAccountNumber());
    }
}