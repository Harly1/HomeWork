package funcInterface;

import java.util.Objects;
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

//            Function<T,  U> res = condition.test(T t) ?  ifTrue.apply(T t) : ifFalse.apply(T t);

        return null;
    }
}