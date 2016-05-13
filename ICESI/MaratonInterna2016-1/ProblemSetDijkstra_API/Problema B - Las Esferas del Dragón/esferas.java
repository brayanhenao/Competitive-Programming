import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class esferas {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String linea = br.readLine();
		int c = Integer.parseInt(linea);
		
		String sep = "";
		for (int i = 0; i < c; i++) {
			linea = br.readLine();
			String[] valores = linea.split(" ");
			int h = Integer.parseInt(valores[0]);
			int w = Integer.parseInt(valores[1]);
			int n = Integer.parseInt(valores[2]);
			
			int[][] matriz = new int[h][w];
			for (int j = 0; j < n; j++) {
				linea = br.readLine();
				String[] posicion = linea.split(" ");
				int fila = Integer.parseInt(posicion[0]);
				int columna = Integer.parseInt(posicion[1]);
				
				matriz[fila][columna] = 1;
			}
			
			String filaSep = "+";
			for (int j = 0; j < w; j++) {
				filaSep += "++";
			}
			filaSep += "\n";
			bw.write(sep+filaSep);
			for (int j = 0; j < matriz.length; j++) {
				bw.write("+");
				for (int k = 0; k < matriz[j].length; k++) {
					if(matriz[j][k]==1){
						bw.write("O");
					}else{
						bw.write(" ");
					}
					bw.write("+");
				}
				bw.write("\n");
				bw.write(filaSep);
			}
			sep = "\n";
		}
		
		br.close();
		bw.close();
	}
}
