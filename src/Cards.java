public class Cards {
    private String nome;
    private String acao;
    private int valor;
    private int requisito;
    private Classe classe;
    private Tipos tipo;

    public Cards(String nome, String acao, int valor, int requisito, Classe classe, Tipos tipo) {
        this.nome = nome;
        this.acao = acao;
        this.valor = valor;
        this.requisito = requisito;
        this.classe = classe;
    }

    public boolean acessoLiberado(Personagem p){
       return p.getClasse() == classe && p.atributoPrincipal() >= requisito;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public int getValor() {
        return valor;
    }

    public int getRequisito() {
        return requisito;
    }

    public void usoDaCard(Criaturas c){
        if(c.getDefesa()<getRequisito()){
            c.setVida(c.getVida()-(getValor()));
        }else{
            System.out.println("Uso da carta não foi realizado");
        }
    }

    @Override
    public String toString() {
        return nome + " " + acao + " " + valor + " " + requisito + " " + classe + " " + tipo;
    }

}
