
public class Departamento {
    private String nomeDepartamento;
    private Funcionario[] funcionarios;
    private int contador = 0;

    public Departamento(String nomeDepartamento) {
        this.funcionarios = new Funcionario[5];
        this.nomeDepartamento = nomeDepartamento;
    }

    public void adicionarFuncionario(Funcionario f) {
        if (contador < 5) {
            funcionarios[contador] = f;
            contador++;
        } else {
            System.out.println("Departamento lotado. Não é possível adicionar mais funcionários.");
        }
    }

    public double calcularFolhaSalarial() {
        double calculoFolha = 0.0;
        for (int i = 0; i < this.contador; i++) {
            if (this.funcionarios[i].isAtivo()) {
                calculoFolha += this.funcionarios[i].getSalario();
            }
        }
        return calculoFolha;
    }

    public void listarFuncionarios() {
        for (int i = 0; i < this.contador; i++) {
            this.funcionarios[i].exibirDados();
        }
    }
}
