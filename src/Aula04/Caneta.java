package Aula04;

import javax.swing.text.FlowView.FlowStrategy;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    //Este é o método contrutor
    //A caneta já fica tampada e azul
    /*public Caneta(){
        this.tampar();
        this.cor = "Azul";
    }*/

    public Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        //poderia ser this.setpPonta(p)
        this.ponta = p;
        this.tampar();
    }

    //Método acessor
    public String getModelo(){
        return this.modelo;
    }

    //Método modificador
    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("\tSobre a caneta");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
