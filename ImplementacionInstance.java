public class ImplementacionInstance {
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
