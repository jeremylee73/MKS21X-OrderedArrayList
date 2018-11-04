public class OrderedArrayList<E extends Comparable<E>> extends NoNullArrayList<E> {
  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public boolean add(E value) {
    if (value == null) {
      throw new IllegalArgumentException("Cannot add null");
    }
    for (int i = 0; i < size(); i++) {
      if (value.compareTo(this.get(i)) <= 0) {
        super.add(i, value);
        return true;
      }
    }
    super.add(0, value);
    return true;
  }

  public void add(int index, E value) {
    this.add(value);
  }

  public E set(int i, E value) {
    if (value == null) {
      throw new IllegalArgumentException("Cannot set value to null");
    }
    E old = this.get(i);
    super.remove(i);
    add(value);
    return old;
  }
}
