package Arrays4;

class Empresa {

	String nome;
	String cnpj;
	Funcionario[] funcs;
	int qtdFuncs = 0;
	
	void adicionar(Funcionario f) {		
		this.funcs[this.qtdFuncs] = f;
		this.qtdFuncs++;
	}
	
	void mostraEmpregados() {
		for(int i = 0; i < this.funcs.length; i++) {
			if(!(this.funcs[i] == null)) {
				System.out.println("Funcion�rio na posi��o: " + i);
				System.out.println("Sal�rio: R$" + this.funcs[i].salario);
			}
		}
	}
	
	void mostraTodasAsInformacoes() {
		for(int i = 0; i < this.funcs.length; i++) {
			if(!(this.funcs[i] == null)) {
				System.out.println("Funcion�rio na posi��o: " + i);
				this.funcs[i].exibeInformacoes();
			}
		}
	}
	
	boolean contem(Funcionario f) {
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
