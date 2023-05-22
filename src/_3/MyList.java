package _3;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
  private List<T> list = new ArrayList<>();

  public void add(T element) {
    list.add(element);
  }

  public T get(int index) {
    return list.get(index);
  }

  public void createElementAndAddToList() {
//      T element = new T();
//      add(element);
  }
}
