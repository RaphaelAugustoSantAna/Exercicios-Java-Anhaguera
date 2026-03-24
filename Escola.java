public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Raphael", 1, 10);
        aluno1.setNota(10);

        aluno1.exibirInformacoes();
        System.out.println("*********************************");

        Avaliacao alunoGrad = new AlunoGraduacao("Isaac", 2, 7);
        Avaliacao alunoPos = new AlunoPosGraduacao("Francisco", 3, 7);

        System.out.println("Média do Isaac (Graduação)..:" + alunoGrad.calcularMedia());
        System.out.println("Média do Francisco (pós-graduação)..:" + alunoPos.calcularMedia());
    }
}
