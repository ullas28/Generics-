/*Given 3 Integers find the maximum
- Ensure to test code with the Test Case.
- To ensure your Code works you need 3
test cases with Max Number at 1st, 2nd
and 3rd
- Use Integer Object and compareTo
UC 1 method to test the maximum number*/

package com.bridgelabz;

public class MaxUsingGenerics {
    //compareTo method for Checking Maximum values from 3 Integer Object
    public static <T extends Comparable<T>> T max(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max)>0) {
            max = c;
        }
        printMax(a,b,c,max);
        return max;
    }

    public static <T> void printMax(T a, T b, T c, T max){
        System.out.printf("Max of %s %s and %s is %s\n",a,b,c,max);
    }

    public static void main(String[] args) {
        Integer a = 190,b = 220, c= 300;
        Float d = 12.20f,e = 19.20f, f= 31.2f;
        System.out.println("For Integer values");
        max(a,b,c);
        System.out.println("For Flaot values");
        max(d,e,f);
    }
}
