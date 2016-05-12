import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class basicgeometry {
	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		while (linea!=null && !linea.equals("")) {
			StringTokenizer tk=new StringTokenizer(linea);
			double radioA=Double.parseDouble(tk.nextToken());
			double radioB=Double.parseDouble(tk.nextToken());
			double r=radioA+radioB;
			double d=radioA-radioB;
//			System.out.println(d);
			double angulo=(2*Math.acos((d)/r));
			double areaLuna=(Math.pow(r, 2)/2)*(angulo-Math.sin(angulo));
					//(r)*(angulo/2)-((Math.pow(r, 2)*Math.sin(angulo))/2);
			double areaCirculo=Math.PI*(Math.pow(radioB, 2));
			DecimalFormat df = new DecimalFormat("#.###");
			df.setRoundingMode(RoundingMode.HALF_DOWN);
//			out.write(df.format(areaLuna-areaCirculo));
			out.write(df.format(areaLuna-areaCirculo)+"\n");
			
			linea=in.readLine();
		}
		
		in.close();
		out.flush();
		out.close();
	}
}
