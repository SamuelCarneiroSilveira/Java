
public class Funcionario {

	private String name;
	private String cpf;
	protected double salario; // publico para os meios filhos

	
	public double getBonificacao() {
		return this.salario*0.1;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
