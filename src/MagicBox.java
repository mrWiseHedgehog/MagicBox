import java.util.Random;

public class MagicBox<T> {
    protected T[] items;
    int total;

    public MagicBox(int size) {
        this.items = (T[]) new Object[size];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                total++;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        Random random = new Random();
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Box is not full, add " + (items.length - total) + " items!");
            }
        }
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                int randomInt = random.nextInt(items.length);
                System.out.println("Box is full! Random element: " + items[randomInt]);
                System.out.println();
                return items[randomInt];
            }
        }
        return null;
    }
}