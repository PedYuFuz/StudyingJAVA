package ex008;

public class Airplane extends Automobile{
    private int category;

    public Airplane(String name, int category){
        super(name, category);
        this.category=category;
    }

    public void info(){
        super.info();
        System.out.println(category);
    }
}
