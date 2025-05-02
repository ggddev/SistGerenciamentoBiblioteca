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
    protected List<String> livrosEmprestados = new ArrayList<>(); 

    public Emprestimo(){
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.nomeLivro = nomeLivro;
        this.dataEmprestimo = dataEmprestimo;
        this.livrosEmprestados = livrosEmprestados;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getNomeLivro(){
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro){
        this.nomeLivro = nomeLivro;
    }

    public LocalDate getDataEmprestimo(){
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }

    public void devolver(String nomeLivro){
        livrosEmprestados.remove(nomeLivro);
    }

    public String verificarLivro(String nomeLivro, List<Adicionar> livros, List<String> livrosEmprestados){
        for(Adicionar livro : livros){
            if(livro.getNomeLivro().equalsIgnoreCase(nomeLivro)){
                if(livrosEmprestados.contains(livro.getNomeLivro())){
                    return "O livro " + nomeLivro + " não está disponível no momento";
                } else{
                    livrosEmprestados.add(livro.getNomeLivro());
                    return "O livro " + nomeLivro + " foi emprestado com sucesso.";
                }
            }
        }
        return "O livro " + nomeLivro + " não está cadastrado no sistema."; 
    }

    public void listaLivrosEmprestados(){
        if(livrosEmprestados.isEmpty()){
            System.out.println("Ainda não há livros emprestados.");
        } else{
            System.out.println("---- Lista de livros emprestados ----");
            for(String s : livrosEmprestados){
                System.out.println("- " + s);
            }
        }
    }

}