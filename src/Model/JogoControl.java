
package Model;

import java.util.ArrayList;
import java.util.List;

public class JogoControl {
    
    private String nomeDoJogo;
    private List<Carta> cartas = new ArrayList<>();
    private List<Jogador> jogadores = new ArrayList<>();

    public String getNomeDoJogo() {
        return nomeDoJogo;
    }

    public void setNomeDoJogo(String nomeDoJogo) {
        this.nomeDoJogo = nomeDoJogo;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
    
    
    
}
