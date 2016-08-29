package Introduction;
import java.util.*;
import java.io.*;

class ThrowingCardsAway2 {

	static HashMap<String, Integer> tabla = new HashMap<String, Integer>();

	public static void main(String[] args) throws IOException {
		llenarTabla();
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		while (linea!=null && !linea.equals("")) {
			Integer a = tabla.get(in.readLine());
			if (a==null) {
				out.write("0\n");
			}else{
				out.write(a+"\n");
			}
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}

	private static void llenarTabla() {
		int Index = 1;
		Queue<String> letras = new LinkedList<String>();
		
		for (Character c = 'a'; c <= 'z'; tabla.put(c.toString(), Index++), c++) {
			letras.add(c.toString());
		}

		
		while (!letras.isEmpty()) {
			String s = letras.poll();
			char last = s.charAt(s.length() - 1);
			if (s.length() == 5 || last == 'z'){
				continue;
			}
			for (char next = ++last; next <= 'z'; letras.add(s + next), next++) {
				tabla.put(s + next, Index++);
			}
		}

	}
}