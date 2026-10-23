import java.util.ArrayList;


public class BankAccount {
    
    //declare variables
    private String accountNumber;
    private String owner;
    private double balance;
    private ArrayList<String>transactions;

    public BankAccount(String accountNumber, String owner, double initialBalance){
        this.accountNumber=accountNumber;
        this.owner=owner;
        this.balance=0;
        this.transactions=new ArrayList<>();

        if(initialBalance<0){
            throw new IllegalArgumentException(
                "Initial balance cannot be negative."
            );
        }

        this.balance=initialBalance;
        transactions.add("Account created with RM"+initialBalance);
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getOwner(){
        return owner;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Invalid deposit amount.");
            return;
        }

        balance+=amount;
        transactions.add("Deposited RM"+amount);
        System.out.println("Deposit successful.");
    }

    public boolean withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalid withdrawal amount.");
            return false;
        }

        if(amount>balance){
            System.out.println("Insufficient balance.");
            return false;
        }

        balance-=amount;
        transactions.add("Withdrew RM"+amount);
        System.out.println("Withdrawal successful.");
        return true;
    }

    public vooid recordTransfer(double amount,String toAccount){
        transactions.add(
            "Transferred RM"+amount+" to "+toAccount
        );
    }

    public void displayInfo(){
        System.out.println("\n--Transaction History--");

        for(String transaction:transactions){
            System.out.println(transaction);
        }
    }
}
