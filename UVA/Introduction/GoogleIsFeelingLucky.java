package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class GoogleIsFeelingLucky {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		String[] webs;
		int[] relevancias;
		int caso=1;
		while (linea!=null&& !linea.equals("")) {
			int n=Integer.parseInt(linea);
			for (int i = 0; i < n; i++) {
				webs=new String[10];
				relevancias=new int[10];
				int mayor=0;
				for (int j = 0; j < 10; j++) {
					String[] sp=in.readLine().split(" ");
					webs[j]=sp[0];
					relevancias[j]=Integer.parseInt(sp[1]);
					if (relevancias[j]>mayor) {
						mayor=relevancias[j];
					}
				}
				out.write("Case #"+caso+":\n");
				for (int j = 0; j < relevancias.length; j++) {
					if (relevancias[j]==mayor) {
						out.write(webs[j]+"\n");
					}
				}
				caso++;
			}
			
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
