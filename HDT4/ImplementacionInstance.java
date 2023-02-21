//
//
//  @ Project : HDT4
//  @ File Name : ImplementacionInstance.java
//  @ Date : 21/02/2023
//  @ Author : Nicolle Gordillo  
//
//

public class ImplementacionInstance {
    
    /** 
     * @param tipo
     * @param type2
     * @return Implementacion
     */
    public Implementacion Instanciar(int tipo, int type2){
        Implementacion metodo;
        switch(tipo){
            case 1:{
                metodo= new arraylist();

            } break;
            case 2:{
                metodo = new lista(type2);
            }break;
            case 3:{
                metodo = new vectores();
            } break;
            default:{
                metodo= null;
            }break;
        }
        return metodo;
    }
    
}
