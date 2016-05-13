package turing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class viajero {

	
	
	public static void main(String[] args) throws IOException {
		
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	String linea  = "";
	
	
	
	while((linea = in.readLine()) != null){
	  
		StringTokenizer tokens = new StringTokenizer(linea);
		int grupos = Integer.parseInt(tokens.nextToken());
		int busquedas = Integer.parseInt(tokens.nextToken());
		
		HashMap<String, List<String>> datos = new HashMap<String, List<String>>();
		
		for(int i=0;i<grupos;i++){
			StringTokenizer grupo = new StringTokenizer(in.readLine());
			List<String> subg = new ArrayList<String>();
			String k = grupo.nextToken();
			while(grupo.hasMoreTokens()){
				subg.add(grupo.nextToken());
			}
			datos.put(k, subg);
		}
		
		for(int i=0;i<busquedas;i++){
			StringTokenizer busqu = new StringTokenizer(in.readLine());
			String inicial = busqu.nextToken();
			String encontrar = busqu.nextToken();
			boolean answ = DFS(inicial, encontrar, datos);
			out.write((answ) ? "42\n" : "MUERTO\n" );
		}
		
		
	}
	out.flush();
	out.close();
	in.close();
		
		
	}
	
	private static boolean DFS(String inicial, String encontrar, HashMap<String, List<String>> datos){
		
		boolean retorno = false;
		Stack<String> pila = new Stack<String>();
		TreeSet<String> visitados = new TreeSet<String>();
		pila.push(inicial);
		
		
		while(!pila.isEmpty() && !retorno){
			
			String act = pila.pop();
			
			List<String> adyacentes = datos.get(act);
			if(adyacentes != null){
			for(int i=0;i<adyacentes.size() && !retorno;i++){
				if(adyacentes.get(i).equals(encontrar)){
					retorno = true;
				}
				if(!visitados.contains(adyacentes.get(i))){
				pila.push(adyacentes.get(i));
				visitados.add(adyacentes.get(i));
				}
			}
			
		}
		}
		return retorno;
	}
	
	
}
