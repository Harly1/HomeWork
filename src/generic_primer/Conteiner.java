package generic_primer;

import java.util.List;

public class Conteiner<T extends Product> {
  private   T t;

  public Conteiner(T t){
      this.t = t;
  }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    void copy(List<Product> src, List<Product> dest){
      for(Product p: src){
          dest.add(p);
      }
    }

    /*public static <T> Conteiner<T> of(T t){

      return new Conteiner<T>(t);

    }*/
}
