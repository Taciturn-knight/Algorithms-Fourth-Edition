import java.util.Iterator;
/**
 * Queue
 */
public class Queue<Item> implements Iterable<Item> {
    private Node mFirst;
    private Node mLast;
    private int mNumber;
    private class Node {
        Item mItem;
        Node mNext;
    }

    public boolean isEmpty() {
        return mFirst == null;
    }
    
    public int size() {
        return mNumber;
    }

    public void enqueue(Item item) {
        Node oldLast = mLast;
        mLast = new Node();
        mLast.mItem = item;
        mLast.mNext = null;
        if(isEmpty())
            mFirst = mLast;
        else
            oldLast.mNext = mLast;
        mNumber++;
    }

    public Item dequeue() {
        Item item = mFirst.mItem;
        mFirst = mFirst.mNext;
        if (isEmpty()) 
            mLast = null;
        mNumber--;
        return item;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>{
        private Node mCurrent = mFirst;
        public boolean hasNext() {
            return mCurrent != null;
        }

        public Item next() {
            Item item = mCurrent.mItem;
            mCurrent = mCurrent.mNext;
            return item;
        }

        public void remove() {

        }
    }

}