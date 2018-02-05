package ModificadorAcesso5;

class Empresa {

	private String nome;
	private String cnpj;
	private Funcionario[] funcs;
	private int qtdFuncs = 0;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Funcionario getFuncs(int pos) {
		if(pos < this.qtdFuncs) {
			return this.funcs[pos];
		} else {
			return null;
		}
	}

	void adicionar(Funcionario f) {		
		this.funcs[this.qtdFuncs] = f;
		this.qtdFuncs++;
	}
	
	public void mostraEmpregados() {
		for(int i = 0; i < this.funcs.length; i++) {
			if(!(this.funcs[i] == null)) {
				System.out.println("Funcionario na posicao: " + i);
				System.out.println("Salario: R$" + this.funcs[i].getSalario());
			}
		}
	}
	
	public void mostraTodasAsInformacoes() {
		for(int i = 0; i < this.funcs.length; i++) {
			if(!(this.funcs[i] == null)) {
				System.out.println("Funcionario na posicao: " + i);
				this.funcs[i].exibeInformacoes();
			}
		}
	}
	
	public boolean contem(Funcionario f) {
		for(int i = 0; i < this.funcs.length; i++) {
			if(!(this.funcs[i] == null)) {
				if(this.funcs[i] == f) {
					return true;
				}
			}
		}

		return false;
	}
}
