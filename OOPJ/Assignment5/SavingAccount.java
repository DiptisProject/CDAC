package Assignment5;
//question 1
class SavingAccount extends BankAccount {
    private final double withdrawalLimit; 

    public SavingAccount(double initialBalance, double withdrawalLimit) {
        super(initialBalance); 
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal failed: " + withdrawalLimit);
            return false;
        } else {
            return super.withdraw(amount); 
        }
    }
}
