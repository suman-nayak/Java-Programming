public class Function {
    public static void main(String[] args) {
        greeting();
        greeting();
        Ptr();
        Ptr();
        Ptr1();
    }

    public static void greeting () {
        System.out.println("Good morning\nmethod colling cpmpeleted");
    }

    public static void Ptr(){
        System.out.println("*\n**\n***\n****\n*****\n");
        System.out.println("*****\n****\n***\n**\n*");
        System.out.println("     *\n    * *\n   * * *\n  * * * *\n * * * * *\n* * * * * *\n");
    }

    public static void Ptr1(){
        for(int i = 0; i <= 5; i++){
            for(int j = 0; j <= i; j++){
            System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
 