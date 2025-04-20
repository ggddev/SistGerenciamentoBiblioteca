package GerenciamentoBiblioteca.SistGerenciamentoBiblioteca;
import java.time.Year;
public class Adicionar {
    private String nomeLivro;
    private Year anoPublic;
    private String nomeAutor;
    private String genero;

    public Adicionar(String nomeLivro, Year anoPublic, String nomeAutor, String genero){
        this.nomeLivro = nomeLivro;
        this.anoPublic = anoPublic;
        this.nomeAutor = nomeAutor;
        this.genero = genero;
    }
}
