import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Created by Andres on 10/05/2016.
 */
//Problema estructuras
public class twice {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int N = Integer.parseInt(in.readLine());

        for (int i = 0; i < N; i++) {
            out.printf("%d\n", solve(in.readLine()));

        }
        out.flush();
        out.close();
        in.close();

    }

    public static void restar(int pos, char[] num) {

        num[pos]--;
        for (int i = pos + 1; i < num.length; i++) {

            num[i] = '9';
        }
    }

    public static long solve(String ln) {
        int[] digits = new int[10];
        char[] num = ln.toCharArray();
        long N = Long.parseLong(ln);
        int tam = num.length;

        int i = 0;
        int digito = 0;

        while (i < tam) {
            digito = Character.digit(num[i], 10);
            if (digits[digito] < 2) {
                digits[digito]++;
                i++;
            } else {
                if (digito == 0) {
                    while (digito == 0) {
                        i--;
                        digito = Character.digit(num[i], 10);
                    }
                }
                restar(i, num);
                N = Long.parseLong(new String(num));
                i = 0;
                num = (N + "").toCharArray();
                tam = num.length;
                digits = new int[10];
            }

        }
        return N;
    }

}
