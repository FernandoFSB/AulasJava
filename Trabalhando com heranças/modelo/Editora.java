
package modelo;

public class Editora {
    private String nome;
    private String data;
    private String editora;

    public Editora() {
    }

    public Editora(String nome, String data, String editora) {
        this.nome = nome;
        this.data = data;
        this.editora = editora;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public String getEditora() {
        return editora;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Editora{" + "nome=" + nome + ", data de publicação=" + data + ", editora=" + editora + '}';
    }

    
    
    
    
}
