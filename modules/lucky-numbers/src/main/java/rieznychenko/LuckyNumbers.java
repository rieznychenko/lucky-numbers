package rieznychenko;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuckyNumbers {
    
    public static final int MIN_LUCKY = 0;
    public static final int MAX_LUCKY = 999999;
    
    public static List<Integer> getLuckyNumbers(int begin, int end) throws IllegalArgumentException {
        List<Integer> luckyNumbers = new ArrayList<Integer>();
        if(begin > end) {
            throw new IllegalArgumentException();
        }
        if(begin <= end) {
            for(int j = begin; j <= end; ++ j) {
                if(isLucky(j) ) {
                    luckyNumbers.add(j);
                } 
            }
        }
        return luckyNumbers;
    }

    public static boolean isLucky(int number) throws IllegalArgumentException {
        if(!checkNumber(number)) {
            throw new IllegalArgumentException();
        }
        return (number/100000)%10 + (number/10000)%10 + (number/1000)%10 == (number/100)%10 + (number/10)%10 + number%10;
    }
    
    public static boolean checkNumber(int number) {
        return number >= MIN_LUCKY && number <= MAX_LUCKY;
    }
    
    public static boolean checkRange(int begin, int end) {
        return begin >= MIN_LUCKY && end <= MAX_LUCKY && begin <= end;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ������ ���������: ");
        int begin = in.nextInt();
        System.out.println("������� ����� ���������: ");
        int end = in.nextInt();
        if(!checkRange(begin, end)) {
            System.out.println("������� ��������� �����");
        }
        List<Integer> number = getLuckyNumbers(begin, end);
        System.out.println("���������� ����� � �������� ���������: �� " + begin + " �� " + end);
        System.out.println(number);
    }

}


