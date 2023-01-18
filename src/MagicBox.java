import java.util.Random;

public class MagicBox<T> {
    protected T[] items;
    protected int boxSize;

    public MagicBox(int BoxSize) {
        this.boxSize = BoxSize;
        this.items = (T[]) new Object[BoxSize];
    }

    public MagicBox() {
        this(3);
    }

    public boolean add(T item) {
        for (int i = 0; i < this.items.length; ++i) {
            if (this.items[i] == null) {
                this.items[i] = item;
                return true;
            }
        }

        return false;
    }

    public T getItem(int itemNumber) {
        return this.items[itemNumber];
    }

    public T pick() {
        int x;
        for (int i = 0; i < this.items.length; ++i) {
            if (this.items[i] == null) {
                x = this.items.length - i;
                throw new RuntimeException("Коробка не полна, осталось свободных ячеек: " + x);
            }
        }

        Random random = new Random();
        x = random.nextInt(this.items.length);
        System.out.println("Result");
        return this.items[x];
    }
}

