public class Aluno {
    private String nome;
    private int matricula;
    private double nota;

    public Aluno(String nome, int matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    // métodos get e set para encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {

            this.nota = nota;
        } else {
            System.out.println("Nota inválida! deve estar entre 0 e 10.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Matricula: " + matricula + ", Nota: " + nota);
    }
}
