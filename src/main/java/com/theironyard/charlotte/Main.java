package com.theironyard.charlotte;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    /* (1) Map-2: wordCount

    The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key
    for each different string, with the value the number of times that string appears in the array.

    wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
    wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
    wordCount(["c", "c", "c", "c"]) → {"c": 4}

     */

    public static Map<String, Integer> wordCount(String[] strings) {

        Map<String, Integer> countMap = new HashMap<>();

        int counts = 1; // start count at 1, since given letter at index will make the count 1

        for (int i = 0; i < strings.length; i++) { // for every letter in the array
            try { // will need a try catch for the very last letter, since will get out of bounds exception
                for (int j = i + 1; j < strings.length; j++) { // compare letter at i to all the other letters in the arry
                    if (strings[i] == strings[j]) { // if they match
                        counts++; // add to counts variable
                    }
                }
                countMap.putIfAbsent(strings[i], counts); // if that letter is not in the hashmap yet, add it in with the count
                counts = 1; // return the count back to 1 for the next letter in the array

            } catch (Exception e) {
                countMap.putIfAbsent(strings[i], 1);
            }
        }
        return countMap;
    }

    /* (2) Map-2: word0

    Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
    always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting later,
    but for this problem the value is simply 0.

    word0(["a", "b", "a", "b"]) → {"b": 0, "a": 0}
    word0(["a", "b", "a", "c", "b"]) → {"b": 0, "c": 0, "a": 0}
    word0(["c", "b", "a"]) → {"b": 0, "c": 0, "a": 0}
     */

    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> wordMap = new HashMap<>(); // why can't it be new Map<> ?

        for (int i = 0; i < strings.length; i++) { // for every letter in the array
            wordMap.put(strings[i], 0); // add it to the hashmap with 0 as the value
        }
        return wordMap;
    }


    /* (3) Logic 2: blackjack
    Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
    Return 0 if they both go over.

    blackjack(19, 21) → 21
    blackjack(21, 19) → 21
    blackjack(19, 22) → 19
     */

    public static int blackJack(int firstNumber, int secondNumber) {
//        int num1 = 21 - Math.abs(firstNumber); //num1 is the different between the 21 and the first number (absolute value, negatives are disregarded)
//        int num2 = 21 - Math.abs(secondNumber); // same with num2
//        int maxNum = Math.min(num1, num2); // the max between the 2 numbers

        int maxNum; // create maxNum variable

        if (firstNumber + secondNumber >= 44) { // if both are over 21, bust
            return 0;
        } else if (firstNumber > 21 || secondNumber > 21) { // if either number is over, winner is the other number
            return Math.min(firstNumber, secondNumber);
        } else {
            maxNum = Math.max(firstNumber, secondNumber); // otherwise, take the highest number
        }
        return maxNum;
    }




    /* (4) Logic 2: makeChocolate:

    We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
    Return the number of small bars to use, assuming we always use big bars before small bars.
    Return -1 if it can't be done.

    makeChocolate(4, 1, 9) → 4
    makeChocolate(4, 1, 10) → -1
    makeChocolate(4, 1, 7) → 2

    */

    public static int makeChocolate(int small, int big, int goal) {
        int smallKilos = small * 1; // to determine bars in kilos
        int bigKilos = big * 5;

        int remainingAfterBig = goal - bigKilos; // what is left after we use the big bars first
        int smallToUse = remainingAfterBig - smallKilos; // how much small we need to use

        if (remainingAfterBig > small) { // if not enough small, return -1
            return -1;
        } else {
            return smallKilos - Math.abs(smallToUse);
        }
    }

    /* (5) Logic 2: luckySum

    Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it
    does not count towards the sum and values to its right do not count. So for example, if b is 13,
    then both b and c do not count.

    luckySum(1, 2, 3) → 6
    luckySum(1, 2, 13) → 3
    luckySum(1, 13, 3) → 1

     */

    public static int luckySum(int a, int b, int c) {
        int sum = 0; // start sum with 0

        if (a == 13) {
            sum = 0;
        } else if (b == 13) {
            sum = a;
        } else if (c == 13) {
            sum = (a + b);
        } else {
            sum = (a + b + c);
        }
        return sum;
    }

    /* (6) Logic 2: evenlySpaced

       Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the
       three values are evenly spaced, so the difference between small and medium is the same as the difference
       between medium and large.

        evenlySpaced(2, 4, 6) → true
        evenlySpaced(4, 6, 2) → true  *** this seems like it should be false?  codebat said true, but doesn't seem like it
        evenlySpaced(4, 6, 3) → false
     */

    public static boolean evenlySpaced(int a, int b, int c) {
        int space1 = Math.abs((a - b)); // take the absolute value of the difference between small and medium
        int space2 = Math.abs((b - c)); // absolute value between medium and large

        if (space1 == space2) { // if the differences are the same, return true, otherwise return false
            return true;
        } else {
            return false;
        }
    }

    /* (7) Logic 2: roundSum

    For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more,
    so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is
    less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid
    code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper
    entirely below and at the same indent level as roundSum().

    roundSum(16, 17, 18) → 60
    roundSum(12, 13, 14) → 30
    roundSum(6, 4, 4) → 10
     */

    public static int round10(int num) {
        double numDouble = (double) num; // first turn the input into a double (ex: 56 = 56.0)
        double divideTen = (numDouble / 10); // then divide by 10 (ex: 5.6)
        double roundTend = Math.round(divideTen); // math.round will then round this to the nearst whole number (ex: 6.0)
        int backToInt = (int) (roundTend * 10); // multiple by ten, and cast back to in (ex: 60)
        return backToInt;
    }

    public static int roundSum(int a, int b, int c) {
        int sum = round10(a) + round10(b) + round10(c);
        return sum;
    }

    /* (8) String 2: doubleChar
    Given a string, return a string where for every char in the original, there are two chars.

    doubleChar("The") → "TThhee"
    doubleChar("AAbb") → "AAAAbbbb"
    doubleChar("Hi-There") → "HHii--TThheerree"
     */

    public static String doubleChar(String word) {
        String newWord = ""; //start blank

        for (int i = 0; i < word.length(); i++) { // for every letter in the word
            char letter = word.charAt(i); // variable letter is that letter
            newWord = newWord + letter + letter; // and the new word is the new word concatenated with 2x the letter
        }
        return newWord;
    }

        /*(9) String-2: countCode

    Return the number of times that the string "code" appears anywhere in the given string,
    except we'll accept any letter for the 'd', so "cope" and "cooe" count.

    countCode("aaacodebbb") → 1
    countCode("codexxcode") → 2
    countCode("cozexxcope") → 2

     */

    public static int countCode (String input) {

        int count = 0; // count starts at 0

        for(int i = 0; i < input.length() - 3; i++) {
            // for every character, up until length - 3, to stop the exception error (code is characters)
            if(input.substring(i, i+2).equalsIgnoreCase("co") && input.charAt(i+3) == 'e') { // first part needs to equal co, last letter needs to be e
                count++;
            }
        } return count;
    }


    /* (10) String-2: bobThere
    Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

    bobThere("abcbob") → true
    bobThere("b9b") → true
    bobThere("bac") → false
     */

    public static boolean bobThere(String input) {

        for (int i = 0; i <= input.length() - 3; i++) { //for every character, up until length - 2 b/c bob is 3 characters
            if (input.charAt(i) == 'b' && input.charAt(i + 2) == 'b') // single quotes for char, double quotes for strings
                return true;
        }
        return false;
    }

        /* (11) String-2 repeatEnd

    Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
    You may assume that n is between 0 and the length of the string, inclusive.

    repeatEnd("Hello", 3) → "llollollo"
    repeatEnd("Hello", 2) → "lolo"
    repeatEnd("Hello", 1) → "o"

     */

    public static String repeatEnd(String word, int number) {
        int repeat = 0;
        String newRepeatString = ""; // start with blank slate

        String newString = word.substring(word.length() - number, word.length()); // the new string is
        // the last letter minus the input number, until the end of the word

        while (repeat < number) { // while repeat is less than the input
            newRepeatString = newRepeatString + newString; // our blank slate is the new string
            repeat++;
        } return newRepeatString;
    }

    /* (12) String-2: prefixAgain

    Given a string, consider the prefix string made of the first N chars of the string.
    Does that prefix string appear somewhere else in the string? Assume that the string is not empty
    and that N is in the range 1..str.length().

    prefixAgain("abXYabc", 1) → true
    prefixAgain("abXYabc", 2) → true
    prefixAgain("abXYabc", 3) → false
    jennilalalalaidfjfkjdfjenni, 5
    0123456789

     */

    public static boolean prefixAgain(String word, int characters) {

        String prefixString = word.substring(0,characters); // get prefix, based on characters and index

        for (int i = characters; i <= word.length() - characters; i++) { // starting from suffix, up until end of word - input.
            // this time used <= instead of characters - 1 like bobThere.  results are the same though.
            if (word.substring(i, i + characters).equals(prefixString)) {
                return true;
            }
        }
        return false;

    }

    /*(13) String-2: sameStarChar

    Returns true if for every '*' (star) in the string, if there are chars both immediately
    before and after the star, they are the same.

    sameStarChar("xy*yzz") → true
    sameStarChar("xy*zzz") → false
    sameStarChar("*xa*az") → true

     */

    public static boolean sameStarChar(String input) {
        List<Integer> starIndex = new ArrayList<>(); // create an empty array list and holds integers

        for (int i = 1; i < input.length() - 1; i++) { // for every character in input, not the ends
            if (input.charAt(i) == '*') // if character at index is a star
                starIndex.add(i); // add that index to the array list
        }

        if (starIndex.size() == 0) {
            return true;
        }
        for (int s : starIndex) { // for index i've put in the array list
            if (input.charAt(s - 1) == input.charAt(s + 1)) { // if the character before that index equals the character after that index return true
                return true;
            }
        }
        return false;
    }



    /* (14) String-2: starOut TODO: need to figure this problem out.

    Return a version of the given string, where for every star (*) in the string the star and
    the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

    starOut("ab*cd") → "ad"
    starOut("ab**cd") → "ad"
    starOut("sm*eilly") → "silly"

     */

