
public class ListaString {


	private NodoString inicio;

	public ListaString(){
	}
	
	public NodoString getInicio() {
		return inicio;
	}

	public void setInicio(NodoString inicio) {
		this.inicio = inicio;
	}
	
	public void insertarI(String dato){
		NodoString nuevo = new NodoString(dato);
		if(isVacia()){
			inicio = nuevo;
		} else {
			nuevo.setSiguiente(inicio);
			inicio = nuevo;
		}
	}
	
	public void insertarF(String dato){
		NodoString nuevo = new NodoString(dato);
		if(isVacia()){
			inicio = nuevo;
		} else {
			NodoString aux = inicio;
			while(aux.getSiguiente() != null){
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
		}
	}
	
	
	public void recorrerLista(){
		if(isVacia()){
			System.out.println("Lista Vacia");
		} else {
			NodoString aux = inicio;
			while(aux != null){
				System.out.println(aux.getDato());
				aux = aux.getSiguiente();
			}
		}
	}
	
	public boolean isVacia(){
		return inicio == null;
	}
	
	public void ordenarRadix(){
		
		int numeroDeCaracteres = obtenerMayor();
		
		ListaString lista0 = new ListaString();
		ListaString lista1 = new ListaString();
		ListaString lista2 = new ListaString();
		ListaString lista3 = new ListaString();
		ListaString lista4 = new ListaString();
		ListaString lista5 = new ListaString();
		ListaString lista6 = new ListaString();
		ListaString lista7 = new ListaString();
		ListaString lista8 = new ListaString();
		ListaString lista9 = new ListaString();
		
		
		for (int i = 0; i < numeroDeCaracteres; i++) {
			NodoString aux = this.inicio;
			while(aux != null){
				String valor = aux.getDato();
				if(valor.length() >= numeroDeCaracteres){
					char identificador = valor.charAt(valor.length() - i - 1); 
					switch (identificador) {
					case '0':
						lista0.insertarF(aux.getDato());
						break;
					
					case '1':
						lista1.insertarF(aux.getDato());
						break;
						
					case '2':
						lista2.insertarF(aux.getDato());
						break;
						
					case '3':
						lista3.insertarF(aux.getDato());
						break;
						
					case '4':
						lista4.insertarF(aux.getDato());
						break;
						
					case '5':
						lista5.insertarF(aux.getDato());
						break;

					case '6':
						lista6.insertarF(aux.getDato());
						break;
						
					case '7':
						lista7.insertarF(aux.getDato());
						break;
						
					case '8':
						lista8.insertarF(aux.getDato());
						break;
						
					case '9':
						lista9.insertarF(aux.getDato());
						break;

					default:
						break;
					}
					
				} else {
					lista0.insertarF(aux.getDato());
				}	
				aux = aux.getSiguiente();
			}
			
			this.setInicio(null);
			
			NodoString aux2 = lista0.inicio;
			while(aux2 != null){
				this.insertarF(aux2.getDato());
				aux2 = aux2.getSiguiente();
			}
			lista0.setInicio(null);
			
			aux2 = lista1.inicio;
			while(aux2 != null){
				this.insertarF(aux2.getDato());
				aux2 = aux2.getSiguiente();
			}
			lista1.setInicio(null);
			
			aux2 = lista2.inicio;
			while(aux2 != null){
				this.insertarF(aux2.getDato());
				aux2 = aux2.getSiguiente();
			}
			lista2.setInicio(null);
			
			aux2 = lista3.inicio;
			while(aux2 != null){
				this.insertarF(aux2.getDato());
				aux2 = aux2.getSiguiente();
			}
			lista3.setInicio(null);
			
			aux2 = lista4.inicio;
			while(aux2 != null){
				this.insertarF(aux2.getDato());
				aux2 = aux2.getSiguiente();
			}
			lista4.setInicio(null);
			
			aux2 = lista5.inicio;
			while(aux2 != null){
				this.insertarF(aux2.getDato());
				aux2 = aux2.getSiguiente();
			}
			lista5.setInicio(null);
			
			aux2 = lista6.inicio;
			while(aux2 != null){
				this.insertarF(aux2.getDato());
				aux2 = aux2.getSiguiente();
			}
			lista6.setInicio(null);
			
			aux2 = lista7.inicio;
			while(aux2 != null){
				this.insertarF(aux2.getDato());
				aux2 = aux2.getSiguiente();
			}
			lista7.setInicio(null);

			aux2 = lista8.inicio;
			while(aux2 != null){
				this.insertarF(aux2.getDato());
				aux2 = aux2.getSiguiente();
			}
			lista8.setInicio(null);
			
			aux2 = lista9.inicio;
			while(aux2 != null){
				this.insertarF(aux2.getDato());
				aux2 = aux2.getSiguiente();
			}
			lista9.setInicio(null);
			
		}
	}
	
	public void insertarAleatoriamente(int numeroMayor, int numeroMenor, int cantidad){
		String numero = "";
		for (int i = 0; i < cantidad; i++) {
			numero = String.valueOf(((int)(Math.random()*numeroMayor) + numeroMenor));
			this.insertarI(numero);
		}
	}
	
	public String toString(){
		String contenido = "";
		NodoString aux = inicio;
		while(aux != null){
			contenido = contenido + " " + aux.getDato();
			aux = aux.getSiguiente();
		}
		return contenido;
	}
	
	public int obtenerMayor(){
		int mayor = 0;
		NodoString aux = inicio;
		while(aux != null){
			if(Integer.parseInt(aux.getDato()) > mayor){
				mayor = aux.getDato().length();
			}
			aux = aux.getSiguiente();
		}
		return mayor;
	}
}
