package padroescomportamentais.state;

public class PersonagemEstadoPausado implements PersonagemEstado {

    private static PersonagemEstadoPausado instance = new PersonagemEstadoPausado();

    public static PersonagemEstadoPausado getInstance() {
        return instance;
    }

    public boolean entrarJogo(Personagem p) {
        p.setEstado(PersonagemEstadoAtivo.getInstance());
        return true;
    }

    public boolean completarJogo(Personagem p) { return false; }
    public boolean pausar(Personagem p) { return false; }

    public boolean banir(Personagem p) {
        p.setEstado(PersonagemEstadoBanido.getInstance());
        return true;
    }

    public boolean abandonar(Personagem p) {
        p.setEstado(PersonagemEstadoAbandonado.getInstance());
        return true;
    }

    public boolean trocarServidor(Personagem p) { return false; }
}