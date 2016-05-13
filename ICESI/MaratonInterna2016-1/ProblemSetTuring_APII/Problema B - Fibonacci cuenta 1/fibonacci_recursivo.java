import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class fibonacci_recursivo {
	public static int fibonacciCuenta1(int n){
		if(n==0){
			return 1;
		}else if(n==1){
			return 1;
		}else{
			return fibonacciCuenta1(n-1)+fibonacciCuenta1(n-2)+1;
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String linea = br.readLine();
		int c = Integer.parseInt(linea);
		
		for (int i = 0; i < c; i++) {
			linea = br.readLine();
			int n = Integer.parseInt(linea);
			int f = fibonacciCuenta1(n);
			bw.write(f+"\n");
		}
		br.close();
		bw.close();
	}
}
