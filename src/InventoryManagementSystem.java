// Classe principale pour tester le système de gestion d'inventaire
public class InventoryManagementSystem {
    public static void main(String[] args) {
        // Appel de la méthode statique pour afficher un message de bienvenue
        Product.welcomeMessage();

        // Création d'un produit électronique
        Electronics laptop = new Electronics("Ordinateur portable", 1500.0, 10, "HP", 2);
        // Création d'un produit alimentaire
        Food apple = new Food("Pomme", 0.5, 100, "2024-12-01");

        // Affichage des informations des produits
        System.out.println("\n--- Informations sur l'ordinateur portable ---");
        laptop.displayInfo();

        System.out.println("\n--- Informations sur la pomme ---");
        apple.displayInfo();

        // Mise à jour des quantités
        laptop.updateQuantity(15); // Mise à jour avec une nouvelle quantité
        apple.updateQuantity(50, true); // Ajout de 50 à la quantité existante

        // Affichage des informations après la mise à jour des quantités
        System.out.println("\n--- Informations après mise à jour des quantités ---");
        System.out.println("\n--- Ordinateur portable ---");
        laptop.displayInfo();

        System.out.println("\n--- Pomme ---");
        apple.displayInfo();
    }
}
