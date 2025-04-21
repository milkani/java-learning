package lv.acodemy;

public class Playground {
    public static void main(String[] args) {

        Dog rex = new Dog();
        // netu imeni = null
        // netu age = 0
        // breedName = unknown breed

        // Encapsulation
        // name = "Rex"
        rex.setName("Rex");
        // age = 1
        rex.setAge(1);

        rex.bark();
        rex.feed();

        System.out.println(rex.getName());
        System.out.println(rex.getAge());
        System.out.println(rex.getBreedName());


        Dog barsik = new Dog("Alabai");
        // name = null
        // age = 0
        // breedName = Alabai

        barsik.setName("Barsik");
        barsik.setAge(1);

        System.out.println(barsik.getName());
        System.out.println(barsik.getAge());

        // ?? Print breed name through method;
        System.out.println(barsik.getBreedName());

        // All argument constructor
        Dog myPjos = new Dog("Psina", 1, "Corgi");
        System.out.println(myPjos);

        Car bemewe = new Car("M340");
        System.out.println(bemewe);
        bemewe.drive();
        System.out.println(bemewe);
        bemewe.drive();
        bemewe.drive();
        bemewe.drive();
        bemewe.drive();
        bemewe.drive();
        System.out.println(bemewe);
        bemewe.refuel();
        System.out.println(bemewe);
        bemewe.service();


    }
}
