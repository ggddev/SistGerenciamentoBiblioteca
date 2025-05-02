package GerenciamentoBiblioteca.SistGerenciamentoBiblioteca;
import java.time.Year;
public class Adicionar {
    private String nomeLivro;
    private Year anoPublic;
    private String nomeAutor;
    private String genero;

    public Adicionar(){
        this.nomeLivro = nomeLivro;
        this.anoPublic = anoPublic;
        this.nomeAutor = nomeAutor;
        this.genero = genero;
    }

    public String getNomeLivro(){
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro){
        this.nomeLivro = nomeLivro;
    }

    public Year getAnoPublicacao(){
        return anoPublic;
    }

    public void setAnoPublicacao(Year anoPublic){
        this.anoPublic = anoPublic;
    }

    public String getNomeAutor(){
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor){
        this.nomeAutor = nomeAutor;
    }

    public String getGenero(){
        return genero;
    } 

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void retornarLivros(){
        System.out.println("Título: " + getNomeLivro());
        System.out.println("Autor: " + getNomeAutor());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Ano da publicação: " + getAnoPublicacao());
    }
}
