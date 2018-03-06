package finalTask;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<MailMessage>{

   public Map<String, List<T>> getMailBox(){


       return new HashMap<String, List<T>>();
   }

    @Override
    public void accept(MailMessage mailMessage) {


    }

    @Override
    public Consumer<MailMessage> andThen(Consumer<? super MailMessage> after) {

        return null;
    }
}
