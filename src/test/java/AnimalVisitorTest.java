import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalVisitorTest {

    Cliente dono;
    AnimalVisitor visitor;

    @BeforeEach
    void setUp() {
        dono = new Cliente("Joao");
        visitor = new AnimalVisitor();
    }

    @Test
    void deveExibirCao() {
        Cliente dono = new Cliente("Joao");
        Cao cao = new Cao(1, "Billy", dono);

        assertEquals("Cao{cod=1, nome='Billy', dono=Joao}", visitor.exibir(cao));
    }

    @Test
    void deveExibirCavalo() {
        Cavalo cavalo = new Cavalo(1, "Atlas", dono, "Ringo", "Dama");

        assertEquals("Cavalo{cod=1, nome='Atlas', dono=Joao, nomePai='Ringo', nomeMae='Dama'}", visitor.exibir(cavalo));
    }

    @Test
    void deveExibirPassaro() {
        Passaro passaro = new Passaro(1, "Bicudo", dono, "Azul");

        assertEquals("Passaro{cod=1, nome='Bicudo', dono=Joao, corPenas='Azul'}", visitor.exibir(passaro));
    }


}