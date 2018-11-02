public class OrderedArrayList<E extends Comparable<E>> extends NoNullArrayList<E> {
  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public boolean add(E element) {
    if (super.size()==0) {
      super.add(element);
    }
    for (int i=0; i<super.size(); i++){
      if (i==0 && element.compareTo(super.get(i)) >= 0){
        super.add(0, element);
      }
      if (element.compareTo(super.get(i)) < 0) {
        super.add(i, element);
      }
    }
    return true;
  }

  public E set(int index, E element){
    E original = super.get(index);
    super.remove(index);
    super.add(element);
    return original;
  }
}
