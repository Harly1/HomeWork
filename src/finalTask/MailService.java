package finalTask;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> extends MailServiceParent implements Consumer<Salary>{
    @Override
    public void accept(Salary salary) {

    }

    @Override
    public Consumer<Salary> andThen(Consumer<? super Salary> after) {
        return null;
    }

    @Override
    public void accept(MailMessage mailMessage) {
        super.accept(mailMessage);
    }
}
