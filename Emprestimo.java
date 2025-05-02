package GerenciamentoBiblioteca.SistGerenciamentoBiblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Emprestimo{
    private String nome;
    private String email;
    private String endereco;
    private String nomeLivro;
    private LocalDate dataEmprestimo;
    private List<Adicionar> livrosEmprestados = new ArrayList<>(); 

    public Emprestimo(String nome, String email, String endereco, String nomeLivro, LocalDate dataEmprestimo){
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.nomeLivro = nomeLivro;
        this.dataEmprestimo = dataEmprestimo;
        this.livrosEmprestados = livrosEmprestados;
    }

    public void liberarLivro(Adicionar add){
        livrosEmprestados.add(add);
    }

    public void liberacaoDoLivro(){
        System.out.println("O livro " + nomeLivro + " está disponível no sistema!");
    }

    public String verificarLivro(String nomeLivro, Adicionar adicionar){
        if(nomeLivro.equalsIgnoreCase(adicionar.getNomeLivro())){
            return "O livro " + nomeLivro + " está disponível no sistema!";
        }else{
            return "O livro " + nomeLivro + " não está disponível no momento";
        }
    }

    public String getNomeLivro(){
        return nomeLivro;
    }
}