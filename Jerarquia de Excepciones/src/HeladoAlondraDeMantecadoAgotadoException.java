
public class HeladoAlondraDeMantecadoAgotadoException extends HeladoAlondraAgotadoException{
     public HeladoAlondraDeMantecadoAgotadoException(){
        super("Hay un helado alondra de mantecado faltante");
        
    }
    public HeladoAlondraDeMantecadoAgotadoException(String m){
        super(m);
    }
    
}
