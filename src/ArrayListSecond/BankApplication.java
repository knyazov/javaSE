package ArrayListSecond;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class BankApplication {
    String name;
    ArrayList<Account> accounts = new ArrayList<>();

    public BankApplication(String name, ArrayList<Account> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public void removeAccount(int i){
        accounts.remove(i);
    }

    public Account getMaxAccount() {
        double max_balance = accounts.get(0).getBalance();
        Account a1 = new Account();
        for (int i = 0; i < accounts.size(); i++) {
            if (max_balance<accounts.get(i).getBalance()){
                max_balance = accounts.get(0).getBalance();
               a1 = accounts.get(i);
            }
        }
        return a1;
    }

    public double getAverageBalance() {
        double total = 0;
        int counter =0;
        for (int i = 0; i < accounts.size(); i++) {
            total += accounts.get(i).getBalance();
            counter++;
        }
        return (total/counter);
    }
    public double getTotalBalance(){
        double total = 0;
        Account a1 = new Account();
        for (int i = 0; i < accounts.size(); i++) {
            total += accounts.get(i).getBalance();
        }
        return total;
    }
//    public String toString(){
//        return 0;
//
//    }

    public int totalAccount() {
        return accounts.size();
    }
    public String getBankData(){
        return name + " " + accounts;
    }
}
