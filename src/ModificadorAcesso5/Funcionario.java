package ModificadorAcesso5;

class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private String dataEntradaNoBanco;
	private Data dataEntradaNoBancoData;
	private String rg;

	public void recebeAumento(double aumento) {
		this.salario += aumento;
	}

	public double calculaGanhoAnual() {
		return this.salario * 12;
	}

	public void trocaDeDepartamento(String novoDepartamento) {
		this.departamento = novoDepartamento;
	}

	public void exibeInformacoes() {
		System.out.println("Nome do funcionario: " + this.nome);
		System.out.println("Departamento onde trabalha: " + this.departamento);
		System.out.println("Salario: R$" + this.salario);
		System.out.println("Data de entrada no Banco: " + this.dataEntradaNoBancoData.getFormatada());
		System.out.println("RG: " + this.rg);
		System.out.println("Ganho anual: " + this.calculaGanhoAnual());
	}
}