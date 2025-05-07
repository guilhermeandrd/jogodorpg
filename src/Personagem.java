import java.util.ArrayList;

abstract class Personagem extends Ser{
    private ArrayList<Cards> cartas = new ArrayList<Cards>();

    Personagem(String nome, int forca, int qi, int constituicao, int nivel, Classe classe) {
        super(nome, forca, qi, constituicao, nivel, classe);
    }

    public boolean adicionarCard(Cards c){
        return cartas.add(c);
    }

    public void usarCard(Cards c, Criaturas criatura){
        if(c.acessoLiberado(this)){
            c.usoDaCard(criatura);
        }
    }

    @Override
    public String toString() {
        return "";
    }

}