public class AquaticAnimal extends Animal {
    @Override
    String move() {
        return " swims inside water";
    }
    public static void main(String[] args) {
        AquaticAnimal Octopus = new AquaticAnimal();
        AquaticAnimal Sea_horse = new AquaticAnimal();
        Octopus.name = "Octopus";
        Sea_horse.name = "Sea horse";
        System.out.println(Octopus.name + Octopus.move());
        System.out.println(Sea_horse.name + Sea_horse.move());

    }
}