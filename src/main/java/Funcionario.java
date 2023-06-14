public class Funcionario implements Pessoa {

    private int setor;
    private String nome;
    private float salario;

    public Funcionario(int setor, String nome, float salario) {
        this.setor = setor;
        this.nome = nome;
        this.salario = salario;
    }

    public int getSetor() {
        return setor;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirFuncionario(this);
    }
}
