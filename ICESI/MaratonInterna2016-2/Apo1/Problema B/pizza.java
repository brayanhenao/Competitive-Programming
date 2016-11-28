import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class pizza {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String linea = br.readLine();
		
		int casos = Integer.parseInt(linea);

		int diametro;
		
		String respuesta;
		
		for (int i = 0; i < casos; i++) {

			linea = br.readLine();
			diametro = Integer.parseInt(linea);
			
			respuesta= "Asimétrica\n";

			char[][] pizza = new char[diametro][diametro];
			
			for (int j = 0; j < diametro; j++) {
				
				linea = br.readLine();
				
				StringTokenizer st = new StringTokenizer(linea);
				
				for (int k = 0; k < diametro; k++) {
					
					pizza[j][k] = st.nextToken().charAt(0);
					
				}
				
			}
			
			if(EsSimetrica(pizza)){
				respuesta = "Simétrica\n";
			}
			
			bw.write(respuesta);
			
		}
		
		bw.close();
		br.close();
		
	}

	private static boolean EsSimetrica(char[][] pizza) {
		
		boolean simetrica = true;
		
		//primera diagonal
		for (int i = 0; i < pizza.length && simetrica; i++) {
			
			for (int j = i; j < pizza.length && simetrica; j++) {
				
				if(pizza[i][j] != pizza[j][i]){
					simetrica = false;
				}
				
			}
			
		}

		//segunda diagonal
		for (int i = 0; i < pizza.length && simetrica; i++) {
			
			for (int j = 0; j < pizza.length - i && simetrica; j++) {
				
				if(pizza[i][j] != pizza[pizza.length - i - 1][pizza.length - j - 1]){
					simetrica = false;
				}
				
			}
			
		}
		
		return simetrica;
		
	}

}
