import java.time.LocalDate;


public class Pessoa implements Comparable<Funcionario>{


    String nome;
    private LocalDate DataTimeFormatter;
    LocalDate dataNascimento;




    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Pessoa() {

    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {



        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {

        this.dataNascimento = dataNascimento;
    }

    @Override
    public int compareTo(Funcionario o) {
        return nome.compareTo(o.getNome());
    }
}

