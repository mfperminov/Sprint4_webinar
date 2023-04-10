package _2;

import _1.Pair;

public class GenericMethods {
    public <T> void printClassName(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods instance = new GenericMethods();
        instance.printClassName("");
        instance.printClassName(1);
        instance.printClassName(1.0);
        instance.printClassName(1.0F);
        instance.printClassName('c');
        instance.printClassName(instance);
        Pair<Integer, String> pair = createPair(42, "hi");
    }

    public static <A, B> Pair<A, B> createPair(A a, B b) {
        return new Pair<>(a, b);
    }
}

