import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Cards Kohaku = new Cards("Garras do Kohaku", "Ragar o oponente", 5, 20, Classe.MAGO, Tipos.ATAQUE);
        Cards Espada = new Cards("Ataque com a espada", "Golpei o adversário", 4, 15, Classe.GUERREIRO, Tipos.ATAQUE);
        Cards Bomba = new Cards("OLHA A BOMBA", "joga uma bomba no adversário", 8, 10,Classe.INVENTOR, Tipos.ATAQUE );
        Cards CuraMagica = new Cards("Cura com a aura", "se cura com o seu poder magico", 8, 10, Classe.MAGO, Tipos.CURA);
        Cards CuraMudana = new Cards("Cura com itens mudanos", "Se cura como um médico", 5, 13,Classe.INVENTOR, Tipos.CURA);
        Cards CuraForcada = new Cards("Cura por pretigio fisico", "Você força o seu corpo a bombear mais sangue para as outras partes, acelerando o processo de cura", 5 , 15 , Classe.GUERREIRO, Tipos.CURA);

        //Personagem Thartra = new Personagem("Thartra", 20, 25, 10 , Classe.GUERREIRO, 1);
        Criaturas Zumbi = new Criaturas("Zumbi", 30, 10, 40, 9, Classe.MAGO );

        /*while(Thartra.getVida()>0||Zumbi.getVida()>0){
            Thartra.usarCard(Espada, Zumbi);
            Zumbi.atacar(Thartra);
        }*/

        if(Zumbi.getVida()>0){
            System.out.println("Zumbi venceu!");
        }else{
            System.out.println("Thartra venceu!");
        }

        Guerreiro Thartra = new Guerreiro("Guerreiro", 30, 10, 40, 9);

        System.out.println(Thartra.getVida());
    }



}