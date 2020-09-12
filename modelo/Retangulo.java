package modelo;

public class Retangulo {
	private float altura;
	private float base;
		
	public Retangulo (float h, float b) {
		this.altura = h;
		this.base = b;
	}
	
	public float calculoAreaRetangulo() {
		float area;		
		area = this.altura*this.base;
		return area;
	}
}
