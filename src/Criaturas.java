public class Criaturas extends Ser{

    public Criaturas(String nome, int forca, int qi, int constituicao, int nivel, Classe classe) {
        super(nome, forca, qi, constituicao, nivel, classe);
    }

    public boolean atacar(Personagem p){
        if(p.getDefesa()<getAtaque()){
            p.setVida(p.getVida()-getAtaque());
            return true;
        }else{
            System.out.println("Erro ao atacar");
        }

        return false;
    }

    public int getAtaque(){
        int ataque;

        switch (getClasse()){
            case MAGO -> ataque = getPoder();
            case INVENTOR -> ataque = getQi() * 2;
            case GUERREIRO -> ataque = getForca() * 2;
            default -> ataque = 2;
        }

        return ataque;
    }

    @Override
    public String toString() {
        return "";
    }


}
