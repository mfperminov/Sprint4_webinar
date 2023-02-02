package _5;

import java.util.*;

public class Covariance {
    <T> void find(Iterable<? extends T> where, T what) {
        while (where.iterator().hasNext()) {
            System.out.println(where.iterator().next());
        }
    }
}

class Contrvariance {

    <T> void sort(List<T> what, Comparator<? super T> how) {

    }
}
class ProtoAnimal {}
class Animal extends ProtoAnimal {
    int foodChainPosition;
    int color;
}

class FoodChainPositionComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.foodChainPosition, o2.foodChainPosition);
    }
}

class Dog extends Animal { }

class Behemoth extends Animal {}

class CheckAnimal {
    public static void main(String[] args) {
        Covariance covariance = new Covariance();
        covariance.find(new AnimalIterator(), new Dog());
        List<Dog> dogs = new ArrayList<>();
        Comparator<Animal> comparator = new FoodChainPositionComparator();
        Contrvariance contrvariance = new Contrvariance();
        contrvariance.sort(dogs, comparator);
    }
}

class Cat extends Animal {}

class AnimalIterator implements Iterable<Animal>{
    int count = 3;
    @Override
    public Iterator<Animal> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return count > 0;
            }

            @Override
            public Animal next() {
                count--;
                if (new Random().nextBoolean()) return new Cat(); else return new Dog();
            }
        };
    }
}
