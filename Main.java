package GerenciamentoBiblioteca.SistGerenciamentoBiblioteca;
import java.util.Scanner;
import java.time.Year;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
public class main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        List<Adicionar> livros = new ArrayList<>();

        System.out.println("Bem-Vindo ao nosso sistema Bibliotecario!");
        System.out.println("Aqui você poderá gerenciar sua biblioteca, adicionando, removendo, emprestando, devolvendo e listando livros disponíveis!");

        System.out.println("Informe o que você deseja fazer (1)Adicionar um novo livro | (2)Emprestar um livro | (3)Devolver um livro | (4)Listar livros disponíveis");
        int respUser = in.nextInt(); in.nextLine();

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
        }
    }
}
