package GerenciamentoBiblioteca.SistGerenciamentoBiblioteca;

import java.time.LocalDate;

public class Emprestimo {
    private String nome;
    private String email;
    private String endereco;
    private String nomeLivro;
    private LocalDate dataEmprestimo;

    public Emprestimo(String nome, String email, String endereco, String nomeLivro, LocalDate dataEmprestimo){
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.nomeLivro = nomeLivro;
        this.dataEmprestimo = dataEmprestimo;
    }
}