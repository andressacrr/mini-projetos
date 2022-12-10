import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // dia, mês, ano
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance();
        Funcionario.Funcao operador = Funcionario.Funcao.Operador;
        Funcionario.Funcao coordenador = Funcionario.Funcao.Coordenador;
        Funcionario.Funcao diretor = Funcionario.Funcao.Diretor;
        Funcionario.Funcao eletrecista = Funcionario.Funcao.Eletrecista;
        Funcionario.Funcao gerente = Funcionario.Funcao.Gerente;
        Funcionario.Funcao contador = Funcionario.Funcao.Contador;
        Funcionario.Funcao recepicionista = Funcionario.Funcao.Recepicionista;

        Funcionario p1 = new Funcionario("Maria", LocalDate.of(2000, 10, 18), BigDecimal.valueOf(2009.44),
                operador.name());
        Funcionario p2 = new Funcionario("João", LocalDate.of(1990, 05, 12), BigDecimal.valueOf(22284.38),
                operador.name());
        Funcionario p3 = new Funcionario("Caio", LocalDate.of(1961, 05, 02), BigDecimal.valueOf(9836.14),
                coordenador.name());
        Funcionario p4 = new Funcionario("Miguel", LocalDate.of(1988, 10, 14), BigDecimal.valueOf(19119.88),
                diretor.name());
        Funcionario p5 = new Funcionario("Alice", LocalDate.of(1995, 01, 05), BigDecimal.valueOf(2234.68),
                recepicionista.name());
        Funcionario p6 = new Funcionario("Heitor", LocalDate.of(1999, 11, 19), BigDecimal.valueOf(1582.72),
                operador.name());
        Funcionario p7 = new Funcionario("Arthur", LocalDate.of(1993, 03, 31), BigDecimal.valueOf(4071.84),
                contador.name());
        Funcionario p8 = new Funcionario("Laura", LocalDate.of(1994, 07, 8), BigDecimal.valueOf(3017.45),
                gerente.name());
        Funcionario p9 = new Funcionario("Heloísa", LocalDate.of(2003, 05, 24), BigDecimal.valueOf(1606.85),
                eletrecista.name());
        Funcionario p10 = new Funcionario("Helena", LocalDate.of(1996, 02, 9), BigDecimal.valueOf(2799.93),
                gerente.name());

        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(p1);
        funcionarios.add(p2);
        funcionarios.add(p3);
        funcionarios.add(p4);
        funcionarios.add(p5);
        funcionarios.add(p6);
        funcionarios.add(p7);
        funcionarios.add(p8);
        funcionarios.add(p9);
        funcionarios.add(p10);

        // Tópico 3.1 = Inserir todos os funcionários, na mesma ordem e informações da tabela acima.
        System.out.println("-Lista inicial: ");
        System.out.println("Nome  |  Data nascimento | Salário   | Função");
        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome() + "  |  " + f.getDataNascimento().format(formato) + "  |  "
                    + formatoMoeda.format(f.getSalario()) + "  |  " + f.funcao);
        }

        // Tópico 3.2 = Remover o funcionário “João” da lista.
        // Colocar em um metodo e chamar um nome. Porem nao estou conseguindo aplicar desse jeito.
        System.out.println("---------------------------------------------------");
        System.out.println("-Nova lista excluindo o funcionario João: ");
        System.out.println("Nome  |  Data nascimento | Salário   | Função");
        funcionarios.remove(p2);
        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome() + "  |  " + f.getDataNascimento().format(formato) + "  |  "
                    + formatoMoeda.format(f.getSalario()) + "  |  " + f.funcao);
        }

        // Tópico 3.4 = Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor.
        System.out.println("-------------------------------------------------------------------");
        System.out.println("-Nova lista com aplicação do aumento de salário de 10%: ");
        System.out.println("Nome  |  Data nascimento | Salário   | Função");

        for (Funcionario f : funcionarios) {
            BigDecimal aumentoDezPorcento = new BigDecimal("1.1");
            f.setSalario(aumentoDezPorcento.multiply(f.salario));
            System.out.println(f.getNome() + "  |  " + f.getDataNascimento().format(formato) + "  |  "
                    + formatoMoeda.format(f.getSalario()) + "  |  " + f.funcao);
        }

        // criei um enum, porém nao consegui puxar os nomes da tabela, entao tive que fazer "na mão"
        // Tópico 3.5 = Agrupar os funcionários por função em um MAP, sendo a chave a
        // “função” e o valor a “lista de funcionários”.
        HashMap<String, String> funcaoNome = new HashMap();
        for (Funcionario f : funcionarios) {
            funcaoNome.put(operador.name(), "Maria, Heitor");
            funcaoNome.put(diretor.name(), "Miguel");
            funcaoNome.put(coordenador.name(), "Caio");
            funcaoNome.put(eletrecista.name(), "Heloísa");
            funcaoNome.put(gerente.name(), "Helena, Laura");
            funcaoNome.put(contador.name(), "Arthur");
            funcaoNome.put(recepicionista.name(), "Alice");
        }

        // Tópico 3.6 = Imprimir os funcionários, agrupados por função.
        System.out.println("-------------------------------------------------------------------");
        System.out.println("-Agrupando por função: ");
        System.out.println("Eletricista: " + funcaoNome.get(eletrecista.name()));
        System.out.println("Gerente: " + funcaoNome.get(gerente.name()));
        System.out.println("Diretor: " + funcaoNome.get(diretor.name()));
        System.out.println("Operador: " + funcaoNome.get(operador.name()));
        System.out.println("Coordenador: " + funcaoNome.get(coordenador.name()));
        System.out.println("Contador: " + funcaoNome.get(contador.name()));

        // Tópico 3.8 = Imprimir os funcionários que fazem aniversário no mês 10 e 12
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Aniversariantes do mês 10 e do mês 12: ");
        for (Funcionario f : funcionarios) {
            if (f.dataNascimento.getMonth() == Month.of(10) || f.dataNascimento.getMonth() == Month.of(12)) {
                System.out.println(f.getNome() + " , " + f.getDataNascimento().format(formato));
            }
        }

        // Tópico 3.9 = Imprimir o funcionário com a maior idade, exibir os atributos:
        // nome e idade.
        // Não consegui fazer, espero aprender com vocês.
        /*
         * for (Funcionario f : funcionarios) { System.out.println(
         * f.dataNascimento.getYear()); // System.out.println(f.getNome() + " , " +
         * f.getDataNascimento().format(formato)); }
         */

        // Tópico 3.10 = Imprimir a lista de funcionários por ordem alfabética.
        System.out.println("-------------------------------------------------------------------");
        System.out.println("-Lista em ordem alfabética: ");
        System.out.println("Nome  |  Data nascimento | Salário   | Função");

        Collections.sort(funcionarios);
        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome() + "  |  " + f.getDataNascimento().format(formato) + "  |  "
                    + formatoMoeda.format(f.getSalario()) + "  |  " + f.funcao);
        }

