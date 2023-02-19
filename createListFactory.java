public class createListFactory {
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
