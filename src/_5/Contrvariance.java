package _5;

import java.util.ArrayList;
import java.util.List;

interface Child {
  void cry();
}

interface TaxPayer {
  void pay();
}

public class Contrvariance {
  public static void main(String[] args) {
    Kindergarten kindergarten = new Kindergarten();
    Fns fns = new Fns();
    Human human = new Human();
    addNewHumanToList(kindergarten.getChildren(), human);
    addNewHumanToList(fns.getNalogoplatelshik(), human);
  }

  static void addNewHumanToList(List<? super Human> list, Human human) {
    list.add(human);
  }
}

class Kindergarten {
  private List<Child> childs = new ArrayList();

  List<Child> getChildren() {
    return childs;
  }
}

class Fns {
  private List<TaxPayer> taxPayers = new ArrayList();

  List<TaxPayer> getNalogoplatelshik() {
    return taxPayers;
  }
}

class Human implements Child, TaxPayer {

  @Override public void cry() {
    System.out.println("I cry");
  }

  @Override public void pay() {
    System.out.println("and I pay");
  }
}
