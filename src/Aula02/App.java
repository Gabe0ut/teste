package Aula02;
public class App {
    public static void main(String[] args) throws Exception {
        //instanciar objetos
        //tô criando um objeto chamado "c1" que é da classe caneta
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        //c1 chama o método tampada, logo vai ser subistituido pelo "this" no método
        c1.tampar();
        c1.rabiscar();
        c1.status();
    }
}
