package padroescomportamentais.state;

public class PersonagemEstadoFinalizado implements PersonagemEstado {

    private static PersonagemEstadoFinalizado instance = new PersonagemEstadoFinalizado();

    public static PersonagemEstadoFinalizado getInstance() {
        return instance;
    }

    public boolean entrarJogo(Personagem p) { return false; }
    public boolean completarJogo(Personagem p) { return false; }
    public boolean pausar(Personagem p) { return false; }
    public boolean banir(Personagem p) { return false; }
    public boolean abandonar(Personagem p) { return false; }
    public boolean trocarServidor(Personagem p) { return false; }
}
