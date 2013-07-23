package rieznychenko;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers {

    public static final int MIN_LUCKY = 0;
    public static final int MAX_LUCKY = 999999;
    
    public static List<Integer> getLuckyNumbers(int begin, int end) throws IllegalArgumentException {
        List<Integer> luckyNumbers = new ArrayList<Integer>();
        if(begin > end) {
            throw new IllegalArgumentException();
        }
        for(int j = begin; j <= end; ++ j) {
            if(isLucky(j) ) {
                luckyNumbers.add(j);
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
        return MIN_LUCKY <= number && number <= MAX_LUCKY;
    }
    
    public static boolean checkRange(int begin, int end) {
        return MIN_LUCKY <= begin && begin <= end && end <= MAX_LUCKY;
    }
}
