public class Main {
        public static void main(String[] args) {
            System.out.println("** Array de nomes... **");

            ListaNomes lista = new ListaNomes();
            lista.adicionarNome("Raphael");
            lista.adicionarNome("Isaac");
            lista.adicionarNome("Francisco");
            lista.adicionarNome("Livia");

            lista.listarNomes();
        }

    }