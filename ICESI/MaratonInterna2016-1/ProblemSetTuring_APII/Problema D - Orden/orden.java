import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class orden {

	
	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String linea = "";
		
		while((linea = in.readLine()) != null){
			
			HashMap<Character, Integer> orden = new HashMap<Character, Integer>();
			int valores = Integer.parseInt(linea);
			for(int i=0; i<valores;i++){
				StringTokenizer tokens = new StringTokenizer(in.readLine());
				orden.put(tokens.nextToken().charAt(0), Integer.parseInt(tokens.nextToken()));
			}
			
		    String cadena = in.readLine();
		    ArrayList<Character> cad = new ArrayList<Character>();
		    for(int i=0;i<cadena.length();i++){
		    	cad.add(cadena.charAt(i));
		    }
			
		    Collections.sort(cad, new Comparator<Character>() {

				@Override
				public int compare(Character o1, Character o2) {
					int a=  orden.get(o1);
					int b = orden.get(o2);
					if(a>b){
						return -1;
					}else if(a<b){
						return 1;
					}
					return 0;
				}
		    	
			});
		    
		    StringBuilder answ = new StringBuilder();
		    for(int i=0;i<cad.size();i++){
		    	answ.append(cad.get(i));
		    }
		    out.write(answ.toString()+"\n");
		}
		out.flush();
		out.close();
		in.close();
		
		
	}
	
	
}
