package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class FactorialYouMustBeKidding {
	public static long factorial(long numero){
		if(numero==0)
			return 1;
		else
			return numero*factorial(numero-1);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();

		while (linea != null && !linea.equals("")) {
			long n=Long.parseLong(linea);
			if (n<0) {
				n=Math.abs(n);
			}
			if(n<8){
				out.write("Underflow!\n");
			}else if(n>13){
				out.write("Overflow!\n");
			}else{
				out.write(factorial(n)+"\n");
			}
			
			linea=in.readLine();
		}

		in.close();
		out.flush();
		out.close();
	}
}
