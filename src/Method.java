public class Method {

    public static void main(String[] args) {
        myMethod("Hong");
        System.out.println(myNumber(10,20));
    }

    // Method with parameter
    public static void myMethod(String name){
         System.out.println("Name: " + name);
    }

    // Method with return
    public static int myNumber(int a, int b){
        return  a + b;
    }

}
