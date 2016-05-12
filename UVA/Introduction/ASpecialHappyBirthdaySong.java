package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class ASpecialHappyBirthdaySong {
	public static void main(String[] args) throws IOException {
		String[] cancion={"Happy","birthday","to","you","Happy","birthday","to","you","Happy","birthday","to",
				"Rujia","Happy","birthday","to","you"};
		String[] personas;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();
		while (linea != null && !linea.equals("")) {
			int npersonas = Integer.parseInt(linea);
			personas=new String[npersonas];
			for (int i = 0; i < personas.length; i++) {
				personas[i]=in.readLine();
			}
			boolean hayPersonas=true;
			boolean termino=false;
			for (int i = 0,j=0; i < npersonas && j<cancion.length && !termino; i++,j++) {
				
				out.write(personas[i]+": "+cancion[j]+"\n");
				if (j==cancion.length-1) {
					if (hayPersonas) {
						j=-1;
					}else{
						
						termino=true;
					}
				}
				if (i==npersonas-1) {
					hayPersonas=false;
					i=-1;
				}
				
			}

			linea = in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
