public class Inheritance_I {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }

}

class Animal{
    void walk(){
        System.out.println("I am walking");
    }

    void sing(){
        System.out.println("I am singing");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }
}

