package funcInterface;

public class Test  {
    public static void main(String[] args) {

        testFunction(Object::equals, new Object(), new Object());           //ссылка на медод

        testFunction((a, b) -> a.equals(b), new Object(), new Object());    //лямда

        testFunction(new MyFunction<Object, Object>() {
            @Override
            public boolean myMetod(Object a, Object b) {
                return a.equals(b);
            }
        },new Object(), new Object());                                      //анонимный класс

    }

    private static Object testFunction(Object o) {
        return null;
    }

    public static<K,T> void testFunction(MyFunction<K,T> myFunction, K k,T t){
        System.out.println(myFunction.myMetod(k, t));

   }
}
