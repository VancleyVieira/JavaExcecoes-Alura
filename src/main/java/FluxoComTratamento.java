//Instanciando um exceção

public class FluxoComTratamento {

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

        //ArithmeticException ex = new ArithmeticException("Deu erro"); //Instanciando ArithmeticException
        //throw ex; // Lançando exceção

        // Não é necessário guardar a exceção em uma referência, você pode lançá-la diretamente em uma linha só:
        throw new ArithmeticException("Deu erro");

        //System.out.println("Fim do metodo2"); // Linha comentada pois após lançar a exceção o metodo é
                                                // finalizado instantaneamente como um return e tudo que esta em baixo
                                                // da exceção lançada não compila mais
    }
}
