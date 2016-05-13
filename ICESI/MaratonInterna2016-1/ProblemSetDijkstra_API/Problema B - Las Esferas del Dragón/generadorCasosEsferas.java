import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class generadorCasosEsferas {
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("inputEsferas.txt"));
		bw.write("100\n");
		for (int i = 0; i < 100; i++) {
			int h = (int)(Math.random()*50)+1;
			int w = (int)(Math.random()*50)+1;
			int n = (int)(Math.random()*((h*w)+1));
			bw.write(h+" "+w+" "+n+"\n");
			for (int j = 0; j < n; j++) {
				int fila = (int)(Math.random()*h);
				int columna = (int)(Math.random()*w);
				bw.write(fila+" "+columna+"\n");
			}
		}
		bw.close();		
	}
}
