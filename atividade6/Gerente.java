import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {
    private List<Funcionario> subordinados;

    public Gerente(String nome, int idade, int idFuncionario, double salario) {
        super(nome, idade, idFuncionario, salario);
        this.subordinados = new ArrayList<>();
    }

    public void adicionarSubordinado(Funcionario funcionario) {
        subordinados.add(funcionario);
    }

    public void removerSubordinado(Funcionario funcionario) {
        subordinados.remove(funcionario);
    }

    public List<Funcionario> getSubordinados() {
        return subordinados;
    }
}
