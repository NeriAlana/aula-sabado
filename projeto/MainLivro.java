import exercicioSala.Livro;

public class MainLivro {
    public static void main(String[] args) {
       Livro.livro1 = new Livro("AAAA", "bbbb", 20, 50)
       Livro.livro1 = new Livro("CCC","DDD", 30, 40)


        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Paginas: " + livro1.getPaginas());
        System.out.println("Preco: " + livro1.getPreco());
    }
}
