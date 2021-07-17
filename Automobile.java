package ex008;

public class Automobile{
    private String name;
    private int type;

    public Automobile(String name, int type){
        this.name=name;
        this.type=type;
    }

    public void info(){
        System.out.printf("Name:%s\n", this.name);
        System.out.printf("Type:%d\n", this.type);
    }
}