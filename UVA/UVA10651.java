import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class UVA10651 {

	static class Pair {
		public int x;
		public boolean y;

		public Pair(int x, boolean y) {
			this.x = x;
			this.y = y;
		}
	}

	public final static boolean BOLA = true;
	public final static boolean RAYA = false;
//	public static int min=100;

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int n = Integer.parseInt(in.readLine());
		boolean[] arr = new boolean[12];
		while (n-- > 0) {
			String linea=in.readLine();
			for (int i = 0; i < linea.length(); i++) {
				if (linea.charAt(i) == 'o') {
					arr[i] = BOLA;
				} else {
					arr[i] = RAYA;
				}
			}
			// System.out.println(Arrays.toString(mover(arr, 3, true)));
			// System.out.println(Arrays.toString(mover(arr, 4, false)));
			out.println(pebble(arr));
		}

		in.close();
		out.close();
	}

	public static int contarBolas(boolean[] arr) {
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]) {
				num++;
			}
		}
		return num;
	}

	public static void mover(boolean[] arr, int index, boolean xd) {
		if (xd) {
			for (int i = 0; i < arr.length - 2; i++) {
				if (i == index) {
					arr[i] = RAYA;
					arr[i + 1] = RAYA;
					arr[i + 2] = BOLA;
				}
			}
		} else {
			for (int i = 0; i < arr.length - 2; i++) {
				if (i == index) {
					arr[i] = BOLA;
					arr[i - 1] = RAYA;
					arr[i - 2] = RAYA;
				}
			}
		}

	}

	public static int pebble(boolean[] arr) {
		ArrayList<Pair> indices = new ArrayList<>();
		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i] && arr[i + 1] && !arr[i + 2]) {
				indices.add(new Pair(i, true));
			} else if (!arr[i] && arr[i + 1] && arr[i + 2]) {
				indices.add(new Pair(i + 2, false));
			}
		}

		if (indices.isEmpty()) {
			return contarBolas(arr);
		}

		
		int min=13;
		for (int i = 0; i < indices.size(); i++) {
			boolean[] aux = arr.clone();
			Pair actual = indices.get(i);
			// System.out.println(actual.x+" "+actual.y);
			if (actual.y) {
				aux[actual.x] = RAYA;
				aux[actual.x + 1] = RAYA;
				aux[actual.x + 2] = BOLA;
			} else {
				aux[actual.x] = RAYA;
				aux[actual.x - 1] = RAYA;
				aux[actual.x - 2] = BOLA;
			}
//			mover(aux, actual.x, actual.y);

			min = Math.min(min, pebble(aux));
		}

		return min;

	}
}
