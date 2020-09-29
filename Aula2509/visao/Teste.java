package visao;

import modelo.Funcionario;

public class Teste {

	public static void main(String[] args) {
		
			
		
		Funcionario[] listaFuncionario = {	new Funcionario(123, 1, 1000, 11111, true),
											new Funcionario(456, 2, 2000, 22222, true),
											new Funcionario(789, 3, 3000, 33333, false),
											new Funcionario(987, 4, 4000, 44444, true),
											new Funcionario(654, 5, 5000, 55555, false)
										};
		
		for(int i = 0; i < 5;i++) {
			System.out.println("Id: "+ listaFuncionario[i].getIdentificador());
			System.out.println("Setor: "+ listaFuncionario[i].getIdentificador());
			System.out.println("Salário: "+ listaFuncionario[i].getSalario());
			System.out.println("RG do usuário: "+ listaFuncionario[i].getIdentificador());
			if(listaFuncionario[i].getPresenca() == true) {
				System.out.println("O funcionário está trabalhando na empresa");
			}else {
				System.out.println("O funcionário não está trabalhando na empresa");
			}
		}
		

	}

}
