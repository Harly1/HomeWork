package log239;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService {
    Logger LOGGER;

    public Spy(Logger LOGGER) {
    this.LOGGER = LOGGER;

    }
    @Override
    public Sendable processMail(Sendable mail) {
        if(mail instanceof MailMessage){
            if(((MailMessage) mail).from.equals("Austin Powers")||((MailMessage) mail).to.equals("Austin Powers")){
                LOGGER.log(Level.WARNING, "Detected target mail correspondence: from " + ((MailMessage) mail).from + " to " + ((MailMessage) mail).to + " " + "\"" + ((MailMessage) mail).getMessage() + "\"");
            } else {
                LOGGER.log(Level.INFO, "Usual correspondence: from "+((MailMessage) mail).from + " to "+ ((MailMessage) mail).to);

            }

        }
        return mail;
    }
}
