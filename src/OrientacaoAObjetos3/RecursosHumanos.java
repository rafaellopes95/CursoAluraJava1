package OrientacaoAObjetos3;
class RecursosHumanos {
	
	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario();
		func1.nome = "Rafael";
		func1.departamento = "TI";
		func1.salario = 2000.0;
		func1.dataEntradaNoBancoData = new Data();
		func1.dataEntradaNoBancoData.setData(17, 8, 2015);
		func1.dataEntradaNoBanco = "17/08/2015";
		func1.rg = "123456789";
		func1.recebeAumento(1000.0);
		func1.trocaDeDepartamento("Financas");
		func1.exibeInformacoes();
		
		Funcionario func2 = new Funcionario();
		func2.nome = "Gabriel";
		func2.departamento = "Financas";
		func2.salario = 2000.00;
		func2.dataEntradaNoBancoData = new Data();
		func2.dataEntradaNoBancoData.setData(20, 9, 2017);
		func2.dataEntradaNoBanco = "20/09/2017";
		func2.rg = "987654321";
		
		Funcionario func3 = func1;
		
		if(func1 == func2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
		
		if(func1 == func3) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
	}
}