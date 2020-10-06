package visao;

import java.util.ArrayList;
import java.util.Collections;

import modelo.Conta;

public class TesteConta {

	public static void main(String[] args) {
			
		double maior = 0;
		ArrayList Numero, Saldo;
		
		
		Numero = new ArrayList();
		Saldo = new ArrayList<Double>();
		
		Numero.add(1);
		Numero.add(2);
		Numero.add(3);
		Numero.add(4);
		Numero.add(5);
		
		Saldo.add(600.50);
		Saldo.add(700.30);
		Saldo.add(800.40);
		Saldo.add(900.20);
		Saldo.add(1000.10);
		
		for(int i=0; i < Saldo.size();i++) {
			System.out.println("Número: "+Numero.get(i)+", Saldo: "+Saldo.get(i));			
		}
		for(int i=0; i< Saldo.size();i++) {
			if((double)Saldo.get(i)> maior) {
				maior = (double)Saldo.get(i);
			}
		}System.out.println("O maior salario é: "+ maior);
		
	}
}

