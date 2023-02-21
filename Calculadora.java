
//
//
//  @ Project : HDT4
//  @ File Name : Calculadora.java
//  @ Date : 21/02/2023
//  @ Author : Nicolle Gordillo  
//
//
public class Calculadora {
    private String postfix;
    private static Calculadora instance = null;

    private Calculadora(){
        
    }

    
    /** 
     * @return instance
     * Es estatico para que no necesite instanciarse afuera
     */
    // Devuelve la instancia singleton de la clase Calculadora
    public static Calculadora getInstance() {
        if (instance == null) {
            instance = new Calculadora();
        }
        return instance;
    }
    /**
     * 
     * @param c
     * @return int
     * Devuelve la precedencia de los simbolos +,-,* y /
     * Private para que no haya acceso desde afuera
     */
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
    
    /**
     * 
     * @param infix
     * @param imp
     * @return String
     * 
     * Conviente de infix a postfix
     */
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
    
    /**
     * 
     * @param imp
     * @return int
     * Evalua la expresión postfix
     */
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
                imp.push(b/a);
                }
        }
        return imp.pull();

    }
    
}
