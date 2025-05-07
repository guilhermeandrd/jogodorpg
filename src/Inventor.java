public class Inventor extends Personagem{

    public Inventor(String nome, int forca, int qi, int constituicao, int nivel) {
        super(nome, forca, qi, constituicao, nivel, Classe.INVENTOR);
        setVida(12+constituicao);
        setMana(4*nivel);
    }


}
