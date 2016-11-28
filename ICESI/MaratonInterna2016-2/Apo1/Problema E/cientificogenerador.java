import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class cientificogenerador {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("cientificosalida.txt"));
		
		int n = 1000;
		bw.write(n+"\n");
		for (int i = 0; i < n; i++) {
			int p = (int)(Math.random()*100)+1;
			int q = (int)(Math.random()*100)+1;
			int r = (int)(Math.random()*100)+1;
			bw.write(p+" "+q+" "+r+"\n");
			for (int j = 0; j < p; j++) {
				for (int k = 0; k < q; k++) {
					bw.write((int)(Math.random()*101)+" ");
				}
				bw.write("\n");
			}

			for (int j = 0; j < q; j++) {
				for (int k = 0; k < r; k++) {
					bw.write((int)(Math.random()*101)+" ");
				}
				bw.write("\n");
			}
		}
		
		bw.close();
	}

}
