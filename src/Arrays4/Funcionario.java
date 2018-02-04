package Arrays4;
class Funcionario {
	String nome;
	String departamento;
	double salario;
	String dataEntradaNoBanco;
	Data dataEntradaNoBancoData;
	String rg;

	void recebeAumento(double aumento) {
		this.salario += aumento;
	}

	double calculaGanhoAnual() {
		return this.salario * 12;
	}

	void trocaDeDepartamento(String novoDepartamento) {
		this.departamento = novoDepartamento;
	}

	void exibeInformacoes() {
		System.out.println("Nome do funcionario: " + this.nome);
		System.out.println("Departamento onde trabalha: " + this.departamento);
		System.out.println("Salario: R$" + this.salario);
		System.out.println("Data de entrada no Banco: " + this.dataEntradaNoBancoData.getFormatada());
		System.out.println("RG: " + this.rg);
		System.out.println("Ganho anual: " + this.calculaGanhoAnual());
	}
}