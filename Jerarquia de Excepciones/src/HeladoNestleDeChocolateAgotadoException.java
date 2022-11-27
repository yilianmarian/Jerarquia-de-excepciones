
public class HeladoNestleDeChocolateAgotadoException extends HeladoNestleAgotadoException {
   public HeladoNestleDeChocolateAgotadoException(){
        super("Hay un helado nestle de chocolate faltante");
        
    }
    public HeladoNestleDeChocolateAgotadoException(String m){
        super(m);
    }  
}
