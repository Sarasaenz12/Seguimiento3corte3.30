public class Main {

  public static void main(String[] args) {
    MessageService emailService = new EmailService();
    Notification notification = new Notification(emailService);
    notification.send("Hola por Email");

    MessageService smsService = new SMSService();
    Notification smsNotification = new Notification(smsService);
    smsNotification.send("Hola por SMS");


    ReportGenerator generator = new ReportGenerator();
    ReportSaver saver = new ReportSaver();

    String report = generator.generateReport();
    saver.saveToFile(report);
  }
}
