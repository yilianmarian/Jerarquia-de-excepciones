
public class HeladoNestleDeFresaAgotadoException extends HeladoNestleAgotadoException {
     public HeladoNestleDeFresaAgotadoException(){
        super("Hay un helado nestle de fresa faltante");
        
    }
    public HeladoNestleDeFresaAgotadoException(String m){
        super(m);
    }
}
