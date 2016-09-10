import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

import javax.swing.text.AbstractDocument.LeafElement;

class rummikub {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		String linea = in.readLine();
		int casos = Integer.parseInt(linea);
		for (int i = 0; i < casos; i++) {

			int nfichas = Integer.parseInt(in.readLine());
			StringTokenizer tk = new StringTokenizer(in.readLine());

			if (nfichas < 3) {
				out.write("NO\n");
			} else {
				int[] red = new int[102];
				int[] blue = new int[102];
				int[] green = new int[102];
				int[] yellow = new int[102];
				// TreeSet<Integer>red=new TreeSet<>();
				// TreeSet<Integer>green=new TreeSet<>();
				// TreeSet<Integer>yellow=new TreeSet<>();
				// TreeSet<Integer>blue=new TreeSet<>();

				while (tk.hasMoreElements()) {
					String ficha = tk.nextToken();
//					switch (ficha.charAt(ficha.length() - 1)) {
//					case 'b':
//						blue[Integer.parseInt(ficha.substring(0, ficha.length() - 1))] = 1;
//						break;
//					case 'g':
//						green[Integer.parseInt(ficha.substring(0, ficha.length() - 1))] = 1;
//						break;
//					case 'r':
//						red[Integer.parseInt(ficha.substring(0, ficha.length() - 1))] = 1;
//						break;
//					case 'y':
//						
//						break;
//					}

					if(ficha.charAt(ficha.length() -1 ) == 'y'){
						yellow[Integer.parseInt(ficha.substring(0, ficha.length() - 1))] = 1;
					}else if(ficha.charAt(ficha.length() -1 ) == 'b'){
						blue[Integer.parseInt(ficha.substring(0, ficha.length() - 1))] = 1;
					}else if(ficha.charAt(ficha.length() -1 ) == 'g'){
						green[Integer.parseInt(ficha.substring(0, ficha.length() - 1))] = 1;
					}else if(ficha.charAt(ficha.length() -1 ) == 'r'){
						red[Integer.parseInt(ficha.substring(0, ficha.length() - 1))] = 1;
					}
				
					
				}

				int contadorRed = 0;
				boolean salir = false;
				for (int j = 1; j <= 100 && !salir; j++) {
					if (contadorRed != 2) {
						
							if (red[j] == 1 & red[j + 1] == 1) {
								contadorRed++;
							} else {
								contadorRed = 0;
							}
						

					} else {
						salir = true;
					}

				}
				int contadorBlue = 0;
				for (int j = 1; j <= 100 && !salir; j++) {
					if (contadorBlue != 2) {

						if (blue[j] == 1 && blue[j + 1] == 1) {
							contadorBlue++;
						} else {
							contadorBlue = 0;
						}

					} else {
						salir = true;
					}

				}
				int contadorYellow = 0;
				for (int j = 1; j <= 100 && !salir; j++) {
					if (contadorYellow != 2) {

						if (yellow[j] == 1 && yellow[j + 1] == 1) {
							contadorYellow++;
						} else {
							contadorYellow = 0;
						}

					} else {
						salir = true;
					}

				}
				int contadorGreen = 0;
				for (int j = 1; j <= 100 && !salir; j++) {
					if (contadorGreen != 2) {

						if (green[j] == 1 && green[j + 1] == 1) {
							contadorGreen++;
						} else {
							contadorGreen = 0;
						}

					} else {
						salir = true;
					}

				}
				if (salir) {
					out.write("YES\n");
				} else {
					boolean sePuede = false;
					int contadorUltimoCaso = 0;
					for (int j = 1; j <= 100 && !sePuede; j++) {
						int n=red[j]+blue[j]+green[j]+yellow[j];
						if (n>=3) {
							sePuede = true;
						}
					}
					if (sePuede) {
						out.write("YES\n");
					} else {
						out.write("NO\n");
					}

				}

			}

		}

		in.close();
		out.flush();
		out.close();
	}
}
