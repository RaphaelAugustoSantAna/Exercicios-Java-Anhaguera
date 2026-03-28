public static void main(String[] args) {
        System.out.println("Tipos de Array");

        GerenciadorArray ga = new GerenciadorArray(10);
        ga.inserir(5);
        ga.inserir(10);
        ga.inserir(15);
        ga.exibir();
    }