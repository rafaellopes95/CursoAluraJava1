package ModificadorAcesso5;

class Data {
	int dia;
	int mes;
	int ano;
	
	void setData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String getFormatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}