//
//            //Tópico 3.11 = Imprimir o total dos salários dos funcionários.
        System.out.println("-------------------------------------------------------------------");
        System.out.println("-Soma de todos os salários dos funcionários: "
                + formatoMoeda.format(p1.salario.add(p3.salario).add(p4.salario).add(p5.salario).add(p6.salario)
                .add(p7.salario).add(p8.salario).add(p9.salario).add(p10.salario)));
        /*
         * Tentei fazer com um for, mas nao consegui muito bem. for (Funcionario f :
         * funcionarios){ BigDecimal soma; soma =
         * f.getSalario().add(BigDecimal.valueOf(funcionarios.size()));
         * System.out.println(soma); } for (int i = 0; i < funcionarios.size(); i++) {
         * Funcionario f = (Funcionario) funcionarios; BigDecimal soma; soma =
         * f.getSalario().add(new BigDecimal(i)); System.out.println(soma); } /*
         */
//        public BigDecimal divide(BigDecimal Object divisor;
//        divisor){

        // Tópico 3.12 = Imprimir quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212.00.
//        BigDecimal salarioMinimo = BigDecimal.valueOf(1212);
//        BigDecimal pegarSalario = p1.getSalario();
//        System.out.println(pegarSalario.divide(salarioMinimo));

        /*
         * System.out.println(
         * "-------------------------------------------------------------------"); for
         * (Funcionario f : funcionarios) {
         * BigDecimal salarioMinimo = BigDecimal.valueOf(1212);
         * BigDecimal pegarSalario = f.getSalario();
         * try {
         * System.out.println(f.getSalario().divide(salarioMinimo));
         * } catch (Exception erro) {
         * System.out.println(formatoMoeda.format(pegarSalario.divide(salarioMinimo)),
         * RoundingMode.UP); } } return divide; }
         */

    }
}
