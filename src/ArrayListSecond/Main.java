package ArrayListSecond;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Account a1 = new Account(1, "a", "b", 500000);
        Account a2 = new Account(2, "c", "d", 800000);
        Account a3 = new Account(3, "e", "f", 400000);
        Account a4 = new Account(4, "g", "h", 300000);
        Account a5 = new Account(5, "i", "k", 2500000);
        Account a6 = new Account(6, "j", "m", 200000);
        Account a7 = new Account(7, "l", "o", 800000);
        Account a8 = new Account(8, "n", "q", 55585000);
        Account a9 = new Account(9, "p", "s", 8589500);
        Account a10 = new Account(10, "r", "u", 458050);

        Account a11 = new Account(1, "aa", "bb", 500000);
        Account a12 = new Account(2, "cc", "dd", 800000);
        Account a13 = new Account(3, "ee", "ff", 400000);
        Account a14 = new Account(4, "gg", "hh", 300000);
        Account a15 = new Account(5, "ii", "kk", 2500000);
        Account a16 = new Account(6, "jj", "mm", 200000);
        Account a17 = new Account(7, "ll", "oo", 800000);
        Account a18 = new Account(8, "nn", "qq", 55585000);
        Account a19 = new Account(9, "pp", "ss", 8589500);
        Account a20 = new Account(10, "rr", "uu", 458050);

        Account a21 = new Account(1, "aera", "bbb", 500000);
        Account a22 = new Account(2, "cr", "dfdd", 800000);
        Account a23 = new Account(3, "ejy", "fdrf", 400000);
        Account a24 = new Account(4, "gyt", "hhtt", 300000);
        Account a25 = new Account(5, "iwq", "kggg", 2500000);
        Account a26 = new Account(6, "jrge", "mrth", 200000);
        Account a27 = new Account(7, "lrge", "orgerg", 800000);
        Account a28 = new Account(8, "nreer", "qggr", 55585000);
        Account a29 = new Account(9, "phrerh", "sjj", 8589500);
        Account a30 = new Account(10, "rh", "u6h", 458050);

        ArrayList<Account> arr_Kaspi = new ArrayList<>();
        arr_Kaspi.add(a1);
        arr_Kaspi.add(a2);
        arr_Kaspi.add(a3);
        arr_Kaspi.add(a4);
        arr_Kaspi.add(a5);
        arr_Kaspi.add(a6);
        arr_Kaspi.add(a7);
        arr_Kaspi.add(a8);
        arr_Kaspi.add(a9);
        arr_Kaspi.add(a10);

        ArrayList<Account> arr_bcc = new ArrayList<>();
        arr_bcc.add(a11);
        arr_bcc.add(a12);
        arr_bcc.add(a13);
        arr_bcc.add(a14);
        arr_bcc.add(a15);
        arr_bcc.add(a16);
        arr_bcc.add(a17);
        arr_bcc.add(a18);
        arr_bcc.add(a19);
        arr_bcc.add(a20);

        ArrayList<Account> arr_sber = new ArrayList<>();
        arr_sber.add(a21);
        arr_sber.add(a22);
        arr_sber.add(a23);
        arr_sber.add(a24);
        arr_sber.add(a25);
        arr_sber.add(a26);
        arr_sber.add(a27);
        arr_sber.add(a28);
        arr_sber.add(a29);
        arr_sber.add(a30);

        BankApplication kaspi = new BankApplication("Kaspi", arr_Kaspi);
        BankApplication bcc = new BankApplication("BCC", arr_bcc);
        BankApplication sberBank = new BankApplication("SberBank", arr_sber);

        ArrayList<BankApplication> allBanks = new ArrayList<>();
        allBanks.add(kaspi);
        allBanks.add(bcc);
        allBanks.add(sberBank);

        System.out.println("Kaspi Bank: " + allBanks.get(0).getBankData());
        System.out.println("Kaspi Bank TOTAL: " + allBanks.get(0).getTotalBalance());
        System.out.println("Kaspi Bank AVERAGE: " + allBanks.get(0).getAverageBalance());

        System.out.println("BCC Bank: " + allBanks.get(1).getBankData());
        System.out.println("BCC Bank TOTAL: " + allBanks.get(1).getTotalBalance());
        System.out.println("BCC Bank AVERAGE: " + allBanks.get(1).getAverageBalance());

        System.out.println("SBER Bank: " + allBanks.get(2).getBankData());
        System.out.println("SBER Bank TOTAL: " + allBanks.get(2).getTotalBalance());
        System.out.println("SBER Bank AVERAGE: " + allBanks.get(2).getAverageBalance());


        System.out.println("--------------------------------------------------------");
        System.out.println("По убыванию кате бар деп тур жасамай, карап коре аласыз ба");
        BankApplication wi;
        for (int i = 0; i < allBanks.size(); i++) {
            for (int j = i; j < allBanks.size(); j++) {
                if (allBanks.get(i).getAverageBalance() < allBanks.get(j).getAverageBalance()) {
                    wi = allBanks.get(i);
                    allBanks.set(i,allBanks.get(j));
                    allBanks.set(j,wi);
                }
            }
        }

        for (int i = 0; i < allBanks.size(); i++) {
            System.out.println(allBanks.get(i).getAverageBalance());
        }
    }
}