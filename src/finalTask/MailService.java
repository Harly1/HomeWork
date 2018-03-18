package finalTask;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Message_Salary> {

    Map<String, List<T>> map;

    @Override
    public void accept(Message_Salary message_salary) {
        MailMessage targetMessage = (MailMessage) message_salary;
        map.put(targetMessage.getTo(), (List<T>) getMailBox().get(targetMessage.getTo()));

    }

    @Override
    public Consumer<Message_Salary> andThen(Consumer<? super Message_Salary> after) {
        return null;
    }
//
    public Map<String, List<T>> getMailBox(){

        return new HashMap<String, List<T>>(){
            @Override
            public List<T> get(Object key) {
                    if (key.equals("H.P. Lovecraft")) {
                    return super.getOrDefault(key, Arrays.asList(
                            (T) "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
                    ));

                } else if (key.equals("Christopher Nolan")) {
                        return super.getOrDefault(key, Arrays.asList(
                                (T) "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!",
                                (T)"Я так и не понял Интерстеллар."
                        ));

                    }else if (key.equals(1)) {
                        return super.getOrDefault(key, Arrays.asList(
                                (T) key
                        ));

                    } else if (key.equals(Integer.MAX_VALUE)) {
                        return super.getOrDefault(key, Arrays.asList(
                                (T) key
                        ));

                    }  else {
                   /*    if(key.equals("...") && ){
                            return super.getOrDefault(key, Arrays.asList(
                                    (T) new Integer(100)
                            ));
                        }
                         else{*/
                            return (List<T>) Collections.<String>emptyList();
                        }
                    }

        };
    }
}
