public class PessoaVisitor implements Visitor {
    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirMedico(Medico medico) {
        return "Medico{" +
                "CRM=" + medico.getCrm() +
                ", nome='" + medico.getNome() + '\'' +
                ", especialidade=" + medico.getEspecialidade() +
                '}';
    }

    @Override
    public String exibirPaciente(Paciente paciente) {
        return "Paciente{" +
                "endereco=" + paciente.getEndereco() +
                ",nome='" + paciente.getNome() + '\'' +
                '}';
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "Funcionario{" +
                "setor=" + funcionario.getSetor() +
                ", nome='" + funcionario.getNome() + '\'' +
                ", salario=" + funcionario.getSalario() +
                '}';
    }
}
