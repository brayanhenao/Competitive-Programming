import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class podandogenerador {
	public static void main(String[] args) throws IOException {
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedWriter bw = new BufferedWriter(new FileWriter("podandoentrada.txt"));
		
		int n = 1000;
		bw.write(n+"\n");
		
		List<Integer> valores = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			valores.add(i+1);
		}
		
		for (int i = 0; i < n; i++) {
			List<Integer> vals = new ArrayList<>(valores);
			
			int l = (int)(Math.random()*1000)+1;
			bw.write(l+"\n");
			//bw.write("=="+vals.size()+"==");
			for (int j = 0; j < l; j++) {
				//bw.write("entra ");
				int pos = (int)(Math.random()*vals.size());
				int num = vals.get(pos);
				//bw.write("("+pos+")");
				bw.write(num+" ");
				//bw.flush();
				vals.remove(pos);
			}
			bw.write("\n");
		}
		
		bw.close();
	}
}
