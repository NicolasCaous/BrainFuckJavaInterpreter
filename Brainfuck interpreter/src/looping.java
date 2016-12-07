
public class looping {

	public No topo;
	
	public looping() {
		topo = null;
	}
	
	public void push(int valor) {
		if(topo == null) {
			topo = new No();
			topo.valor = valor;
		} else {
			topo.prox = new No();
			topo.prox.ant = topo;
			topo = topo.prox;
			topo.valor = valor;
		}
	}
	
	public int pop() {
		if(topo == null) {
			return (Integer) null;
		} else if(topo.ant == null) {
			int tmp = topo.valor;
			topo = null;
			return tmp;
		} else {
			int tmp = topo.valor;
			topo = topo.ant;
			return tmp;
		}
	}
}
