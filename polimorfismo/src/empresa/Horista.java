package empresa;

public class Horista extends Funcionario {
        int totalHoras;
        float valorHoras;

    public Horista(String nome, int totalHoras, float valorHoras) {
        super(nome);
        this.totalHoras = totalHoras;
        this.valorHoras = valorHoras;
    }

    public float pagamento(){
        return totalHoras*valorHoras;
    }
}
