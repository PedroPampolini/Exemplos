/**
 Autor: Pedro Pampolini Mendicino
 Data de criação: 14/03/2022
 Objetivo: Calcula os n termos da sequência fibonacci de forma recursiva e iterativa
 */
public class Fibonacci {
    public static int fibonacciIterativo(int max){
        //Declaração dos valores iniciais
        int a = 1;
        int b = a;
        int c = b;
        for (int i = 0; i < max; i++) {
            //Shift com os valores da sequencia
            a = b;
            b = c;
            c = a + b;
        }
        return a;
    }

    public static int fibonacciRecursivo(int max){
        //enquanto não chegar no limite inferior, continuará na recursão
        if (max <= 1) {
            return max;
        }
        return fibonacciRecursivo(max-1) + fibonacciRecursivo(max-2);   //Soma o primeiro número com o seu próximo
    }

    public static void main(String[] args) {
        int maximo = 15;     //A quantidade de termos necessário, altere como quiser
        System.out.println(fibonacciRecursivo(maximo));
        System.out.println(fibonacciIterativo(maximo));
    }
}
