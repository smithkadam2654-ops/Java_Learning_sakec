class Class {
    void show(){
        System.out.println("Class A");
    }
}

class B extends Class {}

class C extends B {
    public static void main(String[] args){
        C obj = new C();
        obj.show();
    }
}