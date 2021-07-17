package ex007;

public class ex007 {
    public static void main(String[] args){
        Car c1 = new Car("Onix");
        Tank c2 = new Tank("T1", 50);
        Tank c3 = new Tank("T2", 20);

        c3.shot();
        c3.shot();
        c3.shot();
        c3.shot();

        c1.damage(20);
        c2.damage(50);
        c3.damage(10);


        c1.setOn(true);
        c1.info();
        c2.info();
        c3.info();
    }
}
