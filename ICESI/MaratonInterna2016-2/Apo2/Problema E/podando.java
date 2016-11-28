import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class podando {
	
	public static class NodoABB{
		public NodoABB izq;
		public NodoABB der;
		public int valor;
		
		public NodoABB(int v){
			valor = v;
		}
		
		public void insertar(NodoABB nuevo){
			if(nuevo.valor<valor){
				if(izq==null){
					izq = nuevo;
				}else{
					izq.insertar(nuevo);
				}
			}else{
				if(der==null){
					der = nuevo;
				}else{
					der.insertar(nuevo);
				}
			}
		}
		
		public String podarHojas(){
			String podados = "";
			if(izq!=null){
				if(izq.izq==null && izq.der==null){
					podados += izq.valor + " ";
					izq = null;
				}else{
					podados += izq.podarHojas();
				}
			}
			if(der!=null){
				if(der.izq==null && der.der==null){
					podados += der.valor + " ";
					der = null;
				}else{
					podados += der.podarHojas();
				}
			}
			return podados;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//BufferedReader br = new BufferedReader(new FileReader("podandoentrada.txt"));
		//BufferedWriter bw = new BufferedWriter(new FileWriter("podandosalida.txt"));
		
		String linea = br.readLine();
		int n = Integer.parseInt(linea);
		
		for (int i = 0; i < n; i++) {
			br.readLine();
			linea = br.readLine();
			String[] nodos = linea.split(" ");
			int v = Integer.parseInt(nodos[0]);
			NodoABB raiz = new NodoABB(v);
			for (int j = 1; j < nodos.length; j++) {
				v = Integer.parseInt(nodos[j]);
				raiz.insertar(new NodoABB(v));
			}
						
			while(raiz!=null){
				String podados = "";
				if(raiz.izq==null && raiz.der==null){
					podados += raiz.valor + " ";
					raiz = null;
				}else{
					podados += raiz.podarHojas();
				}
				bw.write(podados+"\n");
			}
		}
				
		br.close();
		bw.close();
	}

}
