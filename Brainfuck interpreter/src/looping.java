
public class looping {

	public No topo;
	
	public looping() {
		this.topo = null;
	}
	
	public void push(int valor) {
		if(this.topo == null) {
			this.topo = new No();
			this.topo.valor = valor;
		} else {
			this.topo.prox = new No();
			this.topo.prox.ant = this.topo;
			this.topo = this.topo.prox;
			this.topo.valor = valor;
		}
	}
	
	public int pop() {
		if(this.topo == null) {
			return (Integer) null;
		} else if(this.topo.ant == null) {
			int tmp = this.topo.valor;
			this.topo = null;
			return tmp;
		} else {
			int tmp = this.topo.valor;
			this.topo = this.topo.ant;
			return tmp;
		}
	}
}
