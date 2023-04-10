package _3;

import java.util.ArrayList;

public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println("c1 class " + c1.getName());
        System.out.println("c2 class " + c2.getName());
        System.out.println(c1 == c2);
    }
}

