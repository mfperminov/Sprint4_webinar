package _1;

import _1.Pair;

public class Triple<A, B, C> extends Pair<A, B> {

    public final C third;

    // TODO ответить на вопрос из пачки про наследование дженериков
    public Triple(A first, B second, C third) {
        super(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "_1.Triple{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }

}


class CheckEncapsulationTriple {
    public static void main(String[] args) {
//        _1.Triple<Integer, Long, String> triple = new _1.Triple<>(42, 27L, "check");
//        triple.third = "recheck";
    }
}
