public class Driver{
  public static void main(String[] args){
    //testing CheckingAccount
    try{
      System.out.println("Intial deposit of $100 under Mary:");
      BankAccount account = new CheckingAccount("Mary", 100.0);
      System.out.println(account.getName() + ": $" + account.getBalance());
      System.out.println();
      try{
        System.out.println("Depositing $50 under Mary:");
        account.deposit(50.0);
        System.out.println(account.getName() + ": $" + account.getBalance());
        System.out.println();
        try{
          System.out.println("Withdrawing $50 from Mary:");
          account.withdraw(50.0);
          System.out.println(account.getName() + ": $" + account.getBalance());
          System.out.println();
          try{
            System.out.println("Transferring $10 from Mary to Marco:");
            BankAccount marco = new CheckingAccount("Marco", 20.0);
            System.out.println(marco.getName() + "'s orignal balance: $" + marco.getBalance());
            account.transfer(10.0, marco);
            System.out.println(account.getName() + ": $" + account.getBalance());
            System.out.println(marco.getName() + ": $" + marco.getBalance());
            System.out.println();
          }
          catch(Exception e){
            System.out.println(e);
          }
        }
        catch(Exception e){
          System.out.println(e);
        }
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
    catch(Exception e){
      System.out.println(e);
    }


    //triggering Exceptions of CheckingAccount
    //triggering name exception
    try{
      BankAccount test = new CheckingAccount("Mo", 200.0);
    }
    catch(Exception e){
      System.out.println(e);
    }
    //triggering intial deposit
    try{
      BankAccount test = new CheckingAccount("Morel", -100.0);
    }
    catch(Exception e){
      System.out.println(e);
    }
    //triggering balance
    try{
      BankAccount test = new CheckingAccount("Morel", 200.0);
      test.withdraw(300.0);
    }
    catch(Exception e){
      System.out.println(e);
    }
    //triggering transfer
    try{
      BankAccount test = new CheckingAccount("Morel", 200.0);
      BankAccount marco = new CheckingAccount("Marco", 100.0);
      test.transfer(300.0, marco);
    }
    catch(Exception e){
      System.out.println(e);
    }


    //testing SavingsAccount
    try{
      SavingsAccount account = new SavingsAccount("Mary", 200.0, 2.5);
      System.out.println(account.getName() + ": " + account.getBalance());
      System.out.println();
      try{
        System.out.println("With added interest...");
        account.addInterest();
        System.out.println(account.getName() + ": " + account.getBalance());
        System.out.println();
        try{
          System.out.println("Counting withdrawals...");
          System.out.println("Withdraw $10 from Mary");
          account.withdraw(10.0);
          System.out.println("Withdraw $10 from Mary: " + account.getBalance());
          System.out.println("Withdrawal count: " + account.getWithdrawCount());
          System.out.println("Withdraw $10 from Mary: " + account.getBalance());
          System.out.println("Withdrawal count: " + account.getWithdrawCount());
        }
        catch(Exception e){
          System.out.println(e);
        }
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
    catch(Exception e){
      System.out.println(e);
    }
    System.out.println();
    //testing Exceptions of SavingsAccount
    //testing addInterest()
    try{
      SavingsAccount test = new SavingsAccount("Mary", 200.0, -1.0);
      test.addInterest();
    }
    catch(Exception e){
      System.out.println(e);
    }
    //testing withdraw() limit
    try{
      SavingsAccount test = new SavingsAccount("Mary", 200.0, 1.0);
      test.withdraw(10.0);
      test.withdraw(10.0);
      test.withdraw(10.0);
      test.withdraw(10.0);
      test.withdraw(10.0);
      test.withdraw(10.0);
      test.withdraw(10.0);
      System.out.println(test.getWithdrawCount());
    }
    catch(Exception e){
      System.out.println(e);
    }

    //testing SavingsAccountChild
    try{
      SavingsAccountChild child = new SavingsAccountChild("Mary", 200.0, 1.0, "Jisung");
      System.out.println("Child: " + child.getName());
      System.out.println("Parent: " + child.getParentName());
      System.out.println("Balance: " + child.getBalance());
      System.out.println();
      try{
        System.out.println("Withdrawing 10.0");
        child.withdraw(10.0, "Jisung");
        System.out.println("Balance: " + child.getBalance());
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
    catch(Exception e){
      System.out.println(e);
    }

    //testing Exceptions of SavingsAccountChild
    try{
      SavingsAccountChild child = new SavingsAccountChild("Mary", 200.0, 1.0, "Jisung");
      System.out.println("Child: " + child.getName());
      System.out.println("Parent: " + child.getParentName());
      System.out.println("Balance: " + child.getBalance());
      System.out.println();
      System.out.println("Withdrawing 10.0");
      child.withdraw(10.0, "Lee");
      System.out.println("Balance: " + child.getBalance());
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
