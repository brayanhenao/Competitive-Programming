import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class fatima {
	
	static char[] dict = "0123456789ABCDEF".toCharArray(); 

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(in.readLine());
		
		StringTokenizer stk;
		int a, b, c;
		int x, y, z;
		int i =0;
		while(T-- > 0){
			stk = new StringTokenizer(in.readLine());
			a = Integer.parseInt(stk.nextToken(), 16);
			b = Integer.parseInt(stk.nextToken(), 16);
			c = Integer.parseInt(stk.nextToken(), 16);
			stk = new StringTokenizer(in.readLine());
			x = Integer.parseInt(stk.nextToken(), 16);
			y = Integer.parseInt(stk.nextToken(), 16);
			z = Integer.parseInt(stk.nextToken(), 16);
			//System.out.println(i++);
			out.write(calcLinea(a, x)+"\n");
			out.write(calcLinea(b, y)+"\n");
			out.write(calcLinea(c, z)+"\n");
			
		}	
		out.close();
		in.close();

	}
	
	public static String calcLinea(int a, int x){
		
		int dleft, drigth;
		
		if(a > x){
			dleft = Math.abs(a-x);  
			drigth = 16 - dleft;
		}else{
			drigth = Math.abs(a-x);
			dleft = 16 - drigth;
		}		
		//System.out.println(drigth+" "+dleft);	
		if(dleft < drigth) return lineaLeft(a, x);
		else return lineaRigth(a, x);
		
		
	}
	
	public static String lineaLeft(int init, int fin){
		String s = "";
		while(init != fin){			
			s+=(dict[init]);
			//System.out.println(s);
			init--;
			if(init < 0) init = 15;
			
		}
		s+=dict[fin];
		return s;
	}
	
	public static String lineaRigth(int init, int fin){
		String s = "";
		while(init != fin){			
			s+=(dict[init]);
			//System.out.println(s);
			init++;
			if(init > 15) init = 0;
		}
		s+=dict[fin];
		return s;
	}

}
