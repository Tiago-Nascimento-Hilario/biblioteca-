package src;

import src.model.Autor;
import src.model.Funcionario;
import src.model.Livro;
import src.model.Usuario;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Machado de assis","Brasileiro" );
        Livro livro = new Livro("Dom Casmuru", autor, 1987);
        Usuario usuario = new Usuario("Tiago", 1);
        Funcionario funcionario = new Funcionario("Maria souza", 2, "Bibliotecária");


        livro.exibirDetalhes();
        usuario.exiibirDetalhes();
        funcionario.exiibirDetalhes();

        livro.emprestar(usuario);
        livro.devolver();
    }

}
