package finalTask;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Message_Salary> {

    Map<String, List<T>> map = new HashMap<>();

    @Override
    public void accept(Message_Salary message_salary) {
        MailMessage targetMessage = (MailMessage) message_salary;
        String str = targetMessage.getContent();



/*        HashMap<String,Object> map=new HashMap<String,Object>();
        Set<Map.Entry<String,Object>> entrySet=map.entrySet();

        Object desiredObject=new Object();//что хотим найти
        for (Map.Entry<String,Object> pair : entrySet) {
            if (desiredObject.equals(pair.getValue())) {
                return pair.getKey();// нашли наше значение и возвращаем  ключ
            }
        }*/


        if(map.containsKey(targetMessage.getTo())){



            /*for(Map.Entry<String, List<T>> item: map.entrySet()){
                item.getKey()
            }*/

        } else {

        map.put(targetMessage.getTo(),

                Arrays.asList((T) str ));
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

                    }else if (key.equals(1)) {
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
