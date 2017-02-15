import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Lista lista = new Lista();
		System.out.println("Ingrese el n�mero m�ximo del rango");
		int max = sc.nextInt();
		System.out.println("Ingrese el n�mero m�nimo del rango");
		int min = sc.nextInt();
		System.out.println("Ingrese el n�mero de digitos a insertar");
		int catidad = sc.nextInt();
		System.out.println("Ingrese el tama�o de la muestra que desea imprimir de cada lista");
		int muestra = sc.nextInt();
		
		lista.insertarAleatoriamente(max, min, catidad);
		long start = System.currentTimeMillis();
		lista.ordenarRadix();
		long elapsed = System.currentTimeMillis() - start;
		System.out.println("El proceso de radix tardo: " + elapsed + " Milisegundos");
		System.out.println("Muestra: ");
		System.out.println(lista.imprimirmMuestra(muestra));
		
		lista.setInicio(null);
		lista.insertarAleatoriamente(max, min, catidad);
		start = System.currentTimeMillis();
		lista.ordenarBurbuja();
		elapsed = System.currentTimeMillis() - start;
		System.out.println("El proceso de burbuja tardo: " + elapsed + " Milisegundos");
		System.out.println("Muestra: ");
		System.out.println(lista.imprimirmMuestra(muestra));
	}
}
