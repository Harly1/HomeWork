import java.util.Arrays;
import java.util.stream.IntStream;

public class AsciiCharSequence implements CharSequence  {

 public static void main(String[] args) {

  byte[] example = {72, 101, 108, 108, 111, 33};
  AsciiCharSequence answer = new AsciiCharSequence(example);
  System.out.println("Последовательность - " + answer.toString());//Hello!
  System.out.println("Размер её - " + answer.length());//6
  System.out.println("Символ под № 1 - " + answer.charAt(1));//e
  System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
//проверка на нарушение инкапсуляции private поля
  System.out.println(answer.toString());//Hello!
  example[0] = 74;
  System.out.println(answer.toString());//Hello!
/*  System.arraycopy();
  Arrays.copyOf();*/
 }

 private byte[] mass;

 public AsciiCharSequence(byte[] mass){
  this.mass = mass;
 }

 @Override
 public String toString(){
  return  new String(mass);
 }


 @Override
 public int length() {

  return  mass.length;
 }

 @Override
 public char charAt(int index) {
  return (char) mass[index];
 }

 @Override
 public CharSequence subSequence(int start, int end) {
  byte[] res = new byte[(end - start)];
  for (int i = 0; i < mass.length; i++) {
   if(i==start){
    for (int j = 0,k=i; j <res.length ; j++,k++) {
     if(j==end){
     // res[j] = mass[k];
      break;
     }
     res[j] = mass[k];
    }
    break;
   }
  }
  return new AsciiCharSequence(res) ;
 }
}
