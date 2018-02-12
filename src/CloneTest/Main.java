package CloneTest;

public class Main implements Cloneable {

    public int i = 4;
    public String r = String.valueOf("end");
    public H h = new H();


    Main(int i, String str, H h){
        this.i = i;
        this.r = str;
        this.h = h;

    }

    public static class H {
        public int y = 1;


    }


    public static void main(String[] args) throws CloneNotSupportedException {
    Main m = new Main(12,"new",null);
    Main t = new Main(0,"",new H());
        t = (Main)m.clone();
        System.out.println("Переменная " + t.i + " " + "ссылка " + t.r + " " + t.h.toString());

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }



}
