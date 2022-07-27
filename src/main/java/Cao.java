public class Cao implements Animal{

    private int cod;
    private String nome;
    private Cliente dono;

    public Cao(int cod, String nome, Cliente dono) {
        this.cod = cod;
        this.nome = nome;
        this.dono = dono;
    }

    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public Cliente getDono() {
        return dono;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirCao(this);
    }

}
