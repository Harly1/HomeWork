package myLinkedList;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList<E> {

    int size;
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

    void add(E e) {
           final Entry<E> l = last;
           final Entry<E> newNode = new Entry<>(e, null, l);
           last = newNode;
           if (l == null)
                   first = newNode;
           else
               l.next = newNode;
           size++;

       }

    public E getFirst(){
        return this.first.element;
    }

    public E getLast(){
        return this.last.element;
    }

    public boolean remove(Object o) {
                if (o == null) {
                       for (Entry<E> x = first; x != null; x = x.next) {
                           if (x.element == null) {
                                   unlink(x);
                                   return true;
                           }
                       }
                } else {
                    for (Entry<E> x = first; x != null; x = x.next) {
                      if (o.equals(x.element)) {
                            unlink(x);
                            return true;
                      }
                    }
                }
            return false;
        }

  public  E unlink(Entry<E> x) {

          final E element = x.element;
          final Entry<E> next = x.next;
          final Entry<E> prev = x.prev;

          if (prev == null) {
                  first = next;
              } else {
                  prev.next = next;
                  x.prev = null;
              }

          if (next == null) {
                  last = prev;
              } else {
                  next.prev = prev;
                  x.next = null;
              }

          x.element = null;
          size--;
          return element;

    }
}
