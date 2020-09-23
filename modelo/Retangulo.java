package modelo;

public class Retangulo {
	private float altura;
	private float base;
	private float espessura;
		
	public Retangulo (float h, float b, float e) {
		this.altura = h;
		this.base = b;
		this.espessura = e;
	}	
	
	public float calculoAreaRetanguloMaior() {		
		return this.altura*this.base;
	}
	public float calculoAreaRetanguloMenor() {
		return (this.altura - 4)*(this.base - 4);
	}
	public float calculoAreaMoldura() {
		return calculoAreaRetanguloMaior() - calculoAreaRetanguloMenor();
	}
}
