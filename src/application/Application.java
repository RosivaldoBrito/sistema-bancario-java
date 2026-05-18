package application;

import entities.BankAccount;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        BankAccount account; // Declaramos a variável aqui fora
        
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        
        System.out.print("Enter account holder: ");
        sc.nextLine(); // Consumir a quebra de linha do nextInt
        String holder = sc.nextLine();
        
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            // Instancia a conta usando o construtor COM 3 parâmetros
            account = new BankAccount(number, holder, initialDeposit);
        } else {
            // Instancia a conta usando o construtor COM 2 parâmetros
            account = new BankAccount(number, holder);
        }
        
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);
        
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        
        System.out.println("Updated account data: ");
        System.out.println(account);
        
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        
        System.out.println("Updated account data: ");
        System.out.println(account);
        
        sc.close();
    }
}