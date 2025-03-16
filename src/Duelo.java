public class Duelo {
    private Personagem personagem;
    private Criaturas criatura;

    public Duelo(Personagem personagem, Criaturas criatura) {
        this.personagem = personagem;
        this.criatura = criatura;
    }

    //escolha da ação

    public boolean serEstaVivo(Ser ser){
        return ser.getVida()>0;
    }


}