//    public static String starOut(String input) {
//
//        char[] charArray = input.toCharArray();
//
//        String newString = "";
//
//        for(int i = 0; i < input.length(); i++) {
//            if(i == 0 && charArray[i] == '*') {
//                charArray[i] =;
//            } else if (i == input.length() && charArray[i] == '*') {
//
//            }
//        } return newString;
//    }



    /* (15) String-2 : countHi


    Return the number of times that the string "hi" appears anywhere in the given string.

    countHi("abc hi ho") → 1
    countHi("ABChi hi") → 2
    countHi("hihi") → 2
     */

    public static int countHi(String input) {
        int counts = 0;

        for (int i = 0; i < input.length()-1; i++) { //-1 because if i didn't, it would be out of bounds,
            // b/c comparing next index
            if (input.substring(i, i + 2).equalsIgnoreCase("hi")) { // 2 because its exclusive of ending index
                counts++;
            }
        }
        return counts;

    }

    /* (16) String-2: endOther

    Given two strings, return true if either of the strings appears at the very
    end of the other string, ignoring upper/lower case differences (in other words, the computation should
    not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

    endOther("Hiabc", "abc") → true
    endOther("AbC", "HiaBc") → true
    endOther("abc", "abXabc") → true

     */

    public static boolean endOther(String wordA, String wordB) {
        String lowerCaseA = wordA.toLowerCase();
        String lowerCaseB = wordB.toLowerCase(); // first bring them all to lowercase

        int lengthA = wordA.length(); // find lengths
        int lengthB = wordB.length();

        if (lengthA > lengthB) { // if length A is longer
            if (lowerCaseB.equals(lowerCaseA.substring((lengthA - lengthB), lengthA))) { // if entire string of wordB is at the end of word A
                return true;
            }
        } else if (lengthB > lengthA) {
            if (lowerCaseA.equals(lowerCaseB.substring((lengthB - lengthA), lengthB))) {
                return true;
            }
        } else if ((lengthB == lengthA) && (lowerCaseA == lowerCaseB)) { // if same word, then true
            return true;
        }
        return false;
    }

    /* (16) String-2: xyBalance

    We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char
    somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
    Return true if the given string is xy-balanced.

    xyBalance("aaxbby") → true
    xyBalance("aaxbb") → false
    xyBalance("yaaxbb") → false

     */

    public static boolean xyBalance(String input) {
        int xIdx = input.lastIndexOf('x');
        int yIdx = input.lastIndexOf('y');

        if (xIdx + yIdx == -2) {
            return true;
        } else if (xIdx > -1 && yIdx == -1) {
            return false;
        } else if (xIdx > -1 && yIdx > xIdx) {
            return true;
        }
        return false;
    }

    /* (17) Array-2: countEvens

    Return the number of even ints in the given array. Note: the % "mod" operator computes the
    remainder, e.g. 5 % 2 is 1.

    countEvens([2, 1, 2, 3, 4]) → 3
    countEvens([2, 2, 0]) → 3
    countEvens([1, 3, 5]) → 0

     */

    public static int countEvens(int[] numbers) {
        int evenNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers++;
            }
        }
        return evenNumbers;
    }

    /* (18) Array-2: sum13

    Return the sum of the numbers in the array, returning 0 for an empty array.
    Except the number 13 is very unlucky, so it does not count and numbers that come immediately
    after a 13 also do not count.

    sum13([1, 2, 2, 1]) → 6
    sum13([1, 1]) → 2
    sum13([1, 2, 2, 1, 13]) → 6

     */

    public static int sum13(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            try {
                if (numbers[i] != 13 && numbers[i - 1] != 13) {  // if number at index and number before index do not equal 13
                    sum = sum + numbers[i]; // then add it to the sum
                }
            } catch (Exception e) {
                if (numbers[i] != 13) { // try and catch to fix exception of out of bounds for index.  if exception, that means it is the first number, if it is not 13
                    sum = sum + numbers[i]; // add it to the sum
                }
            }
        }
        return sum;
    }

    /* (19) Array-2: lucky13

    Given an array of ints, return true if the array contains no 1's and no 3's.

    lucky13([0, 2, 4]) → true
    lucky13([1, 2, 3]) → false
    lucky13([1, 2, 4]) → false

     */

    public static boolean lucky13(int[] numbers) {
        boolean if13 = true; // set originally to true

        for (int i = 0; i < numbers.length; i++) {
            if (Math.abs(numbers[i]) == 1 || Math.abs(numbers[i]) == 3) { //if any number is 1 or 3
                if13 = false; // set it to false
            }
        }
        return if13;
    }


    public static void main(String[] args) {

        System.out.println(sameStarChar("ldd*fkfd*"));


    }
}
