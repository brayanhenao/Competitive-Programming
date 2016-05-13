import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class generadorCasosHermano {
	public static String generarIdentificador(){
		String id = "";
		char[] simbolos = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9'};
		for (int i = 0; i < 10; i++) {
			int pos = (int)(Math.random()*simbolos.length);
			id += simbolos[pos];
		}
		return id;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("inputHermano.txt"));
		bw.write("10\n");
		
		for (int i = 0; i < 10; i++) {
			int n = (int)(Math.random()*100000)+1;
			int q = (int)(Math.random()*100000)+1;
			bw.write(n+" "+q+"\n");
			System.out.println(n);
			ArrayList<String> ids = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				String id = generarIdentificador();
				//System.out.println(j+" "+id);
				ids.add(id);
				bw.write(id+"\n");
			}
			System.out.println("X: "+i);
			for (int j = 0; j < q; j++) {
				int existe = (int)(Math.random()*2);
				String id;
				if(existe==0){
					id = generarIdentificador();
				}else{
					int p = (int)(Math.random()*ids.size());
					id = ids.get(p);
				}
				bw.write(id+"\n");
			}			
		}
		bw.close();
	}
}
