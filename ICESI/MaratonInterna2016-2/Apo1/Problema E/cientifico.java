import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;

public class cientifico {
	public static void main(String[] args) throws IOException{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new FileReader("cientificoentrada.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("cientificosalida.txt"));
		
		String linea = br.readLine();
		int n = Integer.parseInt(linea);
		
		for (int i = 0; i < n; i++) {
			linea = br.readLine();
			String[] dims = linea.split(" ");
			int p = Integer.parseInt(dims[0]);
			int q = Integer.parseInt(dims[1]);
			int r = Integer.parseInt(dims[2]);
			int[][] A = new int[p][q];
			for (int j = 0; j < p; j++) {
				linea = br.readLine();
				String vals[] = linea.split(" ");
				for (int k = 0; k < q; k++) {
					A[j][k] = Integer.parseInt(vals[k]);
				}
			}
			int[][] B = new int[q][r];
			for (int j = 0; j < q; j++) {
				linea = br.readLine();
				String vals[] = linea.split(" ");
				for (int k = 0; k < r; k++) {
					B[j][k] = Integer.parseInt(vals[k]);
				}
			}
			int[][] C = new int[p][r];
			for (int j = 0; j < p; j++) {
				for (int k = 0; k < r; k++) {
					for (int l = 0; l < q; l++) {
						C[j][k] += A[j][l]*B[l][k];
					}
					bw.write(C[j][k]+" ");
				}
				bw.write("\n");
			}			
		}
		
		br.close();
		bw.close();
	}
}
