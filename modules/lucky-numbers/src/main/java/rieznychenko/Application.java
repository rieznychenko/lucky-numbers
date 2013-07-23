package rieznychenko;

import java.util.List;
import java.util.Scanner;

public class Application {
     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the begin of the range: ");
        int begin = in.nextInt();
        System.out.println("Enter the end of the range: ");
        int end = in.nextInt();
        if(!LuckyNumbers.checkRange(begin, end)) {
            System.out.println("Enter the correct number!!!");
        }
        List<Integer> number = LuckyNumbers.getLuckyNumbers(begin, end);
        System.out.println("Lucky numbers in a predetermined range: from " + begin + " to " + end);
        System.out.println(number);
    }

}


