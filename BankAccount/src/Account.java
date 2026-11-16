public class Account  {

private int balance;
private int transactionPin;


public void deposit(int amount){
    balance = balance + amount;
}

public void withdraw(int amount){
    balance = balance - amount;
}

public void insufficientFund(int amount){
    int accountbalance = 0;
    this.balance += accountbalance;

    if (amount > balance) accountbalance += balance;

    else balance = balance + amount;
}

public void negativeInput(int amount){
    int accountbalance = 0;
    this.balance += accountbalance;

    if (amount < 0) accountbalance += balance;

    else balance = balance + amount;
}

public void setTransactionPin(int pin){

    transactionPin = pin + transactionPin;
}
public void changeTransactionPin(int number){
    transactionPin = number;
}


public int getTransactionPin() {
    return transactionPin;
}

public int getBalance(){
    return balance;
}
}


