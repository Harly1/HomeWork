package finalTask;

public class Salary extends Message_Salary   {
    String company;
    String owner;
    int    number;

    public Salary(String company, String owner,int number){
        this.company = company;
        this.owner = owner;
        this.number = number;

    }

    public Integer getTo(){
        return number;
    }

}
