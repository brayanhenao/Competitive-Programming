import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class spock {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		int t;
		StringTokenizer tk;
		while(linea!=null && !linea.equals("")){
			t=Integer.parseInt(linea);
			for (int i = 0; i < t; i++) {
				tk=new StringTokenizer(in.readLine());
					String jugador1=tk.nextToken();
					String jugador2=tk.nextToken();
					
					if (jugador1.equals(jugador2)) {
						out.write("Empate\n");
					}else if(jugador1.equals("tijera") && jugador2.equals("papel")){
						out.write("Rajesh\n");
					}else if(jugador1.equals("papel") && jugador2.equals("piedra")){
						out.write("Rajesh\n");
					}else if(jugador1.equals("piedra") && jugador2.equals("lagarto")){
						out.write("Rajesh\n");
					}else if(jugador1.equals("lagarto") && jugador2.equals("spock")){
						out.write("Rajesh\n");
					}else if(jugador1.equals("spock") && jugador2.equals("tijera")){
						out.write("Rajesh\n");
					}else if(jugador1.equals("tijera") && jugador2.equals("lagarto")){
						out.write("Rajesh\n");
					}else if(jugador1.equals("lagarto") && jugador2.equals("papel")){
						out.write("Rajesh\n");
					}else if(jugador1.equals("papel") && jugador2.equals("spock")){
						out.write("Rajesh\n");
					}else if(jugador1.equals("spock") && jugador2.equals("piedra")){
						out.write("Rajesh\n");
					}else if(jugador1.equals("piedra") && jugador2.equals("tijera")){
						out.write("Rajesh\n");	
					}else{
						out.write("Bazinga\n");
					}
			}
			linea=in.readLine();
			
		}
		
		
		out.flush();
		out.close();
		in.close();
	}
}
