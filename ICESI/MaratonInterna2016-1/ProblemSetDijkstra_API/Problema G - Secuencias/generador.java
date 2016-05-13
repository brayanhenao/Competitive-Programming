package dijkstra;


public class generador {

	
	public static void main(String[] args) {
		String casos = "";
		for(int j = 0;j<20;j++){
	    String caso = "";
		int a = (int)(Math.random()*11);
		int b = (int)(Math.random()*5)+1;
		int[] numeros = new int[b];
		char[] operadores = new char[b];
		for(int i=0;i<b;i++){
			int d = (int)(Math.random()*(5)) +5;
			
			numeros[i] = d;
			if(i!=0 && numeros[i-1]>=numeros[i] && i%2==1){
				numeros[i]-=3;
			}
			switch (i%2) {
			case 0:
				caso+= d+"+ ";
				operadores[i] = '+';
				break;
			case 1:
				caso+= d+"- ";
				operadores[i] = '-';
				break;
			case 2:
				caso+= d+"* ";
				operadores[i] = '*';
				break;
			case 3:
				caso+= d+"/ ";
				operadores[i] = '/';
				break;
			}
			}
		
		 caso = caso.substring(0,caso.length()-1)+"\n";
		b = (int)(Math.random()*4)+1;
		for(int k=0;k<b;k++){
			for(int l =0;l<operadores.length;l++){
				a= operar(operadores[l], a, numeros[l]);
			}
		}
		if(a>0){
		caso = a+"\n" + caso;
		casos+= caso;
		}else{
			j--;
		}
		}
		
		System.out.println(casos);
	}
	
	
	private static int operar(char op, int num, int num2){
		
		switch (op) {
		case '+':
			return num+num2;
		case '-':
			return num-num2;
		 default:
		return -1;
		}
	
		
	}
	
	
	
}
