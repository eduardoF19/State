package padroescomportamentais.state;

public interface PersonagemEstado {

    boolean entrarJogo(Personagem p);
    boolean completarJogo(Personagem p);
    boolean pausar(Personagem p);
    boolean banir(Personagem p);
    boolean abandonar(Personagem p);
    boolean trocarServidor(Personagem p);
}