public class LandAnimal extends Animal {
    
    @Override
    String move() {
        return "Swings on tree";
    }

    public static void main(String[] args) {
        LandAnimal lion = new LandAnimal();
        LandAnimal monkey =new LandAnimal();
        lion.name = "King";
        monkey.name = "Eater";

        System.out.println(lion.name);
        System.out.println(monkey.name);

    }
    
}
