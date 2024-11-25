import javax.swing.JOptionPane;

public class Main {

  public static void main(String[] args) {

    Operacion suma = (a, b) -> a + b;
    Operacion resta = (a, b) -> a - b;
    Operacion multiplicacion = (a, b) -> a * b;
    Operacion division = (a, b) -> b != 0 ? a / b : 0; // Evitar división entre 0

    String[] opciones = {"Suma", "Resta", "Multiplicación", "División"};
    String eleccion = (String) JOptionPane.showInputDialog(
        null,
        "Selecciona una operación:",
        "Calculadora",
        JOptionPane.QUESTION_MESSAGE,
        null,
        opciones,
        opciones[0]
    );


    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número:"));
    int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número:"));

    int resultado = 0;
    switch (eleccion) {
      case "Suma":
        resultado = suma.calcular(num1, num2);
        break;
      case "Resta":
        resultado = resta.calcular(num1, num2);
        break;
      case "Multiplicación":
        resultado = multiplicacion.calcular(num1, num2);
        break;
      case "División":
        if (num2 == 0) {
          JOptionPane.showMessageDialog(null, "Error: División entre cero no permitida.");
          return;
        }
        resultado = division.calcular(num1, num2);
        break;
    }

    JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
  }

}
