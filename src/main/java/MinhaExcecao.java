/* Existe uma hierarquia grande de classes que representam exceções. Por exemplo, ArithmeticException é
   filha de RuntimeException, que herda de Exception, que por sua vez é filha da classe mais ancestral das exceções,
   Throwable. Conhecer bem essa hierarquia significa saber utilizar exceções em sua aplicação.

   Throwable é a classe que precisa ser extendida para que seja possível jogar um objeto na pilha
   (através da palavra reservada throw)

   StackOverflowError é um erro da máquina virtual para informar que a pilha de execução não tem mais memória.

   Exceções são separadas em duas grandes categorias: aquelas que são obrigatoriamente verificadas pelo compilador
   e as que não são verificadas. As primeiras são denominadas checked e são criadas através do pertencimento a
   uma hieraquia que não passe por RuntimeException. As segundas são as unchecked, e são criadas como descendentes
   de RuntimeException.

*/

// public class MinhaExcecao extends "RuntimeException" {} Unchecked

public class MinhaExcecao extends Exception { // "checked" - Se a classe herda diretamente Exception o Java força que obrigatoriamente sejam  verificadas pelo compilador
                                              // Por isso deve-se na assinatura de cada metodo colocar o "trows" e o nome da exception class ex: "throws MinhaExcecao".

    public MinhaExcecao(String msg) {
        super(msg);
    }

}
