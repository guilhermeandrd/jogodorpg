public class Criaturas extends Ser{

    public Criaturas(String nome, int forca, int qi, int constituicao, int nivel) {
        super(nome, forca, qi, constituicao, nivel);
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


        return ataque;
    }

    @Override
    public String toString() {
        return "";
    }


}
