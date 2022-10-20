package empresa;

public class Assalariado extends Funcionario{
    float salario;

    public Assalariado(String nome, float salario) {
        super(nome);
        this.salario = salario;
    }

    public float pagamento (){
        return salario;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome +
                ", Salario: R$" + salario ;
    }
}
