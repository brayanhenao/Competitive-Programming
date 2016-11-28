import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pokemon {

	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new FileReader("pokemonentrada.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("pokemonsalida.txt"));
		
		String linea = br.readLine();
		int n = Integer.parseInt(linea);
		
		for (int i = 0; i < n; i++) {
			linea = br.readLine();
			String[] nombreynivel = linea.split(" ");
			String nombre = nombreynivel[0];
			int nivel = Integer.parseInt(nombreynivel[1]);
			
			linea = br.readLine();
			String[] hpinicial = linea.split(" ");
			double hpbe = Double.parseDouble(hpinicial[0]);
			double hpvi = Double.parseDouble(hpinicial[1]);
			double hpve = Double.parseDouble(hpinicial[2]);
			
			linea = br.readLine();
			String[] atinicial = linea.split(" ");
			double atbe = Double.parseDouble(atinicial[0]);
			double atvi = Double.parseDouble(atinicial[1]);
			double atve = Double.parseDouble(atinicial[2]);
			
			linea = br.readLine();
			String[] dfinicial = linea.split(" ");
			double dfbe = Double.parseDouble(dfinicial[0]);
			double dfvi = Double.parseDouble(dfinicial[1]);
			double dfve = Double.parseDouble(dfinicial[2]);
			
			
			linea = br.readLine();
			String[] spinicial = linea.split(" ");
			double spbe = Double.parseDouble(spinicial[0]);
			double spvi = Double.parseDouble(spinicial[1]);
			double spve = Double.parseDouble(spinicial[2]);
			
			int hp = (int)(((hpvi+hpbe+Math.sqrt(hpve)/8+50)*nivel)/50)+10;
			int at = (int)(((atvi+atbe+Math.sqrt(atve)/8)*nivel)/50)+5;
			int df = (int)(((dfvi+dfbe+Math.sqrt(dfve)/8)*nivel)/50)+5;
			int sp = (int)(((spvi+spbe+Math.sqrt(spve)/8)*nivel)/50)+5;
			
			bw.write("Caso #"+(i+1)+": "+nombre+" nivel "+nivel+"\n");
			bw.write("HP: "+hp+"\n");
			bw.write("AT: "+at+"\n");
			bw.write("DF: "+df+"\n");
			bw.write("SP: "+sp+"\n");
		}
		br.close();
		bw.close();
	}

}
