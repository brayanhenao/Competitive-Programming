package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


class Palindromes {
	
	static Hashtable<String, String> tabla = new Hashtable<String, String>();
	
	private static void llenarTabla(){
		tabla.put("A", "A");
        tabla.put("E", "3");
        tabla.put("H", "H");
        tabla.put("I", "I");
        tabla.put("J", "L");
        tabla.put("L", "J");
        tabla.put("M", "M");
        tabla.put("O", "O");
        tabla.put("T", "T");
        tabla.put("U", "U");
        tabla.put("V", "V");
        tabla.put("W", "W");
        tabla.put("X", "X");
        tabla.put("Y", "Y");
        tabla.put("Z", "5");
        tabla.put("1", "1");
        tabla.put("2", "S");
        tabla.put("3", "E");
        tabla.put("5", "Z");
        tabla.put("8", "8");
        
	}
	public static boolean checkPalindromes(String str) {

        char stringArray[] = str.toCharArray();

        // Always return true if length is 1
        if(stringArray.length  == 1) return true;

        int i = 0 ;
        int j = stringArray.length - 1;
        boolean check_palindrone = true;
        while(i <= j) {
            if(stringArray[i] != stringArray[j]){
                check_palindrone = false;
                break;
            }
            ++i;
            --j;
        }

        return check_palindrone;

 }
	 public static boolean checkMirrorString(String str) {

	        // convert it to character array
	        char tochar[] = str.toCharArray();

	        // Init mirror table
	        llenarTabla();

	        boolean is_mirrorstr = false;


	        // Replace each character with it's mirror character
	        for(int i = 0 ; i < tochar.length ; i++) {

	            // Get the reverse character
	            String temp_str = tabla.get(Character.toString(tochar[i]));

	            // if Not found then return false
	            if( temp_str == null )  { return false; }

	            char reverse_char = temp_str.charAt(0); 
	            tochar[i] = reverse_char;

	        }

	        String rev = String.valueOf(tochar);
	        StringBuffer mirror  = new StringBuffer(rev).reverse();

	        if(str.equals(mirror.toString())) is_mirrorstr = true;

	        return is_mirrorstr;

	}
	private static boolean verificarPalindromo(String palabra){
		StringBuffer voltear=new StringBuffer(palabra).reverse();
		if (palabra.equals(voltear.toString())) {
			return true;
		}
		return false;
	}
	private static boolean verificarEspejo(String palabra){
    	llenarTabla();
    	char[] palab=palabra.toCharArray();
    	boolean esEspejo=false;
    	
    	for (int i = 0; i < palab.length; i++) {
			String p=tabla.get(Character.toString(palab[i]));
			if (p==null) {
				return false;
			}
			palab[i]=p.charAt(0);
    	}
			String palabraReverso=String.valueOf(palab);
			StringBuffer voltear=new StringBuffer(palabraReverso).reverse();
			if (palabra.equals(voltear.toString())) {
				esEspejo=true;
			}
			return esEspejo;
		}      
    

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		while (linea!=null && !linea.equals("")) {
			boolean esPalindromo=checkPalindromes(linea);
			boolean esEspejo=checkMirrorString(linea);
				if (esPalindromo) {
					if (esEspejo) {
						out.write(linea+" -- is a mirrored palindrome.\n");
					}
					out.write(linea+" -- is a regular palindrome.\n");
				}else{
					if (esEspejo) {
						out.write(linea+" -- is a mirrored palindrome.\n");
					}
					out.write(linea+" -- is not a palindrome.\n");
				}
				out.write("\n");
				linea=in.readLine();		
		}
		in.close();
		out.flush();
		out.close();
	}
}
