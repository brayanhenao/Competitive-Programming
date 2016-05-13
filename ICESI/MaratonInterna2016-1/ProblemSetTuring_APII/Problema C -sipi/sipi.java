import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * Created by Andres on 10/05/2016.
 */
//APO2
public class sipi {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int N;
        int T = Integer.parseInt(in.readLine());
        Integer[] numeros;
        StringTokenizer stk;
        for (int t = 0; t < T ; t++) {

            N = Integer.parseInt(in.readLine());
            numeros = new Integer[N];
            stk = new StringTokenizer(in.readLine());
            for (int i = 0; i < N; i++) {
                numeros[i] = Integer.parseInt(stk.nextToken());
            }
            Arrays.sort(numeros, Collections.reverseOrder());

            boolean end = false;
            for (int i = 0; i < N-1 && !end; i++) {
                if(numeros[i] - numeros[i+1] > 10){
                    end = true;
                    out.printf("%d %d\n", i, i+1);
                }

            }
            if(!end){
                out.write("sipi\n");
            }
        }
        out.flush();
        out.close();
        in.close();

    }


}
