package GerenciamentoBiblioteca.SistGerenciamentoBiblioteca;

import java.time.LocalDate;

public class Devolucao {
    private String nomeCliente;
    private String livroDevolucao;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Devolucao(String nomeCliente, String livroDevolucao, LocalDate dataEmprestimo, LocalDate dataDevolucao){
        this.nomeCliente = nomeCliente;
        this.livroDevolucao = livroDevolucao;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }
}
