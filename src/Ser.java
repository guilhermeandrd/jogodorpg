public abstract class Ser {
    private String nome;
    private int vida;
    private int forca;
    private int poder;
    private int qi;
    private int nivel;
    private int constituicao;
    private int mana;

    public Ser(String nome, int forca, int qi,int constituicao, int nivel) {
        this.nome = nome;
        this.forca = forca;
        this.qi = qi;
        this.constituicao = constituicao;
        this.nivel = nivel;
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

    public int getConstituicao() {
        return constituicao;
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
