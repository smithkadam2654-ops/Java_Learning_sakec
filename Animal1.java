class Animal1{
    void sound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal1{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
    public static void main(String[] args){
        Dog d = new Dog();
        d.sound();
    }
}