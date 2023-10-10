import view.iphone.IPhone;

public class App {
    public static void main(String[] args) throws Exception {
        IPhone meuIPhone = new IPhone();
        meuIPhone.enviarEmail();
        meuIPhone.iniciarChamada();
        meuIPhone.ouvirMusica();
        meuIPhone.receberChamada();
        meuIPhone.salvarContato();
        meuIPhone.verNoticias();
    }
}
