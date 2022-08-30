public class Weapon {
    // Weapon Attributes 
    String name;
    int damage;
    float weight;
    String rarity;
    String description;

// Method
public void displayWeaponDescription() {
    System.out.println("Description: " + description);
}

public void showAllAttributes(){
    System.out.println("Name: " + name);
    System.out.println("Damage: " + damage);
    System.out.println("Weight: " + weight);
    System.out.println("Rarity: " + rarity);
    System.out.println("Description: " + description);
}
}
