package GerenciamentoBiblioteca.SistGerenciamentoBiblioteca;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
public class Devolucao {
    private String nomeCliente;
    private String livroDevolucao;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private List<Emprestimo> devolucao = new ArrayList<>();

    public Devolucao(String nomeCliente, String livroDevolucao, LocalDate dataEmprestimo, LocalDate dataDevolucao){
        this.nomeCliente = nomeCliente;
        this.livroDevolucao = livroDevolucao;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public void devolverLivros(String livroDevolucao, Emprestimo emprestimo){
        if(livroDevolucao.equals(emprestimo.getNomeLivro())){
            emprestimo.devolver(livroDevolucao);
        }
    }
}
