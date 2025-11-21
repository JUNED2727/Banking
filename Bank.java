package Banking;

public class Bank {
    public static void main(String[] args) {
        System.out.println("🏦 Welcome to the Java OOP Bank Simulation!");

        // 1. Creating Objects (Instances of the Account class)
        Account aliceAccount = new Account(1001, "Alice Johnson");
        Account bobAccount = new Account(1002, "Bob Williams");
        
        // 

        // 2. Performing Operations on Alice's Account
        System.out.println("\n--- Operations on Alice's Account (1001) ---");
        aliceAccount.displayAccountInfo();
        
        // Deposit
        aliceAccount.deposit(500.00);
        
        // Withdraw (successful)
        aliceAccount.withdraw(150.50);
        
        // Withdraw (unsuccessful - Insufficient funds)
        aliceAccount.withdraw(1000.00);
        
        // Final Status
        aliceAccount.displayAccountInfo();


        // 3. Performing Operations on Bob's Account
        System.out.println("\n--- Operations on Bob's Account (1002) ---");
        bobAccount.displayAccountInfo();
        
        // Deposit
        bobAccount.deposit(2500.75);
        
        // Withdraw (successful)
        bobAccount.withdraw(500.00);
        
        // Final Status
        bobAccount.displayAccountInfo();

        
        // 4. Checking Bob's balance using a public getter method
        double bobFinalBalance = bobAccount.getBalance();
        System.out.println("\n--- Final Check ---");
        System.out.println("Bob's balance read via getter: $" + bobFinalBalance);
        }
        }
        
