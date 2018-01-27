public class Try {
    public static void main(String[] args) {
        System.out.println(sqrt(4.0));
        try {
            System.out.println(sqrt(-4.0));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static double sqrt(double x) {
          if(x<0){
              throw new IllegalArgumentException("Expected non-negative number, got "+x);
        } else {
              return Math.sqrt(x);
          }

    }
}
