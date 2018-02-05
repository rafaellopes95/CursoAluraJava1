package Construtor6;

class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private String dataEntradaNoBanco;
	private Data dataEntradaNoBancoData;
	private String rg;
	
	public Funcionario() {

	}
	
	public Funcionario(String nome) {
		this.setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataEntradaNoBanco() {
		return dataEntradaNoBanco;
	}

	public void setDataEntradaNoBanco(String dataEntradaNoBanco) {
		this.dataEntradaNoBanco = dataEntradaNoBanco;
	}

	public Data getDataEntradaNoBancoData() {
		return dataEntradaNoBancoData;
	}

	public void setDataEntradaNoBancoData(Data dataEntradaNoBancoData) {
		this.dataEntradaNoBancoData = dataEntradaNoBancoData;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void recebeAumento(double aumento) {
		this.salario += aumento;
	}

	public double getGanhoAnual() {
		return this.salario * 12;
	}

	/*
	public void trocaDeDepartamento(String novoDepartamento) {
		this.departamento = novoDepartamento;
	}
	*/

	public void exibeInformacoes() {
		System.out.println("Nome do funcionario: " + this.nome);
		System.out.println("Departamento onde trabalha: " + this.departamento);
		System.out.println("Salario: R$" + this.salario);
		System.out.println("Data de entrada no Banco: " + this.dataEntradaNoBancoData.getFormatada());
		System.out.println("RG: " + this.rg);
		System.out.println("Ganho anual: " + this.getGanhoAnual());
	}
}