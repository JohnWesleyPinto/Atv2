public class TestaSistemaAmigos {
    public static void main(String[] args) throws Exception {
        SistemaAmigo sistemaAmigo = new SistemaAmigo();
        sistemaAmigo.cadastraAmigo("Maria","Maria@gmail.com");
        sistemaAmigo.cadastraAmigo("José","Jose@gmail.com");

        sistemaAmigo.configuraAmigoSecretoDe("Maria@gmail.com","Jose@gmail.com");
        sistemaAmigo.configuraAmigoSecretoDe("Jose@gmail.com","Maria@gmail.com");


    }
}
