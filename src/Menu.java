import java.util.Scanner;

public class Menu {
    String nom;
    Hiragana hira = new Hiragana();
    Katakana kata = new Katakana();

    Scanner scanner = new Scanner(System.in);
    public Menu(){
        System.out.println("Entrez votre pseudo : ");
        String nom = scanner.nextLine();
        this.nom=nom;
    }

    public String getNom() {
        return nom;
    }

    public void afficherEcran(){
        int choix;
        do{
            System.out.println("===JapL===");
            System.out.println("Bienvenue " + this.nom);
            System.out.println("1.Afficher les Hiragana");
            System.out.println("2.Afficher les Katakana");
            System.out.println("3.Teste Hiragana (QCM)");
            System.out.println("4.Teste Katakana (QCM)");
            System.out.println("5.Quitter");
            System.out.println("Choisissez une option:");
            choix = scanner.nextInt();
            scanner.nextLine();
            switch(choix){
                case 1 :
                    hira.affichHiragana();
                    break;
                case 2 :
                    kata.affichKatakana();
                    break;
                case 3 :
                    hira.selectHiragana();
                    break;
                case 4 :
                    kata.selectKatakana();
                    break;
                case 5 :
                    System.out.println("Au revoir!");
                    break;
                default :
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }while(choix!=5);
    }
}
