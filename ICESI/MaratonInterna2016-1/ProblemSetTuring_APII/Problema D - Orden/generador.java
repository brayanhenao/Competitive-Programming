package borg;

import java.util.TreeSet;

public class generador {

	
	
	public static void main(String[] args) {
		
		for(int j=0;j<49;j++){
		int a = (int)(Math.random()*16)+5;
		System.out.println(a);
	    TreeSet<Integer> letras = new TreeSet<Integer>();
		for(int i=0;i<a;i++){
		int b = (int)((Math.random()*26) + 65);
		if(letras.contains(b)){
			i--;
		}else{
		int c = (int)((Math.random()*101) + 1);
		char caracter = (char)b;
		letras.add(b);
		System.out.println(caracter+" "+ c);
		}
		}
		StringBuilder cadena = new StringBuilder();
		for (int integer : letras) {
			char caract = (char) integer;
			cadena.append(caract+"");
		}
		System.out.println(cadena.toString());
		}
	}
	
	
	
	
}
