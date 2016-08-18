package com.theironyard.charlotte;

public class Main {

    /* (1) Logic 2: blackjack
    Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
    Return 0 if they both go over.

    blackjack(19, 21) → 21
    blackjack(21, 19) → 21
    blackjack(19, 22) → 19
     */

//    public static int blackJack(int firstNumber, int secondNumber) {
//        int num1 = 21 - Math.abs(firstNumber);
//        int num2 = 21 - Math.abs(secondNumber);
//        int maxNum = Math.min(num1, num2);
//
//        if (firstNumber + secondNumber > 44) {
//            return 0;
//        } else if (firstNumber > 21 || secondNumber > 21) {
//            return Math.min(firstNumber, secondNumber);
//        } else {
//            return 21 - maxNum;
//        }
//    }




    /* (2) Logic 2: makeChocolate:

    We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
    Return the number of small bars to use, assuming we always use big bars before small bars.
    Return -1 if it can't be done.

    makeChocolate(4, 1, 9) → 4
    makeChocolate(4, 1, 10) → -1
    makeChocolate(4, 1, 7) → 2

    */

//    public static int makeChocolate(int small, int big, int goal) {
//        int smallKilos = small * 1;
//        int bigKilos = big * 5;
//
//        int remainingAfterBig = goal - bigKilos;
//        int smallToUse = remainingAfterBig - smallKilos;
//
//        if (remainingAfterBig > small) {
//            return -1;
//        } else {
//            return smallKilos - Math.abs(smallToUse);
//        }
//    }

    /* (3) Logic 2: luckySum

    Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it
    does not count towards the sum and values to its right do not count. So for example, if b is 13,
    then both b and c do not count.

    luckySum(1, 2, 3) → 6
    luckySum(1, 2, 13) → 3
    luckySum(1, 13, 3) → 1

     */

//    public static int luckySum(int a, int b, int c) {
//        int sum = 0;
//
//        if (a == 13) {
//            sum = 0;
//        } else if (b == 13) {
//            sum = a;
//        } else if (c == 13) {
//            sum = (a + b);
//        } else {
//            sum = (a + b + c);
//        }
//        return sum;
//    }

    /* (4) Logic 2: evenlySpaced

       Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the
       three values are evenly spaced, so the difference between small and medium is the same as the difference
       between medium and large.

        evenlySpaced(2, 4, 6) → true
        evenlySpaced(4, 6, 2) → true  *** this seems like it should be false?  codebat said true, but doesn't seem like it
        evenlySpaced(4, 6, 3) → false
     */

//    public static boolean evenlySpaced(int a, int b, int c) {
//        int space1 = Math.abs((a - b));
//        int space2 = Math.abs((b - c));
//
//        if (space1 == space2) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    /* (5) Logic 2: roundSum

    For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more,
    so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is
    less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid
    code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper
    entirely below and at the same indent level as roundSum().

    roundSum(16, 17, 18) → 60
    roundSum(12, 13, 14) → 30
    roundSum(6, 4, 4) → 10
     */

//    public static int round10(int num) {
//        double step1 = (double) num;
//        double step2 = (step1 / 10);
//        double step3 = Math.round(step2);
//        int step4 = (int) (step3 * 10);
//        return step4;
//    }
//
//    public static int roundSum(int a, int b, int c) {
//        int sum = round10(a) + round10(b) + round10(c);
//        return sum;
//    }

    /* (6) String 2: doubleChar
    Given a string, return a string where for every char in the original, there are two chars.

    doubleChar("The") → "TThhee"
    doubleChar("AAbb") → "AAAAbbbb"
    doubleChar("Hi-There") → "HHii--TThheerree"
     */

    public static String doubleChar(String word) {
        String newWord = "";

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            newWord += ""+letter+letter; // the ""+ makes this into a string, otherwise you will just get numbers,
            // had to look this up
        }
        return newWord;
    }


    /* (7) String-2 : oneTwo

    Given a string, compute a new string by moving the first char to come after the next two
    chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars,
    so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.

    oneTwo("abc") → "bca"
    oneTwo("tca") → "cat"
    oneTwo("tcagdo") → "catdog"
     */

    public static String oneTwo(String word) {
        
    }



    public static void main(String[] args) {

        //System.out.println(blackJack(22, 22));

        //System.out.println(makeChocolate(4, 1, 9));

        //System.out.println(luckySum(1, 2, 3));

        //System.out.println(evenlySpaced(4, 6, 2));

        //System.out.println(roundSum(6, 4, 4));

        System.out.println(doubleChar("Hi-There"));


    }
}
