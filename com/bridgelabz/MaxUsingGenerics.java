/*Given 3 Integers find the maximum
 3 float find the maximum
 3 strings find the greatestor max*/

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
        String g = "Apple", h = "Peach", i = "Banana";
        System.out.println("For Integer values");
        max(a,b,c);
        System.out.println("For Flaot values");
        max(d,e,f);
        System.out.println("For String values");
        max(g,h,i);
    }
}
