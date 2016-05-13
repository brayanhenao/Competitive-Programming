import java.util.*;
import java.io.*;

public class trafico {

	public final static int INF = 1000000;

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;

		while (true) {
			int n = Integer.parseInt(in.readLine().trim());
			if (n == 0)
				break;

			int[][] adj1 = inicializarMatriz(n);
			for (int i = 0; i < n; ++i) {
				stk = new StringTokenizer(in.readLine().trim());
				stk.nextToken();
				while (stk.hasMoreTokens()) {
					int j = Integer.parseInt(stk.nextToken());
					adj1[i][j - 1] = 1;
				}
			}

			int[][] dist1 = floydwarshall(adj1);


			int[][] adj2 = inicializarMatriz(n);

			for (int i = 0; i < n; ++i) {
				stk = new StringTokenizer(in.readLine().trim());
				stk.nextToken();
				while (stk.hasMoreTokens()) {
					int j = Integer.parseInt(stk.nextToken());
					adj2[i][j - 1] = 1;
				}
			}

			int[][] dist2 = floydwarshall(adj2);

//			imprimir(dist1);
//			imprimir(dist2);

			stk = new StringTokenizer(in.readLine().trim());
			int A = Integer.parseInt(stk.nextToken());
			int B = Integer.parseInt(stk.nextToken());

			//			System.out.println("A: "+A+" B: "+B);

			boolean ok = true;
			outer:
				for (int i = 0; i < n; ++i)
					for (int j = 0; j < n; ++j) {
						int x = dist1[i][j];
						if ( dist2[i][j] > ((A * x) + B)){
							ok = false;
							//							System.out.println("Error en "+i+" - "+j+" ");
							//							System.out.println("Valor original: "+dist1[i][j]);
							//							System.out.println("Valor Calculado: "+ ((A* x)+B));
							//							System.out.println("Valor nuevo: "+dist2[i][j]);
							break outer;
						}
					}
			System.out.println(ok ? "Cumple!" : "No cumple :(");
		}

		in.close();
	}


	static int[][] floydwarshall(int[][] matriz) {
		int[][] nueva = matriz.clone();

		for (int k = 0; k < nueva.length; k++) {
			for (int i = 0; i < nueva.length; i++) {
				for (int j = 0; j < nueva.length; j++) {
					nueva[i][j] = Math.min(nueva[i][j], nueva[i][k] + nueva[k][j]);
				}
			}

		}

		return nueva;
	}

	static void imprimir(int [][] matriz){
		System.out.println("-----");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}

	static int[][] inicializarMatriz(int n){
		int[][] m = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) 
					m[i][j] = 0;
				else
					m[i][j]=INF;
			}
		}
		return m;
	}


}

