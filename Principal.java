import java.util.ArrayList;
import java.util.Scanner;
//
//
//  @ Project : HDT4
//  @ File Name : Principal.java
//  @ Date : 21/02/2023
//  @ Author : Nicolle Gordillo  
//
//
public class Principal {
    public static void main(String[] args) throws Exception {
        Boolean continuar=true;
        int op1=0;
        int op2=0;
        int tipo=0;
        int tipo2=0;
        Scanner teclado = new Scanner(System.in);
        lectura l= new lectura();
        ArrayList<String> items= new ArrayList<>();
        items=l.lectura();
        Calculadora calc= Calculadora.getInstance();
        ImplementacionInstance imp= new ImplementacionInstance();
        while(continuar){
            op1=0;
            System.out.println("Bienvenido al programa de infix a postfix");
            System.out.println("Elija como quiere evaluar la expresión");
            System.out.println("1. Arraylist \n2. Lista \n3. Vector \n4. Salir");
            op1= teclado.nextInt();
            teclado.nextLine();
            if(op1==1|| op1==2 || op1==3){
                if(op1==1){

                    tipo=1;
                }
                else if(op1==2){
                    op2=0;
                    System.out.println("Elija el tipo de lista donde quiere evaluar la expresión");
                    System.out.println("1. Simplemente encadenada \n2. Doblemente encadenada");
                    op2= teclado.nextInt();
                    teclado.nextLine();
                    if(op2==1){
                        tipo2=1;
    
                    }
                    else if(op2==2){
                        tipo2=2;
    
                    }else {
                        System.out.println("Lo ingresado no fue válido");
                    }
                    tipo=2;
    
                }
                else if(op1==3){
                    tipo=3;
    
                }
                for(int i=0; i<items.size();i++){
                    System.out.println("-------------------Expresión #"+(i+1)+"-------------------");
                    System.out.println("infix: "+items.get(i));
                    System.out.println("Postfix: "+calc.infixapostfix(items.get(i),imp.Instanciar(tipo, tipo2)));
                    System.out.println("Resultado: "+calc.evaluar(imp.Instanciar(tipo, tipo2)));
                    System.out.println("--------------------------------------------------");
    
                }

            }
            else if(op1==4){
                continuar=false;
                break;

            }
            else{
                System.out.println("ingrese algo válido");
            }
            


        }
    }
    
    
}
