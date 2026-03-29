import java.util.ArrayList;

public class ListaNomes {
    private ArrayList<String> nomes = new ArrayList<>();

    public void adicionarNome(String pnome) {
        nomes.add(pnome);

    }

    public void removerNome(String pnome) {
        nomes.remove(pnome);

    }

    public void listarNomes() {
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    public static void main(String[] args) {
        System.out.println("** Array de nomes... **");

        ListaNomes lista = new ListaNomes();
        lista.adicionarNome("Raphael");
        lista.adicionarNome("Isaac");
        lista.adicionarNome("Francisco");
        lista.adicionarNome("Livia");
        lista.listarNomes();
        System.out.println("** Array de nomes... **");
        lista.removerNome("Francisco");
        lista.listarNomes();
    }

}
