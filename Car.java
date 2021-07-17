package ex007;

public class Car {
    public String name;
    private boolean on;
    private boolean destroied; 
    private int blind=0;
    private boolean arm;

    public Car(String name){
        this.name=name;
    }

    public boolean getOn(){
        return this.on;
    }
    public void setOn(boolean on){
        this.on=on;
    }

    public boolean getDestroied(){
        return this.destroied;
    }
    

    public boolean getArm(){
        return this.arm;
    }
    public void setArm(boolean arm){
        this.arm=arm;
    }

    public int getBlind(){
        return this.blind;
    }
    public void setBlind(int b){
        this.blind=b;
    }

    public void damage(int damage){
        blind-=damage;
        if(blind<=0){
            this.blind=0;
            this.on=false;
            this.destroied=true;
        }
    }

    public void info(){
        System.out.println("-----------------------------------------------");
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Car is %s\n", this.on ? "on" : "off");
        System.out.printf("Destroied: %s\n", this.destroied ? "Yes" : "No");
        System.out.printf("Blindagem: %d\n", this.blind);
        System.out.printf("Arm: %s\n", this.arm ? "Yes" : "No");
    }

}
