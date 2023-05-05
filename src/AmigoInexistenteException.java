public class AmigoInexistenteException extends Exception{
    public AmigoInexistenteException(String texto){
        System.err.println(texto);
    }
}
