/*Given 3 Integers find the maximum
 3 float find the maximum
 3 strings find the greatestor max
 Extend the max method to take more then three parameters*/

package com.bridgelabz;

public class MaxUsingGenerics {
    //compareTo method for Checking Maximum values from 3 Integer Object
    public static <T extends Comparable<T>> T max(T a, T b, T c, T d) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max)>0) {
            max = c;
        }
        if (d.compareTo(max)>0){
            max = d;
        }

        return max;
    }



    public static void main(String[] args) {
        Integer a1 = 190,a2 = 220, a3 = 300, a4 = 230;
        Float b1 = 12.20f,b2 = 19.20f, b3= 31.2f, b4 = 56.4F;
        String c1 = "Apple", c2 = "Peach", c3 = "Banana", c4 = "PineApple";
        System.out.println("Maximum values");
        System.out.printf("For Integer values : %s %s %s %s",a1,a2,a3,a4);
        System.out.println(" ");
        System.out.println(max(a1,a2,a3,a4));
        System.out.printf("For Flaot values : %s %s %s %s",b1,b2,b3,b4);
        System.out.println(" ");
        System.out.println(max(b1,b2,b3,b4));
        System.out.printf("For String values : %s %s %s %s",c1,c2,c3,c4);
        System.out.println(" ");
        System.out.println(max(c1,c2,c3,c4));
    }
}
