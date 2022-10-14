public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");

        // Comando try responsavel por "pegar" ou separar um metodo ou linha de codigo que possa haver uma exceção a ser tratada
        try {
            metodo1();
        }catch (ArithmeticException | NullPointerException ex){ // comando catch responsavel por tratar a exceção
            String mensagem = ex.getMessage(); // nesta linha de codigo é guardada uma mensagem de qual excecao foi localizada para a baixo imprimir
            System.out.println("Exception" + mensagem);
            ex.printStackTrace(); // Este comando imprime os rastros que a excecao deixou
        }

        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);

            // Exemplo de uma exceção ArithmeticException
            // int a = 1;
            // int b = 2;
            //int calc = a + b / 0;

            // Exemplo de uma exceção NullPointerException
            Conta conta = null;
            conta.saca();
        }
        System.out.println("Fim do metodo2");
    }
}