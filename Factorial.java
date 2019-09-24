class Factorial{
    public static void main(String[] args) {
        long fact  = 1;
        int i = 1;
        while(true){
            if( i>12 || fact > Integer.MAX_VALUE){
                System.out.println("The factorial of " + i + " is out of range");
                break;
            }
            System.out.println("The factorial of " + i + " is " + fact);
            i++;
            fact *= i;
        }
        longFactorial();
    }
    public static void longFactorial(){
        long fact  = 1;
        int i = 1;
        while(true){
            if( i>20 || fact > Long.MAX_VALUE){
                System.out.println("The factorial of " + i + " is out of range");
                break;
            }
            System.out.println("The factorial of " + i + " is " + fact);
            i++;
            fact *= i;
        }
    }
}
