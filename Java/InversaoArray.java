/**
 Autor: Pedro Pampolini Mendicino
 Data de criação: 14/03/2022
 Objetivo: Inverte os elementos de um array de forma recursiva e iterativa
 */
public class InversaoArray {

    public static int[] iterativeInversion(int[] lista, int i, int j){
        //Enquanto os valores não se encontrarem, irá continuar as trocas
        while (i < j) {
            //Swap de valores
            int temp = lista[i];
            lista[i] = lista[j];
            lista[j] = temp;

            //Incremento e decremento dos valores para "aproximá-los"
            i++;
            j--;
        }

        return lista;
    }

    //Chamada do método iterativo sem a passagem de mínimo e máximo
    public static int[] iterativeInversion(int[] lista){
        return iterativeInversion(lista, 0, lista.length-1);
    }

    public static int[] inversion(int[] lista, int i, int j){
        if(i < j){
            //Swap de valores
            int temp = lista[i];
            lista[i] = lista[j];
            lista[j] = temp;

            lista = inversion(lista, i+1, j-1);   //Chamada recursiva, com os indíces mais próximos
        }
        
        return lista;
    }

    //Função para chamar o método recursiva sem ser necessário passa os indices
    public static int[] inversion(int[] lista){
        return inversion(lista, 0, lista.length-1);
    }

    //Retorna uma String da lista
    public static String toString(int[] l){
        String s = "["; //Abre a lista
        //Grava o primeiro valor
        if (l.length > 0) {
            s += "" + l[0];
        }
        //Para todos os valores além do primeiro, grava um ", " e então o valor atuaç
        for (int i = 1; i < l.length; i++) {
            s += ", " + l[i];
        }
        s += "]";   //Fecha a lista
        return s;
    }

    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(toString(lista));
        lista = inversion(lista);
        System.out.println(toString(lista));
        lista = iterativeInversion(lista);
        System.out.println(toString(lista));
    }
}