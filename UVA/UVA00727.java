import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class UVA00727 {
	
	private static Stack theStack;

	private static String output = "";

	public static String doTrans(String input) {
		output = "";
		for (int j = 0; j < input.length(); j++) {
			char ch = input.charAt(j);
			switch (ch) {
			case '+':
			case '-':
				gotOper(ch, 1);
				break; // (precedence 1)
			case '*': // it's * or /
			case '/':
				gotOper(ch, 2); // go pop operators
				break; // (precedence 2)
			case '(': // it's a left paren
				theStack.push(ch); // push it
				break;
			case ')': // it's a right paren
				gotParen(ch); // go pop operators
				break;
			default: // must be an operand
				output = output + ch; // write it to output
				break;
			}
		}
		while (!theStack.isEmpty()) {
			output = output + theStack.pop();

		}

		return output; // return postfix
	}

	public static void gotOper(char opThis, int prec1) {
		while (!theStack.isEmpty()) {
			char opTop = theStack.pop();
			if (opTop == '(') {
				theStack.push(opTop);
				break;
			} // it's an operator
			else {// precedence of new op
				int prec2;
				if (opTop == '+' || opTop == '-')
					prec2 = 1;
				else
					prec2 = 2;
				if (prec2 < prec1) // if prec of new op less
				{ // than prec of old
					theStack.push(opTop); // save newly-popped op
					break;
				} else
					// prec of new not less
					output = output + opTop; // than prec of old
			}
		}
		theStack.push(opThis);
	}

	public static void gotParen(char ch) {
		while (!theStack.isEmpty()) {
			char chx = theStack.pop();
			if (chx == '(')
				break;
			else
				output = output + chx;
		}
	}

	static class Stack {
		private int maxSize;

		private char[] stackArray;

		private int top;

		public Stack(int max) {
			maxSize = max;
			stackArray = new char[maxSize];
			top = -1;
		}

		public void push(char j) {
			stackArray[++top] = j;
		}

		public char pop() {
			return stackArray[top--];
		}

		public char peek() {
			return stackArray[top];
		}

		public boolean isEmpty() {
			return (top == -1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(in.readLine());
		boolean primero = true;
		String linea;
		while (N-- > 0) {
			if (primero) {
				linea = in.readLine();
				primero = false;
			}
			StringBuilder b = new StringBuilder();
			while ((linea = in.readLine())!=null && !(linea).equals("")) {
				b.append(linea.trim());
			}
			String cad = b.toString();
			theStack = new Stack(cad.length());
			cad = doTrans(cad);
//			StringBuilder build = new StringBuilder();
//			for (int j = 0; j < cad.length(); j++) {
//				char c = cad.charAt(j);
//				if (c == '^') {
//					build.append(cad.charAt(j + 1));
//					build.append(c);
//					j++;
//				} else {
//					build.append(c);
//				}
//			}
			out.write(cad + "\n");
			if(N>=1){
				out.write("\n");
			}
			
			

		}

		in.close();
		out.flush();
		out.close();

	}
}
