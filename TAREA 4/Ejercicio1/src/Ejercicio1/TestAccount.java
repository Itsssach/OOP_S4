package Ejercicio1;

import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Cuenta de ahorros");
            System.out.print("Ingrese el saldo inicial: $");
            float initialBalanceSavings = input.nextFloat();
            System.out.print("Ingrese la tasa de interés: ");
            float interestRateSavings = input.nextFloat();
            SavingsAccount account1 = new SavingsAccount(initialBalanceSavings, interestRateSavings);
            System.out.print("Ingrese la cantidad a consignar: $");
            float depositAmount = input.nextFloat();
            account1.deposit(depositAmount);
            System.out.print("Ingrese la cantidad a retirar: $");
            float withdrawAmount = input.nextFloat();
            account1.withdraw(withdrawAmount);
            account1.monthlyStatement();
            account1.print();
        } finally {
            input.close(); // Cerramos el Scanner aquí
        }
    }
}


