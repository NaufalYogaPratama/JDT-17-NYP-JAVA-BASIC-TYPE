package com.indivaragroup.operator.augmented.assignment;

import org.w3c.dom.ls.LSOutput;

public class AugmentedAssignment {
    public void augmentedAssignmentFunction (){
        int a = 10;

        a += 5;
        a -= 3;
        a *= 2;
        a /= 4;

        int b =10;
        b %= 6;

        System.out.println(a);
        System.out.println(b);
    }
}
