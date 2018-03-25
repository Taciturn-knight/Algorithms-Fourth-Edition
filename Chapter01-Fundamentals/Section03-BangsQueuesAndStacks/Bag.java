import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Stack
 */
public class Bag<Item> implements Iterable<Item> {
    private Node mFirst;
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

    public void add(Item item) {
        Node oldfirst = mFirst;
        mFirst = new Node();
        mFirst.mItem = item;
        mFirst.mNext = oldfirst;
        mNumber++;
    }

    public Item pop() {
        Item item = mFirst.mItem;
        mFirst = mFirst.mNext;
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
    
    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if(!item.equals("-"))
                s.push(item);
            else if(!s.isEmpty())
                StdOut.print(s.pop() + " ");
        }

        StdOut.println("(" + s.size() + " left on bag)");
    }
}