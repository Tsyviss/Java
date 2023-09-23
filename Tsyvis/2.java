import java.util.Scanner;

public class Main{
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String Name = input.nextLine();
        if (Name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
    
    
}
