class NullPointerDemo{
    public static void main(String[] args){
        String name = null;

        try{
            System.out.println(name.length());
        }catch(NullPointerException e){
            System.out.println("The string reference is null.");
        }
    }
}