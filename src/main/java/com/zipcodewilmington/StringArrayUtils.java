package com.zipcodewilmington;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.StringBuilder;
import java.lang.String;


/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array)
    {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array)
    {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array)
    {
        int lastElement = array.length - 1;
        return array[lastElement];

    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array)
    {
        int secondToLast = array.length - 2;
        return array[secondToLast];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        Boolean contains;
        for (int i = 0; i < array.length - 1; i++) {
            array[i].equals(value);
            return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse (String[] array)
    {

        String[] result = new String[array.length];
        //int length = array.length;

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++)
        {
            result[j] = array[i];
        }

        return result;

        //return arr.toArray(new String[arr.size()]);
    }

    /**
     *
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversedArray = reverse(array);
        return (Arrays.equals(reversedArray, array));

    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        //char[] alphabet = new char[26]
        String listedArray = String.join("", array).toLowerCase();

        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        //String[] reverseAlphabet = "zyxwvutsrqponmlkjihgfedcba".split(" ");
        if (listedArray.length() < 26) {
            return false;
        }

        for (int i = 0; i < alphabet.length - 1; i++)
            if (!listedArray.contains(alphabet[i])) {
                return false;
            }

        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value)
    {
        int trueCounter = 0;
        for(int i = 0; i < array.length-1; i++)
        {
            if(array[i]).equals(value)
            {
                counter++;
            }

        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove)
    {

    return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
