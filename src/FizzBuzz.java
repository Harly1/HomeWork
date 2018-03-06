public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i < 11 ; i++) {

           if((i % 2 == 0) && (i % 3 == 0) ) {
//            if(i % 6 == 0) {
                System.out.println("FizzBuzz");

            } else if(i % 2 == 0){
                System.out.println("Fizz");

                } else if(i % 3 == 0){
                        System.out.println("Buzz");
                    }
        }
     /*   for (int i = 1; i <11 ; i++) {
            System.out.println(i);
        }*/
    }
}
