package conversor;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Inicio {

	public static void main(String[] args) {
		Object[] opciones = { "Conversor de Moneda", "Conversor de Temperatura", "Conversor Medidas" };
		ImageIcon icono = new ImageIcon();
		Moneda moneda = new Moneda();
		Fahrenheit temperatura = new Fahrenheit();
		Pulgadas longitud = new Pulgadas();
		
		int status = 0;
		
		do {
			Object menu = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
					"Menu", JOptionPane.INFORMATION_MESSAGE, icono, opciones, opciones[0]);
			
			if (menu == opciones[0]) {
				moneda.conversionMoneda();
			} else if (menu == opciones[1]) {
				temperatura.conversionTemperatura();
			} else if (menu == opciones[2]) {
				longitud.conversorPulgadas();
			}
			
			status = continua();
			
		} while(status == 0);
		
		terminado();
	}
	
	private static int continua() {
		Object[] continua = { "Si", "No" };
		return JOptionPane.showOptionDialog(null, "¿Desea continuar con el programa?",
				"Selecciona una opción", JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,null, continua, continua[0]);
	}
	
	private static void terminado() {
		JOptionPane.showMessageDialog(null, "Programa terminado", "Aviso",
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	static double leerValor(String mensaje) {
		double valor = 0;
		
		try {
			valor = Double.parseDouble(JOptionPane.showInputDialog(null, mensaje,
					"Ingresar cantidad", JOptionPane.DEFAULT_OPTION));
		
		} catch(NumberFormatException error) {
			JOptionPane.showMessageDialog(null, "Valor no válido, escribe número o decimal", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
		return valor;
	}
}