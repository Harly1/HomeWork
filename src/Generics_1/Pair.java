package Generics_1;

public class Pair<Integer, String> {

    String str;
    Integer i;

   private Pair(String str, Integer i){
        this.str = str;
        this.i = i;
    }

    public  void main() {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
    }
    public Integer getFirst(){

    return ;
    }
    public String getSecond() {

       return (String) "";

    }
    public void equals() {

    }
    public int hashCode(){

        return 0;
    }
    public void of(){

    }


}
