package GerenciamentoBiblioteca.SistGerenciamentoBiblioteca;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        List<Adicionar> livros = new ArrayList<>();
        List<String> livroEmprestado = new ArrayList<>();
        int respUser;
        Emprestimo emprestimo = new Emprestimo();

        System.out.println("Bem-Vindo ao nosso sistema Bibliotecario!");
        System.out.println("Aqui você poderá gerenciar sua biblioteca, adicionando, removendo, emprestando, devolvendo e listando livros disponíveis!");

        do{
            System.out.println("\nInforme o que você deseja fazer (1)Adicionar um novo livro | (2)Emprestar um livro | (3)Devolver um livro | (4)Listar livros que a biblioteca possuí | (5)Sair");
            respUser = in.nextInt(); in.nextLine();

            switch(respUser){
                case 1:
                    Adicionar addBook = new Adicionar();

                    System.out.println("Informe o nome do livro: ");
                    addBook.setNomeLivro(in.nextLine());

                    System.out.println("Informe o ano da publicação: ");
                    int anoPubli = in.nextInt(); in.nextLine();
                    Year anoPublicacao = Year.of(anoPubli);
                    addBook.setAnoPublicacao(anoPublicacao);

                    System.out.println("Informe o nome do autor: ");
                    addBook.setNomeAutor(in.nextLine());

                    System.out.println("Informe o gênero: ");
                    addBook.setGenero(in.nextLine());
                    livros.add(addBook);

                    if(addBook.getNomeLivro().isEmpty() == true || addBook.getNomeAutor().isEmpty() == true || addBook.getGenero().isEmpty() == true){
                        System.out.println("Não foi possível cadastrar o livro. Tente novamente.");
                    } else{
                        System.out.println("O livro " + addBook.getNomeLivro() + " foi cadastrado com sucesso no sistema!");
                    }

                    break;//encerrada

                case 2:
                    System.out.println("Informe o nome do cliente: ");
                    emprestimo.setNome(in.nextLine());
                    System.out.println("Informe o e-mail do cliente: ");
                    emprestimo.setEmail(in.nextLine());
                    System.out.println("Informe o endereço do cliente: ");
                    emprestimo.setEndereco(in.nextLine());
                    System.out.println("Informe o nome do livro que será emprestado: ");
                    emprestimo.setNomeLivro(in.nextLine());
                    System.out.println("Informe a data do emprestimo: (AAAA-MM-DD)"); 
                    String dataEmprestimoVar = in.nextLine();
                    LocalDate dataEmprestimo = LocalDate.parse(dataEmprestimoVar);
                    emprestimo.setDataEmprestimo(dataEmprestimo);

                    System.out.println(emprestimo.verificarLivro(emprestimo.getNomeLivro(), livros, livroEmprestado));

                    break;//encerrada

                case 3:
                    System.out.println("Informe o nome do cliente: ");
                    String nomeClienteDevolucao = in.nextLine();
                    System.out.println("Informe o nome do livro que foi devolvido: ");
                    String livroDevolucao = in.nextLine();
                    System.out.println("Informe a data que o livro foi emprestado: (AAAA-MM-DD)");
                    String dataEmprestimoDevVar = in.nextLine();
                    LocalDate dataEmprestimoForDev = LocalDate.parse(dataEmprestimoDevVar);
                    System.out.println("Informe a data que foi feita a devolução: (AAAA-MM-DD)");
                    String dataDevolucaoVar = in.nextLine();
                    LocalDate dataDevolucao = LocalDate.parse(dataDevolucaoVar);

                    Devolucao devolucao = new Devolucao(nomeClienteDevolucao, livroDevolucao, dataEmprestimoForDev, dataDevolucao);

                    devolucao.devolverLivros(livroDevolucao, emprestimo);

                    break; //encerradas

                case 4:
                    System.out.println("\n---- Lista de livros da biblioteca ----");
                    for(Adicionar a : livros){
                        a.retornarLivros();
                    }
                    break;
            }
        } while(respUser == 1 || respUser == 2 || respUser == 3 || respUser == 4);
        System.out.println("Você optou por encerrar o programa. Até um outro dia!");
    }
}
