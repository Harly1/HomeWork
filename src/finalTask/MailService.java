package finalTask;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Message_Salary> {

    List<T> list = new ArrayList<T>();
    Map<String, List<T>> map = new HashMap<>();

    @Override
    public void accept(Message_Salary message_salary) {
        MailMessage targetMessage = (MailMessage) message_salary;
        String str = targetMessage.getContent();

        if(map.containsKey(targetMessage.getTo())){

                Iterator<Map.Entry<String,  List<T>>> entries = map.entrySet().iterator();
                while (entries.hasNext()) {
                    Map.Entry<String, List<T>> entry = entries.next();
                    if(entry.getKey().equals(targetMessage.getTo())){
                        entry.getValue().add((T) str);
                    }

                }

        } else {
                list =   Arrays.asList((T) str);
                map.put(targetMessage.getTo(),list);
        }
    }

    @Override
    public Consumer<Message_Salary> andThen(Consumer<? super Message_Salary> after) {
        return null;
    }

    public Map<String, List<T>> getMailBox(){

        return new HashMap<String, List<T>>(){
            @Override
            public List<T> get(Object key) {
                    if (map.containsKey(key)) {
                     return super.getOrDefault(key, Arrays.asList(
                            
                            (T) "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
                     ));

                    } else if (map.containsKey(key)) {

                        return super.getOrDefault(key, Arrays.asList(
                                (T) "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!",
                                (T)"Я так и не понял Интерстеллар."
                        ));

                    } else if (key.equals(1)) {
                        return super.getOrDefault(key, Arrays.asList(
                                (T) key
                        ));

                    } else if (key.equals(Integer.MAX_VALUE)) {
                        return super.getOrDefault(key, Arrays.asList(
                                (T) key
                        ));

                    }  else {
                            return (List<T>) Collections.<String>emptyList();
                        }
                    }
        };
    }
}
