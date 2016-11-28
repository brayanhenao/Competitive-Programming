import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class dislexia {

	
	
	private static String[] numeros = {"CERO","UNO","DOS","TRES","CUATRO","CINCO","SEIS","SIETE","OCHO","NUEVE","DIEZ"};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int casos = Integer.parseInt(in.readLine());
		for(int i=1;i<=casos;i++){
			StringTokenizer numero = new StringTokenizer(in.readLine());
			int n1 = encontrar(numero.nextToken());
			String op = numero.nextToken();
			int n2 = encontrar(numero.nextToken());
			int answ = 0;
			if(op.equals("MAS")){
				answ = n1+n2;
			}else{
				answ = n1-n2;
			}
			String respuesta = "";
			if(answ<0){
				respuesta+="MENOS ";
				answ*=-1;
			}
			respuesta+=numeros[answ];
			out.write("CASO " + i + ": " + respuesta+"\n");
		}
		out.flush();
	}
	
	public static int encontrar(String numero){
		for(int i=0;i<numeros.length;i++){
			if(numero.equals(numeros[i])) return i;
		}
		return -1;
	}
	
}
