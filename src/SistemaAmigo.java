import java.util.ArrayList;


public class SistemaAmigo {
    private ArrayList<Mensagem> mensagem;
    private ArrayList<Amigo> amigos = new ArrayList<>();
    ArrayList<Mensagem> m = new ArrayList<>();


    public void cadastraAmigo(String nomeAmigo, String emailAmigo){
        Amigo amigo = new Amigo(nomeAmigo,emailAmigo);
        if(this.amigos.size() > 0 || amigos.contains(amigo)){
            System.out.println("VRAU");
        }else{
            System.out.println("não");
            amigos.add(amigo);
        }


    }
    public ArrayList<Mensagem> pesquisaMensagensAnonimas(){
        ArrayList<Mensagem> m = new ArrayList<>();
        for(Mensagem men : mensagem ){
            if(men.ehAnonima()){
                m.add(men);
            }
        }
        return m;
    }
    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws Exception{

        for (Amigo amigo : this.amigos){
            if (amigo.getEmail().equals(emailDaPessoa)){
                amigo.setEmailAmigoSorteado(emailAmigoSorteado);
            }
        }

    }
    public ArrayList<Mensagem> pesquisaTodasAsMensagens(){
        return mensagem;
    }
    public String pesquisaAmigoSecretoDe(String emailPessoa) throws Exception{

        String amigoSecreto = "";

        for (Amigo amigo : this.amigos) {
            if (amigo.getEmail().equals(emailPessoa)) {
                if (amigo.getEmailAmigoSorteado().equals("")) {
                    throw new AmigoNaoSorteadoException("NÂO TIENE AMIGOS");
                } else {
                    amigoSecreto = amigo.getEmailAmigoSorteado();
                }
            } else {
                throw new AmigoInexistenteException("TU NÂO EXISTE");
            }
        }

       return amigoSecreto;
    }
}