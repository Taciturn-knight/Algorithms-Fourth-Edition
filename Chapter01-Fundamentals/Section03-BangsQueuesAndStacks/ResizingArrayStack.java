import java.util.Iterator;
/**
 * ResizingArrayStack
 */
public class ResizingArrayStack<Item> implements Iterable<Item> {
    private Item[] a = (Item[]) new Object[1];
    private int mNumber = 0;
    public boolean isEmpty() {
        return mNumber == 0;
    }

    public int size() {
        return mNumber;
    }
    
    public void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for(int i = 0; i < mNumber; i++)
            temp[i] = a[i];
        a = temp;
    }

    public void push(Item item) {
        if( mNumber == a.length)
            resize(2*a.length);
        a[mNumber++] = item;
    }

    public Item pop() {
        Item item = a[--mNumber];
        a[mNumber] = null;
        if(mNumber > 0 && mNumber == a.length / 4)
            resize(a.length / 2);
        return item;
    }

    public Iterator<Item> iterator() {
        return new ReverseArrayIteerator();
    }

    private class ReverseArrayIteerator implements Iterator<Item>
    {
        private int mIndex = mNumber;
        public boolean hasNext() {
            return mIndex > 0;
        }

        public Item next() {
            return a[mIndex];
        }

        public void remove() {

        }
    }
}