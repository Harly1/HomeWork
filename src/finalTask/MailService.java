package finalTask;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Mail> {


    Map<String, List<T>> map = new HashMap<>();

    @Override
    public void accept(Mail mail) {
        String to = mail.getTo();
        Object content = mail.getContent();

        if (map.containsKey(to)) {
            map.get(to).add((T) content);

        } else {
            List<T> list = new ArrayList<>();
            list.add((T) content);
            map.put(to, list);

        }
    }

    public Map<String, List<T>> getMailBox() {
        Map<String, List<T>> newMap = new HashMap<String, List<T>>(map) {
            @Override
            public List<T> get(Object key) {
                if (!map.containsKey(key)) {
                    return super.getOrDefault(key, (List<T>) Collections.<String>emptyList());
                }

                return map.get(key);
            }
        };
        return newMap;

    }
}


