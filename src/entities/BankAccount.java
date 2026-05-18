package entities;

public class BankAccount {

    private int accountNumber;
    private String holderName;
    private double balance;

    // Construtor SEM depósito inicial
    public BankAccount(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    // Construtor COM depósito inicial (Sobrecarga)
    public BankAccount(int accountNumber, String holderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        deposit(initialDeposit); // Reutilizamos a regra de depósito aqui!
    }

    // Getters e Setters (Atenção: Não tem setAccountNumber nem setBalance!)
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName; // Apenas o nome pode ser alterado
    }

    public double getBalance() {
        return balance;
    }

    // Métodos de negócio
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        // Regra do banco: taxa de $5.00 para cada saque
        this.balance -= (amount + 5.00); 
    }

    // Método para imprimir a conta de forma bonita
    @Override
    public String toString() {
        return "Account " 
                + accountNumber 
                + ", Holder: " 
                + holderName 
                + ", Balance: $ " 
                + String.format("%.2f", balance);
    }
}