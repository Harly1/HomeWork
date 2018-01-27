package log239;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Run {
    private static final Logger LOGGER = Logger.getLogger("org.stepic.java.logging.ClassA"); ;

    public static void main(String[] args) {
        MailService[] mass = {};
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        /*Spy spy = new Spy(LOGGER);
        spy.processMail(new MailMessage("Vladimir", "Austin Powers", "Hi there"));*/
        LOGGER.addHandler(handler);
        /*Inspector inspector = new Inspector();
        inspector.processMail(new MailPackage("Vova", "Ivan", new Package("weapons",4000)));*/
/*        Thief thief = new Thief(500);
        thief.processMail(new MailPackage("Vova", "Ivan", new Package("weapons",4000)));*/
        UntrustworthyMailWorker untrustworthyMailWorker = new UntrustworthyMailWorker(mass);


    }
}
