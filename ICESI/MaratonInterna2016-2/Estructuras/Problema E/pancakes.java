import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class pancakes {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String linea = br.readLine();
		int n = Integer.parseInt(linea);
		
		for (int i = 0; i < n; i++) {
			br.readLine();
			linea = br.readLine();
			String[] interv = linea.split(" ");
			Stack<Integer> pancakes = new Stack<>();
			int contador = 0;
			for (int j = 0; j < interv.length; j++) {
				int actual = Integer.parseInt(interv[j]);
				if(actual>0){
					int limite = contador+actual;
					while(contador < limite) {
						pancakes.push(contador);
						contador++;
					}
				}else{
					actual = 0 - actual;
					for (int k = 0; k < actual; k++) {
						int servir = pancakes.pop();
						bw.write(servir+" ");
					}
				}
			}
			bw.write("\n");
			bw.write(pancakes.size()+"\n");
		}
		br.close();
		bw.close();
	}

}
