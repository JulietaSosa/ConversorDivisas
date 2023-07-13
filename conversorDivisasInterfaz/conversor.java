package conversorDivisasInterfaz;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class conversor {

    public static void main(String[] args) {

        boolean continuarPrograma = true;

        while (continuarPrograma) {

            String[] options = { "Pesos a Euros", "Pesos a Dólares", "Pesos a Libras Esterlinas",
                     };
            String choice = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                    "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            String input = JOptionPane.showInputDialog("Ingrese la cantidad en pesos: ");
            double pesos;
            try {
            	pesos = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor ingresado no valido");
                return;
            }
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");

            if (choice.equals("Pesos a Dólares")) {
                double dollars = pesos / 264;
                JOptionPane.showMessageDialog(null,
                		pesos + "pesos son " + FormatearDecimal.format(dollars) + " dólares.");
            } else if (choice.equals("Pesos a Euros")) {
                double euros = pesos / 296;
                JOptionPane.showMessageDialog(null, pesos + " pesos son " + euros + " euros.");
            } else if (choice.equals("Pesos a Libras Esterlinas")) {
                double pounds = pesos / 453;
                JOptionPane.showMessageDialog(null, pesos + " pesos son " + pounds + " libras esterlinas.");
            } 
            
            int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                continuarPrograma = false;
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
            }
        }

    }
}


