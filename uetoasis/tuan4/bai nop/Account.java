import java.util.ArrayList;

public class Account {
    private double balance = 0;
    private ArrayList<Transaction> transitionList = new ArrayList<>();

    /**
     * This is for deposit.
     */
    private void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            transitionList.add(new Transaction(Transaction.DEPOSIT, amount, balance));
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    /**
     * This is for withdraw.
     */
    private void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            this.balance -= amount;
            transitionList.add(new Transaction(Transaction.WITHDRAW, amount, balance));            
        }
    }

    /**
     * This is to add transaction.
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * This is to print transaction.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            Transaction cur = transitionList.get(i);
            if (cur.getOperation().equals(Transaction.DEPOSIT)) {
                System.out.println("Giao dich " + (i + 1) + ": " 
                                   + "Nap tien $" 
                                   + String.format("%.2f", cur.getAmount()) + ". " 
                                   + "So du luc nay: $" 
                                   + String.format("%.2f", cur.getBalance()) + ".");
                continue;
            }
            if (cur.getOperation().equals(Transaction.WITHDRAW)) {
                System.out.println("Giao dich " + (i + 1) + ": " 
                                   + "Rut tien $" 
                                   + String.format("%.2f", cur.getAmount()) + ". " 
                                   + "So du luc nay: $" 
                                   + String.format("%.2f", cur.getBalance()) + ".");
                continue;
            }
        }
    }
}
