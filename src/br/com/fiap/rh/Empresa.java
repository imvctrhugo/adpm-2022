package br.com.fiap.rh;

public class Empresa {

	public static void main(String[] args) {

		Engenheiro engenheiro = new Engenheiro();
		Gerente gerente = new Gerente();
		Presidente presidente = new Presidente();
		Presidente presidenteRegional = new Presidente();

		engenheiro.setSalarioBase(5000);
		System.out.println("Salário do Engenheiro = " + engenheiro.calcularSalario());

		gerente.setBonus(2000);
		gerente.setSalarioBase(8000);
		System.out.println("Salário do Gerente = " + gerente.calcularSalario());

		presidente.setAcoes(100000);
		presidente.setSalarioBase(8000);
		System.out.println("Salário do Presidente = " + presidente.calcularSalario());

		presidenteRegional.setAcoes(30000);
		presidenteRegional.setSalarioBase(5000);
		System.out.println("Salário do Presidente Regional = " + presidenteRegional.calcularSalario());

		FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
		folhaDePagamento.registrar(presidente);
		System.out.println("Pagamento Total = " + folhaDePagamento.getPagamentoTotal());
		folhaDePagamento.registrar(engenheiro);
		folhaDePagamento.registrar(gerente);
		folhaDePagamento.registrar(presidenteRegional);
		System.out.println("Pagamento Total = " + folhaDePagamento.getPagamentoTotal());

	}

}
