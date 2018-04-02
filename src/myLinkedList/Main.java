package myLinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        LinkedList test = new LinkedList();
        test.add("0");
        test.add("1");
        test.add("2");
        MyLinkedList<String> list = new MyLinkedList<String>();
        list.add("0");
        list.add("1");
        list.add("2");
        System.out.println(list.toString());
    }

}
