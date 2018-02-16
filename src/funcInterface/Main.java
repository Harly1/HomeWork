package funcInterface;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Object> condition = Objects::isNull;

        Function<Object, Integer> ifTrue = obj -> 0;
        Function<CharSequence, Integer> ifFalse = CharSequence::length;
        Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);
    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

            T str = (T)"111";
            T u1 =  (T)"dfg";
            T u2 =  (T)"fdgdfg";


        Function<T,  U> res = condition.test(u1) ? (Function<T, U>) ifTrue.apply(u1) : (Function<T, U>)ifFalse.apply(str);

        return res;


    }


}
