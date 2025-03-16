public abstract class Ser {
    private String nome;
    private double vida;
    private int forca;
    private int poder;
    private int qi;
    private Classe classe;

    public Ser(String nome, double vida, int forca, int poder, int qi, Classe classe) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.poder = poder;
        this.qi = qi;
        this.classe = classe;
    }

    //funcoes getters
    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }

    public int getForca() {
        return forca;
    }

    public int getPoder() {
        return poder;
    }

    public int getQi() {
        return qi;
    }

    public int getDefesa() {
        return forca * 2;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setVida(double vida){
        this.vida = vida;
    }

    public int atributoPrincipal(){
        if(classe == Classe.INVENTOR){
            return qi;
        }else if(classe == Classe.GUERREIRO){
            return forca;
        }else{
            return poder;
        }
    }


    @Override
    abstract public String toString();

}
