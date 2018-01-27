package log239;

public class Thief implements MailService {
    int minCost = 0;
    int summPrice = 0;

    public Thief(int minCost) {
        this.minCost = minCost;

    }

    public int getStolenValue() {
        return summPrice;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if(mail instanceof MailPackage && ((MailPackage) mail).getContent().getPrice()>=minCost){
            MailPackage newMail = new MailPackage(((MailPackage) mail).from,((MailPackage) mail).to, new Package("stones instead of "+((MailPackage) mail).getContent().getContent(),0));
            summPrice += ((MailPackage) mail).getContent().getPrice();
            return  newMail;
        }
        return mail;
    }
}
