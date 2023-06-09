package bank;

import java.util.Random;

public class Account {
    private static Account[] Accounts = new Account[0];
    private String acc_no, acc_type;
    private long balance;
    private Random r = new Random();

    public Account(String type){
        this.acc_type = type;
        do {
            this.acc_no = r.nextInt(10000000, 100000000)+"";
        } while (acc_noExist(this.acc_no));
        addAccount(Accounts, this);
    }
    public String toString(){
        return this.acc_type+" Bank account";
    }
    public boolean withdraw(long amount){
        if(amount > balance){
            return false;
        } else{
            balance -= amount;
            return true;
        }
    }
    public boolean deposit(long amount){
        balance += amount;
        return true;
    }
    public long checkBalance(){
        return balance;
    }

    //getters
    public String getAccNo(){
        return this.acc_no;
    }
    public String getAccType(){
        return this.acc_type;
    }
    public static Account[] getAccounts(){
        return Accounts;
    }

    // Private Methods
    private void addAccount(Account[] array, Account line){
        Account[] temp = new Account[array.length+1];
        for(int i=0;i<array.length;i++){
            temp[i] = array[i];
        }
        temp[array.length] = line;
        Accounts = temp;
    }

    //Class Methods
    public static boolean acc_noExist(String num){
        for(int i=0;i<Accounts.length;i++){
            if(Accounts[i].getAccNo() == num) return true;
        }
        return false;
    }
}
