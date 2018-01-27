package logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Java {
     static final Logger LOGGERJAVA = Logger.getLogger("org.stepic.java");
     static final Logger LOGGERA = Logger.getLogger("org.stepic.java.logging.ClassA");
     static final Logger LOGGERB = Logger.getLogger("org.stepic.java.logging.ClassB");

    public static void main(String[] args) {
//        LOGGERA.log(Level.ALL,"I am loggin");
        LOGGERA.setLevel(Level.ALL);
        LOGGERB.setLevel(Level.WARNING);

        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new XMLFormatter());
        LOGGERJAVA.addHandler(handler);
        LOGGERJAVA.setUseParentHandlers(false);


    }
}
