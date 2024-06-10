package session_3_java_operators;

import java.sql.SQLOutput;

public class NumericPromotion {
    public static void main(String[] args) {

        short e = 10;
        int f = e + 5;

        long a = 1000000000L;
        //wrapper classes
        //val max sau minan a unei primitive
        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;

        int maxIntValue = Integer.MAX_VALUE;

        System.out.println("Max long value: " + maxLongValue);
        System.out.println("Min long value: " + maxLongValue);
        System.out.println("Min integer value: " + maxIntValue);


        long testLongValue = 12314382947289234L;
        //max int: 213252362
        //max long; 9748925972498572498

        int newIntValue = (int)testLongValue;

        System.out.println("Test long value: "+ testLongValue);
        System.out.println("New int value: "+ newIntValue);

    }
}
