package anotacoesBasicas;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Anotacoes {
//	    public static void main(String[] args) {

//	        int numero, a, b, neg;
//	        Scanner  dinheiro = new Scanner(System.in);
	//
//	        System.out.println("informe um numero: ");
//	        numero = dinheiro.nextInt();
//	        neg = dinheiro.nextInt();
	//
//	        if (numero >= 0) {
//	            a = numero;
//	        } else {
//	            b = neg;
//	        }
//	        System.out.println(numero);
//	        System.out.println(neg);
	//-----------------------------------------------------------------------

//	        int numero, p = 0, i = 0;
//	        Scanner teclado = new Scanner(System.in);
//	        System.out.print("informe um numero: ");
//	        numero = teclado.nextInt();
	//
//	        if (numero % 2 == 0){
//	            p = numero;
//	        }else {
//	            i = numero;
//	        }
//	        System.out.println(p);
//	        System.out.println(i);
	//-----------------------------------------------------------------------

//	        float al, pi;
//	        char sexo;
//	        Scanner teclado = new Scanner(System.in);
//	        System.out.println("informe a sua altura: ");
//	        al = teclado.nextFloat();
	//
//	        System.out.println("informe seu sexo: ");
//	        sexo = teclado.next(). charAt(0);
	//
//	        if (sexo == 'm'){
//	            pi = (float) (72.7 * al) - 58;
//	            System.out.println("seu peso ideal é: " + pi);
//	        }
//	        if(sexo == 'f'){
//	            pi = (float) (62.1 * al) - (float) 44.7;
//	            System.out.println("seu peso ideal é: " + pi);
//	        }
//-----------------------------------------------------------------------

//	        float p, m;
//	        String e;
//	        Scanner teclado = new Scanner(System.in);
	//
//	        System.out.println("Informe o numero de peixes: ");
//	        p = teclado.nextFloat();
	//
//	        if (p > 50) {
//	            m = (float) (p - 50) * (float) 4.00;
//	            System.out.printf("voce pagara em multas %.2f : ", m);
//	        }else {
//	            m = 0;
//	            e = "0";
//	            System.out.println("multas: " + m);
//	            System.out.println("excesso: " + e);
//	        }

	//-----------------------------------------------------------------------
//	        int a;
//	        Scanner teclado = new Scanner(System.in);
//	        System.out.println("informe um numero: ");
//	        a = teclado.nextInt();
	//
//	        if (a % 2 == 0) {
//	            if (a > 0) {
//	                System.out.printf("O numero %d eh par e positivo \n ", a);
//	            } else {
//	                System.out.printf("O numero %d eh par e negativo. \n ", a);
//	            }
//	        }else {
//	            if (a > 0) {
//	                System.out.printf("O nuemro %d eh impar e positivo \n", a);
//	            } else {
//	                System.out.printf("O numero %d eh impar e negativo \n", a);
//	            }
//	        }
	//-----------------------------------------------------------------------
//	            int idade = 0;
//	            Scanner teclado = new Scanner(System.in);
//	            System.out.println("Qual sua idade? ");
//	            idade = teclado.nextInt();
	//
//	            if(idade >= 5 && idade <= 7){
//	                idade = teclado.nextInt();
//	            System.out.println("Categoria infantil -a");
//	        } if (idade >=8 && idade <= 10){
//	                System.out.println("categoria oi");
//	        }

	//-----------------------------------------------------------------------
//	        int n, maior = 0;
//	        Scanner teclado = new Scanner (System.in);
//	        System.out.println("Informe um numero: ");
//	        n = teclado.nextInt();
	//
//	        //while significa enquanto, é o looping
//	        while (n != 0){ //enquanto o n for diferente de zero...
//	            if (n > maior) {
//	                maior = n;
//	            }    // se o numero for maior que zero, continua, ate ele ser zero, pq eu declarei "maior" = 0
//	                System.out.println("Informe outro numero: ");
//	                n = teclado.nextInt();
//	        }
//	            System.out.printf("O maior numero: %d", maior);


//	        for (int numero = 1; numero <= 100; numero++) { // incremento + 1
//	            if (numero % 3 == 0) {   // o numero dividido por 3 der resto 0 : é divisivel por 3
//	                System.out.print(numero);
//	                System.out.print("/");
//	            }
//	        }

//	        for (int i = 100; i <= 200; i++) {
//	            if (i % 2 != 0){
//	                System.out.print(i);
//	                System.out.print(";");
	//
//	            }
//	        }

	//-----------------------------------------------------------------------
//	        String nome, senha;
//	        Scanner teclado = new Scanner(System.in);
//	        System.out.println("informe o nome: ");
//	        nome = teclado.next();
//	        System.out.println("informe a senha: ");
//	        senha = teclado.next();
	//
//	        while (nome.equals(senha) ) { // compara 2 strings, se for igual
//	            System.out.println("Erro");
//	            System.out.println("informe o nome: ");
//	            nome = teclado.next();
//	            System.out.println("informe a senha: ");
//	            senha = teclado.next();
//	        }

	//-----------------------------------------------------------------------
//	        int numero, i;
//	        Scanner teclado = new Scanner(System.in);
//	        System.out.println("informe um numero de 1 a 10: ");
//	        numero = teclado.nextInt();
	//
//	        while (numero < 1 || numero >10){ // NAO PRECISAVA DISSO
//	            System.out.println("escolhe um numero de 1 a 10!!!:");
//	            numero = teclado.nextInt();
//	        }
	//
//	        for (i = 1; i <= 10; i++) { // cuidado, for nao finaliza com ;
//	            System.out.printf(" %d X %d = %d\n", numero, i, (numero * i));
//	        }

	//-----------------------------------------------------------------------
//	        int n1, n2, soma;
//	        Scanner oi = new Scanner(System.in);
//	        System.out.println("escreva o n1:");
//	        n1 = oi.nextInt();
//	        System.out.println("escrava o n2: ");
//	        n2 = oi.nextInt();
	//
//	        soma = n1 + n2;
//	        System.out.println("a soma é: " + soma);


	//-----------------------------------------------------------------------
//	        //Jõao de 10 anos ganha 1000 reais por mes
//	        // s = texto / d = inteiro / f = ponto flutuante / n = linha
	//
//	        String nome = "Jõao";
//	        int idade = 10;
//	        double ganha = 1000;
//	        System.out.printf("%s de %d anos ganha %.2f reais por mes", nome, idade, ganha);

	//-----------------------------------------------------------------------
//	        double B,b,h, area;
//	        B = 8.0;
//	        b = 6.0;
//	        h = 5.0;
	//
//	        area = (B + b) / (2 * h);
//	        System.out.println(area);
	//-----------------------------------------------------------------------
	
	//	            int a,b, soma;
//	            Scanner sc = new Scanner(System.in);
//	            a = sc.nextInt();
//	            b = sc.nextInt();
//	            soma = a + b;
////	        System.out.println("A soma de " +  a + " + " + b  +  " é igual "  +  soma);
////	        System.out.println("SOMA = " + soma);
//	        sc.close();
	
	//-----------------------------------------------------------------------
//	        Scanner sc = new Scanner(System.in);
	//
//	            String dia;
//	            int x = sc.nextInt();
	//
//	            switch (x) { //troca
//	                case 1:
//	                    dia = "domingo";
//	                    break;
//	                case 2:
//	                    dia = "segunda";
//	                    break;
//	                case 3:
//	                    dia = "terca";
//	                    break;
//	                case 4:
//	                    dia = "quarta";
//	                    break;
//	                default:
//	                    dia = "valor invalido";
//	                    break;
//	            }
//	        System.out.println("o dia da semana é: " + dia);

	//
	//-----------------------------------------------------------------------
	//
//	            Scanner sc = new Scanner(System.in);
//	            int n;
//	            System.out.println("escreva um numero: ");
//	            n = sc.nextInt();
	//
	//
//	            while (n != 2002){
//	                System.out.println("senha incorreta");
//	                System.out.println("escreva outro numero: ");
//	                n = sc.nextInt();
//	            }
//	        System.out.println("acesso permitido");


	//-----------------------------------------------------------------------
//	        Scanner sc = new Scanner(System.in);
//	        int x = sc.nextInt();
//	        int y = sc.nextInt();
	
//	        while (x != 0 && y != 0) { // enquanto (condição)
//	            if (x > 0 && y > 0){
//	                System.out.print("primeiro quadrante");
//	            }
//	            else if (x < 0 && y > 0){
//	                System.out.print("segundo quadrante");
//	            }
//	            else if (x < 0 && y < 0){
//	                System.out.print("terceiro quadrante");
//	            }
//	            else {
//	                System.out.print("quarto quadrante");
//	            }
//	                x = sc.nextInt();
//	                y = sc.nextInt();
//	        }
	
	//-----------------------------------------------------------------------
	
//	            Scanner sc = new Scanner(System.in);
//	            int alcool;
//	            int diesel;
//	            int gasolina;
//	            int tipo = sc.nextInt();
	//
//	            while (tipo != 4) {
//	                if (tipo == 1) {
//	                    System.out.println("alcool");
//	                } else if (tipo == 2) {
//	                    System.out.println("gasolina");
//	                }else if (tipo == 3){
//	                    System.out.println("diesel");
//	                }else {
//	                    System.out.println("ERRO. informe outro numero: ");
//	                }
//	            tipo = sc.nextInt();
	//
//	            }
	//-----------------------------------------------------------------------
//	        Scanner sc = new Scanner(System.in);
	
//	        int alcool = 0;
//	        int gasolina = 0;
//	        int diesel = 0;
	
//	        int tipo = sc.nextInt();
	
//	        while (tipo != 4) {
//	            if (tipo == 1) {
//	                alcool += 1;
//	            }
//	            else if (tipo == 2) {
//	                gasolina += 1;
//	            }
//	            else if (tipo == 3) {
//	                diesel += 1;
//	            }
	
//	            tipo = sc.nextInt();
//	        }
	
//	        System.out.println("MUITO OBRIGADO");
//	        System.out.println("Alcool: " + alcool);
//	        System.out.println("Gasolina: " + gasolina);
//	        System.out.println("Diesel: " + diesel);

	//-----------------------------------------------------------------------
//	        String hora = "hora:minuto";
//	        System.out.println("informe a hora: ");
//	        Scanner sc = new Scanner(System.in);
//	        String array[] = new String[2];
//	        hora = sc.next();
//	        array = hora.split(":");
	//
//	        if (Integer.parseInt(array[0]) < 11 && Integer.parseInt(array[1]) < 59) {
//	            System.out.println("bom dia");
//	        } else if (Integer.parseInt(array[0]) == 16 && Integer.parseInt(array[1]) == 20 ) {
//	            System.out.println("Snoop Dogg");
//	        }
//	        else  if ((Integer.parseInt(array[0]) > 11) && (Integer.parseInt(array[0]) < 18) && Integer.parseInt(array[1]) < 59) {
//	            System.out.println("boa tarde");
//	        }
//	        if (Integer.parseInt(array[0]) > 19 && Integer.parseInt(array[0]) < 24 && Integer.parseInt(array[1]) < 59) {
//	            System.out.println("boa noite");
//	        }
//	        if (Integer.parseInt(array[0]) > 24 || Integer.parseInt(array[1]) > 59) {
//	            System.out.println("te odeio gabriele, nao tente me enganar");
//	        }

	//-----------------------------------------------------------------------
	//for (inicio (executa somente na primeira vez); condição (executa e pula fora); incremento (executar toda vez depois de voltar)

//	        Scanner teclado = new Scanner(System.in);
//	        String curso;
//	        int numeroMatricula;
//	        int valor = 400;
	//
//	        System.out.println("qual curso quer se inscrever? ");
//	        curso = teclado.next();
//	        System.out.println("qual numero da matricula? ");
//	        numeroMatricula = teclado.nextInt();
//	        System.out.println("esse curso esta no valor de R$: " + valor);




	    }


