

public class ClassAndMethodName {

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }


    public static String getCallerClassAndMethodName() {
        Object[] a =   new Throwable().getStackTrace();
        String g = a.getClass().getPackage().getName();
        String b = String.valueOf(a[a.length-1].toString());
        b = b.substring(0,b.indexOf("("));
        b = b.replace(".","#");
        return ( a.length == 2)? null: b;

    }
}