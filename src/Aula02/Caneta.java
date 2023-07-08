package Aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    void rabiscar(){
        if (this.tampada = true){
            System.out.println("Erro! Não é possível rabiscar");
        }
        else{
            System.out.println("Estou rabiscando");
        }
    }
    
    void tampar(){
        //c1 chama o método tampada, logo vai ser subistituido pelo "this" no método
        //o "this" faz referência ao próprio objeto que o chamou
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}
