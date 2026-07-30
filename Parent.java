class Parent{
    int x = 10;
    void display(){
        System.out.println(x);
    }
}
class Child extends Parent{
    public static void main(String[] args){
        Child obj = new Child();
        obj.display();
    }
}