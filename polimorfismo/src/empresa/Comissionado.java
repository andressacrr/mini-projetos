package empresa;

public class Comissionado extends Funcionario{
    float vendas, comissao;

    public Comissionado(String nome, float vendas, float comissao) {
        super(nome);
        this.vendas = vendas;
        this.comissao = comissao;
    }

    public float pagamento(){
        return vendas*comissao;
    }

    @Override
    public String toString() {
        return "Nome: " +
                nome +
                ", Vendas: " + vendas +
                ", Comissao: R$" + comissao +
                ", Total salario: R$" + pagamento();
    }
}
