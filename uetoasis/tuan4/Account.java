package uetoasis.tuan4;

import java.util.ArrayList;

public class Account {
    private double balance = 0;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    private void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            transactions.add(new Transaction(Transaction.DEPOSIT, amount, balance));
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    private void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            this.balance -= amount;
            transactions.add(new Transaction(Transaction.WITHDRAW, amount, balance));            
        }
    } 

    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    public void printTransaction() {
        for (int i = 0; i < transactions.size(); i++) {
            Transaction cur = transactions.get(i);
            if (cur.getOperation().equals(Transaction.DEPOSIT)) {
                System.out.println("Giao dich " + (i + 1) + ": " +
                                   "Nap tien $" + String.format("%.2f", cur.getAmount()) + ". " +
                                   "So du luc nay: $" + String.format("%.2f", cur.getBalance()));
                continue;
            }
            if (cur.getOperation().equals(Transaction.WITHDRAW)) {
                System.out.println("Giao dich " + (i + 1) + ": " +
                                   "Rut tien $" + String.format("%.2f", cur.getAmount()) + ". " +
                                   "So du luc nay: $" + String.format("%.2f", cur.getBalance()));
                continue;
            }
        }
    }
}
