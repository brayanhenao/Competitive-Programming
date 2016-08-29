package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class BenderBRodriguez {
	static String[][] mat = new String[6][4];

	public static void llenarMatriz(){
		mat[0][0]="+y"; mat[0][1]="-y"; mat[0][2]="+z"; mat[0][3]="-z"; 
		mat[1][0]="-y"; mat[1][1]="+y"; mat[1][2]="-z"; mat[1][3]="+z"; 
		mat[2][0]="-x"; mat[2][1]="+x"; mat[2][2]="+y"; mat[2][3]="+y";
		mat[3][0]="+x"; mat[3][1]="-x"; mat[3][2]="-y"; mat[3][3]="-y";
		mat[4][0]="+z"; mat[4][1]="+z"; mat[4][2]="-x"; mat[4][3]="+x";
		mat[5][0]="-z"; mat[5][1]="-z"; mat[5][2]="+x"; mat[5][3]="-x";
		
	}
	public static void main(String[] args) throws IOException {
		llenarMatriz();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();
		while (linea != null && !linea.equals("0")) {
			int largo=Integer.parseInt(linea);
			String estadoInicial="+x";
			StringTokenizer tk=new StringTokenizer(in.readLine());
			boolean termino=false;
			for (int i = 0; i < largo-1 && !termino; i++) {
				String orden=tk.nextToken();
				if (orden.equals("No"))
					termino=true;
				int a = 0;
				if (estadoInicial.equals("-x"))
					a = 1;
				if (estadoInicial.equals("+y"))
					a = 2;
				if (estadoInicial.equals("-y"))
					a = 3;
				if (estadoInicial.equals("+z"))
					a = 4;
				if (estadoInicial.equals("-z"))
					a = 5;
				
				int b = 0;
				if (orden.equals("+y"))
					b = 0;
				if (orden.equals("-y"))
					b = 1;
				if (orden.equals("+z"))
					b = 2;
				if (orden.equals("-z"))
					b = 3;
				estadoInicial = mat[a][b];
			}
			System.out.println(estadoInicial);
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
