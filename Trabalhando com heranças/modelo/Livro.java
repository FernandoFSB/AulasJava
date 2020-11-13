
package modelo;

public class Livro extends Editora {
    private String isbn;

    public Livro() {
    }

    public Livro(String isbn) {
        this.isbn = isbn;
    }

    public Livro(String isbn, String nome, String data, String editora) {
        super(nome, data, editora);
        this.isbn = isbn;
    }
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override    
    public String toString() {
        return "Editora{" + "nome=" + getNome() + ", data de publicação=" + getData() + ",Editora=" + getEditora() +",isbn=" + isbn + '}';
    }

    
   
    
    
}
