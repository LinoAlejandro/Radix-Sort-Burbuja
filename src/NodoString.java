
public class NodoString {

	private NodoString siguiente;
	private String dato;
	
	public NodoString(String dato){
		this.setDato(dato);
		this.siguiente = null;
	}

	public NodoString getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoString siguiente) {
		this.siguiente = siguiente;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public String getDato() {
		return dato;
	}
}