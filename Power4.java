import java.util.Scanner;

class Power4{
    public static void main(String[] args){
        Power4 power4 = new Power4();
        boolean four = power4.PowerOfFour();
        System.out.println(four);
    }
    public boolean PowerOfFour(){
        Scanner scanner = new Scanner(System.in);
        int checkNum = scanner.nextInt();
        while(checkNum>3){
            if(checkNum%4!=0)return false;
            checkNum/=4;
        }
        if(checkNum==1)return true;
        return false;
    }
}