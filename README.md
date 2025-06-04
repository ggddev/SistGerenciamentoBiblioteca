# 📚 Sistema de Gerenciamento de Biblioteca - Java 
<br>
Este projeto é um sistema simples de gerenciamento de bibliotecas desenvolvido em Java. Ele permite adicionar, emprestar, devolver e listar livros cadastrados,
simulando as funcionalidades básicas de uma biblioteca tradicional.

  ## Funcionalidades
    - Adicionar livros ao catálogo com título, autor, gênero e ano de publicação.
    - Emprestar livros para clientes, registrando nome, e-mail, endereço e data do empréstimo.
    - Devolver livros, validando se o título devolvido pertence à lista de empréstimos
    - Listar todos os livros cadastrados na biblioteca.
    - Listar livros emprestados (via método separado).

  ## Estrutura do Projeto

    O sistema é dividido em quatro classes principais:

    _Adicionar.java_
      Responsável por armazenar e exibir as informações dos livros cadastrados.

    _Emprestimo.java_
      Gerencia os dados do cliente e os livros emprestados. Possui métodos para:
      - verificar a disponibilidade do livro
      - emprestar o livro
      - devolver o livro
      - listar os livros emprestados

    _Devolucao.java_
      Gerencia a devolução de livros e valida se o livro devolvido estava de fato emprestado.

    _Main.java_
      Classe principal que oferece um menu interativo no terminal para o usuário operar o sistema.

  ### Como Executar
    1. Certifique-se de ter o Java JDK 17 (ou superior) instalado.
    2. Clone ou baixe o repositório.
    3. Compile os arquivos *java*:
       javac GerenciamentoBiblioteca/SistGerenciamentoBiblioteca/*.java
    4. Execute o programa
       java GerenciamentoBiblioteca.SistGerenciamentoBiblioteca.Main

  ### Exemplo de Uso
    Bem-Vindo ao nosso sistema Bibliotecario!
    Informe o que você deseja fazer:
    (1) Adicionar um novo _livro_
    (2) Emprestar um _livro_
    (3) Devolver um _livro_
    (4) Listar _livros_
    (5) Sair

  ## Possíveis Melhorias
    - Validação mais robusta de entradas (evitar campos vazios ou datas inválidas)
    - Separação de responsabilidades com uso de camadas.
    - Armazenamento de dados em arquivos ou banco de dados (persistência).
    - Interface gráfica com JavaFX ou Swing.
    - Testes unitários
 
  ## Tecnologias Utilizadas
    - Java 17
    - _java.time_ para manipulação de datas
    - _java.util.List_ e _ArrayList_
   
  ### Organização de Pacotes
    GerenciamentoBiblioteca/
    └── SistGerenciamentoBiblioteca/
      ├── Adicionar.java
      ├── Devolucao.java
      ├── Emprestimo.java
      └── Main.java

  ### Autor
    *Desenvolvido por ggdDev*
