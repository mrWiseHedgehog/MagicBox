public class MagicBox<T> {


    protected int size;
    protected int items[];



    public boolean add(T item) {
        if (item != null) {
            item += items;
            true;
        } else (item == null) {
            false;
        }
    }
}
