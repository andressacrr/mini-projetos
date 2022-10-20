package empresa;

public class Principal {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Andressa");
        f1.pagamento();

        System.out.println();
        System.out.println("Qual o salario do funcionario se for assalariado?: ");
        Assalariado as = new Assalariado("Andressa", 1000);
        System.out.println(as.toString());

        System.out.println();

        System.out.println("Qual salario do funcionario se for comissionado?: ");
        Comissionado cm = new Comissionado("Andressa", 50, 560);
        System.out.println(cm.toString());






    }
}
