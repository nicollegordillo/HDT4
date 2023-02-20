import java.util.ArrayList;

public class Calculadora {
    private String postfix;
    private int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }
    public String infixapostfix(String infix, Implementacion<Character> imp){
        StringBuilder postfix1 = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                postfix1.append(c);
            } else if (c == '(') {
                imp.push(c);
            } else if (c == ')') {
                while (!imp.isEmpty() && imp.peek() != '(') {
                    postfix1.append(imp.pull());
                }
                if (!imp.isEmpty() && imp.peek() == '(') {
                    imp.pull();
                }
            } else { // c is an operator
                while (!imp.isEmpty() && precedence(c) <= precedence(imp.peek())) {
                    postfix1.append(imp.pull());
                }
                imp.push(c);
            }
        }

        while (!imp.isEmpty()) {
            postfix1.append(imp.pull());
        }

        postfix=postfix1.toString();
        return postfix;

    }
    public int evaluar(Implementacion<Integer> imp){
        for(int i=0; i<postfix.length(); i++){
            char c = postfix.charAt(i);
            int a =0;
            int b=0;
            if(Character.isDigit(c)){
                int t = Character.getNumericValue(c);
                    imp.push(t);
                }
                else if(c == '+'){
                    a = imp.pull();
                    b = imp.pull();
                    imp.push(a+b);
                }
                else if(c == '-'){
                a = imp.pull();
                b = imp.pull();
                imp.push(b-a);
                }
                else if(c == '*'){
                a = imp.pull();
                b = imp.pull();
                imp.push(a*b);
                }
                else if(c == '/'){
                a = imp.pull();
                b = imp.pull();
                imp.push(a/b);
                }
        }
        return imp.pull();

    }
    
}
