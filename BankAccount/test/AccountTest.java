import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {


    @Test
    public void testThatAccountIsZero(){
        Account checkBalance = new Account();
        assertEquals(0, checkBalance.getBalance());
    }

    @Test
    public void testThat5kIsDeposited() {
        Account accountDeposit = new Account();
        assertEquals(0, accountDeposit.getBalance());

        accountDeposit.setTransactionPin(1234);

        accountDeposit.deposit(5_000);
        assertEquals( 1234,accountDeposit.getTransactionPin());
        assertEquals(5_000, accountDeposit.getBalance());

    }
    @Test
    public void testThat2kCanBeWithdraw(){
        Account accountWithdraw = new Account();
        assertEquals(0, accountWithdraw.getBalance());

        accountWithdraw.setTransactionPin(2027);

        accountWithdraw.deposit(5_000);
        assertEquals( 2027,accountWithdraw.getTransactionPin());
        assertEquals(5_000, accountWithdraw.getBalance());

        accountWithdraw.withdraw(2_000);
        assertEquals( 2027,accountWithdraw.getTransactionPin());
        assertEquals(3_000, accountWithdraw.getBalance());

    }
    @Test
    public void testForInsufficientFunds(){
        Account accountWithdraw = new Account();
        assertEquals(0, accountWithdraw.getBalance());

        accountWithdraw.setTransactionPin(2008);

        accountWithdraw.deposit(5_000);
        assertEquals( 2008,accountWithdraw.getTransactionPin());
        assertEquals(5_000, accountWithdraw.getBalance());

        accountWithdraw.insufficientFund(9000);
        assertEquals( 2008,accountWithdraw.getTransactionPin());
        assertEquals(5000, accountWithdraw.getBalance());
    }
    @Test
    public void testThatNegativeInputedNumbers_DoesNotWork_ItReturnsTheBalance(){
        Account accountCheck = new Account();

        assertEquals(0, accountCheck.getBalance());

        accountCheck.deposit(5_000);
        accountCheck.setTransactionPin(2000);
        assertEquals(5_000, accountCheck.getBalance());

        accountCheck.negativeInput(-1000);
        assertEquals( 2000,accountCheck.getTransactionPin());
        assertEquals(5_000, accountCheck.getBalance());

    }
    @Test
    public void testThatTheTransactionPinIsCorrect(){
        Account accountCheck = new Account();

        assertEquals(0,accountCheck.getTransactionPin());

        accountCheck.setTransactionPin(2008);
        assertEquals( 2008,accountCheck.getTransactionPin());

    }
    @Test
    public void testThatMultpleTrasactionCanBeMadeAtOnce(){
        Account accountCheck = new Account();

        assertEquals(0,accountCheck.getBalance());

        accountCheck.deposit(10_000);
        assertEquals(10_000, accountCheck.getBalance());

        accountCheck.withdraw(2_000);
        assertEquals(8_000, accountCheck.getBalance());

        accountCheck.deposit(1_000);
        assertEquals(9000, accountCheck.getBalance());

        accountCheck.negativeInput(-8000);
        assertEquals(9_000, accountCheck.getBalance());

        accountCheck.withdraw(4_800);
        assertEquals(4_200, accountCheck.getBalance());
    }
    @Test
    public void testThatTrasactionPin_CanBeChanged(){
        Account pinCheck = new Account();

        pinCheck.setTransactionPin(2008);
        assertEquals(2008, pinCheck.getTransactionPin());

        pinCheck.changeTransactionPin(3478);
        assertEquals(3478, pinCheck.getTransactionPin());

    }



}

