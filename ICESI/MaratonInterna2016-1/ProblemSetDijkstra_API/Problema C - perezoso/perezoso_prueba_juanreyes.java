import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class perezoso_prueba_juanreyes {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String linea = br.readLine();
		int c = Integer.parseInt(linea);
		
		for (int i = 0; i < c; i++) {
			linea = br.readLine();
			int n = Integer.parseInt(linea);
			
			int buenas = 0;
			for (int j = 0; j < n; j++) {
				linea = br.readLine();
				String[] valores = linea.split(" ");
				int uno = Integer.parseInt(valores[0]);
				int otro = Integer.parseInt(valores[1]);
				
				if(uno==otro){
					buenas++;
				}
			}
			int calificacion = (int)(((double)buenas/(double)n)*5);
			bw.write(calificacion+"\n");
		}
		
		br.close();
		bw.close();
	}
}
