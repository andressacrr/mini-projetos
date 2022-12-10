import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends Pessoa{
    BigDecimal salario;
    String funcao;

    public Funcionario(String maria, LocalDate of, BigDecimal salario, Funcao funcao) {
    }


    public enum Funcao {
        Operador,
        Diretor,
        Contador,
        Coordenador,
        Eletrecista,
        Gerente,
        Recepicionista;

    }


    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }


    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return getNome();
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}

