import java.util.function.DoubleUnaryOperator;

public class Integrate {
    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(integrate( x -> Math.sin(x) / x , 1, 5));//0.603848
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {

            int i;
            double n = Math.pow(10,-6);
            double result, h;
            result = 0;
            h = (b - a) / n;

            for(i = 0; i < h; i++)  {

                result += f.applyAsDouble(a+n*i)*n; //Вычисляем в средней точке и добавляем в сумму
            }
            return result;

    }
}