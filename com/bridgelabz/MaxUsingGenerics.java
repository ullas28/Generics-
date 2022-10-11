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
    public static Integer max(Integer a,Integer b,Integer c) {
        int max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        } else if (c.compareTo(max)>0) {
            max = c;
        }
        return max;
    }


    public static void main(String[] args) {

        System.out.println("Maximum from 3 Integer Object : "+max(190,120,20));
    }
}
