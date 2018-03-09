package finalTask;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

        return new HashMap<String, List<T>>();
    }


}
