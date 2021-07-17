package ex007;

public class Tank extends Car{
    private int qntArm=100;

    public Tank(String name, int blind) {
        super(name);
        super.setArm(true); //nao precisa do super, pq é filho da classe Car
        super.setBlind(blind);
        this.qntArm=100;
    }
    
    public void setQntArm(int qntArm){
        this.qntArm+=qntArm;
        if(this.qntArm<0){
            this.qntArm=0;}
        if(this.qntArm>100){
            this.qntArm=100;}
    }
    public int getQntArm(){
        return this.qntArm;
    }

    public void shot(){
        if(this.qntArm>0){
            setQntArm(-1);
        }else{
            System.out.println("No bullets");
        }
    }

    public void info(){
        super.info();
        System.out.printf("Qnt de arm: %d\n",this.qntArm);
    }
}
