package estudo;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

     /*   System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        double[] vetor = new double[n];
        // [] é o vetor e dentro dele é o tamanho do vetor. Aqui eu coloco n (do scanner)


        //variavel vai ser i, vai começar com zero "(i=0)"; vai rodar até oq eu querer "(i<n)";
        // e vai incrementar +1 a partir da onde comecei que no caso é i=0 "(i++)"
        int i;
        for (i = 0; i < n; i++) {
            vetor[i] = sc.nextDouble();
        }

        System.out.println("Os tamanho do vetor: " + vetor.length);
    ----------------------------------------------------------------------------------------------
    */


     /*
        System.out.print("Qual tamanho do vetor: ");

        int a = sc.nextInt();
        Produtos[] vetor = new Produtos[a];


        //tem vetor, vai ter for
        // posso trocar o "a" por vetor.length
        for (int p=0; p<a; p++){
            sc.nextLine();
            System.out.print("Qual nome do produto: ");
            String nome = sc.nextLine();
            System.out.print("Quanto custa esse produto: ");
            double preco = sc.nextDouble();
            vetor[p] = new Produtos(nome, preco);
            System.out.println(vetor[p].getNome() + " " + "R$:" + vetor[p].getPreco());
        }
------------------------------------------------------------------------------------------------
*/

        System.out.print("Quantos numeros vai ser digitado: ");
        int v = sc.nextInt();
        int[] vetor = new int[v];
        int i;
        for (i = 0; i < v; i++) {
            System.out.print("Digite o numero: ");
            vetor[i] = sc.nextInt();
        }


        for (i = 0; i < v; i++) {
            System.out.print("Os numeros pares dessa lista: ");
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + "   ");
        }
    }

    }
}