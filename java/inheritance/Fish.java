package inheritance;

public class Fish extends Species {
    @Override
    void fly() {
        System.out.println("It can swim...");
    }
    public void speak(){
        System.out.println("it cannot speak...");
    }
}
