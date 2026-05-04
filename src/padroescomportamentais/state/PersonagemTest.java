package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonagemTest {

    Personagem personagem;

    @BeforeEach
    public void setUp() {
        personagem = new Personagem();
    }

    // Personagem Ativo

    @Test
    public void naoDeveEntrarJogoPersonagemAtivo() {
        personagem.setEstado(PersonagemEstadoAtivo.getInstance());
        assertFalse(personagem.entrarJogo());
    }

    @Test
    public void deveCompletarJogoPersonagemAtivo() {
        personagem.setEstado(PersonagemEstadoAtivo.getInstance());
        assertTrue(personagem.completarJogo());
        assertEquals(PersonagemEstadoFinalizado.getInstance(), personagem.getEstado());
    }

    @Test
    public void devePausarPersonagemAtivo() {
        personagem.setEstado(PersonagemEstadoAtivo.getInstance());
        assertTrue(personagem.pausar());
        assertEquals(PersonagemEstadoPausado.getInstance(), personagem.getEstado());
    }

    @Test
    public void deveBanirPersonagemAtivo() {
        personagem.setEstado(PersonagemEstadoAtivo.getInstance());
        assertTrue(personagem.banir());
        assertEquals(PersonagemEstadoBanido.getInstance(), personagem.getEstado());
    }

    @Test
    public void deveAbandonarPersonagemAtivo() {
        personagem.setEstado(PersonagemEstadoAtivo.getInstance());
        assertTrue(personagem.abandonar());
        assertEquals(PersonagemEstadoAbandonado.getInstance(), personagem.getEstado());
    }

    @Test
    public void deveTrocarServidorPersonagemAtivo() {
        personagem.setEstado(PersonagemEstadoAtivo.getInstance());
        assertTrue(personagem.trocarServidor());
        assertEquals(PersonagemEstadoMigrado.getInstance(), personagem.getEstado());
    }

    // Personagem Pausado

    @Test
    public void deveEntrarJogoPersonagemPausado() {
        personagem.setEstado(PersonagemEstadoPausado.getInstance());
        assertTrue(personagem.entrarJogo());
        assertEquals(PersonagemEstadoAtivo.getInstance(), personagem.getEstado());
    }

    @Test
    public void naoDeveCompletarJogoPersonagemPausado() {
        personagem.setEstado(PersonagemEstadoPausado.getInstance());
        assertFalse(personagem.completarJogo());
    }

    @Test
    public void naoDevePausarPersonagemPausado() {
        personagem.setEstado(PersonagemEstadoPausado.getInstance());
        assertFalse(personagem.pausar());
    }

    @Test
    public void deveBanirPersonagemPausado() {
        personagem.setEstado(PersonagemEstadoPausado.getInstance());
        assertTrue(personagem.banir());
        assertEquals(PersonagemEstadoBanido.getInstance(), personagem.getEstado());
    }

    @Test
    public void deveAbandonarPersonagemPausado() {
        personagem.setEstado(PersonagemEstadoPausado.getInstance());
        assertTrue(personagem.abandonar());
        assertEquals(PersonagemEstadoAbandonado.getInstance(), personagem.getEstado());
    }

    @Test
    public void naoDeveTrocarServidorPersonagemPausado() {
        personagem.setEstado(PersonagemEstadoPausado.getInstance());
        assertFalse(personagem.trocarServidor());
    }

    // Personagem Finalizado

    @Test
    public void naoDeveEntrarJogoPersonagemFinalizado() {
        personagem.setEstado(PersonagemEstadoFinalizado.getInstance());
        assertFalse(personagem.entrarJogo());
    }

    @Test
    public void naoDeveCompletarJogoPersonagemFinalizado() {
        personagem.setEstado(PersonagemEstadoFinalizado.getInstance());
        assertFalse(personagem.completarJogo());
    }

    @Test
    public void naoDevePausarPersonagemFinalizado() {
        personagem.setEstado(PersonagemEstadoFinalizado.getInstance());
        assertFalse(personagem.pausar());
    }

    @Test
    public void naoDeveBanirPersonagemFinalizado() {
        personagem.setEstado(PersonagemEstadoFinalizado.getInstance());
        assertFalse(personagem.banir());
    }

    @Test
    public void naoDeveAbandonarPersonagemFinalizado() {
        personagem.setEstado(PersonagemEstadoFinalizado.getInstance());
        assertFalse(personagem.abandonar());
    }

    @Test
    public void naoDeveTrocarServidorPersonagemFinalizado() {
        personagem.setEstado(PersonagemEstadoFinalizado.getInstance());
        assertFalse(personagem.trocarServidor());
    }

    // Personagem Banido

    @Test
    public void naoDeveEntrarJogoPersonagemBanido() {
        personagem.setEstado(PersonagemEstadoBanido.getInstance());
        assertFalse(personagem.entrarJogo());
    }

    @Test
    public void naoDeveCompletarJogoPersonagemBanido() {
        personagem.setEstado(PersonagemEstadoBanido.getInstance());
        assertFalse(personagem.completarJogo());
    }

    @Test
    public void naoDevePausarPersonagemBanido() {
        personagem.setEstado(PersonagemEstadoBanido.getInstance());
        assertFalse(personagem.pausar());
    }

    @Test
    public void naoDeveBanirPersonagemBanido() {
        personagem.setEstado(PersonagemEstadoBanido.getInstance());
        assertFalse(personagem.banir());
    }

    @Test
    public void naoDeveAbandonarPersonagemBanido() {
        personagem.setEstado(PersonagemEstadoBanido.getInstance());
        assertFalse(personagem.abandonar());
    }

    @Test
    public void naoDeveTrocarServidorPersonagemBanido() {
        personagem.setEstado(PersonagemEstadoBanido.getInstance());
        assertFalse(personagem.trocarServidor());
    }

    // Personagem Abandonado

    @Test
    public void naoDeveEntrarJogoPersonagemAbandonado() {
        personagem.setEstado(PersonagemEstadoAbandonado.getInstance());
        assertFalse(personagem.entrarJogo());
    }

    @Test
    public void naoDeveCompletarJogoPersonagemAbandonado() {
        personagem.setEstado(PersonagemEstadoAbandonado.getInstance());
        assertFalse(personagem.completarJogo());
    }

    @Test
    public void naoDevePausarPersonagemAbandonado() {
        personagem.setEstado(PersonagemEstadoAbandonado.getInstance());
        assertFalse(personagem.pausar());
    }

    @Test
    public void deveBanirPersonagemAbandonado() {
        personagem.setEstado(PersonagemEstadoAbandonado.getInstance());
        assertTrue(personagem.banir());
        assertEquals(PersonagemEstadoBanido.getInstance(), personagem.getEstado());
    }

    @Test
    public void naoDeveAbandonarPersonagemAbandonado() {
        personagem.setEstado(PersonagemEstadoAbandonado.getInstance());
        assertFalse(personagem.abandonar());
    }

    @Test
    public void naoDeveTrocarServidorPersonagemAbandonado() {
        personagem.setEstado(PersonagemEstadoAbandonado.getInstance());
        assertFalse(personagem.trocarServidor());
    }

    // Personagem Migrado

    @Test
    public void naoDeveEntrarJogoPersonagemMigrado() {
        personagem.setEstado(PersonagemEstadoMigrado.getInstance());
        assertFalse(personagem.entrarJogo());
    }

    @Test
    public void naoDeveCompletarJogoPersonagemMigrado() {
        personagem.setEstado(PersonagemEstadoMigrado.getInstance());
        assertFalse(personagem.completarJogo());
    }

    @Test
    public void naoDevePausarPersonagemMigrado() {
        personagem.setEstado(PersonagemEstadoMigrado.getInstance());
        assertFalse(personagem.pausar());
    }

    @Test
    public void naoDeveBanirPersonagemMigrado() {
        personagem.setEstado(PersonagemEstadoMigrado.getInstance());
        assertFalse(personagem.banir());
    }

    @Test
    public void naoDeveAbandonarPersonagemMigrado() {
        personagem.setEstado(PersonagemEstadoMigrado.getInstance());
        assertFalse(personagem.abandonar());
    }

    @Test
    public void naoDeveTrocarServidorPersonagemMigrado() {
        personagem.setEstado(PersonagemEstadoMigrado.getInstance());
        assertFalse(personagem.trocarServidor());
    }
}