package AtributoEMetodoEstatico7;

class Funcionario {
	private String nome;
	private int identificador;
	private String departamento;
	private double salario;
	private String dataEntradaNoBanco;
	private Data dataEntradaNoBancoData;
	private String rg;
	private static int proxFuncId;
	
	public Funcionario() {
		Funcionario.proxFuncId++;
		this.identificador = Funcionario.proxFuncId;
	}
	
	public Funcionario(String nome) {
		setNome(nome);
		Funcionario.proxFuncId++;
		this.identificador = Funcionario.proxFuncId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdentificador() {
		return identificador;
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
		System.out.println("Nome do funcionario: " + this.getNome());
		System.out.println("Id do funcionario: " + this.getIdentificador());
		System.out.println("Departamento onde trabalha: " + this.getDepartamento());
		System.out.println("Salario: R$" + this.getSalario());
		System.out.println("Data de entrada no Banco: " + this.getDataEntradaNoBancoData().getFormatada());
		System.out.println("RG: " + this.getRg());
		System.out.println("Ganho anual: " + this.getGanhoAnual());
	}
}