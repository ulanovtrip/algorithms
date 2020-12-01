package tij4.chapter_15.exercise_2;

/* Create a holder class that holds three objects of the same type along
 * with the methods to store and fetch those objects and a constructor to
 * initialize all three.
 */

public class ContainerEx2_15<Animal> {
    private final Bat bat;
    private final Rat rat;
    private final Cat cat;

    ContainerEx2_15(Animal bat, Animal rat, Animal cat) {
        this.bat = (Bat) bat;
        this.rat = (Rat) rat;
        this.cat = (Cat) cat;
    }

    public Animal getAnimal(Animal animal) {
        if (animal instanceof Cat) {
            return (Animal) cat;
        } else if (animal instanceof Rat) {
            return (Animal) rat;
        } else {
            return (Animal) bat;
        }
    }


    public static void main(String[] args) {
        ContainerEx2_15 containerEx2_15 = new ContainerEx2_15(new Bat(), new Rat(), new Cat());
        System.out.println(containerEx2_15.getAnimal(new Cat()));
    }
}
