// Classe abstrata

abstract class Pesquisador {

    protected String nome;

    protected String areaPesquisa;

    protected int numeroProjetos;

 

    public Pesquisador(String nome, String areaPesquisa, int numeroProjetos) {

        this.nome = nome;

        this.areaPesquisa = areaPesquisa;

        this.numeroProjetos = numeroProjetos;

    }

 

    // Método abstrato

    public abstract double calcularFinanciamento();

}

 

// Classe concreta para Pesquisador Doutor

class PesquisadorDoutor extends Pesquisador {

    public PesquisadorDoutor(String nome, String areaPesquisa, int numeroProjetos) {

        super(nome, areaPesquisa, numeroProjetos);

    }

 

    @Override

    public double calcularFinanciamento() {

        return numeroProjetos * 15000; // R$ 15.000 por projeto

    }

}

 

// Classe concreta para Pesquisador Mestre

class PesquisadorMestre extends Pesquisador {

    public PesquisadorMestre(String nome, String areaPesquisa, int numeroProjetos) {

        super(nome, areaPesquisa, numeroProjetos);

    }

 

    @Override

    public double calcularFinanciamento() {

        return numeroProjetos * 10000; // R$ 10.000 por projeto

    }

}

 

// Classe principal para teste

public class Main {

    public static void main(String[] args) {

        Pesquisador doutor = new PesquisadorDoutor("Dr. Silva", "Física", 3);

        Pesquisador mestre = new PesquisadorMestre("Mestre Santos", "Biologia", 2);

 

        System.out.println(doutor.nome + " - Financiamento: R$ " + doutor.calcularFinanciamento());

        System.out.println(mestre.nome + " - Financiamento: R$ " + mestre.calcularFinanciamento());

    }

} 