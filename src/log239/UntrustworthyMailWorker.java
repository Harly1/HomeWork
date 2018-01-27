package log239;
import java.util.logging.Logger;
public class UntrustworthyMailWorker implements MailService {
    MailService[] mailServices;
    RealMailService realMailService =new RealMailService();


    public UntrustworthyMailWorker(MailService[] mass) {

       // this.realMailService = new RealMailService();
        this.mailServices = mass;
    }

    @Override
    public Sendable processMail(Sendable mail) {


        for (int i = 0; i < mailServices.length; i++) {
           mail =  mailServices[i].processMail(mail);

        }

        return getRealMailService().processMail(mail);
    }
    public RealMailService getRealMailService () {

        return realMailService;
    }
}
