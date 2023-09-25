public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João", 30, 101, 2000.00);
        Funcionario f2 = new Funcionario("Maria", 28, 102, 2200.00);
        
        Gerente g = new Gerente("Lucas", 40, 100, 5000.00);
        g.adicionarSubordinado(f1);
        g.adicionarSubordinado(f2);
        
        System.out.println(g.getNome() + " gerencia " + g.getSubordinados().size() + " funcionários.");
    }
}
