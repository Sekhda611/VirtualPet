public class VirtualPet {
    private String name;
    private int age;
    private PetNeeds petNeeds;
    public VirtualPet(String name, int age){
        this.name = name;
        this.age = age;
        this.petNeeds = new PetNeeds();
    }
    private int getRandomNumber(int min, int max){
        int random = (int) (Math.random()*(max - min + 1) + min);
        return random;
    }
    public void feed(){
        int decreaseAmount = getRandomNumber(10, 20);
        petNeeds.decreaseHunger(decreaseAmount);
    }
    public void thirst(){
        int decreaseAmount = getRandomNumber(10, 20);
        petNeeds.decreaseHunger(decreaseAmount);
    }
    public void play(){
        int increaseAmount = getRandomNumber(10,20);
        petNeeds.increaseHappiness(increaseAmount);
    }
    public boolean isSick(){
        return petNeeds.getHunger() >= 100 || petNeeds.getThirst()>= 100;
    }
    public boolean isSad(){
        return  petNeeds.getHappiness() >=100;
    }
    public void printStatus(){
        System.out.println(name + " - age: "+ age);
        System.out.println("Hunger: " + petNeeds.getHunger() + "/100");
        System.out.println("Thirst: " + petNeeds.getThirst() + "/100");
        System.out.println("Happiness: " + petNeeds.getHappiness() + "/100");
    }

}

