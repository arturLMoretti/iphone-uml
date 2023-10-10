package view.iphone;

import services.internet.Internet;
import services.ipod.IPod;
import services.phone.Phone;

public class IPhone implements Internet, Phone, IPod {
  public IPhone() {}

  @Override
  public void ouvirMusica() {
    System.out.println("Ouvindo música");
  }

  @Override
  public void iniciarChamada() {
    System.out.println("Inicar chamada");
  }

  @Override
  public void receberChamada() {
    System.out.println("Recebendo chamada");
  }

  @Override
  public void salvarContato() {
    System.out.println("Salvar contato");
  }

  @Override
  public void enviarEmail() {
    System.out.println("Enviar email");
  }

  @Override
  public void verNoticias() {
    System.out.println("Vendo notícias");
  }
  
}
