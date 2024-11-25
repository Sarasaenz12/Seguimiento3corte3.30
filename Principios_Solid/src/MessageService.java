interface MessageService {

  void sendMessage(String message);

}

class EmailService implements MessageService {
  public void sendMessage(String message) {
    System.out.println("Enviando Email: " + message);
  }
}

class SMSService implements MessageService {
  public void sendMessage(String message) {
    System.out.println("Enviando SMS: " + message);
  }
}

class Notification {
  private MessageService messageService;

  public Notification(MessageService messageService) {
    this.messageService = messageService;
  }

  public void send(String message) {
    messageService.sendMessage(message);
  }
}
