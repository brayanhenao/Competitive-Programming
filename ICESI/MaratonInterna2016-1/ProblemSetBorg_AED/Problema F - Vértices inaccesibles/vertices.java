import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class vertices {
	
	 public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		int n;
		List<List<Integer>> grafo=new LinkedList<>();
		boolean visitado[];
		StringTokenizer tk;
		while (linea!=null && !linea.equals("0")) {
			n=Integer.parseInt(linea);
			for (int i = 0; i < n; i++) {
				grafo.add(new LinkedList<>());
			}
			String ver;
			while (true) {
				ver=in.readLine();
				if (ver.equals("0")) {
					break;
				}
				tk=new StringTokenizer(ver);
				int u=Integer.parseInt(tk.nextToken());
				while (true) {
					int v=Integer.parseInt(tk.nextToken());
					if (v==0) {
						break;
					}
					grafo.get(u-1).add(v-1);
				}
			}
			tk=new StringTokenizer(in.readLine());
			int querrys=Integer.parseInt(tk.nextToken());
			for (int i = 0; i < querrys; i++) {
				visitado=new boolean[n];
				int v=Integer.parseInt(tk.nextToken());
				bfs(v-1,grafo,visitado);
				ArrayList<Integer> inaccesibles=new ArrayList<>();
				for (int j = 0; j < visitado.length; j++) {
					if (!visitado[j]) {
						inaccesibles.add(j);
					}
				}
				int num=inaccesibles.size();
				out.write(num+"");;
				for (int j = 0; j < inaccesibles.size(); j++) {
					out.write(" "+(inaccesibles.get(j)+1));
				}
				out.write("\n");
			}
			grafo.clear();
			linea=in.readLine();
			}
		
			in.close();
			out.flush();
			out.close();
		}
	
	public static void bfs(int u,List<List<Integer>> grafo,boolean visitado[]){
		Queue<Integer> cola=new LinkedList<>();
		cola.add(u);
		
		while (!cola.isEmpty()) {
			int actual=cola.poll();
			for (int i = 0; i < grafo.get(actual).size(); i++) {
				if (!visitado[grafo.get(actual).get(i)]) {
					cola.add(grafo.get(actual).get(i));
					visitado[grafo.get(actual).get(i)]=true;
				}
			}
		}
		
	}
	
}
