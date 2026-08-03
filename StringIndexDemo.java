class StringIndexDemo{
    public static void main(String[] args){
        String course = "Java";

        try{
            System.out.println(course.charAt(10));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Invalid string position.");
        }
    }
}