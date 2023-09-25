public class Funcionario extends Pessoa {
    private int idFuncionario;
    private double salario;

    public Funcionario(String nome, int idade, int idFuncionario, double salario) {
        super(nome, idade);
        this.idFuncionario = idFuncionario;
        this.salario = salario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
