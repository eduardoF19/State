package padroescomportamentais.state;

public class Personagem {

    private PersonagemEstado estado;

    public Personagem() {
        this.estado = PersonagemEstadoAtivo.getInstance();
    }

    public void setEstado(PersonagemEstado estado) {
        this.estado = estado;
    }

    public PersonagemEstado getEstado() {
        return estado;
    }

    public boolean entrarJogo() { return estado.entrarJogo(this); }
    public boolean completarJogo() { return estado.completarJogo(this); }
    public boolean pausar() { return estado.pausar(this); }
    public boolean banir() { return estado.banir(this); }
    public boolean abandonar() { return estado.abandonar(this); }
    public boolean trocarServidor() { return estado.trocarServidor(this); }
}