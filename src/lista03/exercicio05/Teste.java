package lista03.exercicio05;

public class Teste {
    public static void main(String[] args) {

        try {
            Datas datas = new Datas(28, 2, 2004);

            System.out.println(datas);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
