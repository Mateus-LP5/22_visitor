public class Passaro implements Animal {

    private int cod;
    private String nome;
    private Cliente dono;
    private String corPenas;

    public Passaro(int cod, String nome, Cliente dono, String corPenas) {
        this.cod = cod;
        this.nome = nome;
        this.dono = dono;
        this.corPenas = corPenas;
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

    public String getCorPenas() {
        return corPenas;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirPassaro(this);
    }

}
