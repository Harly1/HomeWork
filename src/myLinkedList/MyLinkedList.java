package myLinkedList;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList<E> {
    int size = 0;

    Entry<E>[] header;
    Entry<E> first;
    Entry<E> last;


    public MyLinkedList(){
        Entry<E> o = new Entry<E>(null,null,null);
        header[0] = o;
    }

    private static class Entry<E>
    {
        E element;
        Entry<E> next;
        Entry<E> prev;

        Entry(E element, Entry<E> next, Entry<E> prev)
        {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public void add(E element){

            header= new Entry(element, header.next, header.prev);
                    Integer.

    }


    public E get(int index) {
        return node(index).item;
    }




}
