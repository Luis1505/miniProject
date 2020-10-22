  import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("What year is it");
    int currentYear = scan.nextInt();

    System.out.println("When is your birthyear");
    int birthYear = scan.nextInt();

    int myAge = (currentYear - birthYear);
   
    System.out.println("That means that you are " + myAge);

    if(myAge >= 16){
    System.out.println("You can drive legally now!");
    
    }else if(myAge >= 15){
    System.out.println("You can't drive!");
    }
  
  }
}