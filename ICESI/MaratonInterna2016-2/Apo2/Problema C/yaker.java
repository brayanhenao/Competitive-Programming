package Apo2;

import java.io.*;
import java.util.*;

public class yaker {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		Expresion[] polinomio;
		StringTokenizer tk;
		int t = Integer.parseInt(in.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(in.readLine());
			polinomio = new Expresion[n];
			tk = new StringTokenizer(in.readLine(), "+");
			for (int i = 0; i < polinomio.length; i++) {
				String poli = tk.nextToken().trim();
				String[] sp = poli.split("x");
				polinomio[i] = new Expresion(Integer.parseInt(sp[0]), sp.length > 1 ? Integer.parseInt(sp[1]) : 1);
			}
			for (int i = 0; i < polinomio.length; i++) {
				Expresion aux = derivar(polinomio[i]);
				polinomio[i] = aux;
			}
			StringBuilder sb = new StringBuilder("");
			for (int i = 0; i < polinomio.length; i++) {
				String exp = "";
				if (polinomio[i].exp > 1) {
					exp += polinomio[i].exp;
				}
				if (i == polinomio.length - 1) {
					if (polinomio[i].exp == 0) {
						sb.append(polinomio[i].coef);
					} else {
						sb.append(polinomio[i].coef + "x" + exp);
					}
				} else {
					if (polinomio[i].exp == 0) {
						sb.append(polinomio[i].coef + " + ");
					} else {
						sb.append(polinomio[i].coef + "x" + exp + " + ");
					}
				}
			}
			out.write(sb.toString() + "\n");
		}
		in.close();
		out.close();
	}

	public static Expresion derivar(Expresion x) {
		return new Expresion(x.coef * x.exp, x.exp - 1);
	}

	static class Expresion {
		int coef;
		int exp;

		public Expresion(int coef, int exp) {
			this.coef = coef;
			this.exp = exp;
			// TODO Auto-generated constructor stub
		}
	}
}