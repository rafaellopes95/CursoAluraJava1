package Arrays4;

class TestaEmpresa {
	
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Rafael";
		f1.departamento = "TI";
		f1.salario = 1500.00;
		f1.dataEntradaNoBancoData = new Data();
		f1.dataEntradaNoBancoData.setData(17, 5, 2017);
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Willian";
		f2.departamento = "Compras";
		f2.salario = 2200.00;
		f2.dataEntradaNoBancoData = new Data();
		f2.dataEntradaNoBancoData.setData(20, 9, 2015);
		
		Empresa emp = new Empresa();
		emp.funcs = new Funcionario[10];
		emp.adicionar(f1);
		emp.adicionar(f2);

		//emp.funcs[0].exibeInformacoes();
		//emp.funcs[1].exibeInformacoes();
		emp.mostraEmpregados();
		emp.mostraTodasAsInformacoes();
		System.out.println("Funcionário existe? " + emp.contem(f1));
		
		Funcionario f3 = new Funcionario();
		System.out.println("Funcionário existe? " + emp.contem(f3));
	}
}
