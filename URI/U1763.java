
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class U1763 {

	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=in.readLine())!=null){
			if(s.equals("brasil") || s.equals("portugal")) System.out.println("Feliz Natal!");
			else if(s.equals("alemanha")) System.out.println("Frohliche Weihnachten!");
			else if(s.equals("austria")) System.out.println("Frohe Weihnacht!");
			else if(s.equals("coreia")) System.out.println("Chuk Sung Tan!");
			else if(s.equals("espanha") || s.equals("argentina") || s.equals("chile") || s.equals("mexico")) System.out.println("Feliz Navidad!");
			else if(s.equals("grecia")) System.out.println("Kala Christougena!");
			else if(s.equals("estados-unidos") || s.equals("inglaterra") || s.equals("australia") || s.equals("antardida") || s.equals("canada")) System.out.println("Merry Christmas!");
			else if(s.equals("suecia")) System.out.println("God Jul!");
			else if(s.equals("turquia")) System.out.println("Mutlu Noeller");
			else if(s.equals("irlanda") )System.out.println("Nollaig Shona Dhuit!");
			else if(s.equals("belgica")) System.out.println("Zalig Kerstfeest!");
			else if(s.equals("italia") || s.equals("libia")) System.out.println("Buon Natale!");
			else if(s.equals("siria") || s.equals("marrocos")) System.out.println("Milad Mubarak!");
			else if(s.equals("japao")) System.out.println("Merii Kurisumasu!");
			else System.out.println("--- NOT FOUND ---");
		}
	}

}
