import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GeneradorCasos {
	static String armas[]={"piedra","papel","tijera","lagarto","spock"};
	public static void main(String[] args) throws IOException {
		BufferedWriter out= new BufferedWriter(new FileWriter("spock.in"));
		int testc=50;
		out.write(testc+"\n");
		for (int i = 0; i < testc; i++) {
			String juego="";
			juego+=armas[aleatorio()]+" "+armas[aleatorio()];
			out.write(juego+"\n");
		}
		out.flush();
		out.close();
	}
	
	public static int aleatorio(){
		Random rn=new Random();
		return rn.nextInt(5);
		
	}
}
