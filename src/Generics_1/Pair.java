package Generics_1;

import java.util.Optional;

public class Pair<Integer, String> {

    String str;
    Integer i;

   private Pair(String str, Integer i){
        this.str = str;
        this.i = i;
    }


    public static <String, Integer> Pair<Integer,String> of(Integer i, String hello) {


    return new Pair<Integer, String>(hello,i);
    }

    public Integer getFirst(){

    return this.i;

    }
    public String getSecond() {

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


