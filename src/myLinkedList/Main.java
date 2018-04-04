package myLinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<String>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.remove("3");
        String first = list.getFirst();
        String last = list.getLast();


    }

}
