public class MensagemParaAlguem extends Mensagem {
    private String emailDestinatario;
    public MensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean anonima){
        super(texto,emailRemetente,anonima);

    }
    public String getEmailDestinatario(){
        return this.emailDestinatario;
    }

    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }
    public String getTextoCompletoAExibir(){
        if(ehAnonima()){
            return String.format("Mensagem para %s. Texto: %s", emailDestinatario, getTexto());
        }else{
            return String.format("Mensagem de: %s para %s. Texto: %s.",getEmailRemetente(), emailDestinatario,getTexto());
        }
    }

}
