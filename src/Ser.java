public abstract class Ser {
    private String nome;
    private int vida;
    private int forca;
    private int poder;
    private int qi;
    private Classe classe;
    private int nivel;
    private int constituicao;
    private int mana;

    public Ser(String nome, int forca, int qi,int constituicao, int nivel,  Classe classe) {
        this.nome = nome;
        this.forca = forca;
        this.qi = qi;
        this.constituicao = constituicao;
        this.nivel = nivel;
        this.classe = classe;
    }

    //funcoes getters
    public String getNome() {
        return nome;
    }

    public int getVida() {
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
        return forca;
    }

    public Classe getClasse() {
        return classe;
    }

    public int getConstituicao() {
        return constituicao;
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

    public void setVida(int vida){
        this.vida = vida;
    };

    public void setMana(int mana){
        this.mana = poder;
    }

}
