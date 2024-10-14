// Base Class: Product
public class Product {
    // Attributs de base
    protected String name;
    protected double price;
    protected int quantity;

    // Constructeur pour initialiser les attributs
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Méthode pour afficher les informations du produit
    public void displayInfo() {
        System.out.println("Nom du produit: " + name);
        System.out.println("Prix: " + price + " €");
        System.out.println("Quantité: " + quantity);
    }

    // Méthode pour mettre à jour la quantité
    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    // Méthode surchargée pour ajouter une quantité au stock existant
    public void updateQuantity(int addedQuantity, boolean addToExisting) {
        if (addToExisting) {
            this.quantity += addedQuantity;
        } else {
            this.updateQuantity(addedQuantity);
        }
    }

    // Méthode pour obtenir le prix du produit
    public double getPrice() {
        return this.price;
    }

    // Méthode statique pour afficher un message de bienvenue
    public static void welcomeMessage() {
        System.out.println("Bienvenue dans le système de gestion d'inventaire !");
    }
}
