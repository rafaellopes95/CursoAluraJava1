package AtributoEMetodoEstatico7;

class RecursosHumanos {
	
	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario();
		func1.setNome("Rafael");
		func1.setDepartamento("TI");
		func1.setSalario(2000.0);
		func1.setDataEntradaNoBancoData(new Data(32, 2, 2015));
		func1.setDataEntradaNoBanco("17/08/2015");
		func1.setRg("123456789");
		func1.recebeAumento(1000.0);
		func1.setDepartamento("Financas");
		func1.exibeInformacoes();
		
		Funcionario func2 = new Funcionario();
		func2.setNome("Gabriel");
		func2.setDepartamento("Financas");
		func2.setSalario(2000.00);
		func2.setDataEntradaNoBancoData(new Data(20, 9, 2017));
		func2.setDataEntradaNoBanco("20/09/2017");
		func2.setRg("987654321");
		func2.exibeInformacoes();
		
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