import java.util.Scanner;

class EvenNumTest{
    public static void main(String[] args){
        boolean isEven = isEven();
        System.out.println(isEven);
    }
    public static boolean isEven(){
        System.out.println("Enter a num to check if it is even");
        Scanner scanner = new Scanner(System.in);
        int numCheck = scanner.nextInt()
        if(numCheck%2==0)return true;
        return false;
    }
}