
public class TesteSistema {

	public static void main(String[] args) {
		Departamento adm = new Departamento("Tecnologia da Informação");

		Funcionario f1 = new Funcionario("André", "111.222.333-44", "Desenvolvedor", 3000.00);
		Funcionario f2 = new Funcionario("Maria", "222.333.444-55", "Analista", 2800.00);
		Funcionario f3 = new Funcionario("Pedro", "333.444.555-66", "Desenvolvedor", 3500.00);
		Funcionario f4 = new Funcionario();


		f4.alterarDados("João Gabriel", "555.667.889-01", "Estagiario", 800.00);

		adm.adicionarFuncionario(f1);
		adm.adicionarFuncionario(f2);
		adm.adicionarFuncionario(f3);
		adm.adicionarFuncionario(f4);

		f1.aplicarReajuste(15.0);

		f3.demitir();

		adm.listarFuncionarios();

		double folha = adm.calcularFolhaSalarial();
		System.out.println("Valor total da folha:" + folha);

	}

}
