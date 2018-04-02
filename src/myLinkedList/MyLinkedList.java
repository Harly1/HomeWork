package myLinkedList;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList<E> {

    int size = 0;
    Entry<E> first;
    Entry<E> last;


    private static class Entry<E>{

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
        if(size==0){
            Entry<E> cur = new Entry<E>(element,null,null);
            first = cur;
            last = cur;
            size++;
        } else {
            Entry<E> end = last;
            Entry<E> cur = new Entry<E>(element,null,end);
            last = cur;
            size++;
        }



    }

 /*   public E get(int index) {




        return
    }*/

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }
}
