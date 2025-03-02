package src.model;

public class Livro extends ItemBiblioteca implements Emprestar {
    private  String nomeDoLivro;
    private  Autor autor;
    private int anoPublicacao;
    private boolean emprestado;

    public Livro(String nomeDoLivro, Autor autor, int anoPublicacao){
        super(nomeDoLivro);
        this.nomeDoLivro = nomeDoLivro;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false;
    }

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    //Polimorfismo
    @Override
    public void exibirDetalhes(){
        System.out.println("Livro: " + nomeDoLivro + " Autor: " + autor.getNome() + "Ano " + anoPublicacao );
    }

    @Override
    public void emprestar(Usuario usuario) {
        if(!emprestado){
            emprestado = true;
            System.out.println("Livro emprestado para " + usuario.getNome());
        }else {
            System.out.println("Livro esta emprestado");
        }
    }

    @Override
    public void devolver() {
        emprestado = false;
        System.out.println("livro devolvido;");
    }
}
