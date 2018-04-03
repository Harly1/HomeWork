package Generics_1;

public class Pair<T, V> {
    T str;
    V i;
   private Pair(T str, V i){
        this.str = str;
        this.i = i;
    }

    public static  <T, V> Pair<T,V> of(T i, V hello) {

    return new Pair<T, V>(i,hello);
    }

    public V getFirst(){

    return this.i;

    }
    public T getSecond() {

       return this.str;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair<T, V> rowObj = (Pair<T, V>) o;

        if (i != null ? !i.equals(rowObj.i) : rowObj.i != null) return false;
        return str != null ? str.equals(rowObj.str) : rowObj.str == null;
    }

    public int hashCode(){

      int result = 31 + (this.i != null ? this.i.hashCode() : 0);

        return result;

    }

}


