
public class HeladoAgotadoException extends Exception {
    public HeladoAgotadoException(){
        super("Hay un helado faltante");
        
    }
    public HeladoAgotadoException(String m){
        super(m);
    }
   
}

