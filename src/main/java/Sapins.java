/**
 * Indiquer le ou les numeros de TP et d'exercice.
 *
 * @author (votre nom)
 */
public class Sapins {
    
    /**
     * Classe main - MAIN BRANCH
     */
    public static void main(String args[]) {
        afficherSapins(5);
    }

    /**
     * permet de retourner une chaîne de caractères avec nb caractères car identiques
     * @param nb  nombre de caractères de la chaîne
     * @param car caractère constituant la chaîne
     * @return la chaîne de caractères de nb caractères car
     */
    public static String genererStringLigne (int nb, char car){
        String ligne;

        ligne = "";
        for (int cpt=0; cpt<nb; cpt++) {
            ligne = ligne + car;
        }

        return ligne;
    }

     /**
     * permet de retourner une chaîne de caractères représentant le sapin plein demandé
     * @param h  hauteur du sapin
     * @return la chaîne de caractères sapin plein
     */
    public static String genererSapinPlein (int h){
        String sapin, espace;
        int nbEt;
        
        nbEt = 1;
        sapin = "";
        espace = "";
        
        for (int cpt=h; cpt>0; cpt--) {
            espace = genererStringLigne(cpt-1, ' ');
            sapin = sapin + espace + genererStringLigne(nbEt, '*') + "\n";
            nbEt = nbEt+2;
        }

        return sapin; // A modifier
    }
    
    /**
     * permet de retourner une chaîne de caractères représentant le sapin vide demandé
     * @param h  hauteur du sapin
     * @return la chaîne de caractères sapin vide
     */
    public static String genererSapinVide (int h){
        String sapin, espace;
        int nbEt;
        
        nbEt = 1;
        sapin = "";
        espace = "";
        
        for (int cpt=h; cpt>0; cpt--) {
            espace = genererStringLigne(cpt-1, ' ');
            if (cpt == h || cpt == 1) {
                sapin = sapin + espace + genererStringLigne(nbEt, '*') + "\n";
            } else {
                sapin = sapin + espace + "*" + genererStringLigne(nbEt-2, ' ') + "*" + "\n";
            }
            nbEt = nbEt+2;
        }

        return sapin;
    }
    
    /**
     * permet de retourner une chaîne de caractères représentant le sapin couché demandé
     * @param h  hauteur du sapin
     * @return la chaîne de caractères sapin couché
     */
    public static String genererSapinCouche (int h){
        String sapin;
        int nbEt;
        
        nbEt = 1;
        sapin = "";
        
        for (int cpt=h; cpt>0; cpt--) {
            sapin = sapin + genererStringLigne(nbEt, '*') + "\n";
            nbEt = nbEt+1;
        }
        nbEt = nbEt-2;
        for (int cpt=h; cpt>0; cpt--) {
            sapin = sapin + genererStringLigne(nbEt, '*') + "\n";
            nbEt = nbEt-1;
        }
        
        return sapin;
    }

    /**
     * Appel les fonctions de génération des sapins et les affichent
     * @param h : hauteur de chaque sapin
     */
    public static void afficherSapins(int h) {
        System.out.println(genererSapinPlein(h));
        System.out.println(genererSapinVide(h));
        System.out.println(genererSapinCouche(h));
    }
    
}