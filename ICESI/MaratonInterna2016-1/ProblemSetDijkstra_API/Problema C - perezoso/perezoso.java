import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Created by Andres on 10/05/2016.
 */
//APO1
public class perezoso {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int N, a, b, cantBuenas;
        StringTokenizer stk;
        int T = Integer.parseInt(in.readLine());
        for (int t = 0; t < T; t++) {
            cantBuenas=0;
            N = Integer.parseInt(in.readLine());
            for (int n = 0; n < N ; n++) {
                stk = new StringTokenizer(in.readLine());
                a = Integer.parseInt(stk.nextToken());
                b = Integer.parseInt(stk.nextToken());
                cantBuenas = a==b? cantBuenas+1:cantBuenas;
            }
            double porcen = ((double)cantBuenas)/(double)N;
            out.printf("%d\n", (int)(porcen*5));

        }
        out.flush();
        out.close();
        in.close();

    }



}
