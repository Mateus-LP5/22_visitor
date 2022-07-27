public class AnimalVisitor implements Visitor{

    public String exibir(Animal animal){
        return animal.aceitar(this);
    }

    @Override
    public String exibirCao(Cao cao) {
        return "Cao{" +
                "cod=" + cao.getCod() +
                ", nome='" + cao.getNome() + '\'' +
                ", dono=" + cao.getDono().getNome() +
                '}';
    }

    @Override
    public String exibirCavalo(Cavalo cavalo) {
        return "Cavalo{" +
                "cod=" + cavalo.getCod() +
                ", nome='" + cavalo.getNome() + '\'' +
                ", dono=" + cavalo.getDono().getNome() +
                ", nomePai='" + cavalo.getNomePai() + '\'' +
                ", nomeMae='" + cavalo.getNomeMae() + '\'' +
                '}';
    }

    @Override
    public String exibirPassaro(Passaro passaro) {
        return "Passaro{" +
                "cod=" + passaro.getCod() +
                ", nome='" + passaro.getNome() + '\'' +
                ", dono=" + passaro.getDono().getNome() +
                ", corPenas='" + passaro.getCorPenas() + '\'' +
                '}';
    }
}
