public class Mago extends Personagem{

    public Mago(String nome, int forca, int qi, int constituicao, int nivel) {
        super(nome,  forca, qi, constituicao, nivel, Classe.MAGO);
        setVida(constituicao+8);
        setMana(6*nivel);
    }


}
