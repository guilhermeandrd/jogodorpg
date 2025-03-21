import java.util.ArrayList;

class Personagem extends  Ser{
    private ArrayList<Cards> cartas = new ArrayList<Cards>();


    Personagem(String nome, double vida, int forca, int poder, int qi, Classe classe) {
        super(nome, vida, forca, poder, qi, classe);
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