public class Guerreiro extends Personagem {

    public Guerreiro(String nome, int forca, int qi, int constituicao, int nivel) {
        super(nome, forca, qi, constituicao, nivel, Classe.GUERREIRO);
        setVida(constituicao+20);
        setMana(nivel*3);
    }


}
