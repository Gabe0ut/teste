package Aula04;

public class App {
    public static void main(String[] args) {
        //Quando o meu construtor recebe parâmetros, precisa colocar aqui também
        Caneta c1 = new Caneta("Nic", "Amarela", 0.4f);
        //c1.setModelo("Bic");
        //c1.setPonta(0.5f);

        c1.status();
    }
}
