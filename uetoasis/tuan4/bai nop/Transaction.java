public class Transaction {
    private String operation;
    private double amount;
    private double balance;
    public static final String DEPOSIT = "deposit"; 
    public static final String WITHDRAW = "withdraw";

    /**
     * This is transaction initializer.
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /**
     * This is to get operation.
     */
    public String getOperation() {
        return operation;
    }

    /**
     * This is to set operation.
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * This is to get amount.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * This is to set amount.
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * This is to get balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * This is to set balance.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
