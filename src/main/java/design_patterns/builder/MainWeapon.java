package design_patterns.builder;

public class MainWeapon {
    public static void main(String[] args) {
        Weapon.Builder builder = new Weapon.Builder(4);
        Weapon myWeapon = builder.withType("aa").build();

        //kitas variantas
        Weapon friendWeapon = new Weapon.Builder(5).withSize(4).withType("Machine Gun").build();
    }
}
