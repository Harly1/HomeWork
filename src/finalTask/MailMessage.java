package finalTask;

import java.util.function.Consumer;

public class MailMessage extends Message_Salary {
    String from;
    String to;
    String text;

    public MailMessage(String from, String to, String text){
        this.from = from;
        this.to = to;
        this.text = text;

    }

    public String getFrom(){

        return from;

    }  public String getTo(){

        return to;

    }  public String getContent(){

        return text;

    }

}
