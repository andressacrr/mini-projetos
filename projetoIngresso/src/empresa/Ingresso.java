package empresa;

public class Ingresso {
    public String nomeEvento;
    public double valor;

    public Ingresso(String nomeEvento, double valor) {
        this.nomeEvento = nomeEvento;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Nome do evento: "
                + nomeEvento
                + "\n"
                + "Valor: R$ "
                + valor;
    }
}
