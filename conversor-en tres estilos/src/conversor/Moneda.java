package conversor;

import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Moneda{
	
	private static final DecimalFormat redondeo = new DecimalFormat("#,##0.00");
	
	void conversionMoneda() {
		double cantidad = Inicio.leerValor("Ingresa la cantidad de dinero que deseas convertir");
		
		if(cantidad != 0) {
			menuConver(cantidad);
		}
	}
	
	void menuConver(double valor) {
		ImageIcon icono = new ImageIcon();
		Object[] conversiones = {"Pesos AR a Dólar","Pesos AR  a Euro","Pesos AR a Libra","Pesos AR a Yen",
				"Pesos AR a Real","Dólar a Pesos AR","Euro a Pesos AR","Libra a Pesos AR","Yen a Pesos AR",
				"Real a Pesos AR"};
		
		Object selectConver = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
				"Menu", JOptionPane.INFORMATION_MESSAGE, icono, conversiones, conversiones[0]);
		
		if(selectConver == null) {
			selectConver = "cancelar";
		}
		
		switch (selectConver.toString()) {
		case "Pesos AR a Dólar": resultado(pesosarADolar(valor),"Dólar"); break;
		case "Dólar a Pesos AR": resultado(dolarAPesosar(valor),"Pesos AR "); break;
		case "Pesos AR a Euro": resultado(pesosarAEuro(valor),"Euro"); break;
		case "Euro a Pesos AR": resultado(euroAPesosar(valor),"Pesos AR"); break;
		case "Pesos AR a Libra": resultado(pesosarALibra(valor),"Libra");break;
		case "Libra a Pesos AR": resultado(libraAPesosar(valor),"Pesos AR "); break;
		case "Pesos AR a Yen": resultado(pesosAYen(valor),"Yen"); break;
		case "Yen a Pesos AR": resultado(yenAPesosar(valor),"Pesos AR"); break;
		case "Pesos AR a Real": resultado(pesosAReal(valor),"Real"); break;
		case "Real a Pesos AR": resultado(realAPesosar(valor),"Pesos AR"); break;
		case "cancelar": break;
		default: break;
		}
		
	}
	
	void resultado(double valor, String moneda) {
		JOptionPane.showMessageDialog(null, "Tienes $" + redondeo.format(valor) + " " + moneda,
				"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}
	
	double pesosarADolar(double valor) {
		return valor*0.0070;
	}
	
	static double dolarAPesosar(double valor) {
		return valor*143.70;
	}
	
	static double pesosarAEuro(double valor) {
		return valor*0.0073;
	}
	
	static double euroAPesosar(double valor) {
		return valor*136.62;
	}
	
	static double pesosarALibra(double valor) {
		return valor*0.0062;
	}
	
	static double libraAPesosar(double valor) {
		return valor*162.22;
	}
	
	static double pesosAYen(double valor) {
		return valor*1;
	}
	
	static double yenAPesosar(double valor) {
		return valor*1;
	}
	
	static double pesosAReal(double valor) {
		return valor*.0372;
	}
	
	static double realAPesosar(double valor) {
		return valor*26.82;
	}
}
