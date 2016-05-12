import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class soccer {

	public static void soccer() throws IOException{
		class Numero{
			int a,b,c;
			public Numero(int a1, int b1, int c1){
				a = a1;
				b = b1;
				c = c1;
			}
			
			public String toString(){
				return a+"-"+b+"-"+c;
			}
			
			public int compareTo(Numero num){
				int retorno=0;
				if(a > num.a){
					retorno=1;
				}
				else if(a < num.a){
					retorno=-1;
				}
				else if(b>num.b){
					retorno=1;
				}
				else if(b<num.b){
					retorno=-1;
				}else if(c>num.c){
					retorno=1;
				}
				else if(c<num.c){
					retorno=-1;
				}
				return retorno;
			}
		}
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();
		while(linea != null && !linea.equals("")){
			int n = Integer.parseInt(linea);
			for (int i = 0; i < n; i++) {
				linea = in.readLine();
				String[] caracteres = linea.split(" ");
				int juego = Integer.parseInt(caracteres[0]);
				int punto  = Integer.parseInt(caracteres[1]);
				out.write("Team #"+(i+1)+"\n");
				out.write("Games: "+juego+"\n");
				out.write("Points: "+punto+"\n");
				out.write("Possible records:"+"\n");
				ArrayList<Numero> num=new ArrayList<Numero>();
				for (int j = 0; j <= 100; j++) {
					for (int j2 = 0; j2 <= 100; j2++) {
						for (int k = 0; k <=100; k++) {
							if(esValido(j, j2, k, punto, juego)){
								Numero numero = new Numero(j, j2, k);
								num.add(numero);
							}
						}
					}
				}
				Numero aux;
		        for (int k = 1; k < num.size(); k++) {
		            aux = num.get(k);
		            for (int j = k-1; j >=0 && num.get(j).compareTo(aux)==-1; j--) {
		                num.set(j+1, num.get(j));
		                num.set(j,aux);
		            }
		        }
		        

				for (int j = 0; j < num.size(); j++) {
					out.write(num.get(j)+"\n");
				}
				out.write("\n");
				
			}
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
	

	 
	 
	public static boolean esValido(int x, int y, int z, int puntos, int juego){
		if(((x*3 + y + z*0) == puntos) && ((x+y+z) == juego)){
			return true;
		}
		else{
			return false;
		}
	}
	
//	public static void ordenarMostrar(ArrayList<String> num){
//	        char aux;
//	        for (int i = 1; i < num.size(); i++) {
//	            aux = num.get(i).charAt(0);
//	            for (int j = i-1; j >=0 && num.get(j).charAt(0)<aux; j--) {
//	            	num[j+1]=array[j];
//	                array[j]=aux;
//	            }
//	        }
//	  
//	}
	public static void main(String[] args) {
		try {
			soccer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
