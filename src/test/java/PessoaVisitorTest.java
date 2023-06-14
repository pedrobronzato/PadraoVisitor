import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {


    @Test
    void deveExibirMedico() {
        Medico medico = new Medico(123123, "Carlos", "Cardiologia");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Medico{CRM=123123, nome='Carlos', especialidade=Cardiologia}", visitor.exibir(medico));
    }

    @Test
    void deveExibirPaciente() {
        Paciente paciente = new Paciente("Maria", "Rua halfeld, 1502");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Paciente{endereco=Rua halfeld, 1502,nome='Maria'}", visitor.exibir(paciente));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 2000.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Funcionario{setor=1, nome='Pedro', salario=2000.0}", visitor.exibir(funcionario));
    }

}