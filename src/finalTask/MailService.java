package finalTask;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Message_Salary> {

    @Override
    public void accept(Message_Salary message_salary) {

    }

    @Override
    public Consumer<Message_Salary> andThen(Consumer<? super Message_Salary> after) {
        return null;
    }

    public Map<String, List<T>> getMailBox(){

        return new HashMap<String, List<T>>(){
            @Override
            public List<T> get(Object key) {
                if (key.equals("H.P. Lovecraft")) {
                    return super.getOrDefault(key, new ArrayList<T>());

                } else {
                    return null;
                }
            }
        };
    }
}
