public class MensagemParaTodos extends Mensagem {
    public MensagemParaTodos(String texto, String emailRemetente, boolean anonima) {
        super(texto, emailRemetente, anonima);
    }

    @Override
    public String getTextoCompletoAExibir() {
        if (super.ehAnonima()) {
            return String.format("Mensagem para todos. Texto: %s", getTexto());
        }
        return String.format("Mensagem de %s para todos. Texto: %s", getEmailRemetente(), getTexto());

    }
}
