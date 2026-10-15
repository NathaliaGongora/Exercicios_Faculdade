/*
Exercicio 1 — PlaylistCircular
Origem: Lista do professor
Implemente no unico arquivo SpotifyPlaylist.java as classes Musica, PlaylistCircular e SpotifyPlaylist dos slides. Cadastre as tres musicas do exemplo, imprima titulos e artistas, avance ate retornar ao inicio e volte da primeira para a ultima. Preserve encadeamento duplo e circular.
*/
class Musica {
    String titulo, artista;
    Musica proximo, anterior;
    Musica(String titulo, String artista) { this.titulo = titulo; this.artista = artista; }
}
class PlaylistCircular {
    Musica atual;
    int tamanho;
    public void adicionar(String titulo, String artista) {
        Musica nova = new Musica(titulo, artista);
        if (atual == null) { atual = nova; nova.proximo = nova; nova.anterior = nova; }
        else {
            Musica ultima = atual.anterior;
            ultima.proximo = nova; nova.anterior = ultima;
            nova.proximo = atual; atual.anterior = nova;
        }
        tamanho++;
    }
    public void remover() {
        if (atual == null) return;
        if (tamanho == 1) atual = null;
        else {
            atual.anterior.proximo = atual.proximo;
            atual.proximo.anterior = atual.anterior;
            atual = atual.proximo;
        }
        tamanho--;
    }
    public void proximaMusica() { if (atual != null) atual = atual.proximo; }
    public void musicaAnterior() { if (atual != null) atual = atual.anterior; }
    public void musicaTocando() {
        System.out.println(atual == null ? "Playlist vazia." : "Tocando: " + atual.titulo + " - " + atual.artista);
    }
    public void imprimirPlaylist() {
        if (atual == null) { System.out.println("Playlist vazia."); return; }
        Musica no = atual;
        do { System.out.println(no.titulo + " - " + no.artista); no = no.proximo; } while (no != atual);
    }
}
public class SpotifyPlaylist {
    public static void main(String[] args) {
        PlaylistCircular p = new PlaylistCircular();
        p.adicionar("Blinding Lights", "The Weeknd");
        p.adicionar("Levitating", "Dua Lipa");
        p.adicionar("Shape of You", "Ed Sheeran");
        p.imprimirPlaylist(); p.musicaTocando();
        for (int i = 0; i < 3; i++) { p.proximaMusica(); p.musicaTocando(); }
        p.musicaAnterior(); p.musicaTocando();
    }
}
