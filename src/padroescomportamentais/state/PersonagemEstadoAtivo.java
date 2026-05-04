package padroescomportamentais.state;

public class PersonagemEstadoAtivo implements PersonagemEstado {

    private static PersonagemEstadoAtivo instance = new PersonagemEstadoAtivo();

    public static PersonagemEstadoAtivo getInstance() {
        return instance;
    }

    public boolean entrarJogo(Personagem p) { return false; }

    public boolean completarJogo(Personagem p) {
        p.setEstado(PersonagemEstadoFinalizado.getInstance());
        return true;
    }

    public boolean pausar(Personagem p) {
        p.setEstado(PersonagemEstadoPausado.getInstance());
        return true;
    }

    public boolean banir(Personagem p) {
        p.setEstado(PersonagemEstadoBanido.getInstance());
        return true;
    }

    public boolean abandonar(Personagem p) {
        p.setEstado(PersonagemEstadoAbandonado.getInstance());
        return true;
    }

    public boolean trocarServidor(Personagem p) {
        p.setEstado(PersonagemEstadoMigrado.getInstance());
        return true;
    }
}