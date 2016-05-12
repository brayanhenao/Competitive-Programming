import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class U1077 {  
	
	
private static Stack theStack;

private static String output = "";

public static String doTrans(String input) {
	output="";
  for (int j = 0; j < input.length(); j++) {
    char ch = input.charAt(j);
    switch (ch) {
    case '+': 
    case '-':
      gotOper(ch, 1); 
      break; //   (precedence 1)
    case '*': // it's * or /
    case '/':
      gotOper(ch, 2); // go pop operators
      break; //   (precedence 2)
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
    }// it's an operator
    else {// precedence of new op
      int prec2;
      if (opTop == '+' || opTop == '-')
        prec2 = 1;
      else
        prec2 = 2;
      if (prec2 < prec1) // if prec of new op less
      { //    than prec of old
        theStack.push(opTop); // save newly-popped op
        break;
      } else
        // prec of new not less
        output = output + opTop; // than prec of old
    }
  }
  theStack.push(opThis);
}

public static void gotParen(char ch){ 
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
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		String linea;
		while((linea=in.readLine())!=null){
			int n=Integer.parseInt(linea);
			
			for (int i = 0; i < n; i++) {
				String cad=in.readLine();
				theStack=new Stack(cad.length());
				cad=doTrans(cad);
				StringBuilder build=new StringBuilder();
				for (int j = 0; j < cad.length(); j++) {
					char c=cad.charAt(j);
					if (c=='^') {
						build.append(cad.charAt(j+1));
						build.append(c);
						j++;
					}else{
						build.append(c);
					}
				}
				out.write(build.toString()+"\n");
			}
		}
		in.close();
		out.flush();
		out.close();
	
	}
	
	
}
