import javax.jnlp.IntegrationService;
import java.io.*;
import java.util.Dictionary;
import java.util.HashMap;

/**
 * Created by Felipe on 5/11/2016.
 */
public class LCA {

    public static class Nodo{

        public int valor;
        public Nodo izquierdo;
        public Nodo derecho;

        public Nodo(int val, Nodo izq, Nodo der){
            valor = val;
            izquierdo = izq;
            derecho = der;
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String linea = "";

        while ((linea = in.readLine()) != null) {

            String[] numYnodos = linea.split(",");

            int N = Integer.parseInt(numYnodos[0]);

            String[] sNodos = numYnodos[1].split(" ");

            HashMap<Integer, Nodo> nodos = new HashMap<Integer, Nodo>(sNodos.length);

            for (int i = 0; i < sNodos.length; i++) {
                nodos.put(i, new Nodo(Integer.parseInt(sNodos[i]), null, null));
            }

            int valorRaiz = 0;

            for (int i = 0; i < N - 1; i++) {


                String[] nds = in.readLine().split(" ");

                String nA = nds[0];
                String nB = nds[1];
                String nC = nds[2];

                int A = Integer.parseInt(nA);

                if(i == 0){
                    valorRaiz = A;
                }

                if (!nB.equals("n")){
                    int B = Integer.parseInt(nB);
                    nodos.get(A).izquierdo = nodos.get(B);
                }

                if (!nC.equals("n")){
                    int C = Integer.parseInt(nC);
                    nodos.get(A).derecho = nodos.get(C);
                }

            }

            String[] nodosB = in.readLine().split(" ");

            int valorNodoAncestro = EncontrarLCA(nodos.get(valorRaiz), nodos.get(Integer.parseInt(nodosB[0])), nodos.get(Integer.parseInt(nodosB[1])));

            System.out.println(valorNodoAncestro);

        }

        out.flush();
        out.close();
        in.close();

    }

    private static int EncontrarLCA(Nodo actual, Nodo nodo1, Nodo nodo2) {

        if(nodo1.valor < actual.valor && nodo2.valor < actual.valor){
            return EncontrarLCA(actual.izquierdo, nodo1, nodo2);
        }
        else if(nodo1.valor > actual.valor && nodo2.valor > actual.valor){
            return EncontrarLCA(actual.derecho, nodo1, nodo2);
        }
        else{
            return actual.valor;
        }

    }

}

