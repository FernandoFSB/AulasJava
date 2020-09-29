package modelo;

public class Funcionario {
	
	//atributos
		
	private int identificador;
	private int setor;
	private int salario;
	private int rg;	
	private boolean presenca;
	
	//contrutor
	
	public Funcionario() {}
	
	public Funcionario(int i,int se, int s, int r, boolean p) {
		this.identificador = i;
		this.setor = se;
		this.salario = s;
		this.rg = r;
		this.presenca = p;
	}

	
	//Get e Set
	
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	public int getSetor() {
		return setor;
	}
	
	public void setSetor(int setor) {
		this.setor = setor;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public boolean getPresenca() {
		return presenca;
	}

	public void setPresenca(boolean presenca) {
		this.presenca = presenca;
	}
	
	//métodos

	public int bonificar() {
		return this.salario + 2000;
	}
	
	public boolean demite() {
		return presenca = false;
	}
		
}
