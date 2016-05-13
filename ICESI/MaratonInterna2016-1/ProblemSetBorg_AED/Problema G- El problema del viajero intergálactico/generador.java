package turing;

import java.util.TreeSet;

public class generador {

	private static char[] groups = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	public static void main(String[] args) {
		
	for(int k = 0; k<20;k++){
	int grupos = (int)(Math.random()*24 + 3);
	int busquedas = (int)(Math.random()*10) +1;
	System.out.println(grupos+" " + busquedas);
	for(int i=0;i<grupos;i++){
		String grup = "";
		
		int sub = (int)(Math.random()*grupos);
		grup+= groups[i];
		TreeSet<Character> rep = new TreeSet<Character>();
		for(int j=0;j<sub;j++){
			int g = (int)(Math.random()*grupos);
			if(!rep.contains(groups[g])){
				rep.add(groups[g]);
				grup+=" " + groups[g];
			}else{
				j--;
			}
		}
		System.out.println(grup);
		
	}
	String bus = "";
	for(int i=0;i<busquedas;i++){
    TreeSet<Character> rep = new TreeSet<Character>();	
	int b1 = (int)(Math.random()*26);
	int b2 = (int)(Math.random()*26);
	while(b2 == b1){
		b2 = (int)(Math.random()*26);
	}
	System.out.println(groups[b1] + " " + groups[b2]);

	}
		
	
	}
	}
	
	
	
	
}
