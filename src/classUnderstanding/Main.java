package classUnderstanding;

public class Main {
    public static void main(String[] args) {
//          A a = new B();
        B b =  new B();
        A a = b;

        System.out.println(a.x);
//          a.test();
    }
}

