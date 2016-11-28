package APO1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class generadorPokemon {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(new File("Pokemones.txt")));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(new File("in.txt"))));
		ArrayList<String> pokemones = new ArrayList<>();
		String linea = in.readLine();
		while ((linea = in.readLine()) != null) {
			pokemones.add(linea);
		}

		int maxlvl = 100;
		int maxPokemon = pokemones.size()-1;
		int maxBe = 255;
		int maxVI = 15;
		int maxVE = 262140;
		out.write(1000+"\n");
		for (int i = 0; i < 1000; i++) {
			out.write(pokemones.get(numRandom(maxPokemon)) + " " + numRandom(maxlvl) + "\n");
			for (int j = 0; j < 4; j++) {
				out.write(numRandom(maxBe) + " " + numRandom(maxVI) + " " + numRandom(maxVE) + "\n");
			}
		}
		in.close();
		out.close();

	}

	static int numRandom(int max) {
		return ThreadLocalRandom.current().nextInt(1, max + 1);
	}
}
