import java.util.Scanner;

public class Main {

  static void intro(){
    String name = "";
    int age = 0;

    while(name != "Patrick" && age != 26){
      Scanner in_name = new Scanner(System.in);
      System.out.println("Please input your name");
      name = in_name.nextLine();

      Scanner in_age = new Scanner(System.in);
      System.out.println("Enter your age");
      age = in_age.nextInt();

      //Scanner.close();
    
      if(name.equals("Patrick") && age == 26){
        System.out.format("Welcome %s, you are %d, which means you are of legal age to play this adventure\n", name, age);
      }else{
        System.out.println("Please enter the name of the person who owns this laptop and his age");   
      }    
    }
  }

  static void arrays(){
    intro();
    System.out.println("Choose your class \n");
    String[] class_choices = {"a) warrior", "b) archer", "c) mage", "d) priest"};
    for(int c = 0; c < class_choices.length; c ++){
      System.out.println(class_choices[c]);
    }
  }

  static void choice(){
    if(arrays().)
  }
   
  public static void main(String[] args){
    choice();
  }

}