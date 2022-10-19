package empresa;

public class IngressoVip extends Ingresso{
    public double adicional;

    public IngressoVip(String nomeEvento, double valor, double adicional) {
        super(nomeEvento, valor);
        this.adicional = adicional;
    }

    @Override
    public String toString() {
        return "Para valor VIP: R$ "
                + adicional
                + "\n"
                + "Valor total com adicional para VIP: R$ "
                + (valor + adicional);


    }

}
