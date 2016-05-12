package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

class RobotInstructions {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();
		String[] estados;
//		HashMap<Integer, String> estados;
		while (linea != null && !linea.equals("")) {
			
			int n = Integer.parseInt(linea);
			for (int i = 0; i < n; i++) {
				int estadoInicial = 0;
				int instrucciones=Integer.parseInt(in.readLine());
//				estados=new HashMap<>();
				estados=new String[instrucciones];
				for (int j = 0; j < instrucciones; j++) {
					String instruccion = in.readLine();
					if (instruccion.equals("LEFT") || instruccion.equals("RIGHT")) {
//						estados.put(i, instruccion);
						estados[j] = instruccion;
					} else {
						String[] sp = instruccion.split(" ");
//						estados.put(i, estados.get(Integer.parseInt(sp[2]) - 1));
						String temp = estados[Integer.parseInt(sp[2]) - 1];
						estados[j] = temp;
					}
				}
				for (int j = 0; j < estados.length; j++) {
					if (estados[j].equals("RIGHT")) {
						estadoInicial+=1;
					}else{
						estadoInicial-=1;
					}
				}
				
//				Iterator it=estados.entrySet().iterator();
//				while (it.hasNext()) {
//					Map.Entry e = (Map.Entry)it.next();
//					if (e.getKey().equals("RIGHT")) {
//						estadoInicial+=1;
//					}else{
//						estadoInicial-=1;
//					}
//				}
				out.write(estadoInicial+"\n");

			}

			linea = in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}

}
