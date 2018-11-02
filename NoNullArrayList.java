import java.util.ArrayList;

public class NoNullArrayList<E> extends ArrayList<E> {
  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public E set(int index, E element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    return super.set(index, element);

  }

  public boolean add(E element){
    if (element == null){
      throw new IllegalArgumentException();
    }
    return super.add(element);
  }

  public void add(int index, E element){
    if (element == null){
      throw new IllegalArgumentException();
    }
    super.add(index, element);
  }
}
