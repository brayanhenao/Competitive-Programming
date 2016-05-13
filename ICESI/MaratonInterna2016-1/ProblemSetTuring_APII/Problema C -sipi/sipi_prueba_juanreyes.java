import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class sipi_prueba_juanreyes {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String linea = br.readLine();
		int c = Integer.parseInt(linea);
		
		for (int i = 0; i < c; i++) {
			linea = br.readLine();
			//int n = Integer.parseInt(linea);
			
			linea = br.readLine();
			String[] valStr = linea.split(" ");
			Integer[] vals = new Integer[valStr.length];
			for (int j = 0; j < valStr.length; j++) {
				vals[j] = Integer.parseInt(valStr[j]);
			}
			Arrays.sort(vals,Collections.reverseOrder());
			boolean encontro = false;
			int x = 0, y = 0;
			for (int j = 1; j < vals.length && !encontro; j++) {
				int diff = vals[j-1] - vals[j];

				if(diff>10){
					encontro = true;
					x = j-1;
					y = j;
				}
			}
			String resp = "";

			if(encontro){
				resp = x+" "+y;
			}else{
				resp = "sipi";
			}
			bw.write(resp+"\n");
		}
		
		br.close();
		bw.close();
	}
}
