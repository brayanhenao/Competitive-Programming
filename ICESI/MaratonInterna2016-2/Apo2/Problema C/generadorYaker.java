package Apo2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ThreadLocalRandom;

public class generadorYaker {

	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(new File("yakerin.txt"))));
		int maxCasos = 100;
		int maxTerminos = 100;
		int maxCoef = 100;
		int maxExp = 100;
		out.write(maxCasos + "\n");
		for (int i = 0; i < maxCasos; i++) {
			int n = numRandom(maxTerminos);
			out.write(n + "\n");
			StringBuilder sb = new StringBuilder("");
			for (int j = 0; j < n; j++) {
				int exp = numRandom(maxExp);
				sb.append(numRandom(maxCoef) + "x");
				if (exp != 1) {
					if (j == n - 1) {
						sb.append(numRandom(maxExp));
					} else {
						sb.append(numRandom(maxExp) + " + ");
					}
				} else {
					if (j == n - 1) {
						sb.append("");
					} else {
						sb.append(" + ");
					}
				}
			}
			out.write(sb.toString().trim() + "\n");
		}
		out.close();

	}

	static int numRandom(int max) {
		return ThreadLocalRandom.current().nextInt(1, max + 1);
	}

}
