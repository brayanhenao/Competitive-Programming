import java.io.*;
import java.util.*;

public class paneles {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer tk;
		int t=Integer.parseInt(in.readLine());
		while (t-->0) {
			ArrayList<BST> arboles = new ArrayList<>();
			tk = new StringTokenizer(in.readLine());
			int n = Integer.parseInt(tk.nextToken());
			int k = Integer.parseInt(tk.nextToken());
			while (n-- > 0) {
				tk = new StringTokenizer(in.readLine());
				int aux = Integer.parseInt(tk.nextToken());
				BST arbol = new BST(aux);
				for (int i = 0; i < k - 1; i++) {
					aux = Integer.parseInt(tk.nextToken());
					arbol.agregarNodo(aux);
				}
				arboles.add(arbol);
			}
			int grupos = 0;

			for (int i = 0; i < arboles.size(); i++) {

				BST actual = arboles.get(i);
				if (!actual.marcado) {
					for (int j = i + 1; j < arboles.size(); j++) {
						BST aux = arboles.get(j);
						if (!aux.marcado) {
							if (compararArboles(actual.raiz, aux.raiz)) {
								arboles.get(j).marcado = true;
							}
						}
					}
					grupos++;
					actual.marcado = true;

				}

			}

			out.write(grupos + "\n");

		}
		in.close();
		out.close();
	}

	public static boolean compararArboles(Node a, Node b) {

		if (a == null && b == null) {
			return true;
		}
		if (a.izq == null && b.izq != null) {
			return false;
		}
		if (a.der == null && b.der != null) {
			return false;
		}
		if (b.izq == null && a.izq != null) {
			return false;
		}
		if (b.der == null && a.der != null) {
			return false;
		}

		return compararArboles(a.izq, b.izq) && compararArboles(a.der, b.der);
	}

	static class Node {
		int info;
		Node izq;
		Node der;

		public Node(int info) {
			this.info = info;
			this.izq = null;
			this.der = null;
		}

		public void agregarNodo(int info) {
			Node temp = new Node(info);
			if (temp.info >= this.info) {
				if (der == null) {
					der = temp;
				} else {
					der.agregarNodo(info);
				}
			} else {
				if (izq == null) {
					izq = temp;
				} else {
					izq.agregarNodo(info);
				}
			}
		}
	}

	static class BST {
		Node raiz;
		boolean marcado;

		public BST(int raiz) {
			this.raiz = new Node(raiz);
			marcado = false;
		}

		public void agregarNodo(int info) {
			Node temp = new Node(info);
			if (raiz == null) {
				raiz = temp;
			} else if (temp.info >= raiz.info) {
				if (raiz.der == null) {
					raiz.der = temp;
				} else {
					raiz.der.agregarNodo(info);
				}

			} else {
				if (raiz.izq == null) {
					raiz.izq = temp;
				} else {
					raiz.izq.agregarNodo(info);
				}
			}
		}
	}
}
