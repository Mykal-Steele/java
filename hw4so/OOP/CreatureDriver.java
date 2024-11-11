package OOP;
import java.util.Scanner;
public class CreatureDriver {
    public static void main(String[] args) {
         // Creating Dragon objects
        Scanner sc = new Scanner(System.in);
        
        // Get input for Dragon
        String dragonName = sc.next();
        int dragonAge = sc.nextInt();
        int dragonWing = sc.nextInt();
        int dragonPower = sc.nextInt();
        Dragon dragon1 = new Dragon(dragonName, dragonAge, dragonWing, dragonPower);
        
        // Get input for Phoenix
        String phoenixName = sc.next();
        int phoenixAge = sc.nextInt();
        int phoenixPower = sc.nextInt();
        Phoenix phoenix1 = new Phoenix(phoenixName, phoenixAge, phoenixPower);
        
        // Get input for Unicorn
        String unicornName = sc.next();
        int unicornAge = sc.nextInt();
        int unicornHorn = sc.nextInt();
        int unicornPower = sc.nextInt();
        Unicorn unicorn1 = new Unicorn(unicornName, unicornAge, unicornHorn, unicornPower);

        // Displaying each creature's details
        dragon1.displayDetails();
        phoenix1.displayDetails();
        unicorn1.displayDetails();

        // Calculating and displaying the total power of all creatures
        int totalPower = dragon1.calculatePower() + phoenix1.calculatePower() + unicorn1.calculatePower();
        System.out.println("Total Power of the Zoo: " + totalPower);
    }
}

class Creature {
    private String name;
    private int age;

    public Creature(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int calculatePower() {
        return 0; 
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Power: " + calculatePower());
    }
}

class Dragon extends Creature {
    private int numberOfWings;
    private int flameIntensity;

    public Dragon(String name, int age, int numberOfWings, int flameIntensity) {
        super(name, age);
        this.numberOfWings = numberOfWings;
        this.flameIntensity = flameIntensity;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }

    public int getFlameIntensity() {
        return flameIntensity;
    }

    public void setFlameIntensity(int flameIntensity) {
        this.flameIntensity = flameIntensity;
    }

    @Override
    public int calculatePower() {
        return numberOfWings * flameIntensity;
    }
}

class Phoenix extends Creature {
    private int rebirthCount;

    public Phoenix(String name, int age, int rebirthCount) {
        super(name, age);
        this.rebirthCount = rebirthCount;
    }

    public int getRebirthCount() {
        return rebirthCount;
    }

    public void setRebirthCount(int rebirthCount) {
        this.rebirthCount = rebirthCount;
    }

    @Override
    public int calculatePower() {
        return rebirthCount * 100;
    }
}

class Unicorn extends Creature {
    private int hornLength;
    private int healingPower;

    public Unicorn(String name, int age, int hornLength, int healingPower) {
        super(name, age);
        this.hornLength = hornLength;
        this.healingPower = healingPower;
    }

    public int getHornLength() {
        return hornLength;
    }

    public void setHornLength(int hornLength) {
        this.hornLength = hornLength;
    }

    public int getHealingPower() {
        return healingPower;
    }

    public void setHealingPower(int healingPower) {
        this.healingPower = healingPower;
    }

    @Override
    public int calculatePower() {
        return hornLength * healingPower;
    }
}
