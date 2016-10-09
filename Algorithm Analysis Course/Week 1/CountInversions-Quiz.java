import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CountInversions {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(new File("IntegerArray.txt")));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		String linea;
		int[] nums=new int[100000];
//		List<Integer> aux = new LinkedList<>();
		int cnt=0;
		while ((linea = in.readLine()) != null && !linea.equals("")) {
//			aux.add(Integer.parseInt(linea));
			nums[cnt++]=Integer.parseInt(linea);
		}

//		int[] nums = aux.stream().mapToInt(i -> i).toArray();
		out.printf("El número de inversiones es %d%n", contarInversiones(nums));
		out.println(nums.length);
		in.close();
		out.close();
	}

	private static long contarInversiones(int[] arreglo) {

		int longitud = arreglo.length;
		if (longitud < 2) {
			return 0;
		} else {
			int mitad = longitud / 2;
			int[] arrizq = Arrays.copyOfRange(arreglo, 0, mitad);
			int[] arrder = Arrays.copyOfRange(arreglo, mitad, longitud);
			long izq = contarInversiones(arrizq);
			long der = contarInversiones(arrder);

			int[] resul = new int[longitud];
			long contar = contarAux(arrizq, arrder, resul);

			for (int i = 0; i < longitud; i++) {
				arreglo[i] = resul[i];
			}

			return izq + der + contar;
		}
	}

	private static long contarAux(int[] izq, int[] der, int[] res) {
		int contador = 0;
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < izq.length && j < der.length) {
			if (izq[i] <= der[j]) {
				res[k] = izq[i];
				i++;
				k++;
			} else {
				res[k] = der[j];
				j++;
				k++;
				contador += izq.length - i;
			}
		}

		if (j == der.length) {
			while (i < izq.length) {
				res[k] = izq[i];
				k++;
				i++;
			}
		} else {
			while (j < der.length) {
				res[k] = der[j];
				k++;
				j++;
			}
		}
		return contador;
	}

}
