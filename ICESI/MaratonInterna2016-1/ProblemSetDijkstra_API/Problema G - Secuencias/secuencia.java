package dijkstra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class secuencia {

	
	
	
	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String linea = "";
		
		while((linea=in.readLine())!=null){
			int n = Integer.parseInt(linea);
			StringTokenizer datos = new StringTokenizer(in.readLine());
			int[] numeros = new int[datos.countTokens()];
			char[] operadores = new char[datos.countTokens()];
			int c = numeros.length-1;
			while(datos.hasMoreTokens()){
				String base = datos.nextToken();
				numeros[c] = base.charAt(0)-'0';
				operadores[c] = base.charAt(1);
				c--;
			}
			c = 0;
			int answ = -1;
			int first = n;
	        boolean mayor = true;
			while(n>=0 && mayor){
				if(c%operadores.length==0 && n>=0){
					
					if(n>=first && c!=0){
						mayor = false;
					}
					if(c!=0){
						answ = n;
					}
				}
				n = operar(operadores[c%operadores.length],n,numeros[c%numeros.length]);
				c++;
			}
			if(answ!=-1){
			out.write(answ+"\n");
			}else{
				out.write("IMPOSIBLE\n");
			}
		}
		out.flush();
		out.close();
		in.close();
		
		
	}
	
	private static int operar(char op, int num, int num2){
		
		switch (op) {
		case '+':
			return num-num2;
		case '-':
			return num+num2;
		 default:
		return -1;
		}
	
		
	}
	
	
}
