package funcInterface;

public class Test {
    public static void main(String[] args) {

/*      testFunction(Object::equals, new Object(), new Object());           //ссылка на метод

        testFunction((a, b) -> a.equals(b), new Object(), new Object());    //лямда

        testFunction(
                new MyFunction<Object, Object>() {                          //анонимный класс
                @Override
                    public boolean myMetod(Object a, Object b) {
                        return a.equals(b);
                    }
                },

                new Object(),                                               //второй параметр

                new Object()                                                //третий параметр
        );

    }

    public static<K,T> void testFunction(MyFunction<K,T> myFunction, K k,T t){
        System.out.println(myFunction.myMetod(k, t));

   }*/
/*    Test t = new Test();

    t.testFunction(Object::equals, new Object(), new Object());               //ссылка на метод

    t.testFunction((a, b) -> a.equals(b), new Object(), new Object());        //лямда

    t.testFunction(
                new MyFunction<Object, Object>() {                            //анонимный класс
                    @Override
                    public boolean myMetod(Object a, Object b) {
                        return a.equals(b);
                    }
                },
                new Object(),                                                 //второй параметр

                new Object()                                                  //третий параметр
    );

    }

    public void testFunction(MyFunction<K,T> myFunction, K k,T t){
        System.out.println(myFunction.myMetod(k, t));

    }*/
    }
}
