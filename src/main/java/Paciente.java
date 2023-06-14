public class Paciente implements Pessoa {
    private String nome;
    private String endereco;

    public Paciente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }


    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirPaciente(this);
    }
}
