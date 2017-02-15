
public class Nodo {
	private Nodo siguiente;
	private int dato;
	
	public Nodo(int dato){
		this.setDato(dato);
		this.siguiente = null;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}
}
