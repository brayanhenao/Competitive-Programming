import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;

public class generadorCasosDuelo {

	public static void main(String[] args) throws IOException {

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int veces = 500;
		
		out.write(veces+"\n");
		
		
		while (veces>0) {
			
			Random ale = new Random(veces*veces%129836);
			 
			 out.write((ale.nextInt(999)+1)+"\n");
			 
			 out.write((ale.nextInt(499)+1)+" "+(ale.nextInt(499)+1)+"\n");
			 
			veces--;
		}

		out.flush();
		out.close();


	}

}
