import java.io.*;
import java.util.*;

class ThrowingCardsAway1 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		String linea = in.readLine();
		Queue<Integer> descartados;
		Queue<Integer> cola;
		while (linea != null && !linea.equals("0")) {
			cola = new LinkedList<>();
			descartados = new LinkedList<>();
			for (int i = 1; i < Integer.parseInt(linea) + 1; i++) {
				cola.offer(i);
			}
			while (cola.size() > 1) {
				descartados.add(cola.poll());
				cola.add(cola.poll());
			}
			String r = "Discarded cards: ";
			int n = descartados.size();
			for (int i = 0; i < n; i++) {
				if (i == (n - 1)) {
					r += descartados.poll();
				} else {
					r += descartados.poll() + ", ";
				}
			}

			System.out.println(r.trim());
			System.out.println("Remaining card: " + cola.peek());
			linea=in.readLine();
		}

		in.close();
		out.flush();
		out.close();
	}
}