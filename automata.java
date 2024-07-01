import javax.swing.JOptionPane;

public class Exo2 {
    public static int M[][]= {
                { 1,-1,-1,-1,-1},
                { 2, 1, 1, 1, 1},
                {-1,-1,-1,-1,-1}
                };

    final int ETAT_FINAL=2;
    public static int colonne(char myChar) {
        if (myChar=='"') {
            return 0;
        }
        if (('a'<=myChar && myChar<='z') || ('A'<=myChar && myChar<='Z') ){
            return 1;
        }
        else 
        if ('0'<=myChar && myChar<='9') {
            return 2;
        }
        else 
        if (myChar=='_'){
            return 3;
        }
        else return 4;
        
    }
    public static void main(String[] args) {
        int EC=0;
        int i=0;

        String maChaine=JOptionPane.showInputDialog("Entrez une chaine de caractère");

        int longueur = maChaine.length();

        while (i<longueur && EC!=-1) {
            EC = M[EC][colonne(maChaine.charAt(i))];
            i++;
        }
        System.out.print("longueur : "+longueur+"\ni : "+i);
        if (i<=10 && EC==2) {
            System.out.print("\nChaine acceptée");
        }
        else {
            System.out.print("\nChaine refusée");
        }

    }
}
