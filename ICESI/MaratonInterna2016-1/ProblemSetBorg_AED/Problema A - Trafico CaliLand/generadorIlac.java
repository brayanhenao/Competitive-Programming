import java.util.ArrayList;
import java.util.Random;

public class generadorIlac {

	public static void main(String[] args) {


		int casos = 1;
//		System.out.println(casos);


		while (casos>0) {

			Random ale = new Random(casos*casos%129836);

			int n = ale.nextInt(97)+3;
			n=100;
			System.out.println(n);

			for (int i = 1; i <= n; i++) {				
				int cant = ale.nextInt(90);
				cant=5;
				String linea =adyacentes(n, cant,i);
				System.out.println(i+" "+linea);
			}

			casos--;
		}


		System.out.println("0");

	}

	private static String adyacentes(int n, int cant, int actual) {

		StringBuilder linea = new StringBuilder();

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		for (int i = 1; i < n; i++) {
			if (i!= actual) {				
				numeros.add(i);
			}
		}

		Random ale = new Random(actual*actual%121236);

		int num = 0;
		salir:
		while (cant>0) {
			if (numeros.size()==0) {
				 break salir;
			}
			num = ale.nextInt(numeros.size());

			linea.append(numeros.get(num)+" ");
			numeros.remove(num);
//			System.out.println(numeros.size());

			cant--;
		}

		return linea.toString().trim();
	}

}
