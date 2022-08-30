public class App {
  public static void main(String[] args) {

      // Character Class
      Character knight = new Character();

      knight.strength = 10;
      knight.agility = 5;
      knight.intelligence = 0;
      knight.name = "Chen";
      knight.sayMyName();

      Character mage = new Character();

      mage.strength = 0;
      mage.agility = 5;
      mage.intelligence = 10;
      mage.name = "Akasha";
      mage.sayMyName();

      Character thief = new Character();

      thief.strength = 5;
      thief.agility = 10;
      thief.intelligence = 0;
      thief.name = "Gondar";
      thief.sayMyName();

      // Enemy Class
      Enemy boss = new Enemy();

      boss.damage = 50;
      boss.health = 500;
      boss.armor = 100;
      boss.hasMagicImmunity = true;
      boss.name = "Roshan";
      boss.enemyDialogue();

      Enemy skeleton = new Enemy();

      skeleton.damage = 5;
      skeleton.health = 10;
      skeleton.armor = 5;
      skeleton.hasMagicImmunity = false;
      skeleton.name = "Common Skeleton Warrior";
      skeleton.enemyDialogue();

      Enemy dragon = new Enemy();

      dragon.damage = 40;
      dragon.health = 400;
      dragon.armor = 75;
      dragon.hasMagicImmunity = false;
      dragon.name = "Ancient Wyvern";
      dragon.enemyDialogue();

      //Weapon Class
      Weapon Rifle = new Weapon();

      Rifle.name = "Sniper Rifle";
      Rifle.damage = 357;
      Rifle.weight = 5.0f;
      Rifle.rarity = "Legendary";
      Rifle.description = "Sniper rifle owned by Rainier!";

      Rifle.displayWeaponDescription();
      Rifle.showAllAttributes();

     // Gear Class
      Gear Helm = new Gear();

      Helm.name = "Charles' Helm";
      Helm.damage = 99;
      Helm.weight = 13;
      Helm.rarity = "Epic";
      Helm.description = "An epic helm owned by Charles";

      Helm.displayGearDescription();
      Helm.showAllAttributes();

      Gear Vest = new Gear();

      Vest.name = "Athena's Vest"; 
      Vest.damage = 199;
      Vest.weight = 88;
      Vest.rarity = "Elite";
      Vest.description = "An elite vest owned by Athena";

      Vest.displayGearDescription();
      Vest.showAllAttributes();
  }
}
