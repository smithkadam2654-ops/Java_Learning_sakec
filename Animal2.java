interface Animal2 {
    void sound();
}

class Dog implements Animal2 {

    public void sound() {
        System.out.println("Dog Barks");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}