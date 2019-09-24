import java.util.Scanner;
class Member{
    String name;
    int age;
    double salary;
   
}
class MemberVariable {

    public static void main(String[] args){
        Member member =new Member();
        Scanner scanner = new Scanner(System.in);
        member.name = scanner.nextLine();
        member.age = scanner.nextInt();
        member.salary = scanner.nextDouble();
    }
}