package estudo;

import java.util.ArrayList;
import java.util.List;
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


     /* // VETOR COM OUTRA CLASSE!!!!
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
    /*
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
------------------------------------------------------------------------------------------------
*/
       /*
        ************************** BOM!!!!!!
        // PORCENTAGEM!!!
        int n;
        System.out.print("Quantas pessoas serao digitadas: ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i=0; i<n; i++){ //esse i é o numero ex: 1,2,3 oq vai incrementar
            System.out.println("Dados da " + (i+1) + " pessoa: "); //i+1 foi para adicionar e dar certinho as 5
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

        //fazer a porcentagem de pessoas com menos de 16 anos, vai contar mesmo

        int contar = 0;
        for (int i=0; i<n; i++){
            if(idade[i] < 16){
                contar += 1;
            }
        }

        double porcentagem = contar * 100.0 / n;                     //%% mostra o simbolo % e o %n linha
        System.out.printf("Porcentagem de pessoas com menos de 16 anos:  %.1f%%%n", porcentagem);

        System.out.println("Nomes das pessoas com menos de 16 anos: ");
        for(int i=0; i<n; i++){
            if(idade[i] < 16){
                System.out.println(nomes[i]);
            }
        }
------------------------------------------------------------------------------------------------------------
*/
        /*
        //COLOCAR O FOR EM : dois pontos

        String vetor [] = new String[] {"Andressa", "Arthur", "Zoe"};

        //ao inves disso
        for (int i=0; i< vetor.length; i++){
            System.out.println(vetor[i]);
        }

        System.out.println("-------------------");
        //faz isso

        for(String qualquer : vetor){   //String pq é de só nomes, qualquer é qualquer nome q eu chamar
                                         //    :  vetor é o nome do meu vetor
            System.out.println(qualquer); // ai chama o nome que criei
        }
*/
//-----------------------------------------------------------------------------------------

        // ARRAYLIST

        List<String> lista = new ArrayList<>();

        lista.add("Andressa");
        lista.add("Zoe");
        lista.add("Arthur");
        lista.add("Kiara");
        lista.add(2, "Lais"); // index = posição

        System.out.println("O tamanho da lista: " + lista.size()); // size = tamanho da lista
        System.out.println("Lista original:");

        for (String original : lista){
            System.out.println(original);
        }

        System.out.println("--------------------------");
          lista.remove(4);
//         lista.remove("Kiara"); tanto faz

        // usar predicado para remover odo mundo que começa com a letra A
        lista.removeIf(original -> original.charAt(0) == 'A');

        for (String original : lista){
            System.out.println(original);
        }

        System.out.println("--------------------------");
        System.out.println("Posicao da Lais: " + lista.indexOf("Lais"));
    }
}