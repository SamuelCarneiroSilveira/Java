
public class SistemaAluguel {

	private Cliente responsavelPeloAluguel; 
	private Veiculo veiculoAlugado;
	private int numeroDeDias;
	private double valorDevido;
	
	SistemaAluguel(Cliente cliente, Veiculo veiculo, int numeroDeDias){
		this.responsavelPeloAluguel = cliente;
		this.veiculoAlugado = veiculo;
		this.numeroDeDias = numeroDeDias;
		
		this.valorDevido = (this.numeroDeDias * this.veiculoAlugado.getValorPorDia());
		
		System.out.println("*** Aluguel cadastrado com sucesso! ***");
		System.out.println("Veiculo: "+ this.veiculoAlugado.getModelo() + " " + veiculoAlugado.getAno());
		System.out.println("Marca: " + this.veiculoAlugado.getMarca());
		System.out.println("Dias Alugado: " + this.numeroDeDias + " dias");
		System.out.println("Cliente: " + this.responsavelPeloAluguel.getNome());
		System.out.println("CPF n°: " + this.responsavelPeloAluguel.getCpf());
		System.out.println("Por um valor de R$: " + valorDevido);
		System.out.println();
	}
}
