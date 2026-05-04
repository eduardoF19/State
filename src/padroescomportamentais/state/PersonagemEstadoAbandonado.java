package padroescomportamentais.state;

public class PersonagemEstadoAbandonado implements PersonagemEstado {

    private static PersonagemEstadoAbandonado instance = new PersonagemEstadoAbandonado();

    public static PersonagemEstadoAbandonado getInstance() {
        return instance;
    }

    public boolean entrarJogo(Personagem p) { return false; }
    public boolean completarJogo(Personagem p) { return false; }
    public boolean pausar(Personagem p) { return false; }

    public boolean banir(Personagem p) {
        p.setEstado(PersonagemEstadoBanido.getInstance());
        return true;
    }

    public boolean abandonar(Personagem p) { return false; }
    public boolean trocarServidor(Personagem p) { return false; }
}