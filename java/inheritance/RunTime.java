package inheritance;

public class RunTime {

    public static void main(String[] args) {
        System.out.println("Grand parent class is Species..");
        Species s = new Species();
        s.features();
        s.statusOfLife();
        s.fly();

        System.out.println("Parent class is Human..");
        Human h = new Human();
        h.breath();
        h.eat();
        h.drink();
        h.speak();


        System.out.println("Child class is Female...");
        Female f = new Female();
        f.eat();
        f.breath();
        f.drink();
        f.speak();

        System.out.println("Child class is Male...");
        Male m = new Male();
        m.eat();
        m.breath();
        m.drink();
        m.speak();

        System.out.println("child class is children...");
        Children c = new Children();
        c.eat();
        c.breath();
        c.drink();
        c.speak();

    }
}
