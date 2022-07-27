public class Cavalo implements Animal{

    private int cod;
    private String nome;
    private Cliente dono;
    private String nomePai;
    private String nomeMae;

    public Cavalo(int cod, String nome, Cliente dono, String nomePai, String nomeMae) {
        this.cod = cod;
        this.nome = nome;
        this.dono = dono;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
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

    public String getNomePai() {
        return nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirCavalo(this);
    }

}
