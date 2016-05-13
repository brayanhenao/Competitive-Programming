package maraton;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class esferas {
	public static BufferedWriter out;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		out = new BufferedWriter(new FileWriter("data/outputes.txt"));
		
		int veces = Integer.parseInt(in.readLine());
		
		while(veces>0){
			
			StringTokenizer stk = new StringTokenizer(in.readLine());
			
			int alto = Integer.parseInt(stk.nextToken());
			int ancho = Integer.parseInt(stk.nextToken());
			int esferas = Integer.parseInt(stk.nextToken());
			
			String[][] m = inicializar(alto,ancho);
			
			while (esferas>0) {
				stk = new StringTokenizer(in.readLine());
				int i = Integer.parseInt(stk.nextToken());
				int j = Integer.parseInt(stk.nextToken());
				
				m[i][j]="O";
				
				esferas--;
			}
			
			imprimirMatriz(m);
			
			
			veces--;
		}

	}

	private static void imprimirMatriz(String[][] m) throws IOException {

		
		String separador = "";
		for (int i = 0; i < (m[0].length*2)+1; i++) {
			separador+="+";
		}
		
		for (int i = 0; i < m.length; i++) {
//			System.out.println(separador);
			out.write(separador+"\n");
			
			for (int j = 0; j < m[0].length; j++) {
//				System.out.print("+"+m[i][j]);	
				out.write("+"+m[i][j]);
			}
//			System.out.println("+");
			out.write("+\n");
		}
//		System.out.println(separador+"\n");
		out.write(separador+"\n\n");
		out.flush();
		
	}

	private static String[][] inicializar(int alto, int ancho) {
		String[][] m = new String[alto][ancho];
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				m[i][j]= " ";
			}
		}
		return m;
	}

}
