
public class Calculadora {

	private int operador1;
	private int operador2;
	private int operacao;
	private double result;
	
	public Calculadora (int operador1, int operador2, int operacao){
		this.operador1 = operador1;
		this.operador2 = operador2;
		
		switch(operacao){
			case 1: 
				this.result = multiplica();
				break;
			case 2: 
				if(this.operador2 == 0){
					throw new DivisaoPorZeroException("Não é possível dividir por 0!");
				}
				this.result = divide();
				break;
			case 3: 
				this.result = subtrai();
				break;
			default: 
				this.result = soma();
			}
		}

	public double soma(){
		return operador1 + operador2;
	}
	public double subtrai(){
		return operador1 - operador2;
	}
	public int divide(){
		return operador1 / operador2;
	}
	public int multiplica(){
		return operador1 * operador2;
	}
	
	public int getOperador1() {
		return operador1;
	}

	public void setOperador1(int operador1) {
		this.operador1 = operador1;
	}

	public int getOperador2() {
		return operador2;
	}

	public void setOperador2(int operador2) {
		this.operador2 = operador2;
	}

	public int getOperacao() {
		return operacao;
	}

	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	
	
}
