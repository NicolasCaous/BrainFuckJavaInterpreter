
public class BrainfuckInterpreter {
	
	public No atual;
	
	BrainfuckInterpreter() {
		atual = new No();
	}
	
	public void MD () {
		if(atual.prox == null) {
			this.atual.prox = new No();
			this.atual.prox.ant = this.atual;
		}
		this.atual = this.atual.prox;
	}
	
	public void ME () {
		if(atual.ant == null) {
			this.atual.ant = new No();
			this.atual.ant.prox = this.atual;
		}
		this.atual = this.atual.ant;
	}

}
