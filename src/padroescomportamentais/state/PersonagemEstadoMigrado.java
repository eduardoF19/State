package padroescomportamentais.state;

public class PersonagemEstadoMigrado implements PersonagemEstado {

    private static PersonagemEstadoMigrado instance = new PersonagemEstadoMigrado();

    public static PersonagemEstadoMigrado getInstance() {
        return instance;
    }

    public boolean entrarJogo(Personagem p) { return false; }
    public boolean completarJogo(Personagem p) { return false; }
    public boolean pausar(Personagem p) { return false; }
    public boolean banir(Personagem p) { return false; }
    public boolean abandonar(Personagem p) { return false; }
    public boolean trocarServidor(Personagem p) { return false; }
}