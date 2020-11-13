
package modelo;

public class Revista extends Editora {
    private String periocidade;

    public Revista() {
    }

    public Revista(String periocidade, String nome, String data, String editora) {
        super(nome, data, editora);
        this.periocidade = periocidade;
    }
    
    public String getPeriocidade() {
        return periocidade;
    }

    public void setPeriocidade(String periocidade) {
        this.periocidade = periocidade;
    }

    @Override    
    public String toString() {
        return "Editora{" + "nome=" + getNome() + ", data de publicação=" + getData() + ",Editora=" + getEditora() +",Periocidade=" + periocidade + '}';
    }

    

   
    
    
}
