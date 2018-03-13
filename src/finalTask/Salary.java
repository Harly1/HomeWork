package finalTask;

import java.util.function.Consumer;

public class Salary extends Message_Salary   {
    String company;
    String owner;
    int    number;

    public Salary(String company, String owner,int number){
        this.company = company;
        this.owner = owner;
        this.number = number;

    }

    public String getTo(){
        return owner;
    }

}
