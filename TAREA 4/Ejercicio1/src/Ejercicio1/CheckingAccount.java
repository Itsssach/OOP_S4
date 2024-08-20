package Ejercicio1;

public class CheckingAccount extends Account {
    float overdraft;

    public CheckingAccount(float balance, float interestRate) {
        super(balance, interestRate);
        overdraft = 0;
    }

    @Override
    public void withdraw(float amount) {
        float tempBalance = balance - amount;
        if (tempBalance < 0) {
            overdraft -= tempBalance;
            balance = 0;
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public void deposit(float amount) {
        float remainder = overdraft - amount;
        if (overdraft > 0) {
            if (remainder > 0) {
                overdraft = 0;
                balance = remainder;
            } else {
                overdraft = -remainder;
                balance = 0;
            }
        } else {
            super.deposit(amount);
        }
    }

    @Override
    public void monthlyStatement() {
        super.monthlyStatement();
    }

    public void print() {
        System.out.println("Saldo = $ " + balance);
        System.out.println("Cargo mensual = $ " + monthlyFee);
        System.out.println("Número de transacciones = " + (numberOfDeposits + numberOfWithdrawals));
        System.out.println("Valor de sobregiro = $" + overdraft);
        System.out.println();
    }
}

