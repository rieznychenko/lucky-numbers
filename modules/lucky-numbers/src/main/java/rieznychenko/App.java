package rieznychenko;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
       public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("¬ведите начало диапазона: ");
	int begin = in.nextInt();
	System.out.println("¬ведите конец диапазона: ");
	int end = in.nextInt();
	ArrayList<Integer> numbers = findLucky(begin, end);
	System.out.println("—частливые числа в заданном диапазоне: " + numbers);
    }

    private static ArrayList<Integer> findLucky(int begin, int end) {
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	for(int j = begin; j < end; ++ j) {
		if((j/100000)%10 + (j/10000)%10 + (j/1000)%10 == (j/100)%10 + (j/10)%10 + j%10 ) {
		    numbers.add(j);
		} 
	}
	return numbers;
    }
}


