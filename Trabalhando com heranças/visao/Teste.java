
package visao;

import modelo.Livro;
import modelo.Revista;

public class Teste {
    public static void main(String[]args){
        
        Livro joaoemaria = new Livro("123","João e maria","05/05/1990","Peirópolis");
        Revista veja = new Revista("456","Veja","10/01/1980","Abril");
        
        System.out.println(joaoemaria);
        System.out.println(veja);
        
    }
}
