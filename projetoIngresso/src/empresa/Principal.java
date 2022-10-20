package empresa;

public class Principal {
    public static void main(String[] args) {

        Ingresso i = new Ingresso("Hopi hari", 100);
            System.out.println(i.toString());


        IngressoVip iv = new IngressoVip("Hopi hari", 100, 50);
              System.out.println();
              System.out.println(i.toString());
              System.out.println(iv.toString());
    }
}
