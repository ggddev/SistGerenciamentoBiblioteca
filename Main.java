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
        int respUser;

        System.out.println("Bem-Vindo ao nosso sistema Bibliotecario!");
        System.out.println("Aqui você poderá gerenciar sua biblioteca, adicionando, removendo, emprestando, devolvendo e listando livros disponíveis!");

        do{
            System.out.println("Informe o que você deseja fazer (1)Adicionar um novo livro | (2)Emprestar um livro | (3)Devolver um livro | (4)Listar livros disponíveis | (5)Sair");
            respUser = in.nextInt(); in.nextLine();

            switch(respUser){
                case 1:
                    System.out.println("Informe o nome do livro: ");
                    String nomeLivro = in.nextLine();
                    System.out.println("Informe o ano da publicação: ");
                    int anoPubli = in.nextInt(); in.nextLine();
                    Year anoPublicacao = Year.of(anoPubli);
                    System.out.println("Informe o nome do autor: ");
                    String nomeAutor = in.nextLine();
                    System.out.println("Informe o gênero: ");
                    String genero = in.nextLine();
            
                    Adicionar addBook = new Adicionar(nomeLivro, anoPublicacao, nomeAutor, genero);
                    livros.add(addBook); //adicionamos o objeto da classe Adicionar na coleção Livros

                    if(nomeLivro.isEmpty() == true || nomeAutor.isEmpty() == true || genero.isEmpty() == true){
                        System.out.println("Não foi possível cadastrar o livro. Tente novamente.");
                    } else{
                        System.out.println("O livro " + nomeLivro + " foi cadastrado com sucesso no sistema!");
                    }

                    break;

                case 2:
                    System.out.println("Informe o nome do cliente: ");
                    String nomeCliente = in.nextLine();
                    System.out.println("Informe o e-mail do cliente: ");
                    String emailCliente = in.nextLine();
                    System.out.println("Informe o endereço do cliente: ");
                    String enderecoCliente = in.nextLine();
                    System.out.println("Informe o nome do livro que foi emprestado: ");
                    String nomeLivroEmprestado = in.nextLine();   
                    System.out.println("Informe a data do emprestimo: (AAAA-MM-DD)"); 
                    String dataEmprestimoVar = in.nextLine();
                    LocalDate dataEmprestimo = LocalDate.parse(dataEmprestimoVar);

                    Emprestimo emprestimo = new Emprestimo(nomeCliente, emailCliente, enderecoCliente, nomeLivroEmprestado, dataEmprestimo);

                    break;

                case 3:
                    System.out.println("Informe o nome do cliente: ");
                    String nomeClienteDevolucao = in.nextLine();
                    System.out.println("Informe o nome do livro que foi devolvido: ");
                    String livroDevolucao = in.nextLine();
                    System.out.println("Informe a data que o livro foi emprestado: (AAAA-MM-DD)");
                    String dataEmprestimoDevVar = in.nextLine(); //se atente a essas linhas, caso de erro aqui, pode ser pq elas sobrescreveram as variaveis de cima
                    LocalDate dataEmprestimoForDev = LocalDate.parse(dataEmprestimoDevVar);
                    System.out.println("Informe a data que foi feita a devolução: (AAAA-MM-DD)");
                    String dataDevolucaoVar = in.nextLine();
                    LocalDate dataDevolucao = LocalDate.parse(dataDevolucaoVar);

                    Devolucao devolucao = new Devolucao(nomeClienteDevolucao, livroDevolucao, dataEmprestimoForDev, dataDevolucao);

                    break;

                case 4:
                    System.out.println("\n~~~~ Lista dos Livros Disponíveis ~~~~\n");

                    break;
            }
        } while(respUser == 1 || respUser == 2 || respUser == 3 || respUser == 4);
        System.out.println("Você optou por encerrar o programa. Até um outro dia!");
    }
}
