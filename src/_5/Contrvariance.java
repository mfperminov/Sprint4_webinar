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
    TaxInspection taxInspection = new TaxInspection();
    Human human = new Human();
    addNewHumanToList(kindergarten.getChildren(), human);
    addNewHumanToList(taxInspection.getTaxPayers(), human);
  }

  static void addNewHumanToList(List<? super Human> humanList, Human human) {
    humanList.add(human);
  }

}

class Kindergarten {
  private List<Child> childs = new ArrayList();

  List<Child> getChildren() {
    return childs;
  }
}

class TaxInspection {
  private List<TaxPayer> taxPayers = new ArrayList();

  List<TaxPayer> getTaxPayers() {
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
