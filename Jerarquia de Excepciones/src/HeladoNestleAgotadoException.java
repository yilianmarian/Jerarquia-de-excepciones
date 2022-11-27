
public class HeladoNestleAgotadoException extends HeladoAgotadoException {
     public HeladoNestleAgotadoException(){
        super("Hay un helado nestle faltante");
        
    }
    public HeladoNestleAgotadoException(String m){
        super(m);
    }
     
}
