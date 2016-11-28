import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class generadorMinimo {

	
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		out.write("100\n");
		for(int i=0;i<100;i++){
			int a = (int)((Math.random()*49)) + 1 ;
			out.write(a+"\n");
			for(int j=0;j<a;j++){
				int b= 0;
				double c= Math.random();
				if(c>=0.4){
			 b = (int)(Math.random()*100);
				}else{
			 b = (int)(Math.random()*-100);
				}
				out.write(b+" ");
			}
			out.write("\n");
            for(int j=0;j<a;j++){
            	int b= 0;
				double c= Math.random();
				if(c<=0.4){
			 b = (int)(Math.random()*100);
				}else{
			 b = (int)(Math.random()*-100);
				}
				out.write(b+" ");
			}
            out.write("\n");
		}
		out.flush();
		
	}
}
