// Usando uma classe, atribua os dados de 2 livros 
// conforme as informações abaixo:
// Livro:
//     Título
//     Autor
//     Número de páginas
//     Preço

package exercicioSala;

public class Livro {
    private String titulo;
    private double autor;
    private double paginas;
    private double preco;

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }

    public int getPaginas(){
        return paginas;
    }
    public double getPreco(){
        return preco;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    } 
    public void setAutor(double autor){
        this.autor = autor;
    }
    public void setPaginas(double paginas){
        this.paginas = paginas;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
}
