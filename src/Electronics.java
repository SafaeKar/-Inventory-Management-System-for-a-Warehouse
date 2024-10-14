// Classe dérivée: Electronics
class Electronics extends Product {
    // Attributs spécifiques aux produits électroniques
    private String brand;
    private int warranty; // Durée de la garantie en années

    // Constructeur pour initialiser les attributs
    public Electronics(String name, double price, int quantity, String brand, int warranty) {
        super(name, price, quantity); // Appel du constructeur de la classe parent
        this.brand = brand;
        this.warranty = warranty;
    }

    // Redéfinition de la méthode displayInfo() pour inclure des informations spécifiques
    @Override
    public void displayInfo() {
        super.displayInfo(); // Appel de la méthode displayInfo() de la classe Product
        System.out.println("Marque: " + brand);
        System.out.println("Garantie: " + warranty + " ans");
    }
}
