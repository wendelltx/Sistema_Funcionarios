
public class Funcionario {
    private String nome;
    private String cpf;
    private String cargo;
    private double salario;
    private boolean ativo;

    public Funcionario(String nome, String cpf, String cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
        this.ativo = true;
    }

    public Funcionario() {
        this.nome = "Indefinido";
        this.cpf = "000.000.000-00";
        this.cargo = "Indefinido";
        this.salario = 0.0;
        this.ativo = false;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public double getSalario() {
        return this.salario;
    }

    public void alterarDados(String novoNome, String novoCpf, String novoCargo, double novoSalario) {
        this.nome = novoNome;
        this.cpf = novoCpf;
        this.cargo = novoCargo;
        this.salario = novoSalario;
    }

    public void aplicarReajuste(double percentual) {
        this.salario = this.salario + (this.salario * (percentual / 100));
    }

    public void demitir() {
        this.ativo = false;
        System.out.println("Funcionário " + this.nome + " demitido!");
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salário: " + this.salario);
        if (this.ativo == true) {
            System.out.println("ATIVO");
        } else {
            System.out.println("INATIVO");
        }

    }
}
