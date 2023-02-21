//
//
//  @ Project : HDT4
//  @ File Name : createListFactory.java
//  @ Date : 21/02/2023
//  @ Author : Nicolle Gordillo  
//
//
public class createListFactory {
    
    /** 
     * @param tipo
     * @return createList
     */
    public createList Instanciar(int tipo){
        createList lista;
        switch(tipo){
            case 1:{
                lista= new SimplementeEncadenada();

            } break;
            case 2:{
                lista = new DoblementeEncadenada();
            }break;
            default:{
                lista= null;
            }break;
        }
        return lista;
    }
    
}
