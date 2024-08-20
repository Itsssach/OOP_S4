package Ejercicio1;

public class SavingsAccount extends Account {
    private boolean active;

    public SavingsAccount(float balance, float interestRate) {
        super(balance, interestRate);
        active = (balance >= 10000);
    }

    @Override
    public void withdraw(float amount) {
        if (active) {
            super.withdraw(amount);
        }
    }

    @Override
    public void deposit(float amount) {
        if (active) {
            super.deposit(amount);
        }
    }

    @Override
    public void monthlyStatement() {
        if (numberOfWithdrawals > 4) {
            monthlyFee += (numberOfWithdrawals - 4) * 1000;
        }
        super.monthlyStatement();

        if (balance < 10000) {
            active = false;
        }
    }

    public void print() {
        System.out.println("Saldo = $ " + balance);
        System.out.println("Comisión mensual = $ " + monthlyFee);
        System.out.println("Número de transacciones = " + (numberOfDeposits + numberOfWithdrawals));
        System.out.println();
    }
}