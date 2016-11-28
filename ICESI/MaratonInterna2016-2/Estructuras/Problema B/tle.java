import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class tle {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String linea;
		
		while((linea = br.readLine())!=null){
			
			if(Long.parseLong(linea) > 9){
				bw.write("9\n");
			}
			else{
				bw.write(linea + "\n");
			}
			
		}
		
		bw.close();
		
	}

}
