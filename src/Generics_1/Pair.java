package Generics_1;

public class Pair<V, K> {

    K str;
    V i;

   private Pair( V i, K str){
        this.str = str;
        this.i = i;
    }

    public static <V, K> Pair<V,K> of( V i,K str) {

    return new Pair<V, K>(i,str);

    }

    public V getFirst(){

      return this.i;

    }
    public K getSecond() {

       return this.str;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair<Integer, String> rowObj = (Pair<Integer, String>) o;

        if (i != null ? !i.equals(rowObj.i) : rowObj.i != null) return false;
        return str != null ? str.equals(rowObj.str) : rowObj.str == null;
    }

    public int hashCode(){

      int result = 31 + (this.i != null ? this.i.hashCode() : 0);

        return result;

    }
}


