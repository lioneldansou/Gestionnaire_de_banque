public class Main {
    public static void main(String[] args) {

        // Création des 3 comptes enfants
        Compte_courant courant = new Compte_courant();
        Compte_Epargne epargne = new Compte_Epargne();
        Certificat_depot cod = new Certificat_depot();

        // Compte courant - définition et lecture des attributs hérités
        courant.compte = "CC-001";
        courant.solde = 5000.0;
        courant.limit = 1000.0;
        System.out.println("=== Compte Courant ===");
        System.out.println("Numéro : " + courant.compte);
        System.out.println("Solde : " + courant.solde + " FCFA");
        System.out.println("Limite : " + courant.limit + " FCFA");

        // Compte épargne - définition et lecture des attributs hérités
        epargne.compte = "CE-001";
        epargne.solde = 15000.0;
        epargne.tauxInteret = 3.5;
        System.out.println("\n=== Compte Epargne ===");
        System.out.println("Numéro : " + epargne.compte);
        System.out.println("Solde : " + epargne.solde + " FCFA");
        System.out.println("Taux d'intérêt : " + epargne.tauxInteret + "%");

        // Certificat de dépôt - définition et lecture des attributs hérités
        cod.compte = "COD-001";
        cod.solde = 50000.0;
        cod.duree = 12;
        System.out.println("\n=== Certificat de Dépôt ===");
        System.out.println("Numéro : " + cod.compte);
        System.out.println("Solde : " + cod.solde + " FCFA");
        System.out.println("Durée : " + cod.duree + " mois");
    }
}