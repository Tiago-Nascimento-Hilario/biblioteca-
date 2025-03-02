package src.model;

public class Funcionario extends  Usuario {
    private String cargo;

    public Funcionario(String nome, int id, String cargo) {
        super(nome, id); // chama o construtor da classe pai no caso usuario
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
