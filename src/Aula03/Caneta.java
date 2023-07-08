package Aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    public void rabiscar(){
        if (this.tampada = true){
            System.out.println("Erro! Não é possível rabiscar");
        }
        else{
            System.out.println("Estou rabiscando");
        }
    }
    
    protected void tampar(){
        //c1 chama o método tampada, logo vai ser subistituido pelo "this" no método
        //o "this" faz referência ao próprio objeto que o chamou
        this.tampada = true;
    }

    protected void destampar(){
        this.tampada = false;
    }
}
