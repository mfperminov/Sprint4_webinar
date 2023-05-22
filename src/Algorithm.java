

public final class Algorithm {
    public static <T extends Comparable<T>> T max(T x, T y) {
        return x.compareTo(y) > 0 ? x : y;
    }

    public static void main(String[] args) {
        Person p = new Person(20);
        Person p1 = new Person(100);
        max(p, p1);
    }
}


class Person implements Comparable<Person> {
    private int leetcodeRating;
    Person(int leetcodeRating) {
        this.leetcodeRating = leetcodeRating;
    }

    @Override
    public int compareTo(Person o) {
        return leetcodeRating - o.leetcodeRating;
    }
}

