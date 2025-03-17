
public class Criaturas extends Ser{

    public Criaturas(String nome, double vida, int forca, int poder, int qi, Classe classe) {
        super(nome, vida, forca, poder, qi, classe );
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

    //vai depender do tipo mas vamos deixar como sendo poder por enquanto
    public double getAtaque(){
        double ataque;

        switch (getClasse()){
            case MAGO -> ataque = getPoder() * 1.5;
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
