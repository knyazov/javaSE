package JDBC;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DBManager db = new DBManager();
        db.connect();

        while(true){

            System.out.println("[1] ADD ITEM");
            System.out.println("[2] LIST ITEMS");
            System.out.println("[3] UPDATE ITEM");
            System.out.println("[4] DELETE ITEM");
            System.out.println("[0] EXIT");

            String choice = in.next();

            if(choice.equals("1")){

                System.out.println("Insert name: ");
                String name = in.next();
                System.out.println("Insert price: ");
                int price = in.nextInt();

                //Именно поэтому мы и сделали Long id. Чтобы передавать в конструктор null.
                Items items = new Items(null, name, price);
                db.addItem(items);

            }else if(choice.equals("2")){

                ArrayList<Items> items = db.getAllItems();

                for (Items c : items) {
                    System.out.println(c);
                }

            }else if(choice.equals("3")){

                System.out.println("Insert id: ");
                Long id = in.nextLong();
                System.out.println("Insert name: ");
                String name = in.next();
                System.out.println("Insert price: ");
                int price = in.nextInt();
                Items items = new Items(id, name, price);
                db.updateItem(items);

            }else if(choice.equals("4")){

                System.out.println("Insert id: ");
                Long id = in.nextLong();
                db.deleteItems(id);

            }else if(choice.equals("0")){
                System.exit(0);
            }
        }
    }
}
