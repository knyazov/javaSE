package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Players p1 = new Players("first", 1520, 23);
        Players p2 = new Players("second", 1620, 32);
        Players p3 = new Players("third", 1100, 31);
        Players p4 = new Players("four", 5630, 30);
        Players p5 = new Players("five", 1780, 29);
        Players p6 = new Players("six", 2147, 28);
        Players p7 = new Players("seven", 8679, 27);
        Players p8 = new Players("eight", 7858, 26);
        Players p9 = new Players("nine", 2365, 25);
        Players p10 = new Players("ten", 1896, 24);
        ArrayList<Players> arr = new ArrayList<>();
        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
        arr.add(p4);
        arr.add(p5);
        arr.add(p6);
        arr.add(p7);
        arr.add(p8);
        arr.add(p9);
        arr.add(p10);

        int sum = 0;
        double sum1 = 0;
        int counter = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i).getAge();
            sum1 += arr.get(i).getPrice();
            counter++;
        }
        System.out.println("Average price: " + sum1/counter);
        System.out.println("Sum of Ages: " + sum);
    }
}
