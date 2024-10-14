// Classe dérivée: Food
class Food extends Product {
    // Attribut spécifique aux produits alimentaires
    private String expirationDate;

    // Constructeur pour initialiser les attributs
    public Food(String name, double price, int quantity, String expirationDate) {
        super(name, price, quantity); // Appel du constructeur de la classe parent
        this.expirationDate = expirationDate;
    }

    // Redéfinition de la méthode displayInfo() pour inclure la date d'expiration
    @Override
    public void displayInfo() {
        super.displayInfo(); // Appel de la méthode displayInfo() de la classe Product
        System.out.println("Date d'expiration: " + expirationDate);
    }
}
