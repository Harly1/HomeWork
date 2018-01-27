package log239;

public class Inspector implements MailService {

    @Override
    public Sendable processMail(Sendable mail) {
        if(mail instanceof MailPackage ){
//            System.out.println(((MailPackage) mail).getContent().getContent());
            if(((MailPackage) mail).getContent().getContent().contains("weapons") || ((MailPackage) mail).getContent().getContent().contains("banned substance")){
               throw  new IllegalPackageException();

//            } else if (((MailPackage) mail).getContent().getContent().equals("stones")){
            } else if (((MailPackage) mail).getContent().getContent().contains("stones")){
                throw  new StolenPackageException();
            }
        }
        return mail;
    }
}
