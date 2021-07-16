public class Jogador {
    private final int maxVidas = 5;
    private int id=0;
    private int vidas = 0;


    public Jogador(String name, int id){
        this.id = id;
        System.out.printf("Welcome, %s! ID:%d\n", name, id);        
    }

    public int getVidas(){
        //Como vidas é privada, cria-se um metodo que pega a variavel privada e 
        //dê acesso em outras classes
        return this.vidas;
    }


    public void setVidas(int vidas){
        //consegue mudar a vida
        if(vidas>maxVidas)
            vidas=3;
        else if(vidas<0)
            vidas=0;
        this.vidas = vidas;
    }

    public void addVidas(){
         
    } 
    
}
