package visao;

import javax.swing.JOptionPane;

import modelo.Retangulo;

public class Moldura {

	public static void main(String[] args) {
		
		Retangulo ret;
		float h = 10, b = 30, e = 2;
		
		ret = new Retangulo(h, b, e);
		
		JOptionPane.showMessageDialog(null, "Area do ret�ngulo maior � de: "+ret.calculoAreaRetanguloMaior());
		JOptionPane.showMessageDialog(null, "Area do ret�ngulo menor � de: "+ret.calculoAreaRetanguloMenor());
		JOptionPane.showMessageDialog(null, "Area da moldura � de: "+ret.calculoAreaMoldura());
	}

}
